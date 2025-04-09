package yorku.eecs3311.booking;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import yorku.eecs3311.parking.*;
import java.time.LocalDate;


import java.util.*;

public class BookingTest {
    Booking booking;
    ParkingSpace mockSpace;

    @Before
    public void setUp() {
        // Match today's date or any within the next 4 days (as initialized by ParkingSpace)
        String testDate = LocalDate.now().toString(); // adjust if needed
        booking = new Booking(1, "LotA", 101, testDate, 9, 2, "CreditCard", 10.0, "test@yorku.ca", false, false, false);
        mockSpace = new ParkingSpace(101, "LotA");

        // Mark slots from 11:00 to 12:00 as available manually (since they may already exist)
        List<TimeSlot> slots = mockSpace.getSlotsForDate(testDate);
        for (TimeSlot slot : slots) {
            if (slot.getTime().equals("11:00") || slot.getTime().equals("12:00")) {
                slot.setAvailable(true);
            }
        }
    }

    @Test
    public void testConstructorAndGetters() {
        booking = new Booking(1, "LotA", 101, "2025-04-06", 9, 2, "CreditCard", 10.0, "test@yorku.ca", false, false, false);

        assertEquals(1, booking.getBookingID());
        assertEquals("LotA", booking.getLotName());
        assertEquals(101, booking.getSpaceID());
        assertEquals("2025-04-06", booking.getDate());
        assertEquals(9, booking.getStartHour());
        assertEquals(2, booking.getDur());
        assertEquals("CreditCard", booking.getPaymentMethod());
        assertEquals(10.0, booking.getDeposit(), 0.001);
        assertEquals("test@yorku.ca", booking.getEmail());
    }

    @Test
    public void testCancel() {
        booking.cancel();
        assertTrue(booking.isCancelled());
    }

    @Test
    public void testCheckout() {
        booking.checkout();
        assertTrue(booking.isCheckedOut());
    }

    @Test
    public void testCalculateFinalChargeCancelled() {
        booking.cancel();
        assertEquals(-10.0, booking.calculateFinalCharge(), 0.001);
    }

    @Test
    public void testCalculateFinalChargeCheckedOut() {
        booking.checkout();
        assertEquals(10.0, booking.calculateFinalCharge(), 0.001); // 10*2 - 10
    }

    @Test
    public void testSetFinalAmountCharged() {
        booking.setFinalAmountCharged(25.5);
        assertEquals(25.5, booking.getFinalAmountCharged(), 0.001);
    }

//    @Test
//    public void testCanExtendTrue() {
//        assertTrue(booking.canExtend(2, "2025-04-06", mockSpace));
//    }

//    @Test
//    public void testExtendSuccess() {
//        boolean extended = booking.extend(2, "2025-04-06", mockSpace);
//        assertTrue(extended);
//        assertEquals(4, booking.getDur()); // original was 2, now 4
//        assertTrue(booking.isExtended());
//    }

    @Test
    public void testToStringNotEmpty() {
        String str = booking.toString();
        assertTrue(str.contains("Booking [bookingID=1"));
    }
    
    @Test
    public void testCalculateFinalCharge() {
        Booking booking = new Booking(1, "LotA", 101, "2025-04-06", 9, 2, "CreditCard", 10.0, "test@yorku.ca", false, false, true); // checked out
        booking.setFinalAmountCharged(booking.calculateFinalCharge());
        assertEquals(10.0, booking.getFinalAmountCharged(), 0.001); // (10 * 2) - 10
    }


    @Test
    public void testCancelMethod() {
        Booking booking = new Booking(2, "LotB", 102, "2025-04-06", 10, 1, "Cash", 15.0, "cancel@yorku.ca", false, false, false);
        booking.cancel();
        assertTrue(booking.isCancelled());
    }

    @Test
    public void testCheckoutMethod() {
        Booking booking = new Booking(3, "LotC", 103, "2025-04-06", 11, 3, "Debit", 8.0, "checkout@yorku.ca", false, false, false);
        booking.checkout();
        assertTrue(booking.isCheckedOut());
    }

