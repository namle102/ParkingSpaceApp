package yorku.eecs3311;

import java.util.*;

import yorku.eecs3311.parking.ParkingLot;
import yorku.eecs3311.parking.ParkingSpace;
import yorku.eecs3311.parking.TimeSlot;
import yorku.eecs3311.user.LoggedInUser;

public class Booking {

	private final ParkingSpace space;
    private final String date;
    private final List<String> timeSlots;
    private final LoggedInUser user;
    private static final List<Booking> allBookings = new ArrayList<>();

    public Booking(ParkingSpace space, String date, List<String> timeSlots, LoggedInUser user) {
        this.space = space;
        this.date = date;
        this.timeSlots = timeSlots;
        this.user = user;
    }

    // Find first available space and create a booking
    public static Booking createBooking(ParkingLot lot, String date, List<String> timeSlots, LoggedInUser user) {
        for (ParkingSpace space : lot.getSpaces()) {
            if (space.bookSlots(date, timeSlots)) {
                Booking newBooking = new Booking(space, date, timeSlots, user);
                allBookings.add(newBooking);
                System.out.println("[+] Booking confirmed: " + newBooking);
                return newBooking;
            }
        }
        System.out.println("[-] No available spaces in " + lot.getLotName() + " at this time.");
        return null;
    }

    @Override
    public String toString() {
        return "Booking: " + space.getSpaceLocation() + " on " + date + " for " + timeSlots;
    }

}
