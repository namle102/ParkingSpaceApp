package yorku.eecs3311.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test002");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=-1.0]", "hi!", "User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test003");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=-1.0]", "hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test004");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("hi!", "hi!", "", "User [email=hi!, pwd=, id=, rate=15.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test006");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "", "");
        java.lang.String str4 = staff3.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test007");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("", "", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test009");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("hi!", "User [email=, pwd=hi!, id=, rate=1.0]", "hi!", "User [email=hi!, pwd=, id=, rate=15.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test010");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "", "");
        java.lang.Class<?> wildcardClass4 = staff3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test011");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", (double) (short) -1);
        loggedInUser4.setRate((double) (short) 100);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test012");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=hi!, pwd=, id=, rate=15.0]", "hi!", "User [email=, pwd=hi!, id=, rate=-1.0]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test013");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("hi!", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test014");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        loggedInUser4.setRate((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test015");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=hi!, pwd=, id=, rate=15.0]", "", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test016");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=, pwd=hi!, id=, rate=1.0]", "", "User [email=hi!, pwd=, id=, rate=15.0]");
        java.lang.String str4 = student3.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test018");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("hi!", "", "");
        java.lang.String str4 = visitor3.toString();
        java.lang.String str5 = visitor3.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str4.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test019");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test020");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test021");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test022");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test023");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test024");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test025");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test026");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test027");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("", "", "User [email=hi!, pwd=, id=, rate=15.0]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test028");
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test029");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "hi!", "");
        java.lang.String str4 = staff3.getId();
        java.lang.String str5 = staff3.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test030");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.Class<?> wildcardClass6 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test031");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=1.0]", "", "User [email=hi!, pwd=, id=, rate=15.0]");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test032");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test033");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test034");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "", "User [email=, pwd=hi!, id=, rate=1.0]", 0.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test035");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("hi!", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test036");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "hi!", "hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test037");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
        java.lang.String str4 = visitor3.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str4.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test038");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=, pwd=hi!, id=, rate=1.0]", "", "User [email=, pwd=hi!, id=, rate=-1.0]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test039");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("hi!", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test040");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test041");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("hi!", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test042");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.String str6 = loggedInUser4.getPwd();
        java.lang.String str7 = loggedInUser4.getPwd();
        java.lang.String str8 = loggedInUser4.getEmail();
        yorku.eecs3311.user.LoggedInUser loggedInUser13 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList14 = loggedInUser13.getAvailableSpaces();
        java.lang.String str15 = loggedInUser13.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList16 = loggedInUser13.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList16);
        java.lang.Class<?> wildcardClass18 = parkingSpaceList16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str15.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test043");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test044");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("hi!", "User [email=, pwd=hi!, id=, rate=1.0]", "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test045");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]", (double) 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test046");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        double double6 = loggedInUser4.getRate();
        loggedInUser4.setRate((double) (short) 0);
        java.lang.String str9 = loggedInUser4.getPwd();
        yorku.eecs3311.user.LoggedInUser loggedInUser14 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double15 = loggedInUser14.getRate();
        double double16 = loggedInUser14.getRate();
        java.lang.String str17 = loggedInUser14.getEmail();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList18 = loggedInUser14.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test047");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
        java.lang.String str4 = staff3.toString();
        staff3.setRate((double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]" + "'", str4.equals("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test048");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        loggedInUser4.setRate(1.0d);
        java.lang.String str7 = loggedInUser4.getId();
        loggedInUser4.setRate((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test049");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "hi!");
        java.lang.Class<?> wildcardClass4 = staff3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test050");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.String str6 = loggedInUser4.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList7 = loggedInUser4.getAvailableSpaces();
        yorku.eecs3311.user.LoggedInUser loggedInUser12 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double13 = loggedInUser12.getRate();
        double double14 = loggedInUser12.getRate();
        java.lang.String str15 = loggedInUser12.getEmail();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList16 = loggedInUser12.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str6.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList16);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test051");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "hi!", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", (double) (short) 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test052");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", (double) (short) -1);
        java.lang.String str5 = loggedInUser4.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, pwd=hi!, id=, rate=1.0]" + "'", str5.equals("User [email=, pwd=hi!, id=, rate=1.0]"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test053");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=, pwd=hi!, id=, rate=1.0]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test054");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        java.lang.String str9 = loggedInUser4.getId();
        loggedInUser4.setRate((double) 0L);
        java.lang.String str12 = loggedInUser4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [email=, pwd=hi!, id=, rate=0.0]" + "'", str12.equals("User [email=, pwd=hi!, id=, rate=0.0]"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test055");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=1.0]", (double) 10L);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test056");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("", "hi!", "");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getPwd();
        java.lang.String str6 = faculty3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, pwd=hi!, id=, rate=8.0]" + "'", str6.equals("User [email=, pwd=hi!, id=, rate=8.0]"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test057");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=, pwd=hi!, id=, rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test058");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=, pwd=hi!, id=, rate=0.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test059");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("", "", "User [email=, pwd=hi!, id=, rate=-1.0]");
        java.lang.String str4 = staff3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str4.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test060");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=0.0]", "", "User [email=, pwd=hi!, id=, rate=1.0]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test061");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        java.lang.String str9 = loggedInUser4.getId();
        java.lang.String str10 = loggedInUser4.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList11 = loggedInUser4.getAvailableSpaces();
        loggedInUser4.setRate((double) (short) 1);
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test062");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=, pwd=hi!, id=, rate=8.0]", "", "User [email=, pwd=hi!, id=, rate=0.0]", (double) (short) 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test063");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=8.0]", "User [email=, pwd=hi!, id=, rate=0.0]", "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test064");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str5 = loggedInUser4.toString();
        java.lang.String str6 = loggedInUser4.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str5.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test065");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=hi!, pwd=, id=, rate=15.0]", "", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test066");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test067");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=-1.0]", "hi!", "User [email=, pwd=hi!, id=, rate=1.0]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test068");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=1.0]", "", "User [email=, pwd=hi!, id=, rate=8.0]", "User [email=, pwd=hi!, id=, rate=1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test069");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test070");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test071");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=, pwd=hi!, id=, rate=0.0]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test072");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=hi!, pwd=, id=, rate=15.0]", "", "hi!");
        double double4 = faculty3.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0d + "'", double4 == 8.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test073");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("", "hi!", "User [email=, pwd=hi!, id=, rate=1.0]");
        java.lang.String str4 = faculty3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=, pwd=hi!, id=, rate=1.0]" + "'", str4.equals("User [email=, pwd=hi!, id=, rate=1.0]"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test074");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=0.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", "hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test075");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "hi!");
        double double4 = staff3.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test076");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=0.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=, rate=1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test077");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=, pwd=hi!, id=, rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test078");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
        java.lang.String str4 = staff3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]" + "'", str4.equals("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test079");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", (double) (-1L));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test080");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=, pwd=hi!, id=, rate=8.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test081");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        loggedInUser4.setRate(1.0d);
        java.lang.String str7 = loggedInUser4.getId();
        java.lang.String str8 = loggedInUser4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test082");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test083");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=0.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test084");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test085");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=, pwd=hi!, id=, rate=0.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test086");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("hi!", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test087");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=8.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", "hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test088");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.String str7 = loggedInUser4.getEmail();
        yorku.eecs3311.user.LoggedInUser loggedInUser12 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str13 = loggedInUser12.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList14 = loggedInUser12.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList14);
        yorku.eecs3311.user.LoggedInUser loggedInUser20 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray21 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList22 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList22, parkingSpaceArray21);
        loggedInUser20.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList22);
        java.lang.String str25 = loggedInUser20.getId();
        loggedInUser20.setRate((double) 0L);
        yorku.eecs3311.user.LoggedInUser loggedInUser32 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double33 = loggedInUser32.getRate();
        java.lang.String str34 = loggedInUser32.toString();
        java.lang.String str35 = loggedInUser32.getEmail();
        java.lang.String str36 = loggedInUser32.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList37 = loggedInUser32.getAvailableSpaces();
        loggedInUser20.update(parkingSpaceList37);
        loggedInUser4.update(parkingSpaceList37);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList40 = loggedInUser4.getAvailableSpaces();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str34.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList40);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test089");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("", "", "");
        java.lang.Class<?> wildcardClass4 = student3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test090");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=0.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=, pwd=hi!, id=, rate=8.0]", "User [email=, pwd=hi!, id=, rate=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test091");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
        faculty3.setRate((double) (byte) 100);
        java.lang.Class<?> wildcardClass6 = faculty3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test092");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("", "hi!", "");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getPwd();
        java.lang.String str6 = faculty3.getPwd();
        java.lang.String str7 = faculty3.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test093");
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
        yorku.eecs3311.user.LoggedInUser loggedInUser23 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double24 = loggedInUser23.getRate();
        java.lang.String str25 = loggedInUser23.toString();
        java.lang.String str26 = loggedInUser23.getEmail();
        java.lang.String str27 = loggedInUser23.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList28 = loggedInUser23.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList28);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str25.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList28);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test094");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=, pwd=hi!, id=, rate=0.0]", "hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test095");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=1.0]", "", "User [email=hi!, pwd=, id=, rate=15.0]");
        java.lang.String str4 = staff3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]" + "'", str4.equals("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test096");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test097");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.String str7 = loggedInUser4.getEmail();
        java.lang.String str8 = loggedInUser4.getPwd();
        double double9 = loggedInUser4.getRate();
        loggedInUser4.setRate((double) 0);
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
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test098");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=0.0]");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test099");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "", (double) (short) 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test100");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test101");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("hi!", "User [email=, pwd=hi!, id=, rate=0.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test102");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test103");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "hi!", "User [email=, pwd=hi!, id=, rate=8.0]");
        double double4 = faculty3.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0d + "'", double4 == 8.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test104");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.String str7 = loggedInUser4.getEmail();
        java.lang.String str8 = loggedInUser4.getPwd();
        java.lang.Class<?> wildcardClass9 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str6.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test105");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("hi!", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test106");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=1.0]", "hi!", "User [email=, pwd=hi!, id=, rate=1.0]");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=, pwd=hi!, id=, rate=1.0]" + "'", str4.equals("User [email=, pwd=hi!, id=, rate=1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]" + "'", str5.equals("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test107");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=-1.0]", "hi!", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=, pwd=hi!, id=, rate=8.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test108");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.String str6 = loggedInUser4.getPwd();
        java.lang.String str7 = loggedInUser4.getPwd();
        java.lang.String str8 = loggedInUser4.getEmail();
        yorku.eecs3311.user.LoggedInUser loggedInUser13 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList14 = loggedInUser13.getAvailableSpaces();
        java.lang.String str15 = loggedInUser13.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList16 = loggedInUser13.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList16);
        java.lang.Class<?> wildcardClass18 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str15.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test109");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=, pwd=hi!, id=, rate=0.0]", "", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test110");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.String str7 = loggedInUser4.getEmail();
        java.lang.String str8 = loggedInUser4.getPwd();
        java.lang.String str9 = loggedInUser4.toString();
        loggedInUser4.setRate((double) '4');
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test111");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=0.0]", "hi!", "User [email=, pwd=hi!, id=, rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test112");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("hi!", "", "");
        java.lang.String str4 = visitor3.toString();
        double double5 = visitor3.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str4.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test113");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=, pwd=hi!, id=, rate=0.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test114");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", 8.0d);
        java.lang.Class<?> wildcardClass5 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test115");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]");
        java.lang.String str4 = student3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str4.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test116");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.String str6 = loggedInUser4.getPwd();
        java.lang.String str7 = loggedInUser4.getPwd();
        java.lang.String str8 = loggedInUser4.getEmail();
        yorku.eecs3311.user.LoggedInUser loggedInUser13 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList14 = loggedInUser13.getAvailableSpaces();
        java.lang.String str15 = loggedInUser13.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList16 = loggedInUser13.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList16);
        java.lang.String str18 = loggedInUser4.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str15.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test117");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=, pwd=hi!, id=, rate=8.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test118");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=, pwd=hi!, id=, rate=8.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
        java.lang.String str4 = visitor3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=, pwd=hi!, id=, rate=8.0]" + "'", str4.equals("User [email=, pwd=hi!, id=, rate=8.0]"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test119");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "");
        double double4 = faculty3.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0d + "'", double4 == 8.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test120");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test121");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]");
        student3.setRate((double) ' ');
        java.lang.String str6 = student3.getEmail();
        java.lang.Class<?> wildcardClass7 = student3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str6.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test122");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test123");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "hi!", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test124");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test125");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=1.0]", "hi!", "User [email=, pwd=hi!, id=, rate=1.0]");
        java.lang.String str4 = faculty3.toString();
        java.lang.String str5 = faculty3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]" + "'", str4.equals("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]" + "'", str5.equals("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test126");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("hi!", "hi!", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test127");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("", "", "User [email=, pwd=hi!, id=, rate=8.0]", "User [email=, pwd=hi!, id=, rate=8.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test128");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("", "", "User [email=, pwd=hi!, id=, rate=-1.0]");
        double double4 = staff3.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test129");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "User [email=, pwd=hi!, id=, rate=-1.0]", 0.0d);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        double double6 = loggedInUser4.getRate();
        yorku.eecs3311.user.LoggedInUser loggedInUser11 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double12 = loggedInUser11.getRate();
        java.lang.String str13 = loggedInUser11.toString();
        java.lang.String str14 = loggedInUser11.getEmail();
        yorku.eecs3311.user.LoggedInUser loggedInUser19 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str20 = loggedInUser19.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList21 = loggedInUser19.getAvailableSpaces();
        loggedInUser11.update(parkingSpaceList21);
        yorku.eecs3311.user.LoggedInUser loggedInUser27 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray28 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList29 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList29, parkingSpaceArray28);
        loggedInUser27.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList29);
        java.lang.String str32 = loggedInUser27.getId();
        loggedInUser27.setRate((double) 0L);
        yorku.eecs3311.user.LoggedInUser loggedInUser39 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double40 = loggedInUser39.getRate();
        java.lang.String str41 = loggedInUser39.toString();
        java.lang.String str42 = loggedInUser39.getEmail();
        java.lang.String str43 = loggedInUser39.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList44 = loggedInUser39.getAvailableSpaces();
        loggedInUser27.update(parkingSpaceList44);
        loggedInUser11.update(parkingSpaceList44);
        loggedInUser4.update(parkingSpaceList44);
        loggedInUser4.setRate(5.0d);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList50 = loggedInUser4.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str13.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str20.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str41.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList50);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test130");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test131");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=, pwd=hi!, id=, rate=0.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", 1.0d);
        java.lang.String str5 = loggedInUser4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]" + "'", str5.equals("User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test132");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=0.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=, pwd=hi!, id=, rate=0.0]");
        staff3.setRate((double) 0.0f);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test133");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=, pwd=hi!, id=, rate=1.0]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test134");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "hi!", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
        staff3.setRate((double) 1.0f);
        double double6 = staff3.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test135");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        java.lang.String str9 = loggedInUser4.getId();
        loggedInUser4.setRate((double) 0L);
        java.lang.Class<?> wildcardClass12 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test136");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test137");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test138");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "User [email=, pwd=hi!, id=, rate=-1.0]", 0.0d);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        yorku.eecs3311.user.LoggedInUser loggedInUser10 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray11 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList12 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList12, parkingSpaceArray11);
        loggedInUser10.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList12);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test139");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test140");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str5 = loggedInUser4.toString();
        java.lang.Class<?> wildcardClass6 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str5.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test141");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=, pwd=hi!, id=, rate=8.0]", "", "User [email=hi!, pwd=, id=, rate=15.0]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test142");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]", (double) 1.0f);
        loggedInUser4.setRate((double) 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test143");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        double double6 = loggedInUser4.getRate();
        loggedInUser4.setRate((double) (short) 0);
        java.lang.String str9 = loggedInUser4.getPwd();
        java.lang.Class<?> wildcardClass10 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test144");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "", "User [email=, pwd=hi!, id=, rate=0.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test145");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.String str7 = loggedInUser4.getEmail();
        yorku.eecs3311.user.LoggedInUser loggedInUser12 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str13 = loggedInUser12.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList14 = loggedInUser12.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList14);
        yorku.eecs3311.user.LoggedInUser loggedInUser20 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray21 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList22 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList22, parkingSpaceArray21);
        loggedInUser20.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList22);
        java.lang.String str25 = loggedInUser20.getId();
        loggedInUser20.setRate((double) 0L);
        yorku.eecs3311.user.LoggedInUser loggedInUser32 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double33 = loggedInUser32.getRate();
        java.lang.String str34 = loggedInUser32.toString();
        java.lang.String str35 = loggedInUser32.getEmail();
        java.lang.String str36 = loggedInUser32.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList37 = loggedInUser32.getAvailableSpaces();
        loggedInUser20.update(parkingSpaceList37);
        loggedInUser4.update(parkingSpaceList37);
        yorku.eecs3311.user.LoggedInUser loggedInUser44 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double45 = loggedInUser44.getRate();
        java.lang.String str46 = loggedInUser44.toString();
        java.lang.String str47 = loggedInUser44.getEmail();
        java.lang.String str48 = loggedInUser44.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList49 = loggedInUser44.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList49);
        java.lang.String str51 = loggedInUser4.getPwd();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str34.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str46.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test146");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
        visitor3.setRate((double) 1.0f);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test147");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]");
        java.lang.String str4 = visitor3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]" + "'", str4.equals("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test148");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("hi!", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test149");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "", "User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test150");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test151");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=1.0]", "", "User [email=, pwd=hi!, id=, rate=1.0]");
        java.lang.String str4 = staff3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=, pwd=hi!, id=, rate=1.0]" + "'", str4.equals("User [email=, pwd=hi!, id=, rate=1.0]"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test152");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
        java.lang.String str4 = staff3.toString();
        double double5 = staff3.getRate();
        java.lang.String str6 = staff3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]" + "'", str4.equals("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]" + "'", str6.equals("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test153");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test154");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test155");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test156");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.String str6 = loggedInUser4.getEmail();
        java.lang.String str7 = loggedInUser4.getId();
        double double8 = loggedInUser4.getRate();
        java.lang.String str9 = loggedInUser4.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList10 = loggedInUser4.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test157");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=, pwd=hi!, id=, rate=8.0]", "User [email=, pwd=hi!, id=, rate=0.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
        java.lang.String str4 = student3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]" + "'", str4.equals("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test158");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=, pwd=hi!, id=, rate=1.0]", "", "hi!", (double) (short) 10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test159");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("", "User [email=, pwd=hi!, id=, rate=-1.0]", "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test160");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=, pwd=hi!, id=, rate=8.0]", (double) ' ');
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test161");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=, pwd=hi!, id=, rate=-1.0]", "", "");
        java.lang.String str4 = visitor3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str4.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test162");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=, pwd=hi!, id=, rate=8.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
        java.lang.String str4 = visitor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]" + "'", str4.equals("User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test163");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]", (double) 1.0f);
        java.lang.String str5 = loggedInUser4.toString();
        loggedInUser4.setRate((double) (short) 0);
        java.lang.String str8 = loggedInUser4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]" + "'", str5.equals("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=0.0]" + "'", str8.equals("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=0.0]"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test164");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "User [email=, pwd=hi!, id=, rate=-1.0]", 0.0d);
        java.lang.String str5 = loggedInUser4.toString();
        java.lang.String str6 = loggedInUser4.getId();
        loggedInUser4.setRate((double) (-1L));
        java.lang.String str9 = loggedInUser4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]" + "'", str5.equals("User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str6.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str9.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test165");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test166");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=0.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=8.0]", 1.0d);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test167");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str5 = loggedInUser4.toString();
        yorku.eecs3311.user.LoggedInUser loggedInUser10 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str11 = loggedInUser10.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList12 = loggedInUser10.getAvailableSpaces();
        double double13 = loggedInUser10.getRate();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList14 = loggedInUser10.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList14);
        loggedInUser4.setRate((double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str5.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str11.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test168");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]", "User [email=, pwd=hi!, id=, rate=8.0]", "User [email=hi!, pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=-1.0]");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test169");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=, pwd=hi!, id=, rate=8.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
        double double4 = staff3.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test170");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test171");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        java.lang.String str9 = loggedInUser4.getId();
        java.lang.String str10 = loggedInUser4.getPwd();
        java.lang.String str11 = loggedInUser4.toString();
        java.lang.Class<?> wildcardClass12 = loggedInUser4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test172");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
        java.lang.String str4 = visitor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]" + "'", str4.equals("User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test173");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
        java.lang.String str4 = faculty3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=, pwd=hi!, id=, rate=-1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=8.0]" + "'", str4.equals("User [email=User [email=, pwd=hi!, id=, rate=-1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=8.0]"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test174");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.Class<?> wildcardClass7 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str6.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test175");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=1.0]", "hi!", "User [email=, pwd=hi!, id=, rate=1.0]");
        faculty3.setRate((double) 1.0f);
        java.lang.String str6 = faculty3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, pwd=hi!, id=, rate=1.0]" + "'", str6.equals("User [email=, pwd=hi!, id=, rate=1.0]"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test176");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=hi!, pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=-1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test177");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=, pwd=hi!, id=, rate=0.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", 1.0d);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test178");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("hi!", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=, rate=1.0]");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test179");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str5 = loggedInUser4.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = loggedInUser4.getAvailableSpaces();
        double double7 = loggedInUser4.getRate();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList8 = loggedInUser4.getAvailableSpaces();
        java.lang.String str9 = loggedInUser4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str5.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test180");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]", 100.0d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test181");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=hi!, pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=-1.0]");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test182");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test183");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "User [email=, pwd=hi!, id=, rate=-1.0]", 0.0d);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        loggedInUser4.setRate((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test184");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test185");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test186");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=, pwd=hi!, id=, rate=0.0]", "User [email=hi!, pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=-1.0]", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test187");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("", "User [email=, pwd=hi!, id=, rate=1.0]", "hi!");
        double double4 = staff3.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test188");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]", (double) 1.0f);
        loggedInUser4.setRate((double) (short) -1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test189");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test190");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "hi!", "User [email=, pwd=hi!, id=, rate=-1.0]");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test191");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("", "hi!", "");
        java.lang.String str4 = faculty3.getId();
        faculty3.setRate((double) 0L);
        java.lang.Class<?> wildcardClass7 = faculty3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test192");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        double double6 = loggedInUser4.getRate();
        java.lang.String str7 = loggedInUser4.getEmail();
        yorku.eecs3311.user.LoggedInUser loggedInUser12 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray13 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList14 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList14, parkingSpaceArray13);
        loggedInUser12.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList14);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test193");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str5 = loggedInUser4.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = loggedInUser4.getAvailableSpaces();
        java.lang.Class<?> wildcardClass7 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str5.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test194");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "User [email=hi!, pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=-1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", (double) 100);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test195");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("hi!", "", "");
        java.lang.String str4 = visitor3.toString();
        visitor3.setRate((double) 'a');
        double double7 = visitor3.getRate();
        visitor3.setRate((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str4.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test196");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        loggedInUser4.setRate(1.0d);
        java.lang.String str7 = loggedInUser4.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList8 = loggedInUser4.getAvailableSpaces();
        java.lang.String str9 = loggedInUser4.getEmail();
        java.lang.String str10 = loggedInUser4.toString();
        double double11 = loggedInUser4.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=, pwd=hi!, id=, rate=1.0]" + "'", str7.equals("User [email=, pwd=hi!, id=, rate=1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=, pwd=hi!, id=, rate=1.0]" + "'", str10.equals("User [email=, pwd=hi!, id=, rate=1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test197");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=, pwd=hi!, id=, rate=0.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=8.0]", (double) (-1));
        yorku.eecs3311.user.LoggedInUser loggedInUser9 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str10 = loggedInUser9.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList11 = loggedInUser9.getAvailableSpaces();
        double double12 = loggedInUser9.getRate();
        yorku.eecs3311.user.LoggedInUser loggedInUser17 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double18 = loggedInUser17.getRate();
        java.lang.String str19 = loggedInUser17.toString();
        java.lang.String str20 = loggedInUser17.getEmail();
        java.lang.String str21 = loggedInUser17.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList22 = loggedInUser17.getAvailableSpaces();
        loggedInUser9.update(parkingSpaceList22);
        loggedInUser4.update(parkingSpaceList22);
        java.lang.Class<?> wildcardClass25 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str10.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str19.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test198");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test199");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.String str6 = loggedInUser4.getEmail();
        java.lang.String str7 = loggedInUser4.getId();
        double double8 = loggedInUser4.getRate();
        java.lang.String str9 = loggedInUser4.getId();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList10 = loggedInUser4.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test200");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=hi!, pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=-1.0]", "User [email=, pwd=hi!, id=, rate=8.0]", (double) (short) 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test201");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", (double) (short) -1);
        yorku.eecs3311.user.LoggedInUser loggedInUser9 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList10 = loggedInUser9.getAvailableSpaces();
        java.lang.String str11 = loggedInUser9.getPwd();
        java.lang.String str12 = loggedInUser9.getPwd();
        java.lang.String str13 = loggedInUser9.getEmail();
        yorku.eecs3311.user.LoggedInUser loggedInUser18 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList19 = loggedInUser18.getAvailableSpaces();
        java.lang.String str20 = loggedInUser18.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList21 = loggedInUser18.getAvailableSpaces();
        loggedInUser9.update(parkingSpaceList21);
        loggedInUser4.update(parkingSpaceList21);
        loggedInUser4.setRate((-1.0d));
        java.lang.String str26 = loggedInUser4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str20.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str26.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test202");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=, rate=0.0]", 100.0d);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test203");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("hi!", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test204");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=User [email=, pwd=hi!, id=, rate=-1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=8.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test205");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=User [email=, pwd=hi!, id=, rate=-1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=8.0]", "User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test206");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.String str7 = loggedInUser4.getEmail();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList8 = loggedInUser4.getAvailableSpaces();
        yorku.eecs3311.user.LoggedInUser loggedInUser13 = new yorku.eecs3311.user.LoggedInUser("hi!", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", (double) (short) -1);
        yorku.eecs3311.user.LoggedInUser loggedInUser18 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList19 = loggedInUser18.getAvailableSpaces();
        java.lang.String str20 = loggedInUser18.getPwd();
        java.lang.String str21 = loggedInUser18.getPwd();
        java.lang.String str22 = loggedInUser18.getEmail();
        yorku.eecs3311.user.LoggedInUser loggedInUser27 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList28 = loggedInUser27.getAvailableSpaces();
        java.lang.String str29 = loggedInUser27.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList30 = loggedInUser27.getAvailableSpaces();
        loggedInUser18.update(parkingSpaceList30);
        loggedInUser13.update(parkingSpaceList30);
        loggedInUser4.update(parkingSpaceList30);
        java.lang.String str34 = loggedInUser4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str6.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str29.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test207");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        loggedInUser4.setRate((double) 100);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList11 = loggedInUser4.getAvailableSpaces();
        loggedInUser4.setRate((double) (byte) 100);
        java.lang.String str14 = loggedInUser4.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList15 = loggedInUser4.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList15);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test208");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test209");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test210");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        loggedInUser4.setRate(1.0d);
        java.lang.String str7 = loggedInUser4.getEmail();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList8 = loggedInUser4.getAvailableSpaces();
        yorku.eecs3311.user.LoggedInUser loggedInUser13 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double14 = loggedInUser13.getRate();
        java.lang.String str15 = loggedInUser13.toString();
        java.lang.String str16 = loggedInUser13.getEmail();
        java.lang.String str17 = loggedInUser13.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList18 = loggedInUser13.getAvailableSpaces();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList19 = loggedInUser13.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str15.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList19);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test211");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test212");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=hi!, pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=-1.0]", "hi!", 0.0d);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test213");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "User [email=, pwd=hi!, id=, rate=-1.0]", 0.0d);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        double double6 = loggedInUser4.getRate();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList7 = loggedInUser4.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test214");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.String str7 = loggedInUser4.toString();
        yorku.eecs3311.user.LoggedInUser loggedInUser12 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        loggedInUser12.setRate(1.0d);
        java.lang.String str15 = loggedInUser12.getEmail();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList16 = loggedInUser12.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList16);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList18 = loggedInUser4.getAvailableSpaces();
        java.lang.String str19 = loggedInUser4.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str6.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str7.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test215");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=0.0]", "User [email=hi!, pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=-1.0]");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test216");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.String str7 = loggedInUser4.getEmail();
        yorku.eecs3311.user.LoggedInUser loggedInUser12 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str13 = loggedInUser12.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList14 = loggedInUser12.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList14);
        java.lang.String str16 = loggedInUser4.getEmail();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test217");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=, pwd=hi!, id=, rate=0.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=8.0]", (double) (-1));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test218");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=0.0]", "User [email=, pwd=hi!, id=, rate=8.0]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test219");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=, pwd=hi!, id=, rate=0.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=8.0]", (double) (-1));
        yorku.eecs3311.user.LoggedInUser loggedInUser9 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList10 = loggedInUser9.getAvailableSpaces();
        java.lang.String str11 = loggedInUser9.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList12 = loggedInUser9.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str11.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList12);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test220");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
        java.lang.Class<?> wildcardClass4 = staff3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test221");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=User [email=, pwd=hi!, id=, rate=-1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test222");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray5 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6, parkingSpaceArray5);
        loggedInUser4.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList6);
        java.lang.String str9 = loggedInUser4.getId();
        java.lang.String str10 = loggedInUser4.getPwd();
        loggedInUser4.setRate((double) 100.0f);
        java.lang.String str13 = loggedInUser4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test223");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "hi!", "User [email=, pwd=hi!, id=, rate=-1.0]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test224");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        loggedInUser4.setRate((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test225");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("hi!", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test226");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("hi!", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
        double double4 = student3.getRate();
        student3.setRate((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.0d + "'", double4 == 5.0d);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test227");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]");
        visitor3.setRate((double) (byte) -1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test228");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        double double6 = loggedInUser4.getRate();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList7 = loggedInUser4.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test229");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test230");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "User [email=hi!, pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=-1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", (double) ' ');
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test231");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=, pwd=hi!, id=, rate=-1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=8.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test232");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test233");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=, pwd=hi!, id=, rate=8.0]");
        java.lang.String str4 = staff3.getPwd();
        java.lang.String str5 = staff3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]" + "'", str4.equals("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0], pwd=User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0], id=User [email=, pwd=hi!, id=, rate=8.0], rate=10.0]" + "'", str5.equals("User [email=User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0], pwd=User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0], id=User [email=, pwd=hi!, id=, rate=8.0], rate=10.0]"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test234");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test235");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("hi!", "User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test236");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0], pwd=User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0], id=User [email=, pwd=hi!, id=, rate=8.0], rate=10.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test237");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=, pwd=hi!, id=, rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", 8.0d);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test238");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        loggedInUser4.setRate((double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test239");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=0.0]", "hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test240");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=, pwd=hi!, id=, rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]");
        java.lang.String str4 = student3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]" + "'", str4.equals("User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test241");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=1.0]", "hi!", "User [email=, pwd=hi!, id=, rate=1.0]");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass5 = faculty3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=, pwd=hi!, id=, rate=1.0]" + "'", str4.equals("User [email=, pwd=hi!, id=, rate=1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test242");
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
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList18 = loggedInUser12.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList18);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test243");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "hi!");
        java.lang.String str4 = staff3.getId();
        java.lang.String str5 = staff3.getId();
        double double6 = staff3.getRate();
        double double7 = staff3.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test244");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]");
        java.lang.String str4 = student3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], id=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], rate=5.0]" + "'", str4.equals("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], id=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], rate=5.0]"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test245");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=, pwd=hi!, id=, rate=0.0]");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test246");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0], pwd=User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0], id=User [email=, pwd=hi!, id=, rate=8.0], rate=10.0]", "User [email=, pwd=hi!, id=, rate=8.0]");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test247");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]", (double) 1.0f);
        java.lang.Class<?> wildcardClass5 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test248");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "", "");
        java.lang.String str4 = staff3.getEmail();
        java.lang.String str5 = staff3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str4.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str5.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test249");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=hi!, pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=-1.0]", "hi!", "User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test250");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=0.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "");
        java.lang.String str4 = staff3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test251");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", (double) (short) -1);
        yorku.eecs3311.user.LoggedInUser loggedInUser9 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList10 = loggedInUser9.getAvailableSpaces();
        java.lang.String str11 = loggedInUser9.getPwd();
        java.lang.String str12 = loggedInUser9.getPwd();
        java.lang.String str13 = loggedInUser9.getEmail();
        yorku.eecs3311.user.LoggedInUser loggedInUser18 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList19 = loggedInUser18.getAvailableSpaces();
        java.lang.String str20 = loggedInUser18.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList21 = loggedInUser18.getAvailableSpaces();
        loggedInUser9.update(parkingSpaceList21);
        loggedInUser4.update(parkingSpaceList21);
        yorku.eecs3311.user.LoggedInUser loggedInUser28 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray29 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList30 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList30, parkingSpaceArray29);
        loggedInUser28.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList30);
        loggedInUser28.setRate((double) 100);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList35 = loggedInUser28.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str20.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList35);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test252");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=User [email=, pwd=hi!, id=, rate=-1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=8.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test253");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=, pwd=hi!, id=, rate=8.0]");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test254");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test255");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test256");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0], pwd=User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0], id=User [email=, pwd=hi!, id=, rate=8.0], rate=10.0]", (double) 10L);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test257");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0], pwd=User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0], id=User [email=, pwd=hi!, id=, rate=8.0], rate=10.0]", "hi!", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test258");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0], pwd=User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0], id=User [email=, pwd=hi!, id=, rate=8.0], rate=10.0]", "");
        java.lang.Class<?> wildcardClass4 = student3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test259");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=hi!, pwd=, id=, rate=15.0]", "", "");
        java.lang.String str4 = faculty3.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test260");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]");
        double double4 = visitor3.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test261");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test262");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0], pwd=User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0], id=User [email=, pwd=hi!, id=, rate=8.0], rate=10.0]", "hi!", "User [email=, pwd=hi!, id=, rate=0.0]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test263");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        loggedInUser4.setRate(1.0d);
        java.lang.String str7 = loggedInUser4.toString();
        yorku.eecs3311.user.LoggedInUser loggedInUser12 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str13 = loggedInUser12.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList14 = loggedInUser12.getAvailableSpaces();
        double double15 = loggedInUser12.getRate();
        yorku.eecs3311.user.LoggedInUser loggedInUser20 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double21 = loggedInUser20.getRate();
        java.lang.String str22 = loggedInUser20.toString();
        java.lang.String str23 = loggedInUser20.getEmail();
        java.lang.String str24 = loggedInUser20.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList25 = loggedInUser20.getAvailableSpaces();
        loggedInUser12.update(parkingSpaceList25);
        loggedInUser4.update(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=, pwd=hi!, id=, rate=1.0]" + "'", str7.equals("User [email=, pwd=hi!, id=, rate=1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str13.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str22.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test264");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str5 = loggedInUser4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test265");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test266");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("", "User [email=User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0], pwd=User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0], id=User [email=, pwd=hi!, id=, rate=8.0], rate=10.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test267");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=, pwd=hi!, id=, rate=-1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test268");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=8.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test269");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", (double) 1);
        double double5 = loggedInUser4.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test270");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.String str7 = loggedInUser4.getEmail();
        java.lang.String str8 = loggedInUser4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str6.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str8.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test271");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=, pwd=hi!, id=, rate=0.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=0.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test272");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", (double) (short) -1);
        yorku.eecs3311.user.LoggedInUser loggedInUser9 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList10 = loggedInUser9.getAvailableSpaces();
        java.lang.String str11 = loggedInUser9.getPwd();
        java.lang.String str12 = loggedInUser9.getPwd();
        java.lang.String str13 = loggedInUser9.getEmail();
        yorku.eecs3311.user.LoggedInUser loggedInUser18 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList19 = loggedInUser18.getAvailableSpaces();
        java.lang.String str20 = loggedInUser18.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList21 = loggedInUser18.getAvailableSpaces();
        loggedInUser9.update(parkingSpaceList21);
        loggedInUser4.update(parkingSpaceList21);
        java.lang.String str24 = loggedInUser4.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList25 = loggedInUser4.getAvailableSpaces();
        double double26 = loggedInUser4.getRate();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList27 = loggedInUser4.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str20.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "User [email=hi!, pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=-1.0]" + "'", str24.equals("User [email=hi!, pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList27);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test273");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = loggedInUser4.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test274");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]", "", "");
        faculty3.setRate((double) (short) 0);
        java.lang.String str6 = faculty3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test275");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=0.0]", "hi!", "User [email=, pwd=hi!, id=, rate=1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test276");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]", "User [email=hi!, pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=-1.0]", "User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]");
        student3.setRate((double) 'a');
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test277");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=1.0]", "hi!", "User [email=, pwd=hi!, id=, rate=1.0]");
        java.lang.String str4 = faculty3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=, pwd=hi!, id=, rate=1.0]" + "'", str4.equals("User [email=, pwd=hi!, id=, rate=1.0]"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test278");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("hi!", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", (double) (short) -1);
        double double5 = loggedInUser4.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test279");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], id=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], rate=5.0]", "User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test280");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=, pwd=hi!, id=, rate=8.0]");
        java.lang.String str4 = staff3.getId();
        java.lang.String str5 = staff3.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=, pwd=hi!, id=, rate=8.0]" + "'", str4.equals("User [email=, pwd=hi!, id=, rate=8.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]" + "'", str5.equals("User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]"));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test281");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("", "User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
        java.lang.String str4 = faculty3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=, pwd=User [email=, pwd=hi!, id=, rate=-1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=8.0]" + "'", str4.equals("User [email=, pwd=User [email=, pwd=hi!, id=, rate=-1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=8.0]"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test282");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=, pwd=hi!, id=, rate=8.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test283");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], id=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], rate=5.0]", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test284");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
        java.lang.String str4 = staff3.getEmail();
        double double5 = staff3.getRate();
        staff3.setRate((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str4.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test285");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]", "User [email=, pwd=hi!, id=, rate=0.0]", "User [email=, pwd=hi!, id=, rate=1.0]");
        java.lang.String str4 = visitor3.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=, pwd=hi!, id=, rate=0.0]" + "'", str4.equals("User [email=, pwd=hi!, id=, rate=0.0]"));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test286");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=0.0]", "User [email=, pwd=hi!, id=, rate=-1.0]", "hi!");
        staff3.setRate(0.0d);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test287");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=User [email=, pwd=hi!, id=, rate=0.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=1.0]");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test288");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=0.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
        java.lang.Class<?> wildcardClass4 = student3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test289");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test290");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("hi!", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "");
        double double4 = student3.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.0d + "'", double4 == 5.0d);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test291");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=hi!, id=, rate=-1.0]", "", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=, pwd=hi!, id=, rate=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test292");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("", "hi!", "User [email=, pwd=hi!, id=, rate=1.0]");
        java.lang.String str4 = faculty3.getEmail();
        double double5 = faculty3.getRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test293");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "", "User [email=, pwd=hi!, id=, rate=8.0]");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test294");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=, rate=8.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=hi!, pwd=, id=, rate=15.0]");
        java.lang.String str4 = faculty3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=8.0]" + "'", str4.equals("User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=8.0]"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test295");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=, pwd=hi!, id=, rate=0.0]", "User [email=, pwd=hi!, id=, rate=8.0]", "User [email=, pwd=hi!, id=, rate=0.0]", (double) (short) 10);
        java.lang.String str5 = loggedInUser4.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, pwd=hi!, id=, rate=8.0]" + "'", str5.equals("User [email=, pwd=hi!, id=, rate=8.0]"));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test296");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], id=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], rate=5.0]", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=, pwd=hi!, id=, rate=-1.0]");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test297");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("hi!", "", "");
        java.lang.String str4 = visitor3.toString();
        java.lang.String str5 = visitor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str4.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str5.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test298");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=, pwd=User [email=, pwd=hi!, id=, rate=-1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=8.0]", "User [email=, pwd=hi!, id=, rate=8.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], id=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], rate=5.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test299");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=, pwd=hi!, id=, rate=-1.0]", "User [email=User [email=, pwd=hi!, id=, rate=-1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=8.0]", "", (double) 1L);
        yorku.eecs3311.user.LoggedInUser loggedInUser9 = new yorku.eecs3311.user.LoggedInUser("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]", (double) 1.0f);
        java.lang.String str10 = loggedInUser9.toString();
        yorku.eecs3311.user.LoggedInUser loggedInUser15 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double16 = loggedInUser15.getRate();
        java.lang.String str17 = loggedInUser15.toString();
        java.lang.String str18 = loggedInUser15.getEmail();
        java.lang.String str19 = loggedInUser15.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList20 = loggedInUser15.getAvailableSpaces();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList21 = loggedInUser15.getAvailableSpaces();
        loggedInUser9.update(parkingSpaceList21);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList23 = loggedInUser9.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]" + "'", str10.equals("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str17.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList23);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test300");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("hi!", "", "");
        java.lang.String str4 = visitor3.toString();
        visitor3.setRate((double) 'a');
        double double7 = visitor3.getRate();
        java.lang.String str8 = visitor3.getPwd();
        java.lang.String str9 = visitor3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=hi!, pwd=, id=, rate=15.0]" + "'", str4.equals("User [email=hi!, pwd=, id=, rate=15.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=hi!, pwd=, id=, rate=97.0]" + "'", str9.equals("User [email=hi!, pwd=, id=, rate=97.0]"));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test301");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test302");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=, pwd=hi!, id=, rate=0.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test303");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=hi!, pwd=, id=, rate=97.0]", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=8.0]");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test304");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.String str6 = loggedInUser4.getPwd();
        java.lang.String str7 = loggedInUser4.getPwd();
        java.lang.String str8 = loggedInUser4.getEmail();
        java.lang.String str9 = loggedInUser4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str9.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test305");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=User [email=, pwd=hi!, id=, rate=-1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=8.0]", "User [email=hi!, pwd=, id=, rate=97.0]");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test306");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "User [email=User [email=, pwd=hi!, id=, rate=-1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=-1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], rate=8.0]", (-1.0d));
        yorku.eecs3311.user.LoggedInUser loggedInUser9 = new yorku.eecs3311.user.LoggedInUser("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=, pwd=hi!, id=, rate=1.0]", "User [email=hi!, pwd=, id=, rate=15.0]", (double) 1.0f);
        java.lang.String str10 = loggedInUser9.toString();
        yorku.eecs3311.user.LoggedInUser loggedInUser15 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double16 = loggedInUser15.getRate();
        java.lang.String str17 = loggedInUser15.toString();
        java.lang.String str18 = loggedInUser15.getEmail();
        java.lang.String str19 = loggedInUser15.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList20 = loggedInUser15.getAvailableSpaces();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList21 = loggedInUser15.getAvailableSpaces();
        loggedInUser9.update(parkingSpaceList21);
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList23 = loggedInUser9.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]" + "'", str10.equals("User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str17.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList23);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test307");
        yorku.eecs3311.user.Student student3 = new yorku.eecs3311.user.Student("User [email=User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0], pwd=User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0], id=User [email=, pwd=hi!, id=, rate=8.0], rate=10.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=8.0]");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test308");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=, pwd=hi!, id=, rate=0.0]", "", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
        java.lang.Class<?> wildcardClass4 = visitor3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test309");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("User [email=hi!, pwd=, id=, rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], id=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], rate=5.0]", "User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=8.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test310");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str5 = loggedInUser4.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList6 = loggedInUser4.getAvailableSpaces();
        double double7 = loggedInUser4.getRate();
        java.lang.String str8 = loggedInUser4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str5.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str8.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test311");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=, pwd=hi!, id=, rate=0.0]", 97.0d);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test312");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double5 = loggedInUser4.getRate();
        java.lang.String str6 = loggedInUser4.toString();
        java.lang.String str7 = loggedInUser4.getEmail();
        yorku.eecs3311.user.LoggedInUser loggedInUser12 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.lang.String str13 = loggedInUser12.toString();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList14 = loggedInUser12.getAvailableSpaces();
        loggedInUser4.update(parkingSpaceList14);
        yorku.eecs3311.user.LoggedInUser loggedInUser20 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        yorku.eecs3311.parking.ParkingSpace[] parkingSpaceArray21 = new yorku.eecs3311.parking.ParkingSpace[] {};
        java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList22 = new java.util.ArrayList<yorku.eecs3311.parking.ParkingSpace>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList22, parkingSpaceArray21);
        loggedInUser20.update((java.util.List<yorku.eecs3311.parking.ParkingSpace>) parkingSpaceList22);
        java.lang.String str25 = loggedInUser20.getId();
        loggedInUser20.setRate((double) 0L);
        yorku.eecs3311.user.LoggedInUser loggedInUser32 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        double double33 = loggedInUser32.getRate();
        java.lang.String str34 = loggedInUser32.toString();
        java.lang.String str35 = loggedInUser32.getEmail();
        java.lang.String str36 = loggedInUser32.getPwd();
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList37 = loggedInUser32.getAvailableSpaces();
        loggedInUser20.update(parkingSpaceList37);
        loggedInUser4.update(parkingSpaceList37);
        java.lang.String str40 = loggedInUser4.getEmail();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str34.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test313");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0], id=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], rate=5.0]", (double) (byte) 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test314");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.String str6 = loggedInUser4.getPwd();
        loggedInUser4.setRate((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test315");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test316");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("User [email=hi!, pwd=, id=, rate=15.0]", "", "User [email=, pwd=hi!, id=, rate=-1.0]", (-1.0d));
        java.lang.Class<?> wildcardClass5 = loggedInUser4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test317");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "", (-1.0d));
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList5 = loggedInUser4.getAvailableSpaces();
        java.lang.String str6 = loggedInUser4.getEmail();
        java.lang.String str7 = loggedInUser4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [email=, pwd=hi!, id=, rate=-1.0]" + "'", str7.equals("User [email=, pwd=hi!, id=, rate=-1.0]"));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test318");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]", "User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=hi!, pwd=, id=, rate=15.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "");
        java.lang.String str4 = visitor3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]" + "'", str4.equals("User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=hi!, id=User [email=, pwd=hi!, id=, rate=1.0], rate=8.0]"));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test319");
        yorku.eecs3311.user.LoggedInUser loggedInUser4 = new yorku.eecs3311.user.LoggedInUser("", "hi!", "User [email=, pwd=hi!, id=, rate=-1.0]", 0.0d);
        java.lang.String str5 = loggedInUser4.toString();
        java.lang.String str6 = loggedInUser4.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]" + "'", str5.equals("User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test320");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("", "hi!", "");
        java.lang.String str4 = faculty3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=, pwd=hi!, id=, rate=8.0]" + "'", str4.equals("User [email=, pwd=hi!, id=, rate=8.0]"));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test321");
        yorku.eecs3311.user.Faculty faculty3 = new yorku.eecs3311.user.Faculty("User [email=User [email=, pwd=hi!, id=, rate=8.0], pwd=User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]", "hi!", "User [email=, pwd=hi!, id=, rate=1.0]");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test322");
        yorku.eecs3311.user.User user4 = yorku.eecs3311.user.UserFactory.generateUser("", "User [email=, pwd=User [email=, pwd=hi!, id=, rate=-1.0], id=User [email=, pwd=hi!, id=, rate=-1.0], rate=8.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]", "User [email=, pwd=hi!, id=, rate=8.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test323");
        yorku.eecs3311.user.Visitor visitor3 = new yorku.eecs3311.user.Visitor("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=User [email=, pwd=hi!, id=, rate=1.0], pwd=, id=User [email=hi!, pwd=, id=, rate=15.0], rate=10.0]");
        java.lang.String str4 = visitor3.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]" + "'", str4.equals("User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserRegressionTest0.test324");
        yorku.eecs3311.user.Staff staff3 = new yorku.eecs3311.user.Staff("User [email=, pwd=hi!, id=, rate=1.0]", "User [email=, pwd=hi!, id=User [email=, pwd=hi!, id=, rate=-1.0], rate=0.0]", "User [email=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], pwd=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], id=User [email=User [email=hi!, pwd=, id=, rate=15.0], pwd=User [email=, pwd=hi!, id=, rate=1.0], id=User [email=hi!, pwd=, id=, rate=15.0], rate=1.0], rate=15.0]");
    }
}

