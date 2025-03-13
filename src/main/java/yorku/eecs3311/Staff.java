package yorku.eecs3311;

public class Staff extends User {
	public Staff(String email, String pwd, String id) {
		super(email, pwd, id);
		setRate(ParkingRate.STAFF.getValue());
	}
}
