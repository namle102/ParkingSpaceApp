package yorku.eecs3311.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test001");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        yorku.eecs3311.parking.ParkingSpace parkingSpace17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = booking12.canExtend((int) (byte) -1, "hi!", parkingSpace17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test002");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        yorku.eecs3311.parking.ParkingSpace parkingSpace17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = booking12.extend((int) (byte) -1, "hi!", parkingSpace17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test003");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        yorku.eecs3311.parking.ParkingSpace parkingSpace17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = booking12.canExtend((int) (short) 10, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", parkingSpace17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test004");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        yorku.eecs3311.parking.ParkingSpace parkingSpace17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = booking12.extend((int) '4', "hi!", parkingSpace17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test005");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        double double15 = booking12.calculateFinalCharge();
        yorku.eecs3311.parking.ParkingSpace parkingSpace18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = booking12.canExtend((int) (short) 100, "hi!", parkingSpace18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test006");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDur((int) 'a');
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setSpaceID(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test007");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.toString();
        double double17 = booking12.getFinalAmountCharged();
        booking12.setFinalAmountCharged((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str16.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test008");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setSpaceID(97);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.isCheckedOut(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test009");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.getLotName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test010");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        double double15 = booking12.getDeposit();
        yorku.eecs3311.parking.ParkingSpace parkingSpace18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = booking12.extend(10, "hi!", parkingSpace18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test011");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        java.lang.Class<?> wildcardClass14 = booking12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test012");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        double double15 = booking12.getDeposit();
        int int16 = booking12.getSpaceID();
        booking12.checkout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test013");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) (short) 100, "hi!", (int) (short) 1, "", (int) (byte) 10, 100, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", (double) 1, "", false, false, false);
        yorku.eecs3311.parking.ParkingSpace parkingSpace15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = booking12.canExtend((int) (short) 100, "hi!", parkingSpace15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test014");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.getFinalAmountCharged();
        java.lang.Class<?> wildcardClass14 = booking12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test015");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.toString();
        double double17 = booking12.getFinalAmountCharged();
        double double18 = booking12.getFinalAmountCharged();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str16.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test016");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.setFinalAmountCharged((double) (byte) 10);
        int int16 = booking12.getStartHour();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test017");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder4.setPaymentMethod("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test018");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit(0.0d);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setBookingID((int) (byte) 0);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.setDeposit((double) (short) 1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder8.setDate("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test019");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        booking12.checkout();
        booking12.cancel();
        double double17 = booking12.getDeposit();
        boolean boolean18 = booking12.isCancelled();
        double double19 = booking12.calculateFinalCharge();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test020");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.toString();
        double double17 = booking12.getFinalAmountCharged();
        java.lang.String str18 = booking12.toString();
        booking12.cancel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str16.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str18.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test021");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getStartHour();
        int int16 = booking12.getSpaceID();
        yorku.eecs3311.parking.ParkingSpace parkingSpace19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = booking12.canExtend((int) 'a', "hi!", parkingSpace19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test022");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getStartHour();
        double double16 = booking12.getDeposit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test023");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit(0.0d);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.isExtended(false);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.isExtended(true);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder10.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test024");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) (short) 100, "hi!", (int) (short) 1, "", (int) (byte) 10, 100, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", (double) 1, "", false, false, false);
        double double13 = booking12.getFinalAmountCharged();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test025");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.toString();
        int int17 = booking12.getDur();
        booking12.checkout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str16.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test026");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((-1), "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", (int) (short) 0, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", 1, (int) (byte) 10, "hi!", 100.0d, "", false, false, false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test027");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getStartHour();
        double double16 = booking12.calculateFinalCharge();
        boolean boolean17 = booking12.isCancelled();
        double double18 = booking12.getFinalAmountCharged();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test028");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDur((int) 'a');
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setBookingID(0);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.setEmail("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder8.setDate("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test029");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setSpaceID((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test030");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        booking12.checkout();
        java.lang.String str16 = booking12.getLotName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test031");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.getFinalAmountCharged();
        booking12.cancel();
        booking12.setFinalAmountCharged(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test032");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.toString();
        double double17 = booking12.getFinalAmountCharged();
        java.lang.Class<?> wildcardClass18 = booking12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str16.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test033");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        yorku.eecs3311.parking.ParkingSpace parkingSpace17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = booking12.canExtend((int) (short) 100, "hi!", parkingSpace17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test034");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) (short) 100, "hi!", (int) (short) 1, "", (int) (byte) 10, 100, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", (double) 1, "", false, false, false);
        boolean boolean13 = booking12.isCheckedOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test035");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        double double15 = booking12.getDeposit();
        java.lang.String str16 = booking12.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test036");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        double double15 = booking12.getFinalAmountCharged();
        yorku.eecs3311.parking.ParkingSpace parkingSpace18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = booking12.extend((int) (short) 1, "", parkingSpace18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test037");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDur((int) (short) -1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.setStartHour((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test038");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        booking12.checkout();
        booking12.cancel();
        double double17 = booking12.getDeposit();
        boolean boolean18 = booking12.isCancelled();
        yorku.eecs3311.parking.ParkingSpace parkingSpace21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = booking12.canExtend((int) (short) 0, "", parkingSpace21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test039");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        double double15 = booking12.calculateFinalCharge();
        boolean boolean16 = booking12.isExtended();
        double double17 = booking12.calculateFinalCharge();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test040");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit(0.0d);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test041");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDur((int) 'a');
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setBookingID(0);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder6.setSpaceID((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test042");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        double double15 = booking12.calculateFinalCharge();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test043");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        double double15 = booking12.getDeposit();
        int int16 = booking12.getSpaceID();
        java.lang.String str17 = booking12.getDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test044");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDur((int) (short) -1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.setSpaceID(1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder2.setLotName("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder2.setDeposit((double) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test045");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setBookingID(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test046");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        boolean boolean15 = booking12.isCheckedOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test047");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDur((int) (short) -1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setLotName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test048");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        booking12.checkout();
        java.lang.String str16 = booking12.getEmail();
        double double17 = booking12.getFinalAmountCharged();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test049");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDur((int) 'a');
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setBookingID(0);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.setEmail("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder10.setLotName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test050");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        double double15 = booking12.getDeposit();
        int int16 = booking12.getSpaceID();
        int int17 = booking12.getStartHour();
        yorku.eecs3311.parking.ParkingSpace parkingSpace20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = booking12.extend((int) '4', "", parkingSpace20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test051");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        booking12.checkout();
        booking12.cancel();
        double double17 = booking12.getDeposit();
        boolean boolean18 = booking12.isCheckedOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test052");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        double double15 = booking12.getFinalAmountCharged();
        java.lang.String str16 = booking12.getLotName();
        int int17 = booking12.getStartHour();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test053");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDur((int) 'a');
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.isCheckedOut(false);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.setStartHour(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test054");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        java.lang.String str15 = booking12.getDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test055");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        double double15 = booking12.calculateFinalCharge();
        yorku.eecs3311.parking.ParkingSpace parkingSpace18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = booking12.extend(35, "hi!", parkingSpace18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test056");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        java.lang.String str15 = booking12.toString();
        double double16 = booking12.getFinalAmountCharged();
        java.lang.String str17 = booking12.toString();
        boolean boolean18 = booking12.isCancelled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str15.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str17.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test057");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        java.lang.String str15 = booking12.toString();
        int int16 = booking12.getStartHour();
        int int17 = booking12.getSpaceID();
        double double18 = booking12.getFinalAmountCharged();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str15.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test058");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        java.lang.String str13 = booking12.getLotName();
        double double14 = booking12.calculateFinalCharge();
        java.lang.String str15 = booking12.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str15.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test059");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) (byte) 0, "", (int) (short) 1, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", 0, (int) (byte) 0, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", (double) 100L, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", false, true, false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test060");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        booking12.setFinalAmountCharged((double) '#');
        boolean boolean17 = booking12.isExtended();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test061");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit(0.0d);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.isExtended(false);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder2.setStartHour((int) (byte) 1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder10.isCheckedOut(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test062");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit(0.0d);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setBookingID((int) (byte) 0);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder6.setDeposit((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test063");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setSpaceID(97);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDate("hi!");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setDeposit((double) (short) 0);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder6.setBookingID(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test064");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        java.lang.String str15 = booking12.toString();
        int int16 = booking12.getBookingID();
        int int17 = booking12.getBookingID();
        java.lang.String str18 = booking12.getEmail();
        yorku.eecs3311.parking.ParkingSpace parkingSpace21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = booking12.extend((int) (byte) 100, "hi!", parkingSpace21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str15.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test065");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getStartHour();
        double double16 = booking12.getFinalAmountCharged();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test066");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking(0, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", (int) ' ', "", (int) (short) 100, (int) (short) 1, "hi!", (double) (byte) 10, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", false, false, false);
        boolean boolean13 = booking12.isCheckedOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test067");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDur((int) (short) -1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.setLotName("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        java.lang.Class<?> wildcardClass9 = bookingBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test068");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.getFinalAmountCharged();
        booking12.cancel();
        int int15 = booking12.getStartHour();
        booking12.cancel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test069");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit(0.0d);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.isExtended(false);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder2.isCancelled(false);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder10.setPaymentMethod("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test070");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.getFinalAmountCharged();
        int int14 = booking12.getDur();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test071");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        int int15 = booking12.getSpaceID();
        yorku.eecs3311.parking.ParkingSpace parkingSpace18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = booking12.extend(10, "hi!", parkingSpace18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test072");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.toString();
        double double17 = booking12.getFinalAmountCharged();
        java.lang.String str18 = booking12.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str16.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test073");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.isExtended(true);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setSpaceID((int) (byte) 0);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder6.setDate("hi!");
        yorku.eecs3311.booking.Booking booking11 = bookingBuilder10.build();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder13 = bookingBuilder10.isCancelled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test074");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        boolean boolean14 = booking12.isCancelled();
        boolean boolean15 = booking12.isCheckedOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test075");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.getLotName();
        java.lang.String str17 = booking12.getDate();
        int int18 = booking12.getStartHour();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test076");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        booking12.checkout();
        double double16 = booking12.getFinalAmountCharged();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test077");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((-1), "", 0, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", (int) (byte) 0, (int) (short) -1, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", (double) 100, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", true, true, false);
        yorku.eecs3311.parking.ParkingSpace parkingSpace15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = booking12.extend((int) (short) 0, "", parkingSpace15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test078");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.getLotName();
        java.lang.String str17 = booking12.getPaymentMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test079");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit(0.0d);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.isExtended(false);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.isExtended(true);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder8.setPaymentMethod("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test080");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking(0, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", (int) ' ', "", (int) (short) 100, (int) (short) 1, "hi!", (double) (byte) 10, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", false, false, false);
        int int13 = booking12.getStartHour();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test081");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        double double15 = booking12.getDeposit();
        java.lang.Class<?> wildcardClass16 = booking12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test082");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        int int15 = booking12.getSpaceID();
        double double16 = booking12.getDeposit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test083");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) 'a', "hi!", 100, "hi!", (int) (byte) 100, (int) (byte) 100, "", (double) (byte) -1, "", false, true, false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test084");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        booking12.setFinalAmountCharged((double) '#');
        int int17 = booking12.getBookingID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test085");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDur((int) 'a');
        yorku.eecs3311.booking.Booking booking7 = bookingBuilder6.build();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder9 = bookingBuilder6.setSpaceID((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test086");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDur((int) '4');
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.isCancelled(false);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder8.isCheckedOut(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test087");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        booking12.checkout();
        booking12.cancel();
        yorku.eecs3311.parking.ParkingSpace parkingSpace19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = booking12.canExtend((int) (byte) 1, "hi!", parkingSpace19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test088");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        java.lang.String str15 = booking12.toString();
        int int16 = booking12.getBookingID();
        booking12.cancel();
        int int18 = booking12.getBookingID();
        int int19 = booking12.getBookingID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str15.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test089");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDur((int) 'a');
        yorku.eecs3311.booking.Booking booking7 = bookingBuilder6.build();
        java.lang.String str8 = booking7.getPaymentMethod();
        double double9 = booking7.calculateFinalCharge();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test090");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        double double15 = booking12.getDeposit();
        int int16 = booking12.getSpaceID();
        int int17 = booking12.getStartHour();
        boolean boolean18 = booking12.isExtended();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test091");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit(0.0d);
        yorku.eecs3311.booking.Booking booking7 = bookingBuilder2.build();
        int int8 = booking7.getStartHour();
        booking7.cancel();
        int int10 = booking7.getStartHour();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test092");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        booking12.setFinalAmountCharged((double) '#');
        yorku.eecs3311.parking.ParkingSpace parkingSpace19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = booking12.canExtend(100, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", parkingSpace19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test093");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit(0.0d);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.isCheckedOut(true);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder6.setEmail("hi!");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder10.setLotName("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder14 = bookingBuilder10.setBookingID((int) '#');
        yorku.eecs3311.booking.BookingBuilder bookingBuilder16 = bookingBuilder14.isCancelled(true);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder18 = bookingBuilder16.setDur((int) (byte) 0);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder20 = bookingBuilder16.isCheckedOut(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder20);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test094");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setSpaceID(97);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDate("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder0.setLotName("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.setLotName("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test095");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        java.lang.Class<?> wildcardClass3 = bookingBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test096");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getDur();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test097");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.setFinalAmountCharged((double) (byte) 10);
        java.lang.String str16 = booking12.getEmail();
        booking12.setFinalAmountCharged((double) (short) 1);
        boolean boolean19 = booking12.isCancelled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test098");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit(0.0d);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.isCheckedOut(true);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.setEmail("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        java.lang.Class<?> wildcardClass11 = bookingBuilder10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test099");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((-1), "", 0, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", (int) (byte) 0, (int) (short) -1, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", (double) 100, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", true, true, false);
        double double13 = booking12.calculateFinalCharge();
        java.lang.String str14 = booking12.getDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-100.0d) + "'", double13 == (-100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str14.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test100");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        boolean boolean14 = booking12.isCancelled();
        java.lang.String str15 = booking12.getDate();
        yorku.eecs3311.parking.ParkingSpace parkingSpace18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = booking12.canExtend((int) (short) 100, "hi!", parkingSpace18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test101");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit((-1.0d));
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.isCheckedOut(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test102");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        boolean boolean14 = booking12.isCancelled();
        java.lang.String str15 = booking12.getDate();
        double double16 = booking12.getDeposit();
        booking12.setFinalAmountCharged((double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test103");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getStartHour();
        double double16 = booking12.calculateFinalCharge();
        boolean boolean17 = booking12.isCancelled();
        boolean boolean18 = booking12.isCancelled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test104");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        double double15 = booking12.calculateFinalCharge();
        booking12.setFinalAmountCharged((double) 100);
        java.lang.String str18 = booking12.getLotName();
        booking12.setFinalAmountCharged((double) (short) 10);
        double double21 = booking12.getFinalAmountCharged();
        boolean boolean22 = booking12.isCheckedOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test105");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit(0.0d);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.setStartHour((int) (short) 0);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.setDate("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test106");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        booking12.checkout();
        boolean boolean16 = booking12.isExtended();
        java.lang.String str17 = booking12.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test107");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.isExtended(true);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setStartHour(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test108");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) (short) 1, "", (int) (short) 10, "hi!", 10, (int) (short) -1, "", (double) '#', "", false, false, true);
        double double13 = booking12.getDeposit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test109");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        double double15 = booking12.getDeposit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test110");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.toString();
        int int17 = booking12.getDur();
        boolean boolean18 = booking12.isExtended();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str16.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test111");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) (short) 100, "hi!", (int) (short) 1, "", (int) (byte) 10, 100, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", (double) 1, "", false, false, false);
        yorku.eecs3311.parking.ParkingSpace parkingSpace15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = booking12.canExtend((int) (byte) 0, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", parkingSpace15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test112");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        java.lang.String str13 = booking12.getLotName();
        booking12.cancel();
        java.lang.String str15 = booking12.getEmail();
        java.lang.String str16 = booking12.getPaymentMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test113");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking(10, "", (int) (short) 0, "", (int) 'a', (int) (short) 10, "", (double) '4', "", false, false, true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test114");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        java.lang.String str13 = booking12.getLotName();
        booking12.cancel();
        java.lang.String str15 = booking12.getEmail();
        int int16 = booking12.getStartHour();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test115");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        booking12.setFinalAmountCharged((double) (byte) -1);
        double double17 = booking12.getDeposit();
        double double18 = booking12.getFinalAmountCharged();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test116");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        booking12.cancel();
        int int16 = booking12.getStartHour();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test117");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDur((int) 'a');
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.isCheckedOut(false);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.setDeposit((double) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test118");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit((-1.0d));
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.setBookingID((int) '#');
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder2.setSpaceID(0);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder10.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test119");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        int int15 = booking12.getSpaceID();
        double double16 = booking12.getDeposit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test120");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        java.lang.String str13 = booking12.getLotName();
        double double14 = booking12.calculateFinalCharge();
        yorku.eecs3311.parking.ParkingSpace parkingSpace17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = booking12.canExtend((int) ' ', "", parkingSpace17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test121");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit((-1.0d));
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.setSpaceID((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = bookingBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test122");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDur((int) 'a');
        yorku.eecs3311.booking.Booking booking7 = bookingBuilder6.build();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder9 = bookingBuilder6.setDate("hi!");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder11 = bookingBuilder9.setDur((int) (byte) -1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder13 = bookingBuilder11.isExtended(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test123");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        booking12.checkout();
        double double15 = booking12.getDeposit();
        java.lang.String str16 = booking12.getDate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test124");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        double double15 = booking12.getFinalAmountCharged();
        double double16 = booking12.getDeposit();
        java.lang.String str17 = booking12.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test125");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.toString();
        int int17 = booking12.getDur();
        int int18 = booking12.getStartHour();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str16.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test126");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDur((int) 'a');
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setDeposit((double) '#');
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder6.setDate("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test127");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.getFinalAmountCharged();
        booking12.cancel();
        double double15 = booking12.calculateFinalCharge();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test128");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        booking12.cancel();
        double double16 = booking12.getFinalAmountCharged();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test129");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.toString();
        int int17 = booking12.getDur();
        double double18 = booking12.getDeposit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str16.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test130");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking(0, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", (int) ' ', "", (int) (short) 100, (int) (short) 1, "hi!", (double) (byte) 10, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", false, false, false);
        int int13 = booking12.getBookingID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test131");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDur((int) '4');
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.setPaymentMethod("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder2.setStartHour(0);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder10.setDeposit((double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test132");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDur((int) '4');
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.isCancelled(false);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder8.setPaymentMethod("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test133");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setEmail("hi!");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setDur((int) (byte) 100);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder6.setLotName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test134");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setEmail("hi!");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setEmail("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test135");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit(0.0d);
        yorku.eecs3311.booking.Booking booking7 = bookingBuilder2.build();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder9 = bookingBuilder2.isExtended(false);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder11 = bookingBuilder2.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test136");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.toString();
        double double17 = booking12.getFinalAmountCharged();
        java.lang.String str18 = booking12.toString();
        java.lang.String str19 = booking12.getDate();
        booking12.checkout();
        booking12.checkout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str16.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str18.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test137");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getStartHour();
        int int16 = booking12.getSpaceID();
        double double17 = booking12.getDeposit();
        yorku.eecs3311.parking.ParkingSpace parkingSpace20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = booking12.canExtend((-1), "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", parkingSpace20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test138");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit(0.0d);
        yorku.eecs3311.booking.Booking booking7 = bookingBuilder2.build();
        java.lang.String str8 = booking7.getPaymentMethod();
        double double9 = booking7.getFinalAmountCharged();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test139");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setSpaceID(97);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDate("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder0.setLotName("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.isCancelled(true);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder8.setDate("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test140");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) (byte) 10, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", (int) (short) -1, "hi!", 0, (int) (byte) 0, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", 0.0d, "hi!", false, false, true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test141");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDur((int) '4');
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder6.setDeposit((double) (byte) 1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.setLotName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test142");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        booking12.setFinalAmountCharged((double) '#');
        int int17 = booking12.getStartHour();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test143");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setSpaceID(97);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDate("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder0.setLotName("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.isCancelled(true);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder10.isExtended(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test144");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        double double15 = booking12.getFinalAmountCharged();
        java.lang.String str16 = booking12.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test145");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getStartHour();
        boolean boolean16 = booking12.isCancelled();
        int int17 = booking12.getBookingID();
        double double18 = booking12.getDeposit();
        java.lang.String str19 = booking12.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test146");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDur((int) (short) -1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.setSpaceID(1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder2.setBookingID((-1));
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder10.isCheckedOut(false);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder14 = bookingBuilder10.setDeposit((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder14);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test147");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.getFinalAmountCharged();
        booking12.cancel();
        double double15 = booking12.getFinalAmountCharged();
        java.lang.String str16 = booking12.getLotName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test148");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDur((int) 'a');
        yorku.eecs3311.booking.Booking booking7 = bookingBuilder6.build();
        java.lang.String str8 = booking7.getPaymentMethod();
        booking7.checkout();
        booking7.cancel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test149");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDur((int) (short) -1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.setSpaceID(1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder2.setLotName("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder10.isExtended(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test150");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDeposit(0.0d);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.isExtended(false);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder8.isExtended(true);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder8.setDur(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test151");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        java.lang.String str15 = booking12.getLotName();
        java.lang.String str16 = booking12.getLotName();
        java.lang.Class<?> wildcardClass17 = booking12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test152");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        double double14 = booking12.calculateFinalCharge();
        double double15 = booking12.calculateFinalCharge();
        int int16 = booking12.getDur();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test153");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking(35, "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]", 0, "hi!", (int) (byte) 0, (int) '4', "hi!", 0.0d, "hi!", false, true, false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test154");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder2.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder2.setDur((int) (short) -1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder8 = bookingBuilder2.setSpaceID(1);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder10 = bookingBuilder2.setBookingID((-1));
        yorku.eecs3311.booking.BookingBuilder bookingBuilder12 = bookingBuilder10.isCheckedOut(false);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder14 = bookingBuilder10.setSpaceID((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder16 = bookingBuilder14.setDate("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder16);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test155");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.toString();
        java.lang.String str17 = booking12.getPaymentMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str16.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test156");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        int int15 = booking12.getSpaceID();
        java.lang.String str16 = booking12.toString();
        double double17 = booking12.getFinalAmountCharged();
        java.lang.String str18 = booking12.toString();
        int int19 = booking12.getSpaceID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str16.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str18.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test157");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder0 = new yorku.eecs3311.booking.BookingBuilder();
        yorku.eecs3311.booking.BookingBuilder bookingBuilder2 = bookingBuilder0.setStartHour((int) (short) 10);
        yorku.eecs3311.booking.BookingBuilder bookingBuilder4 = bookingBuilder0.setPaymentMethod("");
        yorku.eecs3311.booking.BookingBuilder bookingBuilder6 = bookingBuilder0.setDur((int) 'a');
        yorku.eecs3311.booking.Booking booking7 = bookingBuilder6.build();
        boolean boolean8 = booking7.isCheckedOut();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booking7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookingTest0.test158");
        yorku.eecs3311.booking.Booking booking12 = new yorku.eecs3311.booking.Booking((int) '#', "hi!", (int) 'a', "", (-1), 1, "hi!", (double) (short) -1, "", false, false, false);
        double double13 = booking12.calculateFinalCharge();
        int int14 = booking12.getSpaceID();
        java.lang.String str15 = booking12.toString();
        int int16 = booking12.getBookingID();
        int int17 = booking12.getBookingID();
        java.lang.String str18 = booking12.getEmail();
        int int19 = booking12.getBookingID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]" + "'", str15.equals("Booking [bookingID=35, lotName=hi!, spaceID=97, startHour=-1, dur=1, paidBy: hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }
    
}

