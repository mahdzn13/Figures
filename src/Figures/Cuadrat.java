package Figures;

import java.awt.*;
import java.util.Objects;


public class Cuadrat extends FiguraGeometrica {
    int x,y,ancho;
    Color color;
    String omple;

    public Cuadrat(int x, int y, int ancho,Color color, String omple){
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.color = color;
        this.omple = omple;
    }

    @Override
    public void visualitzar(Graphics g) {
        g.setColor (color);
        if (Objects.equals(omple, "S")){
            g.fillRect(x,y,ancho,ancho);
        }
        g.drawRect(x,y,ancho,ancho);
    }
}
