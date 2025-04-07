package yorku.eecs3311.payment;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DebitCardTest {

    @Test
    public void testPayWithValidAmount() {
        DebitCard debitCard = new DebitCard();
        assertTrue(debitCard.pay(100.0));
    }

    @Test
    public void testPayWithZeroAmount() {
        DebitCard debitCard = new DebitCard();
        assertTrue(debitCard.pay(0.0));
    }

    @Test
    public void testPayWithNegativeAmount() {
        DebitCard debitCard = new DebitCard();
        assertTrue(debitCard.pay(-50.0));
    }

    @Test
    public void testRefundWithValidAmount() {
        DebitCard debitCard = new DebitCard();
        assertTrue(debitCard.refund(100.0));
    }

    @Test
    public void testRefundWithZeroAmount() {
        DebitCard debitCard = new DebitCard();
        assertTrue(debitCard.refund(0.0));
    }

    @Test
    public void testRefundWithNegativeAmount() {
        DebitCard debitCard = new DebitCard();
        assertTrue(debitCard.refund(-50.0));
    }
}