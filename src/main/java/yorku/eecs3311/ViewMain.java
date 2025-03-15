package yorku.eecs3311;

import javax.swing.*;
import java.awt.*;

public class ViewMain extends JFrame {
	
	private JPanel mainPanel;
	private CardLayout cardLayout;
	private ViewController controller;
	
	public ViewMain(ViewController controller) {
		this.controller = controller;
		
		// set up the main frame facing users
		setTitle("YorkU Parking Booking App");
		setSize(900, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// set up the main panel (container)
		cardLayout = new CardLayout();
		mainPanel = new JPanel(cardLayout);
		
		// add main panel to the frame
		add(mainPanel);
	}
	
	// add different views to the main window
	public void addView(String name, JPanel panel) {
		mainPanel.add(panel, name);
	}
	
	// switch between views
	public void showView(String name) {
		cardLayout.show(mainPanel, name);
	}
	
}
