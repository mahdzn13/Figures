import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Created by mahernandezd on 11/10/16.
 */
public class Texto extends JFrame{
    private JPanel contentPane;


    public Texto() {


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
        g.setColor (Color.blue);
        g.drawString("Primer linea",10,200);
    }
}
