package yorku.eecs3311.payment;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CreditCardTest {

    @Test
    public void testPayWithValidAmount() {
        CreditCard creditCard = new CreditCard();
        assertTrue(creditCard.pay(100.0));
    }

    @Test
    public void testPayWithZeroAmount() {
        CreditCard creditCard = new CreditCard();
        assertTrue(creditCard.pay(0.0));
    }

    @Test
    public void testPayWithNegativeAmount() {
        CreditCard creditCard = new CreditCard();
        assertTrue(creditCard.pay(-50.0));
    }

    @Test
    public void testRefundWithValidAmount() {
        CreditCard creditCard = new CreditCard();
        assertTrue(creditCard.refund(100.0));
    }

    @Test
    public void testRefundWithZeroAmount() {
        CreditCard creditCard = new CreditCard();
        assertTrue(creditCard.refund(0.0));
    }

    @Test
    public void testRefundWithNegativeAmount() {
        CreditCard creditCard = new CreditCard();
        assertTrue(creditCard.refund(-50.0));
    }
}
