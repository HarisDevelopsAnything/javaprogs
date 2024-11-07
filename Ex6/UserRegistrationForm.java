import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserRegistrationForm extends JFrame {

    // Constructor
    public UserRegistrationForm() {
        // Set up the frame
        setTitle("User Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create a panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        // Add components
        panel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Email:"));
        JTextField emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("User Type:"));
        String[] userTypes = { "Student", "Teacher" };
        JComboBox<String> userTypeComboBox = new JComboBox<>(userTypes);
        panel.add(userTypeComboBox);

        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        // Add panel to frame
        add(panel);

        // Button action
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String userType = (String) userTypeComboBox.getSelectedItem();

                // Here you can handle the registration logic
                JOptionPane.showMessageDialog(null, "Registration Successful!\n" +
                        "Name: " + name + "\nEmail: " + email + "\nUser Type: " + userType);
            }
        });
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UserRegistrationForm form = new UserRegistrationForm();
            form.setVisible(true);
        });
    }
}
