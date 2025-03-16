package yorku.eecs3311.parking;

public class ParkingSpace extends ParkingComponent {
	
	private int spaceID;
	private String spaceLocation; // Lot A, Space 11 = A11
	private boolean isSpaceEnabled;
	private boolean isBooked;
	private Sensor sensor;
	
	public ParkingSpace(int spaceID, String spaceLocation) {
		this.spaceID = spaceID;
		this.spaceLocation = spaceLocation;
		this.isSpaceEnabled = true;
		this.isBooked = false;
		this.sensor = new Sensor();
	}

	public int getSpaceID() {
		return spaceID;
	}

	public String getSpaceLocation() {
		return spaceLocation;
	}
	
	// Check if space is available for booking
	public boolean isAvailable() {
		return isSpaceEnabled && !isBooked;
	}
	
	// Handles booking logic
	public void bookSpace() {
		if(isAvailable()) {
			isBooked = true;
			System.out.println("[+] Space " + spaceLocation + " has been BOOKED.");
		} else {
			System.out.println("[-] Cannot book. Space " + spaceLocation + " is either disabled or already booked.");
		}
	}
	
	// Handle cancel booking logic
	public void cancelBooking() {
		isBooked = false;
		System.out.println("[+] Booking canceled for space " + spaceLocation);
	}

	@Override
	public void enable() {
		isSpaceEnabled = true;
	}

	@Override
	public void disable() {
		isSpaceEnabled = false;
	}
	
	@Override
	boolean isEnabled() {
		return isSpaceEnabled;
	}

	@Override
	public void showStatus() {
		System.out.println("Parking Space " + spaceLocation + " is " 
	            + (isSpaceEnabled ? "ENABLED" : "DISABLED") 
	            + " and " + (isBooked ? "BOOKED" : "AVAILABLE"));
	}
	
}
