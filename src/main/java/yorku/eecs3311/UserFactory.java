package yorku.eecs3311;

public class UserFactory {
	private UserFactory() {}
	
	public static User generateUser(String type, String email, String pwd, String id) {
		// Validate email and password
		if (!isValidEmail(email) || !isValidPwd(pwd)) {
			System.out.println("[-] Invalid email or password.");
			return null;
		}
		
		// Validate duplicate email
		if (Database.isEmailRegistered(email)) {
			System.out.println("Email already exists. Please use a different email.");
			return null;
		}
		
		// Validate ID
		if (!isValidID(type, id)) {
			System.out.println("[-] Invalid ID for the selected user type.");
			return null;
		}
		
		/*
		 * After passing the three validation steps above
		 * We're now able to create a user
		 */
		User user;
		
		if (type.equalsIgnoreCase("student")) {
			user = new Student(email, pwd, id);
		}
		else if (type.equalsIgnoreCase("faculty")) {
			user = new Faculty(email, pwd , id);
		}
		else if (type.equalsIgnoreCase("staff")) {
			user = new Staff(email, pwd, id);
		}
		else if (type.equalsIgnoreCase("visitor")) {
			user = new Visitor(email, pwd);
		}
		else {
			return null;
		}
		
		// Add the newly created user to the database
		Database.addUserToDatabase(user);
		System.out.println("[+] User registered successfully: " + email);
		
		return user;
	}
	
	/*
	 * Helper methods
	 */
	private static boolean isValidEmail(String email) {
		return email.contains("@") && email.contains(".");
	}
	
	private static boolean isValidPwd(String pwd) {
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>?/]).{8,}$";
		return pwd.matches(regex);
	}
	
	private static boolean isValidID(String type, String id) {
		// visitors don't need an id
		if (id == null) return true;
		
		// check if id matches type
		if ((type.equalsIgnoreCase("student") && !id.startsWith("s")) ||
			(type.equalsIgnoreCase("faculty") && !id.startsWith("f")) ||
			(type.equalsIgnoreCase("staff") && !id.startsWith("t"))) {
			return false;
		}
		
		return ManagerAccount.verifyUser(id);
	}
}
