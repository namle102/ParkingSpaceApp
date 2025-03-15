package yorku.eecs3311;

import java.awt.*;
import javax.swing.*;

public class ViewRegistration extends JPanel {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton registerButton, backButton;
    private ViewController controller;

    public ViewRegistration(ViewController controller) {
        this.controller = controller;

        // center layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        // title
        JLabel titleLabel = new JLabel("User Registration", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // email
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(15);

        // password
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);

        // buttons
        registerButton = new JButton("Register");
        backButton = new JButton("Back");

        backButton.addActionListener(e -> controller.showHeroView());

        // add components in order
        add(titleLabel, gbc);
        add(emailLabel, gbc);
        add(emailField, gbc);
        add(passwordLabel, gbc);
        add(passwordField, gbc);
        add(registerButton, gbc);
        add(backButton, gbc);
    }
}
