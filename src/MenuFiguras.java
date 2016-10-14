import java.awt.*;
import java.util.Objects;
import java.util.Scanner;

public class MenuFiguras {
    //final FiguraJPanel lienzo = new FiguraJPanel();

    public MenuFiguras(){
        try {
            menu();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void menu() throws InterruptedException {
        String userChoice="";
        Scanner s = new Scanner(System.in);
        while(!Objects.equals(userChoice, "I")){
            printMenu();
            userChoice = s.next();
            if (Objects.equals(userChoice, "A")){
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            Texto frame = new Texto();
                            frame.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            } else
            if (Objects.equals(userChoice, "B")){

            } else
            if (Objects.equals(userChoice, "C")){

            } else
            if (Objects.equals(userChoice, "D")){

            } else
            if (Objects.equals(userChoice, "E")){

            } else
            if (Objects.equals(userChoice, "F")){

            } else
            if (Objects.equals(userChoice, "G")){

            } else
            if (Objects.equals(userChoice, "H")){

            } if (Objects.equals(userChoice, "I")){break;}
            Thread.sleep(8000);

        }
    }
    private void printMenu(){
        System.out.println("Que figura quieres dibujar? (escoge una letra)\n" +
                "\n" +
                "A. Texto\n" +
                "B. Punto\n" +
                "C. Linia\n" +
                "D. Circulo\n" +
                "E. Cuadrado\n" +
                "F. Rectangulo\n" +
                "G. Poligono\n" +
                "\n" +
                "H. Dibujar el historial de figuras\n" +
                "I. Salir");
    }
}
