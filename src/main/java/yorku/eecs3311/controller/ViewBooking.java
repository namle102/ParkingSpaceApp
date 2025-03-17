package yorku.eecs3311.controller;

import yorku.eecs3311.parking.ParkingSpace;
import yorku.eecs3311.parking.TimeSlot;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class ViewBooking extends JPanel {
	
	private ViewController controller;
    private List<ParkingSpace> availableSpaces;
    private JComboBox<String> spaceComboBox;
    private JComboBox<String> dateComboBox;
    private JComboBox<Integer> durationComboBox;
    private JPanel timeSlotsPanel;
    private JButton confirmButton;
    private String selectedTimeSlot;
	
	public ViewBooking(ViewController controller, List<ParkingSpace> availableSpaces) {
		this.controller = controller;
        this.availableSpaces = availableSpaces;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        // Title
        JLabel titleLabel = new JLabel("Select Parking Space");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(titleLabel, gbc);

        // Step 1: Choose Parking Location
        add(new JLabel("Choose a Parking Location:"), gbc);
        spaceComboBox = new JComboBox<>();
        for (ParkingSpace space : availableSpaces) {
            spaceComboBox.addItem(space.getSpaceLocation());
        }
        spaceComboBox.addActionListener(e -> updateDates());
        add(spaceComboBox, gbc);

        // Step 2: Choose Date
        add(new JLabel("Choose a Date:"), gbc);
        dateComboBox = new JComboBox<>();
        dateComboBox.addActionListener(e -> updateTimeSlots());
        add(dateComboBox, gbc);

        // Step 3: Choose Duration
        add(new JLabel("Choose Duration (Hours):"), gbc);
        durationComboBox = new JComboBox<>(new Integer[]{1, 2, 3, 4});
        add(durationComboBox, gbc);

     // Step 4: Choose Start Time
        add(new JLabel("Choose Start Time:"), gbc);
        timeSlotsPanel = new JPanel(new GridLayout(5, 3, 5, 5));
        timeSlotsPanel.setPreferredSize(new Dimension(400, 200));
        add(timeSlotsPanel, gbc);

        // Confirm Booking Button
        confirmButton = new JButton("Confirm Booking");
        confirmButton.setEnabled(false);
        confirmButton.addActionListener(e -> confirmBooking());
        add(confirmButton, gbc);
	}
	
	private void updateDates() {
        dateComboBox.removeAllItems();
        String selectedSpace = (String) spaceComboBox.getSelectedItem();
        if (selectedSpace == null) return;

        for (ParkingSpace space : availableSpaces) {
            if (space.getSpaceLocation().equals(selectedSpace)) {
                for (String date : space.getAvailableDates()) {
                    dateComboBox.addItem(date);
                }
                break;
            }
        }
    }

	private void updateTimeSlots() {
        timeSlotsPanel.removeAll();
        confirmButton.setEnabled(false);  
        selectedTimeSlot = null;  

        String selectedSpace = (String) spaceComboBox.getSelectedItem();
        String selectedDate = (String) dateComboBox.getSelectedItem();

        if (selectedSpace == null || selectedDate == null) return;

        for (ParkingSpace space : availableSpaces) {
            if (space.getSpaceLocation().equals(selectedSpace)) {
                List<TimeSlot> slots = space.getSlotsForDate(selectedDate);
                for (TimeSlot slot : slots) {
                    JButton slotButton = new JButton(slot.getTime());
                    slotButton.setEnabled(slot.isAvailable());

                    slotButton.addActionListener(e -> {
                        selectedTimeSlot = slot.getTime();
                        confirmButton.setEnabled(true);
                    });

                    timeSlotsPanel.add(slotButton);
                }
                break;
            }
        }

        timeSlotsPanel.revalidate();
        timeSlotsPanel.repaint();
    }

    private void confirmBooking() {
        if (selectedTimeSlot == null) {
            JOptionPane.showMessageDialog(this, "No time slot selected!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String selectedSpace = (String) spaceComboBox.getSelectedItem();
        String selectedDate = (String) dateComboBox.getSelectedItem();
        int duration = (int) durationComboBox.getSelectedItem();

        for (ParkingSpace space : availableSpaces) {
            if (space.getSpaceLocation().equals(selectedSpace)) {
                List<String> timesToBook = getTimeSlotsForDuration(selectedTimeSlot, duration);
                
                if (timesToBook.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Invalid duration (exceeds 5 PM)", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                boolean success = space.bookSlots(selectedDate, timesToBook);

                if (success) {
                    for (Component comp : timeSlotsPanel.getComponents()) {
                        if (comp instanceof JButton) {
                            JButton btn = (JButton) comp;
                            if (timesToBook.contains(btn.getText())) {
                                btn.setEnabled(false); // Keep slots grayed out
                            }
                        }
                    }
                    System.out.println("[DEBUG] Booked: " + timesToBook);
                    controller.showDashboardView(); // Return to Dashboard after booking
                } else {
                    JOptionPane.showMessageDialog(this, "Some slots are already booked!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            }
        }
    }

    private List<String> getTimeSlotsForDuration(String startTime, int duration) {
        List<String> times = new ArrayList<>();
        int startHour = Integer.parseInt(startTime.split(":")[0]);

        for (int i = 0; i < duration; i++) {
            int currentHour = startHour + i;
            if (currentHour >= 17) return new ArrayList<>(); 
            times.add(currentHour + ":00");
        }

        return times;
    }
	
}