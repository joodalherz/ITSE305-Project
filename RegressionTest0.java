import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        java.lang.Class<?> wildcardClass9 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) '#', "hi!", (double) (short) 0, 10, "2025-11-02 21:11:32");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.Class<?> wildcardClass8 = room5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:32", (double) 10, 0, "hi!");
        java.lang.Class<?> wildcardClass6 = room5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        java.lang.String str11 = room5.getType();
        room5.setStatus("hi!");
        java.lang.Class<?> wildcardClass14 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        room5.setType("");
        room5.setType("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        java.lang.String str6 = room5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:32", (double) 10, 0, "hi!");
        room5.setCapacity((int) (byte) 10);
        int int8 = room5.getCapacity();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        double double11 = room5.getPricePerNight();
        java.lang.String str12 = room5.getType();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        java.lang.String str8 = room5.getLastUpdated();
        java.lang.Class<?> wildcardClass9 = room5.getClass();
// flaky "1) test010(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2025-11-02 21:11:34" + "'", str8, "2025-11-02 21:11:34");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:33", 1.0d, (int) (short) 10, "2025-11-02 21:11:33");
        int int6 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) 0, "2025-11-02 21:11:34", (double) (short) 1, 0, "2025-11-02 21:11:32");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        room5.setStatus("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        room5.setType("2025-11-02 21:11:32");
        java.lang.Class<?> wildcardClass13 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) '#', "hi!", 0.0d, (int) (short) 100, "2025-11-02 21:11:32");
        int int6 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setType("2025-11-02 21:11:32");
        room5.setPricePerNight((double) (byte) -1);
        room5.setCapacity((int) 'a');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setStatus("hi!");
        room5.setCapacity((int) '4');
        room5.setType("2025-11-02 21:11:34");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) 100, "", 1.0d, (-1), "2025-11-02 21:11:33");
        room5.setStatus("");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room(0, "2025-11-02 21:11:33", (double) 1, (int) (short) 0, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getType();
        int int8 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        room5.setType("2025-11-02 21:11:32");
        int int13 = room5.getRoomNumber();
        room5.setPricePerNight((double) ' ');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setType("2025-11-02 21:11:32");
        room5.setPricePerNight((double) (byte) -1);
        java.lang.String str11 = room5.getType();
        java.lang.Class<?> wildcardClass12 = room5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2025-11-02 21:11:32" + "'", str11, "2025-11-02 21:11:32");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        room5.setType("2025-11-02 21:11:32");
        int int13 = room5.getRoomNumber();
        room5.setStatus("2025-11-02 21:11:32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        double double7 = room5.getPricePerNight();
        java.lang.Class<?> wildcardClass8 = room5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "hi!", (double) 100.0f, (int) (short) 1, "");
        int int6 = room5.getRoomNumber();
        java.lang.Class<?> wildcardClass7 = room5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) -1, "hi!", (double) 10, (int) (byte) 1, "");
        java.lang.String str6 = room5.getStatus();
        java.lang.Class<?> wildcardClass7 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setType("2025-11-02 21:11:32");
        room5.setPricePerNight((double) (byte) -1);
        java.lang.String str11 = room5.getType();
        int int12 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2025-11-02 21:11:32" + "'", str11, "2025-11-02 21:11:32");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "hi!", (double) 100.0f, (int) (short) 1, "");
        int int6 = room5.getRoomNumber();
        double double7 = room5.getPricePerNight();
        java.lang.String str8 = room5.getType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room(0, "hi!", 0.0d, (int) (short) -1, "2025-11-02 21:11:32");
        room5.setPricePerNight(0.0d);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:32", (double) 10, 0, "hi!");
        room5.setCapacity((int) (byte) 10);
        java.lang.String str8 = room5.getLastUpdated();
        room5.setPricePerNight((double) (-1.0f));
// flaky "2) test030(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2025-11-02 21:11:36" + "'", str8, "2025-11-02 21:11:36");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        room5.setType("2025-11-02 21:11:32");
        int int13 = room5.getRoomNumber();
        java.lang.Class<?> wildcardClass14 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) -1, "hi!", (double) 10, (int) (byte) 1, "");
        java.lang.String str6 = room5.getStatus();
        room5.setCapacity(100);
        room5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:33", 1.0d, (int) (short) 10, "2025-11-02 21:11:33");
        room5.setType("2025-11-02 21:11:35");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) '#', "hi!", 0.0d, (int) (short) 100, "2025-11-02 21:11:32");
        java.lang.String str6 = room5.getLastUpdated();