    @Test
    public void testExtendSuccess() {
        ParkingSpace space = new ParkingSpace(104, "LotD");

        // Use today's date from space initialization
        String today = LocalDate.now().toString();
        List<TimeSlot> slots = space.getSlotsForDate(today);

        // Mark 12:00 and 13:00 as available
        slots.stream().filter(slot -> slot.getTime().equals("12:00") || slot.getTime().equals("13:00"))
                      .forEach(slot -> slot.setAvailable(true));

        Booking booking = new Booking(4, "LotD", 104, today, 10, 2, "CreditCard", 10.0, "extend@yorku.ca", false, false, false);

        boolean extended = booking.extend(2, today, space); // extending by 2 hours
        assertTrue(extended);
        assertTrue(booking.isExtended());
        assertEquals(4, booking.getDur()); // original 2 + extended 2
    }

    @Test
    public void testExtendFailureDueToUnavailableSlots() {
        ParkingSpace space = new ParkingSpace(105, "LotE");

        String today = LocalDate.now().toString();
        List<TimeSlot> slots = space.getSlotsForDate(today);

        // Make all slots unavailable (already booked)
        slots.forEach(slot -> slot.setBooked(true));

        Booking booking = new Booking(5, "LotE", 105, today, 10, 2, "CreditCard", 10.0, "fail@yorku.ca", false, false, false);

        boolean extended = booking.extend(2, today, space);
        assertFalse(extended);
        assertFalse(booking.isExtended());
        assertEquals(2, booking.getDur()); // still original duration
    }

    @Test
    public void testCanExtendTrue() {
        ParkingSpace space = new ParkingSpace(106, "LotF");

        String today = LocalDate.now().toString();
        List<TimeSlot> slots = space.getSlotsForDate(today);

        // Make 12:00 and 13:00 available
        slots.stream().filter(slot -> slot.getTime().equals("12:00") || slot.getTime().equals("13:00"))
                      .forEach(slot -> slot.setAvailable(true));

        Booking booking = new Booking(6, "LotF", 106, today, 10, 2, "CreditCard", 10.0, "canextend@yorku.ca", false, false, false);

        boolean canExtend = booking.canExtend(2, today, space);
        assertTrue(canExtend);
    }

    @Test
    public void testCanExtendFalse() {
        ParkingSpace space = new ParkingSpace(107, "LotG");

        String today = LocalDate.now().toString();
        List<TimeSlot> slots = space.getSlotsForDate(today);

        // Make all slots booked
        slots.forEach(slot -> slot.setBooked(true));

        Booking booking = new Booking(7, "LotG", 107, today, 10, 2, "CreditCard", 10.0, "noextend@yorku.ca", false, false, false);

        boolean canExtend = booking.canExtend(2, today, space);
        assertFalse(canExtend);
    }

    @Test
    public void testSetAndGetFinalAmountCharged() {
        Booking booking = new Booking(8, "LotH", 108, "2025-04-06", 9, 1, "CreditCard", 12.0, "amount@yorku.ca", false, false, false);
        booking.setFinalAmountCharged(24.0);
        assertEquals(24.0, booking.getFinalAmountCharged(), 0.001);
    }

    @Test
    public void testGetDeposit() {
        Booking booking = new Booking(9, "LotI", 109, "2025-04-06", 10, 1, "CreditCard", 14.0, "deposit@yorku.ca", false, false, false);
        assertEquals(14.0, booking.getDeposit(), 0.001); // Deposit is just a field
    }


    @Test
    public void testIsCheckedOut() {
        Booking booking = new Booking(10, "LotJ", 110, "2025-04-06", 11, 1, "CreditCard", 10.0, "check@yorku.ca", false, false, false);
        assertFalse(booking.isCheckedOut());
        booking.checkout();
        assertTrue(booking.isCheckedOut());
    }

    @Test
    public void testIsExtendedFlagInitiallyFalse() {
        Booking booking = new Booking(11, "LotK", 111, "2025-04-06", 8, 1, "CreditCard", 10.0, "flag@yorku.ca", false, false, false);
        assertFalse(booking.isExtended());
    }

}
