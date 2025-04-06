package yorku.eecs3311.parking;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class ParkingSpaceTest {
	
	ParkingSpace space;
	Map<String, List<TimeSlot>> expected;
	
	@Before
	public void setUp() {
		space = new ParkingSpace(1, "A");
		expected = new HashMap<>();
		
		for (int i = 0; i < 5; i++) {
            String date = LocalDate.now().plusDays(i).toString();
            List<TimeSlot> slots = new ArrayList<>();
            
            for (int hour = 8; hour < 18; hour++) {
                slots.add(new TimeSlot(hour + ":00"));
            }
            
            expected.put(date, slots);
        }
	}
	
	@Test
	public void testIsEnabled() {
		assertTrue(space.isEnabled());
	}
	
	@Test
	public void testGetSpaceLocation() {
		assertEquals("A1", space.getSpaceLocation());
	}
	
	@Test
	public void testGetSpaceID() {
		assertEquals(1, space.getSpaceID());
	}
	
	@Test
	public void testGetSensor() {
		assertNotNull(space.getSensor());
	}
	
	@Test
	public void testIsCarParked() {
		assertFalse(space.isCarParked());
	}
	
	@Test
	public void testEnable() {
		space.enable();
		assertTrue(space.isEnabled());
	}
	
	@Test
	public void testDisable() {
		space.disable();
		assertFalse(space.isEnabled());
	}
	
	@Test
	public void testGetAvailableDates() {
		assertTrue(space.getAvailableDates().containsAll(expected.keySet()));
	}
	
	@Test
	public void testGetSlotsForDate() {
	    String date = LocalDate.now().plusDays(1).toString();

	    List<String> expectedStr = expected.get(date).stream()
	        .map(Object::toString)
	        .collect(Collectors.toList());

	    List<String> actualStr = space.getSlotsForDate(date).stream()
	        .map(Object::toString)
	        .collect(Collectors.toList());

	    assertEquals(expectedStr, actualStr);
	}
	
	@Test
	public void testGetSlotsForDateNull() {
		String date = LocalDate.now().plusDays(1).toString();
		space.disable();
		
		assertEquals(new ArrayList<>(), space.getSlotsForDate(date));
	}
	
	@Test
	public void testBookAndReleaseSlots() {
		String date = LocalDate.now().plusDays(1).toString();
		List<String> times = new ArrayList<>();
		times.add("8:00");
		times.add("9:00");
		
		// Book slots
		space.bookSlots(date, times);
		assertFalse(space.bookSlots(date, times));
		
		// Release slots
		space.releaseSlots(date, times);
		assertTrue(space.bookSlots(date, times));
	}
	
	@Test
	public void testBookSlotsWithSpaceDisabled() {
		space.disable();
		String date = LocalDate.now().plusDays(1).toString();
		List<String> times = new ArrayList<>();
		times.add("8:00");
		times.add("9:00");
		
		assertFalse(space.bookSlots(date, times));
	}
	
	@Test
	public void testBookSlotsWithSlotsNull() {
		String date = LocalDate.now().plusDays(10).toString();
		List<String> times = new ArrayList<>();
		times.add("8:00");
		times.add("9:00");
		
		assertFalse(space.bookSlots(date, times));
	}
	
	@Test
	public void testToString() {
		String expected = "Space ID: 1 (A1) - Enabled";
		assertEquals(expected, space.toString());
	}
	
	@Test
	public void testToStringDisable() {
		space.disable();
		String expected = "Space ID: 1 (A1) - Disabled";
		assertEquals(expected, space.toString());
	}
	
}