// flaky "3) test034(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2025-11-02 21:11:36" + "'", str6, "2025-11-02 21:11:36");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        double double11 = room5.getPricePerNight();
        room5.setPricePerNight((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        room5.setType("");
        int int15 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        room5.setType("");
        java.lang.String str15 = room5.getType();
        int int16 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        room5.setCapacity((int) (byte) -1);
        int int15 = room5.getCapacity();
        int int16 = room5.getCapacity();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setCapacity((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        double double8 = room5.getPricePerNight();
        room5.setType("hi!");
        java.lang.Class<?> wildcardClass11 = room5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        room5.setStatus("hi!");
        room5.setPricePerNight((double) (short) -1);
        java.lang.String str15 = room5.getLastUpdated();
        double double16 = room5.getPricePerNight();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "4) test041(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:37" + "'", str7, "2025-11-02 21:11:37");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "1) test041(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2025-11-02 21:11:37" + "'", str15, "2025-11-02 21:11:37");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        room5.setType("2025-11-02 21:11:32");
        int int13 = room5.getCapacity();
        java.lang.String str14 = room5.getStatus();
        java.lang.Class<?> wildcardClass15 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) ' ', "", 0.0d, (int) (byte) -1, "hi!");
        java.lang.String str6 = room5.getStatus();
        double double7 = room5.getPricePerNight();
        room5.setCapacity((int) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        int int8 = room5.getCapacity();
        room5.setStatus("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        java.lang.String str11 = room5.getType();
        java.lang.Class<?> wildcardClass12 = room5.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        double double8 = room5.getPricePerNight();
        room5.setType("hi!");
        java.lang.String str11 = room5.getStatus();
        room5.setStatus("2025-11-02 21:11:34");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        room5.setStatus("");
        room5.setStatus("2025-11-02 21:11:34");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "5) test047(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:37" + "'", str7, "2025-11-02 21:11:37");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("hi!");
        java.lang.String str10 = room5.getType();
        java.lang.String str11 = room5.getStatus();
        java.lang.String str12 = room5.getLastUpdated();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "6) test048(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:37" + "'", str7, "2025-11-02 21:11:37");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "2) test048(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2025-11-02 21:11:37" + "'", str12, "2025-11-02 21:11:37");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setStatus("hi!");
        room5.setCapacity((int) 'a');
        java.lang.Class<?> wildcardClass11 = room5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        java.lang.String str11 = room5.getType();
        room5.setType("2025-11-02 21:11:33");
        java.lang.Class<?> wildcardClass14 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        double double13 = room5.getPricePerNight();
        room5.setStatus("2025-11-02 21:11:33");
        java.lang.String str16 = room5.getLastUpdated();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
// flaky "7) test051(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-11-02 21:11:37" + "'", str16, "2025-11-02 21:11:37");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:32", (double) 10, 0, "hi!");
        java.lang.String str6 = room5.getLastUpdated();
// flaky "8) test052(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2025-11-02 21:11:37" + "'", str6, "2025-11-02 21:11:37");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        int int9 = room5.getCapacity();
        java.lang.Class<?> wildcardClass10 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:32", (double) 10, 0, "hi!");
        room5.setCapacity((int) (byte) 10);
        room5.setStatus("2025-11-02 21:11:32");
        java.lang.Class<?> wildcardClass10 = room5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        room5.setType("2025-11-02 21:11:32");
        int int13 = room5.getCapacity();
        java.lang.String str14 = room5.getStatus();
        java.lang.String str15 = room5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "hi!", (double) 100.0f, (int) (short) 1, "");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getStatus();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getType();
        int int8 = room5.getCapacity();
        java.lang.String str9 = room5.getType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:32", (double) 10, 0, "hi!");
        room5.setCapacity((int) (byte) 10);
        room5.setStatus("2025-11-02 21:11:32");
        room5.setPricePerNight((double) 10.0f);
        double double12 = room5.getPricePerNight();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        int int9 = room5.getCapacity();
        int int10 = room5.getCapacity();
        room5.setType("2025-11-02 21:11:34");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) -1, "hi!", (double) 10, (int) (byte) 1, "");
        java.lang.String str6 = room5.getStatus();
        room5.setCapacity(100);
        int int9 = room5.getCapacity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("hi!");
        java.lang.String str10 = room5.getType();
        java.lang.String str11 = room5.getType();
        java.lang.Class<?> wildcardClass12 = room5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "9) test061(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:38" + "'", str7, "2025-11-02 21:11:38");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        java.lang.String str11 = room5.getStatus();
        room5.setPricePerNight((double) (-1L));
        room5.setCapacity(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "10) test062(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:38" + "'", str7, "2025-11-02 21:11:38");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2025-11-02 21:11:32" + "'", str11, "2025-11-02 21:11:32");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "hi!", (double) 100.0f, (int) (short) 1, "");
        double double6 = room5.getPricePerNight();
        room5.setStatus("2025-11-02 21:11:32");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        java.lang.String str8 = room5.getStatus();
        int int9 = room5.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        java.lang.String str8 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:34");
        java.lang.String str11 = room5.getLastUpdated();
