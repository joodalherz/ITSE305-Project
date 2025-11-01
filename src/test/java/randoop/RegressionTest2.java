package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        java.time.LocalDate localDate15 = null;
        java.time.LocalDate localDate16 = null;
        Business.Reservation reservation18 = new Business.Reservation("hi!", (int) (short) 1, localDate15, localDate16, 0.0d);
        boolean boolean19 = reservationData0.addReservation(reservation18);
        int int20 = reservation18.getRoomNumber();
        int int21 = reservation18.getRoomNumber();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        int int8 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        java.util.List<Business.Reservation> reservationList18 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList19 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        Data.ReservationData reservationData21 = new Data.ReservationData();
        java.time.LocalDate localDate24 = null;
        java.time.LocalDate localDate25 = null;
        Business.Reservation reservation27 = new Business.Reservation("hi!", (int) (short) -1, localDate24, localDate25, (double) 1);
        java.lang.String str28 = reservation27.getGuestName();
        boolean boolean29 = reservationData21.addReservation(reservation27);
        java.lang.String str30 = reservation27.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = reservationData0.addReservation(reservation27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        java.time.LocalDate localDate16 = reservation7.getCheckInDate();
        java.time.LocalDate localDate17 = reservation7.getCheckInDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (-1.0f));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        java.lang.String str9 = reservation5.getGuestName();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 100, localDate2, localDate3, (double) 35);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        java.util.List<Business.Reservation> reservationList21 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList22 = reservationData0.getAllReservations();
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        Business.Reservation reservation28 = new Business.Reservation("hi!", (int) (byte) 10, localDate25, localDate26, 10.0d);
        java.lang.String str29 = reservation28.getGuestName();
        java.time.LocalDate localDate30 = reservation28.getCheckOutDate();
        boolean boolean31 = reservationData0.addReservation(reservation28);
        Data.ReservationData reservationData32 = new Data.ReservationData();
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("hi!", (int) (short) -1, localDate35, localDate36, (double) 1);
        java.lang.String str39 = reservation38.getGuestName();
        boolean boolean40 = reservationData32.addReservation(reservation38);
        java.lang.String str41 = reservation38.getGuestName();
        int int42 = reservation38.getRoomNumber();
        java.lang.String str43 = reservation38.getGuestName();
        java.time.LocalDate localDate44 = reservation38.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = reservationData0.addReservation(reservation38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
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
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNull(localDate44);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        java.lang.Class<?> wildcardClass20 = reservationList19.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        int int8 = reservation5.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        java.util.List<Business.Reservation> reservationList35 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass36 = reservationList35.getClass();
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
        org.junit.Assert.assertNotNull(reservationList35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) -1, localDate2, localDate3, (double) '4');
        int int6 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.lang.String str9 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        int int9 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckOutDate();
        java.time.LocalDate localDate10 = reservation6.getCheckInDate();
        int int11 = reservation6.getRoomNumber();
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
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 35, localDate2, localDate3, (double) (short) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", 97, localDate12, localDate13, (double) (byte) -1);
        java.time.LocalDate localDate16 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate17 = reservation15.getCheckOutDate();
        boolean boolean18 = reservationData0.addReservation(reservation15);
        java.util.List<Business.Reservation> reservationList19 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass20 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        java.time.LocalDate localDate23 = reservation19.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = reservation19.calculateTotalPrice();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.lang.String str8 = reservation5.getGuestName();
        java.lang.String str9 = reservation5.getGuestName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        java.lang.String str17 = reservation7.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = reservation7.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        Data.ReservationData reservationData24 = new Data.ReservationData();
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) (short) -1, localDate27, localDate28, (double) 1);
        java.lang.String str31 = reservation30.getGuestName();
        boolean boolean32 = reservationData24.addReservation(reservation30);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = reservationData0.addReservation(reservation30);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, 1.0d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        int int8 = reservation6.getRoomNumber();
        boolean boolean9 = reservationData0.addReservation(reservation6);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        Business.Reservation reservation28 = new Business.Reservation("hi!", (int) 'a', localDate25, localDate26, (double) (byte) -1);
        java.time.LocalDate localDate29 = reservation28.getCheckOutDate();
        int int30 = reservation28.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = reservationData0.addReservation(reservation28);
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
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (-1), localDate2, localDate3, (double) 10);
        int int6 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 10, localDate2, localDate3, (double) 10L);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) '4');
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        java.time.LocalDate localDate63 = reservation57.getCheckOutDate();
        java.time.LocalDate localDate64 = reservation57.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate63);
        org.junit.Assert.assertNull(localDate64);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) (short) 1);
        int int6 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        int int8 = reservation6.getRoomNumber();
        boolean boolean9 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) (byte) -1);
        java.time.LocalDate localDate16 = reservation15.getCheckOutDate();
        int int17 = reservation15.getRoomNumber();
        java.time.LocalDate localDate18 = reservation15.getCheckInDate();
        java.time.LocalDate localDate19 = reservation15.getCheckInDate();
        java.time.LocalDate localDate20 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate21 = reservation15.getCheckInDate();
        boolean boolean22 = reservationData0.addReservation(reservation15);
        java.lang.Class<?> wildcardClass23 = reservation15.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 10, localDate2, localDate3, (double) 'a');
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        java.time.LocalDate localDate33 = reservation30.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double34 = reservation30.calculateTotalPrice();
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
        org.junit.Assert.assertNull(localDate33);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        Business.Reservation reservation29 = new Business.Reservation("", 0, localDate26, localDate27, (double) 10.0f);
        java.time.LocalDate localDate30 = reservation29.getCheckOutDate();
        boolean boolean31 = reservationData0.addReservation(reservation29);
        java.time.LocalDate localDate32 = reservation29.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double33 = reservation29.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
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
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(localDate32);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '#', localDate2, localDate3, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 52, localDate2, localDate3, (double) 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation5.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 0, localDate2, localDate3, 0.0d);
        java.lang.String str6 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.util.List<Business.Reservation> reservationList31 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList32 = reservationData0.getAllReservations();
        Business.Reservation reservation33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = reservationData0.addReservation(reservation33);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationList32);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        java.util.List<Business.Reservation> reservationList22 = reservationData0.getAllReservations();
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        Business.Reservation reservation28 = new Business.Reservation("hi!", 52, localDate25, localDate26, (double) (byte) 1);
        boolean boolean29 = reservationData0.addReservation(reservation28);
        java.time.LocalDate localDate30 = reservation28.getCheckInDate();
        java.lang.Class<?> wildcardClass31 = reservation28.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
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
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        int int9 = reservation8.getRoomNumber();
        java.time.LocalDate localDate10 = reservation8.getCheckInDate();
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", 52, localDate14, localDate15, (double) (short) -1);
        boolean boolean18 = reservationData0.addReservation(reservation17);
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("", (int) (short) -1, localDate21, localDate22, 0.0d);
        java.time.LocalDate localDate25 = reservation24.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = reservationData0.addReservation(reservation24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(localDate25);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, (double) (short) 1);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 35, localDate2, localDate3, (double) 1L);
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        java.time.LocalDate localDate33 = reservation30.getCheckInDate();
        java.lang.Class<?> wildcardClass34 = reservation30.getClass();
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
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (-1.0f));
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.lang.String str9 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.lang.String str8 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        Business.Reservation reservation29 = new Business.Reservation("", 97, localDate26, localDate27, 1.0d);
        java.time.LocalDate localDate30 = reservation29.getCheckInDate();
        java.time.LocalDate localDate31 = reservation29.getCheckOutDate();
        int int32 = reservation29.getRoomNumber();
        boolean boolean33 = reservationData0.addReservation(reservation29);
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("", 1, localDate36, localDate37, (double) (-1));
        java.time.LocalDate localDate40 = reservation39.getCheckOutDate();
        java.time.LocalDate localDate41 = reservation39.getCheckOutDate();
        java.time.LocalDate localDate42 = reservation39.getCheckOutDate();
        int int43 = reservation39.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = reservationData0.addReservation(reservation39);
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
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertNull(localDate42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        int int11 = reservation5.getRoomNumber();
        int int12 = reservation5.getRoomNumber();
        java.time.LocalDate localDate13 = reservation5.getCheckInDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) '#');
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        java.util.List<Business.Reservation> reservationList24 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList25 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList26 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList27 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass28 = reservationData0.getClass();
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
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNotNull(reservationList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, (double) 0L);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        java.time.LocalDate localDate16 = reservation8.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = reservation8.toString();
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
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        // The following exception was thrown during execution in test generation
        try {
            double double19 = reservation6.calculateTotalPrice();
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
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", 97, localDate12, localDate13, (double) (byte) -1);
        java.time.LocalDate localDate16 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate17 = reservation15.getCheckOutDate();
        boolean boolean18 = reservationData0.addReservation(reservation15);
        int int19 = reservation15.getRoomNumber();
        java.lang.Class<?> wildcardClass20 = reservation15.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("", (int) (short) 0, localDate23, localDate24, 0.0d);
        java.lang.String str27 = reservation26.getGuestName();
        boolean boolean28 = reservationData0.addReservation(reservation26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = reservation26.toString();
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
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        java.util.List<Business.Reservation> reservationList22 = reservationData21.getAllReservations();
        java.util.List<Business.Reservation> reservationList23 = reservationData21.getAllReservations();
        Data.ReservationData reservationData24 = new Data.ReservationData();
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) (short) -1, localDate27, localDate28, (double) 1);
        java.lang.String str31 = reservation30.getGuestName();
        boolean boolean32 = reservationData24.addReservation(reservation30);
        java.time.LocalDate localDate33 = reservation30.getCheckInDate();
        boolean boolean34 = reservationData21.addReservation(reservation30);
        java.time.LocalDate localDate37 = null;
        java.time.LocalDate localDate38 = null;
        Business.Reservation reservation40 = new Business.Reservation("hi!", 97, localDate37, localDate38, (double) 0L);
        java.time.LocalDate localDate41 = reservation40.getCheckOutDate();
        java.lang.String str42 = reservation40.getGuestName();
        boolean boolean43 = reservationData21.addReservation(reservation40);
        java.time.LocalDate localDate44 = reservation40.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = reservationData0.addReservation(reservation40);
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
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(localDate44);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.time.LocalDate localDate13 = null;
        java.time.LocalDate localDate14 = null;
        Business.Reservation reservation16 = new Business.Reservation("", (int) (byte) 0, localDate13, localDate14, (double) (short) 10);
        boolean boolean17 = reservationData0.addReservation(reservation16);
        java.time.LocalDate localDate18 = reservation16.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = reservation16.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) 52);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, (double) (short) 10);
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        java.lang.String str17 = reservation7.getGuestName();
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
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        int int7 = reservation5.getRoomNumber();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.lang.String str9 = reservation5.getGuestName();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        java.util.List<Business.Reservation> reservationList24 = reservationData0.getAllReservations();
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
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList25);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        Business.Reservation reservation20 = new Business.Reservation("hi!", 100, localDate17, localDate18, (double) (short) 1);
        boolean boolean21 = reservationData0.addReservation(reservation20);
        Data.ReservationData reservationData22 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList23 = reservationData22.getAllReservations();
        java.util.List<Business.Reservation> reservationList24 = reservationData22.getAllReservations();
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) 'a', localDate27, localDate28, (double) (byte) -1);
        boolean boolean31 = reservationData22.addReservation(reservation30);
        java.time.LocalDate localDate32 = reservation30.getCheckInDate();
        java.time.LocalDate localDate33 = reservation30.getCheckOutDate();
        java.time.LocalDate localDate34 = reservation30.getCheckInDate();
        boolean boolean35 = reservationData0.addReservation(reservation30);
        // The following exception was thrown during execution in test generation
        try {
            double double36 = reservation30.calculateTotalPrice();
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
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 1, localDate2, localDate3, (double) (short) 0);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        java.util.List<Business.Reservation> reservationList36 = reservationData0.getAllReservations();
        java.time.LocalDate localDate39 = null;
        java.time.LocalDate localDate40 = null;
        Business.Reservation reservation42 = new Business.Reservation("hi!", (int) (byte) 100, localDate39, localDate40, (double) (short) 100);
        int int43 = reservation42.getRoomNumber();
        java.lang.String str44 = reservation42.getGuestName();
        boolean boolean45 = reservationData0.addReservation(reservation42);
        Data.ReservationData reservationData46 = new Data.ReservationData();
        java.time.LocalDate localDate49 = null;
        java.time.LocalDate localDate50 = null;
        Business.Reservation reservation52 = new Business.Reservation("hi!", (int) (short) -1, localDate49, localDate50, (double) 1);
        java.lang.String str53 = reservation52.getGuestName();
        boolean boolean54 = reservationData46.addReservation(reservation52);
        java.time.LocalDate localDate55 = reservation52.getCheckInDate();
        int int56 = reservation52.getRoomNumber();
        java.time.LocalDate localDate57 = reservation52.getCheckInDate();
        java.time.LocalDate localDate58 = reservation52.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = reservationData0.addReservation(reservation52);
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
        org.junit.Assert.assertNotNull(reservationList36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(localDate55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(localDate57);
        org.junit.Assert.assertNull(localDate58);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 100, localDate2, localDate3, (double) 32);
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        java.lang.String str17 = reservation7.getGuestName();
        int int18 = reservation7.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = reservation7.calculateTotalPrice();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        java.time.LocalDate localDate14 = reservation7.getCheckOutDate();
        java.lang.String str15 = reservation7.getGuestName();
        java.lang.Class<?> wildcardClass16 = reservation7.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        Business.Reservation reservation22 = new Business.Reservation("hi!", (int) '4', localDate19, localDate20, (double) (-1.0f));
        int int23 = reservation22.getRoomNumber();
        boolean boolean24 = reservationData0.addReservation(reservation22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("", (int) (short) 0, localDate27, localDate28, 0.0d);
        java.lang.String str31 = reservation30.getGuestName();
        int int32 = reservation30.getRoomNumber();
        int int33 = reservation30.getRoomNumber();
        java.time.LocalDate localDate34 = reservation30.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = reservationData0.addReservation(reservation30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(localDate34);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (-1), localDate12, localDate13, (double) 1);
        boolean boolean16 = reservationData0.addReservation(reservation15);
        java.lang.Class<?> wildcardClass17 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 52, localDate2, localDate3, (double) 10);
        int int6 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, (double) 10.0f);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("", (int) (short) 0, localDate23, localDate24, 0.0d);
        java.lang.String str27 = reservation26.getGuestName();
        boolean boolean28 = reservationData0.addReservation(reservation26);
        java.util.List<Business.Reservation> reservationList29 = reservationData0.getAllReservations();
        java.time.LocalDate localDate32 = null;
        java.time.LocalDate localDate33 = null;
        Business.Reservation reservation35 = new Business.Reservation("hi!", (int) 'a', localDate32, localDate33, (double) (byte) -1);
        int int36 = reservation35.getRoomNumber();
        java.lang.String str37 = reservation35.getGuestName();
        java.time.LocalDate localDate38 = reservation35.getCheckInDate();
        boolean boolean39 = reservationData0.addReservation(reservation35);
        java.util.List<Business.Reservation> reservationList40 = reservationData0.getAllReservations();
        java.time.LocalDate localDate43 = null;
        java.time.LocalDate localDate44 = null;
        Business.Reservation reservation46 = new Business.Reservation("hi!", (int) (short) 10, localDate43, localDate44, (double) (short) 1);
        java.time.LocalDate localDate47 = reservation46.getCheckInDate();
        java.time.LocalDate localDate48 = reservation46.getCheckInDate();
        boolean boolean49 = reservationData0.addReservation(reservation46);
        java.lang.Class<?> wildcardClass50 = reservationData0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNull(localDate38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(reservationList40);
        org.junit.Assert.assertNull(localDate47);
        org.junit.Assert.assertNull(localDate48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        java.time.LocalDate localDate11 = reservation5.getCheckOutDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        int int16 = reservation6.getRoomNumber();
        java.time.LocalDate localDate17 = reservation6.getCheckOutDate();
        int int18 = reservation6.getRoomNumber();
        java.lang.Class<?> wildcardClass19 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        java.util.List<Business.Reservation> reservationList40 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList41 = reservationData0.getAllReservations();
        Business.Reservation reservation42 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = reservationData0.addReservation(reservation42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Business.Reservation.getRoomNumber()\" because \"newReservation\" is null");
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
        org.junit.Assert.assertNotNull(reservationList40);
        org.junit.Assert.assertNotNull(reservationList41);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.time.LocalDate localDate11 = null;
        java.time.LocalDate localDate12 = null;
        Business.Reservation reservation14 = new Business.Reservation("hi!", (int) (byte) 0, localDate11, localDate12, (-1.0d));
        boolean boolean15 = reservationData0.addReservation(reservation14);
        java.util.List<Business.Reservation> reservationList16 = reservationData0.getAllReservations();
        Data.ReservationData reservationData17 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList18 = reservationData17.getAllReservations();
        Data.ReservationData reservationData19 = new Data.ReservationData();
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) (short) -1, localDate22, localDate23, (double) 1);
        java.lang.String str26 = reservation25.getGuestName();
        boolean boolean27 = reservationData19.addReservation(reservation25);
        java.time.LocalDate localDate28 = reservation25.getCheckInDate();
        int int29 = reservation25.getRoomNumber();
        boolean boolean30 = reservationData17.addReservation(reservation25);
        java.util.List<Business.Reservation> reservationList31 = reservationData17.getAllReservations();
        Data.ReservationData reservationData32 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList33 = reservationData32.getAllReservations();
        java.util.List<Business.Reservation> reservationList34 = reservationData32.getAllReservations();
        Data.ReservationData reservationData35 = new Data.ReservationData();
        java.time.LocalDate localDate38 = null;
        java.time.LocalDate localDate39 = null;
        Business.Reservation reservation41 = new Business.Reservation("hi!", (int) (short) -1, localDate38, localDate39, (double) 1);
        java.lang.String str42 = reservation41.getGuestName();
        boolean boolean43 = reservationData35.addReservation(reservation41);
        java.time.LocalDate localDate44 = reservation41.getCheckInDate();
        boolean boolean45 = reservationData32.addReservation(reservation41);
        java.time.LocalDate localDate48 = null;
        java.time.LocalDate localDate49 = null;
        Business.Reservation reservation51 = new Business.Reservation("hi!", 97, localDate48, localDate49, (double) 0L);
        java.time.LocalDate localDate52 = reservation51.getCheckOutDate();
        java.lang.String str53 = reservation51.getGuestName();
        boolean boolean54 = reservationData32.addReservation(reservation51);
        java.util.List<Business.Reservation> reservationList55 = reservationData32.getAllReservations();
        java.time.LocalDate localDate58 = null;
        java.time.LocalDate localDate59 = null;
        Business.Reservation reservation61 = new Business.Reservation("", (int) '#', localDate58, localDate59, (double) (short) 100);
        boolean boolean62 = reservationData32.addReservation(reservation61);
        boolean boolean63 = reservationData17.addReservation(reservation61);
        java.time.LocalDate localDate64 = reservation61.getCheckOutDate();
        java.lang.String str65 = reservation61.getGuestName();
        boolean boolean66 = reservationData0.addReservation(reservation61);
        // The following exception was thrown during execution in test generation
        try {
            double double67 = reservation61.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNotNull(reservationList34);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(localDate44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(localDate52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(reservationList55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(localDate64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        int int8 = reservation6.getRoomNumber();
        boolean boolean9 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) 'a', localDate12, localDate13, (double) (byte) -1);
        java.time.LocalDate localDate16 = reservation15.getCheckOutDate();
        int int17 = reservation15.getRoomNumber();
        java.time.LocalDate localDate18 = reservation15.getCheckInDate();
        java.time.LocalDate localDate19 = reservation15.getCheckInDate();
        java.time.LocalDate localDate20 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate21 = reservation15.getCheckInDate();
        boolean boolean22 = reservationData0.addReservation(reservation15);
        java.util.List<Business.Reservation> reservationList23 = reservationData0.getAllReservations();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        java.time.LocalDate localDate11 = reservation5.getCheckOutDate();
        int int12 = reservation5.getRoomNumber();
        java.time.LocalDate localDate13 = reservation5.getCheckInDate();
        java.lang.String str14 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = reservation5.toString();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        java.time.LocalDate localDate20 = reservation17.getCheckOutDate();
        int int21 = reservation17.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = reservation17.calculateTotalPrice();
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
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        Data.ReservationData reservationData20 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList21 = reservationData20.getAllReservations();
        Data.ReservationData reservationData22 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList23 = reservationData22.getAllReservations();
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        Business.Reservation reservation29 = new Business.Reservation("hi!", (int) (short) -1, localDate26, localDate27, (double) 1);
        java.time.LocalDate localDate30 = reservation29.getCheckOutDate();
        boolean boolean31 = reservationData22.addReservation(reservation29);
        java.time.LocalDate localDate32 = reservation29.getCheckOutDate();
        java.time.LocalDate localDate33 = reservation29.getCheckInDate();
        boolean boolean34 = reservationData20.addReservation(reservation29);
        int int35 = reservation29.getRoomNumber();
        int int36 = reservation29.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = reservationData0.addReservation(reservation29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
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
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 0, localDate2, localDate3, (double) 52);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList11 = reservationData0.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", (int) '#', localDate14, localDate15, (double) 100L);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("", (int) ' ', localDate22, localDate23, 0.0d);
        boolean boolean26 = reservationData0.addReservation(reservation25);
        java.lang.Class<?> wildcardClass27 = reservation25.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
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
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 100, localDate2, localDate3, (double) 10.0f);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 100, localDate2, localDate3, (double) (short) 0);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
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
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 1, localDate2, localDate3, (double) (-1.0f));
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
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        java.time.LocalDate localDate11 = reservation5.getCheckOutDate();
        int int12 = reservation5.getRoomNumber();
        java.time.LocalDate localDate13 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = reservation5.calculateTotalPrice();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        java.lang.String str17 = reservation7.getGuestName();
        int int18 = reservation7.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = reservation7.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, (double) 10.0f);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.String str7 = reservation5.getGuestName();
        int int8 = reservation5.getRoomNumber();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        int int13 = reservation8.getRoomNumber();
        java.lang.Class<?> wildcardClass14 = reservation8.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate10 = reservation8.getCheckInDate();
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        java.time.LocalDate localDate12 = reservation8.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = reservation8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        Business.Reservation reservation28 = new Business.Reservation("", (int) (byte) 1, localDate25, localDate26, (double) 0L);
        java.lang.String str29 = reservation28.getGuestName();
        boolean boolean30 = reservationData0.addReservation(reservation28);
        java.util.List<Business.Reservation> reservationList31 = reservationData0.getAllReservations();
        Data.ReservationData reservationData32 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList33 = reservationData32.getAllReservations();
        Data.ReservationData reservationData34 = new Data.ReservationData();
        java.time.LocalDate localDate37 = null;
        java.time.LocalDate localDate38 = null;
        Business.Reservation reservation40 = new Business.Reservation("hi!", (int) (short) -1, localDate37, localDate38, (double) 1);
        java.lang.String str41 = reservation40.getGuestName();
        boolean boolean42 = reservationData34.addReservation(reservation40);
        java.time.LocalDate localDate43 = reservation40.getCheckInDate();
        int int44 = reservation40.getRoomNumber();
        boolean boolean45 = reservationData32.addReservation(reservation40);
        java.time.LocalDate localDate46 = reservation40.getCheckInDate();
        java.time.LocalDate localDate47 = reservation40.getCheckOutDate();
        java.time.LocalDate localDate48 = reservation40.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = reservationData0.addReservation(reservation40);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(localDate43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(localDate46);
        org.junit.Assert.assertNull(localDate47);
        org.junit.Assert.assertNull(localDate48);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.String str7 = reservation5.getGuestName();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList11 = reservationData0.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", (int) '#', localDate14, localDate15, (double) 100L);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("", (int) ' ', localDate22, localDate23, 0.0d);
        boolean boolean26 = reservationData0.addReservation(reservation25);
        java.time.LocalDate localDate29 = null;
        java.time.LocalDate localDate30 = null;
        Business.Reservation reservation32 = new Business.Reservation("hi!", 32, localDate29, localDate30, (double) '4');
        int int33 = reservation32.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = reservationData0.addReservation(reservation32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.lang.String str8 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        java.time.LocalDate localDate15 = reservation6.getCheckOutDate();
        java.lang.String str16 = reservation6.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = reservation6.toString();
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
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 1, localDate2, localDate3, (double) (-1));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, 0.0d);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        java.time.LocalDate localDate15 = null;
        java.time.LocalDate localDate16 = null;
        Business.Reservation reservation18 = new Business.Reservation("hi!", (int) (short) 1, localDate15, localDate16, 0.0d);
        boolean boolean19 = reservationData0.addReservation(reservation18);
        int int20 = reservation18.getRoomNumber();
        java.lang.String str21 = reservation18.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("", (int) (short) -1, localDate27, localDate28, 0.0d);
        java.time.LocalDate localDate31 = reservation30.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = reservationData0.addReservation(reservation30);
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
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNull(localDate31);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 52, localDate2, localDate3, 1.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        int int9 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 10, localDate2, localDate3, (double) (short) -1);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 52, localDate2, localDate3, (double) (short) -1);
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
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
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
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 100, localDate2, localDate3, (double) (short) 0);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.util.List<Business.Reservation> reservationList17 = reservationData15.getAllReservations();
        Data.ReservationData reservationData18 = new Data.ReservationData();
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("hi!", (int) (short) -1, localDate21, localDate22, (double) 1);
        java.lang.String str25 = reservation24.getGuestName();
        boolean boolean26 = reservationData18.addReservation(reservation24);
        java.time.LocalDate localDate27 = reservation24.getCheckInDate();
        boolean boolean28 = reservationData15.addReservation(reservation24);
        java.time.LocalDate localDate31 = null;
        java.time.LocalDate localDate32 = null;
        Business.Reservation reservation34 = new Business.Reservation("hi!", 97, localDate31, localDate32, (double) 0L);
        java.time.LocalDate localDate35 = reservation34.getCheckOutDate();
        java.lang.String str36 = reservation34.getGuestName();
        boolean boolean37 = reservationData15.addReservation(reservation34);
        java.util.List<Business.Reservation> reservationList38 = reservationData15.getAllReservations();
        java.time.LocalDate localDate41 = null;
        java.time.LocalDate localDate42 = null;
        Business.Reservation reservation44 = new Business.Reservation("", (int) '#', localDate41, localDate42, (double) (short) 100);
        boolean boolean45 = reservationData15.addReservation(reservation44);
        boolean boolean46 = reservationData0.addReservation(reservation44);
        java.util.List<Business.Reservation> reservationList47 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList48 = reservationData0.getAllReservations();
        java.time.LocalDate localDate51 = null;
        java.time.LocalDate localDate52 = null;
        Business.Reservation reservation54 = new Business.Reservation("hi!", (int) 'a', localDate51, localDate52, (double) (byte) -1);
        int int55 = reservation54.getRoomNumber();
        int int56 = reservation54.getRoomNumber();
        java.time.LocalDate localDate57 = reservation54.getCheckOutDate();
        boolean boolean58 = reservationData0.addReservation(reservation54);
        java.time.LocalDate localDate61 = null;
        java.time.LocalDate localDate62 = null;
        Business.Reservation reservation64 = new Business.Reservation("", (int) (byte) -1, localDate61, localDate62, (double) '4');
        java.lang.String str65 = reservation64.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = reservationData0.addReservation(reservation64);
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
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(reservationList38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(reservationList47);
        org.junit.Assert.assertNotNull(reservationList48);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 97 + "'", int56 == 97);
        org.junit.Assert.assertNull(localDate57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate10 = reservation8.getCheckInDate();
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        java.lang.Class<?> wildcardClass12 = reservation8.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
            double double18 = reservation6.calculateTotalPrice();
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
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        java.util.List<Business.Reservation> reservationList21 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList22 = reservationData0.getAllReservations();
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        Business.Reservation reservation28 = new Business.Reservation("hi!", (int) (byte) 10, localDate25, localDate26, 10.0d);
        java.lang.String str29 = reservation28.getGuestName();
        java.time.LocalDate localDate30 = reservation28.getCheckOutDate();
        boolean boolean31 = reservationData0.addReservation(reservation28);
        int int32 = reservation28.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
            java.lang.String str24 = reservation14.toString();
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
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation5.getCheckInDate();
        int int12 = reservation5.getRoomNumber();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        java.util.List<Business.Reservation> reservationList21 = reservationData0.getAllReservations();
        java.time.LocalDate localDate24 = null;
        java.time.LocalDate localDate25 = null;
        Business.Reservation reservation27 = new Business.Reservation("", (int) (byte) 1, localDate24, localDate25, (double) 1L);
        java.time.LocalDate localDate28 = reservation27.getCheckOutDate();
        java.lang.String str29 = reservation27.getGuestName();
        boolean boolean30 = reservationData0.addReservation(reservation27);
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, (double) 100L);
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, (double) (byte) 10);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        java.lang.Class<?> wildcardClass20 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        Data.ReservationData reservationData18 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList19 = reservationData18.getAllReservations();
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) (short) -1, localDate22, localDate23, (double) 1);
        java.time.LocalDate localDate26 = reservation25.getCheckOutDate();
        boolean boolean27 = reservationData18.addReservation(reservation25);
        java.time.LocalDate localDate28 = reservation25.getCheckOutDate();
        java.time.LocalDate localDate29 = reservation25.getCheckOutDate();
        int int30 = reservation25.getRoomNumber();
        int int31 = reservation25.getRoomNumber();
        java.lang.String str32 = reservation25.getGuestName();
        int int33 = reservation25.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = reservationData0.addReservation(reservation25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, 0.0d);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, (double) 1.0f);
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        Business.Reservation reservation36 = new Business.Reservation("hi!", (int) (byte) 100, localDate33, localDate34, (double) (short) 100);
        int int37 = reservation36.getRoomNumber();
        java.lang.String str38 = reservation36.getGuestName();
        boolean boolean39 = reservationData0.addReservation(reservation36);
        java.lang.String str40 = reservation36.getGuestName();
        java.time.LocalDate localDate41 = reservation36.getCheckOutDate();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(localDate41);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) 10);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) (-1L));
        java.lang.String str6 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        java.time.LocalDate localDate37 = null;
        java.time.LocalDate localDate38 = null;
        Business.Reservation reservation40 = new Business.Reservation("", 0, localDate37, localDate38, 10.0d);
        java.lang.String str41 = reservation40.getGuestName();
        boolean boolean42 = reservationData0.addReservation(reservation40);
        java.time.LocalDate localDate43 = reservation40.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = reservation40.toString();
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
        org.junit.Assert.assertNotNull(reservationList34);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(localDate43);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        Data.ReservationData reservationData8 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList9 = reservationData8.getAllReservations();
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) (short) -1, localDate12, localDate13, (double) 1);
        java.time.LocalDate localDate16 = reservation15.getCheckOutDate();
        boolean boolean17 = reservationData8.addReservation(reservation15);
        java.time.LocalDate localDate18 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate19 = reservation15.getCheckOutDate();
        int int20 = reservation15.getRoomNumber();
        int int21 = reservation15.getRoomNumber();
        java.time.LocalDate localDate22 = reservation15.getCheckOutDate();
        boolean boolean23 = reservationData0.addReservation(reservation15);
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        Business.Reservation reservation29 = new Business.Reservation("hi!", (int) (byte) 100, localDate26, localDate27, (double) (short) 100);
        java.lang.String str30 = reservation29.getGuestName();
        boolean boolean31 = reservationData0.addReservation(reservation29);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
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
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = localDate10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        java.time.LocalDate localDate20 = reservation16.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = reservation16.calculateTotalPrice();
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
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        int int48 = reservation45.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double49 = reservation45.calculateTotalPrice();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        java.util.List<Business.Reservation> reservationList17 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList18 = reservationData0.getAllReservations();
        Data.ReservationData reservationData19 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList20 = reservationData19.getAllReservations();
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("hi!", (int) (short) -1, localDate23, localDate24, (double) 1);
        java.time.LocalDate localDate27 = reservation26.getCheckOutDate();
        boolean boolean28 = reservationData19.addReservation(reservation26);
        java.time.LocalDate localDate29 = reservation26.getCheckOutDate();
        java.time.LocalDate localDate30 = reservation26.getCheckOutDate();
        java.time.LocalDate localDate31 = reservation26.getCheckOutDate();
        java.lang.String str32 = reservation26.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = reservationData0.addReservation(reservation26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        int int14 = reservation5.getRoomNumber();
        java.lang.String str15 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList11 = reservationData0.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", (int) '#', localDate14, localDate15, (double) 100L);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        Data.ReservationData reservationData20 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList21 = reservationData20.getAllReservations();
        java.time.LocalDate localDate24 = null;
        java.time.LocalDate localDate25 = null;
        Business.Reservation reservation27 = new Business.Reservation("hi!", (int) (short) -1, localDate24, localDate25, (double) 1);
        java.lang.String str28 = reservation27.getGuestName();
        boolean boolean29 = reservationData20.addReservation(reservation27);
        java.util.List<Business.Reservation> reservationList30 = reservationData20.getAllReservations();
        java.util.List<Business.Reservation> reservationList31 = reservationData20.getAllReservations();
        java.time.LocalDate localDate34 = null;
        java.time.LocalDate localDate35 = null;
        Business.Reservation reservation37 = new Business.Reservation("", (int) '#', localDate34, localDate35, (double) 100L);
        java.time.LocalDate localDate38 = reservation37.getCheckOutDate();
        boolean boolean39 = reservationData20.addReservation(reservation37);
        int int40 = reservation37.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = reservationData0.addReservation(reservation37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNull(localDate38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("", (int) '4', localDate22, localDate23, (double) 1.0f);
        java.lang.String str26 = reservation25.getGuestName();
        java.time.LocalDate localDate27 = reservation25.getCheckInDate();
        java.time.LocalDate localDate28 = reservation25.getCheckInDate();
        boolean boolean29 = reservationData0.addReservation(reservation25);
        Data.ReservationData reservationData30 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList31 = reservationData30.getAllReservations();
        java.time.LocalDate localDate34 = null;
        java.time.LocalDate localDate35 = null;
        Business.Reservation reservation37 = new Business.Reservation("hi!", (int) (short) -1, localDate34, localDate35, (double) 1);
        java.lang.String str38 = reservation37.getGuestName();
        boolean boolean39 = reservationData30.addReservation(reservation37);
        java.lang.String str40 = reservation37.getGuestName();
        java.time.LocalDate localDate41 = reservation37.getCheckOutDate();
        int int42 = reservation37.getRoomNumber();
        java.time.LocalDate localDate43 = reservation37.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = reservationData0.addReservation(reservation37);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(localDate43);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("", 0, localDate3, localDate4, (double) 10.0f);
        java.time.LocalDate localDate7 = reservation6.getCheckInDate();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        int int9 = reservation6.getRoomNumber();
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("", (int) (short) 0, localDate23, localDate24, 0.0d);
        java.lang.String str27 = reservation26.getGuestName();
        boolean boolean28 = reservationData0.addReservation(reservation26);
        int int29 = reservation26.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        int int9 = reservation8.getRoomNumber();
        java.time.LocalDate localDate10 = reservation8.getCheckInDate();
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", 52, localDate14, localDate15, (double) (short) -1);
        boolean boolean18 = reservationData0.addReservation(reservation17);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = reservation17.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 1, localDate2, localDate3, (double) 10);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        java.time.LocalDate localDate44 = null;
        java.time.LocalDate localDate45 = null;
        Business.Reservation reservation47 = new Business.Reservation("hi!", (int) (byte) 100, localDate44, localDate45, (double) (short) 100);
        int int48 = reservation47.getRoomNumber();
        java.time.LocalDate localDate49 = reservation47.getCheckOutDate();
        boolean boolean50 = reservationData0.addReservation(reservation47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = reservation47.toString();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        Business.Reservation reservation53 = new Business.Reservation("", (int) '4', localDate50, localDate51, 0.0d);
        boolean boolean54 = reservationData0.addReservation(reservation53);
        java.lang.Class<?> wildcardClass55 = reservationData0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, (double) 1);
        int int6 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) (short) 0);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.String str7 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        java.time.LocalDate localDate63 = null;
        java.time.LocalDate localDate64 = null;
        Business.Reservation reservation66 = new Business.Reservation("hi!", (int) (short) -1, localDate63, localDate64, (double) 1);
        java.lang.String str67 = reservation66.getGuestName();
        int int68 = reservation66.getRoomNumber();
        java.time.LocalDate localDate69 = reservation66.getCheckOutDate();
        java.lang.String str70 = reservation66.getGuestName();
        int int71 = reservation66.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = reservationData0.addReservation(reservation66);
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
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNull(localDate69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        java.util.List<Business.Reservation> reservationList22 = reservationData20.getAllReservations();
        java.util.List<Business.Reservation> reservationList23 = reservationData20.getAllReservations();
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        Business.Reservation reservation29 = new Business.Reservation("hi!", (int) (short) -1, localDate26, localDate27, (double) 1);
        java.time.LocalDate localDate30 = reservation29.getCheckOutDate();
        boolean boolean31 = reservationData20.addReservation(reservation29);
        java.time.LocalDate localDate34 = null;
        java.time.LocalDate localDate35 = null;
        Business.Reservation reservation37 = new Business.Reservation("", (int) '4', localDate34, localDate35, (double) 1.0f);
        java.lang.String str38 = reservation37.getGuestName();
        boolean boolean39 = reservationData20.addReservation(reservation37);
        java.time.LocalDate localDate40 = reservation37.getCheckOutDate();
        boolean boolean41 = reservationData0.addReservation(reservation37);
        java.lang.String str42 = reservation37.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList11 = reservationData0.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", 1, localDate14, localDate15, (double) (-1));
        int int18 = reservation17.getRoomNumber();
        java.time.LocalDate localDate19 = reservation17.getCheckInDate();
        int int20 = reservation17.getRoomNumber();
        boolean boolean21 = reservationData0.addReservation(reservation17);
        java.util.List<Business.Reservation> reservationList22 = reservationData0.getAllReservations();
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        Business.Reservation reservation28 = new Business.Reservation("", 1, localDate25, localDate26, (double) (short) -1);
        java.time.LocalDate localDate29 = reservation28.getCheckInDate();
        int int30 = reservation28.getRoomNumber();
        java.time.LocalDate localDate31 = reservation28.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = reservationData0.addReservation(reservation28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(localDate31);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) (byte) 10);
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 10, localDate2, localDate3, 10.0d);
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate10 = null;
        java.time.LocalDate localDate11 = null;
        Business.Reservation reservation13 = new Business.Reservation("hi!", (int) (byte) 100, localDate10, localDate11, 0.0d);
        boolean boolean14 = reservationData0.addReservation(reservation13);
        java.util.List<Business.Reservation> reservationList15 = reservationData0.getAllReservations();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList15);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("", (int) '4', localDate22, localDate23, (double) 1.0f);
        java.lang.String str26 = reservation25.getGuestName();
        java.time.LocalDate localDate27 = reservation25.getCheckInDate();
        java.time.LocalDate localDate28 = reservation25.getCheckInDate();
        boolean boolean29 = reservationData0.addReservation(reservation25);
        java.util.List<Business.Reservation> reservationList30 = reservationData0.getAllReservations();
        java.time.LocalDate localDate33 = null;
        java.time.LocalDate localDate34 = null;
        Business.Reservation reservation36 = new Business.Reservation("", (int) (short) -1, localDate33, localDate34, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = reservationData0.addReservation(reservation36);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(reservationList30);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList21 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass22 = reservationList21.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        java.util.List<Business.Reservation> reservationList24 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList25 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass26 = reservationList25.getClass();
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
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        java.lang.String str20 = reservation17.getGuestName();
        java.lang.String str21 = reservation17.getGuestName();
        java.lang.String str22 = reservation17.getGuestName();
        java.time.LocalDate localDate23 = reservation17.getCheckOutDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        java.lang.Class<?> wildcardClass16 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        java.time.LocalDate localDate13 = reservation5.getCheckInDate();
        java.time.LocalDate localDate14 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation5.calculateTotalPrice();
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
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, (double) 10.0f);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        java.time.LocalDate localDate11 = reservation5.getCheckOutDate();
        int int12 = reservation5.getRoomNumber();
        java.time.LocalDate localDate13 = reservation5.getCheckInDate();
        java.lang.String str14 = reservation5.getGuestName();
        java.time.LocalDate localDate15 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 0);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        java.time.LocalDate localDate40 = reservation38.getCheckOutDate();
        java.time.LocalDate localDate41 = reservation38.getCheckInDate();
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
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertNull(localDate41);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.lang.String str9 = reservation5.getGuestName();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        int int11 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        java.util.List<Business.Reservation> reservationList22 = reservationData0.getAllReservations();
        Data.ReservationData reservationData23 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList24 = reservationData23.getAllReservations();
        Data.ReservationData reservationData25 = new Data.ReservationData();
        java.time.LocalDate localDate28 = null;
        java.time.LocalDate localDate29 = null;
        Business.Reservation reservation31 = new Business.Reservation("hi!", (int) (short) -1, localDate28, localDate29, (double) 1);
        java.lang.String str32 = reservation31.getGuestName();
        boolean boolean33 = reservationData25.addReservation(reservation31);
        java.time.LocalDate localDate34 = reservation31.getCheckInDate();
        int int35 = reservation31.getRoomNumber();
        boolean boolean36 = reservationData23.addReservation(reservation31);
        java.util.List<Business.Reservation> reservationList37 = reservationData23.getAllReservations();
        java.time.LocalDate localDate40 = null;
        java.time.LocalDate localDate41 = null;
        Business.Reservation reservation43 = new Business.Reservation("hi!", 100, localDate40, localDate41, (double) (short) 1);
        boolean boolean44 = reservationData23.addReservation(reservation43);
        boolean boolean45 = reservationData0.addReservation(reservation43);
        java.lang.Class<?> wildcardClass46 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(reservationList37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = localDate9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, 1.0d);
        int int6 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate10 = reservation8.getCheckInDate();
        java.time.LocalDate localDate11 = reservation8.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation8.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation8.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        java.lang.String str17 = reservation7.getGuestName();
        java.lang.Class<?> wildcardClass18 = reservation7.getClass();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) (short) 10, localDate22, localDate23, (double) (short) 1);
        java.time.LocalDate localDate26 = reservation25.getCheckInDate();
        boolean boolean27 = reservationData0.addReservation(reservation25);
        java.time.LocalDate localDate28 = reservation25.getCheckInDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(localDate28);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '#', localDate2, localDate3, (double) 10);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 35, localDate2, localDate3, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 52, localDate2, localDate3, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        java.time.LocalDate localDate11 = reservation5.getCheckOutDate();
        java.lang.String str12 = reservation5.getGuestName();
        java.time.LocalDate localDate13 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, 10.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        Business.Reservation reservation26 = new Business.Reservation("", (int) (byte) 0, localDate23, localDate24, (double) 52);
        boolean boolean27 = reservationData0.addReservation(reservation26);
        Data.ReservationData reservationData28 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList29 = reservationData28.getAllReservations();
        java.util.List<Business.Reservation> reservationList30 = reservationData28.getAllReservations();
        Data.ReservationData reservationData31 = new Data.ReservationData();
        java.time.LocalDate localDate34 = null;
        java.time.LocalDate localDate35 = null;
        Business.Reservation reservation37 = new Business.Reservation("hi!", (int) (short) -1, localDate34, localDate35, (double) 1);
        java.lang.String str38 = reservation37.getGuestName();
        boolean boolean39 = reservationData31.addReservation(reservation37);
        java.lang.String str40 = reservation37.getGuestName();
        int int41 = reservation37.getRoomNumber();
        int int42 = reservation37.getRoomNumber();
        boolean boolean43 = reservationData28.addReservation(reservation37);
        java.time.LocalDate localDate46 = null;
        java.time.LocalDate localDate47 = null;
        Business.Reservation reservation49 = new Business.Reservation("hi!", (int) (short) 10, localDate46, localDate47, (double) (short) 1);
        boolean boolean50 = reservationData28.addReservation(reservation49);
        java.time.LocalDate localDate53 = null;
        java.time.LocalDate localDate54 = null;
        Business.Reservation reservation56 = new Business.Reservation("hi!", (int) 'a', localDate53, localDate54, (double) (byte) -1);
        boolean boolean57 = reservationData28.addReservation(reservation56);
        java.time.LocalDate localDate58 = reservation56.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = reservationData0.addReservation(reservation56);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(localDate58);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        java.util.List<Business.Reservation> reservationList31 = reservationData0.getAllReservations();
        Data.ReservationData reservationData32 = new Data.ReservationData();
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("hi!", (int) 'a', localDate35, localDate36, (double) (byte) -1);
        boolean boolean39 = reservationData32.addReservation(reservation38);
        java.util.List<Business.Reservation> reservationList40 = reservationData32.getAllReservations();
        java.util.List<Business.Reservation> reservationList41 = reservationData32.getAllReservations();
        java.time.LocalDate localDate44 = null;
        java.time.LocalDate localDate45 = null;
        Business.Reservation reservation47 = new Business.Reservation("hi!", (int) (byte) 0, localDate44, localDate45, (-1.0d));
        boolean boolean48 = reservationData32.addReservation(reservation47);
        Data.ReservationData reservationData49 = new Data.ReservationData();
        java.time.LocalDate localDate52 = null;
        java.time.LocalDate localDate53 = null;
        Business.Reservation reservation55 = new Business.Reservation("hi!", (int) (short) -1, localDate52, localDate53, (double) 1);
        java.lang.String str56 = reservation55.getGuestName();
        boolean boolean57 = reservationData49.addReservation(reservation55);
        java.time.LocalDate localDate58 = reservation55.getCheckInDate();
        int int59 = reservation55.getRoomNumber();
        java.time.LocalDate localDate60 = reservation55.getCheckInDate();
        int int61 = reservation55.getRoomNumber();
        boolean boolean62 = reservationData32.addReservation(reservation55);
        java.time.LocalDate localDate65 = null;
        java.time.LocalDate localDate66 = null;
        Business.Reservation reservation68 = new Business.Reservation("hi!", (int) (byte) 10, localDate65, localDate66, (double) (byte) 10);
        java.lang.String str69 = reservation68.getGuestName();
        boolean boolean70 = reservationData32.addReservation(reservation68);
        boolean boolean71 = reservationData0.addReservation(reservation68);
        java.lang.Class<?> wildcardClass72 = reservation68.getClass();
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
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(reservationList40);
        org.junit.Assert.assertNotNull(reservationList41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(localDate58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(localDate60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        java.time.LocalDate localDate14 = reservation9.getCheckOutDate();
        java.lang.String str15 = reservation9.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = reservation9.calculateTotalPrice();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        java.time.LocalDate localDate18 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate19 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = reservation7.toString();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate10 = reservation8.getCheckInDate();
        java.lang.String str11 = reservation8.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = localDate9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) 32);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) (byte) 10);
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
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
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
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) 10);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 100, localDate2, localDate3, (double) (byte) -1);
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
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        int int14 = reservation6.getRoomNumber();
        java.time.LocalDate localDate15 = reservation6.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = reservation6.calculateTotalPrice();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 10, localDate2, localDate3, (double) 97);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) (short) 100, localDate22, localDate23, (double) 100);
        int int26 = reservation25.getRoomNumber();
        boolean boolean27 = reservationData0.addReservation(reservation25);
        java.time.LocalDate localDate28 = reservation25.getCheckOutDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(localDate28);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 100, localDate2, localDate3, (double) 32);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        int int14 = reservation6.getRoomNumber();
        java.time.LocalDate localDate15 = reservation6.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = localDate15.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        Business.Reservation reservation26 = new Business.Reservation("hi!", (int) (short) -1, localDate23, localDate24, (double) 1);
        java.lang.String str27 = reservation26.getGuestName();
        int int28 = reservation26.getRoomNumber();
        java.time.LocalDate localDate29 = reservation26.getCheckOutDate();
        java.lang.String str30 = reservation26.getGuestName();
        boolean boolean31 = reservationData0.addReservation(reservation26);
        java.util.List<Business.Reservation> reservationList32 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("", 97, localDate36, localDate37, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = reservationData0.addReservation(reservation39);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNotNull(reservationList33);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, 1.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) -1, localDate2, localDate3, (double) (short) 100);
        java.lang.String str6 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 'a');
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
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 32, localDate2, localDate3, (double) 52);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, (double) 32);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.String str7 = reservation5.getGuestName();
        int int8 = reservation5.getRoomNumber();
        java.lang.String str9 = reservation5.getGuestName();
        java.lang.String str10 = reservation5.getGuestName();
        java.lang.String str11 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass12 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 0, localDate2, localDate3, (double) 52);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("", (int) (short) 0, localDate23, localDate24, 0.0d);
        java.lang.String str27 = reservation26.getGuestName();
        boolean boolean28 = reservationData0.addReservation(reservation26);
        java.lang.Class<?> wildcardClass29 = reservation26.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, (double) 0L);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        java.time.LocalDate localDate24 = null;
        java.time.LocalDate localDate25 = null;
        Business.Reservation reservation27 = new Business.Reservation("hi!", (int) '4', localDate24, localDate25, (double) (-1.0f));
        java.time.LocalDate localDate28 = reservation27.getCheckOutDate();
        java.lang.String str29 = reservation27.getGuestName();
        java.lang.String str30 = reservation27.getGuestName();
        java.lang.String str31 = reservation27.getGuestName();
        java.time.LocalDate localDate32 = reservation27.getCheckInDate();
        boolean boolean33 = reservationData0.addReservation(reservation27);
        java.lang.Class<?> wildcardClass34 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        java.lang.String str24 = reservation21.getGuestName();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        int int16 = reservation7.getRoomNumber();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 10, localDate2, localDate3, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = localDate9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 10, localDate2, localDate3, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, (double) 10);
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
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.String str8 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 52, localDate2, localDate3, 100.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.lang.String str10 = reservation7.getGuestName();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, (-1.0d));
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        java.util.List<Business.Reservation> reservationList17 = reservationData14.getAllReservations();
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        Business.Reservation reservation23 = new Business.Reservation("hi!", (int) (short) -1, localDate20, localDate21, (double) 1);
        java.time.LocalDate localDate24 = reservation23.getCheckOutDate();
        boolean boolean25 = reservationData14.addReservation(reservation23);
        java.time.LocalDate localDate28 = null;
        java.time.LocalDate localDate29 = null;
        Business.Reservation reservation31 = new Business.Reservation("", (int) '4', localDate28, localDate29, (double) 1.0f);
        java.lang.String str32 = reservation31.getGuestName();
        boolean boolean33 = reservationData14.addReservation(reservation31);
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("hi!", (int) (short) 10, localDate36, localDate37, (double) (-1L));
        java.time.LocalDate localDate40 = reservation39.getCheckOutDate();
        boolean boolean41 = reservationData14.addReservation(reservation39);
        java.time.LocalDate localDate44 = null;
        java.time.LocalDate localDate45 = null;
        Business.Reservation reservation47 = new Business.Reservation("", (int) ' ', localDate44, localDate45, 0.0d);
        boolean boolean48 = reservationData14.addReservation(reservation47);
        boolean boolean49 = reservationData0.addReservation(reservation47);
        // The following exception was thrown during execution in test generation
        try {
            double double50 = reservation47.calculateTotalPrice();
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
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("", (int) (byte) 10, localDate4, localDate5, (double) 1.0f);
        boolean boolean8 = reservationData0.addReservation(reservation7);
        java.lang.Class<?> wildcardClass9 = reservation7.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList11 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList12 = reservationData0.getAllReservations();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        Business.Reservation reservation41 = new Business.Reservation("hi!", (int) (byte) 100, localDate38, localDate39, (double) (short) 100);
        int int42 = reservation41.getRoomNumber();
        java.time.LocalDate localDate43 = reservation41.getCheckOutDate();
        boolean boolean44 = reservationData0.addReservation(reservation41);
        java.time.LocalDate localDate47 = null;
        java.time.LocalDate localDate48 = null;
        Business.Reservation reservation50 = new Business.Reservation("", (int) (byte) 100, localDate47, localDate48, (double) 97);
        java.time.LocalDate localDate51 = reservation50.getCheckOutDate();
        java.time.LocalDate localDate52 = reservation50.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = reservationData0.addReservation(reservation50);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNull(localDate43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(localDate51);
        org.junit.Assert.assertNull(localDate52);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        java.util.List<Business.Reservation> reservationList16 = reservationData0.getAllReservations();
        Data.ReservationData reservationData17 = new Data.ReservationData();
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        Business.Reservation reservation23 = new Business.Reservation("hi!", (int) (short) -1, localDate20, localDate21, (double) 1);
        java.lang.String str24 = reservation23.getGuestName();
        boolean boolean25 = reservationData17.addReservation(reservation23);
        java.util.List<Business.Reservation> reservationList26 = reservationData17.getAllReservations();
        java.time.LocalDate localDate29 = null;
        java.time.LocalDate localDate30 = null;
        Business.Reservation reservation32 = new Business.Reservation("", 1, localDate29, localDate30, (double) (-1));
        java.time.LocalDate localDate33 = reservation32.getCheckOutDate();
        java.time.LocalDate localDate34 = reservation32.getCheckOutDate();
        java.time.LocalDate localDate35 = reservation32.getCheckOutDate();
        boolean boolean36 = reservationData17.addReservation(reservation32);
        java.util.List<Business.Reservation> reservationList37 = reservationData17.getAllReservations();
        Data.ReservationData reservationData38 = new Data.ReservationData();
        java.time.LocalDate localDate41 = null;
        java.time.LocalDate localDate42 = null;
        Business.Reservation reservation44 = new Business.Reservation("hi!", (int) 'a', localDate41, localDate42, (double) (byte) -1);
        boolean boolean45 = reservationData38.addReservation(reservation44);
        java.util.List<Business.Reservation> reservationList46 = reservationData38.getAllReservations();
        java.util.List<Business.Reservation> reservationList47 = reservationData38.getAllReservations();
        java.time.LocalDate localDate50 = null;
        java.time.LocalDate localDate51 = null;
        Business.Reservation reservation53 = new Business.Reservation("hi!", (int) (byte) 0, localDate50, localDate51, (-1.0d));
        boolean boolean54 = reservationData38.addReservation(reservation53);
        boolean boolean55 = reservationData17.addReservation(reservation53);
        Data.ReservationData reservationData56 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList57 = reservationData56.getAllReservations();
        Data.ReservationData reservationData58 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList59 = reservationData58.getAllReservations();
        java.time.LocalDate localDate62 = null;
        java.time.LocalDate localDate63 = null;
        Business.Reservation reservation65 = new Business.Reservation("hi!", (int) (short) -1, localDate62, localDate63, (double) 1);
        java.lang.String str66 = reservation65.getGuestName();
        boolean boolean67 = reservationData58.addReservation(reservation65);
        java.time.LocalDate localDate70 = null;
        java.time.LocalDate localDate71 = null;
        Business.Reservation reservation73 = new Business.Reservation("hi!", (int) 'a', localDate70, localDate71, (double) (byte) -1);
        boolean boolean74 = reservationData58.addReservation(reservation73);
        boolean boolean75 = reservationData56.addReservation(reservation73);
        int int76 = reservation73.getRoomNumber();
        boolean boolean77 = reservationData17.addReservation(reservation73);
        java.time.LocalDate localDate78 = reservation73.getCheckInDate();
        boolean boolean79 = reservationData0.addReservation(reservation73);
        // The following exception was thrown during execution in test generation
        try {
            double double80 = reservation73.calculateTotalPrice();
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
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(reservationList37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(reservationList46);
        org.junit.Assert.assertNotNull(reservationList47);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(reservationList57);
        org.junit.Assert.assertNotNull(reservationList59);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 97 + "'", int76 == 97);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNull(localDate78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        java.time.LocalDate localDate13 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate14 = reservation7.getCheckOutDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 100, localDate2, localDate3, (double) 97);
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
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        int int20 = reservation17.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = reservation17.calculateTotalPrice();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        java.time.LocalDate localDate44 = null;
        java.time.LocalDate localDate45 = null;
        Business.Reservation reservation47 = new Business.Reservation("hi!", (int) (byte) 100, localDate44, localDate45, (double) (short) 100);
        int int48 = reservation47.getRoomNumber();
        java.time.LocalDate localDate49 = reservation47.getCheckOutDate();
        boolean boolean50 = reservationData0.addReservation(reservation47);
        java.lang.String str51 = reservation47.getGuestName();
        java.lang.Class<?> wildcardClass52 = reservation47.getClass();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) (byte) 0, localDate27, localDate28, 100.0d);
        java.lang.String str31 = reservation30.getGuestName();
        boolean boolean32 = reservationData0.addReservation(reservation30);
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(reservationList33);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) -1, localDate2, localDate3, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) '#');
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        int int19 = reservation15.getRoomNumber();
        java.lang.Class<?> wildcardClass20 = reservation15.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 10, localDate2, localDate3, (double) ' ');
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckOutDate();
        java.time.LocalDate localDate10 = reservation6.getCheckInDate();
        java.time.LocalDate localDate11 = reservation6.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = localDate11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 100, localDate2, localDate3, (double) (byte) 1);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 52, localDate2, localDate3, 0.0d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 52, localDate2, localDate3, (double) (short) 10);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        Business.Reservation reservation28 = new Business.Reservation("hi!", (int) 'a', localDate25, localDate26, (double) (byte) -1);
        boolean boolean29 = reservationData0.addReservation(reservation28);
        java.util.List<Business.Reservation> reservationList30 = reservationData0.getAllReservations();
        java.time.LocalDate localDate33 = null;
        java.time.LocalDate localDate34 = null;
        Business.Reservation reservation36 = new Business.Reservation("hi!", (-1), localDate33, localDate34, (double) (short) 1);
        java.time.LocalDate localDate37 = reservation36.getCheckOutDate();
        java.time.LocalDate localDate38 = reservation36.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = reservationData0.addReservation(reservation36);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertNull(localDate37);
        org.junit.Assert.assertNull(localDate38);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        int int11 = reservation5.getRoomNumber();
        java.time.LocalDate localDate12 = reservation5.getCheckInDate();
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
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 35, localDate2, localDate3, (-1.0d));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) '4');
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        java.lang.String str11 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass2 = reservationList1.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.util.List<Business.Reservation> reservationList17 = reservationData15.getAllReservations();
        Data.ReservationData reservationData18 = new Data.ReservationData();
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("hi!", (int) (short) -1, localDate21, localDate22, (double) 1);
        java.lang.String str25 = reservation24.getGuestName();
        boolean boolean26 = reservationData18.addReservation(reservation24);
        java.time.LocalDate localDate27 = reservation24.getCheckInDate();
        boolean boolean28 = reservationData15.addReservation(reservation24);
        java.time.LocalDate localDate31 = null;
        java.time.LocalDate localDate32 = null;
        Business.Reservation reservation34 = new Business.Reservation("hi!", 97, localDate31, localDate32, (double) 0L);
        java.time.LocalDate localDate35 = reservation34.getCheckOutDate();
        java.lang.String str36 = reservation34.getGuestName();
        boolean boolean37 = reservationData15.addReservation(reservation34);
        java.util.List<Business.Reservation> reservationList38 = reservationData15.getAllReservations();
        java.time.LocalDate localDate41 = null;
        java.time.LocalDate localDate42 = null;
        Business.Reservation reservation44 = new Business.Reservation("", (int) '#', localDate41, localDate42, (double) (short) 100);
        boolean boolean45 = reservationData15.addReservation(reservation44);
        boolean boolean46 = reservationData0.addReservation(reservation44);
        java.time.LocalDate localDate47 = reservation44.getCheckOutDate();
        java.lang.String str48 = reservation44.getGuestName();
        java.lang.String str49 = reservation44.getGuestName();
        java.time.LocalDate localDate50 = reservation44.getCheckOutDate();
        java.lang.Class<?> wildcardClass51 = reservation44.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(reservationList38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(localDate47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(localDate50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckOutDate();
        java.time.LocalDate localDate10 = reservation6.getCheckInDate();
        int int11 = reservation6.getRoomNumber();
        java.time.LocalDate localDate12 = reservation6.getCheckOutDate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) 10);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 10, localDate2, localDate3, (double) 0);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        Business.Reservation reservation29 = new Business.Reservation("", (int) '#', localDate26, localDate27, (double) 100L);
        java.time.LocalDate localDate30 = reservation29.getCheckOutDate();
        boolean boolean31 = reservationData0.addReservation(reservation29);
        Data.ReservationData reservationData32 = new Data.ReservationData();
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("hi!", (int) (short) -1, localDate35, localDate36, (double) 1);
        java.lang.String str39 = reservation38.getGuestName();
        boolean boolean40 = reservationData32.addReservation(reservation38);
        java.time.LocalDate localDate41 = reservation38.getCheckInDate();
        java.time.LocalDate localDate42 = reservation38.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = reservationData0.addReservation(reservation38);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertNull(localDate42);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 32, localDate2, localDate3, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '#', localDate2, localDate3, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 100, localDate2, localDate3, (double) 100.0f);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        int int9 = reservation8.getRoomNumber();
        java.time.LocalDate localDate10 = reservation8.getCheckInDate();
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", 52, localDate14, localDate15, (double) (short) -1);
        boolean boolean18 = reservationData0.addReservation(reservation17);
        java.lang.Class<?> wildcardClass19 = reservation17.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, 10.0d);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", 97, localDate12, localDate13, (double) (byte) -1);
        java.time.LocalDate localDate16 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate17 = reservation15.getCheckOutDate();
        boolean boolean18 = reservationData0.addReservation(reservation15);
        int int19 = reservation15.getRoomNumber();
        java.time.LocalDate localDate20 = reservation15.getCheckOutDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate10 = reservation8.getCheckInDate();
        java.time.LocalDate localDate11 = reservation8.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = reservation8.calculateTotalPrice();
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
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, 1.0d);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.lang.String str8 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate10 = null;
        java.time.LocalDate localDate11 = null;
        Business.Reservation reservation13 = new Business.Reservation("hi!", (int) (byte) 100, localDate10, localDate11, 0.0d);
        boolean boolean14 = reservationData0.addReservation(reservation13);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation13.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (-1), localDate2, localDate3, 100.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) (byte) 100, localDate14, localDate15, (double) (short) 1);
        boolean boolean18 = reservationData0.addReservation(reservation17);
        Data.ReservationData reservationData19 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList20 = reservationData19.getAllReservations();
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("hi!", (int) (short) -1, localDate23, localDate24, (double) 1);
        java.lang.String str27 = reservation26.getGuestName();
        boolean boolean28 = reservationData19.addReservation(reservation26);
        java.time.LocalDate localDate31 = null;
        java.time.LocalDate localDate32 = null;
        Business.Reservation reservation34 = new Business.Reservation("hi!", (int) 'a', localDate31, localDate32, (double) (byte) -1);
        boolean boolean35 = reservationData19.addReservation(reservation34);
        java.time.LocalDate localDate36 = reservation34.getCheckOutDate();
        boolean boolean37 = reservationData0.addReservation(reservation34);
        // The following exception was thrown during execution in test generation
        try {
            double double38 = reservation34.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        java.time.LocalDate localDate15 = reservation9.getCheckInDate();
        java.lang.String str16 = reservation9.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 32, localDate2, localDate3, 100.0d);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, (double) 10.0f);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.String str7 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("", 0, localDate3, localDate4, (double) 10.0f);
        java.time.LocalDate localDate7 = reservation6.getCheckInDate();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        Data.ReservationData reservationData9 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList10 = reservationData9.getAllReservations();
        java.time.LocalDate localDate13 = null;
        java.time.LocalDate localDate14 = null;
        Business.Reservation reservation16 = new Business.Reservation("hi!", (int) (short) -1, localDate13, localDate14, (double) 1);
        java.time.LocalDate localDate17 = reservation16.getCheckOutDate();
        boolean boolean18 = reservationData9.addReservation(reservation16);
        java.time.LocalDate localDate19 = reservation16.getCheckInDate();
        java.time.LocalDate localDate20 = reservation16.getCheckOutDate();
        int int21 = reservation16.getRoomNumber();
        java.time.LocalDate localDate22 = reservation16.getCheckOutDate();
        boolean boolean23 = reservationData0.addReservation(reservation16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = reservation16.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", 100, localDate19, localDate20, (double) (short) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData0.addReservation(reservation22);
        Data.ReservationData reservationData25 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList26 = reservationData25.getAllReservations();
        java.util.List<Business.Reservation> reservationList27 = reservationData25.getAllReservations();
        java.util.List<Business.Reservation> reservationList28 = reservationData25.getAllReservations();
        java.time.LocalDate localDate31 = null;
        java.time.LocalDate localDate32 = null;
        Business.Reservation reservation34 = new Business.Reservation("hi!", (int) (short) -1, localDate31, localDate32, (double) 1);
        java.time.LocalDate localDate35 = reservation34.getCheckOutDate();
        boolean boolean36 = reservationData25.addReservation(reservation34);
        java.util.List<Business.Reservation> reservationList37 = reservationData25.getAllReservations();
        java.util.List<Business.Reservation> reservationList38 = reservationData25.getAllReservations();
        java.time.LocalDate localDate41 = null;
        java.time.LocalDate localDate42 = null;
        Business.Reservation reservation44 = new Business.Reservation("", (int) '#', localDate41, localDate42, 0.0d);
        int int45 = reservation44.getRoomNumber();
        int int46 = reservation44.getRoomNumber();
        boolean boolean47 = reservationData25.addReservation(reservation44);
        java.lang.String str48 = reservation44.getGuestName();
        boolean boolean49 = reservationData0.addReservation(reservation44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = reservation44.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNotNull(reservationList27);
        org.junit.Assert.assertNotNull(reservationList28);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(reservationList37);
        org.junit.Assert.assertNotNull(reservationList38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 0, localDate2, localDate3, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 100, localDate2, localDate3, 100.0d);
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
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        Business.Reservation reservation22 = new Business.Reservation("hi!", 100, localDate19, localDate20, (double) (short) 1);
        java.lang.String str23 = reservation22.getGuestName();
        boolean boolean24 = reservationData0.addReservation(reservation22);
        java.lang.Class<?> wildcardClass25 = reservationData0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
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
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 52, localDate2, localDate3, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) 'a');
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 32, localDate2, localDate3, (double) 97);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("", (int) (short) 1, localDate23, localDate24, (double) (-1));
        java.lang.String str27 = reservation26.getGuestName();
        java.time.LocalDate localDate28 = reservation26.getCheckInDate();
        boolean boolean29 = reservationData0.addReservation(reservation26);
        java.util.List<Business.Reservation> reservationList30 = reservationData0.getAllReservations();
        java.time.LocalDate localDate33 = null;
        java.time.LocalDate localDate34 = null;
        Business.Reservation reservation36 = new Business.Reservation("hi!", (int) (byte) 0, localDate33, localDate34, (double) 10);
        boolean boolean37 = reservationData0.addReservation(reservation36);
        java.lang.Class<?> wildcardClass38 = reservation36.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        java.time.LocalDate localDate13 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate14 = reservation7.getCheckOutDate();
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
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        int int7 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        java.util.List<Business.Reservation> reservationList31 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList32 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass34 = reservationData0.getClass();
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
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.time.LocalDate localDate11 = null;
        java.time.LocalDate localDate12 = null;
        Business.Reservation reservation14 = new Business.Reservation("hi!", (int) (byte) 0, localDate11, localDate12, (-1.0d));
        boolean boolean15 = reservationData0.addReservation(reservation14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = reservation14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 100, localDate2, localDate3, (double) '4');
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 35, localDate2, localDate3, (double) 97);
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", 1, localDate22, localDate23, (double) 100.0f);
        java.lang.String str26 = reservation25.getGuestName();
        boolean boolean27 = reservationData0.addReservation(reservation25);
        java.time.LocalDate localDate28 = reservation25.getCheckInDate();
        int int29 = reservation25.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = reservation25.toString();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 1, localDate2, localDate3, (double) 0L);
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
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, (double) 0L);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.lang.String str8 = reservation6.getGuestName();
        java.lang.String str9 = reservation6.getGuestName();
        java.time.LocalDate localDate10 = reservation6.getCheckOutDate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation7.getCheckInDate();
        java.time.LocalDate localDate13 = reservation7.getCheckInDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
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
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        java.time.LocalDate localDate23 = reservation19.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = reservation19.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, (double) (-1L));
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        java.time.LocalDate localDate16 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate17 = reservation5.getCheckInDate();
        int int18 = reservation5.getRoomNumber();
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
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        // The following exception was thrown during execution in test generation
        try {
            double double18 = reservation7.calculateTotalPrice();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = reservation39.toString();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDate8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) 0);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, (double) (-1));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str62 = reservation57.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.lang.String str9 = reservation5.getGuestName();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 0, localDate2, localDate3, (double) 10L);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        java.time.LocalDate localDate13 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate14 = reservation7.getCheckInDate();
        java.time.LocalDate localDate15 = reservation7.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) (byte) 100);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        java.time.LocalDate localDate24 = null;
        java.time.LocalDate localDate25 = null;
        Business.Reservation reservation27 = new Business.Reservation("hi!", (int) '4', localDate24, localDate25, (double) (-1.0f));
        java.time.LocalDate localDate28 = reservation27.getCheckOutDate();
        java.lang.String str29 = reservation27.getGuestName();
        java.lang.String str30 = reservation27.getGuestName();
        java.lang.String str31 = reservation27.getGuestName();
        java.time.LocalDate localDate32 = reservation27.getCheckInDate();
        boolean boolean33 = reservationData0.addReservation(reservation27);
        java.util.List<Business.Reservation> reservationList34 = reservationData0.getAllReservations();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(reservationList34);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("", (int) (short) -1, localDate27, localDate28, (double) (-1L));
        int int31 = reservation30.getRoomNumber();
        java.time.LocalDate localDate32 = reservation30.getCheckOutDate();
        java.lang.String str33 = reservation30.getGuestName();
        java.time.LocalDate localDate34 = reservation30.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = reservationData0.addReservation(reservation30);
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
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(localDate34);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) (-1L));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 10, localDate2, localDate3, (double) (-1.0f));
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList11 = reservationData0.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", 1, localDate14, localDate15, (double) (-1));
        int int18 = reservation17.getRoomNumber();
        java.time.LocalDate localDate19 = reservation17.getCheckInDate();
        int int20 = reservation17.getRoomNumber();
        boolean boolean21 = reservationData0.addReservation(reservation17);
        java.lang.Class<?> wildcardClass22 = reservationData0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        int int9 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        java.util.List<Business.Reservation> reservationList17 = reservationData0.getAllReservations();
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        Business.Reservation reservation23 = new Business.Reservation("", 0, localDate20, localDate21, 1.0d);
        boolean boolean24 = reservationData0.addReservation(reservation23);
        java.time.LocalDate localDate25 = reservation23.getCheckInDate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(localDate25);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) -1, localDate2, localDate3, (double) 1.0f);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("", (int) (short) 0, localDate23, localDate24, 0.0d);
        java.lang.String str27 = reservation26.getGuestName();
        boolean boolean28 = reservationData0.addReservation(reservation26);
        java.util.List<Business.Reservation> reservationList29 = reservationData0.getAllReservations();
        java.time.LocalDate localDate32 = null;
        java.time.LocalDate localDate33 = null;
        Business.Reservation reservation35 = new Business.Reservation("hi!", (int) 'a', localDate32, localDate33, (double) (byte) -1);
        int int36 = reservation35.getRoomNumber();
        java.lang.String str37 = reservation35.getGuestName();
        java.time.LocalDate localDate38 = reservation35.getCheckInDate();
        boolean boolean39 = reservationData0.addReservation(reservation35);
        java.util.List<Business.Reservation> reservationList40 = reservationData0.getAllReservations();
        java.time.LocalDate localDate43 = null;
        java.time.LocalDate localDate44 = null;
        Business.Reservation reservation46 = new Business.Reservation("hi!", (int) (short) 10, localDate43, localDate44, (double) (short) 1);
        java.time.LocalDate localDate47 = reservation46.getCheckInDate();
        java.time.LocalDate localDate48 = reservation46.getCheckInDate();
        boolean boolean49 = reservationData0.addReservation(reservation46);
        Data.ReservationData reservationData50 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList51 = reservationData50.getAllReservations();
        Data.ReservationData reservationData52 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList53 = reservationData52.getAllReservations();
        java.time.LocalDate localDate56 = null;
        java.time.LocalDate localDate57 = null;
        Business.Reservation reservation59 = new Business.Reservation("hi!", (int) (short) -1, localDate56, localDate57, (double) 1);
        java.time.LocalDate localDate60 = reservation59.getCheckOutDate();
        boolean boolean61 = reservationData52.addReservation(reservation59);
        java.time.LocalDate localDate62 = reservation59.getCheckOutDate();
        java.time.LocalDate localDate63 = reservation59.getCheckInDate();
        boolean boolean64 = reservationData50.addReservation(reservation59);
        Data.ReservationData reservationData65 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList66 = reservationData65.getAllReservations();
        java.time.LocalDate localDate69 = null;
        java.time.LocalDate localDate70 = null;
        Business.Reservation reservation72 = new Business.Reservation("hi!", (int) (short) -1, localDate69, localDate70, (double) 1);
        java.lang.String str73 = reservation72.getGuestName();
        boolean boolean74 = reservationData65.addReservation(reservation72);
        java.time.LocalDate localDate77 = null;
        java.time.LocalDate localDate78 = null;
        Business.Reservation reservation80 = new Business.Reservation("hi!", (int) 'a', localDate77, localDate78, (double) (byte) -1);
        boolean boolean81 = reservationData65.addReservation(reservation80);
        boolean boolean82 = reservationData50.addReservation(reservation80);
        java.time.LocalDate localDate85 = null;
        java.time.LocalDate localDate86 = null;
        Business.Reservation reservation88 = new Business.Reservation("", (int) (short) 0, localDate85, localDate86, 0.0d);
        boolean boolean89 = reservationData50.addReservation(reservation88);
        java.time.LocalDate localDate90 = reservation88.getCheckOutDate();
        int int91 = reservation88.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean92 = reservationData0.addReservation(reservation88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNull(localDate38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(reservationList40);
        org.junit.Assert.assertNull(localDate47);
        org.junit.Assert.assertNull(localDate48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(reservationList51);
        org.junit.Assert.assertNotNull(reservationList53);
        org.junit.Assert.assertNull(localDate60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(localDate62);
        org.junit.Assert.assertNull(localDate63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(reservationList66);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNull(localDate90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) 32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 10, localDate2, localDate3, (double) (byte) -1);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        Data.ReservationData reservationData48 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList49 = reservationData48.getAllReservations();
        Data.ReservationData reservationData50 = new Data.ReservationData();
        java.time.LocalDate localDate53 = null;
        java.time.LocalDate localDate54 = null;
        Business.Reservation reservation56 = new Business.Reservation("hi!", (int) (short) -1, localDate53, localDate54, (double) 1);
        java.lang.String str57 = reservation56.getGuestName();
        boolean boolean58 = reservationData50.addReservation(reservation56);
        java.time.LocalDate localDate59 = reservation56.getCheckInDate();
        int int60 = reservation56.getRoomNumber();
        boolean boolean61 = reservationData48.addReservation(reservation56);
        int int62 = reservation56.getRoomNumber();
        java.time.LocalDate localDate63 = reservation56.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = reservationData0.addReservation(reservation56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(localDate45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(reservationList49);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(localDate59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(localDate63);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        java.time.LocalDate localDate17 = reservation6.getCheckOutDate();
        java.time.LocalDate localDate18 = reservation6.getCheckInDate();
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
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 10, localDate2, localDate3, 10.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = localDate7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        java.lang.String str23 = reservation19.getGuestName();
        java.time.LocalDate localDate24 = reservation19.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = reservation19.calculateTotalPrice();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(localDate24);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) -1, localDate2, localDate3, 0.0d);
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        int int10 = reservation5.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) (short) 0);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        java.time.LocalDate localDate10 = reservation6.getCheckOutDate();
        java.lang.Class<?> wildcardClass11 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("", (int) (byte) 1, localDate22, localDate23, (double) 1L);
        java.time.LocalDate localDate26 = reservation25.getCheckOutDate();
        boolean boolean27 = reservationData0.addReservation(reservation25);
        Data.ReservationData reservationData28 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList29 = reservationData28.getAllReservations();
        Data.ReservationData reservationData30 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList31 = reservationData30.getAllReservations();
        java.time.LocalDate localDate34 = null;
        java.time.LocalDate localDate35 = null;
        Business.Reservation reservation37 = new Business.Reservation("hi!", (int) (short) -1, localDate34, localDate35, (double) 1);
        java.time.LocalDate localDate38 = reservation37.getCheckOutDate();
        boolean boolean39 = reservationData30.addReservation(reservation37);
        java.time.LocalDate localDate40 = reservation37.getCheckOutDate();
        java.time.LocalDate localDate41 = reservation37.getCheckInDate();
        boolean boolean42 = reservationData28.addReservation(reservation37);
        Data.ReservationData reservationData43 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList44 = reservationData43.getAllReservations();
        java.time.LocalDate localDate47 = null;
        java.time.LocalDate localDate48 = null;
        Business.Reservation reservation50 = new Business.Reservation("hi!", (int) (short) -1, localDate47, localDate48, (double) 1);
        java.lang.String str51 = reservation50.getGuestName();
        boolean boolean52 = reservationData43.addReservation(reservation50);
        java.time.LocalDate localDate55 = null;
        java.time.LocalDate localDate56 = null;
        Business.Reservation reservation58 = new Business.Reservation("hi!", (int) 'a', localDate55, localDate56, (double) (byte) -1);
        boolean boolean59 = reservationData43.addReservation(reservation58);
        boolean boolean60 = reservationData28.addReservation(reservation58);
        java.time.LocalDate localDate63 = null;
        java.time.LocalDate localDate64 = null;
        Business.Reservation reservation66 = new Business.Reservation("", (int) (short) 0, localDate63, localDate64, 0.0d);
        boolean boolean67 = reservationData28.addReservation(reservation66);
        boolean boolean68 = reservationData0.addReservation(reservation66);
        java.lang.Class<?> wildcardClass69 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNull(localDate38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(reservationList44);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, (double) 100);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, (double) 52);
        int int6 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        int int14 = reservation6.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList21 = reservationData0.getAllReservations();
        java.time.LocalDate localDate24 = null;
        java.time.LocalDate localDate25 = null;
        Business.Reservation reservation27 = new Business.Reservation("", 0, localDate24, localDate25, (double) (short) 10);
        boolean boolean28 = reservationData0.addReservation(reservation27);
        java.lang.Class<?> wildcardClass29 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", (int) '4', localDate12, localDate13, (double) 1.0f);
        boolean boolean16 = reservationData0.addReservation(reservation15);
        java.util.List<Business.Reservation> reservationList17 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList18 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList19 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList20 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList21 = reservationData0.getAllReservations();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList21);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 32, localDate2, localDate3, (double) '4');
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        int int10 = reservation7.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = reservation7.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) '#');
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = localDate7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        Business.Reservation reservation22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = reservationData0.addReservation(reservation22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Business.Reservation.getRoomNumber()\" because \"newReservation\" is null");
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
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        java.util.List<Business.Reservation> reservationList22 = reservationData0.getAllReservations();
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        Business.Reservation reservation28 = new Business.Reservation("hi!", 52, localDate25, localDate26, (double) (byte) 1);
        boolean boolean29 = reservationData0.addReservation(reservation28);
        java.time.LocalDate localDate32 = null;
        java.time.LocalDate localDate33 = null;
        Business.Reservation reservation35 = new Business.Reservation("hi!", (int) ' ', localDate32, localDate33, (double) (short) 1);
        java.time.LocalDate localDate36 = reservation35.getCheckInDate();
        boolean boolean37 = reservationData0.addReservation(reservation35);
        java.util.List<Business.Reservation> reservationList38 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList39 = reservationData0.getAllReservations();
        java.time.LocalDate localDate42 = null;
        java.time.LocalDate localDate43 = null;
        Business.Reservation reservation45 = new Business.Reservation("hi!", (int) (short) -1, localDate42, localDate43, (double) 1);
        java.time.LocalDate localDate46 = reservation45.getCheckOutDate();
        java.time.LocalDate localDate47 = reservation45.getCheckOutDate();
        int int48 = reservation45.getRoomNumber();
        int int49 = reservation45.getRoomNumber();
        int int50 = reservation45.getRoomNumber();
        java.lang.String str51 = reservation45.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = reservationData0.addReservation(reservation45);
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
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(reservationList38);
        org.junit.Assert.assertNotNull(reservationList39);
        org.junit.Assert.assertNull(localDate46);
        org.junit.Assert.assertNull(localDate47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        Business.Reservation reservation28 = new Business.Reservation("hi!", 100, localDate25, localDate26, (double) 0.0f);
        boolean boolean29 = reservationData0.addReservation(reservation28);
        java.lang.Class<?> wildcardClass30 = reservation28.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        Data.ReservationData reservationData20 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList21 = reservationData20.getAllReservations();
        Data.ReservationData reservationData22 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList23 = reservationData22.getAllReservations();
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        Business.Reservation reservation29 = new Business.Reservation("hi!", (int) (short) -1, localDate26, localDate27, (double) 1);
        java.time.LocalDate localDate30 = reservation29.getCheckOutDate();
        boolean boolean31 = reservationData22.addReservation(reservation29);
        java.time.LocalDate localDate32 = reservation29.getCheckOutDate();
        java.time.LocalDate localDate33 = reservation29.getCheckInDate();
        boolean boolean34 = reservationData20.addReservation(reservation29);
        Data.ReservationData reservationData35 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList36 = reservationData35.getAllReservations();
        java.time.LocalDate localDate39 = null;
        java.time.LocalDate localDate40 = null;
        Business.Reservation reservation42 = new Business.Reservation("hi!", (int) (short) -1, localDate39, localDate40, (double) 1);
        java.lang.String str43 = reservation42.getGuestName();
        boolean boolean44 = reservationData35.addReservation(reservation42);
        java.time.LocalDate localDate47 = null;
        java.time.LocalDate localDate48 = null;
        Business.Reservation reservation50 = new Business.Reservation("hi!", (int) 'a', localDate47, localDate48, (double) (byte) -1);
        boolean boolean51 = reservationData35.addReservation(reservation50);
        boolean boolean52 = reservationData20.addReservation(reservation50);
        boolean boolean53 = reservationData0.addReservation(reservation50);
        java.util.List<Business.Reservation> reservationList54 = reservationData0.getAllReservations();
        java.time.LocalDate localDate57 = null;
        java.time.LocalDate localDate58 = null;
        Business.Reservation reservation60 = new Business.Reservation("hi!", (int) (byte) 10, localDate57, localDate58, 10.0d);
        java.lang.String str61 = reservation60.getGuestName();
        boolean boolean62 = reservationData0.addReservation(reservation60);
        java.lang.String str63 = reservation60.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(reservationList36);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(reservationList54);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.String str7 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        int int11 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
            java.lang.String str12 = reservation7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
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
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("", (int) (short) 1, localDate23, localDate24, (double) (-1));
        java.lang.String str27 = reservation26.getGuestName();
        java.time.LocalDate localDate28 = reservation26.getCheckInDate();
        boolean boolean29 = reservationData0.addReservation(reservation26);
        java.time.LocalDate localDate32 = null;
        java.time.LocalDate localDate33 = null;
        Business.Reservation reservation35 = new Business.Reservation("", 35, localDate32, localDate33, (double) 97);
        int int36 = reservation35.getRoomNumber();
        boolean boolean37 = reservationData0.addReservation(reservation35);
        Data.ReservationData reservationData38 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList39 = reservationData38.getAllReservations();
        java.time.LocalDate localDate42 = null;
        java.time.LocalDate localDate43 = null;
        Business.Reservation reservation45 = new Business.Reservation("hi!", (int) (short) -1, localDate42, localDate43, (double) 1);
        java.time.LocalDate localDate46 = reservation45.getCheckOutDate();
        boolean boolean47 = reservationData38.addReservation(reservation45);
        java.time.LocalDate localDate48 = reservation45.getCheckInDate();
        java.time.LocalDate localDate49 = reservation45.getCheckOutDate();
        java.time.LocalDate localDate50 = reservation45.getCheckOutDate();
        java.time.LocalDate localDate51 = reservation45.getCheckInDate();
        java.time.LocalDate localDate52 = reservation45.getCheckOutDate();
        int int53 = reservation45.getRoomNumber();
        java.lang.String str54 = reservation45.getGuestName();
        int int55 = reservation45.getRoomNumber();
        java.time.LocalDate localDate56 = reservation45.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = reservationData0.addReservation(reservation45);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(reservationList39);
        org.junit.Assert.assertNull(localDate46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(localDate48);
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertNull(localDate50);
        org.junit.Assert.assertNull(localDate51);
        org.junit.Assert.assertNull(localDate52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(localDate56);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.lang.String str9 = reservation5.getGuestName();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        int int11 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        Business.Reservation reservation39 = new Business.Reservation("", 32, localDate36, localDate37, (double) 52);
        java.lang.String str40 = reservation39.getGuestName();
        boolean boolean41 = reservationData0.addReservation(reservation39);
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
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 0, localDate2, localDate3, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        int int14 = reservation6.getRoomNumber();
        int int15 = reservation6.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = reservation6.toString();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) 'a');
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 10, localDate2, localDate3, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        java.util.List<Business.Reservation> reservationList34 = reservationData0.getAllReservations();
        java.time.LocalDate localDate37 = null;
        java.time.LocalDate localDate38 = null;
        Business.Reservation reservation40 = new Business.Reservation("", (int) (short) 10, localDate37, localDate38, (double) (short) -1);
        boolean boolean41 = reservationData0.addReservation(reservation40);
        java.util.List<Business.Reservation> reservationList42 = reservationData0.getAllReservations();
        Data.ReservationData reservationData43 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList44 = reservationData43.getAllReservations();
        java.util.List<Business.Reservation> reservationList45 = reservationData43.getAllReservations();
        Data.ReservationData reservationData46 = new Data.ReservationData();
        java.time.LocalDate localDate49 = null;
        java.time.LocalDate localDate50 = null;
        Business.Reservation reservation52 = new Business.Reservation("hi!", (int) (short) -1, localDate49, localDate50, (double) 1);
        java.lang.String str53 = reservation52.getGuestName();
        boolean boolean54 = reservationData46.addReservation(reservation52);
        java.lang.String str55 = reservation52.getGuestName();
        int int56 = reservation52.getRoomNumber();
        int int57 = reservation52.getRoomNumber();
        boolean boolean58 = reservationData43.addReservation(reservation52);
        java.time.LocalDate localDate61 = null;
        java.time.LocalDate localDate62 = null;
        Business.Reservation reservation64 = new Business.Reservation("hi!", (int) (short) 10, localDate61, localDate62, (double) (short) 1);
        boolean boolean65 = reservationData43.addReservation(reservation64);
        java.time.LocalDate localDate68 = null;
        java.time.LocalDate localDate69 = null;
        Business.Reservation reservation71 = new Business.Reservation("hi!", (int) 'a', localDate68, localDate69, (double) (byte) -1);
        boolean boolean72 = reservationData43.addReservation(reservation71);
        java.time.LocalDate localDate73 = reservation71.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = reservationData0.addReservation(reservation71);
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
        org.junit.Assert.assertNotNull(reservationList34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(reservationList42);
        org.junit.Assert.assertNotNull(reservationList44);
        org.junit.Assert.assertNotNull(reservationList45);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(localDate73);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 1, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        int int7 = reservation5.getRoomNumber();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) (byte) 0);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, (double) '4');
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", 97, localDate12, localDate13, (double) (byte) -1);
        java.time.LocalDate localDate16 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate17 = reservation15.getCheckOutDate();
        boolean boolean18 = reservationData0.addReservation(reservation15);
        java.util.List<Business.Reservation> reservationList19 = reservationData0.getAllReservations();
        Data.ReservationData reservationData20 = new Data.ReservationData();
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("hi!", (int) (short) -1, localDate23, localDate24, (double) 1);
        java.lang.String str27 = reservation26.getGuestName();
        boolean boolean28 = reservationData20.addReservation(reservation26);
        java.time.LocalDate localDate29 = reservation26.getCheckInDate();
        java.time.LocalDate localDate30 = reservation26.getCheckInDate();
        java.time.LocalDate localDate31 = reservation26.getCheckOutDate();
        java.time.LocalDate localDate32 = reservation26.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = reservationData0.addReservation(reservation26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertNull(localDate32);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) 'a', localDate2, localDate3, 10.0d);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        int int14 = reservation6.getRoomNumber();
        java.time.LocalDate localDate15 = reservation6.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = reservation6.toString();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, (double) (byte) 100);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        java.util.List<Business.Reservation> reservationList31 = reservationData0.getAllReservations();
        Data.ReservationData reservationData32 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList33 = reservationData32.getAllReservations();
        Data.ReservationData reservationData34 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList35 = reservationData34.getAllReservations();
        java.time.LocalDate localDate38 = null;
        java.time.LocalDate localDate39 = null;
        Business.Reservation reservation41 = new Business.Reservation("hi!", (int) (short) -1, localDate38, localDate39, (double) 1);
        java.time.LocalDate localDate42 = reservation41.getCheckOutDate();
        boolean boolean43 = reservationData34.addReservation(reservation41);
        java.time.LocalDate localDate44 = reservation41.getCheckOutDate();
        java.time.LocalDate localDate45 = reservation41.getCheckInDate();
        boolean boolean46 = reservationData32.addReservation(reservation41);
        Data.ReservationData reservationData47 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList48 = reservationData47.getAllReservations();
        java.time.LocalDate localDate51 = null;
        java.time.LocalDate localDate52 = null;
        Business.Reservation reservation54 = new Business.Reservation("hi!", (int) (short) -1, localDate51, localDate52, (double) 1);
        java.lang.String str55 = reservation54.getGuestName();
        boolean boolean56 = reservationData47.addReservation(reservation54);
        java.time.LocalDate localDate59 = null;
        java.time.LocalDate localDate60 = null;
        Business.Reservation reservation62 = new Business.Reservation("hi!", (int) 'a', localDate59, localDate60, (double) (byte) -1);
        boolean boolean63 = reservationData47.addReservation(reservation62);
        boolean boolean64 = reservationData32.addReservation(reservation62);
        java.time.LocalDate localDate67 = null;
        java.time.LocalDate localDate68 = null;
        Business.Reservation reservation70 = new Business.Reservation("", (int) (short) 0, localDate67, localDate68, 0.0d);
        boolean boolean71 = reservationData32.addReservation(reservation70);
        java.time.LocalDate localDate74 = null;
        java.time.LocalDate localDate75 = null;
        Business.Reservation reservation77 = new Business.Reservation("hi!", (int) (short) 1, localDate74, localDate75, (double) 1);
        int int78 = reservation77.getRoomNumber();
        boolean boolean79 = reservationData32.addReservation(reservation77);
        boolean boolean80 = reservationData0.addReservation(reservation77);
        // The following exception was thrown during execution in test generation
        try {
            double double81 = reservation77.calculateTotalPrice();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNotNull(reservationList35);
        org.junit.Assert.assertNull(localDate42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(localDate44);
        org.junit.Assert.assertNull(localDate45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(reservationList48);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        // The following exception was thrown during execution in test generation
        try {
            double double23 = reservation19.calculateTotalPrice();
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
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        java.time.LocalDate localDate25 = reservation21.getCheckOutDate();
        int int26 = reservation21.getRoomNumber();
        java.time.LocalDate localDate27 = reservation21.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = reservation21.toString();
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
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(localDate27);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        java.util.List<Business.Reservation> reservationList21 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList22 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList23 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList24 = reservationData0.getAllReservations();
        Data.ReservationData reservationData25 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList26 = reservationData25.getAllReservations();
        java.time.LocalDate localDate29 = null;
        java.time.LocalDate localDate30 = null;
        Business.Reservation reservation32 = new Business.Reservation("hi!", (int) (short) -1, localDate29, localDate30, (double) 1);
        java.time.LocalDate localDate33 = reservation32.getCheckOutDate();
        boolean boolean34 = reservationData25.addReservation(reservation32);
        java.time.LocalDate localDate35 = reservation32.getCheckInDate();
        java.time.LocalDate localDate36 = reservation32.getCheckOutDate();
        java.time.LocalDate localDate37 = reservation32.getCheckOutDate();
        java.time.LocalDate localDate38 = reservation32.getCheckInDate();
        java.time.LocalDate localDate39 = reservation32.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = reservationData0.addReservation(reservation32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
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
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertNull(localDate37);
        org.junit.Assert.assertNull(localDate38);
        org.junit.Assert.assertNull(localDate39);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        Business.Reservation reservation28 = new Business.Reservation("", (int) (short) 100, localDate25, localDate26, (-1.0d));
        boolean boolean29 = reservationData0.addReservation(reservation28);
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        java.time.LocalDate localDate13 = reservation6.getCheckInDate();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        java.util.List<Business.Reservation> reservationList24 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList25 = reservationData0.getAllReservations();
        Data.ReservationData reservationData26 = new Data.ReservationData();
        java.time.LocalDate localDate29 = null;
        java.time.LocalDate localDate30 = null;
        Business.Reservation reservation32 = new Business.Reservation("", 0, localDate29, localDate30, (double) 10.0f);
        java.time.LocalDate localDate33 = reservation32.getCheckInDate();
        boolean boolean34 = reservationData26.addReservation(reservation32);
        java.time.LocalDate localDate35 = reservation32.getCheckOutDate();
        int int36 = reservation32.getRoomNumber();
        int int37 = reservation32.getRoomNumber();
        java.lang.String str38 = reservation32.getGuestName();
        boolean boolean39 = reservationData0.addReservation(reservation32);
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
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDate8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        Business.Reservation reservation29 = new Business.Reservation("", (int) '#', localDate26, localDate27, (double) 100L);
        java.time.LocalDate localDate30 = reservation29.getCheckOutDate();
        boolean boolean31 = reservationData0.addReservation(reservation29);
        java.util.List<Business.Reservation> reservationList32 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList34 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList35 = reservationData0.getAllReservations();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNotNull(reservationList34);
        org.junit.Assert.assertNotNull(reservationList35);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) (byte) 10);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 100.0f);
        java.lang.String str6 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, (double) 97);
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.String str7 = reservation5.getGuestName();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.util.List<Business.Reservation> reservationList17 = reservationData15.getAllReservations();
        Data.ReservationData reservationData18 = new Data.ReservationData();
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("hi!", (int) (short) -1, localDate21, localDate22, (double) 1);
        java.lang.String str25 = reservation24.getGuestName();
        boolean boolean26 = reservationData18.addReservation(reservation24);
        java.time.LocalDate localDate27 = reservation24.getCheckInDate();
        boolean boolean28 = reservationData15.addReservation(reservation24);
        java.time.LocalDate localDate31 = null;
        java.time.LocalDate localDate32 = null;
        Business.Reservation reservation34 = new Business.Reservation("hi!", 97, localDate31, localDate32, (double) 0L);
        java.time.LocalDate localDate35 = reservation34.getCheckOutDate();
        java.lang.String str36 = reservation34.getGuestName();
        boolean boolean37 = reservationData15.addReservation(reservation34);
        java.util.List<Business.Reservation> reservationList38 = reservationData15.getAllReservations();
        java.time.LocalDate localDate41 = null;
        java.time.LocalDate localDate42 = null;
        Business.Reservation reservation44 = new Business.Reservation("", (int) '#', localDate41, localDate42, (double) (short) 100);
        boolean boolean45 = reservationData15.addReservation(reservation44);
        boolean boolean46 = reservationData0.addReservation(reservation44);
        java.time.LocalDate localDate47 = reservation44.getCheckOutDate();
        java.lang.String str48 = reservation44.getGuestName();
        java.lang.String str49 = reservation44.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double50 = reservation44.calculateTotalPrice();
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
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(reservationList38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(localDate47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 100, localDate2, localDate3, (double) (short) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.lang.String str12 = reservation8.getGuestName();
        java.lang.Class<?> wildcardClass13 = reservation8.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.lang.String str8 = reservation5.getGuestName();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = localDate10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        Data.ReservationData reservationData20 = new Data.ReservationData();
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("hi!", (int) 'a', localDate23, localDate24, (double) (byte) -1);
        boolean boolean27 = reservationData20.addReservation(reservation26);
        Data.ReservationData reservationData28 = new Data.ReservationData();
        java.time.LocalDate localDate31 = null;
        java.time.LocalDate localDate32 = null;
        Business.Reservation reservation34 = new Business.Reservation("hi!", (int) (short) -1, localDate31, localDate32, (double) 1);
        java.lang.String str35 = reservation34.getGuestName();
        boolean boolean36 = reservationData28.addReservation(reservation34);
        java.lang.String str37 = reservation34.getGuestName();
        int int38 = reservation34.getRoomNumber();
        java.lang.String str39 = reservation34.getGuestName();
        int int40 = reservation34.getRoomNumber();
        boolean boolean41 = reservationData20.addReservation(reservation34);
        boolean boolean42 = reservationData0.addReservation(reservation34);
        int int43 = reservation34.getRoomNumber();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        int int10 = reservation5.getRoomNumber();
        java.time.LocalDate localDate11 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) (short) 10, localDate22, localDate23, (double) (-1L));
        java.time.LocalDate localDate26 = reservation25.getCheckOutDate();
        boolean boolean27 = reservationData0.addReservation(reservation25);
        java.time.LocalDate localDate28 = reservation25.getCheckOutDate();
        int int29 = reservation25.getRoomNumber();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        java.time.LocalDate localDate23 = reservation19.getCheckOutDate();
        int int24 = reservation19.getRoomNumber();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        java.lang.String str20 = reservation17.getGuestName();
        java.lang.Class<?> wildcardClass21 = reservation17.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        int int9 = reservation8.getRoomNumber();
        java.time.LocalDate localDate10 = reservation8.getCheckInDate();
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate12 = reservation8.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation8.getCheckOutDate();
        java.lang.String str14 = reservation8.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) -1, localDate2, localDate3, (double) 0L);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = reservation7.toString();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        java.util.List<Business.Reservation> reservationList24 = reservationData23.getAllReservations();
        Data.ReservationData reservationData25 = new Data.ReservationData();
        java.time.LocalDate localDate28 = null;
        java.time.LocalDate localDate29 = null;
        Business.Reservation reservation31 = new Business.Reservation("hi!", (int) (short) -1, localDate28, localDate29, (double) 1);
        java.lang.String str32 = reservation31.getGuestName();
        boolean boolean33 = reservationData25.addReservation(reservation31);
        java.time.LocalDate localDate34 = reservation31.getCheckInDate();
        int int35 = reservation31.getRoomNumber();
        boolean boolean36 = reservationData23.addReservation(reservation31);
        int int37 = reservation31.getRoomNumber();
        java.time.LocalDate localDate38 = reservation31.getCheckOutDate();
        int int39 = reservation31.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = reservationData0.addReservation(reservation31);
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
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(localDate38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.lang.String str10 = reservation5.getGuestName();
        java.lang.String str11 = reservation5.getGuestName();
        int int12 = reservation5.getRoomNumber();
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
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        java.lang.String str11 = reservation5.getGuestName();
        java.time.LocalDate localDate12 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        java.lang.Class<?> wildcardClass14 = reservation8.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 10, localDate2, localDate3, (double) (byte) 10);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        java.time.LocalDate localDate40 = reservation38.getCheckOutDate();
        java.time.LocalDate localDate41 = reservation38.getCheckOutDate();
        java.time.LocalDate localDate42 = reservation38.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertNull(localDate42);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        int int14 = reservation6.getRoomNumber();
        java.lang.String str15 = reservation6.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = reservation6.toString();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        int int9 = reservation5.getRoomNumber();
        int int10 = reservation5.getRoomNumber();
        java.lang.String str11 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, (double) (short) 10);
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        java.lang.Class<?> wildcardClass14 = reservationList13.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        Business.Reservation reservation53 = new Business.Reservation("", 97, localDate50, localDate51, (double) (byte) -1);
        java.time.LocalDate localDate54 = reservation53.getCheckOutDate();
        java.time.LocalDate localDate55 = reservation53.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = reservationData0.addReservation(reservation53);
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
        org.junit.Assert.assertNull(localDate54);
        org.junit.Assert.assertNull(localDate55);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, (double) 100.0f);
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, (double) (short) -1);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        Business.Reservation reservation29 = new Business.Reservation("", 0, localDate26, localDate27, 1.0d);
        boolean boolean30 = reservationData0.addReservation(reservation29);
        java.lang.String str31 = reservation29.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = reservation29.toString();
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
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        java.time.LocalDate localDate22 = reservation14.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = reservation14.calculateTotalPrice();
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
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) (-1L));
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("", (int) (short) 0, localDate23, localDate24, 0.0d);
        java.lang.String str27 = reservation26.getGuestName();
        boolean boolean28 = reservationData0.addReservation(reservation26);
        java.lang.String str29 = reservation26.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = reservation26.toString();
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
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        Data.ReservationData reservationData15 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList16 = reservationData15.getAllReservations();
        java.util.List<Business.Reservation> reservationList17 = reservationData15.getAllReservations();
        Data.ReservationData reservationData18 = new Data.ReservationData();
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("hi!", (int) (short) -1, localDate21, localDate22, (double) 1);
        java.lang.String str25 = reservation24.getGuestName();
        boolean boolean26 = reservationData18.addReservation(reservation24);
        java.time.LocalDate localDate27 = reservation24.getCheckInDate();
        boolean boolean28 = reservationData15.addReservation(reservation24);
        java.time.LocalDate localDate31 = null;
        java.time.LocalDate localDate32 = null;
        Business.Reservation reservation34 = new Business.Reservation("hi!", 97, localDate31, localDate32, (double) 0L);
        java.time.LocalDate localDate35 = reservation34.getCheckOutDate();
        java.lang.String str36 = reservation34.getGuestName();
        boolean boolean37 = reservationData15.addReservation(reservation34);
        java.util.List<Business.Reservation> reservationList38 = reservationData15.getAllReservations();
        java.time.LocalDate localDate41 = null;
        java.time.LocalDate localDate42 = null;
        Business.Reservation reservation44 = new Business.Reservation("", (int) '#', localDate41, localDate42, (double) (short) 100);
        boolean boolean45 = reservationData15.addReservation(reservation44);
        boolean boolean46 = reservationData0.addReservation(reservation44);
        java.time.LocalDate localDate47 = reservation44.getCheckOutDate();
        int int48 = reservation44.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = reservation44.toString();
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
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(reservationList38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(localDate47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        java.util.List<Business.Reservation> reservationList17 = reservationData0.getAllReservations();
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        Business.Reservation reservation23 = new Business.Reservation("", 0, localDate20, localDate21, 1.0d);
        boolean boolean24 = reservationData0.addReservation(reservation23);
        Data.ReservationData reservationData25 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList26 = reservationData25.getAllReservations();
        java.util.List<Business.Reservation> reservationList27 = reservationData25.getAllReservations();
        Data.ReservationData reservationData28 = new Data.ReservationData();
        java.time.LocalDate localDate31 = null;
        java.time.LocalDate localDate32 = null;
        Business.Reservation reservation34 = new Business.Reservation("hi!", (int) (short) -1, localDate31, localDate32, (double) 1);
        java.lang.String str35 = reservation34.getGuestName();
        boolean boolean36 = reservationData28.addReservation(reservation34);
        java.lang.String str37 = reservation34.getGuestName();
        int int38 = reservation34.getRoomNumber();
        int int39 = reservation34.getRoomNumber();
        boolean boolean40 = reservationData25.addReservation(reservation34);
        java.time.LocalDate localDate43 = null;
        java.time.LocalDate localDate44 = null;
        Business.Reservation reservation46 = new Business.Reservation("hi!", (int) (short) 10, localDate43, localDate44, (double) (short) 1);
        boolean boolean47 = reservationData25.addReservation(reservation46);
        java.time.LocalDate localDate50 = null;
        java.time.LocalDate localDate51 = null;
        Business.Reservation reservation53 = new Business.Reservation("hi!", (int) 'a', localDate50, localDate51, (double) (byte) -1);
        boolean boolean54 = reservationData25.addReservation(reservation53);
        int int55 = reservation53.getRoomNumber();
        java.lang.String str56 = reservation53.getGuestName();
        java.time.LocalDate localDate57 = reservation53.getCheckInDate();
        int int58 = reservation53.getRoomNumber();
        java.time.LocalDate localDate59 = reservation53.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = reservationData0.addReservation(reservation53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNotNull(reservationList27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNull(localDate57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 97 + "'", int58 == 97);
        org.junit.Assert.assertNull(localDate59);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        Data.ReservationData reservationData20 = new Data.ReservationData();
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("hi!", (int) 'a', localDate23, localDate24, (double) (byte) -1);
        boolean boolean27 = reservationData20.addReservation(reservation26);
        Data.ReservationData reservationData28 = new Data.ReservationData();
        java.time.LocalDate localDate31 = null;
        java.time.LocalDate localDate32 = null;
        Business.Reservation reservation34 = new Business.Reservation("hi!", (int) (short) -1, localDate31, localDate32, (double) 1);
        java.lang.String str35 = reservation34.getGuestName();
        boolean boolean36 = reservationData28.addReservation(reservation34);
        java.lang.String str37 = reservation34.getGuestName();
        int int38 = reservation34.getRoomNumber();
        java.lang.String str39 = reservation34.getGuestName();
        int int40 = reservation34.getRoomNumber();
        boolean boolean41 = reservationData20.addReservation(reservation34);
        boolean boolean42 = reservationData0.addReservation(reservation34);
        java.util.List<Business.Reservation> reservationList43 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList44 = reservationData0.getAllReservations();
        java.time.LocalDate localDate47 = null;
        java.time.LocalDate localDate48 = null;
        Business.Reservation reservation50 = new Business.Reservation("hi!", 97, localDate47, localDate48, (double) 0L);
        java.time.LocalDate localDate51 = reservation50.getCheckOutDate();
        java.time.LocalDate localDate52 = reservation50.getCheckOutDate();
        java.time.LocalDate localDate53 = reservation50.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = reservationData0.addReservation(reservation50);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(reservationList43);
        org.junit.Assert.assertNotNull(reservationList44);
        org.junit.Assert.assertNull(localDate51);
        org.junit.Assert.assertNull(localDate52);
        org.junit.Assert.assertNull(localDate53);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
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
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList11 = reservationData0.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", (int) '#', localDate14, localDate15, (double) 100L);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) 'a', localDate22, localDate23, (double) (byte) -1);
        int int26 = reservation25.getRoomNumber();
        java.time.LocalDate localDate27 = reservation25.getCheckOutDate();
        boolean boolean28 = reservationData0.addReservation(reservation25);
        java.util.List<Business.Reservation> reservationList29 = reservationData0.getAllReservations();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(reservationList29);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 35, localDate2, localDate3, (double) 1L);
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
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (-1), localDate2, localDate3, (double) 1);
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
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (-1.0f));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate10 = reservation8.getCheckInDate();
        java.time.LocalDate localDate11 = reservation8.getCheckOutDate();
        java.time.LocalDate localDate12 = reservation8.getCheckInDate();
        java.lang.String str13 = reservation8.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = reservation8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) -1, localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        Business.Reservation reservation29 = new Business.Reservation("", (int) '#', localDate26, localDate27, (double) 100L);
        java.time.LocalDate localDate30 = reservation29.getCheckOutDate();
        boolean boolean31 = reservationData0.addReservation(reservation29);
        java.util.List<Business.Reservation> reservationList32 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("", 1, localDate36, localDate37, (double) (-1));
        java.time.LocalDate localDate40 = reservation39.getCheckOutDate();
        java.time.LocalDate localDate41 = reservation39.getCheckOutDate();
        java.lang.String str42 = reservation39.getGuestName();
        java.lang.String str43 = reservation39.getGuestName();
        boolean boolean44 = reservationData0.addReservation(reservation39);
        Data.ReservationData reservationData45 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList46 = reservationData45.getAllReservations();
        java.util.List<Business.Reservation> reservationList47 = reservationData45.getAllReservations();
        java.util.List<Business.Reservation> reservationList48 = reservationData45.getAllReservations();
        java.time.LocalDate localDate51 = null;
        java.time.LocalDate localDate52 = null;
        Business.Reservation reservation54 = new Business.Reservation("hi!", (int) (short) -1, localDate51, localDate52, (double) 1);
        java.time.LocalDate localDate55 = reservation54.getCheckOutDate();
        boolean boolean56 = reservationData45.addReservation(reservation54);
        java.time.LocalDate localDate59 = null;
        java.time.LocalDate localDate60 = null;
        Business.Reservation reservation62 = new Business.Reservation("", (int) '4', localDate59, localDate60, (double) 1.0f);
        java.lang.String str63 = reservation62.getGuestName();
        boolean boolean64 = reservationData45.addReservation(reservation62);
        java.time.LocalDate localDate67 = null;
        java.time.LocalDate localDate68 = null;
        Business.Reservation reservation70 = new Business.Reservation("hi!", (int) (short) 10, localDate67, localDate68, (double) (-1L));
        java.time.LocalDate localDate71 = reservation70.getCheckOutDate();
        boolean boolean72 = reservationData45.addReservation(reservation70);
        java.time.LocalDate localDate73 = reservation70.getCheckOutDate();
        boolean boolean74 = reservationData0.addReservation(reservation70);
        java.util.List<Business.Reservation> reservationList75 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass76 = reservationData0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(reservationList46);
        org.junit.Assert.assertNotNull(reservationList47);
        org.junit.Assert.assertNotNull(reservationList48);
        org.junit.Assert.assertNull(localDate55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(localDate71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(localDate73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(reservationList75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) 'a', localDate2, localDate3, (double) (short) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        java.lang.String str15 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) 100L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        Business.Reservation reservation26 = new Business.Reservation("hi!", (int) (short) -1, localDate23, localDate24, (double) 1);
        java.lang.String str27 = reservation26.getGuestName();
        int int28 = reservation26.getRoomNumber();
        java.time.LocalDate localDate29 = reservation26.getCheckOutDate();
        java.lang.String str30 = reservation26.getGuestName();
        boolean boolean31 = reservationData0.addReservation(reservation26);
        java.util.List<Business.Reservation> reservationList32 = reservationData0.getAllReservations();
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("", (int) '4', localDate35, localDate36, (double) 1.0f);
        boolean boolean39 = reservationData0.addReservation(reservation38);
        java.time.LocalDate localDate42 = null;
        java.time.LocalDate localDate43 = null;
        Business.Reservation reservation45 = new Business.Reservation("", 0, localDate42, localDate43, 10.0d);
        java.time.LocalDate localDate46 = reservation45.getCheckOutDate();
        java.time.LocalDate localDate47 = reservation45.getCheckOutDate();
        java.time.LocalDate localDate48 = reservation45.getCheckOutDate();
        boolean boolean49 = reservationData0.addReservation(reservation45);
        Data.ReservationData reservationData50 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList51 = reservationData50.getAllReservations();
        Data.ReservationData reservationData52 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList53 = reservationData52.getAllReservations();
        java.time.LocalDate localDate56 = null;
        java.time.LocalDate localDate57 = null;
        Business.Reservation reservation59 = new Business.Reservation("hi!", (int) (short) -1, localDate56, localDate57, (double) 1);
        java.time.LocalDate localDate60 = reservation59.getCheckOutDate();
        boolean boolean61 = reservationData52.addReservation(reservation59);
        java.time.LocalDate localDate62 = reservation59.getCheckOutDate();
        java.time.LocalDate localDate63 = reservation59.getCheckInDate();
        boolean boolean64 = reservationData50.addReservation(reservation59);
        java.util.List<Business.Reservation> reservationList65 = reservationData50.getAllReservations();
        java.time.LocalDate localDate68 = null;
        java.time.LocalDate localDate69 = null;
        Business.Reservation reservation71 = new Business.Reservation("", 1, localDate68, localDate69, (double) (-1));
        boolean boolean72 = reservationData50.addReservation(reservation71);
        int int73 = reservation71.getRoomNumber();
        boolean boolean74 = reservationData0.addReservation(reservation71);
        Data.ReservationData reservationData75 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList76 = reservationData75.getAllReservations();
        java.time.LocalDate localDate79 = null;
        java.time.LocalDate localDate80 = null;
        Business.Reservation reservation82 = new Business.Reservation("hi!", (int) (short) -1, localDate79, localDate80, (double) 1);
        java.time.LocalDate localDate83 = reservation82.getCheckOutDate();
        boolean boolean84 = reservationData75.addReservation(reservation82);
        java.time.LocalDate localDate85 = reservation82.getCheckOutDate();
        java.time.LocalDate localDate86 = reservation82.getCheckInDate();
        int int87 = reservation82.getRoomNumber();
        int int88 = reservation82.getRoomNumber();
        java.time.LocalDate localDate89 = reservation82.getCheckOutDate();
        java.time.LocalDate localDate90 = reservation82.getCheckInDate();
        java.time.LocalDate localDate91 = reservation82.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean92 = reservationData0.addReservation(reservation82);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(localDate46);
        org.junit.Assert.assertNull(localDate47);
        org.junit.Assert.assertNull(localDate48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(reservationList51);
        org.junit.Assert.assertNotNull(reservationList53);
        org.junit.Assert.assertNull(localDate60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(localDate62);
        org.junit.Assert.assertNull(localDate63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(reservationList65);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(reservationList76);
        org.junit.Assert.assertNull(localDate83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNull(localDate85);
        org.junit.Assert.assertNull(localDate86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNull(localDate89);
        org.junit.Assert.assertNull(localDate90);
        org.junit.Assert.assertNull(localDate91);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (short) -1);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        int int11 = reservation5.getRoomNumber();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 100, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        java.lang.String str40 = reservation38.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double41 = reservation38.calculateTotalPrice();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        java.lang.Class<?> wildcardClass24 = reservationData0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) (-1));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 100, localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.lang.String str9 = reservation5.getGuestName();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        int int11 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) 'a', localDate2, localDate3, (double) (byte) 100);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", 97, localDate12, localDate13, (double) (byte) -1);
        java.time.LocalDate localDate16 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate17 = reservation15.getCheckOutDate();
        boolean boolean18 = reservationData0.addReservation(reservation15);
        int int19 = reservation15.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = reservation15.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 100, localDate2, localDate3, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("", (int) (byte) 10, localDate4, localDate5, (double) 1.0f);
        boolean boolean8 = reservationData0.addReservation(reservation7);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass10 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 0, localDate2, localDate3, 100.0d);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) (short) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        java.time.LocalDate localDate14 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = localDate14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 100);
        java.lang.String str6 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 52, localDate2, localDate3, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.String str11 = reservation6.getGuestName();
        java.time.LocalDate localDate12 = reservation6.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("", (int) (short) 0, localDate23, localDate24, 0.0d);
        java.lang.String str27 = reservation26.getGuestName();
        boolean boolean28 = reservationData0.addReservation(reservation26);
        java.util.List<Business.Reservation> reservationList29 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList30 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList31 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass32 = reservationData0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.time.LocalDate localDate13 = null;
        java.time.LocalDate localDate14 = null;
        Business.Reservation reservation16 = new Business.Reservation("", (int) (byte) 0, localDate13, localDate14, (double) (short) 10);
        boolean boolean17 = reservationData0.addReservation(reservation16);
        java.util.List<Business.Reservation> reservationList18 = reservationData0.getAllReservations();
        Data.ReservationData reservationData19 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList20 = reservationData19.getAllReservations();
        java.util.List<Business.Reservation> reservationList21 = reservationData19.getAllReservations();
        Data.ReservationData reservationData22 = new Data.ReservationData();
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        Business.Reservation reservation28 = new Business.Reservation("hi!", (int) (short) -1, localDate25, localDate26, (double) 1);
        java.lang.String str29 = reservation28.getGuestName();
        boolean boolean30 = reservationData22.addReservation(reservation28);
        java.lang.String str31 = reservation28.getGuestName();
        int int32 = reservation28.getRoomNumber();
        int int33 = reservation28.getRoomNumber();
        boolean boolean34 = reservationData19.addReservation(reservation28);
        java.time.LocalDate localDate37 = null;
        java.time.LocalDate localDate38 = null;
        Business.Reservation reservation40 = new Business.Reservation("hi!", (int) (byte) 0, localDate37, localDate38, (double) 0L);
        boolean boolean41 = reservationData19.addReservation(reservation40);
        java.time.LocalDate localDate44 = null;
        java.time.LocalDate localDate45 = null;
        Business.Reservation reservation47 = new Business.Reservation("", (int) (byte) 1, localDate44, localDate45, (double) 0L);
        java.lang.String str48 = reservation47.getGuestName();
        boolean boolean49 = reservationData19.addReservation(reservation47);
        boolean boolean50 = reservationData0.addReservation(reservation47);
        // The following exception was thrown during execution in test generation
        try {
            double double51 = reservation47.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("", (int) '4', localDate12, localDate13, (double) 1.0f);
        boolean boolean16 = reservationData0.addReservation(reservation15);
        java.util.List<Business.Reservation> reservationList17 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList18 = reservationData0.getAllReservations();
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("hi!", (int) ' ', localDate21, localDate22, (double) (short) 1);
        java.time.LocalDate localDate25 = reservation24.getCheckOutDate();
        java.time.LocalDate localDate26 = reservation24.getCheckOutDate();
        int int27 = reservation24.getRoomNumber();
        int int28 = reservation24.getRoomNumber();
        java.time.LocalDate localDate29 = reservation24.getCheckOutDate();
        java.lang.String str30 = reservation24.getGuestName();
        boolean boolean31 = reservationData0.addReservation(reservation24);
        // The following exception was thrown during execution in test generation
        try {
            double double32 = reservation24.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) (short) 10, localDate22, localDate23, (double) (-1L));
        java.time.LocalDate localDate26 = reservation25.getCheckOutDate();
        boolean boolean27 = reservationData0.addReservation(reservation25);
        java.util.List<Business.Reservation> reservationList28 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList29 = reservationData0.getAllReservations();
        Business.Reservation reservation30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = reservationData0.addReservation(reservation30);
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
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(reservationList28);
        org.junit.Assert.assertNotNull(reservationList29);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        java.time.LocalDate localDate37 = null;
        java.time.LocalDate localDate38 = null;
        Business.Reservation reservation40 = new Business.Reservation("", 0, localDate37, localDate38, 10.0d);
        java.lang.String str41 = reservation40.getGuestName();
        boolean boolean42 = reservationData0.addReservation(reservation40);
        java.time.LocalDate localDate45 = null;
        java.time.LocalDate localDate46 = null;
        Business.Reservation reservation48 = new Business.Reservation("", (int) (short) 0, localDate45, localDate46, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = reservationData0.addReservation(reservation48);
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
        org.junit.Assert.assertNotNull(reservationList34);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) 10.0f);
        int int6 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, 0.0d);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        Business.Reservation reservation29 = new Business.Reservation("", (int) '#', localDate26, localDate27, (double) 100L);
        java.time.LocalDate localDate30 = reservation29.getCheckOutDate();
        boolean boolean31 = reservationData0.addReservation(reservation29);
        java.util.List<Business.Reservation> reservationList32 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList34 = reservationData0.getAllReservations();
        Data.ReservationData reservationData35 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList36 = reservationData35.getAllReservations();
        java.util.List<Business.Reservation> reservationList37 = reservationData35.getAllReservations();
        Data.ReservationData reservationData38 = new Data.ReservationData();
        java.time.LocalDate localDate41 = null;
        java.time.LocalDate localDate42 = null;
        Business.Reservation reservation44 = new Business.Reservation("hi!", (int) (short) -1, localDate41, localDate42, (double) 1);
        java.lang.String str45 = reservation44.getGuestName();
        boolean boolean46 = reservationData38.addReservation(reservation44);
        java.lang.String str47 = reservation44.getGuestName();
        int int48 = reservation44.getRoomNumber();
        int int49 = reservation44.getRoomNumber();
        boolean boolean50 = reservationData35.addReservation(reservation44);
        java.time.LocalDate localDate53 = null;
        java.time.LocalDate localDate54 = null;
        Business.Reservation reservation56 = new Business.Reservation("hi!", (int) (short) 1, localDate53, localDate54, 0.0d);
        int int57 = reservation56.getRoomNumber();
        boolean boolean58 = reservationData35.addReservation(reservation56);
        int int59 = reservation56.getRoomNumber();
        boolean boolean60 = reservationData0.addReservation(reservation56);
        java.lang.Class<?> wildcardClass61 = reservation56.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNotNull(reservationList34);
        org.junit.Assert.assertNotNull(reservationList36);
        org.junit.Assert.assertNotNull(reservationList37);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, (double) 32);
        int int6 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) '4', localDate22, localDate23, (double) (-1.0f));
        java.time.LocalDate localDate26 = reservation25.getCheckOutDate();
        java.lang.String str27 = reservation25.getGuestName();
        java.time.LocalDate localDate28 = reservation25.getCheckOutDate();
        boolean boolean29 = reservationData0.addReservation(reservation25);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = reservation25.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        java.time.LocalDate localDate13 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate14 = reservation7.getCheckInDate();
        java.time.LocalDate localDate15 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = reservation7.calculateTotalPrice();
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
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 10, localDate2, localDate3, (double) 0);
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
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) (-1));
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDate8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) 0.0f);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        java.time.LocalDate localDate18 = reservation6.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = localDate18.getClass();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        int int10 = reservation6.getRoomNumber();
        java.time.LocalDate localDate11 = reservation6.getCheckInDate();
        int int12 = reservation6.getRoomNumber();
        java.time.LocalDate localDate13 = reservation6.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        Business.Reservation reservation28 = new Business.Reservation("hi!", 100, localDate25, localDate26, (double) 0.0f);
        boolean boolean29 = reservationData0.addReservation(reservation28);
        Data.ReservationData reservationData30 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList31 = reservationData30.getAllReservations();
        java.util.List<Business.Reservation> reservationList32 = reservationData30.getAllReservations();
        Data.ReservationData reservationData33 = new Data.ReservationData();
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("hi!", (int) (short) -1, localDate36, localDate37, (double) 1);
        java.lang.String str40 = reservation39.getGuestName();
        boolean boolean41 = reservationData33.addReservation(reservation39);
        java.time.LocalDate localDate42 = reservation39.getCheckInDate();
        boolean boolean43 = reservationData30.addReservation(reservation39);
        java.time.LocalDate localDate46 = null;
        java.time.LocalDate localDate47 = null;
        Business.Reservation reservation49 = new Business.Reservation("hi!", 97, localDate46, localDate47, (double) 0L);
        java.time.LocalDate localDate50 = reservation49.getCheckOutDate();
        java.lang.String str51 = reservation49.getGuestName();
        boolean boolean52 = reservationData30.addReservation(reservation49);
        java.util.List<Business.Reservation> reservationList53 = reservationData30.getAllReservations();
        java.time.LocalDate localDate56 = null;
        java.time.LocalDate localDate57 = null;
        Business.Reservation reservation59 = new Business.Reservation("", (int) '#', localDate56, localDate57, (double) (short) 100);
        boolean boolean60 = reservationData30.addReservation(reservation59);
        java.util.List<Business.Reservation> reservationList61 = reservationData30.getAllReservations();
        java.time.LocalDate localDate64 = null;
        java.time.LocalDate localDate65 = null;
        Business.Reservation reservation67 = new Business.Reservation("hi!", (int) (short) 100, localDate64, localDate65, (double) '#');
        boolean boolean68 = reservationData30.addReservation(reservation67);
        java.lang.String str69 = reservation67.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = reservationData0.addReservation(reservation67);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(localDate42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(localDate50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(reservationList53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(reservationList61);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("", (int) (short) 1, localDate23, localDate24, (double) (-1));
        java.lang.String str27 = reservation26.getGuestName();
        java.time.LocalDate localDate28 = reservation26.getCheckInDate();
        boolean boolean29 = reservationData0.addReservation(reservation26);
        java.util.List<Business.Reservation> reservationList30 = reservationData0.getAllReservations();
        java.time.LocalDate localDate33 = null;
        java.time.LocalDate localDate34 = null;
        Business.Reservation reservation36 = new Business.Reservation("hi!", (int) (byte) 0, localDate33, localDate34, (double) 10);
        boolean boolean37 = reservationData0.addReservation(reservation36);
        java.time.LocalDate localDate40 = null;
        java.time.LocalDate localDate41 = null;
        Business.Reservation reservation43 = new Business.Reservation("hi!", (int) (short) 1, localDate40, localDate41, (double) 1);
        java.lang.String str44 = reservation43.getGuestName();
        java.time.LocalDate localDate45 = reservation43.getCheckOutDate();
        java.time.LocalDate localDate46 = reservation43.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = reservationData0.addReservation(reservation43);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNull(localDate45);
        org.junit.Assert.assertNull(localDate46);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        Business.Reservation reservation16 = new Business.Reservation("hi!", (int) (byte) 100, localDate13, localDate14, (double) 10.0f);
        boolean boolean17 = reservationData0.addReservation(reservation16);
        java.time.LocalDate localDate18 = reservation16.getCheckOutDate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        java.time.LocalDate localDate22 = reservation14.getCheckInDate();
        java.time.LocalDate localDate23 = reservation14.getCheckOutDate();
        java.lang.String str24 = reservation14.getGuestName();
        int int25 = reservation14.getRoomNumber();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, 1.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
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
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 100, localDate2, localDate3, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        java.lang.String str13 = reservation7.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, 10.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = localDate7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        java.time.LocalDate localDate18 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate19 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate20 = reservation7.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        java.time.LocalDate localDate44 = null;
        java.time.LocalDate localDate45 = null;
        Business.Reservation reservation47 = new Business.Reservation("hi!", (int) (byte) 100, localDate44, localDate45, (double) (short) 100);
        int int48 = reservation47.getRoomNumber();
        java.time.LocalDate localDate49 = reservation47.getCheckOutDate();
        boolean boolean50 = reservationData0.addReservation(reservation47);
        java.time.LocalDate localDate53 = null;
        java.time.LocalDate localDate54 = null;
        Business.Reservation reservation56 = new Business.Reservation("hi!", (int) (byte) 1, localDate53, localDate54, (double) (byte) 100);
        boolean boolean57 = reservationData0.addReservation(reservation56);
        int int58 = reservation56.getRoomNumber();
        java.time.LocalDate localDate59 = reservation56.getCheckOutDate();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNull(localDate59);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        java.time.LocalDate localDate11 = reservation5.getCheckInDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.lang.String str9 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        java.time.LocalDate localDate48 = reservation45.getCheckOutDate();
        java.lang.Class<?> wildcardClass49 = reservation45.getClass();
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
        org.junit.Assert.assertNull(localDate48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 32, localDate2, localDate3, (double) 100L);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) 32);
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
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 52, localDate2, localDate3, (double) 100L);
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        java.util.List<Business.Reservation> reservationList14 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList15 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList16 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList17 = reservationData0.getAllReservations();
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        Business.Reservation reservation23 = new Business.Reservation("", (int) '4', localDate20, localDate21, (double) 1.0f);
        java.lang.String str24 = reservation23.getGuestName();
        java.time.LocalDate localDate25 = reservation23.getCheckInDate();
        java.time.LocalDate localDate26 = reservation23.getCheckInDate();
        boolean boolean27 = reservationData0.addReservation(reservation23);
        Data.ReservationData reservationData28 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList29 = reservationData28.getAllReservations();
        java.time.LocalDate localDate32 = null;
        java.time.LocalDate localDate33 = null;
        Business.Reservation reservation35 = new Business.Reservation("hi!", (int) (short) -1, localDate32, localDate33, (double) 1);
        java.time.LocalDate localDate36 = reservation35.getCheckOutDate();
        boolean boolean37 = reservationData28.addReservation(reservation35);
        java.time.LocalDate localDate38 = reservation35.getCheckInDate();
        java.time.LocalDate localDate39 = reservation35.getCheckOutDate();
        java.time.LocalDate localDate40 = reservation35.getCheckOutDate();
        java.time.LocalDate localDate41 = reservation35.getCheckInDate();
        java.time.LocalDate localDate42 = reservation35.getCheckOutDate();
        int int43 = reservation35.getRoomNumber();
        java.time.LocalDate localDate44 = reservation35.getCheckInDate();
        int int45 = reservation35.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = reservationData0.addReservation(reservation35);
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
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(localDate38);
        org.junit.Assert.assertNull(localDate39);
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertNull(localDate42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(localDate44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = reservation14.toString();
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
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
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
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 100, localDate2, localDate3, (double) (short) 0);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.String str8 = reservation5.getGuestName();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) (-1));
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.String str7 = reservation5.getGuestName();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList11 = reservationData0.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("", (int) '#', localDate14, localDate15, (double) 100L);
        java.time.LocalDate localDate18 = reservation17.getCheckOutDate();
        boolean boolean19 = reservationData0.addReservation(reservation17);
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("", (int) ' ', localDate22, localDate23, 0.0d);
        boolean boolean26 = reservationData0.addReservation(reservation25);
        int int27 = reservation25.getRoomNumber();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) -1, localDate2, localDate3, 0.0d);
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
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        java.time.LocalDate localDate11 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation5.getCheckInDate();
        java.time.LocalDate localDate12 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = reservation7.toString();
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
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        java.lang.String str23 = reservation14.getGuestName();
        java.time.LocalDate localDate24 = reservation14.getCheckInDate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(localDate24);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        java.lang.String str23 = reservation19.getGuestName();
        int int24 = reservation19.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = reservation19.toString();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        Business.Reservation reservation26 = new Business.Reservation("", (int) (short) 0, localDate23, localDate24, 0.0d);
        java.lang.String str27 = reservation26.getGuestName();
        boolean boolean28 = reservationData0.addReservation(reservation26);
        java.time.LocalDate localDate31 = null;
        java.time.LocalDate localDate32 = null;
        Business.Reservation reservation34 = new Business.Reservation("", 0, localDate31, localDate32, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = reservationData0.addReservation(reservation34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }
}

