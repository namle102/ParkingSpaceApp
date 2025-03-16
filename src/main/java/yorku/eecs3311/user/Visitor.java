package yorku.eecs3311.user;

import yorku.eecs3311.parking.ParkingRate;

public class Visitor extends User {
	public Visitor(String email, String pwd, String id) {
		super(email, pwd, id);
		setRate(ParkingRate.VISITOR.getValue());
	}
}
