package yorku.eecs3311.model;

import java.sql.DatabaseMetaData;
import java.util.List;

import yorku.eecs3311.Database;
import yorku.eecs3311.booking.Booking;

public class ModelPayment {
	
	private Database database = Database.getInstance();

	// Get un-cancelled un-checkedout bookings by email
	public List<Booking> getUCUCBookingsByEmail(String email) {
		return database.getUCUCBookingsByEmail(email);
	}
	
}