// flaky "11) test065(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2025-11-02 21:11:38" + "'", str8, "2025-11-02 21:11:38");
// flaky "3) test065(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2025-11-02 21:11:38" + "'", str11, "2025-11-02 21:11:38");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setType("2025-11-02 21:11:32");
        java.lang.String str9 = room5.getStatus();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        room5.setStatus("2025-11-02 21:11:34");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        room5.setPricePerNight((double) (byte) 10);
        int int12 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "12) test068(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:38" + "'", str7, "2025-11-02 21:11:38");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setStatus("hi!");
        room5.setCapacity((int) '4');
        java.lang.String str11 = room5.getLastUpdated();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky "13) test069(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2025-11-02 21:11:38" + "'", str11, "2025-11-02 21:11:38");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:33", 1.0d, (int) (short) 10, "2025-11-02 21:11:33");
        java.lang.String str6 = room5.getStatus();
        double double7 = room5.getPricePerNight();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2025-11-02 21:11:33" + "'", str6, "2025-11-02 21:11:33");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        int int8 = room5.getCapacity();
        room5.setPricePerNight(1.0d);
        java.lang.String str11 = room5.getType();
        room5.setPricePerNight((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        java.lang.String str8 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:35");
        room5.setCapacity((int) (byte) 0);
        int int13 = room5.getRoomNumber();
// flaky "14) test072(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2025-11-02 21:11:38" + "'", str8, "2025-11-02 21:11:38");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        java.lang.String str11 = room5.getStatus();
        room5.setPricePerNight((double) (-1L));
        room5.setPricePerNight((double) (byte) 100);
        room5.setStatus("2025-11-02 21:11:33");
        room5.setPricePerNight((double) (short) -1);
        room5.setType("2025-11-02 21:11:34");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "15) test073(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:38" + "'", str7, "2025-11-02 21:11:38");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2025-11-02 21:11:32" + "'", str11, "2025-11-02 21:11:32");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setType("2025-11-02 21:11:32");
        java.lang.String str9 = room5.getLastUpdated();
        int int10 = room5.getRoomNumber();
        java.lang.String str11 = room5.getLastUpdated();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky "16) test074(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2025-11-02 21:11:38" + "'", str9, "2025-11-02 21:11:38");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
// flaky "4) test074(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2025-11-02 21:11:38" + "'", str11, "2025-11-02 21:11:38");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        double double12 = room5.getPricePerNight();
        room5.setStatus("2025-11-02 21:11:38");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        java.lang.String str11 = room5.getLastUpdated();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
// flaky "17) test076(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2025-11-02 21:11:38" + "'", str11, "2025-11-02 21:11:38");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        java.lang.String str8 = room5.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) ' ', "", 0.0d, (int) (byte) -1, "hi!");
        java.lang.String str6 = room5.getStatus();
        double double7 = room5.getPricePerNight();
        room5.setCapacity((int) '#');
        int int10 = room5.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setType("2025-11-02 21:11:32");
        room5.setPricePerNight((double) (byte) -1);
        java.lang.String str11 = room5.getStatus();
        int int12 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        java.lang.String str8 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:35");
        int int11 = room5.getRoomNumber();
