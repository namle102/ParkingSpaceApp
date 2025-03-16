package yorku.eecs3311.manager;

import yorku.eecs3311.Database;

public class ManagerAccount {
	
	private String username;
	private String pwd;
	
	public ManagerAccount(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}
	
	// Perform further validation
	public boolean verifyUser(String id) {
		Database database = Database.getInstance();
		return database.isValidUserID(id);
	}
	
	public String getUsername() {
		return username;
	}

	public String getPwd() {
		return pwd;
	}

	@Override
	public String toString() {
		return "ManagerAccount [username=" + username + ", pwd=" + pwd + "]";
	}
	
}
