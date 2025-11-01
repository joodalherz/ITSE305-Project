package randoop;
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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        int int8 = reservation6.getRoomNumber();
        boolean boolean9 = reservationData0.addReservation(reservation6);
        Data.ReservationData reservationData10 = new Data.ReservationData();
        java.time.LocalDate localDate13 = null;
        java.time.LocalDate localDate14 = null;
        Business.Reservation reservation16 = new Business.Reservation("hi!", (int) (short) -1, localDate13, localDate14, (double) 1);
        java.lang.String str17 = reservation16.getGuestName();
        boolean boolean18 = reservationData10.addReservation(reservation16);
        java.time.LocalDate localDate19 = reservation16.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = reservationData0.addReservation(reservation16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        int int8 = reservation6.getRoomNumber();
        boolean boolean9 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass11 = reservationList10.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        java.lang.Class<?> wildcardClass10 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        Data.ReservationData reservationData12 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList13 = reservationData12.getAllReservations();
        Data.ReservationData reservationData14 = new Data.ReservationData();
        java.time.LocalDate localDate17 = null;
        java.time.LocalDate localDate18 = null;
        Business.Reservation reservation20 = new Business.Reservation("hi!", (int) (short) -1, localDate17, localDate18, (double) 1);
        java.lang.String str21 = reservation20.getGuestName();
        boolean boolean22 = reservationData14.addReservation(reservation20);
        boolean boolean23 = reservationData12.addReservation(reservation20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = reservationData0.addReservation(reservation20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        Data.ReservationData reservationData10 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList11 = reservationData10.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) (short) -1, localDate14, localDate15, (double) 1);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData10.addReservation(reservation17);
        java.time.LocalDate localDate20 = reservation17.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = reservationData0.addReservation(reservation17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        Data.ReservationData reservationData9 = new Data.ReservationData();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) (short) -1, localDate12, localDate13, (double) 1);
        java.lang.String str16 = reservation15.getGuestName();
        boolean boolean17 = reservationData9.addReservation(reservation15);
        java.time.LocalDate localDate18 = reservation15.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = reservationData0.addReservation(reservation15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation7.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 10, localDate2, localDate3, 10.0d);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        int int8 = reservation6.getRoomNumber();
        boolean boolean9 = reservationData0.addReservation(reservation6);
        Data.ReservationData reservationData10 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList11 = reservationData10.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) (short) -1, localDate14, localDate15, (double) 1);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData10.addReservation(reservation17);
        java.time.LocalDate localDate20 = reservation17.getCheckInDate();
        java.time.LocalDate localDate21 = reservation17.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = reservationData0.addReservation(reservation17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass10 = reservationList9.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        java.lang.String str13 = reservation6.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        int int8 = reservation6.getRoomNumber();
        boolean boolean9 = reservationData0.addReservation(reservation6);
        int int10 = reservation6.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation7.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 100, localDate2, localDate3, (double) 97);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        Data.ReservationData reservationData10 = new Data.ReservationData();
        java.time.LocalDate localDate13 = null;
        java.time.LocalDate localDate14 = null;
        Business.Reservation reservation16 = new Business.Reservation("hi!", (int) (short) -1, localDate13, localDate14, (double) 1);
        java.lang.String str17 = reservation16.getGuestName();
        boolean boolean18 = reservationData10.addReservation(reservation16);
        java.time.LocalDate localDate19 = reservation16.getCheckInDate();
        int int20 = reservation16.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = reservationData0.addReservation(reservation16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        int int8 = reservation6.getRoomNumber();
        boolean boolean9 = reservationData0.addReservation(reservation6);
        java.lang.Class<?> wildcardClass10 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 0, localDate2, localDate3, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.lang.String str10 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        int int8 = reservation6.getRoomNumber();
        boolean boolean9 = reservationData0.addReservation(reservation6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        int int12 = reservation8.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = reservation8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", 97, localDate14, localDate15, (double) 0L);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) (short) -1, localDate22, localDate23, (double) 1);
        java.lang.String str26 = reservation25.getGuestName();
        int int27 = reservation25.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = reservationData0.addReservation(reservation25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.lang.Class<?> wildcardClass8 = reservation6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation7.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        int int12 = reservation6.getRoomNumber();
        java.lang.Class<?> wildcardClass13 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        java.time.LocalDate localDate13 = reservation6.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = localDate7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) (byte) -1);
        boolean boolean16 = reservationData0.addReservation(reservation15);
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        int int24 = reservation22.getRoomNumber();
        java.time.LocalDate localDate25 = reservation22.getCheckOutDate();
        int int26 = reservation22.getRoomNumber();
        java.lang.String str27 = reservation22.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = reservationData0.addReservation(reservation22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        java.lang.String str13 = reservation6.getGuestName();
        java.time.LocalDate localDate14 = reservation6.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) 10);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        int int12 = reservation8.getRoomNumber();
        boolean boolean13 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate14 = reservation8.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation8.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, (double) 10.0f);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass11 = reservationList10.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 100, localDate2, localDate3, (double) 97);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.lang.String str10 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList3 = reservationData0.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData0.addReservation(reservation9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = reservation9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList3 = reservationData0.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) (short) -1, localDate14, localDate15, (double) 1);
        java.lang.String str18 = reservation17.getGuestName();
        int int19 = reservation17.getRoomNumber();
        java.time.LocalDate localDate20 = reservation17.getCheckOutDate();
        int int21 = reservation17.getRoomNumber();
        java.lang.String str22 = reservation17.getGuestName();
        int int23 = reservation17.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = reservationData0.addReservation(reservation17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        int int12 = reservation6.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        int int12 = reservation7.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        java.lang.String str13 = reservation6.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = reservation7.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        java.lang.String str13 = reservation6.getGuestName();
        java.time.LocalDate localDate14 = reservation6.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 10, localDate2, localDate3, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation7.getCheckInDate();
        java.time.LocalDate localDate14 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation7.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) 'a', localDate14, localDate15, (double) (byte) -1);
        boolean boolean18 = reservationData2.addReservation(reservation17);
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.lang.Class<?> wildcardClass20 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        int int12 = reservation8.getRoomNumber();
        boolean boolean13 = reservationData0.addReservation(reservation8);
        int int14 = reservation8.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = reservation8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        int int12 = reservation6.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        int int8 = reservation6.getRoomNumber();
        boolean boolean9 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        Data.ReservationData reservationData11 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList12 = reservationData11.getAllReservations();
        java.time.LocalDate localDate15 = null;
        java.time.LocalDate localDate16 = null;
        Business.Reservation reservation18 = new Business.Reservation("hi!", (int) (short) -1, localDate15, localDate16, (double) 1);
        java.time.LocalDate localDate19 = reservation18.getCheckOutDate();
        boolean boolean20 = reservationData11.addReservation(reservation18);
        java.time.LocalDate localDate21 = reservation18.getCheckOutDate();
        java.time.LocalDate localDate22 = reservation18.getCheckOutDate();
        int int23 = reservation18.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = reservationData0.addReservation(reservation18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        java.time.LocalDate localDate13 = reservation6.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = localDate13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("", 0, localDate3, localDate4, (double) 10.0f);
        java.time.LocalDate localDate7 = reservation6.getCheckInDate();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation7.getCheckInDate();
        int int12 = reservation7.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate17 = null;
        java.time.LocalDate localDate18 = null;
        Business.Reservation reservation20 = new Business.Reservation("hi!", (int) (short) -1, localDate17, localDate18, (double) 1);
        java.lang.String str21 = reservation20.getGuestName();
        int int22 = reservation20.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = reservationData0.addReservation(reservation20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 10, localDate2, localDate3, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.String str8 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.lang.Class<?> wildcardClass10 = reservation7.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation9.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) 'a', localDate14, localDate15, (double) (byte) -1);
        boolean boolean18 = reservationData2.addReservation(reservation17);
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("hi!", (int) 'a', localDate23, localDate24, (double) (byte) -1);
        int int27 = reservation26.getRoomNumber();
        java.lang.String str28 = reservation26.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = reservationData0.addReservation(reservation26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        int int12 = reservation7.getRoomNumber();
        java.time.LocalDate localDate13 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = reservation7.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        int int8 = reservation6.getRoomNumber();
        boolean boolean9 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.time.LocalDate localDate13 = null;
        java.time.LocalDate localDate14 = null;
        Business.Reservation reservation16 = new Business.Reservation("hi!", (int) (short) -1, localDate13, localDate14, (double) 1);
        java.time.LocalDate localDate17 = reservation16.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = reservationData0.addReservation(reservation16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation7.getCheckInDate();
        java.time.LocalDate localDate14 = reservation7.getCheckOutDate();
        int int15 = reservation7.getRoomNumber();
        java.lang.String str16 = reservation7.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", 1, localDate12, localDate13, (double) (-1));
        java.time.LocalDate localDate16 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate17 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate18 = reservation15.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = reservation15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        java.lang.String str6 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", 97, localDate14, localDate15, (double) 0L);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList21 = reservationData0.getAllReservations();
        Data.ReservationData reservationData22 = new Data.ReservationData();
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        Business.Reservation reservation28 = new Business.Reservation("hi!", (int) (short) -1, localDate25, localDate26, (double) 1);
        java.lang.String str29 = reservation28.getGuestName();
        boolean boolean30 = reservationData22.addReservation(reservation28);
        java.lang.String str31 = reservation28.getGuestName();
        int int32 = reservation28.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = reservationData0.addReservation(reservation28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        java.util.List<Business.Reservation> reservationList15 = reservationData0.getAllReservations();
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("hi!", (int) (short) -1, localDate18, localDate19, (double) 1);
        java.time.LocalDate localDate22 = reservation21.getCheckOutDate();
        java.time.LocalDate localDate23 = reservation21.getCheckOutDate();
        int int24 = reservation21.getRoomNumber();
        int int25 = reservation21.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = reservationData0.addReservation(reservation21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        int int10 = reservation6.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", 97, localDate14, localDate15, (double) 0L);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = reservation17.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) (byte) -1);
        boolean boolean16 = reservationData0.addReservation(reservation15);
        java.util.List<Business.Reservation> reservationList17 = reservationData0.getAllReservations();
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        Business.Reservation reservation23 = new Business.Reservation("hi!", 97, localDate20, localDate21, (double) 0L);
        java.time.LocalDate localDate24 = reservation23.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = reservationData0.addReservation(reservation23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNull(localDate24);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        Business.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationData0.addReservation(reservation11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Business.Reservation.getRoomNumber()\" because \"newReservation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData15.addReservation(reservation30);
        boolean boolean32 = reservationData0.addReservation(reservation30);
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("hi!", (int) (short) -1, localDate35, localDate36, (double) 1);
        java.lang.String str39 = reservation38.getGuestName();
        int int40 = reservation38.getRoomNumber();
        java.time.LocalDate localDate41 = reservation38.getCheckOutDate();
        java.time.LocalDate localDate42 = reservation38.getCheckOutDate();
        java.lang.String str43 = reservation38.getGuestName();
        java.lang.String str44 = reservation38.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = reservationData0.addReservation(reservation38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertNull(localDate42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        java.time.LocalDate localDate13 = reservation6.getCheckInDate();
        java.time.LocalDate localDate14 = reservation6.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) (byte) -1);
        boolean boolean16 = reservationData0.addReservation(reservation15);
        java.util.List<Business.Reservation> reservationList17 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass18 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) (byte) -1);
        boolean boolean16 = reservationData0.addReservation(reservation15);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = reservation15.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 10, localDate2, localDate3, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.lang.Class<?> wildcardClass14 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.lang.String str10 = reservation7.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        java.lang.String str11 = reservation5.getGuestName();
        java.time.LocalDate localDate12 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        java.time.LocalDate localDate10 = reservation6.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = localDate10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        int int10 = reservation6.getRoomNumber();
        java.time.LocalDate localDate11 = reservation6.getCheckInDate();
        java.lang.String str12 = reservation6.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 0, localDate2, localDate3, (double) 0L);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.lang.Class<?> wildcardClass10 = reservation8.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.util.List<Business.Reservation> reservationList12 = reservationData0.getAllReservations();
        Business.Reservation reservation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = reservationData0.addReservation(reservation13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Business.Reservation.getRoomNumber()\" because \"newReservation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        int int12 = reservation8.getRoomNumber();
        boolean boolean13 = reservationData0.addReservation(reservation8);
        int int14 = reservation8.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation8.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        int int11 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        int int13 = reservation6.getRoomNumber();
        java.lang.Class<?> wildcardClass14 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, (double) 10.0f);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 0);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = reservation8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        int int11 = reservation5.getRoomNumber();
        java.time.LocalDate localDate12 = reservation5.getCheckOutDate();
        int int13 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass14 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = localDate12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        Business.Reservation reservation19 = new Business.Reservation("hi!", 97, localDate16, localDate17, (double) 0L);
        java.time.LocalDate localDate20 = reservation19.getCheckOutDate();
        java.lang.String str21 = reservation19.getGuestName();
        boolean boolean22 = reservationData0.addReservation(reservation19);
        java.lang.Class<?> wildcardClass23 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        int int12 = reservation6.getRoomNumber();
        java.lang.String str13 = reservation6.getGuestName();
        java.lang.String str14 = reservation6.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, (double) (short) 100);
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        int int11 = reservation5.getRoomNumber();
        java.lang.String str12 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) (short) -1, localDate12, localDate13, (double) 1);
        java.lang.String str16 = reservation15.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = reservationData0.addReservation(reservation15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        Data.ReservationData reservationData8 = new Data.ReservationData();
        java.time.LocalDate localDate11 = null;
        java.time.LocalDate localDate12 = null;
        Business.Reservation reservation14 = new Business.Reservation("hi!", (int) (short) -1, localDate11, localDate12, (double) 1);
        java.lang.String str15 = reservation14.getGuestName();
        boolean boolean16 = reservationData8.addReservation(reservation14);
        java.lang.String str17 = reservation14.getGuestName();
        int int18 = reservation14.getRoomNumber();
        java.lang.String str19 = reservation14.getGuestName();
        int int20 = reservation14.getRoomNumber();
        boolean boolean21 = reservationData0.addReservation(reservation14);
        java.time.LocalDate localDate24 = null;
        java.time.LocalDate localDate25 = null;
        Business.Reservation reservation27 = new Business.Reservation("hi!", (int) (short) -1, localDate24, localDate25, (double) 1);
        java.time.LocalDate localDate28 = reservation27.getCheckOutDate();
        java.time.LocalDate localDate29 = reservation27.getCheckOutDate();
        int int30 = reservation27.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = reservationData0.addReservation(reservation27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList3 = reservationData0.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", (int) '4', localDate14, localDate15, (double) 1.0f);
        java.lang.String str18 = reservation17.getGuestName();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        Business.Reservation reservation20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = reservationData0.addReservation(reservation20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Business.Reservation.getRoomNumber()\" because \"newReservation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData15.addReservation(reservation30);
        boolean boolean32 = reservationData0.addReservation(reservation30);
        java.lang.Class<?> wildcardClass33 = reservation30.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData15.addReservation(reservation30);
        boolean boolean32 = reservationData0.addReservation(reservation30);
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("hi!", (int) (short) -1, localDate36, localDate37, (double) 1);
        java.time.LocalDate localDate40 = reservation39.getCheckOutDate();
        java.time.LocalDate localDate41 = reservation39.getCheckOutDate();
        int int42 = reservation39.getRoomNumber();
        int int43 = reservation39.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = reservationData0.addReservation(reservation39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) (byte) -1);
        boolean boolean16 = reservationData0.addReservation(reservation15);
        Data.ReservationData reservationData17 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList18 = reservationData17.getAllReservations();
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("hi!", (int) (short) -1, localDate21, localDate22, (double) 1);
        java.time.LocalDate localDate25 = reservation24.getCheckOutDate();
        boolean boolean26 = reservationData17.addReservation(reservation24);
        java.time.LocalDate localDate27 = reservation24.getCheckOutDate();
        java.time.LocalDate localDate28 = reservation24.getCheckOutDate();
        java.time.LocalDate localDate29 = reservation24.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = reservationData0.addReservation(reservation24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertNull(localDate29);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        java.lang.String str13 = reservation6.getGuestName();
        java.time.LocalDate localDate14 = reservation6.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = localDate14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        Data.ReservationData reservationData10 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList11 = reservationData10.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) (short) -1, localDate14, localDate15, (double) 1);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData10.addReservation(reservation17);
        java.time.LocalDate localDate20 = reservation17.getCheckInDate();
        java.time.LocalDate localDate21 = reservation17.getCheckOutDate();
        boolean boolean22 = reservationData0.addReservation(reservation17);
        Business.Reservation reservation23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = reservationData0.addReservation(reservation23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Business.Reservation.getRoomNumber()\" because \"newReservation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData15.addReservation(reservation30);
        boolean boolean32 = reservationData0.addReservation(reservation30);
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass34 = reservationList33.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) 'a', localDate14, localDate15, (double) (byte) -1);
        boolean boolean18 = reservationData2.addReservation(reservation17);
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList21 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass22 = reservationList21.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, (double) '4');
        java.lang.String str6 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", 1, localDate12, localDate13, (double) (-1));
        java.time.LocalDate localDate16 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate17 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate18 = reservation15.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation15);
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        Business.Reservation reservation21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = reservationData0.addReservation(reservation21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Business.Reservation.getRoomNumber()\" because \"newReservation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.lang.String str10 = reservation5.getGuestName();
        java.lang.String str11 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass12 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) (byte) -1);
        boolean boolean16 = reservationData0.addReservation(reservation15);
        java.util.List<Business.Reservation> reservationList17 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList18 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass19 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        int int12 = reservation8.getRoomNumber();
        boolean boolean13 = reservationData0.addReservation(reservation8);
        Data.ReservationData reservationData14 = new Data.ReservationData();
        java.time.LocalDate localDate17 = null;
        java.time.LocalDate localDate18 = null;
        Business.Reservation reservation20 = new Business.Reservation("hi!", (int) 'a', localDate17, localDate18, (double) (byte) -1);
        boolean boolean21 = reservationData14.addReservation(reservation20);
        java.util.List<Business.Reservation> reservationList22 = reservationData14.getAllReservations();
        java.util.List<Business.Reservation> reservationList23 = reservationData14.getAllReservations();
        Data.ReservationData reservationData24 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList25 = reservationData24.getAllReservations();
        java.time.LocalDate localDate28 = null;
        java.time.LocalDate localDate29 = null;
        Business.Reservation reservation31 = new Business.Reservation("hi!", (int) (short) -1, localDate28, localDate29, (double) 1);
        java.time.LocalDate localDate32 = reservation31.getCheckOutDate();
        boolean boolean33 = reservationData24.addReservation(reservation31);
        java.time.LocalDate localDate34 = reservation31.getCheckInDate();
        java.time.LocalDate localDate35 = reservation31.getCheckOutDate();
        boolean boolean36 = reservationData14.addReservation(reservation31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = reservationData0.addReservation(reservation31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = localDate11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        int int12 = reservation8.getRoomNumber();
        boolean boolean13 = reservationData0.addReservation(reservation8);
        java.util.List<Business.Reservation> reservationList14 = reservationData0.getAllReservations();
        java.time.LocalDate localDate17 = null;
        java.time.LocalDate localDate18 = null;
        Business.Reservation reservation20 = new Business.Reservation("hi!", (-1), localDate17, localDate18, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = reservationData0.addReservation(reservation20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reservationList14);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 0, localDate2, localDate3, (double) (short) 10);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        int int12 = reservation8.getRoomNumber();
        boolean boolean13 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate14 = reservation8.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = localDate14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList3 = reservationData0.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", (int) '4', localDate14, localDate15, (double) 1.0f);
        java.lang.String str18 = reservation17.getGuestName();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = reservation17.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate12 = reservation8.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = localDate12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.lang.String str12 = reservation9.getGuestName();
        int int13 = reservation9.getRoomNumber();
        int int14 = reservation9.getRoomNumber();
        boolean boolean15 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("hi!", (int) (byte) 0, localDate18, localDate19, (double) 0L);
        boolean boolean22 = reservationData0.addReservation(reservation21);
        java.util.List<Business.Reservation> reservationList23 = reservationData0.getAllReservations();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 0, localDate2, localDate3, (double) (short) 10);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.String str8 = reservation5.getGuestName();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        java.lang.Class<?> wildcardClass13 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData14 = new Data.ReservationData();
        java.time.LocalDate localDate17 = null;
        java.time.LocalDate localDate18 = null;
        Business.Reservation reservation20 = new Business.Reservation("hi!", (int) (short) -1, localDate17, localDate18, (double) 1);
        java.lang.String str21 = reservation20.getGuestName();
        boolean boolean22 = reservationData14.addReservation(reservation20);
        java.time.LocalDate localDate23 = reservation20.getCheckInDate();
        int int24 = reservation20.getRoomNumber();
        java.time.LocalDate localDate25 = reservation20.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = reservationData0.addReservation(reservation20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(localDate25);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) (-1L));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        int int12 = reservation8.getRoomNumber();
        boolean boolean13 = reservationData0.addReservation(reservation8);
        Data.ReservationData reservationData14 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList15 = reservationData14.getAllReservations();
        java.util.List<Business.Reservation> reservationList16 = reservationData14.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) 'a', localDate19, localDate20, (double) (byte) -1);
        boolean boolean23 = reservationData14.addReservation(reservation22);
        boolean boolean24 = reservationData0.addReservation(reservation22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = reservation22.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 1, localDate2, localDate3, (double) (-1.0f));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = localDate6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate14 = reservation9.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = reservation9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData15.addReservation(reservation30);
        boolean boolean32 = reservationData0.addReservation(reservation30);
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("", (int) '4', localDate36, localDate37, (double) 1.0f);
        java.lang.String str40 = reservation39.getGuestName();
        boolean boolean41 = reservationData0.addReservation(reservation39);
        Data.ReservationData reservationData42 = new Data.ReservationData();
        java.time.LocalDate localDate45 = null;
        java.time.LocalDate localDate46 = null;
        Business.Reservation reservation48 = new Business.Reservation("hi!", (int) (short) -1, localDate45, localDate46, (double) 1);
        java.lang.String str49 = reservation48.getGuestName();
        boolean boolean50 = reservationData42.addReservation(reservation48);
        java.time.LocalDate localDate51 = reservation48.getCheckInDate();
        int int52 = reservation48.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = reservationData0.addReservation(reservation48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(localDate51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        int int12 = reservation6.getRoomNumber();
        java.lang.String str13 = reservation6.getGuestName();
        java.time.LocalDate localDate14 = reservation6.getCheckInDate();
        java.lang.Class<?> wildcardClass15 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 100, localDate2, localDate3, (double) 0);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        Business.Reservation reservation19 = new Business.Reservation("hi!", 97, localDate16, localDate17, (double) 0L);
        java.time.LocalDate localDate20 = reservation19.getCheckOutDate();
        java.lang.String str21 = reservation19.getGuestName();
        boolean boolean22 = reservationData0.addReservation(reservation19);
        java.lang.Class<?> wildcardClass23 = reservation19.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.util.List<Business.Reservation> reservationList14 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass15 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        int int11 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass12 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, (double) 10.0f);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        java.lang.String str9 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.util.List<Business.Reservation> reservationList14 = reservationData0.getAllReservations();
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.time.LocalDate localDate23 = reservation22.getCheckOutDate();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.lang.String str25 = reservation22.getGuestName();
        java.time.LocalDate localDate26 = reservation22.getCheckInDate();
        int int27 = reservation22.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = reservationData0.addReservation(reservation22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 100, localDate2, localDate3, 0.0d);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, (double) 10.0f);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList3 = reservationData0.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", (int) '4', localDate14, localDate15, (double) 1.0f);
        java.lang.String str18 = reservation17.getGuestName();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = reservation17.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) (byte) -1);
        boolean boolean16 = reservationData0.addReservation(reservation15);
        java.util.List<Business.Reservation> reservationList17 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList18 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList19 = reservationData0.getAllReservations();
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) 'a', localDate22, localDate23, (double) (byte) -1);
        java.time.LocalDate localDate26 = reservation25.getCheckInDate();
        java.time.LocalDate localDate27 = reservation25.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = reservationData0.addReservation(reservation25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNull(localDate27);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        Data.ReservationData reservationData10 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList11 = reservationData10.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) (short) -1, localDate14, localDate15, (double) 1);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData10.addReservation(reservation17);
        java.time.LocalDate localDate20 = reservation17.getCheckInDate();
        java.time.LocalDate localDate21 = reservation17.getCheckOutDate();
        boolean boolean22 = reservationData0.addReservation(reservation17);
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        Business.Reservation reservation28 = new Business.Reservation("hi!", (int) (short) -1, localDate25, localDate26, (double) 1);
        java.lang.String str29 = reservation28.getGuestName();
        int int30 = reservation28.getRoomNumber();
        java.time.LocalDate localDate31 = reservation28.getCheckOutDate();
        int int32 = reservation28.getRoomNumber();
        java.lang.String str33 = reservation28.getGuestName();
        int int34 = reservation28.getRoomNumber();
        java.time.LocalDate localDate35 = reservation28.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = reservationData0.addReservation(reservation28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(localDate35);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", 97, localDate14, localDate15, (double) 0L);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        Data.ReservationData reservationData21 = new Data.ReservationData();
        java.time.LocalDate localDate24 = null;
        java.time.LocalDate localDate25 = null;
        Business.Reservation reservation27 = new Business.Reservation("hi!", (int) (short) -1, localDate24, localDate25, (double) 1);
        java.lang.String str28 = reservation27.getGuestName();
        boolean boolean29 = reservationData21.addReservation(reservation27);
        java.lang.String str30 = reservation27.getGuestName();
        int int31 = reservation27.getRoomNumber();
        java.lang.String str32 = reservation27.getGuestName();
        int int33 = reservation27.getRoomNumber();
        java.lang.String str34 = reservation27.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = reservationData0.addReservation(reservation27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate12 = reservation8.getCheckOutDate();
        java.lang.String str13 = reservation8.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = reservation8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, (double) 100L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        Data.ReservationData reservationData8 = new Data.ReservationData();
        java.time.LocalDate localDate11 = null;
        java.time.LocalDate localDate12 = null;
        Business.Reservation reservation14 = new Business.Reservation("hi!", (int) (short) -1, localDate11, localDate12, (double) 1);
        java.lang.String str15 = reservation14.getGuestName();
        boolean boolean16 = reservationData8.addReservation(reservation14);
        java.lang.String str17 = reservation14.getGuestName();
        int int18 = reservation14.getRoomNumber();
        java.lang.String str19 = reservation14.getGuestName();
        int int20 = reservation14.getRoomNumber();
        boolean boolean21 = reservationData0.addReservation(reservation14);
        Data.ReservationData reservationData22 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList23 = reservationData22.getAllReservations();
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        Business.Reservation reservation29 = new Business.Reservation("hi!", (int) (short) -1, localDate26, localDate27, (double) 1);
        java.time.LocalDate localDate30 = reservation29.getCheckOutDate();
        boolean boolean31 = reservationData22.addReservation(reservation29);
        java.time.LocalDate localDate32 = reservation29.getCheckOutDate();
        java.time.LocalDate localDate33 = reservation29.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = reservationData0.addReservation(reservation29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertNull(localDate33);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", 1, localDate12, localDate13, (double) (-1));
        java.time.LocalDate localDate16 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate17 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate18 = reservation15.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation15);
        java.lang.Class<?> wildcardClass20 = reservationData0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation7.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        int int12 = reservation6.getRoomNumber();
        java.lang.String str13 = reservation6.getGuestName();
        java.lang.Class<?> wildcardClass14 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 100, localDate2, localDate3, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        Business.Reservation reservation19 = new Business.Reservation("hi!", 97, localDate16, localDate17, (double) 0L);
        java.time.LocalDate localDate20 = reservation19.getCheckOutDate();
        java.lang.String str21 = reservation19.getGuestName();
        boolean boolean22 = reservationData0.addReservation(reservation19);
        java.util.List<Business.Reservation> reservationList23 = reservationData0.getAllReservations();
        Business.Reservation reservation24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = reservationData0.addReservation(reservation24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Business.Reservation.getRoomNumber()\" because \"newReservation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        int int10 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        java.lang.String str13 = reservation6.getGuestName();
        java.time.LocalDate localDate14 = reservation6.getCheckInDate();
        int int15 = reservation6.getRoomNumber();
        java.time.LocalDate localDate16 = reservation6.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        int int12 = reservation7.getRoomNumber();
        java.time.LocalDate localDate13 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        int int11 = reservation6.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        int int12 = reservation7.getRoomNumber();
        java.lang.Class<?> wildcardClass13 = reservation7.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        java.lang.String str11 = reservation5.getGuestName();
        java.time.LocalDate localDate12 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData15.addReservation(reservation30);
        boolean boolean32 = reservationData0.addReservation(reservation30);
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("", (int) '4', localDate36, localDate37, (double) 1.0f);
        java.lang.String str40 = reservation39.getGuestName();
        boolean boolean41 = reservationData0.addReservation(reservation39);
        Data.ReservationData reservationData42 = new Data.ReservationData();
        java.time.LocalDate localDate45 = null;
        java.time.LocalDate localDate46 = null;
        Business.Reservation reservation48 = new Business.Reservation("hi!", (int) (short) -1, localDate45, localDate46, (double) 1);
        java.lang.String str49 = reservation48.getGuestName();
        boolean boolean50 = reservationData42.addReservation(reservation48);
        java.lang.String str51 = reservation48.getGuestName();
        int int52 = reservation48.getRoomNumber();
        java.lang.String str53 = reservation48.getGuestName();
        int int54 = reservation48.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = reservationData0.addReservation(reservation48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        Business.Reservation reservation19 = new Business.Reservation("hi!", 97, localDate16, localDate17, (double) 0L);
        java.time.LocalDate localDate20 = reservation19.getCheckOutDate();
        java.lang.String str21 = reservation19.getGuestName();
        boolean boolean22 = reservationData0.addReservation(reservation19);
        java.util.List<Business.Reservation> reservationList23 = reservationData0.getAllReservations();
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        Business.Reservation reservation29 = new Business.Reservation("", (int) '#', localDate26, localDate27, (double) (short) 100);
        boolean boolean30 = reservationData0.addReservation(reservation29);
        Data.ReservationData reservationData31 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList32 = reservationData31.getAllReservations();
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("hi!", (int) (short) -1, localDate35, localDate36, (double) 1);
        java.time.LocalDate localDate39 = reservation38.getCheckOutDate();
        boolean boolean40 = reservationData31.addReservation(reservation38);
        java.time.LocalDate localDate41 = reservation38.getCheckOutDate();
        java.time.LocalDate localDate42 = reservation38.getCheckOutDate();
        int int43 = reservation38.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = reservationData0.addReservation(reservation38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertNull(localDate42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.lang.String str9 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        java.time.LocalDate localDate11 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, (double) (short) 100);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 0, localDate2, localDate3, (double) (short) 10);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) (short) -1, localDate12, localDate13, (double) 1);
        java.lang.String str16 = reservation15.getGuestName();
        int int17 = reservation15.getRoomNumber();
        java.time.LocalDate localDate18 = reservation15.getCheckOutDate();
        int int19 = reservation15.getRoomNumber();
        java.lang.String str20 = reservation15.getGuestName();
        int int21 = reservation15.getRoomNumber();
        java.lang.String str22 = reservation15.getGuestName();
        boolean boolean23 = reservationData0.addReservation(reservation15);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = reservation15.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 0, localDate2, localDate3, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.lang.String str12 = reservation9.getGuestName();
        int int13 = reservation9.getRoomNumber();
        int int14 = reservation9.getRoomNumber();
        boolean boolean15 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("hi!", (int) (short) 1, localDate18, localDate19, 0.0d);
        int int22 = reservation21.getRoomNumber();
        boolean boolean23 = reservationData0.addReservation(reservation21);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = reservation21.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = localDate6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDate8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.lang.String str10 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        Business.Reservation reservation19 = new Business.Reservation("hi!", 97, localDate16, localDate17, (double) 0L);
        java.time.LocalDate localDate20 = reservation19.getCheckOutDate();
        java.lang.String str21 = reservation19.getGuestName();
        boolean boolean22 = reservationData0.addReservation(reservation19);
        Data.ReservationData reservationData23 = new Data.ReservationData();
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        Business.Reservation reservation29 = new Business.Reservation("hi!", (int) (short) -1, localDate26, localDate27, (double) 1);
        java.lang.String str30 = reservation29.getGuestName();
        boolean boolean31 = reservationData23.addReservation(reservation29);
        java.lang.String str32 = reservation29.getGuestName();
        int int33 = reservation29.getRoomNumber();
        java.lang.String str34 = reservation29.getGuestName();
        int int35 = reservation29.getRoomNumber();
        java.lang.String str36 = reservation29.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = reservationData0.addReservation(reservation29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation7.getCheckInDate();
        java.time.LocalDate localDate12 = reservation7.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation7.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, 0.0d);
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        Data.ReservationData reservationData10 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList11 = reservationData10.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) (short) -1, localDate14, localDate15, (double) 1);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData10.addReservation(reservation17);
        java.time.LocalDate localDate20 = reservation17.getCheckInDate();
        java.time.LocalDate localDate21 = reservation17.getCheckOutDate();
        boolean boolean22 = reservationData0.addReservation(reservation17);
        java.lang.Class<?> wildcardClass23 = reservationData0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.time.LocalDate localDate13 = null;
        java.time.LocalDate localDate14 = null;
        Business.Reservation reservation16 = new Business.Reservation("hi!", (int) 'a', localDate13, localDate14, (double) (byte) -1);
        int int17 = reservation16.getRoomNumber();
        java.lang.String str18 = reservation16.getGuestName();
        boolean boolean19 = reservationData0.addReservation(reservation16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = reservation16.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) 'a', localDate14, localDate15, (double) (byte) -1);
        boolean boolean18 = reservationData2.addReservation(reservation17);
        boolean boolean19 = reservationData0.addReservation(reservation17);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = reservation17.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation7.getCheckInDate();
        java.time.LocalDate localDate14 = reservation7.getCheckOutDate();
        int int15 = reservation7.getRoomNumber();
        java.lang.String str16 = reservation7.getGuestName();
        java.lang.Class<?> wildcardClass17 = reservation7.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        int int11 = reservation5.getRoomNumber();
        java.time.LocalDate localDate12 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = localDate12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = localDate13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.String str7 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        int int11 = reservation5.getRoomNumber();
        java.time.LocalDate localDate12 = reservation5.getCheckOutDate();
        java.lang.String str13 = reservation5.getGuestName();
        java.time.LocalDate localDate14 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate10 = reservation8.getCheckInDate();
        java.time.LocalDate localDate11 = reservation8.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = reservation8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData15.addReservation(reservation30);
        boolean boolean32 = reservationData0.addReservation(reservation30);
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
        Data.ReservationData reservationData34 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList35 = reservationData34.getAllReservations();
        java.util.List<Business.Reservation> reservationList36 = reservationData34.getAllReservations();
        Data.ReservationData reservationData37 = new Data.ReservationData();
        java.time.LocalDate localDate40 = null;
        java.time.LocalDate localDate41 = null;
        Business.Reservation reservation43 = new Business.Reservation("hi!", (int) (short) -1, localDate40, localDate41, (double) 1);
        java.lang.String str44 = reservation43.getGuestName();
        boolean boolean45 = reservationData37.addReservation(reservation43);
        java.lang.String str46 = reservation43.getGuestName();
        int int47 = reservation43.getRoomNumber();
        int int48 = reservation43.getRoomNumber();
        boolean boolean49 = reservationData34.addReservation(reservation43);
        java.time.LocalDate localDate52 = null;
        java.time.LocalDate localDate53 = null;
        Business.Reservation reservation55 = new Business.Reservation("hi!", (int) (short) 10, localDate52, localDate53, (double) (short) 1);
        boolean boolean56 = reservationData34.addReservation(reservation55);
        java.time.LocalDate localDate59 = null;
        java.time.LocalDate localDate60 = null;
        Business.Reservation reservation62 = new Business.Reservation("hi!", (int) 'a', localDate59, localDate60, (double) (byte) -1);
        boolean boolean63 = reservationData34.addReservation(reservation62);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = reservationData0.addReservation(reservation62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNotNull(reservationList35);
        org.junit.Assert.assertNotNull(reservationList36);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        int int9 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, (double) 100.0f);
        java.lang.String str6 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList4 = reservationData3.getAllReservations();
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        Business.Reservation reservation10 = new Business.Reservation("hi!", (int) (short) -1, localDate7, localDate8, (double) 1);
        java.time.LocalDate localDate11 = reservation10.getCheckOutDate();
        boolean boolean12 = reservationData3.addReservation(reservation10);
        java.time.LocalDate localDate13 = reservation10.getCheckInDate();
        java.time.LocalDate localDate14 = reservation10.getCheckOutDate();
        java.time.LocalDate localDate15 = reservation10.getCheckOutDate();
        java.time.LocalDate localDate16 = reservation10.getCheckInDate();
        java.time.LocalDate localDate17 = reservation10.getCheckOutDate();
        int int18 = reservation10.getRoomNumber();
        boolean boolean19 = reservationData0.addReservation(reservation10);
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) (short) -1, localDate22, localDate23, (double) 1);
        java.time.LocalDate localDate26 = reservation25.getCheckOutDate();
        int int27 = reservation25.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = reservationData0.addReservation(reservation25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, (double) (short) 100);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, (double) 1L);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation7.getCheckInDate();
        int int12 = reservation7.getRoomNumber();
        int int13 = reservation7.getRoomNumber();
        java.time.LocalDate localDate14 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate15 = reservation7.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        int int10 = reservation6.getRoomNumber();
        java.time.LocalDate localDate11 = reservation6.getCheckInDate();
        java.lang.String str12 = reservation6.getGuestName();
        java.lang.Class<?> wildcardClass13 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        java.time.LocalDate localDate10 = reservation6.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation6.getCheckOutDate();
        int int12 = reservation6.getRoomNumber();
        java.time.LocalDate localDate13 = reservation6.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", (int) '#', localDate12, localDate13, 0.0d);
        int int16 = reservation15.getRoomNumber();
        boolean boolean17 = reservationData0.addReservation(reservation15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = reservation15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData15.addReservation(reservation30);
        boolean boolean32 = reservationData0.addReservation(reservation30);
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList34 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass35 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNotNull(reservationList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = localDate6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData15.addReservation(reservation30);
        boolean boolean32 = reservationData0.addReservation(reservation30);
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("", (int) '4', localDate36, localDate37, (double) 1.0f);
        java.lang.String str40 = reservation39.getGuestName();
        boolean boolean41 = reservationData0.addReservation(reservation39);
        int int42 = reservation39.getRoomNumber();
        java.lang.Class<?> wildcardClass43 = reservation39.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList11 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass12 = reservationList11.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.lang.String str12 = reservation9.getGuestName();
        int int13 = reservation9.getRoomNumber();
        int int14 = reservation9.getRoomNumber();
        boolean boolean15 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("hi!", (int) (short) 1, localDate18, localDate19, 0.0d);
        int int22 = reservation21.getRoomNumber();
        boolean boolean23 = reservationData0.addReservation(reservation21);
        java.lang.Class<?> wildcardClass24 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, (double) '4');
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) '4');
        boolean boolean16 = reservationData0.addReservation(reservation15);
        int int17 = reservation15.getRoomNumber();
        int int18 = reservation15.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = reservation15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        Data.ReservationData reservationData10 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList11 = reservationData10.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) (short) -1, localDate14, localDate15, (double) 1);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData10.addReservation(reservation17);
        java.time.LocalDate localDate20 = reservation17.getCheckInDate();
        java.time.LocalDate localDate21 = reservation17.getCheckOutDate();
        boolean boolean22 = reservationData0.addReservation(reservation17);
        java.util.List<Business.Reservation> reservationList23 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass24 = reservationData0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation7.getCheckInDate();
        int int14 = reservation7.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation7.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.util.List<Business.Reservation> reservationList12 = reservationData0.getAllReservations();
        Data.ReservationData reservationData13 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList14 = reservationData13.getAllReservations();
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("hi!", (int) (short) -1, localDate18, localDate19, (double) 1);
        java.lang.String str22 = reservation21.getGuestName();
        boolean boolean23 = reservationData15.addReservation(reservation21);
        java.time.LocalDate localDate24 = reservation21.getCheckInDate();
        int int25 = reservation21.getRoomNumber();
        boolean boolean26 = reservationData13.addReservation(reservation21);
        java.util.List<Business.Reservation> reservationList27 = reservationData13.getAllReservations();
        Data.ReservationData reservationData28 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList29 = reservationData28.getAllReservations();
        java.util.List<Business.Reservation> reservationList30 = reservationData28.getAllReservations();
        Data.ReservationData reservationData31 = new Data.ReservationData();
        java.time.LocalDate localDate34 = null;
        java.time.LocalDate localDate35 = null;
        Business.Reservation reservation37 = new Business.Reservation("hi!", (int) (short) -1, localDate34, localDate35, (double) 1);
        java.lang.String str38 = reservation37.getGuestName();
        boolean boolean39 = reservationData31.addReservation(reservation37);
        java.time.LocalDate localDate40 = reservation37.getCheckInDate();
        boolean boolean41 = reservationData28.addReservation(reservation37);
        java.time.LocalDate localDate44 = null;
        java.time.LocalDate localDate45 = null;
        Business.Reservation reservation47 = new Business.Reservation("hi!", 97, localDate44, localDate45, (double) 0L);
        java.time.LocalDate localDate48 = reservation47.getCheckOutDate();
        java.lang.String str49 = reservation47.getGuestName();
        boolean boolean50 = reservationData28.addReservation(reservation47);
        java.util.List<Business.Reservation> reservationList51 = reservationData28.getAllReservations();
        java.time.LocalDate localDate54 = null;
        java.time.LocalDate localDate55 = null;
        Business.Reservation reservation57 = new Business.Reservation("", (int) '#', localDate54, localDate55, (double) (short) 100);
        boolean boolean58 = reservationData28.addReservation(reservation57);
        boolean boolean59 = reservationData13.addReservation(reservation57);
        boolean boolean60 = reservationData0.addReservation(reservation57);
        java.util.List<Business.Reservation> reservationList61 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass62 = reservationList61.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(reservationList27);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(localDate48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(reservationList51);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(reservationList61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 100, localDate2, localDate3, (double) 100);
        java.lang.String str6 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, 0.0d);
        java.lang.String str6 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        Data.ReservationData reservationData8 = new Data.ReservationData();
        java.time.LocalDate localDate11 = null;
        java.time.LocalDate localDate12 = null;
        Business.Reservation reservation14 = new Business.Reservation("hi!", (int) (short) -1, localDate11, localDate12, (double) 1);
        java.lang.String str15 = reservation14.getGuestName();
        boolean boolean16 = reservationData8.addReservation(reservation14);
        java.lang.String str17 = reservation14.getGuestName();
        int int18 = reservation14.getRoomNumber();
        java.lang.String str19 = reservation14.getGuestName();
        int int20 = reservation14.getRoomNumber();
        boolean boolean21 = reservationData0.addReservation(reservation14);
        java.time.LocalDate localDate22 = reservation14.getCheckOutDate();
        java.time.LocalDate localDate23 = reservation14.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = reservation14.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        java.lang.String str13 = reservation6.getGuestName();
        java.time.LocalDate localDate14 = reservation6.getCheckInDate();
        int int15 = reservation6.getRoomNumber();
        java.time.LocalDate localDate16 = reservation6.getCheckInDate();
        int int17 = reservation6.getRoomNumber();
        java.lang.String str18 = reservation6.getGuestName();
        int int19 = reservation6.getRoomNumber();
        java.lang.Class<?> wildcardClass20 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) (byte) 0, localDate12, localDate13, (-1.0d));
        boolean boolean16 = reservationData0.addReservation(reservation15);
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) 'a', localDate19, localDate20, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = reservationData0.addReservation(reservation22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, (double) (short) 100);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = localDate7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate12 = reservation8.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = reservation8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        Business.Reservation reservation19 = new Business.Reservation("hi!", (int) 'a', localDate16, localDate17, (double) (byte) -1);
        java.time.LocalDate localDate20 = reservation19.getCheckOutDate();
        java.time.LocalDate localDate21 = reservation19.getCheckOutDate();
        boolean boolean22 = reservationData0.addReservation(reservation19);
        java.util.List<Business.Reservation> reservationList23 = reservationData0.getAllReservations();
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        Business.Reservation reservation29 = new Business.Reservation("hi!", (int) (short) -1, localDate26, localDate27, (double) 1);
        java.time.LocalDate localDate30 = reservation29.getCheckOutDate();
        java.time.LocalDate localDate31 = reservation29.getCheckOutDate();
        int int32 = reservation29.getRoomNumber();
        int int33 = reservation29.getRoomNumber();
        int int34 = reservation29.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = reservationData0.addReservation(reservation29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) -1, localDate2, localDate3, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.lang.String str10 = reservation8.getGuestName();
        int int11 = reservation8.getRoomNumber();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList3 = reservationData0.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", 35, localDate14, localDate15, (double) (short) 1);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.lang.Class<?> wildcardClass20 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        int int12 = reservation8.getRoomNumber();
        boolean boolean13 = reservationData0.addReservation(reservation8);
        Data.ReservationData reservationData14 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList15 = reservationData14.getAllReservations();
        java.util.List<Business.Reservation> reservationList16 = reservationData14.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) 'a', localDate19, localDate20, (double) (byte) -1);
        boolean boolean23 = reservationData14.addReservation(reservation22);
        boolean boolean24 = reservationData0.addReservation(reservation22);
        Data.ReservationData reservationData25 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList26 = reservationData25.getAllReservations();
        Data.ReservationData reservationData27 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList28 = reservationData27.getAllReservations();
        java.time.LocalDate localDate31 = null;
        java.time.LocalDate localDate32 = null;
        Business.Reservation reservation34 = new Business.Reservation("hi!", (int) (short) -1, localDate31, localDate32, (double) 1);
        java.time.LocalDate localDate35 = reservation34.getCheckOutDate();
        boolean boolean36 = reservationData27.addReservation(reservation34);
        java.time.LocalDate localDate37 = reservation34.getCheckOutDate();
        java.time.LocalDate localDate38 = reservation34.getCheckInDate();
        boolean boolean39 = reservationData25.addReservation(reservation34);
        int int40 = reservation34.getRoomNumber();
        java.time.LocalDate localDate41 = reservation34.getCheckOutDate();
        int int42 = reservation34.getRoomNumber();
        java.time.LocalDate localDate43 = reservation34.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = reservationData0.addReservation(reservation34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNotNull(reservationList28);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(localDate37);
        org.junit.Assert.assertNull(localDate38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(localDate43);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 52, localDate2, localDate3, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 10, localDate2, localDate3, (double) (byte) 10);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.lang.String str12 = reservation9.getGuestName();
        int int13 = reservation9.getRoomNumber();
        int int14 = reservation9.getRoomNumber();
        boolean boolean15 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("hi!", (int) (short) 10, localDate18, localDate19, (double) (short) 1);
        boolean boolean22 = reservationData0.addReservation(reservation21);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = reservation21.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 1);
        int int6 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        java.util.List<Business.Reservation> reservationList15 = reservationData0.getAllReservations();
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("", 1, localDate18, localDate19, (double) (-1));
        boolean boolean22 = reservationData0.addReservation(reservation21);
        java.lang.Class<?> wildcardClass23 = reservation21.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        int int12 = reservation8.getRoomNumber();
        boolean boolean13 = reservationData0.addReservation(reservation8);
        java.util.List<Business.Reservation> reservationList14 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList15 = reservationData0.getAllReservations();
        Data.ReservationData reservationData16 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList17 = reservationData16.getAllReservations();
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        Business.Reservation reservation23 = new Business.Reservation("hi!", (int) (short) -1, localDate20, localDate21, (double) 1);
        java.time.LocalDate localDate24 = reservation23.getCheckOutDate();
        boolean boolean25 = reservationData16.addReservation(reservation23);
        java.time.LocalDate localDate26 = reservation23.getCheckOutDate();
        java.time.LocalDate localDate27 = reservation23.getCheckOutDate();
        int int28 = reservation23.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = reservationData0.addReservation(reservation23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        java.lang.String str13 = reservation6.getGuestName();
        java.time.LocalDate localDate14 = reservation6.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        java.lang.String str13 = reservation6.getGuestName();
        java.time.LocalDate localDate14 = reservation6.getCheckInDate();
        int int15 = reservation6.getRoomNumber();
        java.time.LocalDate localDate16 = reservation6.getCheckInDate();
        int int17 = reservation6.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        Data.ReservationData reservationData10 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList11 = reservationData10.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) (short) -1, localDate14, localDate15, (double) 1);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData10.addReservation(reservation17);
        java.time.LocalDate localDate20 = reservation17.getCheckInDate();
        java.time.LocalDate localDate21 = reservation17.getCheckOutDate();
        boolean boolean22 = reservationData0.addReservation(reservation17);
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        Business.Reservation reservation28 = new Business.Reservation("hi!", (int) (short) -1, localDate25, localDate26, (double) 1);
        java.lang.String str29 = reservation28.getGuestName();
        int int30 = reservation28.getRoomNumber();
        java.time.LocalDate localDate31 = reservation28.getCheckOutDate();
        int int32 = reservation28.getRoomNumber();
        java.lang.String str33 = reservation28.getGuestName();
        int int34 = reservation28.getRoomNumber();
        java.time.LocalDate localDate35 = reservation28.getCheckOutDate();
        java.lang.String str36 = reservation28.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = reservationData0.addReservation(reservation28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate12 = reservation8.getCheckOutDate();
        java.lang.String str13 = reservation8.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = reservation8.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.String str8 = reservation5.getGuestName();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = localDate9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 10, localDate2, localDate3, (double) (byte) 1);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        int int12 = reservation6.getRoomNumber();
        java.lang.String str13 = reservation6.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        Data.ReservationData reservationData12 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList13 = reservationData12.getAllReservations();
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        Business.Reservation reservation19 = new Business.Reservation("hi!", (int) (short) -1, localDate16, localDate17, (double) 1);
        java.time.LocalDate localDate20 = reservation19.getCheckOutDate();
        boolean boolean21 = reservationData12.addReservation(reservation19);
        java.time.LocalDate localDate22 = reservation19.getCheckInDate();
        java.time.LocalDate localDate23 = reservation19.getCheckOutDate();
        java.time.LocalDate localDate24 = reservation19.getCheckOutDate();
        java.time.LocalDate localDate25 = reservation19.getCheckInDate();
        java.time.LocalDate localDate26 = reservation19.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = reservationData0.addReservation(reservation19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNull(localDate26);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.String str8 = reservation5.getGuestName();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (-1.0f));
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        int int12 = reservation7.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation7.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        int int12 = reservation8.getRoomNumber();
        boolean boolean13 = reservationData0.addReservation(reservation8);
        Data.ReservationData reservationData14 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList15 = reservationData14.getAllReservations();
        java.util.List<Business.Reservation> reservationList16 = reservationData14.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) 'a', localDate19, localDate20, (double) (byte) -1);
        boolean boolean23 = reservationData14.addReservation(reservation22);
        boolean boolean24 = reservationData0.addReservation(reservation22);
        java.util.List<Business.Reservation> reservationList25 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass26 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        int int15 = reservation9.getRoomNumber();
        java.time.LocalDate localDate16 = reservation9.getCheckOutDate();
        int int17 = reservation9.getRoomNumber();
        java.lang.Class<?> wildcardClass18 = reservation9.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        java.lang.String str11 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) (byte) -1);
        boolean boolean16 = reservationData0.addReservation(reservation15);
        java.time.LocalDate localDate17 = reservation15.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = reservation15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.lang.String str12 = reservation9.getGuestName();
        int int13 = reservation9.getRoomNumber();
        int int14 = reservation9.getRoomNumber();
        boolean boolean15 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("hi!", (int) (short) 1, localDate18, localDate19, 0.0d);
        int int22 = reservation21.getRoomNumber();
        boolean boolean23 = reservationData0.addReservation(reservation21);
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        Business.Reservation reservation29 = new Business.Reservation("hi!", (int) (short) 1, localDate26, localDate27, (double) 1);
        java.lang.String str30 = reservation29.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = reservationData0.addReservation(reservation29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.lang.String str12 = reservation9.getGuestName();
        int int13 = reservation9.getRoomNumber();
        int int14 = reservation9.getRoomNumber();
        boolean boolean15 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate16 = reservation9.getCheckInDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = localDate9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData15.addReservation(reservation30);
        boolean boolean32 = reservationData0.addReservation(reservation30);
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("hi!", (int) (short) 1, localDate35, localDate36, (double) (byte) 100);
        boolean boolean39 = reservationData0.addReservation(reservation38);
        java.time.LocalDate localDate42 = null;
        java.time.LocalDate localDate43 = null;
        Business.Reservation reservation45 = new Business.Reservation("hi!", (int) 'a', localDate42, localDate43, (double) (byte) -1);
        java.time.LocalDate localDate46 = reservation45.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = reservationData0.addReservation(reservation45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(localDate46);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        int int12 = reservation7.getRoomNumber();
        int int13 = reservation7.getRoomNumber();
        java.lang.Class<?> wildcardClass14 = reservation7.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 10, localDate2, localDate3, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", (int) '#', localDate12, localDate13, 0.0d);
        int int16 = reservation15.getRoomNumber();
        boolean boolean17 = reservationData0.addReservation(reservation15);
        int int18 = reservation15.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) '4');
        boolean boolean16 = reservationData0.addReservation(reservation15);
        int int17 = reservation15.getRoomNumber();
        java.lang.Class<?> wildcardClass18 = reservation15.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        Business.Reservation reservation19 = new Business.Reservation("hi!", (int) 'a', localDate16, localDate17, (double) (byte) -1);
        java.time.LocalDate localDate20 = reservation19.getCheckOutDate();
        java.time.LocalDate localDate21 = reservation19.getCheckOutDate();
        boolean boolean22 = reservationData0.addReservation(reservation19);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = reservation19.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.lang.String str10 = reservation7.getGuestName();
        java.time.LocalDate localDate11 = reservation7.getCheckInDate();
        java.time.LocalDate localDate12 = reservation7.getCheckInDate();
        java.time.LocalDate localDate13 = reservation7.getCheckOutDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        java.lang.String str8 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        Data.ReservationData reservationData12 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList13 = reservationData12.getAllReservations();
        java.util.List<Business.Reservation> reservationList14 = reservationData12.getAllReservations();
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("hi!", (int) (short) -1, localDate18, localDate19, (double) 1);
        java.lang.String str22 = reservation21.getGuestName();
        boolean boolean23 = reservationData15.addReservation(reservation21);
        java.time.LocalDate localDate24 = reservation21.getCheckInDate();
        boolean boolean25 = reservationData12.addReservation(reservation21);
        java.time.LocalDate localDate26 = reservation21.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = reservationData0.addReservation(reservation21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(localDate26);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 100, localDate2, localDate3, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.lang.String str12 = reservation9.getGuestName();
        int int13 = reservation9.getRoomNumber();
        int int14 = reservation9.getRoomNumber();
        boolean boolean15 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("hi!", (int) (short) 1, localDate18, localDate19, 0.0d);
        int int22 = reservation21.getRoomNumber();
        boolean boolean23 = reservationData0.addReservation(reservation21);
        java.lang.Class<?> wildcardClass24 = reservation21.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 0, localDate2, localDate3, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData15.addReservation(reservation30);
        boolean boolean32 = reservationData0.addReservation(reservation30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = reservation30.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        int int10 = reservation6.getRoomNumber();
        java.time.LocalDate localDate11 = reservation6.getCheckInDate();
        java.lang.Class<?> wildcardClass12 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) -1, localDate2, localDate3, (double) (-1L));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.lang.Class<?> wildcardClass10 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList3 = reservationData0.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", (int) '4', localDate14, localDate15, (double) 1.0f);
        java.lang.String str18 = reservation17.getGuestName();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("", 0, localDate23, localDate24, (double) 10.0f);
        java.time.LocalDate localDate27 = reservation26.getCheckInDate();
        java.lang.String str28 = reservation26.getGuestName();
        boolean boolean29 = reservationData0.addReservation(reservation26);
        java.util.List<Business.Reservation> reservationList30 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass31 = reservationList30.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 0, localDate2, localDate3, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData15.addReservation(reservation30);
        boolean boolean32 = reservationData0.addReservation(reservation30);
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("", (int) (short) 0, localDate35, localDate36, 0.0d);
        boolean boolean39 = reservationData0.addReservation(reservation38);
        java.time.LocalDate localDate42 = null;
        java.time.LocalDate localDate43 = null;
        Business.Reservation reservation45 = new Business.Reservation("hi!", (int) (short) 1, localDate42, localDate43, (double) 1);
        int int46 = reservation45.getRoomNumber();
        boolean boolean47 = reservationData0.addReservation(reservation45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = reservation45.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.String str7 = reservation5.getGuestName();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) '4');
        boolean boolean16 = reservationData0.addReservation(reservation15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = reservation15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation7.getCheckInDate();
        int int14 = reservation7.getRoomNumber();
        int int15 = reservation7.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 100, localDate2, localDate3, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        int int12 = reservation8.getRoomNumber();
        boolean boolean13 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate14 = reservation8.getCheckInDate();
        java.time.LocalDate localDate15 = reservation8.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = reservation8.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        Business.Reservation reservation19 = new Business.Reservation("hi!", (int) 'a', localDate16, localDate17, (double) (byte) -1);
        java.time.LocalDate localDate20 = reservation19.getCheckOutDate();
        java.time.LocalDate localDate21 = reservation19.getCheckOutDate();
        boolean boolean22 = reservationData0.addReservation(reservation19);
        java.util.List<Business.Reservation> reservationList23 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass24 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (short) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.lang.String str10 = reservation7.getGuestName();
        java.time.LocalDate localDate11 = reservation7.getCheckInDate();
        int int12 = reservation7.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation7.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList3 = reservationData0.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", 35, localDate14, localDate15, (double) (short) 1);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = reservation17.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation7.getCheckInDate();
        java.time.LocalDate localDate14 = reservation7.getCheckOutDate();
        int int15 = reservation7.getRoomNumber();
        java.lang.String str16 = reservation7.getGuestName();
        int int17 = reservation7.getRoomNumber();
        java.time.LocalDate localDate18 = reservation7.getCheckInDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 1.0f);
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        int int8 = reservation6.getRoomNumber();
        boolean boolean9 = reservationData0.addReservation(reservation6);
        java.lang.Class<?> wildcardClass10 = reservationData0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        int int11 = reservation6.getRoomNumber();
        java.lang.Class<?> wildcardClass12 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.String str8 = reservation5.getGuestName();
        java.lang.String str9 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate14 = reservation7.getCheckOutDate();
        java.lang.String str15 = reservation7.getGuestName();
        java.lang.Class<?> wildcardClass16 = reservation7.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        Business.Reservation reservation19 = new Business.Reservation("hi!", 97, localDate16, localDate17, (double) 0L);
        java.time.LocalDate localDate20 = reservation19.getCheckOutDate();
        java.lang.String str21 = reservation19.getGuestName();
        boolean boolean22 = reservationData0.addReservation(reservation19);
        java.util.List<Business.Reservation> reservationList23 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList24 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass25 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) (byte) -1);
        boolean boolean16 = reservationData0.addReservation(reservation15);
        java.util.List<Business.Reservation> reservationList17 = reservationData0.getAllReservations();
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        Business.Reservation reservation23 = new Business.Reservation("hi!", (int) (short) -1, localDate20, localDate21, (double) 1);
        int int24 = reservation23.getRoomNumber();
        java.time.LocalDate localDate25 = reservation23.getCheckInDate();
        java.lang.String str26 = reservation23.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = reservationData0.addReservation(reservation23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        java.util.List<Business.Reservation> reservationList15 = reservationData0.getAllReservations();
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("", 1, localDate18, localDate19, (double) (-1));
        boolean boolean22 = reservationData0.addReservation(reservation21);
        java.util.List<Business.Reservation> reservationList23 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass24 = reservationList23.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        Business.Reservation reservation19 = new Business.Reservation("hi!", (int) 'a', localDate16, localDate17, (double) (byte) -1);
        java.time.LocalDate localDate20 = reservation19.getCheckOutDate();
        java.time.LocalDate localDate21 = reservation19.getCheckOutDate();
        boolean boolean22 = reservationData0.addReservation(reservation19);
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        Business.Reservation reservation28 = new Business.Reservation("", (int) (short) 1, localDate25, localDate26, (double) (-1));
        java.lang.String str29 = reservation28.getGuestName();
        java.time.LocalDate localDate30 = reservation28.getCheckInDate();
        boolean boolean31 = reservationData0.addReservation(reservation28);
        java.time.LocalDate localDate32 = reservation28.getCheckInDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(localDate32);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (-1.0f));
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.lang.String str10 = reservation7.getGuestName();
        java.time.LocalDate localDate11 = reservation7.getCheckInDate();
        int int12 = reservation7.getRoomNumber();
        java.time.LocalDate localDate13 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate14 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation7.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList4 = reservationData3.getAllReservations();
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        Business.Reservation reservation10 = new Business.Reservation("hi!", (int) (short) -1, localDate7, localDate8, (double) 1);
        java.time.LocalDate localDate11 = reservation10.getCheckOutDate();
        boolean boolean12 = reservationData3.addReservation(reservation10);
        java.time.LocalDate localDate13 = reservation10.getCheckInDate();
        java.time.LocalDate localDate14 = reservation10.getCheckOutDate();
        java.time.LocalDate localDate15 = reservation10.getCheckOutDate();
        java.time.LocalDate localDate16 = reservation10.getCheckInDate();
        java.time.LocalDate localDate17 = reservation10.getCheckOutDate();
        int int18 = reservation10.getRoomNumber();
        boolean boolean19 = reservationData0.addReservation(reservation10);
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) (short) -1, localDate22, localDate23, (double) 1);
        java.lang.String str26 = reservation25.getGuestName();
        int int27 = reservation25.getRoomNumber();
        java.time.LocalDate localDate28 = reservation25.getCheckOutDate();
        int int29 = reservation25.getRoomNumber();
        java.lang.String str30 = reservation25.getGuestName();
        java.lang.String str31 = reservation25.getGuestName();
        java.time.LocalDate localDate32 = reservation25.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = reservationData0.addReservation(reservation25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(localDate32);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.lang.Class<?> wildcardClass1 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        Business.Reservation reservation19 = new Business.Reservation("hi!", (int) 'a', localDate16, localDate17, (double) (byte) -1);
        java.time.LocalDate localDate20 = reservation19.getCheckOutDate();
        java.time.LocalDate localDate21 = reservation19.getCheckOutDate();
        boolean boolean22 = reservationData0.addReservation(reservation19);
        java.lang.Class<?> wildcardClass23 = reservation19.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, (double) (short) 100);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.time.LocalDate localDate13 = null;
        java.time.LocalDate localDate14 = null;
        Business.Reservation reservation16 = new Business.Reservation("", 1, localDate13, localDate14, (double) (-1));
        java.time.LocalDate localDate17 = reservation16.getCheckInDate();
        boolean boolean18 = reservationData0.addReservation(reservation16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = reservation16.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, (double) '4');
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 35, localDate2, localDate3, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", 97, localDate14, localDate15, (double) 0L);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass21 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = reservation7.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        boolean boolean13 = reservationData0.addReservation(reservation9);
        java.lang.String str14 = reservation9.getGuestName();
        int int15 = reservation9.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = reservation9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        Data.ReservationData reservationData8 = new Data.ReservationData();
        java.time.LocalDate localDate11 = null;
        java.time.LocalDate localDate12 = null;
        Business.Reservation reservation14 = new Business.Reservation("hi!", (int) (short) -1, localDate11, localDate12, (double) 1);
        java.lang.String str15 = reservation14.getGuestName();
        boolean boolean16 = reservationData8.addReservation(reservation14);
        java.lang.String str17 = reservation14.getGuestName();
        int int18 = reservation14.getRoomNumber();
        java.lang.String str19 = reservation14.getGuestName();
        int int20 = reservation14.getRoomNumber();
        boolean boolean21 = reservationData0.addReservation(reservation14);
        java.lang.String str22 = reservation14.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = reservation14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 100, localDate2, localDate3, (double) '#');
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 100, localDate2, localDate3, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList3 = reservationData0.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData0.addReservation(reservation9);
        java.util.List<Business.Reservation> reservationList12 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList13 = reservationData0.getAllReservations();
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        Business.Reservation reservation19 = new Business.Reservation("", (int) '#', localDate16, localDate17, 0.0d);
        int int20 = reservation19.getRoomNumber();
        int int21 = reservation19.getRoomNumber();
        boolean boolean22 = reservationData0.addReservation(reservation19);
        Data.ReservationData reservationData23 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList24 = reservationData23.getAllReservations();
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) (short) -1, localDate27, localDate28, (double) 1);
        java.time.LocalDate localDate31 = reservation30.getCheckOutDate();
        boolean boolean32 = reservationData23.addReservation(reservation30);
        java.time.LocalDate localDate33 = reservation30.getCheckInDate();
        java.time.LocalDate localDate34 = reservation30.getCheckOutDate();
        java.time.LocalDate localDate35 = reservation30.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = reservationData0.addReservation(reservation30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertNull(localDate35);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.lang.String str12 = reservation9.getGuestName();
        int int13 = reservation9.getRoomNumber();
        int int14 = reservation9.getRoomNumber();
        boolean boolean15 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData16 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList17 = reservationData16.getAllReservations();
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        Business.Reservation reservation23 = new Business.Reservation("hi!", (int) (short) -1, localDate20, localDate21, (double) 1);
        java.time.LocalDate localDate24 = reservation23.getCheckOutDate();
        boolean boolean25 = reservationData16.addReservation(reservation23);
        java.lang.String str26 = reservation23.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = reservationData0.addReservation(reservation23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.String str7 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData15.addReservation(reservation30);
        boolean boolean32 = reservationData0.addReservation(reservation30);
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("", (int) (short) 0, localDate35, localDate36, 0.0d);
        boolean boolean39 = reservationData0.addReservation(reservation38);
        java.time.LocalDate localDate42 = null;
        java.time.LocalDate localDate43 = null;
        Business.Reservation reservation45 = new Business.Reservation("hi!", (int) (short) 1, localDate42, localDate43, (double) 1);
        int int46 = reservation45.getRoomNumber();
        boolean boolean47 = reservationData0.addReservation(reservation45);
        java.time.LocalDate localDate50 = null;
        java.time.LocalDate localDate51 = null;
        Business.Reservation reservation53 = new Business.Reservation("hi!", (int) 'a', localDate50, localDate51, (double) (byte) -1);
        int int54 = reservation53.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = reservationData0.addReservation(reservation53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        java.time.LocalDate localDate10 = reservation6.getCheckInDate();
        java.time.LocalDate localDate11 = reservation6.getCheckOutDate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) '4');
        boolean boolean16 = reservationData0.addReservation(reservation15);
        java.lang.String str17 = reservation15.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = reservation15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 52, localDate2, localDate3, (double) (byte) 1);
        java.lang.String str6 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 35, localDate2, localDate3, (double) 97);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) (byte) -1);
        boolean boolean16 = reservationData0.addReservation(reservation15);
        Data.ReservationData reservationData17 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList18 = reservationData17.getAllReservations();
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("hi!", (int) (short) -1, localDate21, localDate22, (double) 1);
        java.time.LocalDate localDate25 = reservation24.getCheckOutDate();
        boolean boolean26 = reservationData17.addReservation(reservation24);
        java.time.LocalDate localDate27 = reservation24.getCheckOutDate();
        java.time.LocalDate localDate28 = reservation24.getCheckOutDate();
        int int29 = reservation24.getRoomNumber();
        int int30 = reservation24.getRoomNumber();
        java.lang.String str31 = reservation24.getGuestName();
        java.lang.String str32 = reservation24.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = reservationData0.addReservation(reservation24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) -1, localDate2, localDate3, (double) (-1L));
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", (int) '#', localDate12, localDate13, 0.0d);
        int int16 = reservation15.getRoomNumber();
        boolean boolean17 = reservationData0.addReservation(reservation15);
        java.lang.Class<?> wildcardClass18 = reservation15.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        java.lang.Class<?> wildcardClass15 = reservation9.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        int int8 = reservation5.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) (-1));
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        int int11 = reservation5.getRoomNumber();
        java.time.LocalDate localDate12 = reservation5.getCheckOutDate();
        java.lang.String str13 = reservation5.getGuestName();
        java.time.LocalDate localDate14 = reservation5.getCheckOutDate();
        int int15 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData15.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData15.addReservation(reservation30);
        boolean boolean32 = reservationData0.addReservation(reservation30);
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("", (int) '4', localDate36, localDate37, (double) 1.0f);
        java.lang.String str40 = reservation39.getGuestName();
        boolean boolean41 = reservationData0.addReservation(reservation39);
        // The following exception was thrown during execution in test generation
        try {
            double double42 = reservation39.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        int int11 = reservation5.getRoomNumber();
        java.time.LocalDate localDate12 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 1.0f);
        java.lang.String str6 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        int int12 = reservation7.getRoomNumber();
        java.time.LocalDate localDate13 = reservation7.getCheckOutDate();
        int int14 = reservation7.getRoomNumber();
        java.lang.Class<?> wildcardClass15 = reservation7.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation7.getCheckInDate();
        java.time.LocalDate localDate14 = reservation7.getCheckOutDate();
        int int15 = reservation7.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 52, localDate2, localDate3, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, 1.0d);
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) 'a', localDate2, localDate3, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 10, localDate2, localDate3, (double) (-1));
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) (byte) 0, localDate12, localDate13, (-1.0d));
        boolean boolean16 = reservationData0.addReservation(reservation15);
        Data.ReservationData reservationData17 = new Data.ReservationData();
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        Business.Reservation reservation23 = new Business.Reservation("hi!", (int) (short) -1, localDate20, localDate21, (double) 1);
        java.lang.String str24 = reservation23.getGuestName();
        boolean boolean25 = reservationData17.addReservation(reservation23);
        java.lang.String str26 = reservation23.getGuestName();
        int int27 = reservation23.getRoomNumber();
        java.lang.String str28 = reservation23.getGuestName();
        java.time.LocalDate localDate29 = reservation23.getCheckInDate();
        java.lang.String str30 = reservation23.getGuestName();
        java.time.LocalDate localDate31 = reservation23.getCheckOutDate();
        int int32 = reservation23.getRoomNumber();
        boolean boolean33 = reservationData0.addReservation(reservation23);
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("hi!", (-1), localDate36, localDate37, (double) 1);
        java.time.LocalDate localDate40 = reservation39.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = reservationData0.addReservation(reservation39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(localDate40);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) 10);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate11 = null;
        java.time.LocalDate localDate12 = null;
        Business.Reservation reservation14 = new Business.Reservation("hi!", (int) (short) -1, localDate11, localDate12, (double) 1);
        java.lang.String str15 = reservation14.getGuestName();
        int int16 = reservation14.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = reservationData0.addReservation(reservation14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.String str7 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", 1, localDate12, localDate13, (double) (-1));
        java.time.LocalDate localDate16 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate17 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate18 = reservation15.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation15);
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        Data.ReservationData reservationData21 = new Data.ReservationData();
        java.time.LocalDate localDate24 = null;
        java.time.LocalDate localDate25 = null;
        Business.Reservation reservation27 = new Business.Reservation("hi!", (int) 'a', localDate24, localDate25, (double) (byte) -1);
        boolean boolean28 = reservationData21.addReservation(reservation27);
        java.util.List<Business.Reservation> reservationList29 = reservationData21.getAllReservations();
        java.util.List<Business.Reservation> reservationList30 = reservationData21.getAllReservations();
        java.time.LocalDate localDate33 = null;
        java.time.LocalDate localDate34 = null;
        Business.Reservation reservation36 = new Business.Reservation("hi!", (int) (byte) 0, localDate33, localDate34, (-1.0d));
        boolean boolean37 = reservationData21.addReservation(reservation36);
        boolean boolean38 = reservationData0.addReservation(reservation36);
        java.time.LocalDate localDate41 = null;
        java.time.LocalDate localDate42 = null;
        Business.Reservation reservation44 = new Business.Reservation("hi!", 97, localDate41, localDate42, (double) 0L);
        java.time.LocalDate localDate45 = reservation44.getCheckOutDate();
        java.lang.String str46 = reservation44.getGuestName();
        boolean boolean47 = reservationData0.addReservation(reservation44);
        java.time.LocalDate localDate48 = reservation44.getCheckInDate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(localDate45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(localDate48);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList11 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList12 = reservationData0.getAllReservations();
        java.time.LocalDate localDate15 = null;
        java.time.LocalDate localDate16 = null;
        Business.Reservation reservation18 = new Business.Reservation("hi!", 1, localDate15, localDate16, 1.0d);
        boolean boolean19 = reservationData0.addReservation(reservation18);
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) (short) 1, localDate22, localDate23, (double) (byte) 100);
        java.time.LocalDate localDate26 = reservation25.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = reservationData0.addReservation(reservation25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDate26);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = localDate9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation7.getCheckInDate();
        java.time.LocalDate localDate14 = reservation7.getCheckOutDate();
        int int15 = reservation7.getRoomNumber();
        java.time.LocalDate localDate16 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = reservation7.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = localDate11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        int int12 = reservation8.getRoomNumber();
        boolean boolean13 = reservationData0.addReservation(reservation8);
        Data.ReservationData reservationData14 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList15 = reservationData14.getAllReservations();
        java.util.List<Business.Reservation> reservationList16 = reservationData14.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) 'a', localDate19, localDate20, (double) (byte) -1);
        boolean boolean23 = reservationData14.addReservation(reservation22);
        boolean boolean24 = reservationData0.addReservation(reservation22);
        java.util.List<Business.Reservation> reservationList25 = reservationData0.getAllReservations();
        Business.Reservation reservation26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = reservationData0.addReservation(reservation26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Business.Reservation.getRoomNumber()\" because \"newReservation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(reservationList25);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", (int) (byte) -1, localDate14, localDate15, (double) '4');
        java.time.LocalDate localDate18 = reservation17.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = reservationData0.addReservation(reservation17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, 1.0d);
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        java.time.LocalDate localDate10 = reservation6.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation6.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.time.LocalDate localDate13 = null;
        java.time.LocalDate localDate14 = null;
        Business.Reservation reservation16 = new Business.Reservation("hi!", (int) 'a', localDate13, localDate14, (double) (byte) -1);
        int int17 = reservation16.getRoomNumber();
        java.lang.String str18 = reservation16.getGuestName();
        boolean boolean19 = reservationData0.addReservation(reservation16);
        Data.ReservationData reservationData20 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList21 = reservationData20.getAllReservations();
        java.time.LocalDate localDate24 = null;
        java.time.LocalDate localDate25 = null;
        Business.Reservation reservation27 = new Business.Reservation("hi!", (int) (short) -1, localDate24, localDate25, (double) 1);
        java.lang.String str28 = reservation27.getGuestName();
        boolean boolean29 = reservationData20.addReservation(reservation27);
        java.time.LocalDate localDate30 = reservation27.getCheckInDate();
        java.time.LocalDate localDate31 = reservation27.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = reservationData0.addReservation(reservation27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertNull(localDate31);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 52, localDate2, localDate3, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", 97, localDate14, localDate15, (double) 0L);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass21 = reservationList20.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 0, localDate2, localDate3, (double) 10);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 1, localDate2, localDate3, 0.0d);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        java.time.LocalDate localDate11 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) (short) -1, localDate12, localDate13, (double) 1);
        java.lang.String str16 = reservation15.getGuestName();
        int int17 = reservation15.getRoomNumber();
        java.time.LocalDate localDate18 = reservation15.getCheckOutDate();
        int int19 = reservation15.getRoomNumber();
        java.lang.String str20 = reservation15.getGuestName();
        int int21 = reservation15.getRoomNumber();
        java.lang.String str22 = reservation15.getGuestName();
        boolean boolean23 = reservationData0.addReservation(reservation15);
        java.util.List<Business.Reservation> reservationList24 = reservationData0.getAllReservations();
        Data.ReservationData reservationData25 = new Data.ReservationData();
        java.time.LocalDate localDate28 = null;
        java.time.LocalDate localDate29 = null;
        Business.Reservation reservation31 = new Business.Reservation("hi!", (int) (short) -1, localDate28, localDate29, (double) 1);
        java.lang.String str32 = reservation31.getGuestName();
        boolean boolean33 = reservationData25.addReservation(reservation31);
        java.lang.String str34 = reservation31.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = reservationData0.addReservation(reservation31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.util.List<Business.Reservation> reservationList12 = reservationData0.getAllReservations();
        Data.ReservationData reservationData13 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList14 = reservationData13.getAllReservations();
        java.util.List<Business.Reservation> reservationList15 = reservationData13.getAllReservations();
        java.util.List<Business.Reservation> reservationList16 = reservationData13.getAllReservations();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) (short) -1, localDate19, localDate20, (double) 1);
        java.time.LocalDate localDate23 = reservation22.getCheckOutDate();
        boolean boolean24 = reservationData13.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("", (int) '4', localDate27, localDate28, (double) 1.0f);
        java.lang.String str31 = reservation30.getGuestName();
        boolean boolean32 = reservationData13.addReservation(reservation30);
        java.time.LocalDate localDate33 = reservation30.getCheckOutDate();
        boolean boolean34 = reservationData0.addReservation(reservation30);
        java.util.List<Business.Reservation> reservationList35 = reservationData0.getAllReservations();
        java.time.LocalDate localDate38 = null;
        java.time.LocalDate localDate39 = null;
        Business.Reservation reservation41 = new Business.Reservation("hi!", (int) (short) -1, localDate38, localDate39, (double) 1);
        java.time.LocalDate localDate42 = reservation41.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = reservationData0.addReservation(reservation41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(reservationList35);
        org.junit.Assert.assertNull(localDate42);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 0, localDate2, localDate3, (double) (byte) -1);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, (double) 0L);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList11 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList12 = reservationData0.getAllReservations();
        java.time.LocalDate localDate15 = null;
        java.time.LocalDate localDate16 = null;
        Business.Reservation reservation18 = new Business.Reservation("hi!", 1, localDate15, localDate16, 1.0d);
        boolean boolean19 = reservationData0.addReservation(reservation18);
        Data.ReservationData reservationData20 = new Data.ReservationData();
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("hi!", (int) (short) -1, localDate23, localDate24, (double) 1);
        java.lang.String str27 = reservation26.getGuestName();
        boolean boolean28 = reservationData20.addReservation(reservation26);
        java.lang.String str29 = reservation26.getGuestName();
        int int30 = reservation26.getRoomNumber();
        java.lang.String str31 = reservation26.getGuestName();
        java.time.LocalDate localDate32 = reservation26.getCheckInDate();
        java.lang.String str33 = reservation26.getGuestName();
        java.time.LocalDate localDate34 = reservation26.getCheckInDate();
        int int35 = reservation26.getRoomNumber();
        java.time.LocalDate localDate36 = reservation26.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = reservationData0.addReservation(reservation26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(localDate36);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", 1, localDate12, localDate13, (double) (-1));
        java.time.LocalDate localDate16 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate17 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate18 = reservation15.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation15);
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass21 = reservationList20.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, (double) 100.0f);
        int int6 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, (double) '4');
        java.lang.String str6 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (-1.0f));
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) (-1));
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.String str7 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (-1.0f));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 35, localDate2, localDate3, (double) 97);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 100, localDate2, localDate3, (double) 100);
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.lang.String str9 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.String str8 = reservation5.getGuestName();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 52, localDate2, localDate3, (double) 10);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, (double) 100.0f);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 10, localDate2, localDate3, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.lang.String str9 = reservation5.getGuestName();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (short) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 1, localDate2, localDate3, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList3 = reservationData0.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData0.addReservation(reservation9);
        java.util.List<Business.Reservation> reservationList12 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList13 = reservationData0.getAllReservations();
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        Business.Reservation reservation19 = new Business.Reservation("", (int) '#', localDate16, localDate17, 0.0d);
        int int20 = reservation19.getRoomNumber();
        int int21 = reservation19.getRoomNumber();
        boolean boolean22 = reservationData0.addReservation(reservation19);
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        Business.Reservation reservation28 = new Business.Reservation("hi!", (int) (byte) 0, localDate25, localDate26, (double) 0L);
        boolean boolean29 = reservationData0.addReservation(reservation28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = reservation28.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) (short) -1, localDate12, localDate13, (double) 1);
        java.lang.String str16 = reservation15.getGuestName();
        int int17 = reservation15.getRoomNumber();
        java.time.LocalDate localDate18 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate19 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate20 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate21 = reservation15.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = reservationData0.addReservation(reservation15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        java.lang.String str9 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        java.lang.String str11 = reservation5.getGuestName();
        java.time.LocalDate localDate12 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) 'a', localDate14, localDate15, (double) (byte) -1);
        boolean boolean18 = reservationData2.addReservation(reservation17);
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass21 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) (byte) 100);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckOutDate();
        java.lang.Class<?> wildcardClass11 = reservation7.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        Data.ReservationData reservationData3 = new Data.ReservationData();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.lang.String str10 = reservation9.getGuestName();
        boolean boolean11 = reservationData3.addReservation(reservation9);
        java.lang.String str12 = reservation9.getGuestName();
        int int13 = reservation9.getRoomNumber();
        int int14 = reservation9.getRoomNumber();
        boolean boolean15 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("hi!", (int) (short) 1, localDate18, localDate19, 0.0d);
        int int22 = reservation21.getRoomNumber();
        boolean boolean23 = reservationData0.addReservation(reservation21);
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        Business.Reservation reservation29 = new Business.Reservation("hi!", (int) ' ', localDate26, localDate27, (double) (short) 10);
        boolean boolean30 = reservationData0.addReservation(reservation29);
        java.lang.Class<?> wildcardClass31 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 52, localDate2, localDate3, 100.0d);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.lang.String str8 = reservation6.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.util.List<Business.Reservation> reservationList12 = reservationData0.getAllReservations();
        Data.ReservationData reservationData13 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList14 = reservationData13.getAllReservations();
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("hi!", (int) (short) -1, localDate18, localDate19, (double) 1);
        java.lang.String str22 = reservation21.getGuestName();
        boolean boolean23 = reservationData15.addReservation(reservation21);
        java.time.LocalDate localDate24 = reservation21.getCheckInDate();
        int int25 = reservation21.getRoomNumber();
        boolean boolean26 = reservationData13.addReservation(reservation21);
        java.util.List<Business.Reservation> reservationList27 = reservationData13.getAllReservations();
        Data.ReservationData reservationData28 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList29 = reservationData28.getAllReservations();
        java.util.List<Business.Reservation> reservationList30 = reservationData28.getAllReservations();
        Data.ReservationData reservationData31 = new Data.ReservationData();
        java.time.LocalDate localDate34 = null;
        java.time.LocalDate localDate35 = null;
        Business.Reservation reservation37 = new Business.Reservation("hi!", (int) (short) -1, localDate34, localDate35, (double) 1);
        java.lang.String str38 = reservation37.getGuestName();
        boolean boolean39 = reservationData31.addReservation(reservation37);
        java.time.LocalDate localDate40 = reservation37.getCheckInDate();
        boolean boolean41 = reservationData28.addReservation(reservation37);
        java.time.LocalDate localDate44 = null;
        java.time.LocalDate localDate45 = null;
        Business.Reservation reservation47 = new Business.Reservation("hi!", 97, localDate44, localDate45, (double) 0L);
        java.time.LocalDate localDate48 = reservation47.getCheckOutDate();
        java.lang.String str49 = reservation47.getGuestName();
        boolean boolean50 = reservationData28.addReservation(reservation47);
        java.util.List<Business.Reservation> reservationList51 = reservationData28.getAllReservations();
        java.time.LocalDate localDate54 = null;
        java.time.LocalDate localDate55 = null;
        Business.Reservation reservation57 = new Business.Reservation("", (int) '#', localDate54, localDate55, (double) (short) 100);
        boolean boolean58 = reservationData28.addReservation(reservation57);
        boolean boolean59 = reservationData13.addReservation(reservation57);
        boolean boolean60 = reservationData0.addReservation(reservation57);
        int int61 = reservation57.getRoomNumber();
        java.time.LocalDate localDate62 = reservation57.getCheckInDate();
        java.lang.String str63 = reservation57.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(reservationList27);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(localDate48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(reservationList51);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 35 + "'", int61 == 35);
        org.junit.Assert.assertNull(localDate62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (-1), localDate2, localDate3, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) (byte) 0, localDate12, localDate13, (-1.0d));
        boolean boolean16 = reservationData0.addReservation(reservation15);
        Business.Reservation reservation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = reservationData0.addReservation(reservation17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Business.Reservation.getRoomNumber()\" because \"newReservation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckInDate();
        java.lang.String str13 = reservation6.getGuestName();
        java.time.LocalDate localDate14 = reservation6.getCheckInDate();
        int int15 = reservation6.getRoomNumber();
        java.time.LocalDate localDate16 = reservation6.getCheckInDate();
        int int17 = reservation6.getRoomNumber();
        java.lang.String str18 = reservation6.getGuestName();
        int int19 = reservation6.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList3 = reservationData2.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData2.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckInDate();
        boolean boolean14 = reservationData0.addReservation(reservation9);
        java.util.List<Business.Reservation> reservationList15 = reservationData0.getAllReservations();
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("", 1, localDate18, localDate19, (double) (-1));
        boolean boolean22 = reservationData0.addReservation(reservation21);
        java.time.LocalDate localDate23 = reservation21.getCheckInDate();
        int int24 = reservation21.getRoomNumber();
        int int25 = reservation21.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = reservation21.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        Data.ReservationData reservationData10 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList11 = reservationData10.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) (short) -1, localDate14, localDate15, (double) 1);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData10.addReservation(reservation17);
        java.time.LocalDate localDate20 = reservation17.getCheckInDate();
        java.time.LocalDate localDate21 = reservation17.getCheckOutDate();
        boolean boolean22 = reservationData0.addReservation(reservation17);
        java.util.List<Business.Reservation> reservationList23 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList24 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass25 = reservationData0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) (byte) 0, localDate12, localDate13, (-1.0d));
        boolean boolean16 = reservationData0.addReservation(reservation15);
        Data.ReservationData reservationData17 = new Data.ReservationData();
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        Business.Reservation reservation23 = new Business.Reservation("hi!", (int) (short) -1, localDate20, localDate21, (double) 1);
        java.lang.String str24 = reservation23.getGuestName();
        boolean boolean25 = reservationData17.addReservation(reservation23);
        java.time.LocalDate localDate26 = reservation23.getCheckInDate();
        int int27 = reservation23.getRoomNumber();
        java.time.LocalDate localDate28 = reservation23.getCheckInDate();
        int int29 = reservation23.getRoomNumber();
        boolean boolean30 = reservationData0.addReservation(reservation23);
        java.time.LocalDate localDate33 = null;
        java.time.LocalDate localDate34 = null;
        Business.Reservation reservation36 = new Business.Reservation("hi!", (int) (byte) 10, localDate33, localDate34, (double) (byte) 10);
        java.lang.String str37 = reservation36.getGuestName();
        boolean boolean38 = reservationData0.addReservation(reservation36);
        // The following exception was thrown during execution in test generation
        try {
            double double39 = reservation36.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

