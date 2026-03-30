import javax.swing.*;
import java.awt.*;

public class task3 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Hello Java Applet", 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Текст");
        frame.add(new task3());
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}