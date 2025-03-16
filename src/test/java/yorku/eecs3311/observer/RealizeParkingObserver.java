package yorku.eecs3311.observer;

import yorku.eecs3311.Observer;
import yorku.eecs3311.AvailableParkingPublisher;

class RealizeParkingObserver extends Observer {

	private boolean _hasUpdated = false;
	
	public RealizeParkingObserver(AvailableParkingPublisher subject) {
		super(subject);
	}
	
	@Override
	public void update() {
		_hasUpdated = true;
	}
	
	public boolean checkIfUpdated() {
		return _hasUpdated;
	}

}
