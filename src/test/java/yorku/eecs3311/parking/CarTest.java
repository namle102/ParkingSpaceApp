package yorku.eecs3311.parking;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    private Car car;

    @Before
    public void setUp() {
        car = new Car("Honda", "Civic", "DEF456");
    }

    @Test
    public void testCarConstructor() {
        assertEquals("Honda", car.getMake());
        assertEquals("Civic", car.getModel());
        assertEquals("DEF456", car.getPlateNumber());
    }

    @Test
    public void testPark() {
        ParkingSpace mockSpace = new ParkingSpace(1, "LotA");
        car.park(mockSpace);
        assertTrue(mockSpace.getSensor().isCarParked());
    }

    @Test
    public void testUnpark() {
        ParkingSpace mockSpace = new ParkingSpace(1, "LotA");
        car.park(mockSpace);
        car.unpark(mockSpace);
        assertFalse(mockSpace.getSensor().isCarParked());
    }

    @Test
    public void testGetMake() {
        assertEquals("Honda", car.getMake());
    }

    @Test
    public void testSetMake() {
        car.setMake("Toyota");
        assertEquals("Toyota", car.getMake());
    }

    @Test
    public void testGetModel() {
        assertEquals("Civic", car.getModel());
    }

    @Test
    public void testSetModel() {
        car.setModel("Corolla");
        assertEquals("Corolla", car.getModel());
    }

    @Test
    public void testGetPlateNumber() {
        assertEquals("DEF456", car.getPlateNumber());
    }

    @Test
    public void testSetPlateNumber() {
        car.setPlateNumber("XYZ789");
        assertEquals("XYZ789", car.getPlateNumber());
    }

    @Test
    public void testToString() {
        String expected = "Car [make=Honda, model=Civic, plateNumber=DEF456]";
        assertEquals(expected, car.toString());
    }
}

