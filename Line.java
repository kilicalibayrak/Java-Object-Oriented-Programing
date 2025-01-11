import javax.swing.*;
import java.awt.*;

public class Line extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //a(50,50) to b(100,100)
        g.drawLine(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Line");
        Line panel =new Line();

        frame.setSize(300,300);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
