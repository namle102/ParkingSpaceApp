package yorku.eecs3311.user;

import yorku.eecs3311.parking.ParkingRate;

public class Student extends User {
	public Student(String email, String pwd, String id) {
		super(email, pwd, id);
		setRate(ParkingRate.STUDENT.getValue());
	}
}
