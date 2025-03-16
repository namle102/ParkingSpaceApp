package yorku.eecs3311.parking;

public abstract class ParkingComponent {
	abstract void enable();
	abstract void disable();
	abstract boolean isEnabled();
	abstract void showStatus();
}
