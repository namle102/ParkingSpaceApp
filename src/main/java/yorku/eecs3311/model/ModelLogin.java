package yorku.eecs3311.model;

import yorku.eecs3311.Database;

public class ModelLogin {
	
	public boolean validateUser(String email, String pwd) {
		return Database.getInstance().isCredentialsMatched(email, pwd);
	}
	
}
