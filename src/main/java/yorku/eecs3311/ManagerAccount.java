package yorku.eecs3311;

public class ManagerAccount {
	private String username;
	private String pwd;
	
	public ManagerAccount(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}
	
	// perform further validation for user type: student, faculty and staff
	public static boolean verifyUser(String id) {
		Database database = Database.getInstance();
		return database.isValidUserID(id);
	}
	
	// getters
	public String getUsername() {
		return username;
	}

	public String getPwd() {
		return pwd;
	}
}
