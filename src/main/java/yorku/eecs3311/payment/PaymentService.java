package yorku.eecs3311.payment;

public class PaymentService {
	private PaymentStrategy _strategy;
	public PaymentService(PaymentStrategy strategy) {
		this._strategy = strategy;
	}
	
	public void setStrategy(PaymentStrategy strategy) {
		this._strategy = strategy;
	}
	
	public boolean pay(double amount) {
		return this._strategy.pay(amount);
	}
}
