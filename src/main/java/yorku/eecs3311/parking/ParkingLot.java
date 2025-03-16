package yorku.eecs3311.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot extends ParkingComponent {
	
	private String lotName;
	private boolean isLotEnabled;
	private List<ParkingSpace> spaces;
	
	public ParkingLot(String lotName) {
		this.lotName = lotName;
		this.isLotEnabled = true;
		this.spaces = new ArrayList<>(100); // Each lot contains 100 spaces
		
		// Build spaces
		for (int i=1; i<=100; i++) {
			spaces.add(new ParkingSpace(i, lotName + i));
		}
	}

	@Override
	public void enable() {
		isLotEnabled = true;
		for (ParkingComponent space : spaces) {
			space.enable();
		}
	}
	
	@Override
	public void disable() {
		isLotEnabled = false;
		for (ParkingComponent space : spaces) {
			space.disable();
		}
	}
	
	@Override
	boolean isEnabled() {
		return isLotEnabled;
	}

	@Override
	public void showStatus() {
		System.out.println("Parking Lot " + lotName + " is " + (isLotEnabled ? "ENABLED" : "DISABLED"));
        for (ParkingComponent space : spaces) {
            space.showStatus();
        }
	}
	
	/*
	 * THESE METHODS DELEGATE DOWN TO ParkingSpace
	 */
	public boolean isSpaceAvailable(int spaceID) {
		if (spaceID > 0 && spaceID <= 100) {
			return spaces.get(spaceID - 1).isAvailable();
		}
		return false;
	}
	
	public void bookSpace(int spaceID) {
		if (spaceID > 0 && spaceID <= 100) {
			spaces.get(spaceID - 1).bookSpace();
		}
	}
	
	public void cancelBooking(int spaceID) {
		if (spaceID > 0 && spaceID <= 100) {
			spaces.get(spaceID - 1).cancelBooking();
		}
	}
	
	/*
	 * THESE METHODS HANDLE UPPER NODE: ParkingLot CALLS
	 */
	// Enable a specific parking space ONLY IF the lot is enabled
	public void enableSpace(int spaceID) {
		if (!isLotEnabled) {
			System.out.println("[-] Cannot enable space. The lot is DISABLED.");
			return;
		}
		
		if (spaceID > 0 && spaceID <= 100) {
			spaces.get(spaceID - 1).enable();
		} else {
			System.out.println("[-] Invalid space ID: " + spaceID);
		}
	}
		
	// Disable a specific parking space
	public void disableSpace(int spaceID) {
		if (spaceID > 0 && spaceID <= 100) {
			spaces.get(spaceID - 1).disable();
		} else {
			System.out.println("[-] Invalid space ID: " + spaceID);
		}
	}
		
	// Get space status
	public boolean isSpaceEnabled(int spaceID) {
		if (spaceID > 0 && spaceID <= 100) {
			return spaces.get(spaceID - 1).isEnabled();
		}
			
		return false;
	}

}
