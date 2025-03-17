package yorku.eecs3311.controller;

import java.util.List;

import yorku.eecs3311.manager.ManagerAccount;
import yorku.eecs3311.model.ModelLogin;
import yorku.eecs3311.model.ModelRegistration;
import yorku.eecs3311.parking.ParkingSpace;
import yorku.eecs3311.user.LoggedInUser;

public class ViewController {
	
	private static ViewController instance = null;
	private ViewMain mainView;
	private ModelRegistration registrationModel;
	private ModelLogin loginModel;
	private LoggedInUser loggedInUser = null;
	
	private ViewController() {
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
	
	public static synchronized ViewController getInstance() {
		if (instance == null) {
			instance = new ViewController();
		}
		return instance;
	}
	
	public void setLoggedInUser(LoggedInUser loggedInUser) {
		this.loggedInUser = loggedInUser;
		this.loggedInUser.update(ManagerAccount.getAvailableSpaces());
	    System.out.println("[DEBUG] User Logged In. Available Spaces: " + this.loggedInUser.getAvailableSpaces().size());
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
	
	public void showBookingView() {
	    if (loggedInUser != null) {
	        List<ParkingSpace> availableSpaces = loggedInUser.getAvailableSpaces();
	        System.out.println("[DEBUG] Available Spaces for User: " + availableSpaces.size());

	        ViewBooking bookingView = new ViewBooking(this, availableSpaces);
	        mainView.addView("booking", bookingView);
	        mainView.showView("booking");
	    }
	}
	
	// Call Model Registration to handle
	public String registerUser(String type, String email, String pwd, String id) {
		return registrationModel.registerUser(type, email, pwd, id);
	}
	
	// Call Model Login to handle
	public boolean validateLogin(String email, String pwd) {
		if (loginModel.validateUser(email, pwd, this)) {
			System.out.println("Logged in user: " + loggedInUser);
			return true;
		}
		return false;
	}
	
}
