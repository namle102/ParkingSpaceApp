package yorku.eecs3311.controller;

import yorku.eecs3311.model.ModelLogin;
import yorku.eecs3311.model.ModelRegistration;

public class ViewController {
	
	private ViewMain mainView;
	private ModelRegistration registrationModel;
	private ModelLogin loginModel;
	
	public ViewController() {
		mainView = new ViewMain(this);
		registrationModel = new ModelRegistration();
		loginModel = new ModelLogin();
		
		// Create and add views
		ViewHero heroView = new ViewHero(this);
		ViewRegistration registrationView = new ViewRegistration(this);
		ViewLogin loginView = new ViewLogin(this);
		ViewDashboard dashboardView = new ViewDashboard(this);
		
		
		mainView.addView("hero", heroView);
		mainView.addView("registration", registrationView);
		mainView.addView("login", loginView);
		mainView.addView("dashboard", dashboardView);
		mainView.setVisible(true);
		
		// Start on Hero view
		mainView.showView("hero");
	}
	
	public void showHeroView() {
		mainView.showView("hero");
	}
	
	public void showRegistrationView() {
		mainView.showView("registration");
	}
	
	public void showLoginView() {
		mainView.showView("login");
	}
	
	public void showDashboardView() {
		mainView.showView("dashboard");
	}
	
	// Call Model Registration to handle
	public String registerUser(String type, String email, String pwd, String id) {
		return registrationModel.registerUser(type, email, pwd, id);
	}
	
	// Call Model Login to handle
	public boolean validateLogin(String email, String pwd) {
		return loginModel.validateUser(email, pwd);
	}
	
}
