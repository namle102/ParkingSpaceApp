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
	public ManagerAccount generateManagerAccount() {
		ManagerAccount managerAccount = autoAccGen.generateManagerAccount();
		managers.add(managerAccount);
		
		// Assign lots and spaces when a manager is created
		if (ManagerAccount.getLots().isEmpty()) { 
	        managerAccount.addLot("A");  
	        managerAccount.addLot("B");  
	        managerAccount.setLotStatus("A", true); 
	        managerAccount.setLotStatus("B", true); 
	    }
		
		managerAccount.updateAvailableSpaces();
	    managerAccount.notifySubscribers();
		
		return managerAccount;
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