// flaky "18) test080(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2025-11-02 21:11:38" + "'", str8, "2025-11-02 21:11:38");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        room5.setStatus("hi!");
        int int13 = room5.getCapacity();
        room5.setType("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "19) test081(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:38" + "'", str7, "2025-11-02 21:11:38");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        room5.setType("2025-11-02 21:11:32");
        int int13 = room5.getCapacity();
        double double14 = room5.getPricePerNight();
        java.lang.Class<?> wildcardClass15 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        double double13 = room5.getPricePerNight();
        room5.setStatus("2025-11-02 21:11:33");
        java.lang.String str16 = room5.getStatus();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-11-02 21:11:33" + "'", str16, "2025-11-02 21:11:33");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "hi!", (double) 100.0f, (int) (short) 1, "");
        int int6 = room5.getRoomNumber();
        int int7 = room5.getRoomNumber();
        java.lang.Class<?> wildcardClass8 = room5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        double double8 = room5.getPricePerNight();
        room5.setType("hi!");
        java.lang.String str11 = room5.getStatus();
        room5.setPricePerNight((double) (byte) 0);
        java.lang.String str14 = room5.getType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        java.lang.String str11 = room5.getType();
        java.lang.String str12 = room5.getType();
        java.lang.String str13 = room5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        java.lang.String str13 = room5.getLastUpdated();
        room5.setPricePerNight((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
// flaky "20) test087(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-11-02 21:11:38" + "'", str13, "2025-11-02 21:11:38");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        room5.setStatus("hi!");
        room5.setPricePerNight((double) (short) -1);
        java.lang.String str15 = room5.getLastUpdated();
        int int16 = room5.getRoomNumber();
        java.lang.String str17 = room5.getType();
        int int18 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "21) test088(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:38" + "'", str7, "2025-11-02 21:11:38");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "5) test088(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2025-11-02 21:11:38" + "'", str15, "2025-11-02 21:11:38");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        java.lang.String str8 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:34");
        double double11 = room5.getPricePerNight();
// flaky "22) test089(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2025-11-02 21:11:38" + "'", str8, "2025-11-02 21:11:38");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setType("2025-11-02 21:11:32");
        java.lang.String str9 = room5.getLastUpdated();
        room5.setPricePerNight((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky "23) test090(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2025-11-02 21:11:38" + "'", str9, "2025-11-02 21:11:38");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        room5.setStatus("hi!");
        int int13 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "24) test091(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:39" + "'", str7, "2025-11-02 21:11:39");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        java.lang.String str11 = room5.getType();
        java.lang.String str12 = room5.getType();
        room5.setCapacity(0);
        room5.setStatus("2025-11-02 21:11:33");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        java.lang.String str13 = room5.getLastUpdated();
        room5.setPricePerNight((double) (byte) 1);
        java.lang.String str16 = room5.getLastUpdated();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
// flaky "25) test093(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-11-02 21:11:39" + "'", str13, "2025-11-02 21:11:39");
// flaky "6) test093(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-11-02 21:11:39" + "'", str16, "2025-11-02 21:11:39");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:33", 1.0d, (int) (short) 10, "2025-11-02 21:11:33");
        room5.setType("2025-11-02 21:11:39");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        java.lang.String str11 = room5.getType();
        room5.setStatus("hi!");
        java.lang.String str14 = room5.getLastUpdated();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "26) test095(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2025-11-02 21:11:39" + "'", str14, "2025-11-02 21:11:39");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        double double11 = room5.getPricePerNight();
        double double12 = room5.getPricePerNight();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        room5.setStatus("");
        java.lang.Class<?> wildcardClass13 = room5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "27) test097(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:39" + "'", str7, "2025-11-02 21:11:39");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        double double8 = room5.getPricePerNight();
        room5.setType("hi!");
        java.lang.String str11 = room5.getStatus();
        double double12 = room5.getPricePerNight();
        int int13 = room5.getCapacity();
        java.lang.String str14 = room5.getStatus();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) 100, "2025-11-02 21:11:39", (double) 0, 32, "2025-11-02 21:11:32");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        room5.setType("");
        java.lang.String str15 = room5.getType();
        int int16 = room5.getCapacity();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        double double11 = room5.getPricePerNight();
        room5.setType("2025-11-02 21:11:33");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room(100, "2025-11-02 21:11:34", (double) (short) 1, 1, "2025-11-02 21:11:33");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        int int9 = room5.getCapacity();
        int int10 = room5.getCapacity();
        room5.setCapacity(32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) 100, "", 1.0d, (-1), "2025-11-02 21:11:33");
        room5.setPricePerNight(100.0d);
        java.lang.Class<?> wildcardClass8 = room5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        java.lang.String str11 = room5.getType();
        room5.setType("2025-11-02 21:11:33");
        java.lang.String str14 = room5.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2025-11-02 21:11:33" + "'", str14, "2025-11-02 21:11:33");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        double double8 = room5.getPricePerNight();
        room5.setType("hi!");
        java.lang.String str11 = room5.getStatus();
        int int12 = room5.getRoomNumber();
        double double13 = room5.getPricePerNight();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        double double11 = room5.getPricePerNight();
        room5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        java.lang.String str11 = room5.getType();
        room5.setType("2025-11-02 21:11:33");
        double double14 = room5.getPricePerNight();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        double double11 = room5.getPricePerNight();
        java.lang.String str12 = room5.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        double double8 = room5.getPricePerNight();
        room5.setType("hi!");
        java.lang.String str11 = room5.getStatus();
        int int12 = room5.getRoomNumber();
        int int13 = room5.getCapacity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        java.lang.String str13 = room5.getLastUpdated();
        room5.setPricePerNight((double) (byte) 1);
        room5.setType("2025-11-02 21:11:36");
        int int18 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
