import javax.swing.*;
import java.awt.*;

public class task2 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);

        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 100, 100);

        g.setColor(Color.BLUE);
        g.fillRect(350, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Цвета");
        frame.add(new task2());
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}