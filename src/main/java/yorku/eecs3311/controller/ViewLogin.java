package yorku.eecs3311.controller;

import java.awt.*;
import javax.swing.*;

public class ViewLogin extends JPanel {
	private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton, backButton;
    private ViewController controller;
    
    public ViewLogin(ViewController controller) {
        this.controller = controller;
        
        // Central layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        // Title
        JLabel titleLabel = new JLabel("Login", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Show email
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(15);

        // Show password
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);

        // Show buttons
        loginButton = new JButton("Login");
        backButton = new JButton("Back");

        // Action listeners
        loginButton.addActionListener(e -> loginUser());
        backButton.addActionListener(e -> controller.showHeroView());

        // Add components in order
        add(titleLabel, gbc);
        add(emailLabel, gbc);
        add(emailField, gbc);
        add(passwordLabel, gbc);
        add(passwordField, gbc);
        add(loginButton, gbc);
        add(backButton, gbc);
    }

    private void loginUser() {
        String email = emailField.getText();
        String pwd = new String(passwordField.getPassword());

        if (controller.validateLogin(email, pwd)) {
            controller.showDashboardView();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
