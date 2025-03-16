package yorku.eecs3311;

import java.util.ArrayList;
import java.util.List;

import yorku.eecs3311.observer.Observer;

public abstract class Publisher {
	private List<Observer> _observers = new ArrayList<Observer>();
	
	public void attachObserver(Observer observer) {
		this._observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		this._observers.remove(observer);
	}
	
	public void notifyAllObservers() {
		for(Observer observer: _observers) {
			observer.update();
		}
	}
}
