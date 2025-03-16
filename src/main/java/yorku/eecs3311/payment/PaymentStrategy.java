package yorku.eecs3311.payment;

public abstract class PaymentStrategy {
	public abstract boolean pay(double amount);
	public abstract boolean refund(double amount);
}
