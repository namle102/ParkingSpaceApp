package yorku.eecs3311;

public class Visitor extends User {
	public Visitor(String email, String pwd) {
		super(email, pwd);
		setRate(ParkingRate.VISITOR.getValue());
	}
}
