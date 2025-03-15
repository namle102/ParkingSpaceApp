package yorku.eecs3311;
import java.util.ArrayList;
import java.util.List;

public class AvailableParkingPublisher {
	private List<AvailableParkingObserver> _observers = new ArrayList<AvailableParkingObserver>();
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
	
	public void attachObserver(AvailableParkingObserver observer) {
		this._observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for(AvailableParkingObserver observer: _observers) {
			observer.update();
		}
	}
	
}
