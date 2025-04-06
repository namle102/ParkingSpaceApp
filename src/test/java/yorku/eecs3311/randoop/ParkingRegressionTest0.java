package yorku.eecs3311.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParkingRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test001");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        java.util.List<java.lang.String> strList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSpace2.releaseSlots("", strList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test002");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability0 = new yorku.eecs3311.parking.ParkingAvailability();
        java.lang.Class<?> wildcardClass1 = parkingAvailability0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test003");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        yorku.eecs3311.parking.Car car1 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor0.scanCarInfo(car1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test004");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.ParkingSpace parkingSpace7 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability9 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        boolean boolean16 = parkingAvailability9.bookSlots(localDate10, (java.util.List<java.lang.String>) strList14);
        boolean boolean17 = parkingSpace7.bookSlots("", (java.util.List<java.lang.String>) strList14);
        // The following exception was thrown during execution in test generation
        try {
            parkingSpace2.releaseSlots("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", (java.util.List<java.lang.String>) strList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test005");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList5 = parkingSpace2.getSlotsForDate("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test006");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability4 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = parkingAvailability4.bookSlots(localDate5, (java.util.List<java.lang.String>) strList9);
        boolean boolean12 = parkingSpace2.bookSlots("", (java.util.List<java.lang.String>) strList9);
        java.lang.String str13 = parkingSpace2.toString();
        java.lang.String str14 = parkingSpace2.toString();
        parkingSpace2.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str13.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str14.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test007");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.Class<?> wildcardClass6 = car3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test008");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getModel();
        yorku.eecs3311.parking.ParkingSpace parkingSpace11 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability13 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = parkingAvailability13.bookSlots(localDate14, (java.util.List<java.lang.String>) strList18);
        boolean boolean21 = parkingSpace11.bookSlots("", (java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = parkingSpace11.toString();
        java.lang.String str23 = parkingSpace11.toString();
        car3.park(parkingSpace11);
        yorku.eecs3311.parking.ParkingSpace parkingSpace27 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace27.enable();
        car3.park(parkingSpace27);
        java.lang.String str30 = parkingSpace27.toString();
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability32 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate33 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        boolean boolean39 = parkingAvailability32.bookSlots(localDate33, (java.util.List<java.lang.String>) strList37);
        // The following exception was thrown during execution in test generation
        try {
            parkingSpace27.releaseSlots("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]", (java.util.List<java.lang.String>) strList37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str22.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str23.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str30.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test009");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) (short) 100, "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test010");
        yorku.eecs3311.parking.ParkingRate parkingRate0 = yorku.eecs3311.parking.ParkingRate.VISITOR;
        double double1 = parkingRate0.getValue();
        org.junit.Assert.assertTrue("'" + parkingRate0 + "' != '" + yorku.eecs3311.parking.ParkingRate.VISITOR + "'", parkingRate0.equals(yorku.eecs3311.parking.ParkingRate.VISITOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test011");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        yorku.eecs3311.parking.ParkingSpace parkingSpace6 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor7 = parkingSpace6.getSensor();
        int int8 = parkingSpace6.getSpaceID();
        boolean boolean9 = parkingSpace6.isEnabled();
        boolean boolean10 = parkingSpace6.isEnabled();
        int int11 = parkingSpace6.getSpaceID();
        car3.unpark(parkingSpace6);
        yorku.eecs3311.parking.ParkingSpace parkingSpace15 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor16 = parkingSpace15.getSensor();
        int int17 = parkingSpace15.getSpaceID();
        boolean boolean18 = parkingSpace15.isEnabled();
        boolean boolean19 = parkingSpace15.isCarParked();
        java.util.List<java.lang.String> strList20 = parkingSpace15.getAvailableDates();
        car3.park(parkingSpace15);
        yorku.eecs3311.parking.Sensor sensor22 = parkingSpace15.getSensor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor22);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test012");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList6 = parkingSpace2.getSlotsForDate("Space ID: 52 (52) - Enabled");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test013");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor10 = parkingSpace9.getSensor();
        int int11 = parkingSpace9.getSpaceID();
        boolean boolean12 = parkingSpace9.isEnabled();
        boolean boolean13 = parkingSpace9.isEnabled();
        int int14 = parkingSpace9.getSpaceID();
        car3.park(parkingSpace9);
        java.lang.String str16 = car3.getPlateNumber();
        yorku.eecs3311.parking.ParkingSpace parkingSpace17 = null;
        // The following exception was thrown during execution in test generation
        try {
            car3.unpark(parkingSpace17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test014");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        java.lang.Class<?> wildcardClass9 = parkingSpace2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test015");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        boolean boolean6 = parkingSpace2.isCarParked();
        parkingSpace2.enable();
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList9 = parkingSpace2.getSlotsForDate("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test016");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        car3.setPlateNumber("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test017");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.toString();
        java.lang.String str9 = car3.getPlateNumber();
        yorku.eecs3311.parking.Car car13 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        yorku.eecs3311.parking.ParkingSpace parkingSpace16 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor17 = parkingSpace16.getSensor();
        int int18 = parkingSpace16.getSpaceID();
        boolean boolean19 = parkingSpace16.isEnabled();
        boolean boolean20 = parkingSpace16.isEnabled();
        int int21 = parkingSpace16.getSpaceID();
        car13.unpark(parkingSpace16);
        yorku.eecs3311.parking.ParkingSpace parkingSpace25 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor26 = parkingSpace25.getSensor();
        int int27 = parkingSpace25.getSpaceID();
        boolean boolean28 = parkingSpace25.isEnabled();
        boolean boolean29 = parkingSpace25.isCarParked();
        java.util.List<java.lang.String> strList30 = parkingSpace25.getAvailableDates();
        car13.park(parkingSpace25);
        car3.park(parkingSpace25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test018");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        yorku.eecs3311.parking.ParkingSpace parkingSpace6 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor7 = parkingSpace6.getSensor();
        int int8 = parkingSpace6.getSpaceID();
        boolean boolean9 = parkingSpace6.isEnabled();
        boolean boolean10 = parkingSpace6.isEnabled();
        int int11 = parkingSpace6.getSpaceID();
        car3.unpark(parkingSpace6);
        yorku.eecs3311.parking.ParkingSpace parkingSpace15 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor16 = parkingSpace15.getSensor();
        int int17 = parkingSpace15.getSpaceID();
        boolean boolean18 = parkingSpace15.isEnabled();
        boolean boolean19 = parkingSpace15.isCarParked();
        java.util.List<java.lang.String> strList20 = parkingSpace15.getAvailableDates();
        car3.park(parkingSpace15);
        parkingSpace15.enable();
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability24 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate25 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = parkingAvailability24.bookSlots(localDate25, (java.util.List<java.lang.String>) strList29);
        java.time.LocalDate localDate32 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace35 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability37 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate38 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        boolean boolean44 = parkingAvailability37.bookSlots(localDate38, (java.util.List<java.lang.String>) strList42);
        boolean boolean45 = parkingSpace35.bookSlots("", (java.util.List<java.lang.String>) strList42);
        boolean boolean46 = parkingAvailability24.bookSlots(localDate32, (java.util.List<java.lang.String>) strList42);
        java.time.LocalDate localDate47 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "", "Space ID: 52 (52) - Enabled" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        boolean boolean55 = parkingAvailability24.bookSlots(localDate47, (java.util.List<java.lang.String>) strList53);
        // The following exception was thrown during execution in test generation
        try {
            parkingSpace15.releaseSlots("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)", (java.util.List<java.lang.String>) strList53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test019");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        java.lang.Class<?> wildcardClass1 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test020");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        java.util.List<java.lang.String> strList4 = parkingSpace2.getAvailableDates();
        boolean boolean5 = parkingSpace2.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test021");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        boolean boolean2 = timeSlot1.isAvailable();
        timeSlot1.setAvailable(true);
        timeSlot1.setAvailable(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test022");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getModel();
        yorku.eecs3311.parking.ParkingSpace parkingSpace11 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability13 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = parkingAvailability13.bookSlots(localDate14, (java.util.List<java.lang.String>) strList18);
        boolean boolean21 = parkingSpace11.bookSlots("", (java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = parkingSpace11.toString();
        java.lang.String str23 = parkingSpace11.toString();
        car3.park(parkingSpace11);
        java.lang.Class<?> wildcardClass25 = parkingSpace11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str22.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str23.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test023");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        boolean boolean3 = sensor0.isCarParked();
        sensor0.clearCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test024");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.clearCarInfo();
        sensor0.sendCarInfo();
        sensor0.sendCarInfo();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test025");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) ' ', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.Sensor sensor4 = parkingSpace2.getSensor();
        sensor4.sendCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test026");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        boolean boolean3 = sensor0.isCarParked();
        sensor0.sendCarInfo();
        sensor0.sendCarInfo();
        sensor0.sendCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test027");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("", "", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        car3.setPlateNumber("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test028");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        java.lang.String str2 = timeSlot1.getTime();
        boolean boolean3 = timeSlot1.isAvailable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str2.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test029");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str4 = car3.getMake();
        yorku.eecs3311.parking.ParkingSpace parkingSpace7 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace7.getSensor();
        int int9 = parkingSpace7.getSpaceID();
        boolean boolean10 = parkingSpace7.isEnabled();
        boolean boolean11 = parkingSpace7.isCarParked();
        car3.unpark(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str4.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test030");
        yorku.eecs3311.parking.ParkingRate parkingRate0 = yorku.eecs3311.parking.ParkingRate.STUDENT;
        double double1 = parkingRate0.getValue();
        double double2 = parkingRate0.getValue();
        org.junit.Assert.assertTrue("'" + parkingRate0 + "' != '" + yorku.eecs3311.parking.ParkingRate.STUDENT + "'", parkingRate0.equals(yorku.eecs3311.parking.ParkingRate.STUDENT));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test031");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getModel();
        java.lang.String str8 = car3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str7.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test032");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        boolean boolean4 = parkingSpace2.isCarParked();
        boolean boolean5 = parkingSpace2.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test033");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getPlateNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test034");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.disableSpace((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test035");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.clearCarInfo();
        yorku.eecs3311.parking.Car car5 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car5.setMake("hi!");
        java.lang.String str8 = car5.toString();
        java.lang.String str9 = car5.getPlateNumber();
        java.lang.String str10 = car5.getModel();
        yorku.eecs3311.parking.ParkingSpace parkingSpace13 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability15 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        boolean boolean22 = parkingAvailability15.bookSlots(localDate16, (java.util.List<java.lang.String>) strList20);
        boolean boolean23 = parkingSpace13.bookSlots("", (java.util.List<java.lang.String>) strList20);
        java.lang.String str24 = parkingSpace13.toString();
        java.lang.String str25 = parkingSpace13.toString();
        car5.park(parkingSpace13);
        car5.setPlateNumber("Space ID: 52 (52) - Enabled");
        sensor0.scanCarInfo(car5);
        sensor0.sendCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str10.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str24.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str25.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test036");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Space ID: 52 (52) - Enabled", "");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test037");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("52");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test038");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getModel();
        java.lang.String str9 = car3.toString();
        java.lang.String str10 = car3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str9.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str10.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test039");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        boolean boolean6 = parkingSpace2.isCarParked();
        parkingSpace2.enable();
        yorku.eecs3311.parking.ParkingSpace parkingSpace11 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability13 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = parkingAvailability13.bookSlots(localDate14, (java.util.List<java.lang.String>) strList18);
        boolean boolean21 = parkingSpace11.bookSlots("", (java.util.List<java.lang.String>) strList18);
        boolean boolean22 = parkingSpace2.bookSlots("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]", (java.util.List<java.lang.String>) strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test040");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getModel();
        yorku.eecs3311.parking.ParkingSpace parkingSpace11 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability13 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = parkingAvailability13.bookSlots(localDate14, (java.util.List<java.lang.String>) strList18);
        boolean boolean21 = parkingSpace11.bookSlots("", (java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = parkingSpace11.toString();
        java.lang.String str23 = parkingSpace11.toString();
        car3.park(parkingSpace11);
        yorku.eecs3311.parking.ParkingSpace parkingSpace27 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace27.enable();
        car3.park(parkingSpace27);
        java.lang.String str30 = car3.getMake();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str22.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str23.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test041");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test042");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        sensor8.clearCarInfo();
        sensor8.sendCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test043");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.Sensor sensor9 = parkingSpace2.getSensor();
        java.lang.Class<?> wildcardClass10 = sensor9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test044");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.clearCarInfo();
        sensor0.sendCarInfo();
        java.lang.Class<?> wildcardClass3 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test045");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        sensor3.sendCarInfo();
        boolean boolean5 = sensor3.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test046");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability4 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = parkingAvailability4.bookSlots(localDate5, (java.util.List<java.lang.String>) strList9);
        boolean boolean12 = parkingSpace2.bookSlots("", (java.util.List<java.lang.String>) strList9);
        java.lang.String str13 = parkingSpace2.toString();
        java.lang.String str14 = parkingSpace2.toString();
        java.lang.String str15 = parkingSpace2.toString();
        parkingSpace2.enable();
        parkingSpace2.disable();
        parkingSpace2.enable();
        yorku.eecs3311.parking.ParkingSpace parkingSpace22 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor23 = parkingSpace22.getSensor();
        int int24 = parkingSpace22.getSpaceID();
        boolean boolean25 = parkingSpace22.isEnabled();
        java.util.List<java.lang.String> strList26 = parkingSpace22.getAvailableDates();
        // The following exception was thrown during execution in test generation
        try {
            parkingSpace2.releaseSlots("52", strList26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str13.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str14.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str15.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test047");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability4 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = parkingAvailability4.bookSlots(localDate5, (java.util.List<java.lang.String>) strList9);
        boolean boolean12 = parkingSpace2.bookSlots("", (java.util.List<java.lang.String>) strList9);
        java.lang.String str13 = parkingSpace2.toString();
        java.lang.String str14 = parkingSpace2.toString();
        boolean boolean15 = parkingSpace2.isEnabled();
        boolean boolean16 = parkingSpace2.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str13.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str14.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test048");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        yorku.eecs3311.parking.Car car5 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car5.setMake("hi!");
        car5.setMake("");
        java.lang.String str10 = car5.toString();
        java.lang.String str11 = car5.getMake();
        java.lang.String str12 = car5.toString();
        sensor0.scanCarInfo(car5);
        boolean boolean14 = sensor0.isCarParked();
        java.lang.Class<?> wildcardClass15 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str10.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str12.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test049");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability0 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        boolean boolean7 = parkingAvailability0.bookSlots(localDate1, (java.util.List<java.lang.String>) strList5);
        java.time.LocalDate localDate8 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace11 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability13 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = parkingAvailability13.bookSlots(localDate14, (java.util.List<java.lang.String>) strList18);
        boolean boolean21 = parkingSpace11.bookSlots("", (java.util.List<java.lang.String>) strList18);
        boolean boolean22 = parkingAvailability0.bookSlots(localDate8, (java.util.List<java.lang.String>) strList18);
        java.time.LocalDate localDate23 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "", "Space ID: 52 (52) - Enabled" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = parkingAvailability0.bookSlots(localDate23, (java.util.List<java.lang.String>) strList29);
        java.time.LocalDate localDate32 = null;
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability33 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate34 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        boolean boolean40 = parkingAvailability33.bookSlots(localDate34, (java.util.List<java.lang.String>) strList38);
        java.time.LocalDate localDate41 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace44 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability46 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate47 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        boolean boolean53 = parkingAvailability46.bookSlots(localDate47, (java.util.List<java.lang.String>) strList51);
        boolean boolean54 = parkingSpace44.bookSlots("", (java.util.List<java.lang.String>) strList51);
        boolean boolean55 = parkingAvailability33.bookSlots(localDate41, (java.util.List<java.lang.String>) strList51);
        java.time.LocalDate localDate56 = null;
        java.lang.String[] strArray61 = new java.lang.String[] { "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "", "Space ID: 52 (52) - Enabled" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        boolean boolean64 = parkingAvailability33.bookSlots(localDate56, (java.util.List<java.lang.String>) strList62);
        boolean boolean65 = parkingAvailability0.bookSlots(localDate32, (java.util.List<java.lang.String>) strList62);
        java.time.LocalDate localDate66 = null;
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList67 = parkingAvailability0.getSlotsForDate(localDate66);
        java.time.LocalDate localDate68 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace71 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability73 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate74 = null;
        java.lang.String[] strArray77 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        boolean boolean80 = parkingAvailability73.bookSlots(localDate74, (java.util.List<java.lang.String>) strList78);
        boolean boolean81 = parkingSpace71.bookSlots("", (java.util.List<java.lang.String>) strList78);
        java.lang.String str82 = parkingSpace71.toString();
        java.lang.String str83 = parkingSpace71.toString();
        java.lang.String str84 = parkingSpace71.toString();
        java.util.List<java.lang.String> strList85 = parkingSpace71.getAvailableDates();
        boolean boolean86 = parkingAvailability0.bookSlots(localDate68, strList85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeSlotList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str82.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str83.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str84.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test050");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace(0, "Space ID: 52 (52) - Enabled");
        boolean boolean3 = parkingSpace2.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test051");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getModel();
        car3.setMake("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)");
        car3.setModel("52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test052");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) ' ');
        parkingLot1.enableSpace(52);
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = parkingLot1.getSpaceById(0);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList10 = parkingLot1.getSpaces();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList11 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test053");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        parkingSpace2.disable();
        parkingSpace2.enable();
        java.util.List<java.lang.String> strList12 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSpace2.releaseSlots("Space ID: 52 (52) - Enabled", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test054");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.Sensor sensor9 = parkingSpace2.getSensor();
        boolean boolean10 = sensor9.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test055");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.clearCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        boolean boolean3 = sensor0.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test056");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) ' ');
        parkingLot1.disableSpace((int) (short) 10);
        java.lang.Class<?> wildcardClass8 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test057");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        boolean boolean2 = timeSlot1.isAvailable();
        java.lang.String str3 = timeSlot1.toString();
        timeSlot1.setBooked(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str3.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test058");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        boolean boolean7 = parkingSpace2.isEnabled();
        parkingSpace2.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test059");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        boolean boolean8 = parkingSpace2.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test060");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) ' ', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.Sensor sensor4 = parkingSpace2.getSensor();
        int int5 = parkingSpace2.getSpaceID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test061");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        sensor0.clearCarInfo();
        yorku.eecs3311.parking.Car car7 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str8 = car7.getMake();
        car7.setPlateNumber("");
        sensor0.scanCarInfo(car7);
        yorku.eecs3311.parking.ParkingSpace parkingSpace12 = null;
        // The following exception was thrown during execution in test generation
        try {
            car7.unpark(parkingSpace12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test062");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) 'a', "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test063");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor10 = parkingSpace9.getSensor();
        int int11 = parkingSpace9.getSpaceID();
        boolean boolean12 = parkingSpace9.isEnabled();
        boolean boolean13 = parkingSpace9.isEnabled();
        int int14 = parkingSpace9.getSpaceID();
        car3.park(parkingSpace9);
        java.lang.String str16 = car3.getPlateNumber();
        java.lang.String str17 = car3.getModel();
        java.lang.String str18 = car3.getModel();
        car3.setModel("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str17.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str18.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test064");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability0 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        boolean boolean7 = parkingAvailability0.bookSlots(localDate1, (java.util.List<java.lang.String>) strList5);
        java.time.LocalDate localDate8 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace11 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability13 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = parkingAvailability13.bookSlots(localDate14, (java.util.List<java.lang.String>) strList18);
        boolean boolean21 = parkingSpace11.bookSlots("", (java.util.List<java.lang.String>) strList18);
        boolean boolean22 = parkingAvailability0.bookSlots(localDate8, (java.util.List<java.lang.String>) strList18);
        java.time.LocalDate localDate23 = null;
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList24 = parkingAvailability0.getSlotsForDate(localDate23);
        java.time.LocalDate localDate25 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)", "", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        boolean boolean34 = parkingAvailability0.bookSlots(localDate25, (java.util.List<java.lang.String>) strList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeSlotList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test065");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        boolean boolean7 = parkingSpace2.isEnabled();
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList9 = parkingSpace2.getSlotsForDate("52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test066");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        sensor3.sendCarInfo();
        yorku.eecs3311.parking.Sensor sensor5 = new yorku.eecs3311.parking.Sensor();
        sensor5.sendCarInfo();
        boolean boolean7 = sensor5.isCarParked();
        boolean boolean8 = sensor5.isCarParked();
        yorku.eecs3311.parking.Sensor sensor9 = new yorku.eecs3311.parking.Sensor();
        sensor9.sendCarInfo();
        boolean boolean11 = sensor9.isCarParked();
        sensor9.clearCarInfo();
        yorku.eecs3311.parking.Car car16 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str17 = car16.getMake();
        car16.setPlateNumber("");
        sensor9.scanCarInfo(car16);
        sensor5.scanCarInfo(car16);
        java.lang.String str22 = car16.getPlateNumber();
        sensor3.scanCarInfo(car16);
        car16.setModel("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str17.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test067");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList2 = parkingLot1.getSpaces();
        java.lang.String str3 = parkingLot1.getLotName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test068");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor10 = parkingSpace9.getSensor();
        int int11 = parkingSpace9.getSpaceID();
        boolean boolean12 = parkingSpace9.isEnabled();
        boolean boolean13 = parkingSpace9.isEnabled();
        int int14 = parkingSpace9.getSpaceID();
        car3.park(parkingSpace9);
        java.lang.String str16 = car3.getPlateNumber();
        java.lang.String str17 = car3.getModel();
        car3.setModel("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        java.lang.String str20 = car3.getMake();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str17.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test069");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) ' ', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability4 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = parkingAvailability4.bookSlots(localDate5, (java.util.List<java.lang.String>) strList9);
        java.time.LocalDate localDate12 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace15 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability17 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate18 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        boolean boolean24 = parkingAvailability17.bookSlots(localDate18, (java.util.List<java.lang.String>) strList22);
        boolean boolean25 = parkingSpace15.bookSlots("", (java.util.List<java.lang.String>) strList22);
        boolean boolean26 = parkingAvailability4.bookSlots(localDate12, (java.util.List<java.lang.String>) strList22);
        java.time.LocalDate localDate27 = null;
        java.lang.String[] strArray32 = new java.lang.String[] { "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "", "Space ID: 52 (52) - Enabled" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        boolean boolean35 = parkingAvailability4.bookSlots(localDate27, (java.util.List<java.lang.String>) strList33);
        java.time.LocalDate localDate36 = null;
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability37 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate38 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        boolean boolean44 = parkingAvailability37.bookSlots(localDate38, (java.util.List<java.lang.String>) strList42);
        java.time.LocalDate localDate45 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace48 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability50 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate51 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        boolean boolean57 = parkingAvailability50.bookSlots(localDate51, (java.util.List<java.lang.String>) strList55);
        boolean boolean58 = parkingSpace48.bookSlots("", (java.util.List<java.lang.String>) strList55);
        boolean boolean59 = parkingAvailability37.bookSlots(localDate45, (java.util.List<java.lang.String>) strList55);
        java.time.LocalDate localDate60 = null;
        java.lang.String[] strArray65 = new java.lang.String[] { "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "", "Space ID: 52 (52) - Enabled" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        boolean boolean68 = parkingAvailability37.bookSlots(localDate60, (java.util.List<java.lang.String>) strList66);
        boolean boolean69 = parkingAvailability4.bookSlots(localDate36, (java.util.List<java.lang.String>) strList66);
        java.time.LocalDate localDate70 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace73 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace73.enable();
        java.util.List<java.lang.String> strList75 = parkingSpace73.getAvailableDates();
        boolean boolean76 = parkingAvailability4.bookSlots(localDate70, strList75);
        boolean boolean77 = parkingSpace2.bookSlots("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)", strList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test070");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        boolean boolean9 = sensor8.isCarParked();
        yorku.eecs3311.parking.Sensor sensor10 = new yorku.eecs3311.parking.Sensor();
        sensor10.sendCarInfo();
        yorku.eecs3311.parking.Car car15 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car15.setMake("hi!");
        car15.setMake("");
        java.lang.String str20 = car15.toString();
        java.lang.String str21 = car15.getMake();
        java.lang.String str22 = car15.toString();
        sensor10.scanCarInfo(car15);
        sensor8.scanCarInfo(car15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str20.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str22.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test071");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace(0, "Space ID: 52 (52) - Enabled");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test072");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) ' ');
        parkingLot1.disable();
        parkingLot1.enableSpace(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test073");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        parkingSpace2.disable();
        parkingSpace2.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test074");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) ' ', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.Sensor sensor4 = parkingSpace2.getSensor();
        boolean boolean5 = parkingSpace2.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test075");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        boolean boolean4 = parkingLot1.isEnabled();
        parkingLot1.disableSpace((int) (short) 10);
        parkingLot1.disable();
        parkingLot1.disableSpace(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test076");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        boolean boolean2 = timeSlot1.isAvailable();
        java.lang.String str3 = timeSlot1.toString();
        java.lang.String str4 = timeSlot1.toString();
        boolean boolean5 = timeSlot1.isAvailable();
        boolean boolean6 = timeSlot1.isAvailable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str3.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str4.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test077");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) (short) -1, "Space ID: 52 (52) - Enabled");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test078");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) ' ');
        parkingLot1.disableSpace((int) (short) 10);
        parkingLot1.disable();
        java.lang.Class<?> wildcardClass9 = parkingLot1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test079");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        yorku.eecs3311.parking.Car car6 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car6.setMake("hi!");
        car6.setMake("");
        java.lang.String str11 = car6.toString();
        sensor0.scanCarInfo(car6);
        yorku.eecs3311.parking.ParkingSpace parkingSpace15 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace15.disable();
        car6.unpark(parkingSpace15);
        java.lang.String str18 = car6.getModel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str11.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str18.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test080");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getMake();
        car3.setPlateNumber("Space ID: 52 (52) - Enabled");
        car3.setModel("52");
        java.lang.Class<?> wildcardClass13 = car3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test081");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.toString();
        car3.setPlateNumber("Space ID: 52 (52) - Enabled");
        java.lang.String str11 = car3.getModel();
        java.lang.String str12 = car3.getPlateNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str11.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str12.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test082");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        sensor3.sendCarInfo();
        yorku.eecs3311.parking.Sensor sensor5 = new yorku.eecs3311.parking.Sensor();
        sensor5.sendCarInfo();
        boolean boolean7 = sensor5.isCarParked();
        boolean boolean8 = sensor5.isCarParked();
        yorku.eecs3311.parking.Sensor sensor9 = new yorku.eecs3311.parking.Sensor();
        sensor9.sendCarInfo();
        boolean boolean11 = sensor9.isCarParked();
        sensor9.clearCarInfo();
        yorku.eecs3311.parking.Car car16 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str17 = car16.getMake();
        car16.setPlateNumber("");
        sensor9.scanCarInfo(car16);
        sensor5.scanCarInfo(car16);
        java.lang.String str22 = car16.getPlateNumber();
        sensor3.scanCarInfo(car16);
        java.lang.String str24 = car16.getPlateNumber();
        car16.setPlateNumber("Space ID: 52 (52) - Enabled");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str17.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test083");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getModel();
        car3.setPlateNumber("hi!");
        java.lang.String str11 = car3.getMake();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test084");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("52", "hi!", "Space ID: 52 (52) - Enabled");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test085");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) (byte) 1, "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)");
        int int3 = parkingSpace2.getSpaceID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test086");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.toString();
        car3.setPlateNumber("Space ID: 52 (52) - Enabled");
        java.lang.String str11 = car3.getPlateNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str11.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test087");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        sensor0.clearCarInfo();
        yorku.eecs3311.parking.Car car7 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str8 = car7.getMake();
        car7.setPlateNumber("");
        sensor0.scanCarInfo(car7);
        java.lang.String str12 = car7.getPlateNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test088");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.disable();
        yorku.eecs3311.parking.Sensor sensor4 = parkingSpace2.getSensor();
        parkingSpace2.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test089");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        boolean boolean6 = parkingSpace2.isCarParked();
        boolean boolean7 = parkingSpace2.isEnabled();
        java.lang.Class<?> wildcardClass8 = parkingSpace2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test090");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        timeSlot1.setBooked(true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test091");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        java.util.List<java.lang.String> strList4 = parkingSpace2.getAvailableDates();
        parkingSpace2.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test092");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.getModel();
        car3.setModel("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test093");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        boolean boolean4 = parkingSpace2.isCarParked();
        java.lang.String str5 = parkingSpace2.toString();
        yorku.eecs3311.parking.Sensor sensor6 = parkingSpace2.getSensor();
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList8 = parkingSpace2.getSlotsForDate("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str5.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test094");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "", "hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test095");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) ' ');
        parkingLot1.enableSpace(52);
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = parkingLot1.getSpaceById(0);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList10 = parkingLot1.getSpaces();
        parkingLot1.enableSpace((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test096");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) ' ');
        parkingLot1.disableSpace((int) (short) 10);
        parkingLot1.enableSpace((int) (byte) 1);
        parkingLot1.disable();
        parkingLot1.disableSpace((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test097");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        boolean boolean2 = timeSlot1.isAvailable();
        java.lang.String str3 = timeSlot1.toString();
        java.lang.String str4 = timeSlot1.toString();
        java.lang.String str5 = timeSlot1.toString();
        java.lang.String str6 = timeSlot1.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str3.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str4.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str5.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test098");
        yorku.eecs3311.parking.ParkingRate parkingRate0 = yorku.eecs3311.parking.ParkingRate.STAFF;
        double double1 = parkingRate0.getValue();
        double double2 = parkingRate0.getValue();
        org.junit.Assert.assertTrue("'" + parkingRate0 + "' != '" + yorku.eecs3311.parking.ParkingRate.STAFF + "'", parkingRate0.equals(yorku.eecs3311.parking.ParkingRate.STAFF));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test099");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.Sensor sensor9 = parkingSpace2.getSensor();
        sensor9.sendCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test100");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.getModel();
        car3.setMake("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test101");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)");
        java.lang.String str2 = timeSlot1.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str2.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test102");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        yorku.eecs3311.parking.ParkingSpace parkingSpace6 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor7 = parkingSpace6.getSensor();
        int int8 = parkingSpace6.getSpaceID();
        boolean boolean9 = parkingSpace6.isEnabled();
        boolean boolean10 = parkingSpace6.isEnabled();
        int int11 = parkingSpace6.getSpaceID();
        car3.unpark(parkingSpace6);
        yorku.eecs3311.parking.ParkingSpace parkingSpace15 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor16 = parkingSpace15.getSensor();
        int int17 = parkingSpace15.getSpaceID();
        boolean boolean18 = parkingSpace15.isEnabled();
        boolean boolean19 = parkingSpace15.isCarParked();
        java.util.List<java.lang.String> strList20 = parkingSpace15.getAvailableDates();
        car3.park(parkingSpace15);
        parkingSpace15.enable();
        boolean boolean23 = parkingSpace15.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test103");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("Space ID: 52 (52) - Enabled");
        parkingLot1.enable();
        parkingLot1.disableSpace(0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test104");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        car3.setModel("52");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test105");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) (byte) -1);
        parkingLot1.disable();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test106");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("Space ID: 52 (52) - Enabled");
        yorku.eecs3311.parking.ParkingSpace parkingSpace3 = parkingLot1.getSpaceById((int) (byte) 1);
        java.lang.String str4 = parkingSpace3.toString();
        yorku.eecs3311.parking.Sensor sensor5 = parkingSpace3.getSensor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled" + "'", str4.equals("Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test107");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        java.util.List<java.lang.String> strList4 = parkingSpace2.getAvailableDates();
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList6 = parkingSpace2.getSlotsForDate("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)");
        yorku.eecs3311.parking.Sensor sensor7 = parkingSpace2.getSensor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test108");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        yorku.eecs3311.parking.ParkingSpace parkingSpace6 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor7 = parkingSpace6.getSensor();
        int int8 = parkingSpace6.getSpaceID();
        boolean boolean9 = parkingSpace6.isEnabled();
        boolean boolean10 = parkingSpace6.isEnabled();
        int int11 = parkingSpace6.getSpaceID();
        car3.unpark(parkingSpace6);
        boolean boolean13 = parkingSpace6.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test109");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        sensor3.sendCarInfo();
        yorku.eecs3311.parking.Car car8 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car8.setMake("hi!");
        java.lang.String str11 = car8.toString();
        java.lang.String str12 = car8.getPlateNumber();
        java.lang.String str13 = car8.getMake();
        sensor3.scanCarInfo(car8);
        yorku.eecs3311.parking.ParkingSpace parkingSpace17 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor18 = parkingSpace17.getSensor();
        int int19 = parkingSpace17.getSpaceID();
        boolean boolean20 = parkingSpace17.isEnabled();
        java.util.List<java.lang.String> strList21 = parkingSpace17.getAvailableDates();
        parkingSpace17.enable();
        parkingSpace17.enable();
        car8.unpark(parkingSpace17);
        java.lang.Class<?> wildcardClass25 = car8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str11.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test110");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) (short) -1, "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList4 = parkingSpace2.getSlotsForDate("hi!");
        boolean boolean5 = parkingSpace2.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test111");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) ' ');
        parkingLot1.enableSpace(52);
        parkingLot1.enable();
        java.lang.String str9 = parkingLot1.getLotName();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test112");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        boolean boolean2 = timeSlot1.isAvailable();
        java.lang.String str3 = timeSlot1.getTime();
        timeSlot1.setBooked(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str3.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test113");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        sensor0.clearCarInfo();
        sensor0.clearCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test114");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("52", "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled");
        java.lang.String str4 = car3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Car [make=52, model=Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=], plateNumber=Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled]" + "'", str4.equals("Car [make=52, model=Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=], plateNumber=Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled]"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test115");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.disable();
        java.lang.String str4 = parkingSpace2.getSpaceLocation();
        boolean boolean5 = parkingSpace2.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "52" + "'", str4.equals("52"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test116");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        java.util.List<java.lang.String> strList4 = parkingSpace2.getAvailableDates();
        boolean boolean5 = parkingSpace2.isCarParked();
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor10 = parkingSpace9.getSensor();
        int int11 = parkingSpace9.getSpaceID();
        boolean boolean12 = parkingSpace9.isEnabled();
        boolean boolean13 = parkingSpace9.isCarParked();
        java.util.List<java.lang.String> strList14 = parkingSpace9.getAvailableDates();
        boolean boolean15 = parkingSpace2.bookSlots("Space ID: 52 (52) - Enabled", strList14);
        yorku.eecs3311.parking.Sensor sensor16 = parkingSpace2.getSensor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor16);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test117");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability0 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        boolean boolean7 = parkingAvailability0.bookSlots(localDate1, (java.util.List<java.lang.String>) strList5);
        java.time.LocalDate localDate8 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace11 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability13 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = parkingAvailability13.bookSlots(localDate14, (java.util.List<java.lang.String>) strList18);
        boolean boolean21 = parkingSpace11.bookSlots("", (java.util.List<java.lang.String>) strList18);
        boolean boolean22 = parkingAvailability0.bookSlots(localDate8, (java.util.List<java.lang.String>) strList18);
        java.time.LocalDate localDate23 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "", "Space ID: 52 (52) - Enabled" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = parkingAvailability0.bookSlots(localDate23, (java.util.List<java.lang.String>) strList29);
        java.time.LocalDate localDate32 = null;
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability33 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate34 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        boolean boolean40 = parkingAvailability33.bookSlots(localDate34, (java.util.List<java.lang.String>) strList38);
        java.time.LocalDate localDate41 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace44 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability46 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate47 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        boolean boolean53 = parkingAvailability46.bookSlots(localDate47, (java.util.List<java.lang.String>) strList51);
        boolean boolean54 = parkingSpace44.bookSlots("", (java.util.List<java.lang.String>) strList51);
        boolean boolean55 = parkingAvailability33.bookSlots(localDate41, (java.util.List<java.lang.String>) strList51);
        java.time.LocalDate localDate56 = null;
        java.lang.String[] strArray61 = new java.lang.String[] { "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "", "Space ID: 52 (52) - Enabled" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        boolean boolean64 = parkingAvailability33.bookSlots(localDate56, (java.util.List<java.lang.String>) strList62);
        boolean boolean65 = parkingAvailability0.bookSlots(localDate32, (java.util.List<java.lang.String>) strList62);
        java.time.LocalDate localDate66 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace69 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace69.enable();
        java.util.List<java.lang.String> strList71 = parkingSpace69.getAvailableDates();
        boolean boolean72 = parkingAvailability0.bookSlots(localDate66, strList71);
        java.time.LocalDate localDate73 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace76 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor77 = parkingSpace76.getSensor();
        int int78 = parkingSpace76.getSpaceID();
        boolean boolean79 = parkingSpace76.isEnabled();
        java.util.List<java.lang.String> strList80 = parkingSpace76.getAvailableDates();
        boolean boolean81 = parkingAvailability0.bookSlots(localDate73, strList80);
        java.time.LocalDate localDate82 = null;
        java.util.List<java.lang.String> strList83 = null;
        boolean boolean84 = parkingAvailability0.bookSlots(localDate82, strList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 52 + "'", int78 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test118");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor10 = parkingSpace9.getSensor();
        int int11 = parkingSpace9.getSpaceID();
        boolean boolean12 = parkingSpace9.isEnabled();
        boolean boolean13 = parkingSpace9.isEnabled();
        int int14 = parkingSpace9.getSpaceID();
        car3.park(parkingSpace9);
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability17 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate18 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        boolean boolean24 = parkingAvailability17.bookSlots(localDate18, (java.util.List<java.lang.String>) strList22);
        java.time.LocalDate localDate25 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace28 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability30 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate31 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        boolean boolean37 = parkingAvailability30.bookSlots(localDate31, (java.util.List<java.lang.String>) strList35);
        boolean boolean38 = parkingSpace28.bookSlots("", (java.util.List<java.lang.String>) strList35);
        boolean boolean39 = parkingAvailability17.bookSlots(localDate25, (java.util.List<java.lang.String>) strList35);
        java.time.LocalDate localDate40 = null;
        java.lang.String[] strArray45 = new java.lang.String[] { "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "", "Space ID: 52 (52) - Enabled" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        boolean boolean48 = parkingAvailability17.bookSlots(localDate40, (java.util.List<java.lang.String>) strList46);
        java.time.LocalDate localDate49 = null;
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability50 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate51 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        boolean boolean57 = parkingAvailability50.bookSlots(localDate51, (java.util.List<java.lang.String>) strList55);
        java.time.LocalDate localDate58 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace61 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability63 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate64 = null;
        java.lang.String[] strArray67 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        boolean boolean70 = parkingAvailability63.bookSlots(localDate64, (java.util.List<java.lang.String>) strList68);
        boolean boolean71 = parkingSpace61.bookSlots("", (java.util.List<java.lang.String>) strList68);
        boolean boolean72 = parkingAvailability50.bookSlots(localDate58, (java.util.List<java.lang.String>) strList68);
        java.time.LocalDate localDate73 = null;
        java.lang.String[] strArray78 = new java.lang.String[] { "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "", "Space ID: 52 (52) - Enabled" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        boolean boolean81 = parkingAvailability50.bookSlots(localDate73, (java.util.List<java.lang.String>) strList79);
        boolean boolean82 = parkingAvailability17.bookSlots(localDate49, (java.util.List<java.lang.String>) strList79);
        boolean boolean83 = parkingSpace9.bookSlots("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", (java.util.List<java.lang.String>) strList79);
        boolean boolean84 = parkingSpace9.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test119");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        boolean boolean3 = sensor0.isCarParked();
        yorku.eecs3311.parking.Sensor sensor4 = new yorku.eecs3311.parking.Sensor();
        sensor4.sendCarInfo();
        boolean boolean6 = sensor4.isCarParked();
        sensor4.clearCarInfo();
        yorku.eecs3311.parking.Car car11 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str12 = car11.getMake();
        car11.setPlateNumber("");
        sensor4.scanCarInfo(car11);
        sensor0.scanCarInfo(car11);
        sensor0.clearCarInfo();
        yorku.eecs3311.parking.Car car21 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str22 = car21.getMake();
        car21.setPlateNumber("");
        sensor0.scanCarInfo(car21);
        sensor0.sendCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str12.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str22.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test120");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        boolean boolean4 = parkingLot1.isEnabled();
        parkingLot1.disableSpace((int) (short) 10);
        parkingLot1.enable();
        parkingLot1.disableSpace((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test121");
        yorku.eecs3311.parking.ParkingRate parkingRate0 = yorku.eecs3311.parking.ParkingRate.FACULTY;
        double double1 = parkingRate0.getValue();
        org.junit.Assert.assertTrue("'" + parkingRate0 + "' != '" + yorku.eecs3311.parking.ParkingRate.FACULTY + "'", parkingRate0.equals(yorku.eecs3311.parking.ParkingRate.FACULTY));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test122");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        sensor3.clearCarInfo();
        sensor3.clearCarInfo();
        sensor3.clearCarInfo();
        boolean boolean7 = sensor3.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test123");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test124");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '#', "Car [make=52, model=Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=], plateNumber=Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled]");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test125");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) (byte) -1);
        boolean boolean5 = parkingLot1.isEnabled();
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test126");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        boolean boolean2 = timeSlot1.isAvailable();
        java.lang.String str3 = timeSlot1.getTime();
        java.lang.String str4 = timeSlot1.getTime();
        boolean boolean5 = timeSlot1.isAvailable();
        boolean boolean6 = timeSlot1.isAvailable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str3.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str4.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test127");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Car [make=52, model=Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=], plateNumber=Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled]", "52", "Space ID: 52 (52) - Enabled");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test128");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        boolean boolean1 = sensor0.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test129");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        boolean boolean4 = parkingSpace2.isCarParked();
        java.lang.String str5 = parkingSpace2.toString();
        yorku.eecs3311.parking.Sensor sensor6 = parkingSpace2.getSensor();
        java.lang.String str7 = parkingSpace2.getSpaceLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str5.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "52" + "'", str7.equals("52"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test130");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) ' ');
        parkingLot1.enableSpace(52);
        parkingLot1.enable();
        java.lang.String str9 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test131");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("Space ID: 52 (52) - Enabled");
        yorku.eecs3311.parking.ParkingSpace parkingSpace3 = parkingLot1.getSpaceById((int) ' ');
        parkingLot1.disable();
        yorku.eecs3311.parking.ParkingSpace parkingSpace6 = parkingLot1.getSpaceById(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test132");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.clearCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        sensor0.clearCarInfo();
        sensor0.sendCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test133");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        boolean boolean4 = parkingSpace2.isCarParked();
        java.lang.String str5 = parkingSpace2.toString();
        yorku.eecs3311.parking.Sensor sensor6 = parkingSpace2.getSensor();
        java.util.List<java.lang.String> strList7 = parkingSpace2.getAvailableDates();
        boolean boolean8 = parkingSpace2.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str5.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test134");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled", "hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test135");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) (short) 1, "Space ID: 52 (52) - Enabled");
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList4 = parkingSpace2.getSlotsForDate("hi!");
        java.lang.String str5 = parkingSpace2.getSpaceLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Space ID: 52 (52) - Enabled1" + "'", str5.equals("Space ID: 52 (52) - Enabled1"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test136");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        yorku.eecs3311.parking.ParkingSpace parkingSpace6 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor7 = parkingSpace6.getSensor();
        int int8 = parkingSpace6.getSpaceID();
        boolean boolean9 = parkingSpace6.isEnabled();
        boolean boolean10 = parkingSpace6.isEnabled();
        int int11 = parkingSpace6.getSpaceID();
        car3.unpark(parkingSpace6);
        yorku.eecs3311.parking.ParkingSpace parkingSpace15 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor16 = parkingSpace15.getSensor();
        int int17 = parkingSpace15.getSpaceID();
        boolean boolean18 = parkingSpace15.isEnabled();
        boolean boolean19 = parkingSpace15.isCarParked();
        java.util.List<java.lang.String> strList20 = parkingSpace15.getAvailableDates();
        car3.park(parkingSpace15);
        car3.setModel("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test137");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor10 = parkingSpace9.getSensor();
        int int11 = parkingSpace9.getSpaceID();
        boolean boolean12 = parkingSpace9.isEnabled();
        boolean boolean13 = parkingSpace9.isEnabled();
        int int14 = parkingSpace9.getSpaceID();
        car3.park(parkingSpace9);
        java.lang.String str16 = car3.getPlateNumber();
        car3.setModel("hi!");
        yorku.eecs3311.parking.ParkingSpace parkingSpace21 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor22 = parkingSpace21.getSensor();
        int int23 = parkingSpace21.getSpaceID();
        boolean boolean24 = parkingSpace21.isEnabled();
        boolean boolean25 = parkingSpace21.isCarParked();
        boolean boolean26 = parkingSpace21.isEnabled();
        car3.unpark(parkingSpace21);
        yorku.eecs3311.parking.Car car31 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str32 = car31.getMake();
        car31.setPlateNumber("");
        yorku.eecs3311.parking.ParkingSpace parkingSpace37 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability39 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate40 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        boolean boolean46 = parkingAvailability39.bookSlots(localDate40, (java.util.List<java.lang.String>) strList44);
        boolean boolean47 = parkingSpace37.bookSlots("", (java.util.List<java.lang.String>) strList44);
        java.lang.String str48 = parkingSpace37.toString();
        java.lang.String str49 = parkingSpace37.toString();
        boolean boolean50 = parkingSpace37.isEnabled();
        car31.park(parkingSpace37);
        car3.park(parkingSpace37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str32.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str48.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str49.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test138");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.disable();
        java.lang.String str4 = parkingSpace2.getSpaceLocation();
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList6 = parkingSpace2.getSlotsForDate("52");
        int int7 = parkingSpace2.getSpaceID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "52" + "'", str4.equals("52"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeSlotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test139");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getModel();
        yorku.eecs3311.parking.ParkingSpace parkingSpace11 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability13 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = parkingAvailability13.bookSlots(localDate14, (java.util.List<java.lang.String>) strList18);
        boolean boolean21 = parkingSpace11.bookSlots("", (java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = parkingSpace11.toString();
        java.lang.String str23 = parkingSpace11.toString();
        car3.park(parkingSpace11);
        yorku.eecs3311.parking.ParkingSpace parkingSpace27 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace27.enable();
        car3.park(parkingSpace27);
        java.lang.String str30 = parkingSpace27.toString();
        java.util.List<java.lang.String> strList31 = parkingSpace27.getAvailableDates();
        boolean boolean32 = parkingSpace27.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str22.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str23.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str30.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test140");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        boolean boolean2 = timeSlot1.isAvailable();
        java.lang.String str3 = timeSlot1.toString();
        java.lang.String str4 = timeSlot1.toString();
        timeSlot1.setBooked(false);
        java.lang.String str7 = timeSlot1.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str3.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str4.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str7.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test141");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        boolean boolean2 = timeSlot1.isAvailable();
        java.lang.String str3 = timeSlot1.toString();
        java.lang.String str4 = timeSlot1.toString();
        java.lang.String str5 = timeSlot1.toString();
        timeSlot1.setAvailable(false);
        java.lang.String str8 = timeSlot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str3.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str4.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str5.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Booked)" + "'", str8.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Booked)"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test142");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        java.lang.String str2 = timeSlot1.getTime();
        java.lang.String str3 = timeSlot1.toString();
        timeSlot1.setBooked(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str2.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str3.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test143");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getModel();
        yorku.eecs3311.parking.ParkingSpace parkingSpace11 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability13 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = parkingAvailability13.bookSlots(localDate14, (java.util.List<java.lang.String>) strList18);
        boolean boolean21 = parkingSpace11.bookSlots("", (java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = parkingSpace11.toString();
        java.lang.String str23 = parkingSpace11.toString();
        car3.park(parkingSpace11);
        java.lang.String str25 = parkingSpace11.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str22.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str23.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str25.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test144");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        boolean boolean4 = sensor3.isCarParked();
        boolean boolean5 = sensor3.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test145");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "Space ID: 52 (52) - Enabled1");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test146");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        parkingSpace2.disable();
        java.lang.String str10 = parkingSpace2.getSpaceLocation();
        java.lang.String str11 = parkingSpace2.getSpaceLocation();
        yorku.eecs3311.parking.Sensor sensor12 = parkingSpace2.getSensor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "52" + "'", str10.equals("52"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "52" + "'", str11.equals("52"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test147");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) ' ', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.Sensor sensor4 = parkingSpace2.getSensor();
        sensor4.clearCarInfo();
        yorku.eecs3311.parking.ParkingSpace parkingSpace8 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor9 = parkingSpace8.getSensor();
        sensor9.sendCarInfo();
        yorku.eecs3311.parking.Sensor sensor11 = new yorku.eecs3311.parking.Sensor();
        sensor11.sendCarInfo();
        boolean boolean13 = sensor11.isCarParked();
        boolean boolean14 = sensor11.isCarParked();
        yorku.eecs3311.parking.Sensor sensor15 = new yorku.eecs3311.parking.Sensor();
        sensor15.sendCarInfo();
        boolean boolean17 = sensor15.isCarParked();
        sensor15.clearCarInfo();
        yorku.eecs3311.parking.Car car22 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str23 = car22.getMake();
        car22.setPlateNumber("");
        sensor15.scanCarInfo(car22);
        sensor11.scanCarInfo(car22);
        java.lang.String str28 = car22.getPlateNumber();
        sensor9.scanCarInfo(car22);
        sensor4.scanCarInfo(car22);
        yorku.eecs3311.parking.Car car34 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car34.setMake("hi!");
        java.lang.String str37 = car34.toString();
        java.lang.String str38 = car34.getPlateNumber();
        java.lang.String str39 = car34.getModel();
        yorku.eecs3311.parking.ParkingSpace parkingSpace42 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability44 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate45 = null;
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        boolean boolean51 = parkingAvailability44.bookSlots(localDate45, (java.util.List<java.lang.String>) strList49);
        boolean boolean52 = parkingSpace42.bookSlots("", (java.util.List<java.lang.String>) strList49);
        java.lang.String str53 = parkingSpace42.toString();
        java.lang.String str54 = parkingSpace42.toString();
        car34.park(parkingSpace42);
        yorku.eecs3311.parking.ParkingSpace parkingSpace58 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace58.enable();
        car34.park(parkingSpace58);
        java.lang.String str61 = parkingSpace58.toString();
        parkingSpace58.disable();
        car22.unpark(parkingSpace58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str23.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str37.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str39.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str53.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str54.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str61.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test148");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        sensor0.clearCarInfo();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test149");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getMake();
        java.lang.String str9 = car3.toString();
        car3.setModel("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str9.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test150");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        yorku.eecs3311.parking.Car car5 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car5.setMake("hi!");
        car5.setMake("");
        java.lang.String str10 = car5.toString();
        java.lang.String str11 = car5.getMake();
        java.lang.String str12 = car5.toString();
        sensor0.scanCarInfo(car5);
        car5.setPlateNumber("");
        java.lang.String str16 = car5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str10.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str12.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str16.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test151");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str4 = car3.getMake();
        car3.setPlateNumber("");
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability11 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        boolean boolean18 = parkingAvailability11.bookSlots(localDate12, (java.util.List<java.lang.String>) strList16);
        boolean boolean19 = parkingSpace9.bookSlots("", (java.util.List<java.lang.String>) strList16);
        java.lang.String str20 = parkingSpace9.toString();
        java.lang.String str21 = parkingSpace9.toString();
        boolean boolean22 = parkingSpace9.isEnabled();
        car3.park(parkingSpace9);
        java.lang.String str24 = car3.getMake();
        car3.setMake("Car [make=52, model=Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=], plateNumber=Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str4.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str20.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str21.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str24.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test152");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) (byte) -1);
        parkingLot1.enable();
        parkingLot1.enableSpace((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test153");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        boolean boolean3 = parkingSpace2.isCarParked();
        parkingSpace2.enable();
        boolean boolean5 = parkingSpace2.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test154");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.clearCarInfo();
        yorku.eecs3311.parking.Car car5 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car5.setMake("hi!");
        java.lang.String str8 = car5.toString();
        java.lang.String str9 = car5.getPlateNumber();
        java.lang.String str10 = car5.getModel();
        yorku.eecs3311.parking.ParkingSpace parkingSpace13 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability15 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        boolean boolean22 = parkingAvailability15.bookSlots(localDate16, (java.util.List<java.lang.String>) strList20);
        boolean boolean23 = parkingSpace13.bookSlots("", (java.util.List<java.lang.String>) strList20);
        java.lang.String str24 = parkingSpace13.toString();
        java.lang.String str25 = parkingSpace13.toString();
        car5.park(parkingSpace13);
        car5.setPlateNumber("Space ID: 52 (52) - Enabled");
        sensor0.scanCarInfo(car5);
        java.lang.String str30 = car5.getMake();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str10.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str24.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str25.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test155");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability0 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        boolean boolean7 = parkingAvailability0.bookSlots(localDate1, (java.util.List<java.lang.String>) strList5);
        java.time.LocalDate localDate8 = null;
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability9 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        boolean boolean16 = parkingAvailability9.bookSlots(localDate10, (java.util.List<java.lang.String>) strList14);
        boolean boolean17 = parkingAvailability0.bookSlots(localDate8, (java.util.List<java.lang.String>) strList14);
        java.time.LocalDate localDate18 = null;
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList19 = parkingAvailability0.getSlotsForDate(localDate18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeSlotList19);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test156");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        yorku.eecs3311.parking.Car car5 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car5.setMake("hi!");
        car5.setMake("");
        java.lang.String str10 = car5.toString();
        java.lang.String str11 = car5.getMake();
        java.lang.String str12 = car5.toString();
        sensor0.scanCarInfo(car5);
        car5.setPlateNumber("");
        yorku.eecs3311.parking.ParkingSpace parkingSpace18 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor19 = parkingSpace18.getSensor();
        int int20 = parkingSpace18.getSpaceID();
        boolean boolean21 = parkingSpace18.isEnabled();
        boolean boolean22 = parkingSpace18.isCarParked();
        boolean boolean23 = parkingSpace18.isEnabled();
        java.lang.String str24 = parkingSpace18.getSpaceLocation();
        car5.unpark(parkingSpace18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str10.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str12.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "52" + "'", str24.equals("52"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test157");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) ' ', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.Sensor sensor4 = parkingSpace2.getSensor();
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList6 = parkingSpace2.getSlotsForDate("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test158");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        java.lang.String str2 = timeSlot1.toString();
        timeSlot1.setAvailable(false);
        java.lang.String str5 = timeSlot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str2.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Booked)" + "'", str5.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Booked)"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test159");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.clearCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        sensor0.clearCarInfo();
        boolean boolean4 = sensor0.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test160");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Space ID: 52 (52) - Enabled");
        timeSlot1.setBooked(false);
        java.lang.String str4 = timeSlot1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Space ID: 52 (52) - Enabled (Available)" + "'", str4.equals("Space ID: 52 (52) - Enabled (Available)"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test161");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        parkingSpace2.disable();
        java.lang.String str10 = parkingSpace2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Space ID: 52 (52) - Disabled" + "'", str10.equals("Space ID: 52 (52) - Disabled"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test162");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=52, model=Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=], plateNumber=Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled]");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test163");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("52", "Car [make=hi!, model=hi!, plateNumber=]", "Space ID: 52 (52) - Enabled1");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test164");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        boolean boolean2 = timeSlot1.isAvailable();
        java.lang.String str3 = timeSlot1.getTime();
        java.lang.String str4 = timeSlot1.getTime();
        boolean boolean5 = timeSlot1.isAvailable();
        java.lang.String str6 = timeSlot1.getTime();
        timeSlot1.setBooked(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str3.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str4.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test165");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        yorku.eecs3311.parking.Car car6 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car6.setMake("hi!");
        car6.setMake("");
        java.lang.String str11 = car6.toString();
        sensor0.scanCarInfo(car6);
        sensor0.clearCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str11.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test166");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        sensor3.clearCarInfo();
        boolean boolean5 = sensor3.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test167");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) (short) 1, "Space ID: 52 (52) - Enabled");
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList4 = parkingSpace2.getSlotsForDate("hi!");
        boolean boolean5 = parkingSpace2.isEnabled();
        java.lang.String str6 = parkingSpace2.getSpaceLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Space ID: 52 (52) - Enabled1" + "'", str6.equals("Space ID: 52 (52) - Enabled1"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test168");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        java.util.List<java.lang.String> strList4 = parkingSpace2.getAvailableDates();
        boolean boolean5 = parkingSpace2.isCarParked();
        int int6 = parkingSpace2.getSpaceID();
        java.lang.String str7 = parkingSpace2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str7.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test169");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability0 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        boolean boolean7 = parkingAvailability0.bookSlots(localDate1, (java.util.List<java.lang.String>) strList5);
        java.time.LocalDate localDate8 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace11 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability13 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = parkingAvailability13.bookSlots(localDate14, (java.util.List<java.lang.String>) strList18);
        boolean boolean21 = parkingSpace11.bookSlots("", (java.util.List<java.lang.String>) strList18);
        boolean boolean22 = parkingAvailability0.bookSlots(localDate8, (java.util.List<java.lang.String>) strList18);
        java.time.LocalDate localDate23 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "", "Space ID: 52 (52) - Enabled" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = parkingAvailability0.bookSlots(localDate23, (java.util.List<java.lang.String>) strList29);
        java.time.LocalDate localDate32 = null;
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList33 = parkingAvailability0.getSlotsForDate(localDate32);
        java.time.LocalDate localDate34 = null;
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList35 = parkingAvailability0.getSlotsForDate(localDate34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeSlotList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeSlotList35);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test170");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=hi!]");
        java.lang.String str2 = timeSlot1.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=hi!]" + "'", str2.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=hi!]"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test171");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("Space ID: 52 (52) - Enabled");
        yorku.eecs3311.parking.ParkingSpace parkingSpace3 = parkingLot1.getSpaceById((int) ' ');
        boolean boolean4 = parkingLot1.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test172");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) ' ');
        parkingLot1.enableSpace(52);
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = parkingLot1.getSpaceById(0);
        parkingLot1.enable();
        yorku.eecs3311.parking.ParkingSpace parkingSpace12 = parkingLot1.getSpaceById((int) (byte) -1);
        boolean boolean13 = parkingLot1.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test173");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=hi!]", "Car [make=52, model=Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=], plateNumber=Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test174");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        sensor0.clearCarInfo();
        sensor0.sendCarInfo();
        sensor0.sendCarInfo();
        sensor0.sendCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test175");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.toString();
        java.lang.String str9 = car3.getPlateNumber();
        yorku.eecs3311.parking.Car car13 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car13.setMake("hi!");
        java.lang.String str16 = car13.toString();
        java.lang.String str17 = car13.getPlateNumber();
        java.lang.String str18 = car13.getModel();
        yorku.eecs3311.parking.ParkingSpace parkingSpace21 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability23 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate24 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        boolean boolean30 = parkingAvailability23.bookSlots(localDate24, (java.util.List<java.lang.String>) strList28);
        boolean boolean31 = parkingSpace21.bookSlots("", (java.util.List<java.lang.String>) strList28);
        java.lang.String str32 = parkingSpace21.toString();
        java.lang.String str33 = parkingSpace21.toString();
        car13.park(parkingSpace21);
        car3.unpark(parkingSpace21);
        car3.setPlateNumber("52");
        java.lang.String str38 = car3.getModel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str16.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str18.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str32.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str33.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str38.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test176");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability4 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = parkingAvailability4.bookSlots(localDate5, (java.util.List<java.lang.String>) strList9);
        boolean boolean12 = parkingSpace2.bookSlots("", (java.util.List<java.lang.String>) strList9);
        java.lang.String str13 = parkingSpace2.toString();
        boolean boolean14 = parkingSpace2.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str13.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test177");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        boolean boolean3 = sensor0.isCarParked();
        yorku.eecs3311.parking.Sensor sensor4 = new yorku.eecs3311.parking.Sensor();
        sensor4.sendCarInfo();
        boolean boolean6 = sensor4.isCarParked();
        sensor4.clearCarInfo();
        yorku.eecs3311.parking.Car car11 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str12 = car11.getMake();
        car11.setPlateNumber("");
        sensor4.scanCarInfo(car11);
        sensor0.scanCarInfo(car11);
        sensor0.clearCarInfo();
        sensor0.clearCarInfo();
        yorku.eecs3311.parking.Car car22 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str23 = car22.getMake();
        car22.setPlateNumber("");
        java.lang.String str26 = car22.getPlateNumber();
        yorku.eecs3311.parking.ParkingSpace parkingSpace29 = new yorku.eecs3311.parking.ParkingSpace((int) (byte) -1, "52");
        car22.unpark(parkingSpace29);
        java.lang.String str31 = car22.getMake();
        java.lang.String str32 = car22.getModel();
        sensor0.scanCarInfo(car22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str12.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str23.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str31.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str32.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test178");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        boolean boolean4 = parkingLot1.isEnabled();
        parkingLot1.disableSpace((int) (short) 10);
        java.lang.String str7 = parkingLot1.getLotName();
        boolean boolean8 = parkingLot1.isEnabled();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList9 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test179");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        boolean boolean6 = parkingSpace2.isEnabled();
        int int7 = parkingSpace2.getSpaceID();
        boolean boolean8 = parkingSpace2.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test180");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.toString();
        java.lang.String str9 = car3.getMake();
        java.lang.String str10 = car3.toString();
        java.lang.String str11 = car3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str10.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str11.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test181");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getModel();
        car3.setPlateNumber("hi!");
        java.lang.Class<?> wildcardClass11 = car3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test182");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability0 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        boolean boolean7 = parkingAvailability0.bookSlots(localDate1, (java.util.List<java.lang.String>) strList5);
        java.time.LocalDate localDate8 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace11 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability13 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = parkingAvailability13.bookSlots(localDate14, (java.util.List<java.lang.String>) strList18);
        boolean boolean21 = parkingSpace11.bookSlots("", (java.util.List<java.lang.String>) strList18);
        boolean boolean22 = parkingAvailability0.bookSlots(localDate8, (java.util.List<java.lang.String>) strList18);
        java.time.LocalDate localDate23 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "", "Space ID: 52 (52) - Enabled" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = parkingAvailability0.bookSlots(localDate23, (java.util.List<java.lang.String>) strList29);
        java.time.LocalDate localDate32 = null;
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability33 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate34 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        boolean boolean40 = parkingAvailability33.bookSlots(localDate34, (java.util.List<java.lang.String>) strList38);
        java.time.LocalDate localDate41 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace44 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability46 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate47 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        boolean boolean53 = parkingAvailability46.bookSlots(localDate47, (java.util.List<java.lang.String>) strList51);
        boolean boolean54 = parkingSpace44.bookSlots("", (java.util.List<java.lang.String>) strList51);
        boolean boolean55 = parkingAvailability33.bookSlots(localDate41, (java.util.List<java.lang.String>) strList51);
        java.time.LocalDate localDate56 = null;
        java.lang.String[] strArray61 = new java.lang.String[] { "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "", "Space ID: 52 (52) - Enabled" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        boolean boolean64 = parkingAvailability33.bookSlots(localDate56, (java.util.List<java.lang.String>) strList62);
        boolean boolean65 = parkingAvailability0.bookSlots(localDate32, (java.util.List<java.lang.String>) strList62);
        java.time.LocalDate localDate66 = null;
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList67 = parkingAvailability0.getSlotsForDate(localDate66);
        java.time.LocalDate localDate68 = null;
        java.lang.String[] strArray74 = new java.lang.String[] { "52", "Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "", "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = parkingAvailability0.bookSlots(localDate68, (java.util.List<java.lang.String>) strList75);
        java.time.LocalDate localDate78 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace81 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace81.enable();
        boolean boolean83 = parkingSpace81.isCarParked();
        java.lang.String str84 = parkingSpace81.toString();
        yorku.eecs3311.parking.Sensor sensor85 = parkingSpace81.getSensor();
        java.util.List<java.lang.String> strList86 = parkingSpace81.getAvailableDates();
        boolean boolean87 = parkingAvailability0.bookSlots(localDate78, strList86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeSlotList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str84.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test183");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        java.lang.String str2 = timeSlot1.getTime();
        timeSlot1.setAvailable(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str2.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test184");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        boolean boolean4 = parkingSpace2.isCarParked();
        yorku.eecs3311.parking.Sensor sensor5 = parkingSpace2.getSensor();
        sensor5.clearCarInfo();
        sensor5.sendCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test185");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability0 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate1 = null;
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList2 = parkingAvailability0.getSlotsForDate(localDate1);
        java.time.LocalDate localDate3 = null;
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList4 = parkingAvailability0.getSlotsForDate(localDate3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeSlotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeSlotList4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test186");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getModel();
        car3.setPlateNumber("hi!");
        java.lang.String str11 = car3.toString();
        car3.setMake("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=hi!]" + "'", str11.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=hi!]"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test187");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        boolean boolean4 = parkingLot1.isEnabled();
        parkingLot1.enable();
        parkingLot1.disableSpace((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test188");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) (short) -1, "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList4 = parkingSpace2.getSlotsForDate("hi!");
        java.util.List<java.lang.String> strList5 = parkingSpace2.getAvailableDates();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test189");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        boolean boolean2 = timeSlot1.isAvailable();
        timeSlot1.setAvailable(true);
        timeSlot1.setBooked(false);
        java.lang.String str7 = timeSlot1.getTime();
        timeSlot1.setAvailable(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str7.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test190");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) (short) -1, "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList4 = parkingSpace2.getSlotsForDate("hi!");
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList6 = parkingSpace2.getSlotsForDate("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList6);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test191");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        yorku.eecs3311.parking.Sensor sensor7 = parkingSpace2.getSensor();
        java.util.List<java.lang.String> strList8 = parkingSpace2.getAvailableDates();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test192");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        parkingSpace2.disable();
        java.lang.String str10 = parkingSpace2.getSpaceLocation();
        java.lang.String str11 = parkingSpace2.getSpaceLocation();
        int int12 = parkingSpace2.getSpaceID();
        int int13 = parkingSpace2.getSpaceID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "52" + "'", str10.equals("52"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "52" + "'", str11.equals("52"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test193");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test194");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        parkingSpace2.disable();
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor10 = parkingSpace9.getSensor();
        int int11 = parkingSpace9.getSpaceID();
        boolean boolean12 = parkingSpace9.isEnabled();
        java.util.List<java.lang.String> strList13 = parkingSpace9.getAvailableDates();
        parkingSpace9.enable();
        yorku.eecs3311.parking.Sensor sensor15 = parkingSpace9.getSensor();
        parkingSpace9.disable();
        java.lang.String str17 = parkingSpace9.getSpaceLocation();
        java.lang.String str18 = parkingSpace9.getSpaceLocation();
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability20 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate21 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        boolean boolean27 = parkingAvailability20.bookSlots(localDate21, (java.util.List<java.lang.String>) strList25);
        parkingSpace9.releaseSlots("Space ID: 52 (52) - Enabled1", (java.util.List<java.lang.String>) strList25);
        parkingSpace2.releaseSlots("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", (java.util.List<java.lang.String>) strList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "52" + "'", str17.equals("52"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "52" + "'", str18.equals("52"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test195");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.toString();
        car3.setPlateNumber("Space ID: 52 (52) - Enabled");
        java.lang.String str11 = car3.getModel();
        car3.setMake("Space ID: 52 (52) - Enabled1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str11.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test196");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.enableSpace((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test197");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) ' ');
        parkingLot1.enableSpace(52);
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = parkingLot1.getSpaceById(0);
        parkingLot1.disableSpace(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test198");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) ' ', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.Sensor sensor4 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.ParkingSpace parkingSpace8 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability10 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        boolean boolean17 = parkingAvailability10.bookSlots(localDate11, (java.util.List<java.lang.String>) strList15);
        boolean boolean18 = parkingSpace8.bookSlots("", (java.util.List<java.lang.String>) strList15);
        java.lang.String str19 = parkingSpace8.toString();
        java.lang.String str20 = parkingSpace8.toString();
        yorku.eecs3311.parking.ParkingSpace parkingSpace24 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace24.enable();
        java.util.List<java.lang.String> strList26 = parkingSpace24.getAvailableDates();
        boolean boolean27 = parkingSpace24.isCarParked();
        yorku.eecs3311.parking.ParkingSpace parkingSpace31 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor32 = parkingSpace31.getSensor();
        int int33 = parkingSpace31.getSpaceID();
        boolean boolean34 = parkingSpace31.isEnabled();
        boolean boolean35 = parkingSpace31.isCarParked();
        java.util.List<java.lang.String> strList36 = parkingSpace31.getAvailableDates();
        boolean boolean37 = parkingSpace24.bookSlots("Space ID: 52 (52) - Enabled", strList36);
        boolean boolean38 = parkingSpace8.bookSlots("", strList36);
        // The following exception was thrown during execution in test generation
        try {
            parkingSpace2.releaseSlots("Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled", strList36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str19.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str20.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test199");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        boolean boolean4 = parkingLot1.isEnabled();
        parkingLot1.disableSpace((int) (short) 10);
        boolean boolean7 = parkingLot1.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test200");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        timeSlot1.setBooked(false);
        java.lang.String str4 = timeSlot1.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str4.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test201");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) (byte) 0, "hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test202");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("52", "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled");
        java.lang.String str4 = car3.getPlateNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled" + "'", str4.equals("Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test203");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        boolean boolean4 = parkingSpace2.isCarParked();
        yorku.eecs3311.parking.Sensor sensor5 = parkingSpace2.getSensor();
        parkingSpace2.disable();
        boolean boolean7 = parkingSpace2.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test204");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("Space ID: 52 (52) - Disabled");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test205");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        sensor3.clearCarInfo();
        sensor3.clearCarInfo();
        sensor3.clearCarInfo();
        sensor3.clearCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test206");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) ' ', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.Sensor sensor4 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.Car car8 = new yorku.eecs3311.parking.Car("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=hi!]", "", "");
        sensor4.scanCarInfo(car8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor4);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test207");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.toString();
        car3.setMake("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Booked)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test208");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        parkingLot1.disableSpace((int) (short) 100);
        parkingLot1.disableSpace((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test209");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        boolean boolean6 = parkingSpace2.isCarParked();
        boolean boolean7 = parkingSpace2.isEnabled();
        int int8 = parkingSpace2.getSpaceID();
        java.util.List<java.lang.String> strList9 = parkingSpace2.getAvailableDates();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test210");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        java.util.List<java.lang.String> strList4 = parkingSpace2.getAvailableDates();
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList6 = parkingSpace2.getSlotsForDate("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)");
        yorku.eecs3311.parking.Car car11 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car11.setMake("hi!");
        java.lang.String str14 = car11.toString();
        java.lang.String str15 = car11.getPlateNumber();
        java.lang.String str16 = car11.getModel();
        yorku.eecs3311.parking.ParkingSpace parkingSpace19 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability21 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate22 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        boolean boolean28 = parkingAvailability21.bookSlots(localDate22, (java.util.List<java.lang.String>) strList26);
        boolean boolean29 = parkingSpace19.bookSlots("", (java.util.List<java.lang.String>) strList26);
        java.lang.String str30 = parkingSpace19.toString();
        java.lang.String str31 = parkingSpace19.toString();
        car11.park(parkingSpace19);
        yorku.eecs3311.parking.ParkingSpace parkingSpace35 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace35.enable();
        car11.park(parkingSpace35);
        java.lang.String str38 = parkingSpace35.toString();
        java.util.List<java.lang.String> strList39 = parkingSpace35.getAvailableDates();
        // The following exception was thrown during execution in test generation
        try {
            parkingSpace2.releaseSlots("Car [make=hi!, model=hi!, plateNumber=]", strList39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str14.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str16.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str30.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str31.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str38.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test211");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability0 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        boolean boolean7 = parkingAvailability0.bookSlots(localDate1, (java.util.List<java.lang.String>) strList5);
        java.time.LocalDate localDate8 = null;
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability9 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        boolean boolean16 = parkingAvailability9.bookSlots(localDate10, (java.util.List<java.lang.String>) strList14);
        boolean boolean17 = parkingAvailability0.bookSlots(localDate8, (java.util.List<java.lang.String>) strList14);
        java.time.LocalDate localDate18 = null;
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability19 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        boolean boolean26 = parkingAvailability19.bookSlots(localDate20, (java.util.List<java.lang.String>) strList24);
        boolean boolean27 = parkingAvailability0.bookSlots(localDate18, (java.util.List<java.lang.String>) strList24);
        java.time.LocalDate localDate28 = null;
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList29 = parkingAvailability0.getSlotsForDate(localDate28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeSlotList29);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test212");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        boolean boolean4 = parkingLot1.isEnabled();
        parkingLot1.disableSpace((int) (short) 10);
        parkingLot1.disable();
        parkingLot1.enableSpace((int) 'a');
        boolean boolean10 = parkingLot1.isEnabled();
        parkingLot1.disable();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test213");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        sensor0.clearCarInfo();
        yorku.eecs3311.parking.Car car7 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str8 = car7.getMake();
        car7.setPlateNumber("");
        sensor0.scanCarInfo(car7);
        java.lang.String str12 = car7.getModel();
        yorku.eecs3311.parking.ParkingSpace parkingSpace15 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace15.disable();
        java.lang.String str17 = parkingSpace15.getSpaceLocation();
        car7.unpark(parkingSpace15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str12.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "52" + "'", str17.equals("52"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test214");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor10 = parkingSpace9.getSensor();
        int int11 = parkingSpace9.getSpaceID();
        boolean boolean12 = parkingSpace9.isEnabled();
        boolean boolean13 = parkingSpace9.isEnabled();
        int int14 = parkingSpace9.getSpaceID();
        car3.park(parkingSpace9);
        java.lang.String str16 = car3.getPlateNumber();
        car3.setModel("hi!");
        yorku.eecs3311.parking.ParkingSpace parkingSpace21 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor22 = parkingSpace21.getSensor();
        int int23 = parkingSpace21.getSpaceID();
        boolean boolean24 = parkingSpace21.isEnabled();
        boolean boolean25 = parkingSpace21.isCarParked();
        boolean boolean26 = parkingSpace21.isEnabled();
        car3.unpark(parkingSpace21);
        java.lang.String str28 = parkingSpace21.getSpaceLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "52" + "'", str28.equals("52"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test215");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getModel();
        yorku.eecs3311.parking.ParkingSpace parkingSpace11 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability13 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = parkingAvailability13.bookSlots(localDate14, (java.util.List<java.lang.String>) strList18);
        boolean boolean21 = parkingSpace11.bookSlots("", (java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = parkingSpace11.toString();
        java.lang.String str23 = parkingSpace11.toString();
        car3.park(parkingSpace11);
        boolean boolean25 = parkingSpace11.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str22.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str23.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test216");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.getModel();
        java.lang.String str9 = car3.toString();
        java.lang.String str10 = car3.getPlateNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str9.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test217");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.toString();
        car3.setPlateNumber("Space ID: 52 (52) - Enabled");
        car3.setModel("Space ID: 52 (52) - Enabled");
        car3.setPlateNumber("Space ID: 52 (52) - Enabled1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test218");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.toString();
        car3.setPlateNumber("Space ID: 52 (52) - Enabled");
        car3.setPlateNumber("Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled");
        yorku.eecs3311.parking.ParkingSpace parkingSpace15 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability17 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate18 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        boolean boolean24 = parkingAvailability17.bookSlots(localDate18, (java.util.List<java.lang.String>) strList22);
        boolean boolean25 = parkingSpace15.bookSlots("", (java.util.List<java.lang.String>) strList22);
        java.lang.String str26 = parkingSpace15.toString();
        java.lang.String str27 = parkingSpace15.toString();
        yorku.eecs3311.parking.ParkingSpace parkingSpace31 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace31.enable();
        java.util.List<java.lang.String> strList33 = parkingSpace31.getAvailableDates();
        boolean boolean34 = parkingSpace31.isCarParked();
        yorku.eecs3311.parking.ParkingSpace parkingSpace38 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor39 = parkingSpace38.getSensor();
        int int40 = parkingSpace38.getSpaceID();
        boolean boolean41 = parkingSpace38.isEnabled();
        boolean boolean42 = parkingSpace38.isCarParked();
        java.util.List<java.lang.String> strList43 = parkingSpace38.getAvailableDates();
        boolean boolean44 = parkingSpace31.bookSlots("Space ID: 52 (52) - Enabled", strList43);
        boolean boolean45 = parkingSpace15.bookSlots("", strList43);
        car3.park(parkingSpace15);
        boolean boolean47 = parkingSpace15.isEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str26.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str27.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test219");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("Space ID: 52 (52) - Enabled");
        parkingLot1.enable();
        parkingLot1.disableSpace(52);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test220");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.toString();
        car3.setPlateNumber("Space ID: 52 (52) - Enabled");
        car3.setModel("Space ID: 52 (52) - Enabled");
        yorku.eecs3311.parking.ParkingSpace parkingSpace15 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor16 = parkingSpace15.getSensor();
        int int17 = parkingSpace15.getSpaceID();
        boolean boolean18 = parkingSpace15.isEnabled();
        boolean boolean19 = parkingSpace15.isCarParked();
        car3.park(parkingSpace15);
        java.lang.String str21 = car3.getModel();
        java.lang.String str22 = car3.getPlateNumber();
        car3.setModel("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str21.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str22.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test221");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        sensor0.clearCarInfo();
        yorku.eecs3311.parking.Car car7 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str8 = car7.getMake();
        car7.setPlateNumber("");
        sensor0.scanCarInfo(car7);
        sensor0.clearCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test222");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        boolean boolean4 = parkingSpace2.isCarParked();
        parkingSpace2.enable();
        java.lang.String str6 = parkingSpace2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str6.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test223");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability0 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        boolean boolean7 = parkingAvailability0.bookSlots(localDate1, (java.util.List<java.lang.String>) strList5);
        java.time.LocalDate localDate8 = null;
        yorku.eecs3311.parking.ParkingSpace parkingSpace11 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability13 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = parkingAvailability13.bookSlots(localDate14, (java.util.List<java.lang.String>) strList18);
        boolean boolean21 = parkingSpace11.bookSlots("", (java.util.List<java.lang.String>) strList18);
        boolean boolean22 = parkingAvailability0.bookSlots(localDate8, (java.util.List<java.lang.String>) strList18);
        java.time.LocalDate localDate23 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]", "", "Space ID: 52 (52) - Enabled" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = parkingAvailability0.bookSlots(localDate23, (java.util.List<java.lang.String>) strList29);
        java.time.LocalDate localDate32 = null;
        java.util.List<java.lang.String> strList33 = null;
        boolean boolean34 = parkingAvailability0.bookSlots(localDate32, strList33);
        java.time.LocalDate localDate35 = null;
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability36 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate37 = null;
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        boolean boolean43 = parkingAvailability36.bookSlots(localDate37, (java.util.List<java.lang.String>) strList41);
        boolean boolean44 = parkingAvailability0.bookSlots(localDate35, (java.util.List<java.lang.String>) strList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test224");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        boolean boolean4 = parkingLot1.isEnabled();
        parkingLot1.disableSpace((int) (short) 10);
        parkingLot1.disable();
        parkingLot1.enableSpace((int) 'a');
        boolean boolean10 = parkingLot1.isEnabled();
        parkingLot1.enable();
        parkingLot1.disableSpace(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test225");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.disable();
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList5 = parkingSpace2.getSlotsForDate("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList7 = parkingSpace2.getSlotsForDate("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeSlotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeSlotList7);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test226");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("Space ID: 52 (52) - Enabled");
        parkingLot1.enable();
        boolean boolean3 = parkingLot1.isEnabled();
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test227");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace(100, "Car [make=52, model=Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=], plateNumber=Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled]");
        java.lang.String str3 = parkingSpace2.getSpaceLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Car [make=52, model=Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=], plateNumber=Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled]100" + "'", str3.equals("Car [make=52, model=Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=], plateNumber=Space ID: 1 (Space ID: 52 (52) - Enabled1) - Enabled]100"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test228");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) (byte) -1);
        boolean boolean5 = parkingLot1.isEnabled();
        java.lang.String str6 = parkingLot1.getLotName();
        parkingLot1.enableSpace(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test229");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        boolean boolean8 = parkingSpace2.isCarParked();
        boolean boolean9 = parkingSpace2.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test230");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getMake();
        java.lang.String str9 = car3.getPlateNumber();
        car3.setPlateNumber("");
        yorku.eecs3311.parking.ParkingSpace parkingSpace14 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability16 = new yorku.eecs3311.parking.ParkingAvailability();
        java.time.LocalDate localDate17 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        boolean boolean23 = parkingAvailability16.bookSlots(localDate17, (java.util.List<java.lang.String>) strList21);
        boolean boolean24 = parkingSpace14.bookSlots("", (java.util.List<java.lang.String>) strList21);
        java.lang.String str25 = parkingSpace14.toString();
        car3.unpark(parkingSpace14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str25.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test231");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.toString();
        car3.setPlateNumber("Space ID: 52 (52) - Enabled");
        car3.setModel("Space ID: 52 (52) - Enabled");
        java.lang.String str13 = car3.getMake();
        java.lang.String str14 = car3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=Space ID: 52 (52) - Enabled]" + "'", str14.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=Space ID: 52 (52) - Enabled]"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test232");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getModel();
        car3.setPlateNumber("hi!");
        java.lang.String str11 = car3.toString();
        car3.setMake("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=Space ID: 52 (52) - Enabled]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=hi!]" + "'", str11.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=hi!]"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test233");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Booked)", "Space ID: 52 (52) - Enabled (Available)", "Space ID: 52 (52) - Disabled");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test234");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor10 = parkingSpace9.getSensor();
        int int11 = parkingSpace9.getSpaceID();
        boolean boolean12 = parkingSpace9.isEnabled();
        boolean boolean13 = parkingSpace9.isEnabled();
        int int14 = parkingSpace9.getSpaceID();
        car3.park(parkingSpace9);
        java.lang.String str16 = car3.getPlateNumber();
        car3.setModel("hi!");
        java.lang.String str19 = car3.toString();
        java.lang.String str20 = car3.getModel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Car [make=hi!, model=hi!, plateNumber=]" + "'", str19.equals("Car [make=hi!, model=hi!, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test235");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        boolean boolean4 = parkingLot1.isEnabled();
        parkingLot1.disableSpace((int) (short) 10);
        parkingLot1.enable();
        java.lang.String str8 = parkingLot1.getLotName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingRegressionTest0.test236");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.disableSpace((int) (short) 0);
        parkingLot1.enableSpace(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }
}

