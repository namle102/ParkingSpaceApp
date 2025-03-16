package yorku.eecs3311.parking;

public class ParkingSpace implements ParkingComponent {
	private int _id;
	private int _location;
	private boolean _enabled;
	//TODO CHECK HOW TO IMPLEMENT TREE STRUCTURE???
	
	public ParkingSpace(int id, int location, boolean enabled) {
		this._id = id;
		this._location = location;
		this._enabled = enabled;
	}
	
	public void enableSpace() {
		this._enabled = true;
	}
	
	public void disableSpace() {
		this._enabled = false;
	}
}
