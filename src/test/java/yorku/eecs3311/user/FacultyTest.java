package yorku.eecs3311.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.*;
import yorku.eecs3311.parking.ParkingRate;

public class FacultyTest {
	
	@Test
	public void testConstructor() {
		Faculty f = new Faculty("f@yorku.ca", "pass123", "FAC1001");
		assertNotNull(f);
	}
	
	@Test
	public void testGetEmail() {
		Faculty f = new Faculty("f@yorku.ca", "pass123", "FAC1001");
		assertEquals("f@yorku.ca", f.getEmail());
	}
	
	@Test
    public void testGetPassword() {
        Faculty f = new Faculty("f@yorku.ca", "pass123", "FAC1001");
        assertEquals("pass123", f.getPwd());
    }

    @Test
    public void testGetId() {
        Faculty f = new Faculty("f@yorku.ca", "pass123", "FAC1001");
        assertEquals("FAC1001", f.getId());
    }

    @Test
    public void testRateIsSetCorrectly() {
        Faculty f = new Faculty("f@yorku.ca", "pass123", "FAC1001");
        assertEquals(ParkingRate.FACULTY.getValue(), f.getRate(), 0.0001);
    }
    
    @Test
    public void testFacultyRate_IsPositive() {
        Faculty f = new Faculty("rate@yorku.ca", "pass", "F999");
        assertTrue(f.getRate() > 0);
    }

    @Test
    public void testDifferentFacultyUsers_AreIndependent() {
        Faculty f1 = new Faculty("a@yorku.ca", "a123", "F001");
        Faculty f2 = new Faculty("b@yorku.ca", "b123", "F002");
        assertNotEquals(f1.getEmail(), f2.getEmail());
    }
    
    @Test
    public void testEmailIsStoredVerbatim() {
        Faculty f = new Faculty("Faculty.One@YorkU.CA", "somePass", "F123");
        assertEquals("Faculty.One@YorkU.CA", f.getEmail());
    }

    @Test
    public void testEmptyPassword() {
        Faculty f = new Faculty("x@yorku.ca", "", "F123");
        assertEquals("", f.getPwd());
    }

    @Test
    public void testEmptyEmail() {
        Faculty f = new Faculty("", "pass", "F999");
        assertEquals("", f.getEmail());
    }
	
}
