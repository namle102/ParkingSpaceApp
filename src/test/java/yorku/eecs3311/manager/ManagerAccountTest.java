package yorku.eecs3311.manager;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import yorku.eecs3311.Subscriber;
import yorku.eecs3311.parking.ParkingLot;
import yorku.eecs3311.parking.ParkingSpace;
import java.util.Random;

class SubcriberRealize implements Subscriber{
	
	boolean isUpdated = false;
	
	public SubcriberRealize() {
		
	}
	
	@Override
	public void update(List<ParkingSpace> availableSpaces) {
		isUpdated = true;
		
	}
	
}

public class ManagerAccountTest {
	private ByteArrayOutputStream outContent = null;
 	private final PrintStream originalOut = System.out;
 	private final PrintStream originalErr = System.err;

 	Random rand = new Random();
 	public String get_std_out() {
 		return outContent.toString().replace("\n", "").replace("\r", "");
 	}
 	
 	@Before
 	public void setupTest() {
		redirectStream();
 	}
 	
 	public void redirectStream() {
 		outContent = new ByteArrayOutputStream();
 	    System.setOut(new PrintStream(outContent));
 	}
 	
	@Test
 	public void addLotTest() {
		
		String lotName = Integer.toString(rand.nextInt());

	 	ManagerAccount manager = new ManagerAccount("","");
		
		manager.addLot(lotName);
 
		assertTrue(get_std_out().contains("[+] Parking Lot Added: " + lotName));
 		
	}
	
	@Test
 	public void addDuplicateLotTest() {
		
		String lotName = "Lot2";
		
	 	ManagerAccount manager = new ManagerAccount("","");
	 	
	 	manager.addLot(lotName);
		
		manager.addLot(lotName);
		
		assertTrue(get_std_out().contains("[-] Lot Already Exists: " + lotName));
 		
	}
	
	@Test
	public void getLotsTest() {
	 	ManagerAccount manager = new ManagerAccount("","");
		
		List<ParkingLot> lots = ManagerAccount.getLots();
		
		ArrayList<String> lotExpect = new ArrayList<String>();
		
		lotExpect.add("A");
		lotExpect.add("B");
		
		for(int i = 0; i < 2; i++) {
			assertEquals(lotExpect.get(i), lots.get(i).getLotName());
			manager.addLot("Lot"+String.valueOf(i));
		}
	}
	
	@Test
	public void disableLotTest() {
	 	ManagerAccount manager = new ManagerAccount("","");
	 	
	 	ParkingLot lot = ManagerAccount.getLotByName("A");
	 	
	 	manager.enableLot("A");
	 	
	 	assertEquals( true,lot.isEnabled());
		
	 	manager.disableLot("A");
	 	
	 	assertEquals(false,lot.isEnabled());
	 	
	}
	
	@Test
	public void enableLotTest() {
	 	ManagerAccount manager = new ManagerAccount("","");
	 	
	 	List<ParkingLot> lots = ManagerAccount.getLots();
		
	 	manager.disableLot("A");
	 	
	 	assertEquals(false,lots.get(0).isEnabled());
		
	 	manager.enableLot("A");
	 	
	 	assertEquals(true,lots.get(0).isEnabled());
	 	
	}
	
	@Test
	public void getLotByNameTest() {	 	
	 	ParkingLot lot = ManagerAccount.getLotByName("A");
	 	
	 	assertNotNull(lot);

	 	lot = ManagerAccount.getLotByName("Z");
	 	
	 	assertNull(lot);
	}
	
	@Test
	public void disableSpaceTest() {
		ManagerAccount manager = new ManagerAccount("","");
		manager.enableSpace("A",1);
		List<ParkingSpace> spaces = ManagerAccount.getAvailableSpaces();
		ParkingSpace space = spaces.get(0);
		
		manager.enableSpace("A",1);
		manager.disableSpace("A",1);
		
		assertEquals( false,space.isEnabled());
		
	}
	
	@Test
	public void enableSpaceTest() {
		List<ParkingSpace> spaces = ManagerAccount.getAvailableSpaces();
		
		ParkingSpace space = spaces.get(0);
		
		ManagerAccount manager = new ManagerAccount("","");
		
		manager.disableSpace("A",space.getSpaceID());
		
		assertEquals(false,space.isEnabled());
		
		manager.enableSpace("A",space.getSpaceID());
		
		assertEquals(true,space.isEnabled());
		
	}
	
	@Test
	public void toStringTest() {
		String username = "username1";
		String pwd = "password1";
		ManagerAccount manager = new ManagerAccount(username, pwd);
		assertEquals("ManagerAccount [username=" + username + ", pwd=" + pwd + "]",manager.toString());
	}
	

	@Test
	public void getUsernameTest() {
		String username = "username1";
		String pwd = "password1";
		ManagerAccount manager = new ManagerAccount(username, pwd);
		assertEquals(username,manager.getUsername());
	}
	

	@Test
	public void getPasswordTest() {
		String username = "username1";
		String pwd = "password1";
		ManagerAccount manager = new ManagerAccount(username, pwd);
		assertEquals(pwd,manager.getPwd());
	}
	
	@Test
	public void notifySubscriberTest()
	{
		SubcriberRealize sub = new SubcriberRealize();
		
		assertEquals(false, sub.isUpdated);
		
		ManagerAccount.addSubscriber(sub);
		
		ManagerAccount.notifySubscribers();
		
		assertEquals(true, sub.isUpdated);
		
	}
	

	@Test
	public void removeSubscriberTest()
	{
		SubcriberRealize sub = new SubcriberRealize();
		
		ManagerAccount.addSubscriber(sub);
		
		ManagerAccount.removeSubscriber(sub);
		
		ManagerAccount.notifySubscribers();
		
		assertEquals(false, sub.isUpdated);
		
	}
	
	@Test
	public void showAvailableSpacesTest() {
	    ManagerAccount manager = new ManagerAccount("", "");

	    redirectStream();  // Capture output
	    manager.showAvailableSpaces();
	    
	    String output = get_std_out();
	    
	    // Just check it contains the summary line
	    assertTrue(output.contains("[+] Total Available Spaces:"));
	}
 	
	@After
 	public void restoreStreams() {
		System.out.flush();
 	    System.setOut(originalOut);
 	    System.setErr(originalErr);
 	}
	
	
}