// flaky "28) test111(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-11-02 21:11:39" + "'", str13, "2025-11-02 21:11:39");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:32", (double) 10, 0, "hi!");
        double double6 = room5.getPricePerNight();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        room5.setCapacity((int) (byte) -1);
        int int15 = room5.getCapacity();
        java.lang.String str16 = room5.getStatus();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        java.lang.String str13 = room5.getType();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) ' ', "", 0.0d, (int) (byte) -1, "hi!");
        java.lang.String str6 = room5.getStatus();
        room5.setType("2025-11-02 21:11:34");
        room5.setCapacity((-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        double double8 = room5.getPricePerNight();
        room5.setType("hi!");
        java.lang.String str11 = room5.getStatus();
        double double12 = room5.getPricePerNight();
        int int13 = room5.getCapacity();
        int int14 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "hi!", (double) 100.0f, (int) (short) 1, "");
        int int6 = room5.getRoomNumber();
        double double7 = room5.getPricePerNight();
        room5.setType("2025-11-02 21:11:38");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room(1, "2025-11-02 21:11:36", (double) '#', (int) (byte) 100, "");
        room5.setType("hi!");
        room5.setType("2025-11-02 21:11:36");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:33", 1.0d, (int) (short) 10, "2025-11-02 21:11:33");
        room5.setType("2025-11-02 21:11:32");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        int int9 = room5.getCapacity();
        int int10 = room5.getCapacity();
        room5.setType("2025-11-02 21:11:39");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        room5.setStatus("hi!");
        room5.setPricePerNight((double) (short) -1);
        java.lang.String str15 = room5.getLastUpdated();
        int int16 = room5.getRoomNumber();
        java.lang.String str17 = room5.getType();
        java.lang.Class<?> wildcardClass18 = room5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "29) test121(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:39" + "'", str7, "2025-11-02 21:11:39");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "7) test121(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2025-11-02 21:11:39" + "'", str15, "2025-11-02 21:11:39");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) -1, "hi!", (double) 10, (int) (byte) 1, "");
        java.lang.String str6 = room5.getLastUpdated();
        java.lang.Class<?> wildcardClass7 = room5.getClass();
