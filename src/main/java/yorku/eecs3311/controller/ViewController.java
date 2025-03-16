package yorku.eecs3311.controller;

import yorku.eecs3311.model.ModelRegistration;

public class ViewController {
	
	private ViewMain mainView;
	private ModelRegistration registrationModel;
	
	public ViewController() {
		mainView = new ViewMain(this);
		registrationModel = new ModelRegistration();
		
		// create and add views
		ViewHero heroView = new ViewHero(this);
		ViewRegistration registrationView = new ViewRegistration(this);
		
		mainView.addView("hero", heroView);
		mainView.addView("registration", registrationView);
		mainView.setVisible(true);
		
		// start on Hero view
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
	
	// Call the User Model to handle
	public String registerUser(String type, String email, String pwd, String id) {
		return registrationModel.registerUser(type, email, pwd, id);
	}
	
}
