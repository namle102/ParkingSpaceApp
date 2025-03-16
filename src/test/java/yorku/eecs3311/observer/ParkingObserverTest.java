package yorku.eecs3311.observer;

import static org.junit.Assert.*;

import org.junit.Test;

import yorku.eecs3311.AvailableParkingPublisher;


public class ParkingObserverTest {
	AvailableParkingPublisher publisher = new AvailableParkingPublisher();
	RealizeParkingObserver observer = new RealizeParkingObserver(publisher);
	RealizeParkingObserver observer2 = new RealizeParkingObserver(publisher);
	@Test
	public void notify_test() {
		publisher.notifyAllObservers();
		assertTrue(observer.checkIfUpdated());
		assertTrue(observer2.checkIfUpdated());
	}

}
