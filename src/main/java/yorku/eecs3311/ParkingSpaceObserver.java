package yorku.eecs3311;

public abstract class ParkingSpaceObserver {
	protected ParkingSpacePublisher subject;
	public abstract void update();
}
