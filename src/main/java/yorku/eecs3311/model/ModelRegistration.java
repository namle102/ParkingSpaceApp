package yorku.eecs3311.model;

import yorku.eecs3311.Database;
import yorku.eecs3311.manager.ManagerAccount;
import yorku.eecs3311.user.User;
import yorku.eecs3311.user.UserFactory;

public class ModelRegistration {
	
	private Database database;
	
	public ModelRegistration() {
		this.database = Database.getInstance();
	}
	
	public String registerUser(String type, String email, String pwd, String id) {
		// Validate credentials
		if (!isValidEmail(email) || !isValidPwd(pwd)) {
			return "[-] Invalid email or password.";
		}
				
		// Validate duplicate email
		if (database.isEmailRegistered(email)) {
			return "[-] Email already exists. Please use a different email.";
		}
		
		// Validate if ID matches type
		if ((type.equalsIgnoreCase("student") && !id.startsWith("s")) ||
			(type.equalsIgnoreCase("faculty") && !id.startsWith("f")) ||
			(type.equalsIgnoreCase("staff") && !id.startsWith("t"))) {		
			return "[-] ID mismatch.";
		}
		
		// If ID matched above, check if there management team to verify (Req 1)
		ManagerAccount manager = database.getAnyManagerAccount();
		if (manager == null) {
			return "[-] No Management Team available to verify ID.";
		}
				
		// If there is a management team, then ask him to check or pass it if type visitor
		if (!isValidID(id, manager)) {
			return "[-] No found ID in the system.";
		}
		
		/*
		 * After passing all checks above
		 * We can create a user and add to the database
		 * NOTE: If id == null, we will store it as "NA"
		 */
		if (id == null) id = "NA";
		User user = UserFactory.generateUser(type, email, pwd, id);
		database.addUserToDatabase(user);
		
		return "SUCCESS";
	}
	
	/*
	 * Helper methods
	 */
	private boolean isValidEmail(String email) {
		return email.contains("@") && email.contains(".");
	}
	
	private boolean isValidPwd(String pwd) {
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>?/]).{8,}$";
		return pwd.matches(regex);
	}
	
	private boolean isValidID(String id, ManagerAccount manager) {
		// Visitors don't need an id
		if (id == null) return true;
		
		// If not, then let the manager verify the ID
		return manager.verifyUser(id);
	}
	
}
