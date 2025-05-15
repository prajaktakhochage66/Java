import java.awt.*; // Import AWT components
import java.awt.event.*; // Import AWT event classes
import javax.swing.*; // Import Swing components
// Class extending JFrame and implementing ActionListener for

class factdemo1 extends JFrame implements ActionListener {
    JButton b1; // Button to trigger factorial calculation
    JLabel l1, l2; // Labels for input and output
    JTextField t1, t2;

    // TextFields for input number and displaying factorial
    public factdemo1() {
        setTitle("Factorial"); // Set the window title
        // Initialize GUI components
        l1 = new JLabel("Enter the number ");
        t1 = new JTextField(20);
        l2 = new JLabel("Factorial");
        t2 = new JTextField(20);
        b1 = new JButton("Click");
        setSize(400, 400); // Set window size
        setLayout(new FlowLayout());
        // Use FlowLayout for arranging components
        // Add components to the frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        // Add action listener to the button
        b1.addActionListener(this);
        // Make the frame visible and set default close operation
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Method called when button is clicked
    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(t1.getText());
        // Parse input from text field
        if (e.getSource() == b1)
        // Check if the event source is the button
        {
            int fact = 1, i;
            for (i = num; i >= 1; i--)
                // Compute factorial using loop
                fact = fact * i;
            t2.setText(String.valueOf(fact));
            // Display the result in the second text field
        }
    }

    // Main method to launch the application
    public static void main(String args[]) {
        factdemo1 f = new factdemo1();
    }
}