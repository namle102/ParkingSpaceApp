package yorku.eecs3311.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParkingTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test01");
        yorku.eecs3311.parking.ParkingRate parkingRate0 = yorku.eecs3311.parking.ParkingRate.STAFF;
        double double1 = parkingRate0.getValue();
        org.junit.Assert.assertTrue("'" + parkingRate0 + "' != '" + yorku.eecs3311.parking.ParkingRate.STAFF + "'", parkingRate0.equals(yorku.eecs3311.parking.ParkingRate.STAFF));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test03");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        boolean boolean3 = parkingSpace2.isCarParked();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test04");
        yorku.eecs3311.parking.ParkingAvailability parkingAvailability0 = new yorku.eecs3311.parking.ParkingAvailability();
        java.lang.Class<?> wildcardClass1 = parkingAvailability0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test06");
        yorku.eecs3311.parking.ParkingRate parkingRate0 = yorku.eecs3311.parking.ParkingRate.FACULTY;
        org.junit.Assert.assertTrue("'" + parkingRate0 + "' != '" + yorku.eecs3311.parking.ParkingRate.FACULTY + "'", parkingRate0.equals(yorku.eecs3311.parking.ParkingRate.FACULTY));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test08");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        boolean boolean7 = parkingSpace2.isEnabled();
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test09");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList5 = parkingSpace2.getSlotsForDate("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeSlotList5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test11");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str4 = car3.getMake();
        car3.setPlateNumber("");
        java.lang.String str7 = car3.getPlateNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str4.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test12");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.Class<?> wildcardClass6 = car3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test13");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.clearCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        sensor0.clearCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test14");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        boolean boolean2 = timeSlot1.isAvailable();
        java.lang.String str3 = timeSlot1.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str3.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test15");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        sensor3.sendCarInfo();
        yorku.eecs3311.parking.Car car8 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car8.setMake("hi!");
        java.lang.String str11 = car8.toString();
        java.lang.String str12 = car8.getPlateNumber();
        java.lang.String str13 = car8.getMake();
        sensor3.scanCarInfo(car8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str11.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test16");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.toString();
        car3.setPlateNumber("Space ID: 52 (52) - Enabled");
        java.lang.String str11 = car3.getModel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str8.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str11.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test17");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        boolean boolean4 = parkingSpace2.isCarParked();
        parkingSpace2.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test18");
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
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test20");
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
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test21");
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
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test22");
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
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test23");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) (short) 100, "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test24");
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
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test25");
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
        java.util.List<java.lang.String> strList16 = parkingSpace2.getAvailableDates();
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
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test26");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        boolean boolean6 = parkingSpace2.isCarParked();
        boolean boolean7 = parkingSpace2.isEnabled();
        java.lang.String str8 = parkingSpace2.getSpaceLocation();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "52" + "'", str8.equals("52"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test27");
        yorku.eecs3311.parking.ParkingRate parkingRate0 = yorku.eecs3311.parking.ParkingRate.VISITOR;
        double double1 = parkingRate0.getValue();
        org.junit.Assert.assertTrue("'" + parkingRate0 + "' != '" + yorku.eecs3311.parking.ParkingRate.VISITOR + "'", parkingRate0.equals(yorku.eecs3311.parking.ParkingRate.VISITOR));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test28");
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test29");
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
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test30");
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
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test31");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        boolean boolean2 = timeSlot1.isAvailable();
        timeSlot1.setAvailable(true);
        timeSlot1.setBooked(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test32");
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
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test33");
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test34");
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test35");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        parkingSpace2.disable();
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
        org.junit.Assert.assertNotNull(sensor8);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test36");
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
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test37");
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
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test38");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        java.lang.Class<?> wildcardClass1 = sensor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test39");
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
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test40");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getMake();
        car3.setPlateNumber("Space ID: 52 (52) - Enabled");
        car3.setModel("52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test41");
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
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test42");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        sensor8.clearCarInfo();
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
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test43");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) (byte) -1);
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test44");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        parkingSpace2.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test45");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str11.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test46");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        boolean boolean6 = parkingSpace2.isCarParked();
        boolean boolean7 = parkingSpace2.isEnabled();
        int int8 = parkingSpace2.getSpaceID();
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
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test47");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        boolean boolean2 = timeSlot1.isAvailable();
        timeSlot1.setAvailable(true);
        timeSlot1.setAvailable(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test48");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getMake();
        java.lang.String str9 = car3.toString();
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
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test49");
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
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test50");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Space ID: 52 (52) - Enabled");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test51");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        boolean boolean9 = sensor8.isCarParked();
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
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test52");
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
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test53");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.clearCarInfo();
        sensor0.sendCarInfo();
        sensor0.sendCarInfo();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test54");
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
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test55");
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
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test56");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        java.lang.String str6 = car3.toString();
        java.lang.String str7 = car3.getPlateNumber();
        java.lang.String str8 = car3.getModel();
        car3.setMake("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str6.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test57");
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
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test58");
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
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test59");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) ' ');
        parkingLot1.enableSpace(52);
        parkingLot1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test60");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) ' ');
        parkingLot1.enableSpace(52);
        yorku.eecs3311.parking.ParkingSpace parkingSpace9 = parkingLot1.getSpaceById(0);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList10 = parkingLot1.getSpaces();
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
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test61");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("", "", "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        car3.setPlateNumber("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test62");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.enable();
        boolean boolean4 = parkingSpace2.isCarParked();
        java.lang.String str5 = parkingSpace2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str5.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test63");
        yorku.eecs3311.parking.Sensor sensor0 = new yorku.eecs3311.parking.Sensor();
        sensor0.sendCarInfo();
        boolean boolean2 = sensor0.isCarParked();
        sensor0.clearCarInfo();
        yorku.eecs3311.parking.Car car7 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        java.lang.String str8 = car7.getMake();
        car7.setPlateNumber("");
        sensor0.scanCarInfo(car7);
        java.lang.String str12 = car7.getModel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str12.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test64");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        java.lang.String str2 = timeSlot1.getTime();
        boolean boolean3 = timeSlot1.isAvailable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str2.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test65");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test66");
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
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test67");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str12.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test68");
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
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test69");
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
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test70");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) ' ');
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test71");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str10.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]" + "'", str12.equals("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test72");
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
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test73");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.disable();
        yorku.eecs3311.parking.Sensor sensor4 = parkingSpace2.getSensor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor4);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test74");
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
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test75");
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
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test76");
        yorku.eecs3311.parking.TimeSlot timeSlot1 = new yorku.eecs3311.parking.TimeSlot("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=]");
        boolean boolean2 = timeSlot1.isAvailable();
        java.lang.String str3 = timeSlot1.toString();
        java.lang.String str4 = timeSlot1.toString();
        boolean boolean5 = timeSlot1.isAvailable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str3.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)" + "'", str4.equals("Car [make=hi!, model=Space ID: 52 (52) - Enabled, plateNumber=] (Available)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test77");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        parkingSpace2.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test78");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Space ID: 52 (52) - Enabled", "Space ID: 52 (52) - Enabled", "");
        car3.setMake("hi!");
        car3.setMake("");
        java.lang.String str8 = car3.getModel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Space ID: 52 (52) - Enabled" + "'", str8.equals("Space ID: 52 (52) - Enabled"));
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test79");
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
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test80");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        boolean boolean4 = parkingLot1.isEnabled();
        parkingLot1.disableSpace((int) (short) 10);
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test81");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        sensor3.clearCarInfo();
        sensor3.clearCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test82");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        parkingSpace2.disable();
        java.lang.String str4 = parkingSpace2.getSpaceLocation();
        java.util.List<yorku.eecs3311.parking.TimeSlot> timeSlotList6 = parkingSpace2.getSlotsForDate("52");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "52" + "'", str4.equals("52"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeSlotList6);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test83");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) ' ', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.Sensor sensor4 = parkingSpace2.getSensor();
        sensor4.clearCarInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sensor4);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test84");
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
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test85");
        yorku.eecs3311.parking.Car car3 = new yorku.eecs3311.parking.Car("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]", "Space ID: 52 (52) - Enabled", "");
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test86");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        java.lang.String str3 = parkingLot1.getLotName();
        parkingLot1.enableSpace((int) ' ');
        parkingLot1.disableSpace((int) (short) 10);
        parkingLot1.enableSpace((int) (byte) 1);
        parkingLot1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test87");
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
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test88");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        parkingSpace2.disable();
        java.lang.String str10 = parkingSpace2.getSpaceLocation();
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
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test89");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("52");
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test90");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("Space ID: 52 (52) - Enabled");
        yorku.eecs3311.parking.ParkingSpace parkingSpace3 = parkingLot1.getSpaceById((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace3);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test91");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("hi!");
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList2 = parkingLot1.getSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test92");
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
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test93");
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
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test94");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace(0, "Space ID: 52 (52) - Enabled");
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test95");
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
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test96");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = new yorku.eecs3311.parking.ParkingLot("Car [make=, model=Space ID: 52 (52) - Enabled, plateNumber=]");
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ParkingTest0.test97");
        yorku.eecs3311.parking.ParkingSpace parkingSpace2 = new yorku.eecs3311.parking.ParkingSpace((int) '4', "");
        yorku.eecs3311.parking.Sensor sensor3 = parkingSpace2.getSensor();
        int int4 = parkingSpace2.getSpaceID();
        boolean boolean5 = parkingSpace2.isEnabled();
        java.util.List<java.lang.String> strList6 = parkingSpace2.getAvailableDates();
        parkingSpace2.enable();
        yorku.eecs3311.parking.Sensor sensor8 = parkingSpace2.getSensor();
        yorku.eecs3311.parking.Sensor sensor9 = parkingSpace2.getSensor();
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
}

