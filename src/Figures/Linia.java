package Figures;

import java.awt.*;

/**
 * Created by Marco on 15/10/2016.
 */
public class Linia extends FiguraGeometrica{
    int x,y,x1,y1;
    Color color;

    public Linia(int x, int y,int x1, int y1, Color color) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
        this.color = color;
    }
    @Override
    public void visualitzar(Graphics g) {
        g.setColor (color);
        g.drawLine(x, y, x1, y1);
    }
}
