package yorku.eecs3311;

public abstract class Observer {
	public abstract void update();
	protected Publisher subject;
	public Observer(Publisher subject) {
		this.subject = subject;
		this.subject.attachObserver(this);
	}
}
