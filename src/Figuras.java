import java.util.Objects;
import java.util.Scanner;

public class Figuras {
    public Figuras(){
        menu();
    }

    
    public void menu(){
        String userChoice="";
        Scanner s = new Scanner(System.in);
        while(!Objects.equals(userChoice, "I")){
            printMenu();
            userChoice = s.next();
            if (Objects.equals(userChoice, "A")){

            }
            if (Objects.equals(userChoice, "B")){

            }
            if (Objects.equals(userChoice, "C")){

            }
            if (Objects.equals(userChoice, "D")){

            }
            if (Objects.equals(userChoice, "E")){

            }
            if (Objects.equals(userChoice, "F")){

            }
            if (Objects.equals(userChoice, "G")){

            }
            if (Objects.equals(userChoice, "H")){

            }
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