// flaky "30) test122(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2025-11-02 21:11:39" + "'", str6, "2025-11-02 21:11:39");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        int int8 = room5.getCapacity();
        java.lang.String str9 = room5.getStatus();
        room5.setStatus("");
        java.lang.Class<?> wildcardClass12 = room5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room(0, "hi!", 0.0d, (int) (short) -1, "2025-11-02 21:11:32");
        room5.setStatus("");
        java.lang.String str8 = room5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room(1, "2025-11-02 21:11:36", (double) '#', (int) (byte) 100, "");
        room5.setType("hi!");
        room5.setPricePerNight((double) '#');
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("hi!");
        java.lang.String str10 = room5.getType();
        java.lang.String str11 = room5.getType();
        double double12 = room5.getPricePerNight();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "31) test126(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:40" + "'", str7, "2025-11-02 21:11:40");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        java.lang.String str8 = room5.getStatus();
        room5.setCapacity((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        java.lang.String str8 = room5.getLastUpdated();
        java.lang.String str9 = room5.getType();
        java.lang.String str10 = room5.getLastUpdated();
        room5.setPricePerNight((double) (byte) 10);
// flaky "32) test128(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2025-11-02 21:11:40" + "'", str8, "2025-11-02 21:11:40");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "8) test128(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2025-11-02 21:11:40" + "'", str10, "2025-11-02 21:11:40");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        room5.setStatus("hi!");
        room5.setPricePerNight((double) (short) -1);
        java.lang.String str15 = room5.getLastUpdated();
        int int16 = room5.getCapacity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "33) test129(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:40" + "'", str7, "2025-11-02 21:11:40");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "9) test129(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2025-11-02 21:11:40" + "'", str15, "2025-11-02 21:11:40");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) 100, "hi!", (double) 10, 100, "2025-11-02 21:11:32");
        room5.setType("2025-11-02 21:11:33");
        room5.setPricePerNight((double) (-1L));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        double double8 = room5.getPricePerNight();
        room5.setType("hi!");
        java.lang.String str11 = room5.getStatus();
        int int12 = room5.getCapacity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        room5.setType("2025-11-02 21:11:32");
        int int13 = room5.getCapacity();
        java.lang.String str14 = room5.getStatus();
        java.lang.String str15 = room5.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2025-11-02 21:11:32" + "'", str15, "2025-11-02 21:11:32");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room(1, "2025-11-02 21:11:36", (double) '#', (int) (byte) 100, "");
        double double6 = room5.getPricePerNight();
        int int7 = room5.getCapacity();
        double double8 = room5.getPricePerNight();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "hi!", (double) 100.0f, (int) (short) 1, "");
        double double6 = room5.getPricePerNight();
        java.lang.String str7 = room5.getStatus();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setType("2025-11-02 21:11:32");
        java.lang.String str9 = room5.getLastUpdated();
        int int10 = room5.getCapacity();
        double double11 = room5.getPricePerNight();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky "34) test135(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2025-11-02 21:11:40" + "'", str9, "2025-11-02 21:11:40");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        int int8 = room5.getCapacity();
        room5.setPricePerNight(1.0d);
        java.lang.String str11 = room5.getType();
        double double12 = room5.getPricePerNight();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        room5.setCapacity((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        double double13 = room5.getPricePerNight();
        int int14 = room5.getCapacity();
        java.lang.String str15 = room5.getLastUpdated();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky "35) test138(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2025-11-02 21:11:40" + "'", str15, "2025-11-02 21:11:40");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) 10, "2025-11-02 21:11:33", (double) 0L, 100, "");
        room5.setType("2025-11-02 21:11:35");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        int int8 = room5.getCapacity();
        java.lang.String str9 = room5.getStatus();
        room5.setPricePerNight((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        java.lang.String str11 = room5.getType();
        java.lang.Class<?> wildcardClass12 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "hi!", (double) 100.0f, (int) (short) 1, "");
        java.lang.String str6 = room5.getStatus();
        room5.setType("2025-11-02 21:11:32");
        java.lang.String str9 = room5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) ' ', "", 0.0d, (int) (byte) -1, "hi!");
        java.lang.String str6 = room5.getStatus();
        room5.setType("2025-11-02 21:11:34");
        java.lang.String str9 = room5.getLastUpdated();
        int int10 = room5.getCapacity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "36) test143(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2025-11-02 21:11:40" + "'", str9, "2025-11-02 21:11:40");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("hi!");
        java.lang.String str10 = room5.getType();
        java.lang.String str11 = room5.getStatus();
        room5.setType("2025-11-02 21:11:36");
        int int14 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "37) test144(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:40" + "'", str7, "2025-11-02 21:11:40");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) -1, "2025-11-02 21:11:32", 1.0d, 10, "2025-11-02 21:11:34");
        java.lang.String str6 = room5.getStatus();
        room5.setPricePerNight((double) 0.0f);
        int int9 = room5.getCapacity();
        java.lang.String str10 = room5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2025-11-02 21:11:34" + "'", str6, "2025-11-02 21:11:34");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2025-11-02 21:11:34" + "'", str10, "2025-11-02 21:11:34");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        int int9 = room5.getCapacity();
        int int10 = room5.getCapacity();
        java.lang.Class<?> wildcardClass11 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        double double8 = room5.getPricePerNight();
        double double9 = room5.getPricePerNight();
        room5.setPricePerNight((double) (short) -1);
        room5.setCapacity(0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        double double8 = room5.getPricePerNight();
        room5.setType("hi!");
        java.lang.String str11 = room5.getStatus();
        room5.setPricePerNight((double) (byte) 0);
        room5.setStatus("2025-11-02 21:11:36");
        room5.setCapacity((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        java.lang.String str11 = room5.getStatus();
        room5.setPricePerNight((double) (-1L));
        room5.setPricePerNight((double) (byte) 100);
        java.lang.String str16 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:40");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "38) test149(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:40" + "'", str7, "2025-11-02 21:11:40");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2025-11-02 21:11:32" + "'", str11, "2025-11-02 21:11:32");
// flaky "10) test149(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-11-02 21:11:40" + "'", str16, "2025-11-02 21:11:40");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:33", 1.0d, (int) (short) 10, "2025-11-02 21:11:33");
        room5.setStatus("2025-11-02 21:11:33");
        room5.setStatus("2025-11-02 21:11:34");
        int int10 = room5.getCapacity();
        int int11 = room5.getRoomNumber();
        java.lang.String str12 = room5.getType();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2025-11-02 21:11:33" + "'", str12, "2025-11-02 21:11:33");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setType("2025-11-02 21:11:32");
        java.lang.String str9 = room5.getLastUpdated();
        int int10 = room5.getCapacity();
        room5.setStatus("2025-11-02 21:11:36");
        java.lang.String str13 = room5.getLastUpdated();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky "39) test151(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2025-11-02 21:11:40" + "'", str9, "2025-11-02 21:11:40");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "11) test151(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-11-02 21:11:40" + "'", str13, "2025-11-02 21:11:40");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) 10, "2025-11-02 21:11:37", (double) (-1L), (int) (short) -1, "2025-11-02 21:11:39");
        int int6 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) 0, "hi!", 0.0d, (int) (byte) 1, "2025-11-02 21:11:33");
        int int6 = room5.getCapacity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("hi!");
        int int10 = room5.getCapacity();
        java.lang.Class<?> wildcardClass11 = room5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "40) test154(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:40" + "'", str7, "2025-11-02 21:11:40");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room(10, "2025-11-02 21:11:35", (double) (short) 1, (int) '#', "2025-11-02 21:11:40");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room(1, "2025-11-02 21:11:36", (double) '#', (int) (byte) 100, "");
        double double6 = room5.getPricePerNight();
        room5.setCapacity((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) 100, "", 1.0d, (-1), "2025-11-02 21:11:33");
        java.lang.String str6 = room5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        room5.setStatus("hi!");
        room5.setPricePerNight((double) (short) -1);
        java.lang.String str15 = room5.getLastUpdated();
        int int16 = room5.getRoomNumber();
        java.lang.String str17 = room5.getType();
        room5.setCapacity((int) (byte) 1);
        java.lang.String str20 = room5.getStatus();
        java.lang.Class<?> wildcardClass21 = room5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "41) test158(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:40" + "'", str7, "2025-11-02 21:11:40");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "12) test158(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2025-11-02 21:11:40" + "'", str15, "2025-11-02 21:11:40");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        room5.setType("2025-11-02 21:11:32");
        int int13 = room5.getCapacity();
        int int14 = room5.getCapacity();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        int int8 = room5.getCapacity();
        java.lang.Class<?> wildcardClass9 = room5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:32", (double) 10, 0, "hi!");
        room5.setCapacity((int) (byte) 10);
        room5.setPricePerNight((double) 100.0f);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        java.lang.String str8 = room5.getStatus();
        room5.setType("hi!");
        double double11 = room5.getPricePerNight();
        double double12 = room5.getPricePerNight();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        java.lang.String str8 = room5.getLastUpdated();
        java.lang.String str9 = room5.getType();
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "42) test163(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:40" + "'", str7, "2025-11-02 21:11:40");
// flaky "13) test163(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2025-11-02 21:11:40" + "'", str8, "2025-11-02 21:11:40");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        java.lang.String str11 = room5.getStatus();
        room5.setPricePerNight((double) (-1L));
        room5.setStatus("");
        java.lang.String str16 = room5.getLastUpdated();
        java.lang.String str17 = room5.getStatus();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "43) test164(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:40" + "'", str7, "2025-11-02 21:11:40");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2025-11-02 21:11:32" + "'", str11, "2025-11-02 21:11:32");
