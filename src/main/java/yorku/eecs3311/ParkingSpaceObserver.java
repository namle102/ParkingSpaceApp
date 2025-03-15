package yorku.eecs3311;

public abstract class ParkingSpaceObserver {
	protected AvailableParkingPublisher subject;
	public abstract void update();
}
