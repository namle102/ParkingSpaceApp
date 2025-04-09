package yorku.eecs3311.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManagerTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test01");
        java.util.List<yorku.eecs3311.parking.ParkingSpace> parkingSpaceList0 = yorku.eecs3311.manager.ManagerAccount.getAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test02");
        yorku.eecs3311.Subscriber subscriber0 = null;
        yorku.eecs3311.manager.ManagerAccount.addSubscriber(subscriber0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test03");
        yorku.eecs3311.Subscriber subscriber0 = null;
        yorku.eecs3311.manager.ManagerAccount.removeSubscriber(subscriber0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test04");
        yorku.eecs3311.manager.ManagerAccount.updateAvailableSpaces();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test05");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        java.lang.Class<?> wildcardClass4 = managerAccount2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test06");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test07");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        java.lang.String str10 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str10.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test08");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = yorku.eecs3311.manager.ManagerAccount.getLotByName("");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(parkingLot1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test09");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test10");
        java.util.List<yorku.eecs3311.parking.ParkingLot> parkingLotList0 = yorku.eecs3311.manager.ManagerAccount.getLots();
        java.lang.Class<?> wildcardClass1 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test11");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.showManagerAccounts();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test13");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("ManagerAccount [username=hi!, pwd=hi!]", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test14");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = autoAccountGeneration0.loadManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test15");
        yorku.eecs3311.manager.ManagerAccount.notifySubscribers();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test16");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        managerAccount2.enableLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test17");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        java.lang.String str4 = managerAccount2.getPwd();
        managerAccount2.enableSpace("", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test18");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = yorku.eecs3311.manager.ManagerAccount.getLotByName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test19");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        java.lang.String str7 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test20");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "");
        managerAccount2.showAvailableSpaces();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test21");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList2 = autoAccountGeneration0.loadManagers();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList3 = autoAccountGeneration0.loadManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test22");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        java.lang.String str6 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test23");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = autoAccountGeneration0.loadManagers();
        java.lang.Class<?> wildcardClass2 = autoAccountGeneration0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test24");
        yorku.eecs3311.parking.ParkingLot parkingLot1 = yorku.eecs3311.manager.ManagerAccount.getLotByName("ManagerAccount [username=hi!, pwd=hi!]");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNotNull(parkingLot1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test25");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        boolean boolean5 = managerAccount2.verifyUser("");
        managerAccount2.disableSpace("", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test26");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.toString();
        managerAccount2.enableSpace("hi!", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test27");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "ManagerAccount [username=hi!, pwd=hi!]");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test28");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.enableLot("hi!");
        java.lang.String str11 = managerAccount2.getPwd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test29");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("", (int) (byte) -1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test30");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        superManager0.loadManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test31");
        yorku.eecs3311.manager.AutoAccountGeneration autoAccountGeneration0 = new yorku.eecs3311.manager.AutoAccountGeneration();
        autoAccountGeneration0.generateManagerAccount();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList2 = autoAccountGeneration0.loadManagers();
        autoAccountGeneration0.generateManagerAccount();
        autoAccountGeneration0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList2);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test32");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        java.lang.String str4 = managerAccount2.getPwd();
        managerAccount2.enableSpace("hi!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test33");
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test34");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", (int) (byte) 100);
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (byte) 0);
        java.lang.String str15 = managerAccount2.getUsername();
        java.lang.String str16 = managerAccount2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str16.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test35");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test36");
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
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test37");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.generateManagerAccount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test38");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        managerAccount2.addLot("");
        managerAccount2.disableLot("");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test39");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        managerAccount2.showAvailableSpaces();
        managerAccount2.disableSpace("hi!", (int) (byte) -1);
        java.lang.String str11 = managerAccount2.getPwd();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test40");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        managerAccount2.addLot("");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test41");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        superManager0.showManagerAccounts();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test42");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("", 100);
        boolean boolean8 = managerAccount2.verifyUser("");
        managerAccount2.showAvailableSpaces();
        managerAccount2.enableSpace("ManagerAccount [username=hi!, pwd=hi!]", (int) (short) 1);
        java.lang.String str13 = managerAccount2.toString();
        java.lang.String str14 = managerAccount2.getPwd();
        managerAccount2.showAvailableSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str13.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test43");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableLot("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test44");
        yorku.eecs3311.manager.SuperManager superManager0 = yorku.eecs3311.manager.SuperManager.getInstance();
        java.util.List<yorku.eecs3311.manager.ManagerAccount> managerAccountList1 = superManager0.getManagers();
        superManager0.loadManagers();
        superManager0.generateManagerAccount();
        superManager0.showManagerAccounts();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerAccountList1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test45");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("", "hi!");
        managerAccount2.enableSpace("hi!", (int) ' ');
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test46");
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
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test47");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        java.lang.String str3 = managerAccount2.getUsername();
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        java.lang.String str6 = managerAccount2.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test48");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str15.equals("ManagerAccount [username=hi!, pwd=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test49");
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
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test50");
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
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ManagerTest0.test51");
        yorku.eecs3311.manager.ManagerAccount managerAccount2 = new yorku.eecs3311.manager.ManagerAccount("hi!", "hi!");
        managerAccount2.showAvailableSpaces();
        managerAccount2.addLot("");
        managerAccount2.enableLot("");
        java.lang.String str8 = managerAccount2.toString();
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.addLot("ManagerAccount [username=hi!, pwd=hi!]");
        managerAccount2.disableLot("");
        managerAccount2.disableLot("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ManagerAccount [username=hi!, pwd=hi!]" + "'", str8.equals("ManagerAccount [username=hi!, pwd=hi!]"));
    }
}
