package yorku.eecs3311;

public class Faculty extends User{
	public Faculty(String email, String pwd, String id) {
		super(email, pwd, id);
		setRate(ParkingRate.FACULTY.getValue());
	}
}
