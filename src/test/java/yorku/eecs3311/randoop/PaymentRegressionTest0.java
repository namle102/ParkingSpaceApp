package yorku.eecs3311.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test001");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        java.lang.Class<?> wildcardClass1 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test002");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        java.lang.Class<?> wildcardClass1 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test005");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        java.lang.Class<?> wildcardClass1 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test006");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        java.lang.Class<?> wildcardClass3 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test008");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) (byte) 1);
        java.lang.Class<?> wildcardClass5 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test009");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 10);
        java.lang.Class<?> wildcardClass5 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test010");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) (short) 0);
        java.lang.Class<?> wildcardClass3 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test011");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay((double) 1.0f);
        boolean boolean8 = mobilePayment0.pay((double) (short) -1);
        java.lang.Class<?> wildcardClass9 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test012");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.refund((double) 0);
        boolean boolean4 = debitCard0.refund((double) 0.0f);
        boolean boolean6 = debitCard0.pay((double) '#');
        java.lang.Class<?> wildcardClass7 = debitCard0.getClass();
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test013");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(10.0d);
        boolean boolean6 = mobilePayment0.pay((double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test014");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((-1.0d));
        boolean boolean6 = debitCard0.pay((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test015");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(10.0d);
        java.lang.Class<?> wildcardClass5 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test016");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (short) 0);
        boolean boolean4 = mobilePayment0.refund((double) 1L);
        boolean boolean6 = mobilePayment0.refund((double) 1);
        boolean boolean8 = mobilePayment0.pay(10.0d);
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test017");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.pay((double) (byte) -1);
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test018");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) (-1.0f));
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.refund((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test019");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.pay(0.0d);
        java.lang.Class<?> wildcardClass9 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test020");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((-1.0d));
        java.lang.Class<?> wildcardClass5 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test021");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((-1.0d));
        boolean boolean4 = debitCard0.pay((double) 1);
        java.lang.Class<?> wildcardClass5 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test022");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.refund((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test023");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((-1.0d));
        boolean boolean4 = debitCard0.refund((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test024");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) 0.0f);
        boolean boolean14 = debitCard0.refund(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test025");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.pay((double) 0L);
        boolean boolean6 = mobilePayment0.refund((double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test026");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.pay((double) 0L);
        boolean boolean6 = mobilePayment0.pay((double) 0L);
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test027");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 'a');
        java.lang.Class<?> wildcardClass5 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test028");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test029");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.refund((double) (short) 1);
        boolean boolean6 = mobilePayment0.refund((double) (short) -1);
        java.lang.Class<?> wildcardClass7 = mobilePayment0.getClass();
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test030");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.refund((double) (short) 1);
        boolean boolean6 = mobilePayment0.refund(0.0d);
        boolean boolean8 = mobilePayment0.refund((double) (short) 10);
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test031");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay((double) 1.0f);
        boolean boolean8 = mobilePayment0.pay((double) (short) -1);
        boolean boolean10 = mobilePayment0.pay((double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test032");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) 'a');
        boolean boolean6 = mobilePayment0.pay((double) 100.0f);
        boolean boolean8 = mobilePayment0.pay(1.0d);
        java.lang.Class<?> wildcardClass9 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test033");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.refund((double) (short) 1);
        boolean boolean6 = mobilePayment0.refund((double) (short) -1);
        boolean boolean8 = mobilePayment0.refund(100.0d);
        java.lang.Class<?> wildcardClass9 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test034");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        boolean boolean6 = creditCard0.refund((double) (short) 10);
        boolean boolean8 = creditCard0.pay((double) 1L);
        java.lang.Class<?> wildcardClass9 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test035");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test036");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (-1L));
        boolean boolean4 = mobilePayment0.refund((double) 'a');
        boolean boolean6 = mobilePayment0.refund((double) 'a');
        boolean boolean8 = mobilePayment0.pay((double) 0.0f);
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test037");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) 'a');
        java.lang.Class<?> wildcardClass5 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test038");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.pay((double) 0L);
        boolean boolean6 = mobilePayment0.pay((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test039");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund(1.0d);
        boolean boolean4 = creditCard0.refund((double) 1);
        boolean boolean6 = creditCard0.refund((double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test040");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) (byte) -1);
        boolean boolean6 = mobilePayment0.pay((double) (short) 10);
        java.lang.Class<?> wildcardClass7 = mobilePayment0.getClass();
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test041");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) (-1.0f));
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay((double) (byte) 0);
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test042");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.pay((double) 0L);
        boolean boolean6 = mobilePayment0.pay((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test043");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay((double) 1.0f);
        boolean boolean8 = mobilePayment0.pay((double) (short) -1);
        boolean boolean10 = mobilePayment0.refund((double) '4');
        boolean boolean12 = mobilePayment0.refund((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test044");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (-1L));
        boolean boolean4 = mobilePayment0.refund((double) 'a');
        boolean boolean6 = mobilePayment0.refund((double) 'a');
        boolean boolean8 = mobilePayment0.refund((double) 1L);
        boolean boolean10 = mobilePayment0.pay((double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test045");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay((double) 1.0f);
        boolean boolean8 = mobilePayment0.pay((double) (short) -1);
        boolean boolean10 = mobilePayment0.refund((double) '4');
        boolean boolean12 = mobilePayment0.refund((double) 0);
        boolean boolean14 = mobilePayment0.pay((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test046");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund(1.0d);
        java.lang.Class<?> wildcardClass3 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test047");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) 0.0f);
        boolean boolean14 = debitCard0.refund((double) 0);
        boolean boolean16 = debitCard0.refund((double) 1L);
        boolean boolean18 = debitCard0.pay((double) 10L);
        boolean boolean20 = debitCard0.refund((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test048");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) '4');
        boolean boolean8 = creditCard0.pay((double) (-1));
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
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test049");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.pay((double) 1);
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
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test050");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (short) 0);
        boolean boolean4 = mobilePayment0.refund((double) 1L);
        boolean boolean6 = mobilePayment0.refund((double) (-1L));
        boolean boolean8 = mobilePayment0.pay((double) 10.0f);
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test051");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.refund((double) (byte) 1);
        boolean boolean10 = creditCard0.refund(0.0d);
        boolean boolean12 = creditCard0.pay((double) 0.0f);
        boolean boolean14 = creditCard0.refund((double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test052");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        boolean boolean6 = creditCard0.refund((double) (short) 10);
        boolean boolean8 = creditCard0.pay((double) 1L);
        boolean boolean10 = creditCard0.pay((double) (short) 10);
        java.lang.Class<?> wildcardClass11 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test053");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (-1L));
        boolean boolean4 = mobilePayment0.refund((double) 'a');
        boolean boolean6 = mobilePayment0.pay((double) '4');
        java.lang.Class<?> wildcardClass7 = mobilePayment0.getClass();
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test054");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (-1L));
        boolean boolean4 = mobilePayment0.refund((double) 'a');
        boolean boolean6 = mobilePayment0.refund((double) 'a');
        boolean boolean8 = mobilePayment0.refund((-1.0d));
        boolean boolean10 = mobilePayment0.pay((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test055");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.refund((double) 0);
        boolean boolean4 = debitCard0.refund((double) 0.0f);
        boolean boolean6 = debitCard0.pay((double) '#');
        boolean boolean8 = debitCard0.pay((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 0);
        java.lang.Class<?> wildcardClass11 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test056");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.refund((double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test057");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.refund((double) (byte) 1);
        boolean boolean10 = creditCard0.refund(0.0d);
        java.lang.Class<?> wildcardClass11 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test058");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) 0.0f);
        boolean boolean14 = debitCard0.refund((double) 0);
        boolean boolean16 = debitCard0.pay((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test059");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        boolean boolean6 = creditCard0.refund((double) (short) 10);
        boolean boolean8 = creditCard0.refund((double) 100);
        boolean boolean10 = creditCard0.pay((double) (byte) 1);
        boolean boolean12 = creditCard0.pay(1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test060");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund((double) 0);
        boolean boolean6 = mobilePayment0.refund((double) (short) 0);
        java.lang.Class<?> wildcardClass7 = mobilePayment0.getClass();
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test061");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) 0.0f);
        boolean boolean14 = debitCard0.pay(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test062");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) '#');
        java.lang.Class<?> wildcardClass3 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test063");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((-1.0d));
        boolean boolean6 = debitCard0.pay((double) 0);
        boolean boolean8 = debitCard0.pay(10.0d);
        java.lang.Class<?> wildcardClass9 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test064");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) 0.0f);
        boolean boolean14 = debitCard0.refund((double) 0);
        java.lang.Class<?> wildcardClass15 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test065");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.pay((double) 0L);
        boolean boolean6 = mobilePayment0.pay((double) 0L);
        boolean boolean8 = mobilePayment0.refund((double) (-1.0f));
        boolean boolean10 = mobilePayment0.pay((double) 0.0f);
        boolean boolean12 = mobilePayment0.refund(0.0d);
        boolean boolean14 = mobilePayment0.refund(1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test066");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((-1.0d));
        boolean boolean6 = debitCard0.pay((double) 0);
        boolean boolean8 = debitCard0.refund((double) (byte) -1);
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test067");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 100L);
        boolean boolean6 = creditCard0.refund((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test068");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.pay((double) 0L);
        boolean boolean6 = mobilePayment0.pay((double) 0L);
        boolean boolean8 = mobilePayment0.refund((double) (-1.0f));
        boolean boolean10 = mobilePayment0.pay((double) 0.0f);
        boolean boolean12 = mobilePayment0.refund(0.0d);
        boolean boolean14 = mobilePayment0.pay(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test069");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) (-1.0f));
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.refund((double) 10.0f);
        boolean boolean8 = creditCard0.refund((double) 100L);
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
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test070");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) '4');
        boolean boolean8 = creditCard0.refund((double) (byte) 0);
        boolean boolean10 = creditCard0.pay(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test071");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 100L);
        java.lang.Class<?> wildcardClass5 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test072");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay((double) 10.0f);
        boolean boolean8 = creditCard0.pay((double) '4');
        boolean boolean10 = creditCard0.refund((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test073");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        java.lang.Class<?> wildcardClass3 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test074");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (-1L));
        boolean boolean4 = mobilePayment0.refund((double) 'a');
        boolean boolean6 = mobilePayment0.refund((double) 'a');
        java.lang.Class<?> wildcardClass7 = mobilePayment0.getClass();
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test075");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.pay(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test076");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.refund((double) (short) 1);
        boolean boolean6 = mobilePayment0.refund((double) (short) -1);
        boolean boolean8 = mobilePayment0.refund((double) (short) 10);
        boolean boolean10 = mobilePayment0.pay((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test077");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (-1L));
        boolean boolean4 = mobilePayment0.refund((double) 'a');
        boolean boolean6 = mobilePayment0.pay((double) (short) 100);
        boolean boolean8 = mobilePayment0.refund((-1.0d));
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test078");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.pay((-1.0d));
        boolean boolean10 = creditCard0.pay((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test079");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(1.0d);
        boolean boolean8 = debitCard0.pay((double) 10);
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test080");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        boolean boolean6 = creditCard0.refund((double) (short) 10);
        boolean boolean8 = creditCard0.pay((double) 1L);
        boolean boolean10 = creditCard0.pay((double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test081");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) (-1.0f));
        boolean boolean6 = debitCard0.pay((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test082");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay(0.0d);
        boolean boolean8 = mobilePayment0.refund((double) (byte) 0);
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
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test083");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) (short) 0);
        boolean boolean4 = debitCard0.pay(0.0d);
        boolean boolean6 = debitCard0.pay((double) 0L);
        boolean boolean8 = debitCard0.pay(100.0d);
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
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test084");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) (byte) 0);
        boolean boolean4 = mobilePayment0.pay((double) (short) 1);
        boolean boolean6 = mobilePayment0.refund((double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test085");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) 0.0f);
        boolean boolean14 = debitCard0.refund((double) 0);
        boolean boolean16 = debitCard0.refund((double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test086");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) (short) 0);
        boolean boolean4 = debitCard0.refund((double) 100L);
        boolean boolean6 = debitCard0.refund((double) 1);
        boolean boolean8 = debitCard0.refund((double) (byte) 0);
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test087");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) (-1.0f));
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.refund((double) (byte) -1);
        boolean boolean8 = creditCard0.refund((double) (short) 0);
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test088");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay((double) 10.0f);
        boolean boolean8 = creditCard0.pay((double) '4');
        boolean boolean10 = creditCard0.pay((double) (byte) -1);
        java.lang.Class<?> wildcardClass11 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test089");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.refund((double) (-1.0f));
        boolean boolean10 = creditCard0.refund((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test090");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) (byte) -1);
        boolean boolean6 = debitCard0.refund(0.0d);
        boolean boolean8 = debitCard0.pay((double) (byte) 100);
        boolean boolean10 = debitCard0.pay((double) (byte) 10);
        boolean boolean12 = debitCard0.refund((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test091");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay((double) 10.0f);
        boolean boolean8 = creditCard0.pay((double) '4');
        boolean boolean10 = creditCard0.pay((double) (byte) -1);
        boolean boolean12 = creditCard0.refund((double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test092");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) '#');
        boolean boolean8 = creditCard0.refund((double) (byte) 100);
        boolean boolean10 = creditCard0.refund((double) 0);
        boolean boolean12 = creditCard0.refund(1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test093");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay(0.0d);
        boolean boolean8 = mobilePayment0.pay(1.0d);
        java.lang.Class<?> wildcardClass9 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test094");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund((double) 0);
        boolean boolean6 = mobilePayment0.refund((double) (short) 0);
        boolean boolean8 = mobilePayment0.pay((double) (byte) 0);
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test095");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.refund((double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test096");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) (byte) -1);
        boolean boolean6 = debitCard0.refund(0.0d);
        boolean boolean8 = debitCard0.pay((double) (byte) 100);
        boolean boolean10 = debitCard0.refund((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test097");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (-1L));
        boolean boolean4 = mobilePayment0.refund((double) 'a');
        boolean boolean6 = mobilePayment0.refund((double) 'a');
        boolean boolean8 = mobilePayment0.pay((double) (short) 1);
        boolean boolean10 = mobilePayment0.pay((double) 10);
        boolean boolean12 = mobilePayment0.pay((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test098");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund(1.0d);
        boolean boolean4 = creditCard0.refund((double) 1);
        java.lang.Class<?> wildcardClass5 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test099");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund((double) 0);
        boolean boolean6 = mobilePayment0.pay((double) 1L);
        boolean boolean8 = mobilePayment0.pay((double) 0L);
        boolean boolean10 = mobilePayment0.refund((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test100");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((-1.0d));
        boolean boolean6 = debitCard0.pay((double) 0);
        boolean boolean8 = debitCard0.refund((double) '#');
        boolean boolean10 = debitCard0.pay((double) (short) 0);
        boolean boolean12 = debitCard0.pay((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test101");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) '4');
        boolean boolean8 = creditCard0.refund((double) (byte) 10);
        boolean boolean10 = creditCard0.pay((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test102");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay(0.0d);
        boolean boolean8 = creditCard0.pay((double) (byte) 100);
        boolean boolean10 = creditCard0.refund((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test103");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) (byte) -1);
        boolean boolean6 = debitCard0.refund((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test104");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund((double) 100.0f);
        boolean boolean6 = mobilePayment0.refund((double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test105");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((-1.0d));
        boolean boolean6 = debitCard0.pay((double) 0);
        boolean boolean8 = debitCard0.refund((double) '#');
        boolean boolean10 = debitCard0.pay((double) (short) 0);
        boolean boolean12 = debitCard0.pay((double) (short) -1);
        boolean boolean14 = debitCard0.pay((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test106");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.refund((double) 'a');
        boolean boolean10 = creditCard0.refund(1.0d);
        boolean boolean12 = creditCard0.pay((double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test107");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) 'a');
        boolean boolean6 = mobilePayment0.refund((double) (short) 1);
        boolean boolean8 = mobilePayment0.pay((double) 10.0f);
        boolean boolean10 = mobilePayment0.pay((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test108");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        boolean boolean6 = creditCard0.refund((double) (short) 10);
        boolean boolean8 = creditCard0.refund((double) 100);
        boolean boolean10 = creditCard0.refund((double) (byte) 0);
        boolean boolean12 = creditCard0.pay((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test109");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.refund((double) 0.0f);
        boolean boolean10 = creditCard0.refund((double) '#');
        boolean boolean12 = creditCard0.pay((double) 0);
        boolean boolean14 = creditCard0.refund((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test110");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((-1.0d));
        boolean boolean6 = debitCard0.refund(100.0d);
        boolean boolean8 = debitCard0.refund((double) ' ');
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test111");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((-1.0d));
        boolean boolean6 = debitCard0.pay((double) 0);
        boolean boolean8 = debitCard0.refund((double) '#');
        boolean boolean10 = debitCard0.pay((double) (short) 0);
        boolean boolean12 = debitCard0.refund((-1.0d));
        boolean boolean14 = debitCard0.refund(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test112");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund(1.0d);
        boolean boolean4 = creditCard0.pay((double) (-1.0f));
        boolean boolean6 = creditCard0.pay(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test113");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) (short) 0);
        boolean boolean4 = debitCard0.refund((double) 100);
        boolean boolean6 = debitCard0.refund((double) (byte) 100);
        boolean boolean8 = debitCard0.pay((double) 'a');
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
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test114");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) (-1.0f));
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.refund((double) 10.0f);
        boolean boolean8 = creditCard0.refund((double) 1L);
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test115");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.refund((double) 0);
        boolean boolean4 = debitCard0.refund(10.0d);
        boolean boolean6 = debitCard0.refund((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test116");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) 'a');
        boolean boolean6 = mobilePayment0.refund((double) (short) 1);
        boolean boolean8 = mobilePayment0.pay((double) 10.0f);
        boolean boolean10 = mobilePayment0.refund((double) ' ');
        boolean boolean12 = mobilePayment0.refund((double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test117");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.pay((double) (byte) 1);
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test118");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) (short) 0);
        boolean boolean4 = debitCard0.refund((double) 100L);
        boolean boolean6 = debitCard0.pay((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test119");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) '4');
        boolean boolean8 = creditCard0.refund((double) (byte) 0);
        boolean boolean10 = creditCard0.pay(1.0d);
        boolean boolean12 = creditCard0.refund((double) ' ');
        java.lang.Class<?> wildcardClass13 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test120");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.pay((double) 10.0f);
        boolean boolean10 = debitCard0.pay((double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test121");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.refund((double) 0);
        boolean boolean4 = debitCard0.refund((double) 0.0f);
        boolean boolean6 = debitCard0.pay((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test122");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (short) 0);
        boolean boolean4 = mobilePayment0.refund((double) 1L);
        boolean boolean6 = mobilePayment0.refund((double) 1);
        boolean boolean8 = mobilePayment0.pay((double) (-1L));
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
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test123");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) 'a');
        boolean boolean6 = mobilePayment0.refund((double) (short) 1);
        boolean boolean8 = mobilePayment0.pay((double) 10.0f);
        boolean boolean10 = mobilePayment0.pay((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test124");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund(1.0d);
        boolean boolean6 = debitCard0.refund((double) (short) 100);
        boolean boolean8 = debitCard0.refund((double) (short) 10);
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
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test125");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund((double) 0);
        boolean boolean6 = mobilePayment0.pay((double) 1L);
        boolean boolean8 = mobilePayment0.refund((double) (short) 10);
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
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test126");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) (byte) -1);
        boolean boolean6 = debitCard0.pay((double) (short) 0);
        java.lang.Class<?> wildcardClass7 = debitCard0.getClass();
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
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test127");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) (byte) 0);
        java.lang.Class<?> wildcardClass3 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test128");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.refund((double) 0);
        boolean boolean4 = debitCard0.refund(10.0d);
        java.lang.Class<?> wildcardClass5 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test129");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) (byte) 10);
        boolean boolean14 = debitCard0.refund((double) '4');
        java.lang.Class<?> wildcardClass15 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test130");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((-1.0d));
        boolean boolean6 = debitCard0.pay((double) 0);
        boolean boolean8 = debitCard0.refund((double) '#');
        boolean boolean10 = debitCard0.pay((double) (short) 0);
        boolean boolean12 = debitCard0.pay((double) (short) -1);
        java.lang.Class<?> wildcardClass13 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test131");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) (byte) -1);
        boolean boolean6 = debitCard0.refund(0.0d);
        boolean boolean8 = debitCard0.pay((double) (byte) 100);
        boolean boolean10 = debitCard0.pay((double) (byte) 10);
        boolean boolean12 = debitCard0.pay((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test132");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) (byte) 0);
        boolean boolean4 = mobilePayment0.pay((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test133");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.refund((double) (short) 1);
        boolean boolean6 = mobilePayment0.refund((double) (short) -1);
        boolean boolean8 = mobilePayment0.refund(100.0d);
        boolean boolean10 = mobilePayment0.refund((double) (byte) 100);
        boolean boolean12 = mobilePayment0.refund((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test134");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay((double) (byte) 0);
        boolean boolean8 = creditCard0.refund((double) 100);
        boolean boolean10 = creditCard0.refund((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test135");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.pay((double) 0L);
        boolean boolean6 = mobilePayment0.pay((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test136");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) (byte) 10);
        java.lang.Class<?> wildcardClass13 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test137");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) (byte) 0);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.refund((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test138");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) (byte) 0);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay(0.0d);
        boolean boolean8 = mobilePayment0.refund(100.0d);
        boolean boolean10 = mobilePayment0.pay((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test139");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test140");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) (byte) 1);
        boolean boolean6 = mobilePayment0.pay((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test141");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((-1.0d));
        boolean boolean6 = debitCard0.pay((double) 0);
        boolean boolean8 = debitCard0.refund((double) '#');
        boolean boolean10 = debitCard0.pay((double) (short) 0);
        boolean boolean12 = debitCard0.pay((double) (short) -1);
        boolean boolean14 = debitCard0.pay((double) (short) 100);
        boolean boolean16 = debitCard0.pay((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test142");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) '4');
        boolean boolean8 = creditCard0.refund((double) (byte) 0);
        boolean boolean10 = creditCard0.pay(10.0d);
        boolean boolean12 = creditCard0.refund((double) '#');
        boolean boolean14 = creditCard0.refund(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test143");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) (-1.0f));
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.refund((double) 10.0f);
        boolean boolean8 = creditCard0.pay((double) '4');
        boolean boolean10 = creditCard0.refund((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test144");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) (-1.0f));
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.refund((double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test145");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.refund((double) (short) 1);
        boolean boolean6 = mobilePayment0.refund((double) (short) -1);
        boolean boolean8 = mobilePayment0.refund(100.0d);
        boolean boolean10 = mobilePayment0.refund((double) (byte) 100);
        boolean boolean12 = mobilePayment0.refund((double) (short) 0);
        boolean boolean14 = mobilePayment0.refund((double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test146");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) (-1.0f));
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay((double) (byte) 0);
        boolean boolean8 = creditCard0.pay((double) 1.0f);
        boolean boolean10 = creditCard0.refund(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test147");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.refund((double) (short) 1);
        boolean boolean6 = mobilePayment0.refund((double) (short) -1);
        boolean boolean8 = mobilePayment0.refund(100.0d);
        boolean boolean10 = mobilePayment0.refund(100.0d);
        boolean boolean12 = mobilePayment0.refund((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test148");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.pay(0.0d);
        boolean boolean10 = debitCard0.pay((double) 1L);
        boolean boolean12 = debitCard0.refund((double) (byte) 10);
        boolean boolean14 = debitCard0.refund(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test149");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund(1.0d);
        boolean boolean6 = debitCard0.refund((double) (short) 100);
        boolean boolean8 = debitCard0.pay((double) 0L);
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
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test150");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) (byte) -1);
        boolean boolean6 = debitCard0.refund(0.0d);
        boolean boolean8 = debitCard0.refund((double) 10L);
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
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test151");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.refund((double) (short) 1);
        boolean boolean6 = mobilePayment0.refund((double) (short) -1);
        boolean boolean8 = mobilePayment0.pay((double) 100.0f);
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
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test152");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.refund((double) (byte) 1);
        boolean boolean10 = creditCard0.refund(0.0d);
        boolean boolean12 = creditCard0.refund((double) (byte) 100);
        boolean boolean14 = creditCard0.refund(1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test153");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) (short) 0);
        boolean boolean4 = debitCard0.pay((double) 1L);
        boolean boolean6 = debitCard0.pay((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test154");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) (byte) 10);
        boolean boolean6 = debitCard0.refund((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test155");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) 'a');
        boolean boolean6 = mobilePayment0.pay((double) '#');
        boolean boolean8 = mobilePayment0.pay((double) (short) -1);
        boolean boolean10 = mobilePayment0.pay((double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test156");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.refund((double) (byte) 1);
        boolean boolean10 = creditCard0.refund(0.0d);
        boolean boolean12 = creditCard0.refund((double) 100);
        boolean boolean14 = creditCard0.refund((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test157");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((double) (-1.0f));
        boolean boolean6 = debitCard0.pay((double) '4');
        boolean boolean8 = debitCard0.refund((double) 1L);
        boolean boolean10 = debitCard0.pay((double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test158");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay((double) 1.0f);
        boolean boolean8 = mobilePayment0.pay((-1.0d));
        java.lang.Class<?> wildcardClass9 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test159");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) '4');
        boolean boolean8 = creditCard0.refund((double) (byte) 0);
        boolean boolean10 = creditCard0.pay(1.0d);
        boolean boolean12 = creditCard0.pay((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test160");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay(0.0d);
        boolean boolean8 = creditCard0.refund((double) 1.0f);
        boolean boolean10 = creditCard0.refund(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test161");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        boolean boolean6 = creditCard0.refund(1.0d);
        boolean boolean8 = creditCard0.pay((double) 1.0f);
        boolean boolean10 = creditCard0.refund((double) 1L);
        boolean boolean12 = creditCard0.refund((double) 100);
        boolean boolean14 = creditCard0.refund((double) 10L);
        boolean boolean16 = creditCard0.pay((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test162");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        boolean boolean6 = creditCard0.refund(1.0d);
        boolean boolean8 = creditCard0.refund((double) 'a');
        boolean boolean10 = creditCard0.pay(0.0d);
        java.lang.Class<?> wildcardClass11 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test163");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) 100);
        boolean boolean4 = mobilePayment0.pay((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test164");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) 0.0f);
        boolean boolean14 = debitCard0.refund((double) 0);
        boolean boolean16 = debitCard0.refund((double) 1L);
        boolean boolean18 = debitCard0.pay((double) 10L);
        boolean boolean20 = debitCard0.refund((double) 100L);
        boolean boolean22 = debitCard0.refund((double) (byte) 10);
        java.lang.Class<?> wildcardClass23 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test165");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) (-1.0f));
        boolean boolean6 = debitCard0.refund((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test166");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((-1.0d));
        boolean boolean6 = debitCard0.pay((double) 0);
        boolean boolean8 = debitCard0.pay(10.0d);
        boolean boolean10 = debitCard0.refund((double) (-1.0f));
        boolean boolean12 = debitCard0.refund(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test167");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay((double) (byte) 0);
        boolean boolean8 = creditCard0.pay((double) 10L);
        boolean boolean10 = creditCard0.refund((double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test168");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 0);
        boolean boolean6 = creditCard0.pay((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test169");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) (short) 0);
        boolean boolean4 = debitCard0.pay(0.0d);
        boolean boolean6 = debitCard0.refund((double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test170");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay(0.0d);
        boolean boolean8 = creditCard0.refund((double) 1.0f);
        boolean boolean10 = creditCard0.pay((double) (byte) -1);
        java.lang.Class<?> wildcardClass11 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test171");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        boolean boolean6 = creditCard0.refund((double) (short) 10);
        boolean boolean8 = creditCard0.refund((double) 100);
        java.lang.Class<?> wildcardClass9 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test172");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.refund((double) (short) 1);
        boolean boolean6 = mobilePayment0.refund((double) (short) -1);
        boolean boolean8 = mobilePayment0.refund(100.0d);
        boolean boolean10 = mobilePayment0.pay((double) 1L);
        boolean boolean12 = mobilePayment0.refund((double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test173");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        boolean boolean6 = creditCard0.refund((double) (short) 10);
        boolean boolean8 = creditCard0.refund((double) 100);
        boolean boolean10 = creditCard0.pay((double) ' ');
        boolean boolean12 = creditCard0.refund((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test174");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (short) 0);
        boolean boolean4 = mobilePayment0.refund((double) 1L);
        boolean boolean6 = mobilePayment0.refund((double) (-1L));
        boolean boolean8 = mobilePayment0.refund(1.0d);
        boolean boolean10 = mobilePayment0.pay((double) 0);
        boolean boolean12 = mobilePayment0.pay(100.0d);
        boolean boolean14 = mobilePayment0.pay((double) ' ');
        boolean boolean16 = mobilePayment0.pay((double) 0L);
        boolean boolean18 = mobilePayment0.refund(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test175");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.refund((double) 0);
        boolean boolean4 = debitCard0.refund(10.0d);
        boolean boolean6 = debitCard0.refund((double) '#');
        boolean boolean8 = debitCard0.refund((double) (-1.0f));
        boolean boolean10 = debitCard0.refund(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test176");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) (byte) -1);
        boolean boolean6 = mobilePayment0.pay((double) (short) 10);
        boolean boolean8 = mobilePayment0.pay((double) 100.0f);
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
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test177");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(10.0d);
        boolean boolean6 = mobilePayment0.refund((double) (short) 100);
        boolean boolean8 = mobilePayment0.pay((double) 100.0f);
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
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test178");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (short) 0);
        boolean boolean4 = mobilePayment0.refund((double) 1L);
        boolean boolean6 = mobilePayment0.refund((double) (-1L));
        boolean boolean8 = mobilePayment0.refund(1.0d);
        boolean boolean10 = mobilePayment0.pay((double) 0);
        boolean boolean12 = mobilePayment0.pay(100.0d);
        boolean boolean14 = mobilePayment0.pay((double) ' ');
        boolean boolean16 = mobilePayment0.refund((double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test179");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        boolean boolean6 = creditCard0.refund(1.0d);
        boolean boolean8 = creditCard0.refund((double) 'a');
        boolean boolean10 = creditCard0.pay((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test180");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.pay(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test181");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test182");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        boolean boolean6 = creditCard0.refund((double) (short) 10);
        boolean boolean8 = creditCard0.pay((double) 1L);
        boolean boolean10 = creditCard0.refund((double) (-1));
        boolean boolean12 = creditCard0.pay((double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test183");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund((double) 0);
        boolean boolean6 = mobilePayment0.refund((double) (short) 0);
        boolean boolean8 = mobilePayment0.refund((double) (-1));
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
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test184");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) (-1.0f));
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay((double) (byte) 0);
        boolean boolean8 = creditCard0.pay((double) ' ');
        boolean boolean10 = creditCard0.refund((double) 100L);
        boolean boolean12 = creditCard0.pay((double) (byte) -1);
        boolean boolean14 = creditCard0.pay((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test185");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.pay((double) 0L);
        boolean boolean6 = mobilePayment0.pay((double) 0L);
        boolean boolean8 = mobilePayment0.refund((double) (-1.0f));
        boolean boolean10 = mobilePayment0.pay((double) 0.0f);
        boolean boolean12 = mobilePayment0.refund(0.0d);
        boolean boolean14 = mobilePayment0.pay((double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test186");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.refund((double) (byte) 1);
        boolean boolean10 = creditCard0.refund(0.0d);
        boolean boolean12 = creditCard0.refund((double) (byte) 100);
        boolean boolean14 = creditCard0.refund((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test187");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0.0f);
        boolean boolean6 = creditCard0.refund((-1.0d));
        boolean boolean8 = creditCard0.refund((double) (short) -1);
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
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test188");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (-1L));
        boolean boolean4 = mobilePayment0.refund((double) 'a');
        boolean boolean6 = mobilePayment0.refund((double) 'a');
        boolean boolean8 = mobilePayment0.refund((-1.0d));
        boolean boolean10 = mobilePayment0.pay(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test189");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) (-1.0f));
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay((double) (byte) 0);
        boolean boolean8 = creditCard0.refund((double) (-1L));
        boolean boolean10 = creditCard0.pay((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test190");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((double) (-1.0f));
        boolean boolean6 = debitCard0.pay((double) '4');
        boolean boolean8 = debitCard0.refund((double) 1L);
        boolean boolean10 = debitCard0.refund((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test191");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.refund((double) 'a');
        boolean boolean10 = creditCard0.refund((double) (byte) 1);
        boolean boolean12 = creditCard0.refund((double) (-1));
        boolean boolean14 = creditCard0.refund(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test192");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay((double) 1.0f);
        boolean boolean8 = mobilePayment0.refund((double) (byte) 1);
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
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test193");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) 100);
        java.lang.Class<?> wildcardClass3 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test194");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (short) 0);
        boolean boolean4 = mobilePayment0.refund((double) 1L);
        boolean boolean6 = mobilePayment0.refund((double) (-1L));
        boolean boolean8 = mobilePayment0.refund(1.0d);
        boolean boolean10 = mobilePayment0.pay((double) 0);
        boolean boolean12 = mobilePayment0.pay(100.0d);
        boolean boolean14 = mobilePayment0.refund((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test195");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay((double) 1.0f);
        boolean boolean8 = mobilePayment0.pay((double) 0);
        boolean boolean10 = mobilePayment0.refund((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test196");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) (byte) -1);
        boolean boolean6 = debitCard0.refund(0.0d);
        boolean boolean8 = debitCard0.pay((double) (byte) 0);
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test197");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.pay((double) 1.0f);
        java.lang.Class<?> wildcardClass5 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test198");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test199");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) '#');
        boolean boolean4 = creditCard0.refund((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test200");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.refund((double) 0);
        boolean boolean4 = debitCard0.pay((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test201");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay((double) 1.0f);
        boolean boolean8 = mobilePayment0.pay((-1.0d));
        boolean boolean10 = mobilePayment0.refund((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test202");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) (byte) -1);
        boolean boolean6 = mobilePayment0.pay((double) (short) 10);
        boolean boolean8 = mobilePayment0.pay((double) (-1L));
        boolean boolean10 = mobilePayment0.refund((double) 10.0f);
        boolean boolean12 = mobilePayment0.refund(100.0d);
        java.lang.Class<?> wildcardClass13 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test203");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((-1.0d));
        boolean boolean6 = debitCard0.pay((double) 0);
        boolean boolean8 = debitCard0.refund((double) '#');
        boolean boolean10 = debitCard0.pay((double) (short) 0);
        boolean boolean12 = debitCard0.pay((double) (short) -1);
        boolean boolean14 = debitCard0.refund((double) (-1L));
        boolean boolean16 = debitCard0.refund(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test204");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.refund((double) (-1.0f));
        boolean boolean10 = creditCard0.refund((double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test205");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.pay((double) 0L);
        boolean boolean6 = mobilePayment0.pay((double) 0L);
        boolean boolean8 = mobilePayment0.refund((double) (-1.0f));
        boolean boolean10 = mobilePayment0.pay((double) 0.0f);
        boolean boolean12 = mobilePayment0.refund(0.0d);
        boolean boolean14 = mobilePayment0.refund((double) 10L);
        boolean boolean16 = mobilePayment0.pay(1.0d);
        boolean boolean18 = mobilePayment0.pay((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test206");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (short) 0);
        boolean boolean4 = mobilePayment0.refund((double) 0L);
        boolean boolean6 = mobilePayment0.pay((double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test207");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.refund((double) (short) 1);
        boolean boolean6 = mobilePayment0.refund((double) (short) -1);
        boolean boolean8 = mobilePayment0.refund(100.0d);
        boolean boolean10 = mobilePayment0.refund((double) 10L);
        boolean boolean12 = mobilePayment0.refund(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test208");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund((double) 0);
        boolean boolean6 = mobilePayment0.pay((double) 1L);
        boolean boolean8 = mobilePayment0.pay((double) 0L);
        boolean boolean10 = mobilePayment0.pay((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test209");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay(0.0d);
        boolean boolean8 = mobilePayment0.refund((double) (short) 100);
        boolean boolean10 = mobilePayment0.pay((double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test210");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay((double) (byte) 0);
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
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test211");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) 'a');
        boolean boolean6 = mobilePayment0.pay((double) '#');
        boolean boolean8 = mobilePayment0.pay((double) (short) -1);
        java.lang.Class<?> wildcardClass9 = mobilePayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test212");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        java.lang.Class<?> wildcardClass5 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test213");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) (short) 0);
        boolean boolean4 = debitCard0.refund((double) 100);
        boolean boolean6 = debitCard0.pay((double) (short) 0);
        boolean boolean8 = debitCard0.refund((double) 0);
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
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test214");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.refund((double) 10.0f);
        boolean boolean8 = creditCard0.refund((double) (byte) 1);
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
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test215");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) 0.0f);
        boolean boolean14 = debitCard0.refund((double) 0);
        boolean boolean16 = debitCard0.refund((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test216");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0.0f);
        boolean boolean6 = creditCard0.refund((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test217");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) (short) 0);
        boolean boolean4 = debitCard0.refund((double) 100L);
        boolean boolean6 = debitCard0.refund((double) 1);
        boolean boolean8 = debitCard0.refund((double) 100);
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
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test218");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) '4');
        boolean boolean8 = creditCard0.pay(0.0d);
        boolean boolean10 = creditCard0.pay((double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test219");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 10);
        boolean boolean6 = debitCard0.pay((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test220");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) 'a');
        boolean boolean6 = mobilePayment0.refund((double) (short) 1);
        boolean boolean8 = mobilePayment0.pay((double) 10.0f);
        boolean boolean10 = mobilePayment0.pay((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test221");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) 10);
        boolean boolean4 = creditCard0.pay((double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test222");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.refund((double) 0);
        boolean boolean4 = debitCard0.refund(10.0d);
        boolean boolean6 = debitCard0.refund((double) '#');
        boolean boolean8 = debitCard0.refund((double) (-1.0f));
        boolean boolean10 = debitCard0.refund((double) 0);
        boolean boolean12 = debitCard0.pay((double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test223");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay((double) 1.0f);
        boolean boolean8 = mobilePayment0.pay((double) 0);
        boolean boolean10 = mobilePayment0.refund((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test224");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) '4');
        boolean boolean8 = creditCard0.refund((double) (byte) 0);
        boolean boolean10 = creditCard0.pay(1.0d);
        boolean boolean12 = creditCard0.refund((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test225");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay((double) 10.0f);
        boolean boolean8 = creditCard0.refund((double) (short) 10);
        boolean boolean10 = creditCard0.refund((double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test226");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(0.0d);
        boolean boolean6 = mobilePayment0.pay((double) '4');
        boolean boolean8 = mobilePayment0.refund((double) (short) 0);
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
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test227");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) (-1.0f));
        boolean boolean4 = creditCard0.refund((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test228");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((double) (-1.0f));
        boolean boolean6 = debitCard0.pay((double) 100.0f);
        boolean boolean8 = debitCard0.pay((double) '#');
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
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test229");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) 'a');
        boolean boolean6 = mobilePayment0.refund((double) (short) 1);
        boolean boolean8 = mobilePayment0.pay(1.0d);
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test230");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.pay((double) 10);
        boolean boolean4 = creditCard0.refund((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test231");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.refund((double) (byte) 1);
        boolean boolean10 = creditCard0.refund(0.0d);
        boolean boolean12 = creditCard0.refund((double) 100);
        boolean boolean14 = creditCard0.refund((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test232");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) '4');
        boolean boolean8 = creditCard0.refund((double) (byte) 0);
        boolean boolean10 = creditCard0.pay(1.0d);
        boolean boolean12 = creditCard0.refund((double) (byte) -1);
        boolean boolean14 = creditCard0.pay(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test233");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund((double) (short) 100);
        boolean boolean8 = debitCard0.refund((double) 0);
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
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test234");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.refund((double) 0.0f);
        boolean boolean10 = creditCard0.refund((double) '#');
        boolean boolean12 = creditCard0.pay((double) 0);
        java.lang.Class<?> wildcardClass13 = creditCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test235");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10L);
        boolean boolean4 = debitCard0.refund((-1.0d));
        boolean boolean6 = debitCard0.pay((double) 0);
        boolean boolean8 = debitCard0.pay(10.0d);
        boolean boolean10 = debitCard0.refund((double) (-1.0f));
        boolean boolean12 = debitCard0.pay((double) (short) -1);
        java.lang.Class<?> wildcardClass13 = debitCard0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test236");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.pay((double) 'a');
        boolean boolean6 = creditCard0.pay((double) (byte) 0);
        boolean boolean8 = creditCard0.pay((double) 10L);
        boolean boolean10 = creditCard0.pay((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test237");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        boolean boolean6 = creditCard0.refund(1.0d);
        boolean boolean8 = creditCard0.pay((double) 1.0f);
        boolean boolean10 = creditCard0.refund((double) 1L);
        boolean boolean12 = creditCard0.pay((double) (-1));
        boolean boolean14 = creditCard0.pay((double) 100.0f);
        boolean boolean16 = creditCard0.refund((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test238");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) '4');
        boolean boolean8 = creditCard0.pay(0.0d);
        boolean boolean10 = creditCard0.pay((double) ' ');
        boolean boolean12 = creditCard0.pay((double) (short) 0);
        boolean boolean14 = creditCard0.refund(100.0d);
        boolean boolean16 = creditCard0.pay((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test239");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.refund((double) 0);
        boolean boolean4 = debitCard0.refund((double) 0.0f);
        boolean boolean6 = debitCard0.pay((double) '#');
        boolean boolean8 = debitCard0.pay((double) 10.0f);
        boolean boolean10 = debitCard0.refund(1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test240");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (-1L));
        boolean boolean4 = mobilePayment0.refund((double) 'a');
        boolean boolean6 = mobilePayment0.pay((double) (short) 100);
        boolean boolean8 = mobilePayment0.refund(100.0d);
        boolean boolean10 = mobilePayment0.refund((double) (short) 10);
        boolean boolean12 = mobilePayment0.pay((double) (short) 10);
        boolean boolean14 = mobilePayment0.refund((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test241");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund((double) 0);
        boolean boolean6 = mobilePayment0.pay((double) 1L);
        boolean boolean8 = mobilePayment0.refund((double) '4');
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
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test242");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) 0.0f);
        boolean boolean14 = debitCard0.refund((double) 0);
        boolean boolean16 = debitCard0.refund((double) 1L);
        boolean boolean18 = debitCard0.pay((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test243");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) (-1.0f));
        boolean boolean6 = debitCard0.refund(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test244");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) (-1L));
        boolean boolean6 = creditCard0.pay((double) 1);
        boolean boolean8 = creditCard0.refund((double) 'a');
        boolean boolean10 = creditCard0.refund(1.0d);
        boolean boolean12 = creditCard0.refund((-1.0d));
        boolean boolean14 = creditCard0.refund((double) 0.0f);
        boolean boolean16 = creditCard0.pay((double) (short) 100);
        boolean boolean18 = creditCard0.refund((double) 0);
        boolean boolean20 = creditCard0.pay((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test245");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.refund((double) 0);
        boolean boolean4 = debitCard0.refund((double) 0.0f);
        boolean boolean6 = debitCard0.refund((double) 100);
        boolean boolean8 = debitCard0.pay((double) 100);
        boolean boolean10 = debitCard0.refund((double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test246");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) 0.0f);
        boolean boolean14 = debitCard0.refund((double) 0);
        boolean boolean16 = debitCard0.refund((double) 1L);
        boolean boolean18 = debitCard0.pay((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test247");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.refund((double) 0);
        boolean boolean4 = debitCard0.refund((double) 0.0f);
        boolean boolean6 = debitCard0.refund((double) 100);
        boolean boolean8 = debitCard0.pay((double) (short) 10);
        boolean boolean10 = debitCard0.refund((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test248");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) (short) 0);
        boolean boolean4 = mobilePayment0.refund((double) 1L);
        boolean boolean6 = mobilePayment0.refund(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test249");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(10.0d);
        boolean boolean6 = mobilePayment0.refund((double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test250");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.pay((double) 100);
        boolean boolean4 = mobilePayment0.pay((double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test251");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0.0f);
        boolean boolean6 = creditCard0.pay((double) (short) 10);
        boolean boolean8 = creditCard0.refund((double) (short) -1);
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
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test252");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 0L);
        boolean boolean4 = mobilePayment0.refund(10.0d);
        boolean boolean6 = mobilePayment0.pay((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test253");
        yorku.eecs3311.payment.MobilePayment mobilePayment0 = new yorku.eecs3311.payment.MobilePayment();
        boolean boolean2 = mobilePayment0.refund((double) 100.0f);
        boolean boolean4 = mobilePayment0.pay((double) (byte) -1);
        boolean boolean6 = mobilePayment0.pay(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test254");
        yorku.eecs3311.payment.CreditCard creditCard0 = new yorku.eecs3311.payment.CreditCard();
        boolean boolean2 = creditCard0.refund((double) 0.0f);
        boolean boolean4 = creditCard0.refund((double) 0L);
        boolean boolean6 = creditCard0.refund(1.0d);
        boolean boolean8 = creditCard0.pay((double) 1.0f);
        boolean boolean10 = creditCard0.refund((double) 1L);
        boolean boolean12 = creditCard0.pay((double) (-1));
        boolean boolean14 = creditCard0.pay((double) 100.0f);
        boolean boolean16 = creditCard0.pay((double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test255");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.pay(0.0d);
        boolean boolean10 = debitCard0.refund((double) (byte) -1);
        boolean boolean12 = debitCard0.refund((double) (byte) -1);
        boolean boolean14 = debitCard0.refund((double) 0);
        boolean boolean16 = debitCard0.refund((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRegressionTest0.test256");
        yorku.eecs3311.payment.DebitCard debitCard0 = new yorku.eecs3311.payment.DebitCard();
        boolean boolean2 = debitCard0.pay((double) 10);
        boolean boolean4 = debitCard0.refund((double) 0L);
        boolean boolean6 = debitCard0.refund(10.0d);
        boolean boolean8 = debitCard0.refund((double) 10.0f);
        boolean boolean10 = debitCard0.refund((double) 'a');
        boolean boolean12 = debitCard0.pay((double) 0.0f);
        boolean boolean14 = debitCard0.pay(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }
}

