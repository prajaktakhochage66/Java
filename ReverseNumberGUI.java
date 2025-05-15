import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumberGUI extends JFrame implements ActionListener {
    JTextField inputField, resultField;
    JButton reverseButton;

    public ReverseNumberGUI() {
        setTitle("Reverse Number");
        setSize(350, 200);
        setLayout(new FlowLayout());

        // Create components
        JLabel inputLabel = new JLabel("Enter a number:");
        inputField = new JTextField(15);

        reverseButton = new JButton("Find Reverse");
        reverseButton.addActionListener(this);

        JLabel resultLabel = new JLabel("Reversed number:");
        resultField = new JTextField(15);
        resultField.setEditable(false);

        // Add components to frame
        add(inputLabel);
        add(inputField);
        add(reverseButton);
        add(resultLabel);
        add(resultField);

        // Final frame setup
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Action performed when button is clicked
    public void actionPerformed(ActionEvent e) {
        String inputText = inputField.getText();
        try {
            int num = Integer.parseInt(inputText);
            int reversed = 0;
            while (num != 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            resultField.setText(String.valueOf(reversed));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new ReverseNumberGUI();
    }
}
