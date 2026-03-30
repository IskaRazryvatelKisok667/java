import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task9 extends JPanel {

    int x = 0, y = 0;

    public task9() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, 10, 10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Мышь");
        frame.add(new task9());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}