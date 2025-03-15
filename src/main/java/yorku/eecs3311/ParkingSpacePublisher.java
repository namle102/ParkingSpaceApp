package yorku.eecs3311;
import java.util.ArrayList;
import java.util.List;

public class ParkingSpacePublisher {
	private List<ParkingSpaceObserver> _observers = new ArrayList<ParkingSpaceObserver>();
	private List<ParkingComponent> _parkingSpots;
	public List<ParkingComponent> getParkingSpots(){
		return this._parkingSpots;
	}
	
	public void addParkingSpot(ParkingComponent parkingSpot) {
		this._parkingSpots.add(parkingSpot);
		this.notifyAllObservers();
	}
	
	public void removeParkingSpot(ParkingComponent parkingSpot) {
		this._parkingSpots.remove(parkingSpot);
		this.notifyAllObservers();
	}
	
	public void attachObserver(ParkingSpaceObserver observer) {
		this._observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for(ParkingSpaceObserver observer: _observers) {
			observer.update();
		}
	}
	
}
