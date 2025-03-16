package yorku.eecs3311.controller;

import java.awt.*;
import javax.swing.*;

public class ViewDashboard extends JPanel {
	
	private JButton bookParkingButton, extendParkingButton, cancelBookingButton, logoutButton;
	private ViewController controller;
	
	public ViewDashboard(ViewController controller) {
        this.controller = controller;
        
     	// Central layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        // Title
        JLabel titleLabel = new JLabel("Dashboard", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Show buttons
        bookParkingButton = new JButton("Book a Parking");
        extendParkingButton = new JButton("Extend a Parking");
        cancelBookingButton = new JButton("Cancel a Booking");
        logoutButton = new JButton("Log Out");

        // Action listeners
        logoutButton.addActionListener(e -> controller.showHeroView());

        // Add components in order
        add(titleLabel, gbc);
        add(bookParkingButton, gbc);
        add(extendParkingButton, gbc);
        add(cancelBookingButton, gbc);
        add(logoutButton, gbc);
    }
	
}
