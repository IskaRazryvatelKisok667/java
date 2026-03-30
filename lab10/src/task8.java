import javax.swing.*;
import java.awt.*;

public class task8 extends JPanel {

    int x = 0;

    public task8() {
        Timer timer = new Timer(50, e -> {
            x += 5;
            if (x > getWidth()) x = 0;
            repaint();
        });
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, 100, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Анимация");
        frame.add(new task8());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}