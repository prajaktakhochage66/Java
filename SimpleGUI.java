import java.awt.*; // Import Swing components
import java.awt.event.ActionEvent; // Import AWT classes for layout
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create the frame (main window)
        JFrame frame = new JFrame("Simple GUI Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Close the app when window is closed
        frame.setSize(400, 200); // Set frame size
        frame.setLayout(new FlowLayout());
        // Set layout manager to FlowLayout
        // Create a label with initial text
        JLabel label = new JLabel("Click the button");
        frame.add(label); // Add label to frame

        // Create a button with text
        JButton button = new JButton("Click Me");
        frame.add(button); // Add button to frame
        // Add an ActionListener to handle button clicks
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update label text when button is clicked
                label.setText("Button Clicked!");
            }
        });
        // Make the frame visible
        frame.setVisible(true);
    }
}