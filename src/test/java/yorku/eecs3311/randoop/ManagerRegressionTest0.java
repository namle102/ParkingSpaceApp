package yorku.eecs3311.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManagerRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test001");
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList0 = yorku.eecs3311.manager.ManagerAccount.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test002");
        yorku.eecs3311.Subscriber subscriber0 = null;
        yorku.eecs3311.manager.ManagerAccount.addSubscriber(subscriber0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test003");
        yorku.eecs3311.Subscriber subscriber0 = null;
        yorku.eecs3311.manager.ManagerAccount.removeSubscriber(subscriber0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test004");
        yorku.eecs3311.manager.ManagerAccount.updateAvailableSpaces();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test005");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        java.lang.Class<?> wildcardClass4 = managerAccount2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test006");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = yorku.eecs3311.manager.ManagerAccount.getLotByName("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(parkingLot1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test007");
        java.util.List<yorku.eecs3311.parking.ParkingLot> parkingLotList0 = yorku.eecs3311.manager.ManagerAccount.getLots();
        java.lang.Class<?> wildcardClass1 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test008");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        java.lang.String str4 = managerAccount2.getPwd();
        java.lang.String str5 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test009");
        yorku.eecs3311.manager.ManagerAccount.notifySubscribers();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test010");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        managerAccount2.enableLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test012");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = autoAccountGeneration0.loadManagers();
        java.lang.Class<?> wildcardClass2 = autoAccountGeneration0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test013");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = yorku.eecs3311.manager.ManagerAccount.getLotByName("ManagerAccount [username=hi!, pwd=hi!]");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(parkingLot1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test014");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "ManagerAccount [username=hi!, pwd=hi!]");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test015");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        java.lang.String str10 = managerAccount2.getPwd();
        managerAccount2.enableSpace("", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test016");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        boolean boolean5 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) 'a');
        java.lang.Class<?> wildcardClass9 = managerAccount2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test017");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        managerAccount2.addLot("");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test018");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        boolean boolean5 = managerAccount2.verifyUser("");
        managerAccount2.disableLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test019");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        java.lang.Class<?> wildcardClass3 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test020");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        superManager0.generateManagerAccount();
        superManager0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = superManager0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test021");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.addLot("");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) 'a');
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test022");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList2 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = autoAccountGeneration0.loadManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test023");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test024");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        java.lang.String str13 = managerAccount2.toString();
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str13.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test025");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        superManager0.generateManagerAccount();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test026");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        boolean boolean5 = managerAccount2.verifyUser("");
        managerAccount2.addLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test027");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList2 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        java.lang.Class<?> wildcardClass4 = autoAccountGeneration0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test028");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.toString();
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test029");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("hi!");
        managerAccount2.disableLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test030");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test031");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        superManager0.showManagerAccounts();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList2 = superManager0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test032");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", 1);
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 10);
        managerAccount2.disableLot("hi!");
        managerAccount2.enableSpace("", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test033");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList2 = autoAccountGeneration0.loadManagers();
        java.lang.Class<?> wildcardClass3 = managerAccountList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test034");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.getUsername();
        java.lang.String str16 = managerAccount2.toString();
        managerAccount2.showAvailableSpaces();
        boolean boolean19 = managerAccount2.verifyUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str16.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test035");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("");
        java.lang.String str14 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str14.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test036");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.toString();
        boolean boolean17 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test037");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        java.lang.String str8 = managerAccount2.toString();
        java.lang.String str9 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str8.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str9.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test038");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        java.lang.String str4 = managerAccount2.getPwd();
        managerAccount2.enableSpace("hi!", (int) (byte) 0);
        java.lang.String str8 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str8.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test039");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        java.lang.Class<?> wildcardClass12 = managerAccount2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test040");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableLot("");
        managerAccount2.addLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test041");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        java.lang.String str13 = managerAccount2.toString();
        java.lang.String str14 = managerAccount2.getPwd();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 0);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str13.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test042");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str6 = managerAccount2.getUsername();
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test043");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        java.lang.String str8 = managerAccount2.toString();
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str8.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test044");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.enableSpace("hi!", (int) '4');
        managerAccount2.addLot("");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test045");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.disableLot("");
        managerAccount2.enableLot("hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test046");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.Class<?> wildcardClass11 = managerAccount2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test047");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        managerAccount2.addLot("hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test048");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = superManager0.getManagers();
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test049");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableSpace("", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test050");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        superManager0.showManagerAccounts();
        superManager0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = superManager0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test051");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.showManagerAccounts();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = superManager0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test052");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getPwd();
        boolean boolean13 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str16 = managerAccount2.toString();
        java.lang.String str17 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str16.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str17.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test053");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        java.lang.String str13 = managerAccount2.toString();
        managerAccount2.disableSpace("hi!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str13.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test054");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        java.lang.String str4 = managerAccount2.getPwd();
        managerAccount2.enableSpace("", (int) (short) 1);
        managerAccount2.addLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test055");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "hi!");
        managerAccount2.enableSpace("hi!", (int) ' ');
        managerAccount2.enableLot("");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test056");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        boolean boolean14 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test057");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.getUsername();
        java.lang.String str16 = managerAccount2.toString();
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str16.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test058");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getPwd();
        boolean boolean13 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str18 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test059");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "hi!");
        managerAccount2.enableSpace("hi!", (int) ' ');
        managerAccount2.showAvailableSpaces();
        java.lang.Class<?> wildcardClass7 = managerAccount2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test060");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        boolean boolean10 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.Class<?> wildcardClass11 = managerAccount2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test061");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str8 = managerAccount2.getUsername();
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test062");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("", (int) (short) 100);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test063");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("", (int) (byte) -1);
        managerAccount2.enableSpace("", (int) '4');
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test064");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str8 = managerAccount2.getUsername();
        boolean boolean10 = managerAccount2.verifyUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test065");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("", 0);
        managerAccount2.disableLot("ManagerAccount [username=hi!, pwd=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test066");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.getUsername();
        java.lang.String str16 = managerAccount2.toString();
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str16.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test067");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        boolean boolean5 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) 'a');
        managerAccount2.showAvailableSpaces();
        boolean boolean11 = managerAccount2.verifyUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test068");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = autoAccountGeneration0.loadManagers();
        java.lang.Class<?> wildcardClass5 = managerAccountList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test069");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", 1);
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 10);
        managerAccount2.disableLot("hi!");
        managerAccount2.enableSpace("", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test070");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test071");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.toString();
        managerAccount2.enableSpace("hi!", 10);
        managerAccount2.disableLot("ManagerAccount [username=hi!, pwd=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test072");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.enableSpace("hi!", (int) '4');
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableLot("hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test073");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        autoAccountGeneration0.generateManagerAccount();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test074");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList2 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        autoAccountGeneration0.generateManagerAccount();
        autoAccountGeneration0.generateManagerAccount();
        java.lang.Class<?> wildcardClass6 = autoAccountGeneration0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test075");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        boolean boolean5 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("", 100);
        boolean boolean10 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test076");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = autoAccountGeneration0.loadManagers();
        java.lang.Class<?> wildcardClass4 = managerAccountList3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test077");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList2 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test078");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.loadManagers();
        superManager0.loadManagers();
        java.lang.Class<?> wildcardClass5 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test079");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "");
        managerAccount2.enableLot("");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test080");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = superManager0.getManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = superManager0.getManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList5 = superManager0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test081");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        java.lang.String str6 = managerAccount2.getPwd();
        java.lang.String str7 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test082");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("hi!", 100);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test083");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        java.lang.String str10 = managerAccount2.toString();
        java.lang.String str11 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str10.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str11.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test084");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("");
        java.lang.String str14 = managerAccount2.getPwd();
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test085");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test086");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        java.lang.String str13 = managerAccount2.toString();
        java.lang.String str14 = managerAccount2.getPwd();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 0);
        java.lang.String str19 = managerAccount2.toString();
        java.lang.String str20 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str13.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str19.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test087");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        superManager0.loadManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test088");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test089");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("hi!");
        managerAccount2.disableSpace("", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test090");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("");
        java.lang.String str14 = managerAccount2.getPwd();
        java.lang.String str15 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test091");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "hi!");
        managerAccount2.enableSpace("hi!", (int) ' ');
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("");
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableSpace("hi!", (int) (short) 100);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test092");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        managerAccount2.addLot("");
        managerAccount2.disableLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test093");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        boolean boolean5 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) 'a');
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("");
        java.lang.String str12 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str12.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test094");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        superManager0.showManagerAccounts();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test095");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = superManager0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test096");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        managerAccount2.disableLot("ManagerAccount [username=, pwd=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test097");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        java.lang.String str13 = managerAccount2.toString();
        java.lang.String str14 = managerAccount2.getPwd();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 0);
        java.lang.String str19 = managerAccount2.getPwd();
        java.lang.String str20 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str13.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str20.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test098");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        managerAccount2.showAvailableSpaces();
        java.lang.String str9 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test099");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.addLot("");
        managerAccount2.disableLot("");
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", 100);
        managerAccount2.addLot("ManagerAccount [username=, pwd=]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test100");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        superManager0.showManagerAccounts();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test101");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str13 = managerAccount2.getPwd();
        java.lang.String str14 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str14.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test102");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test103");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("", (int) (byte) -1);
        managerAccount2.enableSpace("", (int) '4');
        managerAccount2.addLot("hi!");
        java.lang.String str17 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test104");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        superManager0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList5 = superManager0.getManagers();
        superManager0.showManagerAccounts();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test105");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("");
        java.lang.String str14 = managerAccount2.getPwd();
        boolean boolean16 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test106");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "");
        java.lang.String str3 = managerAccount2.toString();
        managerAccount2.disableSpace("", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ManagerAccount [username=, pwd=]" + "'", str3.equals("ManagerAccount [username=, pwd=]"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test107");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        java.lang.String str4 = managerAccount2.getPwd();
        java.lang.String str5 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test108");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        java.lang.Class<?> wildcardClass3 = autoAccountGeneration0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test109");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        boolean boolean5 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) 'a');
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 0);
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test110");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        java.lang.String str13 = managerAccount2.toString();
        java.lang.String str14 = managerAccount2.getPwd();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 0);
        java.lang.String str19 = managerAccount2.getPwd();
        java.lang.Class<?> wildcardClass20 = managerAccount2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str13.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test111");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = superManager0.getManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = superManager0.getManagers();
        superManager0.showManagerAccounts();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test112");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test113");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("hi!");
        java.lang.String str14 = managerAccount2.getPwd();
        boolean boolean16 = managerAccount2.verifyUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test114");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.addLot("");
        managerAccount2.disableLot("");
        managerAccount2.disableLot("ManagerAccount [username=, pwd=]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test115");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList2 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        autoAccountGeneration0.generateManagerAccount();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList6 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test116");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("ManagerAccount [username=hi!, pwd=hi!]", "hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test117");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getUsername();
        boolean boolean13 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test118");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        managerAccount2.disableSpace("hi!", (int) '4');
        java.lang.String str16 = managerAccount2.toString();
        managerAccount2.disableSpace("hi!", (int) (short) 0);
        managerAccount2.enableLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str16.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test119");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = superManager0.getManagers();
        superManager0.showManagerAccounts();
        superManager0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test120");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        managerAccount2.enableLot("");
        java.lang.String str10 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test121");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str6 = managerAccount2.getUsername();
        managerAccount2.disableLot("ManagerAccount [username=hi!, pwd=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test122");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = superManager0.getManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList5 = superManager0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test123");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str14 = managerAccount2.getUsername();
        managerAccount2.disableLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test124");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        java.lang.String str8 = managerAccount2.toString();
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableLot("");
        managerAccount2.disableLot("hi!");
        java.lang.String str17 = managerAccount2.getPwd();
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str8.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test125");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str8 = managerAccount2.getUsername();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        java.lang.String str15 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test126");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.addLot("");
        java.lang.String str13 = managerAccount2.getUsername();
        boolean boolean15 = managerAccount2.verifyUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test127");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        boolean boolean5 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("", 100);
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str11 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test128");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.toString();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 100);
        managerAccount2.enableSpace("", (int) ' ');
        java.lang.String str22 = managerAccount2.getPwd();
        managerAccount2.disableSpace("", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test129");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str6 = managerAccount2.getUsername();
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        boolean boolean10 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test130");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        managerAccount2.addLot("");
        managerAccount2.disableLot("");
        java.lang.String str8 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test131");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = yorku.eecs3311.manager.ManagerAccount.getLotByName("ManagerAccount [username=, pwd=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test132");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str8 = managerAccount2.getUsername();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test133");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.addLot("");
        managerAccount2.disableLot("");
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", 100);
        java.lang.String str18 = managerAccount2.getPwd();
        java.lang.String str19 = managerAccount2.getUsername();
        managerAccount2.showAvailableSpaces();
        boolean boolean22 = managerAccount2.verifyUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test134");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList2 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        autoAccountGeneration0.generateManagerAccount();
        autoAccountGeneration0.generateManagerAccount();
        autoAccountGeneration0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test135");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = superManager0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test136");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getPwd();
        boolean boolean13 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str16 = managerAccount2.toString();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("ManagerAccount [username=, pwd=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str16.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test137");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        managerAccount2.disableSpace("", (int) (short) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test138");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test139");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.toString();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test140");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str13 = managerAccount2.getPwd();
        managerAccount2.disableSpace("hi!", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test141");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        superManager0.loadManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test142");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        managerAccount2.disableSpace("", (int) (short) 1);
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        managerAccount2.addLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test143");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.getUsername();
        java.lang.String str16 = managerAccount2.toString();
        managerAccount2.showAvailableSpaces();
        java.lang.String str18 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str16.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test144");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.addLot("");
        managerAccount2.showAvailableSpaces();
        java.lang.String str14 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str14.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test145");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        boolean boolean5 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("", 100);
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", 0);
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test146");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.toString();
        java.lang.String str12 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str11.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str12.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test147");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.toString();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 100);
        boolean boolean20 = managerAccount2.verifyUser("hi!");
        java.lang.String str21 = managerAccount2.toString();
        managerAccount2.disableLot("ManagerAccount [username=, pwd=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str21.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test148");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        java.lang.String str9 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test149");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.showManagerAccounts();
        superManager0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList5 = superManager0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test150");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList2 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList7 = autoAccountGeneration0.loadManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test151");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.showManagerAccounts();
        superManager0.showManagerAccounts();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        superManager0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList9 = superManager0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test152");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("");
        java.lang.String str14 = managerAccount2.getPwd();
        java.lang.String str15 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test153");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.addLot("");
        java.lang.String str13 = managerAccount2.getUsername();
        java.lang.String str14 = managerAccount2.getUsername();
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test154");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        managerAccount2.disableSpace("hi!", (int) '4');
        managerAccount2.disableLot("hi!");
        java.lang.String str18 = managerAccount2.getUsername();
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test155");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test156");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        autoAccountGeneration0.generateManagerAccount();
        autoAccountGeneration0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test157");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        java.lang.String str4 = managerAccount2.getPwd();
        managerAccount2.enableSpace("hi!", (int) (byte) 0);
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str10 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test158");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "hi!");
        managerAccount2.enableSpace("hi!", (int) ' ');
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("");
        managerAccount2.enableSpace("", (int) (byte) -1);
        managerAccount2.enableLot("hi!");
        java.lang.String str14 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test159");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getPwd();
        boolean boolean13 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test160");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.toString();
        managerAccount2.enableSpace("hi!", 10);
        java.lang.String str19 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test161");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = superManager0.getManagers();
        superManager0.showManagerAccounts();
        superManager0.loadManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test162");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test163");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        boolean boolean5 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) 'a');
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("");
        managerAccount2.disableLot("");
        java.lang.String str14 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str14.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test164");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        boolean boolean7 = managerAccount2.verifyUser("hi!");
        boolean boolean9 = managerAccount2.verifyUser("hi!");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test165");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        java.lang.String str8 = managerAccount2.toString();
        java.lang.String str9 = managerAccount2.getPwd();
        java.lang.String str10 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str8.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test166");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getUsername();
        managerAccount2.disableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str14 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str14.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test167");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.toString();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 100);
        managerAccount2.enableSpace("", (int) ' ');
        java.lang.String str22 = managerAccount2.getPwd();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test168");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableLot("");
        managerAccount2.disableLot("");
        managerAccount2.showAvailableSpaces();
        java.lang.Class<?> wildcardClass11 = managerAccount2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test169");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "ManagerAccount [username=, pwd=]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test170");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getUsername();
        managerAccount2.addLot("");
        java.lang.String str14 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str14.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test171");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str8 = managerAccount2.getUsername();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test172");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableLot("");
        managerAccount2.disableSpace("ManagerAccount [username=, pwd=]", (int) (byte) -1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test173");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "hi!");
        boolean boolean4 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableSpace("", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test174");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList2 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList5 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test175");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) ' ');
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test176");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test177");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str8 = managerAccount2.getUsername();
        managerAccount2.showAvailableSpaces();
        java.lang.Class<?> wildcardClass10 = managerAccount2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test178");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getPwd();
        boolean boolean13 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test179");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.showManagerAccounts();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList6 = superManager0.getManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList7 = superManager0.getManagers();
        superManager0.loadManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test180");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.showManagerAccounts();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList6 = superManager0.getManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList7 = superManager0.getManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList8 = superManager0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList8);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test181");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getPwd();
        boolean boolean13 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str16 = managerAccount2.toString();
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableSpace("ManagerAccount [username=, pwd=]", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str16.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test182");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getUsername();
        java.lang.String str12 = managerAccount2.getUsername();
        managerAccount2.enableLot("ManagerAccount [username=, pwd=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test183");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test184");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        managerAccount2.disableSpace("", (int) (short) 1);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) 'a');
        managerAccount2.disableLot("ManagerAccount [username=hi!, pwd=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test185");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("hi!");
        managerAccount2.enableSpace("hi!", 100);
        java.lang.String str17 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test186");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        java.lang.String str13 = managerAccount2.toString();
        java.lang.String str14 = managerAccount2.getPwd();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 0);
        java.lang.String str19 = managerAccount2.toString();
        managerAccount2.enableLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str13.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str19.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test187");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = superManager0.getManagers();
        superManager0.showManagerAccounts();
        superManager0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test188");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        java.lang.String str8 = managerAccount2.toString();
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableLot("");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("hi!");
        java.lang.String str21 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str8.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test189");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str5 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ManagerAccount [username=, pwd=ManagerAccount [username=hi!, pwd=hi!]]" + "'", str5.equals("ManagerAccount [username=, pwd=ManagerAccount [username=hi!, pwd=hi!]]"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test190");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        superManager0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList5 = superManager0.getManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList5);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test191");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("ManagerAccount [username=hi!, pwd=hi!]", "");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test192");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("hi!", 100);
        java.lang.String str13 = managerAccount2.getUsername();
        boolean boolean15 = managerAccount2.verifyUser("ManagerAccount [username=, pwd=ManagerAccount [username=hi!, pwd=hi!]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test193");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        java.lang.String str13 = managerAccount2.toString();
        java.lang.String str14 = managerAccount2.getPwd();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 0);
        java.lang.String str19 = managerAccount2.getPwd();
        java.lang.String str20 = managerAccount2.getUsername();
        managerAccount2.disableLot("");
        java.lang.String str23 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str13.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test194");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = superManager0.getManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        superManager0.showManagerAccounts();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test195");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        superManager0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test196");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.addLot("");
        java.lang.String str13 = managerAccount2.getUsername();
        java.lang.String str14 = managerAccount2.getUsername();
        managerAccount2.addLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test197");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList2 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList5 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList7 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test198");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        managerAccount2.disableSpace("hi!", (int) '4');
        java.lang.String str16 = managerAccount2.toString();
        boolean boolean18 = managerAccount2.verifyUser("ManagerAccount [username=, pwd=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str16.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test199");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.addLot("");
        java.lang.String str13 = managerAccount2.getUsername();
        managerAccount2.disableSpace("ManagerAccount [username=, pwd=]", 10);
        managerAccount2.disableSpace("ManagerAccount [username=, pwd=]", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test200");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableLot("");
        java.lang.String str15 = managerAccount2.getUsername();
        managerAccount2.disableLot("hi!");
        managerAccount2.disableSpace("", (int) ' ');
        java.lang.String str21 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str21.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test201");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "hi!");
        managerAccount2.enableSpace("hi!", (int) ' ');
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("");
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableSpace("ManagerAccount [username=, pwd=]", (int) (byte) 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test202");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        superManager0.showManagerAccounts();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test203");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getUsername();
        java.lang.String str12 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test204");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "hi!");
        managerAccount2.enableSpace("hi!", (int) ' ');
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("");
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.addLot("hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test205");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.showManagerAccounts();
        superManager0.showManagerAccounts();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        superManager0.showManagerAccounts();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test206");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList2 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = autoAccountGeneration0.loadManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test207");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "hi!");
        managerAccount2.enableSpace("hi!", (int) ' ');
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("");
        managerAccount2.enableSpace("", (int) (byte) -1);
        java.lang.String str12 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test208");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = superManager0.getManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = superManager0.getManagers();
        superManager0.showManagerAccounts();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test209");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("ManagerAccount [username=, pwd=]", "");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test210");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.showAvailableSpaces();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test211");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "hi!");
        managerAccount2.showAvailableSpaces();
        java.lang.String str4 = managerAccount2.getUsername();
        java.lang.String str5 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test212");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("", (int) (byte) -1);
        managerAccount2.enableLot("ManagerAccount [username=, pwd=]");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test213");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.toString();
        boolean boolean17 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.addLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test214");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.showManagerAccounts();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        superManager0.loadManagers();
        superManager0.loadManagers();
        superManager0.loadManagers();
        superManager0.loadManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test215");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str8 = managerAccount2.getUsername();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        java.lang.String str15 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test216");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        java.lang.String str4 = managerAccount2.toString();
        managerAccount2.disableSpace("ManagerAccount [username=, pwd=]", (int) '#');
        managerAccount2.enableSpace("ManagerAccount [username=, pwd=]", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str4.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test217");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        superManager0.generateManagerAccount();
        superManager0.loadManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test218");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList4 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList5 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList8 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList8);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test219");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        superManager0.generateManagerAccount();
        java.lang.Class<?> wildcardClass6 = superManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test220");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        managerAccount2.disableSpace("", (int) (short) 1);
        boolean boolean20 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.Class<?> wildcardClass21 = managerAccount2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test221");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getUsername();
        managerAccount2.enableSpace("ManagerAccount [username=, pwd=ManagerAccount [username=hi!, pwd=hi!]]", (int) (byte) -1);
        managerAccount2.disableLot("ManagerAccount [username=, pwd=ManagerAccount [username=hi!, pwd=hi!]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test222");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("ManagerAccount [username=hi!, pwd=hi!]", "ManagerAccount [username=, pwd=]");
        java.lang.String str3 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ManagerAccount [username=, pwd=]" + "'", str3.equals("ManagerAccount [username=, pwd=]"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test223");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        java.lang.String str8 = managerAccount2.toString();
        java.lang.String str9 = managerAccount2.getPwd();
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str8.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test224");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str8 = managerAccount2.getUsername();
        java.lang.String str9 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test225");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test226");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("ManagerAccount [username=hi!, pwd=hi!]", "ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.enableLot("ManagerAccount [username=, pwd=ManagerAccount [username=hi!, pwd=hi!]]");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test227");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        java.lang.String str7 = managerAccount2.getPwd();
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test228");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.enableSpace("hi!", (int) '4');
        managerAccount2.showAvailableSpaces();
        java.lang.String str15 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test229");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        superManager0.loadManagers();
        superManager0.showManagerAccounts();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test230");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.enableLot("ManagerAccount [username=, pwd=ManagerAccount [username=hi!, pwd=hi!]]");
        managerAccount2.enableLot("ManagerAccount [username=, pwd=ManagerAccount [username=hi!, pwd=hi!]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test231");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        superManager0.generateManagerAccount();
        superManager0.loadManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test232");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.toString();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 100);
        boolean boolean20 = managerAccount2.verifyUser("hi!");
        java.lang.String str21 = managerAccount2.toString();
        java.lang.Class<?> wildcardClass22 = managerAccount2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str21.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test233");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("ManagerAccount [username=, pwd=ManagerAccount [username=hi!, pwd=hi!]]", "hi!");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test234");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getUsername();
        java.lang.String str12 = managerAccount2.getUsername();
        managerAccount2.disableLot("ManagerAccount [username=, pwd=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test235");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.toString();
        managerAccount2.enableSpace("hi!", 10);
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test236");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("");
        managerAccount2.addLot("hi!");
        boolean boolean17 = managerAccount2.verifyUser("ManagerAccount [username=, pwd=ManagerAccount [username=hi!, pwd=hi!]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test237");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        java.lang.String str4 = managerAccount2.getPwd();
        managerAccount2.enableSpace("", (int) (short) 1);
        java.lang.String str8 = managerAccount2.getPwd();
        managerAccount2.addLot("");
        managerAccount2.disableSpace("", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test238");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.disableSpace("ManagerAccount [username=, pwd=ManagerAccount [username=hi!, pwd=hi!]]", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test239");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.toString();
        boolean boolean17 = managerAccount2.verifyUser("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableSpace("", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test240");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        boolean boolean5 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) 'a');
        java.lang.String str9 = managerAccount2.getUsername();
        java.lang.String str10 = managerAccount2.toString();
        managerAccount2.addLot("ManagerAccount [username=, pwd=ManagerAccount [username=hi!, pwd=hi!]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str10.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerRegressionTest0.test241");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        boolean boolean5 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("", 100);
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }
}
