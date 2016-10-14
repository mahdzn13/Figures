import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Objects;
import java.util.Scanner;


public class Texto extends JFrame{
    private JPanel contentPane;
    private String text;
    private Color color;

    public Texto() {

        Scanner s = new Scanner(System.in);
        System.out.println("Que palabra deseas?");
        text = s.nextLine();

        System.out.println("Que color desea?");
        colorMenu();
        getColor(s.next());

        //Open operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        setBounds(0,0,800,600);
    }
    public void paint (Graphics g)
    {
        super.paint(g);
        g.setColor (color);
        g.drawString(text,10,200);
    }

    public void getColor(String colorName){
        if (Objects.equals(colorName, "A")){
            color = Color.darkGray;
        } else if (Objects.equals(colorName,"B")){
            color = Color.red;
        } else if (Objects.equals(colorName,"C")){
            color = Color.blue;
        } else if (Objects.equals(colorName,"D")){
            color = Color.green;
        } else if (Objects.equals(colorName,"E")){
            color = Color.yellow;
        } else if (Objects.equals(colorName,"F")){
            color = Color.pink;
        } else if (Objects.equals(colorName,"G")){
            color = Color.magenta;
        } else if (Objects.equals(colorName,"H")){
            color = Color.cyan;
        } else if (Objects.equals(colorName,"I")){
            color = Color.gray;
        } else if (Objects.equals(colorName,"J")){
            color = Color.orange;
        }
    }
    public void colorMenu(){
        System.out.println("" +
                "A- Gris claro\n" +
                "B- Rojo\n" +
                "C- Blue\n" +
                "D- Green\n" +
                "E- Yellow\n" +
                "F- Pink\n" +
                "G- Magenta\n" +
                "H- Cyan\n" +
                "I- Gray\n" +
                "J- Orange\n" +

                "");
    }
}
