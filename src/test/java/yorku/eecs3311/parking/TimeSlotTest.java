package yorku.eecs3311.parking;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeSlotTest {

    private TimeSlot slot;

    @Before
    public void setUp() {
        slot = new TimeSlot("10:00");
    }

    @Test
    public void testConstructorInitializesTime() {
        assertEquals("10:00", slot.getTime());
    }

    @Test
    public void testConstructorInitializesAvailabilityToTrue() {
        assertTrue(slot.isAvailable());
    }

    @Test
    public void testSetBookedTrue() {
        slot.setBooked(true);
        assertFalse(slot.isAvailable());
    }

    @Test
    public void testSetBookedFalse() {
        slot.setBooked(true);
        slot.setBooked(false);
        assertTrue(slot.isAvailable());
    }

    @Test
    public void testSetAvailableFalse() {
        slot.setAvailable(false);
        assertFalse(slot.isAvailable());
    }

    @Test
    public void testSetAvailableTrue() {
        slot.setAvailable(false);
        slot.setAvailable(true);
        assertTrue(slot.isAvailable());
    }

    @Test
    public void testToStringWhenAvailable() {
        assertEquals("10:00 (Available)", slot.toString());
    }

    @Test
    public void testToStringWhenBooked() {
        slot.setBooked(true);
        assertEquals("10:00 (Booked)", slot.toString());
    }

    @Test
    public void testToggleBookedBackAndForth() {
        slot.setBooked(true);
        assertFalse(slot.isAvailable());
        slot.setBooked(false);
        assertTrue(slot.isAvailable());
    }

    @Test
    public void testToggleAvailableDirectly() {
        slot.setAvailable(false);
        assertFalse(slot.isAvailable());
        slot.setAvailable(true);
        assertTrue(slot.isAvailable());
    }
}
