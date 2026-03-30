import javax.swing.*;
import java.awt.*;

public class task6 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Имя");

        JTextField textField = new JTextField(15);
        JButton button = new JButton("OK");
        JLabel label = new JLabel("");

        button.addActionListener(e ->
                label.setText("Привет, " + textField.getText())
        );

        frame.setLayout(new FlowLayout());
        frame.add(textField);
        frame.add(button);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}