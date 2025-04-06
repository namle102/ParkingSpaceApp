package yorku.eecs3311.payment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PaymentStrategyTest {

    // Inner class implementing PaymentStrategy for testing purposes
    private class TestPaymentStrategy extends PaymentStrategy {

        @Override
        public boolean pay(double amount) {
            System.out.printf("\n[+] Paid %.2f using TestPaymentStrategy!", amount);
            return amount > 0;
        }

        @Override
        public boolean refund(double amount) {
            System.out.printf("\n[+] Refunded %.2f using TestPaymentStrategy!", amount);
            return amount >= 0;
        }
    }

    @Test
    public void testPayWithValidAmount() {
        PaymentStrategy paymentStrategy = new TestPaymentStrategy();
        assertTrue(paymentStrategy.pay(100.0)); 
    }

    @Test
    public void testPayWithZeroAmount() {
        PaymentStrategy paymentStrategy = new TestPaymentStrategy();
        assertFalse(paymentStrategy.pay(0.0)); 
    }

    @Test
    public void testPayWithNegativeAmount() {
        PaymentStrategy paymentStrategy = new TestPaymentStrategy();
        assertFalse(paymentStrategy.pay(-50.0)); 
    }

    @Test
    public void testRefundWithValidAmount() {
        PaymentStrategy paymentStrategy = new TestPaymentStrategy();
        assertTrue(paymentStrategy.refund(100.0)); 
    }

    @Test
    public void testRefundWithZeroAmount() {
        PaymentStrategy paymentStrategy = new TestPaymentStrategy();
        assertTrue(paymentStrategy.refund(0.0)); 
    }

    @Test
    public void testRefundWithNegativeAmount() {
        PaymentStrategy paymentStrategy = new TestPaymentStrategy();
        assertFalse(paymentStrategy.refund(-50.0)); 
    }
}