package yorku.eecs3311.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test01");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        java.lang.Class<?> wildcardClass1 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test02");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        java.lang.Class<?> wildcardClass1 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test04");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test05");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test06");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) '4');
        java.lang.Class<?> wildcardClass7 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test07");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test08");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        java.lang.Class<?> wildcardClass1 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test09");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test10");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test11");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        java.lang.Class<?> wildcardClass3 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test12");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test13");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.refund((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test14");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.refund((double) (short) 1);
        boolean boolean6 = mobilePayment0.refund(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test15");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (short) 0);
        boolean boolean4 = mobilePayment0.refund((double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test16");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test17");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) (byte) 0);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test18");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test19");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test20");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test21");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test22");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) (-1.0f));
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.refund((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test23");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) (short) 0);
        boolean boolean4 = debitCard0.refund((double) 100);
        java.lang.Class<?> wildcardClass5 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test24");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.pay((double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test25");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay((double) 1.0f);
        boolean boolean8 = mobilePayment0.pay((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test26");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test27");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        boolean boolean6 = creditCard0.refund((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test28");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test29");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test30");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) (-1.0f));
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay((double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }
}

