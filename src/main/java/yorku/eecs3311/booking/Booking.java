package yorku.eecs3311.booking;

public class Booking {

	private int bookingID;
	private String lotName;
	private int spaceID;
	private int startHour;
	private int dur;
	
	public Booking(int bookingID, String lotName, int spaceID, int startHour, int dur) {
		this.bookingID = bookingID;
		this.lotName = lotName;
		this.spaceID = spaceID;
		this.startHour = startHour;
		this.dur = dur;
	}
	
	// Getters
	public int getBookingID() { return bookingID; }
	public String getLotName() { return lotName; }
	public int getSpaceID() { return spaceID; }
	public int getStartHour() { return startHour; }
	public int getDur() { return dur; }

}
