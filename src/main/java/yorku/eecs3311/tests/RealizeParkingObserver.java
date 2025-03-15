package yorku.eecs3311.tests;

import yorku.eecs3311.AvailableParkingObserver;
import yorku.eecs3311.AvailableParkingPublisher;

class RealizeParkingObserver extends AvailableParkingObserver {

	private boolean _hasUpdated;
	
	public RealizeParkingObserver(AvailableParkingPublisher subject) {
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
