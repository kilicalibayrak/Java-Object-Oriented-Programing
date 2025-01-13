import java.awt.*;
import javax.swing.*;

public class RoundEdgeRectangle extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRoundRect(80, 40, 90, 50, 10, 10);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Round Edge Rectangle");
        RoundEdgeRectangle panel = new RoundEdgeRectangle();

        frame.setSize(300,400);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
