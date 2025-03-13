package yorku.eecs3311;

import java.util.Random;

public class AutoAccountGeneration {
	public static ManagerAccount generateManagerAccount() {
		ManagerAccount manager;
		manager = new ManagerAccount(generateUsername(), generatePwd());
		
		// Add newly created manager to the database
		Database.addManagerToDatabase(manager);
		System.out.println("[+] Manager account generated successfully: " + manager.getUsername());
		
		return manager;
	}
	
	private static String generateUsername() {
		StringBuilder username = new StringBuilder();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Random rand = new Random();
		
		for (int i=0; i<5; i++) {
			char randChar = alphabet.charAt(rand.nextInt(alphabet.length()));
			username.append(randChar);
		}
		
		return username.toString();
	}
	
	private static String generatePwd() {
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