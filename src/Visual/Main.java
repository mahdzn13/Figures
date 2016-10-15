package Visual;

import Figures.*;
import Figures.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    //Var accessible from the 2nd thread for the paintings.
    final FiguraJPanel lienzo = new FiguraJPanel(new Empty());

    //Constructor
    public Main() throws InterruptedException {
        //Var guithread with our "canvas".
        Runnable guiThread = (new Runnable() {
            public void run() {
                JFrame frame;

                //Create and set up the window.
                frame = new JFrame("FrameDemo");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setBounds(100, 100, 800, 600);
                frame.getContentPane().add(lienzo);

                //Display the window.
                frame.setVisible(true);
            }
        });

        //Exxecution of the thread.
        try {
            SwingUtilities.invokeAndWait(guiThread);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Call to the menu on the constructor...
        menu();


    }

    public static void main(String[] args) throws InterruptedException {
        //Inicialization of himself. (?)
        Main m = new Main();
    }

    private void menu() throws InterruptedException {
        //Choice vars
        String userChoice="";
        Scanner s = new Scanner(System.in);

        //Array figures
        ArrayList<Object> figures = new ArrayList<Object>();

        //Iteration while not I on userChoice.
        while(!Objects.equals(userChoice, "I")) {
            //Menu print
            printMenu();

            //User choice
            userChoice = s.next();

            //** option String in JFrame
            if (Objects.equals(userChoice, "A")) {
                //Special scanner for text sentence
                Scanner special = new Scanner(System.in).useDelimiter("\\n");
                //Data collect positions/size
                System.out.println("Que palabra desea?");
                String text = special.next();
                System.out.println("Coordenada x?");
                int x = s.nextInt();
                System.out.println("Coordenada y?");
                int y = s.nextInt();
                //Color choice
                Color color = ColorSelector.selectColor();

                //Add to history...
                Text txt = new Text(x,y,text, color);
                figures.add(txt);

                //Reset figure to new one with the parameters obtained, and repaint
                lienzo.setFigura(txt);
                lienzo.repaint();
            } //** option Dot in JFrame
            else if (Objects.equals(userChoice, "B")) {
                System.out.println("Coordenada x?");
                int x = s.nextInt();
                System.out.println("Coordenada y?");
                int y = s.nextInt();

                Color color = ColorSelector.selectColor();

                Punt punt = new Punt(x, y, color);
                figures.add(punt);

                lienzo.setFigura(punt);
                lienzo.repaint();
            } //** option Line in JFrame
            else if (Objects.equals(userChoice, "C")) {
                System.out.println("Coordenada x? (inicio linea)");
                int x = s.nextInt();
                System.out.println("Coordenada y? (inicio linea)");
                int y = s.nextInt();
                System.out.println("Coordenada x1? (fin linea)");
                int x1 = s.nextInt();
                System.out.println("Coordenada y1? (fin linea)");
                int y1 = s.nextInt();

                Color color = ColorSelector.selectColor();

                Linia linia = new Linia(x, y, x1, y1, color);
                figures.add(linia);

                lienzo.setFigura(linia);
                lienzo.repaint();
            } //** option "Circle" in JFrame
            else if (Objects.equals(userChoice, "D")) {
                System.out.println("Coordenada x? (punto inicial)");
                int x = s.nextInt();
                System.out.println("Coordenada y? (punto inicial)");
                int y = s.nextInt();
                System.out.println("Ancho del circulo?");
                int ample = s.nextInt();
                System.out.println("Altura del circulo?");
                int altura = s.nextInt();

                System.out.println("Desea con relleno de pocholate? (S=Si, si, si, Simba!)");
                String omple = s.next();

                Color color = ColorSelector.selectColor();

                Cercle cercle = new Cercle(x, y, ample, altura, color, omple);
                figures.add(cercle);

                lienzo.setFigura(cercle);
                lienzo.repaint();
            } //** option Square in JFrame
            else if (Objects.equals(userChoice, "E")) {
                System.out.println("Coordenada x? (punto inicial)");
                int x = s.nextInt();
                System.out.println("Coordenada y? (punto inicial)");
                int y = s.nextInt();
                System.out.println("Ancho del cuadrado?");
                int ample = s.nextInt();

                System.out.println("Desea con relleno de pocholate? (S=Si, si, si, Simba!)");
                String omple = s.next();

                Color color = ColorSelector.selectColor();

                Cuadrat cuadrat = new Cuadrat(x, y, ample, color, omple);
                figures.add(cuadrat);

                lienzo.setFigura(cuadrat);
                lienzo.repaint();
            } //** option Rectangle in JFrame
            else if (Objects.equals(userChoice, "F")) {
                System.out.println("Coordenada x? (punto inicial)");
                int x = s.nextInt();
                System.out.println("Coordenada y? (punto inicial)");
                int y = s.nextInt();
                System.out.println("Ancho del rectangulo?");
                int ample = s.nextInt();
                System.out.println("Altura del rectangulo?");
                int altura = s.nextInt();

                System.out.println("Desea con relleno de pocholate? (S=Si, si, si, Simba!)");
                String omple = s.next();

                Color color = ColorSelector.selectColor();

                Rectangle rect = new Rectangle(x, y, ample, altura, color, omple);
                figures.add(rect);

                lienzo.setFigura(rect);
                lienzo.repaint();
            } //** option Polygon in JFrame
            else if (Objects.equals(userChoice, "G")) {

                System.out.println("Nodos del poligono?");
                int nodes = s.nextInt();
                int[] x = new int[nodes];
                int[] y = new int[nodes];

                for (int i = 0; i < nodes; i++) {
                    System.out.println("Posicion de la ----->x"+i+"?");
                    x[i] = s.nextInt();
                    System.out.println("Posicion de la ----->y"+i+"?");
                    y[i] = s.nextInt();

                }

                System.out.println("Desea con relleno de pocholate? (S=Si, si, si, Simba!)");
                String omple = s.next();

                Color color = ColorSelector.selectColor();

                Poligon poly = new Poligon(x,y,nodes,color,omple);
                figures.add(poly);

                lienzo.setFigura(poly);
                lienzo.repaint();
            } //** option Draw all paints in JFrame
            else if (Objects.equals(userChoice, "H")) {
                for (int i = 0; i < figures.size(); i++) {
                    System.out.println("Pintando figura " + i);
                    lienzo.setFigura((Figura)figures.get(i));
                    lienzo.repaint();
                    System.out.println("Espere unos segundos...");
                    Thread.sleep(3000);
                }
            }
        }
    }
    //Menu visual for console
    private void printMenu(){
        System.out.println("Que figura quieres dibujar? (escoge una letra)\n" +
                "\n" +
                "A. Text\n" +
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
