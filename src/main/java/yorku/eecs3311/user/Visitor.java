package yorku.eecs3311.user;

import yorku.eecs3311.parking.ParkingRate;

public class Visitor extends User {
	public Visitor(String email, String pwd) {
		super(email, pwd);
		setRate(ParkingRate.VISITOR.getValue());
	}
}