// flaky "14) test164(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-11-02 21:11:40" + "'", str16, "2025-11-02 21:11:40");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) ' ', "", 0.0d, (int) (byte) -1, "hi!");
        java.lang.String str6 = room5.getLastUpdated();
// flaky "44) test165(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2025-11-02 21:11:41" + "'", str6, "2025-11-02 21:11:41");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        room5.setPricePerNight((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "45) test166(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:41" + "'", str7, "2025-11-02 21:11:41");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((-1), "2025-11-02 21:11:39", 35.0d, 1, "2025-11-02 21:11:38");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) 0, "2025-11-02 21:11:37", (double) 10, (int) ' ', "2025-11-02 21:11:35");
        room5.setPricePerNight((double) 32);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) 100, "hi!", (double) 100.0f, (int) '4', "2025-11-02 21:11:41");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        java.lang.String str11 = room5.getStatus();
        room5.setPricePerNight((double) (-1L));
        java.lang.Class<?> wildcardClass14 = room5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "46) test170(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:41" + "'", str7, "2025-11-02 21:11:41");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2025-11-02 21:11:32" + "'", str11, "2025-11-02 21:11:32");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        int int12 = room5.getCapacity();
        room5.setType("");
        room5.setStatus("2025-11-02 21:11:39");
        int int17 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        room5.setStatus("");
        room5.setPricePerNight((double) (byte) 100);
        java.lang.String str15 = room5.getType();
        room5.setType("2025-11-02 21:11:34");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "47) test172(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:41" + "'", str7, "2025-11-02 21:11:41");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setType("2025-11-02 21:11:32");
        java.lang.String str9 = room5.getLastUpdated();
        int int10 = room5.getCapacity();
        room5.setType("");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky "48) test173(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2025-11-02 21:11:41" + "'", str9, "2025-11-02 21:11:41");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getType();
        int int8 = room5.getCapacity();
        room5.setCapacity(32);
        java.lang.String str11 = room5.getType();
        java.lang.Class<?> wildcardClass12 = room5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("hi!");
        java.lang.String str10 = room5.getStatus();
        java.lang.String str11 = room5.getStatus();
        java.lang.String str12 = room5.getType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "49) test175(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:41" + "'", str7, "2025-11-02 21:11:41");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) '#', "hi!", 0.0d, (int) (short) 100, "2025-11-02 21:11:32");
        java.lang.String str6 = room5.getType();
        java.lang.String str7 = room5.getType();
        room5.setStatus("2025-11-02 21:11:37");
        java.lang.Class<?> wildcardClass10 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        int int6 = room5.getRoomNumber();
        java.lang.String str7 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:32");
        int int10 = room5.getCapacity();
        java.lang.String str11 = room5.getStatus();
        double double12 = room5.getPricePerNight();
        java.lang.String str13 = room5.getLastUpdated();
        room5.setStatus("2025-11-02 21:11:36");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky "50) test177(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-11-02 21:11:41" + "'", str7, "2025-11-02 21:11:41");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2025-11-02 21:11:32" + "'", str11, "2025-11-02 21:11:32");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
