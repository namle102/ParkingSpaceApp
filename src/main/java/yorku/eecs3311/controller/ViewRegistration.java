package yorku.eecs3311.controller;

import java.awt.*;
import javax.swing.*;

public class ViewRegistration extends JPanel {
    private JTextField emailField, idField;
    private JPasswordField passwordField;
    private JButton registerButton, backButton;
    private JComboBox<String> userTypeDropdown;
    private JLabel idLabel;
    private ViewController controller;

    public ViewRegistration(ViewController controller) {
        this.controller = controller;

        // Center layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        // Title
        JLabel titleLabel = new JLabel("User Registration", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Show email
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(15);

        // Show password
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);
        
        // Show user type
        JLabel userTypeLabel = new JLabel("User Type:");
        String[] userTypes = {"Student", "Faculty", "Staff", "Visitor"};
        userTypeDropdown = new JComboBox<>(userTypes);
        
        // Show ID
        idLabel = new JLabel("ID:");
        idField = new JTextField(15);

        // Show buttons
        registerButton = new JButton("Register");
        backButton = new JButton("Back");

        // Actions listeners
        userTypeDropdown.addActionListener(e -> toggleIDField());
        registerButton.addActionListener(e -> registerUser());
        backButton.addActionListener(e -> controller.showHeroView());

        // Add components in order
        add(titleLabel, gbc);
        add(emailLabel, gbc);
        add(emailField, gbc);
        add(passwordLabel, gbc);
        add(passwordField, gbc);
        add(userTypeLabel, gbc);
        add(userTypeDropdown, gbc);
        add(idLabel, gbc);
        add(idField, gbc);
        add(registerButton, gbc);
        add(backButton, gbc);
    }
    
    private void toggleIDField() {
    	String selectedType = (String) userTypeDropdown.getSelectedItem();
    	boolean needsID = !selectedType.equalsIgnoreCase("Visitor");
    	idLabel.setVisible(needsID);
    	idField.setVisible(needsID);
    }
    
    private void registerUser() {
    	String email = emailField.getText();
    	String pwd = new String(passwordField.getPassword());
    	String type = (String) userTypeDropdown.getSelectedItem();
    	String id = idField.getText();
    	
    	// Visitor doesn't need id
    	if (type.equalsIgnoreCase("Visitor")) {
    		id = null;
    	}
    	
    	// Delegate to the controller and get the message
    	String message = controller.registerUser(type, email, pwd, id);
    	
    	if ("SUCCESS".equals(message)) {
            JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            controller.showHeroView();  // Redirect to Hero View after successful registration
        } else {
            JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
