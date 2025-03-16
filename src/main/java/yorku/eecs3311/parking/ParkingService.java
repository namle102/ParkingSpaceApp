package yorku.eecs3311.parking;

import java.util.HashMap;
import java.util.Map;

public class ParkingService extends ParkingComponent {
	
	private Map<String, ParkingLot> lots;
	
	public ParkingService() {
		lots = new HashMap<>();
	}
	
	// Add a new parking lot
	public void addLot(String lotName) {
		if (!lots.containsKey(lotName)) {
			lots.put(lotName, new ParkingLot(lotName));
			System.out.println("[+] Added parking lot: " + lotName);
		} else {
			System.out.println("[-] Parking lot " + lotName + " already exists.");
		}
	}
	
	// Enable a parking lot
	public void enableLot(String lotName) {
		ParkingLot lot = lots.get(lotName);
		if (lot != null) {
			lot.enable();
		} else {
			System.out.println("[-] Parking lot " + lotName + " does not exists.");
		}
	}
	
	// Disable a parking lot
	public void disableLot(String lotName) {
		ParkingLot lot = lots.get(lotName);
		if (lot != null) {
			lot.disable();
		} else {
			System.out.println("[-] Parking lot " + lotName + " does not exists.");
		}
	}
	
	// Enable a specific space in a lot
	public void enableSpace(String lotName, int spaceID) {
		ParkingLot lot = lots.get(lotName);
		if (lot != null) {
			lot.enableSpace(spaceID);
		} else {
			System.out.println("[-] Parking lot " + lotName + " does not exists.");
		}
	}
	
	// Disable a specific space in a lot
	public void disableSpace(String lotName, int spaceID) {
		ParkingLot lot = lots.get(lotName);
		if (lot != null) {
			lot.disableSpace(spaceID);
		} else {
			System.out.println("[-] Parking lot " + lotName + " does not exists.");
		}
	}
	
	// Check if a space is enabled
	public boolean isSpaceEnabled(String lotName, int spaceID) {
		ParkingLot lot = lots.get(lotName);
		return lot != null && lot.isSpaceEnabled(spaceID);
	}
	
	// Check if a space is available for booking
	public boolean isSpaceAvailable(String lotName, int spaceID) {
		ParkingLot lot = lots.get(lotName);
		return lot != null && lot.isSpaceAvailable(spaceID);
	}
	
	// Book a space
	public void bookSpace(String lotName, int spaceID) {
		ParkingLot lot = lots.get(lotName);
		if (lot != null) {
			lot.bookSpace(spaceID);
		} else {
			System.out.println("[-] Parking lot " + lotName + " does not exists.");
		}
	}
	
	// Cancel a booking
	public void cancelBooking(String lotName, int spaceID) {
		ParkingLot lot = lots.get(lotName);
		if (lot != null) {
			lot.cancelBooking(spaceID);
		} else {
			System.out.println("[-] Parking lot " + lotName + " does not exists.");
		}
	}

	// Enable all lots
	@Override
	void enable() {
		for (ParkingLot lot : lots.values()) {
			lot.enable();
		}
	}
	
	// Disable all lots
	@Override
	void disable() {
		for (ParkingLot lot : lots.values()) {
			lot.disable();
		}
	}
	
	// Check if all lots are enabled
	@Override
	boolean isEnabled() {
		for (ParkingLot lot : lots.values()) {
			if (!lot.isEnabled()) return false;
		}
		return true;
	}

	@Override
	void showStatus() {
		System.out.println("=== Parking Service Status ===");
        if (lots.isEmpty()) {
            System.out.println("No parking lots available.");
        } else {
            for (ParkingLot lot : lots.values()) {
                lot.showStatus();
            }
        }
	}

}
