import javax.swing.*;
import java.awt.*;

public class task4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Кнопка");
        JButton button = new JButton("Нажми");
        JLabel label = new JLabel("");

        button.addActionListener(e -> label.setText("Кнопка нажата!"));

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}