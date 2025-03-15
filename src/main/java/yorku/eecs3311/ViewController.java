package yorku.eecs3311;

public class ViewController {
	private ViewMain mainView;
	
	public ViewController() {
		mainView = new ViewMain(this);
		
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
}
