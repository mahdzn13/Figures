package Figures;

import java.awt.*;
import java.util.Objects;

public class Rectangle extends FiguraGeometrica {
   int x,y,ample,altura;
   Color color;
   String omple;

   public Rectangle (int x, int y, int ample, int altura,Color color, String omple) {
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
         g.fillRect(x,y,ample,altura);
      }
      g.drawRect(x,y,ample,altura);

   }
}