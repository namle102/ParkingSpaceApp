package yorku.eecs3311;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Database {
	private static Database instance;
	private static final String IDS_FILE = "src/main/resources/ids.csv";
	private static final String USERS_FILE = "src/main/resources/users.csv";
	private static final String MANAGERS_FILE = "src/main/resources/managers.csv";
	
	private Database() {}
	
	// Singleton pattern
	public static synchronized Database getInstance() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}
	
	// Check if email already registered
	public static boolean isEmailRegistered(String email) {
		try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE))) {
				
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				if (data.length > 1 && data[0].trim().equalsIgnoreCase(email)) {
					return true;
				}
			}
				
		} catch (Exception e) {
			System.out.println("[-] Failed checking email: " + e.getMessage());
		}
		
		return false;
	}
	
	// Check if a user's id exists in the system
	public static boolean isValidUserID(String id) {
		try (BufferedReader reader = new BufferedReader(new FileReader(IDS_FILE))) {
			
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				if (data.length == 2 && data[1].trim().equalsIgnoreCase(id)) {
					return true;
				}
			}
			
		} catch (Exception e) {
			System.out.println("[-] Failed reading valid IDs: " + e.getMessage());
		}
		
		return false;
	}
	
	// Add user to the database
	public static void addUserToDatabase(User user) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(USERS_FILE, true))) {
			
			writer.newLine();
			writer.write(user.getEmail() + "," + user.getPwd());
		
		} catch (Exception e) {
			System.out.println("[-] Failed adding user: " + e.getMessage());
		}
	}
	
	// Add manager to the database
	public static void addManagerToDatabase(ManagerAccount manager) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(MANAGERS_FILE, true))) {
			
			writer.newLine();
			writer.write(manager.getUsername() + "," + manager.getPwd());
		
		} catch (Exception e) {
			System.out.println("[-] Failed adding manager: " + e.getMessage());
		}
	}
}
