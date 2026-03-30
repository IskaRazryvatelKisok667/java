import javax.swing.*;
import java.awt.*;

public class task7 extends JPanel {

    Color color = Color.RED;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(100, 100, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Цвет");

       task7 panel = new task7();

        JButton red = new JButton("Red");
        JButton green = new JButton("Green");
        JButton blue = new JButton("Blue");

        red.addActionListener(e -> { panel.color = Color.RED; panel.repaint(); });
        green.addActionListener(e -> { panel.color = Color.GREEN; panel.repaint(); });
        blue.addActionListener(e -> { panel.color = Color.BLUE; panel.repaint(); });

        frame.setLayout(new FlowLayout());
        frame.add(red);
        frame.add(green);
        frame.add(blue);
        frame.add(panel);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}