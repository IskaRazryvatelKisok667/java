import javax.swing.*;
import java.awt.*;

public class task5 {

    static int count = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Счётчик");
        JButton button = new JButton("Click");
        JLabel label = new JLabel("0");

        button.addActionListener(e -> {
            count++;
            label.setText("Нажатий: " + count);
        });

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}