package yorku.eecs3311.controller;

import java.awt.*;
import javax.swing.*;

public class ViewHero extends JPanel {
    private ViewController controller;

    public ViewHero(ViewController controller) {
        this.controller = controller;

        // Center layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; // center horizontally
        gbc.gridy = GridBagConstraints.RELATIVE; // stack elements vertically
        gbc.insets = new Insets(10, 0, 10, 0); // add vertical spacing
        gbc.anchor = GridBagConstraints.CENTER; // align center

        // Welcome text
        JLabel welcomeLabel = new JLabel("Welcome to YorkU Parking Booking App", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        
        // Sign up text and button + listener
        JLabel signUpText = new JLabel("New to our app?", SwingConstants.CENTER);
        JButton signupBtn = new JButton("Sign Up");
        signupBtn.addActionListener(e -> controller.showRegistrationView());

        // Login text and button + listener
        JLabel loginText = new JLabel("Already a member?", SwingConstants.CENTER);
        JButton loginBtn = new JButton("Log In");
        loginBtn.addActionListener(e -> controller.showLoginView());

        // Add components in order
        add(welcomeLabel, gbc);
        add(signUpText, gbc);
        add(signupBtn, gbc);
        add(loginText, gbc);
        add(loginBtn, gbc);
    }
}
