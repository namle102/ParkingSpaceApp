package yorku.eecs3311.tests;

import yorku.eecs3311.ParkingSpaceObserver;
import yorku.eecs3311.ParkingSpacePublisher;

class TestParkingObserver extends ParkingSpaceObserver {

	private boolean _hasUpdated;
	
	public TestParkingObserver(ParkingSpacePublisher subject) {
		this.subject = subject;
		this.subject.attachObserver(this);
	}
	
	@Override
	public void update() {
		_hasUpdated = true;
		
	}
	
	public boolean checkIfUpdated() {
		return _hasUpdated;
	}

}
