package yorku.eecs3311;
import java.util.List;

public class AvailableParkingPublisher extends Publisher {
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
	
}
