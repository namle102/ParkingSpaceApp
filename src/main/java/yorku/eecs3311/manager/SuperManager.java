package yorku.eecs3311.manager;

import java.util.ArrayList;
import java.util.List;

public class SuperManager {
	
	private static SuperManager instance;
	private AutoAccountGeneration autoAccGen;
	private List<ManagerAccount> managers;
	
	private SuperManager() {
		autoAccGen = new AutoAccountGeneration();
		managers = new ArrayList<>();
	}
	
	// Singleton pattern
	public static synchronized SuperManager getInstance() {
		if (instance == null) {
			instance = new SuperManager();
		}
		return instance;
	}
	
	// Generate manager account for management teams
	public void generateManagerAccount() {
		ManagerAccount managerAccount = autoAccGen.generateManagerAccount();
		managers.add(managerAccount);
	}
	
	// Print manager accounts
	public void showManagerAccounts() {
		System.out.println("\n========== Manager Accounts ==========\n");
		for (ManagerAccount mAcc : managers) {
			System.out.println("Username: " + mAcc.getUsername() + " | Password: " + mAcc.getPwd() + "\n");
		}
		System.out.println("======================================\n");
	}
	
}
