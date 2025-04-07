package yorku.eecs3311.user;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class VisitorTest {

    @Test
    public void testVisitorConstructorEmail() {
        Visitor visitor = new Visitor("guest@yorku.ca", "guestpass", "v001");
        assertEquals("guest@yorku.ca", visitor.getEmail());
    }

    @Test
    public void testVisitorConstructorPassword() {
        Visitor visitor = new Visitor("guest@yorku.ca", "guestpass", "v001");
        assertEquals("guestpass", visitor.getPwd());
    }

    @Test
    public void testVisitorConstructorId() {
        Visitor visitor = new Visitor("guest@yorku.ca", "guestpass", "v001");
        assertEquals("v001", visitor.getId());
    }

    @Test
    public void testVisitorRate() {
        Visitor visitor = new Visitor("guest@yorku.ca", "guestpass", "v001");
        double expectedRate = yorku.eecs3311.parking.ParkingRate.VISITOR.getValue();
        assertEquals(expectedRate, visitor.getRate(), 0.0001);
    }

    @Test
    public void testVisitorSetRate() {
        Visitor visitor = new Visitor("guest@yorku.ca", "guestpass", "v001");
        double newRate = 5.0;
        visitor.setRate(newRate);
        assertEquals(newRate, visitor.getRate(), 0.0001);
    }

    @Test
    public void testVisitorToString() {
        Visitor visitor = new Visitor("guest@yorku.ca", "guestpass", "v001");
        String expectedString = "User [email=guest@yorku.ca, pwd=guestpass, id=v001, rate=" + yorku.eecs3311.parking.ParkingRate.VISITOR.getValue() + "]";
        assertEquals(expectedString, visitor.toString());
    }
}
