package yorku.eecs3311.user;

import yorku.eecs3311.parking.ParkingRate;

public class Faculty extends User{
	public Faculty(String email, String pwd, String id) {
		super(email, pwd, id);
		setRate(ParkingRate.FACULTY.getValue());
	}
}
