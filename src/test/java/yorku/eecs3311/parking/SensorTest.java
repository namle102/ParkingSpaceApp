package yorku.eecs3311.parking;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SensorTest {
	
	private Sensor sensor;

    @Before
    public void setUp() {
        sensor = new Sensor();
    }

    @Test
    public void testInitialIsCarParkedFalse() {
        assertFalse(sensor.isCarParked());
    }

    @Test
    public void testInitialCarInfoEmpty() {
        sensor.sendCarInfo(); // just prints to console, nothing to assert
    }

    @Test
    public void testScanCarInfoUpdatesState() {
        Car car = new Car("Toyota", "Camry", "ABC123");
        sensor.scanCarInfo(car);
        assertTrue(sensor.isCarParked());
    }

    @Test
    public void testClearCarInfoResetsState() {
        Car car = new Car("Honda", "Civic", "XYZ789");
        sensor.scanCarInfo(car);
        sensor.clearCarInfo();
        assertFalse(sensor.isCarParked());
    }

    @Test
    public void testScanThenClear() {
        Car car = new Car("Ford", "Focus", "111AAA");
        sensor.scanCarInfo(car);
        assertTrue(sensor.isCarParked());
        sensor.clearCarInfo();
        assertFalse(sensor.isCarParked());
    }

    @Test
    public void testSendCarInfoAfterScan() {
        Car car = new Car("Mazda", "3", "ZZZ999");
        sensor.scanCarInfo(car);
        sensor.sendCarInfo(); // just prints
    }

    @Test
    public void testMultipleScans() {
        Car car1 = new Car("A", "B", "C");
        sensor.scanCarInfo(car1);
        assertTrue(sensor.isCarParked());

        Car car2 = new Car("X", "Y", "Z");
        sensor.scanCarInfo(car2);
        assertTrue(sensor.isCarParked());
    }

    @Test
    public void testScanCarInfoTwiceKeepsLatest() {
        Car car1 = new Car("Make1", "Model1", "Plate1");
        sensor.scanCarInfo(car1);

        Car car2 = new Car("Make2", "Model2", "Plate2");
        sensor.scanCarInfo(car2);

        // Just triggers the print with the latest values
        sensor.sendCarInfo();
    }

    @Test
    public void testScanNullCarThrowsNPE() {
        try {
            sensor.scanCarInfo(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testSendCarInfoAfterClear() {
        Car car = new Car("Kia", "Soul", "333KKK");
        sensor.scanCarInfo(car);
        sensor.clearCarInfo();
        sensor.sendCarInfo(); // should show blanks
    }
	
}
