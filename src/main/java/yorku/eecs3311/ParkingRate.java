package yorku.eecs3311;

public enum ParkingRate {
	STUDENT(5.0),
	FACULTY(8.0),
	STAFF(10.0),
	VISITOR(15.0);
	
	private double rate;

	ParkingRate(double rate) {
		this.rate = rate;
	}
	
	public double getValue() {
		return rate;
	}
}
