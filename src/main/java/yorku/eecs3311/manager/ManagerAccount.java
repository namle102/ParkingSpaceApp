package yorku.eecs3311.manager;

import java.util.ArrayList;
import java.util.List;

import yorku.eecs3311.Subject;
import yorku.eecs3311.Subscriber;
import yorku.eecs3311.Database;
import yorku.eecs3311.parking.ParkingLot;
import yorku.eecs3311.parking.ParkingSpace;

public class ManagerAccount implements Subject {
	
	private String username;
	private String pwd;
	
	// Managing a list of static parking lots
	private static List<ParkingLot> lots = new ArrayList<>();
	private static List<ParkingSpace> availableSpaces = new ArrayList<>(); // IMPORTANT
	private static List<Subscriber> subscribers = new ArrayList<>();
	
	// Used by Auto Account Generation by the Super Manager direction
	public ManagerAccount(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}
	
	// THIS LIST WILL BE USED TO UPDATE SUBSCRIBERS
	public void updateAvailableSpaces() {
		availableSpaces.clear();
		
		for (ParkingLot lot : lots) {
			if (lot.isEnabled()) {
				availableSpaces.addAll(lot.getSpaces());
			}
		}
		
		System.out.println("[+] Updated available spaces: " + availableSpaces.size());
	}
	
	// Add a parking lot
	public void addLot(String lotName) {
	    for (ParkingLot lot : lots) {
	        if (lot.getLotName().equalsIgnoreCase(lotName)) {
	            System.out.println("[-] Lot already exists: " + lotName);
	            return;
	        }
	    }
	    lots.add(new ParkingLot(lotName));
	    updateAvailableSpaces();
	    notifySubscribers();
	    System.out.println("[+] Parking lot added: " + lotName);
	}
	
	// Enable or disable a parking lot
	public void setLotStatus(String lotName, boolean enabled) {
	    for (ParkingLot lot : lots) {
	        if (lot.getLotName().equalsIgnoreCase(lotName)) {
	            if (enabled) {
	                lot.enable();
	                System.out.println("[+] Enabled lot: " + lotName);
	            } else {
	                lot.disable();
	                System.out.println("[-] Disabled lot: " + lotName);
	            }
	            updateAvailableSpaces();
	            notifySubscribers();
	            return;
	        }
	    }
	    System.out.println("[-] Lot not found: " + lotName);
	}
	
	// Enable or disable a parking space
	public void setSpaceStatus(String lotName, int spaceID, boolean enabled) {
		for (ParkingLot lot : lots) {
            if (lot.getLotName().equalsIgnoreCase(lotName)) {
                if (enabled) {
                    lot.enableSpace(spaceID);
                    System.out.println("[+] Enabled space: " + lotName + "-" + spaceID);
                } else {
                    lot.disableSpace(spaceID);
                    System.out.println("[-] Disabled space: " + lotName + "-" + spaceID);
                }
                updateAvailableSpaces();
                return;
            }
        }
        System.out.println("[-] Lot not found: " + lotName);
    }
	
	// Getters
	public String getUsername() { return username; }
	public String getPwd() { return pwd; }
	public static List<ParkingLot> getLots() {
		return lots;
	}
	public static List<ParkingSpace> getAvailableSpaces() {
	    return availableSpaces;
	}
	
	// Verify user if they are either Student, Faculty or Staff
		public boolean verifyUser(String id) {
			return Database.getInstance().isValidUserID(id);
		}

	@Override
	public String toString() {
		return "ManagerAccount [username=" + username + ", pwd=" + pwd + "]";
	}

	@Override
	public void addSubscriber(Subscriber sub) {
		subscribers.add(sub);
	}

	@Override
	public void removeSubscriber(Subscriber sub) {
		subscribers.remove(sub);
	}

	@Override
	public void notifySubscribers() {
		for (Subscriber sub : subscribers) {
			sub.update(availableSpaces);
		}
	}
	
}
