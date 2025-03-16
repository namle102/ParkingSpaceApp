package yorku.eecs3311.controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import yorku.eecs3311.Database;

public class ViewBooking extends JPanel {
	
	private ViewController controller;
	private JComboBox<String> timeSlotComboBox;
    private JButton bookParkingButton;
    private JCheckBox depositCheckBox;
    private JPanel parkingGrid;
    private JLabel titleLabel;
    private double userRate;
    private JButton selectedSpot;
    private Database database;
    
	
	public ViewBooking(ViewController controller, double userRate) {
		this.controller = controller;
		this.userRate = userRate;
		this.database = Database.getInstance();
		
		// Set layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        // Title
        titleLabel = new JLabel("Book a Parking Spot", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(titleLabel, gbc);

        // Show time slot selection
        String[] timeSlots = {
            "6:00 - 7:00 AM", "7:00 - 8:00 AM", "8:00 - 9:00 AM",
            "9:00 - 10:00 AM", "10:00 - 11:00 AM", "11:00 - 12:00 PM",
            "12:00 - 1:00 PM", "1:00 - 2:00 PM", "2:00 - 3:00 PM",
            "3:00 - 4:00 PM", "4:00 - 5:00 PM", "5:00 - 6:00 PM"
        };
        timeSlotComboBox = new JComboBox<>(timeSlots);
        add(timeSlotComboBox, gbc);

        // Show parking space grid
        parkingGrid = new JPanel(new GridLayout(10, 20, 5, 5));
        parkingGrid.setPreferredSize(new Dimension(600, 300));
        addParkingSpaces();
        add(parkingGrid, gbc);

        // Show deposit confirmation
        depositCheckBox = new JCheckBox("I confirm a deposit of 1 hour ($" + String.format("%.2f", userRate) + ") will be applied.");
        add(depositCheckBox, gbc);

        // Show book button
        bookParkingButton = new JButton("Book a Parking Spot");
        bookParkingButton.setEnabled(false); // Disabled initially
        add(bookParkingButton, gbc);

        // Action listeners to enable booking only when check box is checked
        depositCheckBox.addActionListener(e -> bookParkingButton.setEnabled(depositCheckBox.isSelected()));
	}
	
	private void addParkingSpaces() {
        for (int i = 1; i <= 100; i++) {
            String spotA = "A" + i;
            String spotB = "B" + i;
            parkingGrid.add(createParkingButton(spotA, i % 10 != 0)); // Hardcode some unavailable
            parkingGrid.add(createParkingButton(spotB, i % 15 != 0));
        }
    }

    private JButton createParkingButton(String label, boolean isAvailable) {
        JButton button = new JButton(label);
        button.setBackground(isAvailable ? Color.GREEN : Color.RED);
        button.setEnabled(isAvailable);
        button.setPreferredSize(new Dimension(50, 40)); // Fix button size
        button.setFont(new Font("Arial", Font.PLAIN, 12)); // Prevent text truncation
        return button;
    }
	
}
