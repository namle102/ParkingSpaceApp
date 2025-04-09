package yorku.eecs3311.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test01");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("", "hi!", "");
        java.lang.String str4 = faculty3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test02");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        java.lang.Class<?> wildcardClass9 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test03");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=-1.0]", "hi!", "User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test04");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=-1.0]", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test05");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("hi!", "hi!", "");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test06");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=hi!, pwd=, id=, rate=15.0]", "", "");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test07");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("hi!", "hi!", "", "User [email=hi!, pwd=, id=, rate=15.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test08");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        java.lang.Class<?> wildcardClass9 = parkingSpaceList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test09");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("", "", "User [email=, pwd=hi!, id=, rate=-1.0]");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test10");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        loggedInUser4.setRate(1.0d);
        java.lang.String str7 = loggedInUser4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=, pwd=hi!, id=, rate=1.0]" + "'", str7.equals("User [email=, pwd=hi!, id=, rate=1.0]"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test11");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "", "");
        java.lang.String str4 = staff3.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test12");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("", "", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test13");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        loggedInUser4.setRate((double) 10L);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList11 = loggedInUser4.getAvailableSpaces();
        java.lang.Class<?> wildcardClass12 = parkingSpaceList11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test14");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.String str6 = loggedInUser4.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList7 = loggedInUser4.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str6.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test15");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("hi!", "User [email=, pwd=hi!, id=, rate=1.0]", "hi!", "User [email=hi!, pwd=, id=, rate=15.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test16");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "", "");
        java.lang.Class<?> wildcardClass4 = staff3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test17");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", (double) (short) -1);
        loggedInUser4.setRate((double) (short) 100);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test18");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        loggedInUser4.setRate((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test19");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        java.lang.String str9 = loggedInUser4.getId();
        java.lang.String str10 = loggedInUser4.getPwd();
        java.lang.String str11 = loggedInUser4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str11.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test20");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=hi!, pwd=, id=, rate=15.0]", "hi!", "User [email=, pwd=hi!, id=, rate=-1.0]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test21");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("hi!", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test22");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        loggedInUser4.setRate((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test23");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=hi!, pwd=, id=, rate=15.0]", "", "hi!");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test24");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]", (double) 1.0f);
        java.lang.String str5 = loggedInUser4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]" + "'", str5.equals("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test25");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=hi!, pwd=, id=, rate=15.0]", "", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test26");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.String str7 = loggedInUser4.getEmail();
        java.lang.String str8 = loggedInUser4.getPwd();
        java.lang.String str9 = loggedInUser4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str6.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str9.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test27");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=, pwd=hi!, id=, rate=1.0]", "", "User [email=hi!, pwd=, id=, rate=15.0]");
        java.lang.String str4 = student3.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test28");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.String str6 = loggedInUser4.getPwd();
        java.lang.String str7 = loggedInUser4.getPwd();
        java.lang.String str8 = loggedInUser4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test29");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        loggedInUser4.setRate(1.0d);
        java.lang.String str7 = loggedInUser4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test30");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        double double6 = loggedInUser4.getRate();
        java.lang.String str7 = loggedInUser4.getEmail();
        java.lang.String str8 = loggedInUser4.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test31");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("hi!", "", "");
        java.lang.String str4 = visitor3.toString();
        java.lang.String str5 = visitor3.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str4.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test32");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test33");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.String str6 = loggedInUser4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test34");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test35");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("", "hi!", "");
        java.lang.String str4 = faculty3.getId();
        java.lang.String str5 = faculty3.getPwd();
        double double6 = faculty3.getRate();
        java.lang.String str7 = faculty3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test36");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.String str7 = loggedInUser4.getEmail();
        java.lang.String str8 = loggedInUser4.getEmail();
        java.lang.String str9 = loggedInUser4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str6.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test37");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "User [email=, pwd=hi!, id=, rate=-1.0]", 0.0d);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test38");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        double double6 = loggedInUser4.getRate();
        loggedInUser4.setRate((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test39");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=1.0]", "hi!", "User [email=, pwd=hi!, id=, rate=1.0]");
        java.lang.String str4 = faculty3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]" + "'", str4.equals("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]"));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test40");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test41");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("hi!", "", "");
        java.lang.String str4 = visitor3.toString();
        visitor3.setRate((double) 'a');
        double double7 = visitor3.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str4.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test42");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
        java.lang.String str4 = staff3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str4.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test43");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.String str7 = loggedInUser4.getEmail();
        yorku.eecs3311.user.LoggedInUser loggedInUser12 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str13 = loggedInUser12.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList14 = loggedInUser12.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str6.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str13.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test44");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("", "User [email=, pwd=hi!, id=, rate=1.0]", "hi!");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test45");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("", "", "");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test46");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "hi!");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test47");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "hi!");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test48");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test49");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("", "", "User [email=hi!, pwd=, id=, rate=15.0]");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test50");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.String str7 = loggedInUser4.getEmail();
        java.lang.String str8 = loggedInUser4.getPwd();
        double double9 = loggedInUser4.getRate();
        java.lang.Class<?> wildcardClass10 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str6.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test51");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
        java.lang.String str4 = staff3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]" + "'", str4.equals("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]"));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test52");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        java.lang.String str9 = loggedInUser4.getId();
        loggedInUser4.setRate((double) 0L);
        yorku.eecs3311.user.LoggedInUser loggedInUser16 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double17 = loggedInUser16.getRate();
        java.lang.String str18 = loggedInUser16.toString();
        java.lang.String str19 = loggedInUser16.getEmail();
        java.lang.String str20 = loggedInUser16.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList21 = loggedInUser16.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str18.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test53");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "hi!", "");
        java.lang.String str4 = staff3.getId();
        java.lang.String str5 = staff3.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test54");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test55");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str5 = loggedInUser4.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = loggedInUser4.getAvailableSpaces();
        double double7 = loggedInUser4.getRate();
        yorku.eecs3311.user.LoggedInUser loggedInUser12 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double13 = loggedInUser12.getRate();
        java.lang.String str14 = loggedInUser12.toString();
        java.lang.String str15 = loggedInUser12.getEmail();
        java.lang.String str16 = loggedInUser12.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList17 = loggedInUser12.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str5.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str14.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList17);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test56");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.Class<?> wildcardClass6 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test57");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=1.0]", "", "User [email=hi!, pwd=, id=, rate=15.0]");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test58");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        java.lang.String str9 = loggedInUser4.getId();
        java.lang.String str10 = loggedInUser4.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList11 = loggedInUser4.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList11);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test59");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=1.0]", "hi!", "User [email=, pwd=hi!, id=, rate=1.0]");
        java.lang.String str4 = faculty3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=, pwd=hi!, id=, rate=1.0]" + "'", str4.equals("User [email=, pwd=hi!, id=, rate=1.0]"));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test60");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }
    
    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test61");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("student", "student@domain.com", "pwd123", "ID123");
        org.junit.Assert.assertTrue(user4 instanceof yorku.eecs3311.user.Student);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test62");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("FACULTY", "faculty@domain.com", "pass", "F001");
        org.junit.Assert.assertTrue(user4 instanceof yorku.eecs3311.user.Faculty);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test63");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("StAfF", "staff@domain.com", "pwd", "T001");
        org.junit.Assert.assertTrue(user4 instanceof yorku.eecs3311.user.Staff);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test64");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("ViSiToR", "visitor@domain.com", "visitorpwd", "V001");
        org.junit.Assert.assertTrue(user4 instanceof yorku.eecs3311.user.Visitor);
    }


    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserTest0.test66");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("", "", "", "");
        org.junit.Assert.assertNull(user4);
    }
}

