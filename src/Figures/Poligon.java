package Figures;

import java.awt.*;
import java.util.Objects;


public class Poligon extends FiguraGeometrica{
    int[] x,y;
    int nodes;
    String omple;
    Color color;
    public Poligon(int[] x,int[] y, int nodes, Color color, String omple){
        this.x = x;
        this.y = y;
        this.nodes = nodes;
        this.color = color;
        this.omple = omple;
    }

    @Override
    public void visualitzar(Graphics g) {
        g.setColor (color);
        if (Objects.equals(omple, "S")){
            g.fillPolygon(x,y,nodes);
        }
        g.drawPolygon(x,y,nodes);
    }
}
