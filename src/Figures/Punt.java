package Figures;

import java.awt.*;


public class Punt extends FiguraGeometrica {
    private int x,y;
    private Color color;

    public Punt(int x,int y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void visualitzar(Graphics g) {
        g.setColor (color);
        g.drawLine(x, y, x, y);
    }
}
