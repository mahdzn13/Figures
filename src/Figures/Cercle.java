package Figures;

import java.awt.*;
import java.util.Objects;

public class Cercle extends FiguraGeometrica {
   int x,y,ample,altura;
   Color color;
   String omple;

   
   public Cercle (int x, int y, int ample, int altura,Color color, String omple) {
      this.x = x;
      this.y = y;
      this.ample = ample;
      this.altura = altura;
      this.color = color;
      this.omple = omple;
   }

    public void visualitzar(Graphics g) {
       g.setColor (color);
       if (Objects.equals(omple, "S")){
          g.fillOval(x,y,ample,altura);
       }

       g.drawOval(x,y,ample,altura);
    }
}