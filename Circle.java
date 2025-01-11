import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(30, 30, 80, 80);
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Circle");
        Circle panel = new Circle();

        frame.setSize(300,300);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
}
