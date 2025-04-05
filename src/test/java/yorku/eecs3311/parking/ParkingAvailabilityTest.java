package yorku.eecs3311.parking;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.Assert.*;

public class ParkingAvailabilityTest {
	
	ParkingAvailability availability;
    LocalDate today;

    @Before
    public void setUp() {
        availability = new ParkingAvailability();
        today = LocalDate.now();
    }

    @Test
    public void testSlotsExistForToday() {
        assertFalse(availability.getSlotsForDate(today).isEmpty());
    }

    @Test
    public void testSlotsExistForTomorrow() {
        LocalDate tomorrow = today.plusDays(1);
        assertFalse(availability.getSlotsForDate(tomorrow).isEmpty());
    }

    @Test
    public void testSlotsAreEmptyForInvalidDate() {
        LocalDate future = today.plusDays(10);
        assertTrue(availability.getSlotsForDate(future).isEmpty());
    }

    @Test
    public void testEachDayHas15Slots() {
        List<TimeSlot> slots = availability.getSlotsForDate(today);
        assertEquals(15, slots.size());
    }

    @Test
    public void testBookOneSlot() {
        LocalDate date = today.plusDays(1);
        List<String> times = Arrays.asList("9:00");
        assertTrue(availability.bookSlots(date, times));
    }

    @Test
    public void testBookedSlotIsNotAvailable() {
        LocalDate date = today.plusDays(2);
        availability.bookSlots(date, Arrays.asList("10:00"));

        List<TimeSlot> slots = availability.getSlotsForDate(date);
        for (TimeSlot slot : slots) {
            if (slot.getTime().equals("10:00")) {
                assertFalse(slot.isAvailable());
            }
        }
    }

    @Test
    public void testBookMultipleSlots() {
        LocalDate date = today.plusDays(3);
        List<String> times = Arrays.asList("7:00", "8:00", "9:00");
        assertTrue(availability.bookSlots(date, times));
    }

    @Test
    public void testBookInvalidTimeReturnsTrueButDoesNothing() {
        LocalDate date = today.plusDays(4);
        assertTrue(availability.bookSlots(date, Arrays.asList("25:00")));
    }

    @Test
    public void testBookSlotsInvalidDateReturnsFalse() {
        LocalDate invalidDate = today.plusDays(10);
        assertFalse(availability.bookSlots(invalidDate, Arrays.asList("9:00")));
    }

    @Test
    public void testBookEmptyTimeList() {
        LocalDate date = today.plusDays(5);
        assertTrue(availability.bookSlots(date, new ArrayList<String>()));
    }
	
}
