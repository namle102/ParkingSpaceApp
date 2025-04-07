package yorku.eecs3311.booking;

import static org.junit.Assert.*;
import org.junit.Test;


public class BookingBuilderTest {

    @Test
    public void testSetBookingID() {
        Booking booking = new BookingBuilder().setBookingID(101).build();
        assertEquals(101, booking.getBookingID());
    }

    @Test
    public void testSetLotName() {
        Booking booking = new BookingBuilder().setLotName("Lot A").build();
        assertEquals("Lot A", booking.getLotName());
    }

    @Test
    public void testSetSpaceID() {
        Booking booking = new BookingBuilder().setSpaceID(5).build();
        assertEquals(5, booking.getSpaceID());
    }

    @Test
    public void testSetDate() {
        Booking booking = new BookingBuilder().setDate("2025-04-06").build();
        assertEquals("2025-04-06", booking.getDate());
    }

    @Test
    public void testSetStartHour() {
        Booking booking = new BookingBuilder().setStartHour(10).build();
        assertEquals(10, booking.getStartHour());
    }

    @Test
    public void testSetDuration() {
        Booking booking = new BookingBuilder().setDur(2).build();
        assertEquals(2, booking.getDur());
    }

    @Test
    public void testSetPaymentMethod() {
        Booking booking = new BookingBuilder().setPaymentMethod("Credit Card").build();
        assertEquals("Credit Card", booking.getPaymentMethod());
    }

    @Test
    public void testSetDeposit() {
        Booking booking = new BookingBuilder().setDeposit(50.0).build();
        assertEquals(50.0, booking.getDeposit(), 0.001);
    }

    @Test
    public void testSetEmail() {
        Booking booking = new BookingBuilder().setEmail("test@example.com").build();
        assertEquals("test@example.com", booking.getEmail());
    }

    @Test
    public void testBooleans() {
        Booking booking = new BookingBuilder()
                .isExtended(true)
                .isCancelled(true)
                .isCheckedOut(false)
                .build();
        assertTrue(booking.isExtended());
        assertTrue(booking.isCancelled());
        assertFalse(booking.isCheckedOut());
    }

    @Test
    public void testMethodChaining() {
        BookingBuilder builder = new BookingBuilder()
                .setBookingID(123)
                .setLotName("Lot X")
                .setSpaceID(7);
        assertNotNull(builder);
    }
}

