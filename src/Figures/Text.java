package Figures;
import java.awt.*;


public class Text extends FiguraGeometrica{
    int x,y;
    private String text;
    private Color color;

    public Text(int x, int y, String text, Color color){
        this.x = x;
        this.y = y;
        this.text = text;
        this.color = color;
    }

    @Override
    public void visualitzar(Graphics g) {
        g.setColor (color);
        g.drawString(text,x,y);
    }
}
