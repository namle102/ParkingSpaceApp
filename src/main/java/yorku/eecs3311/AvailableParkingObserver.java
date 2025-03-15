package yorku.eecs3311;

public abstract class AvailableParkingObserver {
	protected AvailableParkingPublisher subject;
	public abstract void update();
}
