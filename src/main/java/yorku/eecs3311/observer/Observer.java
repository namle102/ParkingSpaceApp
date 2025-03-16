package yorku.eecs3311.observer;

import yorku.eecs3311.Publisher;

public abstract class Observer {
	public abstract void update();
	protected Publisher subject;
	public Observer(Publisher subject) {
		this.subject = subject;
		this.subject.attachObserver(this);
	}
}
