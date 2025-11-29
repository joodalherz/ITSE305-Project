package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 0, localDate2, localDate3, (double) 0L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
            double double20 = reservation15.calculateTotalPrice();
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
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) -1, localDate2, localDate3, (double) (short) 100);
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
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 0);
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
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) -1, localDate2, localDate3, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        java.time.LocalDate localDate51 = reservation44.getCheckInDate();
        java.time.LocalDate localDate52 = reservation44.getCheckInDate();
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
        org.junit.Assert.assertNull(localDate51);
        org.junit.Assert.assertNull(localDate52);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        java.time.LocalDate localDate29 = reservation25.getCheckOutDate();
        int int30 = reservation25.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = reservation25.toString();
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
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        java.time.LocalDate localDate14 = reservation5.getCheckInDate();
        java.time.LocalDate localDate15 = reservation5.getCheckInDate();
        java.time.LocalDate localDate16 = reservation5.getCheckInDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        java.util.List<Business.Reservation> reservationList33 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass34 = reservationData0.getClass();
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
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        java.util.List<Business.Reservation> reservationList62 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList63 = reservationData0.getAllReservations();
        Data.ReservationData reservationData64 = new Data.ReservationData();
        java.time.LocalDate localDate67 = null;
        java.time.LocalDate localDate68 = null;
        Business.Reservation reservation70 = new Business.Reservation("hi!", (int) (short) -1, localDate67, localDate68, (double) 1);
        java.lang.String str71 = reservation70.getGuestName();
        boolean boolean72 = reservationData64.addReservation(reservation70);
        java.time.LocalDate localDate73 = reservation70.getCheckInDate();
        java.time.LocalDate localDate74 = reservation70.getCheckInDate();
        java.time.LocalDate localDate75 = reservation70.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean76 = reservationData0.addReservation(reservation70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNotNull(reservationList61);
        org.junit.Assert.assertNotNull(reservationList62);
        org.junit.Assert.assertNotNull(reservationList63);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(localDate73);
        org.junit.Assert.assertNull(localDate74);
        org.junit.Assert.assertNull(localDate75);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        java.time.LocalDate localDate38 = reservation35.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double39 = reservation35.calculateTotalPrice();
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
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(localDate38);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        java.time.LocalDate localDate10 = reservation6.getCheckInDate();
        java.time.LocalDate localDate11 = reservation6.getCheckOutDate();
        int int12 = reservation6.getRoomNumber();
        java.time.LocalDate localDate13 = reservation6.getCheckInDate();
        java.lang.Class<?> wildcardClass14 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        java.lang.String str9 = reservation5.getGuestName();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 32, localDate2, localDate3, (double) '4');
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
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        Data.ReservationData reservationData23 = new Data.ReservationData();
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        Business.Reservation reservation29 = new Business.Reservation("hi!", (int) 'a', localDate26, localDate27, (double) (byte) -1);
        boolean boolean30 = reservationData23.addReservation(reservation29);
        java.util.List<Business.Reservation> reservationList31 = reservationData23.getAllReservations();
        java.util.List<Business.Reservation> reservationList32 = reservationData23.getAllReservations();
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("hi!", (int) (byte) 0, localDate35, localDate36, (-1.0d));
        boolean boolean39 = reservationData23.addReservation(reservation38);
        Data.ReservationData reservationData40 = new Data.ReservationData();
        java.time.LocalDate localDate43 = null;
        java.time.LocalDate localDate44 = null;
        Business.Reservation reservation46 = new Business.Reservation("hi!", (int) (short) -1, localDate43, localDate44, (double) 1);
        java.lang.String str47 = reservation46.getGuestName();
        boolean boolean48 = reservationData40.addReservation(reservation46);
        java.time.LocalDate localDate49 = reservation46.getCheckInDate();
        int int50 = reservation46.getRoomNumber();
        java.time.LocalDate localDate51 = reservation46.getCheckInDate();
        int int52 = reservation46.getRoomNumber();
        boolean boolean53 = reservationData23.addReservation(reservation46);
        java.time.LocalDate localDate56 = null;
        java.time.LocalDate localDate57 = null;
        Business.Reservation reservation59 = new Business.Reservation("hi!", (int) (byte) 100, localDate56, localDate57, (double) (short) 100);
        int int60 = reservation59.getRoomNumber();
        java.lang.String str61 = reservation59.getGuestName();
        boolean boolean62 = reservationData23.addReservation(reservation59);
        java.lang.String str63 = reservation59.getGuestName();
        boolean boolean64 = reservationData0.addReservation(reservation59);
        java.time.LocalDate localDate67 = null;
        java.time.LocalDate localDate68 = null;
        Business.Reservation reservation70 = new Business.Reservation("hi!", (int) (short) -1, localDate67, localDate68, (double) 1);
        java.lang.String str71 = reservation70.getGuestName();
        int int72 = reservation70.getRoomNumber();
        java.time.LocalDate localDate73 = reservation70.getCheckOutDate();
        java.time.LocalDate localDate74 = reservation70.getCheckOutDate();
        java.time.LocalDate localDate75 = reservation70.getCheckOutDate();
        java.time.LocalDate localDate76 = reservation70.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean77 = reservationData0.addReservation(reservation70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(localDate51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNull(localDate73);
        org.junit.Assert.assertNull(localDate74);
        org.junit.Assert.assertNull(localDate75);
        org.junit.Assert.assertNull(localDate76);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        Business.Reservation reservation17 = new Business.Reservation("", (int) '#', localDate14, localDate15, 0.0d);
        int int18 = reservation17.getRoomNumber();
        int int19 = reservation17.getRoomNumber();
        boolean boolean20 = reservationData0.addReservation(reservation17);
        Data.ReservationData reservationData21 = new Data.ReservationData();
        java.time.LocalDate localDate24 = null;
        java.time.LocalDate localDate25 = null;
        Business.Reservation reservation27 = new Business.Reservation("hi!", (int) 'a', localDate24, localDate25, (double) (byte) -1);
        boolean boolean28 = reservationData21.addReservation(reservation27);
        java.util.List<Business.Reservation> reservationList29 = reservationData21.getAllReservations();
        java.util.List<Business.Reservation> reservationList30 = reservationData21.getAllReservations();
        Data.ReservationData reservationData31 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList32 = reservationData31.getAllReservations();
        Data.ReservationData reservationData33 = new Data.ReservationData();
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("hi!", (int) (short) -1, localDate36, localDate37, (double) 1);
        java.lang.String str40 = reservation39.getGuestName();
        boolean boolean41 = reservationData33.addReservation(reservation39);
        boolean boolean42 = reservationData31.addReservation(reservation39);
        java.util.List<Business.Reservation> reservationList43 = reservationData31.getAllReservations();
        Data.ReservationData reservationData44 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList45 = reservationData44.getAllReservations();
        java.util.List<Business.Reservation> reservationList46 = reservationData44.getAllReservations();
        java.util.List<Business.Reservation> reservationList47 = reservationData44.getAllReservations();
        java.time.LocalDate localDate50 = null;
        java.time.LocalDate localDate51 = null;
        Business.Reservation reservation53 = new Business.Reservation("hi!", (int) (short) -1, localDate50, localDate51, (double) 1);
        java.time.LocalDate localDate54 = reservation53.getCheckOutDate();
        boolean boolean55 = reservationData44.addReservation(reservation53);
        java.time.LocalDate localDate58 = null;
        java.time.LocalDate localDate59 = null;
        Business.Reservation reservation61 = new Business.Reservation("", (int) '4', localDate58, localDate59, (double) 1.0f);
        java.lang.String str62 = reservation61.getGuestName();
        boolean boolean63 = reservationData44.addReservation(reservation61);
        java.time.LocalDate localDate64 = reservation61.getCheckOutDate();
        boolean boolean65 = reservationData31.addReservation(reservation61);
        int int66 = reservation61.getRoomNumber();
        boolean boolean67 = reservationData21.addReservation(reservation61);
        java.lang.String str68 = reservation61.getGuestName();
        boolean boolean69 = reservationData0.addReservation(reservation61);
        java.util.List<Business.Reservation> reservationList70 = reservationData0.getAllReservations();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(reservationList43);
        org.junit.Assert.assertNotNull(reservationList45);
        org.junit.Assert.assertNotNull(reservationList46);
        org.junit.Assert.assertNotNull(reservationList47);
        org.junit.Assert.assertNull(localDate54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(localDate64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 52 + "'", int66 == 52);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(reservationList70);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, (double) 10.0f);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckOutDate();
        java.time.LocalDate localDate10 = reservation6.getCheckInDate();
        java.time.LocalDate localDate11 = reservation6.getCheckInDate();
        java.lang.String str12 = reservation6.getGuestName();
        int int13 = reservation6.getRoomNumber();
        java.time.LocalDate localDate14 = reservation6.getCheckInDate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate12 = null;
        java.time.LocalDate localDate13 = null;
        Business.Reservation reservation15 = new Business.Reservation("hi!", (int) ' ', localDate12, localDate13, (double) (short) 1);
        int int16 = reservation15.getRoomNumber();
        java.lang.String str17 = reservation15.getGuestName();
        java.time.LocalDate localDate18 = reservation15.getCheckOutDate();
        java.time.LocalDate localDate19 = reservation15.getCheckOutDate();
        boolean boolean20 = reservationData0.addReservation(reservation15);
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) -1, localDate2, localDate3, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 10, localDate2, localDate3, (double) (short) 100);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        Data.ReservationData reservationData18 = new Data.ReservationData();
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("hi!", (int) 'a', localDate21, localDate22, (double) (byte) -1);
        boolean boolean25 = reservationData18.addReservation(reservation24);
        Data.ReservationData reservationData26 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList27 = reservationData26.getAllReservations();
        java.time.LocalDate localDate30 = null;
        java.time.LocalDate localDate31 = null;
        Business.Reservation reservation33 = new Business.Reservation("hi!", (int) (short) -1, localDate30, localDate31, (double) 1);
        java.time.LocalDate localDate34 = reservation33.getCheckOutDate();
        boolean boolean35 = reservationData26.addReservation(reservation33);
        java.time.LocalDate localDate36 = reservation33.getCheckOutDate();
        java.time.LocalDate localDate37 = reservation33.getCheckOutDate();
        int int38 = reservation33.getRoomNumber();
        int int39 = reservation33.getRoomNumber();
        java.time.LocalDate localDate40 = reservation33.getCheckOutDate();
        boolean boolean41 = reservationData18.addReservation(reservation33);
        boolean boolean42 = reservationData0.addReservation(reservation33);
        java.util.List<Business.Reservation> reservationList43 = reservationData0.getAllReservations();
        java.time.LocalDate localDate46 = null;
        java.time.LocalDate localDate47 = null;
        Business.Reservation reservation49 = new Business.Reservation("hi!", (int) (short) 100, localDate46, localDate47, (double) 32);
        java.lang.String str50 = reservation49.getGuestName();
        boolean boolean51 = reservationData0.addReservation(reservation49);
        java.time.LocalDate localDate52 = reservation49.getCheckOutDate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(reservationList27);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(reservationList43);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(localDate52);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDate8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        java.time.LocalDate localDate15 = reservation8.getCheckOutDate();
        int int16 = reservation8.getRoomNumber();
        java.time.LocalDate localDate17 = reservation8.getCheckInDate();
        java.time.LocalDate localDate18 = reservation8.getCheckOutDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 0, localDate2, localDate3, (double) '4');
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        java.util.List<Business.Reservation> reservationList34 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList35 = reservationData0.getAllReservations();
        java.time.LocalDate localDate38 = null;
        java.time.LocalDate localDate39 = null;
        Business.Reservation reservation41 = new Business.Reservation("hi!", 100, localDate38, localDate39, (double) 0.0f);
        java.lang.String str42 = reservation41.getGuestName();
        java.lang.String str43 = reservation41.getGuestName();
        boolean boolean44 = reservationData0.addReservation(reservation41);
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
        org.junit.Assert.assertNotNull(reservationList34);
        org.junit.Assert.assertNotNull(reservationList35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, (double) 100L);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 0);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        int int8 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
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
        Business.Reservation reservation29 = new Business.Reservation("", (int) (byte) 10, localDate26, localDate27, (double) 0L);
        int int30 = reservation29.getRoomNumber();
        java.time.LocalDate localDate31 = reservation29.getCheckOutDate();
        boolean boolean32 = reservationData0.addReservation(reservation29);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        java.time.LocalDate localDate13 = reservation5.getCheckOutDate();
        java.lang.String str14 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("", 0, localDate3, localDate4, (double) 10.0f);
        java.time.LocalDate localDate7 = reservation6.getCheckInDate();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate11 = null;
        java.time.LocalDate localDate12 = null;
        Business.Reservation reservation14 = new Business.Reservation("hi!", (int) (byte) 100, localDate11, localDate12, (double) 10.0f);
        java.time.LocalDate localDate15 = reservation14.getCheckOutDate();
        boolean boolean16 = reservationData0.addReservation(reservation14);
        java.lang.String str17 = reservation14.getGuestName();
        java.lang.Class<?> wildcardClass18 = reservation14.getClass();
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        java.util.List<Business.Reservation> reservationList40 = reservationData0.getAllReservations();
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
        org.junit.Assert.assertNotNull(reservationList40);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
        java.lang.String str38 = reservation36.getGuestName();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 0.0f);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 100, localDate2, localDate3, 0.0d);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
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
        Business.Reservation reservation19 = new Business.Reservation("hi!", 10, localDate16, localDate17, (double) (-1));
        boolean boolean20 = reservationData0.addReservation(reservation19);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = reservation19.calculateTotalPrice();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 52, localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 10, localDate2, localDate3, (double) ' ');
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.String str8 = reservation5.getGuestName();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.lang.String str10 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        java.time.LocalDate localDate28 = reservation23.getCheckInDate();
        int int29 = reservation23.getRoomNumber();
        java.time.LocalDate localDate30 = reservation23.getCheckInDate();
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
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNull(localDate30);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 100, localDate2, localDate3, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        java.time.LocalDate localDate40 = reservation38.getCheckInDate();
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
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 1.0f);
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 10, localDate2, localDate3, (double) 'a');
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.lang.String str8 = reservation5.getGuestName();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        Business.Reservation reservation16 = new Business.Reservation("hi!", 10, localDate13, localDate14, (double) (short) 1);
        int int17 = reservation16.getRoomNumber();
        boolean boolean18 = reservationData0.addReservation(reservation16);
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        java.time.LocalDate localDate13 = reservation8.getCheckOutDate();
        java.time.LocalDate localDate14 = reservation8.getCheckOutDate();
        java.time.LocalDate localDate15 = reservation8.getCheckOutDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
    }
}

