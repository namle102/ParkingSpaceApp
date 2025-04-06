package yorku.eecs3311.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import yorku.eecs3311.parking.ParkingSpace;

public class LoggedInUserTest {

    @Test
    public void testLoggedInUserConstructorEmail() {
        LoggedInUser loggedInUser = new LoggedInUser("user@yorku.ca", "userpass", "u001", 10.0);
        assertEquals("user@yorku.ca", loggedInUser.getEmail());
    }

    @Test
    public void testLoggedInUserConstructorPassword() {
        LoggedInUser loggedInUser = new LoggedInUser("user@yorku.ca", "userpass", "u001", 10.0);
        assertEquals("userpass", loggedInUser.getPwd());
    }

    @Test
    public void testLoggedInUserConstructorId() {
        LoggedInUser loggedInUser = new LoggedInUser("user@yorku.ca", "userpass", "u001", 10.0);
        assertEquals("u001", loggedInUser.getId());
    }

    @Test
    public void testLoggedInUserConstructorRate() {
        LoggedInUser loggedInUser = new LoggedInUser("user@yorku.ca", "userpass", "u001", 10.0);
        assertEquals(10.0, loggedInUser.getRate(), 0.0001);
    }

    @Test
    public void testGetAvailableSpacesEmptyInitially() {
        LoggedInUser loggedInUser = new LoggedInUser("user@yorku.ca", "userpass", "u001", 10.0);
        assertTrue(loggedInUser.getAvailableSpaces().isEmpty());
    }

    @Test
    public void testUpdateAvailableSpacesWithNonEmptyList() {
        LoggedInUser loggedInUser = new LoggedInUser("user@yorku.ca", "userpass", "u001", 10.0);
        List<ParkingSpace> newSpaces = List.of(new ParkingSpace(1, "Lot A"), new ParkingSpace(2, "Lot B"));
        
        loggedInUser.update(newSpaces);

        assertEquals(2, loggedInUser.getAvailableSpaces().size());
        assertEquals(newSpaces, loggedInUser.getAvailableSpaces());
    }

    @Test
    public void testUpdateWithEmptyList() {
        LoggedInUser loggedInUser = new LoggedInUser("user@yorku.ca", "userpass", "u001", 10.0);

        loggedInUser.update(new ArrayList<>());
        assertTrue(loggedInUser.getAvailableSpaces().isEmpty());
    }
}