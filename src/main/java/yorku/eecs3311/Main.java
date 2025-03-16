package yorku.eecs3311;

import java.awt.Color;
import java.awt.Image;

import javax.lang.model.element.NestingKind;
import javax.swing.*;

import yorku.eecs3311.controller.ViewController;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * TEST GUI
		 * TEST GUI
		 * TEST GUI
		 */
		new ViewController();
		
		/*
		 * TEST SuperManager
		 * TEST AutoAccountGeneration
		 * TEST ManagerAccount
		 * TEST Adding manager accounts into the database for later login
		 */
//		SuperManager superManager = SuperManager.getInstance();
//		
//		superManager.generateManagerAccount();
//		superManager.generateManagerAccount();
//		superManager.generateManagerAccount();
//		superManager.showManagerAccounts();
		
		/*
		 * TEST User registration with
		 * -- invalid email
		 * -- invalid pwd
		 * -- invalid ID
		 * -- duplicate
		 */
//		User nam = UserFactory.generateUser("student", "nam@yorku.ca", "aSSWW11@@", "s111");
//		System.out.println(nam);
//		
//		User ping = UserFactory.generateUser("faculty", "ping@yorku.ca", "asasWW#777", "f222");
//		System.out.println(ping);
//		
//		User john = UserFactory.generateUser("visitor", "john@hotmail.com", "ws23**sSS", null);
//		System.out.println(john);
//		
//		User wrongIdUser = UserFactory.generateUser("staff", "ssss@hot.ca", "aasAA@D1((", "t222");
//		System.out.println(wrongIdUser);
		
		// Test Adding User to Database
//		User nam = UserFactory.generateUser("student", "nam13@yorku.ca", "aQQ11@@", "s2222");
//		System.out.println(nam);
		
		/*
		 * TEST Java GUI - JFrame
		 * TEST AppView
		 */
//		AppView appView = new AppView();
		
		/*
		 * TEST Java GUI - JPanel
		 */
//		JPanel rP = new JPanel();
//		rP.setBackground(Color.red);
//		rP.setBounds(0, 0, 250, 250);
//		
//		JPanel bP = new JPanel();
//		bP.setBackground(Color.blue);
//		bP.setBounds(250, 0, 250, 250);
//		
//		JFrame f = new JFrame();
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setLayout(null);
//		f.setSize(750, 750);
//		f.setVisible(true);
//		// add panels
//		f.add(rP);
//		f.add(bP);

	}

}
