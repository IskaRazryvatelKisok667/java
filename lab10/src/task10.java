import javax.swing.*;
import java.awt.*;

public class task10 extends JPanel {

    String text = "";
    Color color = Color.RED;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(color);
        g.fillRect(100, 100, 100, 100);

        g.setColor(Color.BLACK);
        g.drawString(text, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Мини-приложение");

       task10 panel = new task10();

        JTextField tf = new JTextField(15);
        JButton btn = new JButton("Показать");

        btn.addActionListener(e -> {
            panel.text = tf.getText();
            panel.color = new Color(
                    (int)(Math.random()*255),
                    (int)(Math.random()*255),
                    (int)(Math.random()*255)
            );
            panel.repaint();
        });

        frame.setLayout(new FlowLayout());
        frame.add(tf);
        frame.add(btn);
        frame.add(panel);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
