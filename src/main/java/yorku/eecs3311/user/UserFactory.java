package yorku.eecs3311.user;

public class UserFactory {
	
	private UserFactory() {}
	
	public static User generateUser(String type, String email, String pwd, String id) {
		if (type.equalsIgnoreCase("student")) {
			return new Student(email, pwd, id);
		}
		else if (type.equalsIgnoreCase("faculty")) {
			return new Faculty(email, pwd , id);
		}
		else if (type.equalsIgnoreCase("staff")) {
			return new Staff(email, pwd, id);
		}
		else if (type.equalsIgnoreCase("visitor")) {
			return new Visitor(email, pwd, id);
		}
		else {
			return null;
		}
	}
	
}
