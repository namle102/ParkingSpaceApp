package yorku.eecs3311.parking;

public class Sensor {
	
	private boolean isCarParked;
	private String plate;
	
	public Sensor() {
		isCarParked = false;
		plate = "";
	}
	
	public void scanCarInfo(String plate) {
		this.plate = plate;
		isCarParked = true;
	}
	
	public void clearCarInfo() {
		this.plate = "";
		isCarParked = false;
	}
	
	public void sendCarInfo() {
		System.out.println("Sending car info with plate: " + plate + " to the system.");
	}
	
	public boolean isCarParked() {
		return isCarParked;
	}

	public String getPlate() {
		return plate;
	}
	
}
