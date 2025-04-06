package yorku.eecs3311.parking;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {

	ParkingLot lot;
	List<ParkingSpace> expectedSpaces;
	
	@Before
	public void setUp() {
		lot = new ParkingLot("A");
		expectedSpaces = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
            ParkingSpace space = new ParkingSpace(i, "A");
            expectedSpaces.add(space);
        }
	}
	
	@Test
	public void testIsEnabled() {
		assertTrue(lot.isEnabled());
	}
	
	@Test
	public void testGetLotName() {
		assertEquals("A", lot.getLotName());
	}
	
	@Test
	public void testGetSpaces() {
	    List<String> expected = expectedSpaces.stream()
	        .map(ParkingSpace::toString)
	        .collect(Collectors.toList());

	    List<String> actual = lot.getSpaces().stream()
	        .map(ParkingSpace::toString)
	        .collect(Collectors.toList());

	    assertTrue(actual.containsAll(expected));
	}
	
	@Test
	public void testGetSpaceById() {
		int expected = 1;
		ParkingSpace space = lot.getSpaceById(1);
		assertEquals(expected, space.getSpaceID());
	}
	
	@Test
	public void testGetSpaceByIdNull() {
		assertNull(lot.getSpaceById(11));
	}
	
	@Test
	public void testEnable() {
		lot.enable();
		assertTrue(lot.isEnabled());
	}
	
	@Test
	public void testDisable() {
		lot.disable();
		assertFalse(lot.isEnabled());
	}
	
	@Test
	public void testEnableSpace() {
		lot.enableSpace(1);
		ParkingSpace space = lot.getSpaceById(1);
		assertTrue(space.isEnabled());
	}
	
	@Test
	public void testDisableSpace() {
		lot.disableSpace(1);
		ParkingSpace space = lot.getSpaceById(1);
		assertFalse(space.isEnabled());
	}
	
}
