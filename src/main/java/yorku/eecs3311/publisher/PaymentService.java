package yorku.eecs3311.publisher;

import yorku.eecs3311.Publisher;
import yorku.eecs3311.payment.PaymentStrategy;

public class PaymentService extends Publisher {
	private PaymentStrategy _strategy;
	public double amountExchanged;
	public PaymentService(PaymentStrategy strategy) {
		this._strategy = strategy;
	}
	
	public void setStrategy(PaymentStrategy strategy) {
		this._strategy = strategy;
	}
	
	public void pay(double amount) {
		if(this._strategy.pay(amount)) {
			amountExchanged = amount;
			this.notifyAllObservers();
		}
	}
	
	public void refund(double amount) {
		if(this._strategy.refund(amount)) {
			amountExchanged = -amount;
			this.notifyAllObservers();
		}
	}
}
