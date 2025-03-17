package yorku.eecs3311;

import yorku.eecs3311.controller.ViewController;
import yorku.eecs3311.manager.ManagerAccount;
import yorku.eecs3311.manager.SuperManager;

public class Main {

	public static void main(String[] args) {
		setup();
		ViewController.getInstance();
	}
	
	private static void setup() {
		SuperManager superManager = SuperManager.getInstance();
		ManagerAccount manager1 = superManager.generateManagerAccount();
	}

}