// flaky "15) test177(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-11-02 21:11:41" + "'", str13, "2025-11-02 21:11:41");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) 100, "hi!", (double) 10, 100, "2025-11-02 21:11:32");
        java.lang.String str6 = room5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2025-11-02 21:11:32" + "'", str6, "2025-11-02 21:11:32");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        room5.setCapacity((int) (byte) 100);
        int int10 = room5.getRoomNumber();
        int int11 = room5.getCapacity();
        room5.setType("2025-11-02 21:11:32");
        double double14 = room5.getPricePerNight();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        double double6 = room5.getPricePerNight();
        room5.setType("2025-11-02 21:11:32");
        java.lang.String str9 = room5.getType();
        java.lang.Class<?> wildcardClass10 = room5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2025-11-02 21:11:32" + "'", str9, "2025-11-02 21:11:32");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        int int8 = room5.getCapacity();
        java.lang.String str9 = room5.getStatus();
        java.lang.String str10 = room5.getStatus();
        int int11 = room5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) -1, "hi!", (double) 10, (int) (byte) 1, "");
        java.lang.String str6 = room5.getStatus();
        room5.setCapacity(100);
        int int9 = room5.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        double double8 = room5.getPricePerNight();
        room5.setType("hi!");
        java.lang.String str11 = room5.getStatus();
        room5.setStatus("");
        int int14 = room5.getCapacity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        double double8 = room5.getPricePerNight();
        room5.setType("hi!");
        java.lang.String str11 = room5.getStatus();
        room5.setStatus("");
        java.lang.String str14 = room5.getType();
        int int15 = room5.getRoomNumber();
        java.lang.String str16 = room5.getLastUpdated();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "51) test184(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-11-02 21:11:41" + "'", str16, "2025-11-02 21:11:41");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setType("hi!");
        java.lang.String str8 = room5.getLastUpdated();
        room5.setPricePerNight((double) ' ');
// flaky "52) test185(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2025-11-02 21:11:41" + "'", str8, "2025-11-02 21:11:41");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "", (double) 1, 0, "hi!");
        room5.setCapacity((-1));
        double double8 = room5.getPricePerNight();
        room5.setType("hi!");
        java.lang.String str11 = room5.getStatus();
        room5.setPricePerNight((double) (byte) 0);
        double double14 = room5.getPricePerNight();
        java.lang.String str15 = room5.getLastUpdated();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
// flaky "53) test186(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2025-11-02 21:11:41" + "'", str15, "2025-11-02 21:11:41");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (byte) -1, "2025-11-02 21:11:32", 1.0d, 10, "2025-11-02 21:11:34");
        java.lang.String str6 = room5.getStatus();
        int int7 = room5.getCapacity();
        room5.setPricePerNight((double) (-1));
        java.lang.String str10 = room5.getLastUpdated();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2025-11-02 21:11:34" + "'", str6, "2025-11-02 21:11:34");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky "54) test187(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2025-11-02 21:11:41" + "'", str10, "2025-11-02 21:11:41");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room((int) (short) -1, "2025-11-02 21:11:32", (double) 10, 0, "hi!");
        room5.setCapacity((int) (byte) 10);
        java.lang.String str8 = room5.getLastUpdated();
        int int9 = room5.getCapacity();
        java.lang.String str10 = room5.getLastUpdated();
// flaky "55) test188(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2025-11-02 21:11:41" + "'", str8, "2025-11-02 21:11:41");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky "16) test188(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2025-11-02 21:11:41" + "'", str10, "2025-11-02 21:11:41");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        HotelReservationSystem.Room room5 = new HotelReservationSystem.Room(0, "2025-11-02 21:11:37", (double) 32, (int) (byte) -1, "2025-11-02 21:11:37");
        double double6 = room5.getPricePerNight();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }
}
