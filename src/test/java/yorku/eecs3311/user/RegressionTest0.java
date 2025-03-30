package yorku.eecs3311.user;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "", "hi!", (double) (byte) 10);
        loggedInUser4.setRate((double) '4');
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "", "hi!", (double) (byte) 10);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "", "hi!", (double) (byte) 10);
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        double double9 = loggedInUser4.getRate();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList10 = null;
        loggedInUser4.update(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "", "hi!", (double) (byte) 10);
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        java.lang.String str9 = loggedInUser4.getId();
        java.lang.String str10 = loggedInUser4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "", "hi!", (double) (byte) 10);
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        double double9 = loggedInUser4.getRate();
        java.lang.Class<?> wildcardClass10 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

