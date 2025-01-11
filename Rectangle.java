import javax.swing.*;
import java.awt.*;

public class Rectangle extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//silmesi için
        g.drawRect(50, 50, 100, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Rectangle");
        Rectangle panel = new Rectangle();

        frame.setSize(300,300);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
