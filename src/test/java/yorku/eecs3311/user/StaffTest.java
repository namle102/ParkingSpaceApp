package yorku.eecs3311.user;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class StaffTest {

    @Test
    public void testStaffConstructorEmail() {
        Staff staff = new Staff("staff@yorku.ca", "securepass", "staff001");
        assertEquals("staff@yorku.ca", staff.getEmail());
    }

    @Test
    public void testStaffConstructorPassword() {
        Staff staff = new Staff("staff@yorku.ca", "securepass", "staff001");
        assertEquals("securepass", staff.getPwd());
    }

    @Test
    public void testStaffConstructorId() {
        Staff staff = new Staff("staff@yorku.ca", "securepass", "staff001");
        assertEquals("staff001", staff.getId());
    }

    @Test
    public void testStaffRate() {
        Staff staff = new Staff("staff@yorku.ca", "securepass", "staff001");
        double expectedRate = yorku.eecs3311.parking.ParkingRate.STAFF.getValue();
        assertEquals(expectedRate, staff.getRate(), 0.0001);
    }

    @Test
    public void testStaffSetRate() {
        Staff staff = new Staff("staff@yorku.ca", "securepass", "staff001");
        double newRate = 10.0;
        staff.setRate(newRate);
        assertEquals(newRate, staff.getRate(), 0.0001);
    }

    @Test
    public void testStaffToString() {
        Staff staff = new Staff("staff@yorku.ca", "securepass", "staff001");
        String expectedString = "User [email=staff@yorku.ca, pwd=securepass, id=staff001, rate=" + yorku.eecs3311.parking.ParkingRate.STAFF.getValue() + "]";
        assertEquals(expectedString, staff.toString());
    }
}
