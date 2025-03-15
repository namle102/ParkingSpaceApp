package yorku.eecs3311.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import yorku.eecs3311.ParkingSpacePublisher;


public class ParkingObserverTest {
	ParkingSpacePublisher publisher = new ParkingSpacePublisher();
	TestParkingObserver observer = new TestParkingObserver(publisher);
	TestParkingObserver observer2 = new TestParkingObserver(publisher);
	@Test
	public void test() {
		publisher.notifyAllObservers();
		assertTrue(observer.checkIfUpdated());
		assertTrue(observer2.checkIfUpdated());
	}

}
