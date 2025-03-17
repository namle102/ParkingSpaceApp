package yorku.eecs3311;

public interface Subject {
	void addSubscriber(Subscriber sub);
	void removeSubscriber(Subscriber sub);
	void notifySubscribers();
}
