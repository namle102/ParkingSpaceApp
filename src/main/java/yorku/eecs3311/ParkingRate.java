package yorku.eecs3311;

public enum ParkingRate {
	STUDENT(5),
	FACULTY(8),
	STAFF(10),
	VISITOR(15);
	
	private int rate;

	ParkingRate(int rate) {
		this.rate = rate;
	}
	
	public int getValue() {
		return rate;
	}
}
