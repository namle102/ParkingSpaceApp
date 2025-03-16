package yorku.eecs3311;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;

import yorku.eecs3311.manager.ManagerAccount;
import yorku.eecs3311.user.User;

public class Database {
	
	private static Database instance;
	private static final String IDS_FILE = "src/main/resources/ids.csv";
	private static final String USERS_FILE = "src/main/resources/users.csv";
	private static final String MANAGERS_FILE = "src/main/resources/managers.csv";
	private Set<String> registeredEmails;
	private Set<String> validUserIDs;
	
	private Database() {
		registeredEmails = new HashSet<>();
		validUserIDs = new HashSet<>();
		loadEmailsFromFile();
		loadValidUserIDsFromFile();
	}
	
	// Singleton pattern
	public static synchronized Database getInstance() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}
	
	// Load email into memory for quick lookup
	public void loadEmailsFromFile() {
		try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE))) {
				
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				if (data.length > 1) {
					registeredEmails.add(data[0].trim());
				}
			}
				
		} catch (Exception e) {
			System.out.println("[-] Failed to load emails: " + e.getMessage());
		}
	}
	
	// Load user IDs along with their type into memory for quick lookup
	public void loadValidUserIDsFromFile() {
		try (BufferedReader reader = new BufferedReader(new FileReader(IDS_FILE))) {
			
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				if (data.length == 2) {
					validUserIDs.add(data[1].trim());
				}
			}
			
		} catch (Exception e) {
			System.out.println("[-] Failed reading valid IDs: " + e.getMessage());
		}
	}
	
	// Check if email is already registered (uses cache)
	public boolean isEmailRegistered(String email) {
		return registeredEmails.contains(email);
	}
	
	// Check if user ID exists with the correct type (uses cache)
	public boolean isValidUserID(String id) {
		return validUserIDs.contains(id);
	}
	
	// Add user to the database
	public void addUserToDatabase(User user) {
		String email = user.getEmail();
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(USERS_FILE, true))) {
			
			writer.newLine();
			writer.write(user.getEmail() + "," + user.getPwd() + "," + user.getId() + "," + user.getRate());
			
			// Update cache
			registeredEmails.add(email);
		
		} catch (Exception e) {
			System.out.println("[-] Failed adding user: " + e.getMessage());
		}
	}
	
	// Add manager to the database
	public void addManagerToDatabase(ManagerAccount manager) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(MANAGERS_FILE, true))) {
			
			writer.newLine();
			writer.write(manager.getUsername() + "," + manager.getPwd());
		
		} catch (Exception e) {
			System.out.println("[-] Failed adding manager: " + e.getMessage());
		}
	}
	
	// Retrieve any existing Manager from the file (first one found) to verify user
	public ManagerAccount getAnyManagerAccount() {
	    try (BufferedReader reader = new BufferedReader(new FileReader(MANAGERS_FILE))) {
	        
	    	String line;
	        while ((line = reader.readLine()) != null) {
	            String[] data = line.split(",");
	            if (data.length == 2) {
	                return new ManagerAccount(data[0].trim(), data[1].trim());
	            }
	        }
	    } catch (Exception e) {
	        System.err.println("[-] Failed retrieving a manager account: " + e.getMessage());
	    }
	    
	    return null;
	}
	
}
