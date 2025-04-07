package yorku.eecs3311.payment;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MobilePaymentTest {

    @Test
    public void testPayWithValidAmount() {
        MobilePayment mobilePayment = new MobilePayment();
        assertTrue(mobilePayment.pay(100.0));
    }

    @Test
    public void testPayWithZeroAmount() {
        MobilePayment mobilePayment = new MobilePayment();
        assertTrue(mobilePayment.pay(0.0));
    }

    @Test
    public void testPayWithNegativeAmount() {
        MobilePayment mobilePayment = new MobilePayment();
        assertTrue(mobilePayment.pay(-50.0));
    }

    @Test
    public void testRefundWithValidAmount() {
        MobilePayment mobilePayment = new MobilePayment();
        assertTrue(mobilePayment.refund(100.0));
    }

    @Test
    public void testRefundWithZeroAmount() {
        MobilePayment mobilePayment = new MobilePayment();
        assertTrue(mobilePayment.refund(0.0));
    }

    @Test
    public void testRefundWithNegativeAmount() {
        MobilePayment mobilePayment = new MobilePayment();
        assertTrue(mobilePayment.refund(-50.0));
    }
}
