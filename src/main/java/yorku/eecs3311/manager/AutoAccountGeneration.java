package yorku.eecs3311.manager;

import java.util.Random;
import yorku.eecs3311.Database;

public class AutoAccountGeneration {
	
	private Database database;
	
	public AutoAccountGeneration() {
		database = Database.getInstance();
	}
	
	// Generate account manager and add to the database
	public ManagerAccount generateManagerAccount() {
		ManagerAccount manager = new ManagerAccount(generateUsername(), generatePwd());
		
		database.addManagerToDatabase(manager);
		System.out.println("[+] Manager account generated successfully: " + manager.getUsername());
		
		return manager;
	}
	
	// Generate random name
	private String generateUsername() {
		StringBuilder username = new StringBuilder();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Random rand = new Random();
		
		for (int i=0; i<5; i++) {
			char randChar = alphabet.charAt(rand.nextInt(alphabet.length()));
			username.append(randChar);
		}
		
		return username.toString();
	}
	
	// Generate random password
	private String generatePwd() {
		StringBuilder pwd = new StringBuilder();
		String hex = "0123456789abcdef";
		Random rand = new Random();
		
		for (int i=0; i<5; i++) {
			char randChar = hex.charAt(rand.nextInt(hex.length()));
			pwd.append(randChar);
		}
		
		return pwd.toString();
	}
	
}