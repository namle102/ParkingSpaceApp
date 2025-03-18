package yorku.eecs3311.controller;

import javax.swing.*;
import java.awt.*;

public class ViewBookingPay extends JPanel {

	private JComboBox<String> paymentMethodComboBox;
    private JButton nextButton, backButton;

    public ViewBookingPay(ViewController controller) {
    	
    	// Central layout
    	setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        // Title
        JLabel titleLabel = new JLabel("Booking Phase 3", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(titleLabel, gbc);

        // Step 1: Select payment method
        add(new JLabel("Select Payment Method:"), gbc);
        paymentMethodComboBox = new JComboBox<>(new String[]{"Select...", "Credit Card", "Debit Card", "Mobile Phone"});
        paymentMethodComboBox.addActionListener(e -> nextButton.setEnabled(!paymentMethodComboBox.getSelectedItem().equals("Select...")));
        add(paymentMethodComboBox, gbc);

        // Next button
        nextButton = new JButton("Next");
        nextButton.setEnabled(false);
        nextButton.addActionListener(e -> controller.showBookingConfirmView(paymentMethodComboBox.getSelectedItem().toString()));
        add(nextButton, gbc);
        
        // Back button
        backButton = new JButton("Back");
        backButton.addActionListener(e -> controller.showBookingPlateView(null, null, null, null));
        add(backButton, gbc);
        
    }
    
}
