package randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
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
        java.lang.Class<?> wildcardClass24 = reservation15.getClass();
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 100, localDate2, localDate3, 100.0d);
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        int int9 = reservation8.getRoomNumber();
        java.time.LocalDate localDate10 = reservation8.getCheckInDate();
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.lang.Class<?> wildcardClass12 = reservation8.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        Business.Reservation reservation47 = new Business.Reservation("hi!", (int) (short) -1, localDate44, localDate45, (double) 1);
        java.lang.String str48 = reservation47.getGuestName();
        int int49 = reservation47.getRoomNumber();
        java.time.LocalDate localDate50 = reservation47.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = reservationData0.addReservation(reservation47);
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(localDate50);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        int int13 = reservation7.getRoomNumber();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        int int14 = reservation5.getRoomNumber();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        Business.Reservation reservation23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = reservationData0.addReservation(reservation23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Business.Reservation.getRoomNumber()\" because \"newReservation\" is null");
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
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 32, localDate2, localDate3, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) 'a', localDate2, localDate3, (double) (short) -1);
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        int int16 = reservation9.getRoomNumber();
        java.lang.String str17 = reservation9.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        // The following exception was thrown during execution in test generation
        try {
            double double14 = reservation5.calculateTotalPrice();
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
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 10, localDate2, localDate3, (double) (byte) 10);
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 0, localDate2, localDate3, (double) 52);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        Business.Reservation reservation23 = new Business.Reservation("hi!", (int) (short) -1, localDate20, localDate21, (double) 1);
        java.lang.String str24 = reservation23.getGuestName();
        int int25 = reservation23.getRoomNumber();
        java.time.LocalDate localDate26 = reservation23.getCheckOutDate();
        java.time.LocalDate localDate27 = reservation23.getCheckOutDate();
        java.lang.String str28 = reservation23.getGuestName();
        java.lang.String str29 = reservation23.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = reservationData0.addReservation(reservation23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        Data.ReservationData reservationData27 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList28 = reservationData27.getAllReservations();
        java.time.LocalDate localDate31 = null;
        java.time.LocalDate localDate32 = null;
        Business.Reservation reservation34 = new Business.Reservation("hi!", (int) (short) -1, localDate31, localDate32, (double) 1);
        java.lang.String str35 = reservation34.getGuestName();
        boolean boolean36 = reservationData27.addReservation(reservation34);
        java.time.LocalDate localDate39 = null;
        java.time.LocalDate localDate40 = null;
        Business.Reservation reservation42 = new Business.Reservation("hi!", (int) 'a', localDate39, localDate40, (double) (byte) -1);
        boolean boolean43 = reservationData27.addReservation(reservation42);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = reservationData0.addReservation(reservation42);
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
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNotNull(reservationList28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        Business.Reservation reservation31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = reservationData0.addReservation(reservation31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Business.Reservation.getRoomNumber()\" because \"newReservation\" is null");
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
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 0, localDate2, localDate3, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        java.time.LocalDate localDate15 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass16 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 52, localDate2, localDate3, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, 0.0d);
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, (double) '4');
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, 1.0d);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) (byte) 0);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) 10L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        // The following exception was thrown during execution in test generation
        try {
            double double31 = reservation29.calculateTotalPrice();
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
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) -1, localDate2, localDate3, (double) (-1L));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.String str8 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        int int8 = reservation6.getRoomNumber();
        boolean boolean9 = reservationData0.addReservation(reservation6);
        int int10 = reservation6.getRoomNumber();
        int int11 = reservation6.getRoomNumber();
        java.lang.Class<?> wildcardClass12 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 35, localDate2, localDate3, (double) (short) 0);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        Business.Reservation reservation25 = new Business.Reservation("hi!", (-1), localDate22, localDate23, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = reservationData0.addReservation(reservation25);
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
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
            double double33 = reservation30.calculateTotalPrice();
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        int int23 = reservation14.getRoomNumber();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 10, localDate2, localDate3, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        Data.ReservationData reservationData36 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList37 = reservationData36.getAllReservations();
        java.time.LocalDate localDate40 = null;
        java.time.LocalDate localDate41 = null;
        Business.Reservation reservation43 = new Business.Reservation("hi!", (int) (short) -1, localDate40, localDate41, (double) 1);
        java.time.LocalDate localDate44 = reservation43.getCheckOutDate();
        boolean boolean45 = reservationData36.addReservation(reservation43);
        java.time.LocalDate localDate46 = reservation43.getCheckInDate();
        java.time.LocalDate localDate47 = reservation43.getCheckOutDate();
        java.time.LocalDate localDate48 = reservation43.getCheckOutDate();
        java.time.LocalDate localDate49 = reservation43.getCheckInDate();
        java.time.LocalDate localDate50 = reservation43.getCheckOutDate();
        int int51 = reservation43.getRoomNumber();
        java.lang.String str52 = reservation43.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = reservationData0.addReservation(reservation43);
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
        org.junit.Assert.assertNotNull(reservationList37);
        org.junit.Assert.assertNull(localDate44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(localDate46);
        org.junit.Assert.assertNull(localDate47);
        org.junit.Assert.assertNull(localDate48);
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertNull(localDate50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        java.lang.Class<?> wildcardClass16 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) (short) 1);
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        Data.ReservationData reservationData23 = new Data.ReservationData();
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        Business.Reservation reservation29 = new Business.Reservation("hi!", (int) (short) -1, localDate26, localDate27, (double) 1);
        java.lang.String str30 = reservation29.getGuestName();
        boolean boolean31 = reservationData23.addReservation(reservation29);
        java.time.LocalDate localDate32 = reservation29.getCheckInDate();
        int int33 = reservation29.getRoomNumber();
        boolean boolean34 = reservationData21.addReservation(reservation29);
        java.time.LocalDate localDate35 = reservation29.getCheckInDate();
        java.time.LocalDate localDate36 = reservation29.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = reservationData0.addReservation(reservation29);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertNull(localDate36);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        java.lang.Class<?> wildcardClass16 = reservationData0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        java.time.LocalDate localDate15 = reservation5.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        java.time.LocalDate localDate13 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = reservation5.calculateTotalPrice();
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
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        java.time.LocalDate localDate40 = reservation38.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = reservation38.toString();
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
        org.junit.Assert.assertNull(localDate40);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        // The following exception was thrown during execution in test generation
        try {
            double double25 = reservation21.calculateTotalPrice();
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
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (-1.0f));
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDate8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
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
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        Business.Reservation reservation36 = new Business.Reservation("hi!", (int) (short) -1, localDate33, localDate34, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = reservationData0.addReservation(reservation36);
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
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 1);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        java.lang.Class<?> wildcardClass32 = reservationData0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 0, localDate2, localDate3, (double) (short) 10);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = reservation21.toString();
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
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        java.time.LocalDate localDate31 = reservation29.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double32 = reservation29.calculateTotalPrice();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(localDate31);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
            java.lang.String str17 = reservation15.toString();
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
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        java.time.LocalDate localDate10 = reservation6.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) 10L);
        java.lang.String str6 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 100, localDate2, localDate3, (double) 100);
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        Business.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationData0.addReservation(reservation11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Business.Reservation.getRoomNumber()\" because \"newReservation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (-1.0f));
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 0, localDate2, localDate3, (double) 0L);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        java.time.LocalDate localDate48 = reservation44.getCheckInDate();
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
        org.junit.Assert.assertNull(localDate48);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        java.lang.Class<?> wildcardClass32 = reservationData0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate10 = reservation8.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = reservation8.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        java.lang.Class<?> wildcardClass22 = reservation17.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        java.lang.String str34 = reservation30.getGuestName();
        java.lang.Class<?> wildcardClass35 = reservation30.getClass();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) 'a');
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '#', localDate2, localDate3, (double) 100);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = reservation50.toString();
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
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        java.lang.String str33 = reservation30.getGuestName();
        int int34 = reservation30.getRoomNumber();
        int int35 = reservation30.getRoomNumber();
        boolean boolean36 = reservationData21.addReservation(reservation30);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = reservationData0.addReservation(reservation30);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        // The following exception was thrown during execution in test generation
        try {
            double double24 = reservation15.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) (byte) 100);
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        Business.Reservation reservation21 = new Business.Reservation("hi!", (int) (short) -1, localDate18, localDate19, (double) 1);
        java.time.LocalDate localDate22 = reservation21.getCheckOutDate();
        boolean boolean23 = reservationData14.addReservation(reservation21);
        java.time.LocalDate localDate24 = reservation21.getCheckOutDate();
        java.time.LocalDate localDate25 = reservation21.getCheckInDate();
        int int26 = reservation21.getRoomNumber();
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
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        int int30 = reservation28.getRoomNumber();
        java.lang.String str31 = reservation28.getGuestName();
        java.time.LocalDate localDate32 = reservation28.getCheckInDate();
        int int33 = reservation28.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = reservation28.toString();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        java.time.LocalDate localDate16 = reservation7.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = localDate16.getClass();
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
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        java.lang.String str28 = reservation25.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass48 = localDate47.getClass();
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
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        Business.Reservation reservation28 = new Business.Reservation("", (int) (short) 1, localDate25, localDate26, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = reservationData0.addReservation(reservation28);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        Business.Reservation reservation35 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = reservationData0.addReservation(reservation35);
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
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNotNull(reservationList34);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        java.lang.Class<?> wildcardClass32 = reservation28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 100, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.lang.String str9 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.lang.String str9 = reservation6.getGuestName();
        int int10 = reservation6.getRoomNumber();
        java.lang.Class<?> wildcardClass11 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        Data.ReservationData reservationData25 = new Data.ReservationData();
        java.time.LocalDate localDate28 = null;
        java.time.LocalDate localDate29 = null;
        Business.Reservation reservation31 = new Business.Reservation("hi!", (int) 'a', localDate28, localDate29, (double) (byte) -1);
        boolean boolean32 = reservationData25.addReservation(reservation31);
        Data.ReservationData reservationData33 = new Data.ReservationData();
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("hi!", (int) (short) -1, localDate36, localDate37, (double) 1);
        java.lang.String str40 = reservation39.getGuestName();
        boolean boolean41 = reservationData33.addReservation(reservation39);
        java.lang.String str42 = reservation39.getGuestName();
        int int43 = reservation39.getRoomNumber();
        java.lang.String str44 = reservation39.getGuestName();
        int int45 = reservation39.getRoomNumber();
        boolean boolean46 = reservationData25.addReservation(reservation39);
        java.time.LocalDate localDate47 = reservation39.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = reservationData0.addReservation(reservation39);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(localDate47);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        Business.Reservation reservation29 = new Business.Reservation("", (int) (byte) -1, localDate26, localDate27, (double) '4');
        java.lang.String str30 = reservation29.getGuestName();
        java.time.LocalDate localDate31 = reservation29.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = reservationData0.addReservation(reservation29);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(localDate31);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.lang.String str8 = reservation6.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 0, localDate2, localDate3, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 100L);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, (double) (short) 100);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (-1.0f));
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 100, localDate2, localDate3, (double) 100);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        java.time.LocalDate localDate10 = reservation6.getCheckInDate();
        java.time.LocalDate localDate11 = reservation6.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        // The following exception was thrown during execution in test generation
        try {
            double double24 = reservation21.calculateTotalPrice();
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
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        Data.ReservationData reservationData27 = new Data.ReservationData();
        java.time.LocalDate localDate30 = null;
        java.time.LocalDate localDate31 = null;
        Business.Reservation reservation33 = new Business.Reservation("hi!", (int) (short) -1, localDate30, localDate31, (double) 1);
        java.lang.String str34 = reservation33.getGuestName();
        boolean boolean35 = reservationData27.addReservation(reservation33);
        java.lang.String str36 = reservation33.getGuestName();
        java.time.LocalDate localDate37 = reservation33.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = reservationData0.addReservation(reservation33);
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
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(localDate37);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        java.time.LocalDate localDate15 = reservation6.getCheckInDate();
        java.time.LocalDate localDate16 = reservation6.getCheckOutDate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        java.lang.Class<?> wildcardClass25 = reservationData0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckOutDate();
        java.time.LocalDate localDate10 = reservation6.getCheckOutDate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 10, localDate2, localDate3, (double) 100.0f);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.lang.String str8 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        java.lang.Class<?> wildcardClass39 = reservationData0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        java.time.LocalDate localDate30 = null;
        java.time.LocalDate localDate31 = null;
        Business.Reservation reservation33 = new Business.Reservation("hi!", (int) (short) -1, localDate30, localDate31, (double) 1);
        java.time.LocalDate localDate34 = reservation33.getCheckOutDate();
        java.time.LocalDate localDate35 = reservation33.getCheckOutDate();
        java.time.LocalDate localDate36 = reservation33.getCheckOutDate();
        java.lang.String str37 = reservation33.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = reservationData0.addReservation(reservation33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        int int19 = reservation6.getRoomNumber();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        Data.ReservationData reservationData25 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList26 = reservationData25.getAllReservations();
        java.time.LocalDate localDate29 = null;
        java.time.LocalDate localDate30 = null;
        Business.Reservation reservation32 = new Business.Reservation("hi!", (int) (short) -1, localDate29, localDate30, (double) 1);
        java.time.LocalDate localDate33 = reservation32.getCheckOutDate();
        boolean boolean34 = reservationData25.addReservation(reservation32);
        java.lang.String str35 = reservation32.getGuestName();
        java.time.LocalDate localDate36 = reservation32.getCheckInDate();
        int int37 = reservation32.getRoomNumber();
        java.time.LocalDate localDate38 = reservation32.getCheckOutDate();
        java.time.LocalDate localDate39 = reservation32.getCheckOutDate();
        int int40 = reservation32.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = reservationData0.addReservation(reservation32);
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
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(localDate38);
        org.junit.Assert.assertNull(localDate39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, 10.0d);
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        java.lang.Class<?> wildcardClass19 = reservationList18.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        // The following exception was thrown during execution in test generation
        try {
            double double14 = reservation9.calculateTotalPrice();
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
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        int int18 = reservation15.getRoomNumber();
        java.time.LocalDate localDate19 = reservation15.getCheckInDate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 100, localDate2, localDate3, 100.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = localDate10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        java.util.List<Business.Reservation> reservationList24 = reservationData0.getAllReservations();
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", 10, localDate27, localDate28, (double) 10.0f);
        boolean boolean31 = reservationData0.addReservation(reservation30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = reservation30.toString();
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
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("", 1, localDate21, localDate22, (double) (-1));
        java.time.LocalDate localDate25 = reservation24.getCheckOutDate();
        java.time.LocalDate localDate26 = reservation24.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = reservationData0.addReservation(reservation24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNull(localDate26);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        int int10 = reservation6.getRoomNumber();
        java.lang.Class<?> wildcardClass11 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        int int35 = reservation30.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = reservation30.toString();
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
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        java.time.LocalDate localDate64 = null;
        java.time.LocalDate localDate65 = null;
        Business.Reservation reservation67 = new Business.Reservation("", (int) ' ', localDate64, localDate65, 0.0d);
        java.time.LocalDate localDate68 = reservation67.getCheckInDate();
        boolean boolean69 = reservationData0.addReservation(reservation67);
        // The following exception was thrown during execution in test generation
        try {
            double double70 = reservation67.calculateTotalPrice();
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
        org.junit.Assert.assertNotNull(reservationList61);
        org.junit.Assert.assertNull(localDate68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) (-1L));
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        Data.ReservationData reservationData34 = new Data.ReservationData();
        java.time.LocalDate localDate37 = null;
        java.time.LocalDate localDate38 = null;
        Business.Reservation reservation40 = new Business.Reservation("hi!", (int) 'a', localDate37, localDate38, (double) (byte) -1);
        boolean boolean41 = reservationData34.addReservation(reservation40);
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
        boolean boolean55 = reservationData34.addReservation(reservation48);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = reservationData0.addReservation(reservation48);
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
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList3 = reservationData0.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.time.LocalDate localDate13 = reservation9.getCheckOutDate();
        java.lang.Class<?> wildcardClass14 = reservation9.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        int int8 = reservation6.getRoomNumber();
        boolean boolean9 = reservationData0.addReservation(reservation6);
        Data.ReservationData reservationData10 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList11 = reservationData10.getAllReservations();
        Data.ReservationData reservationData12 = new Data.ReservationData();
        java.time.LocalDate localDate15 = null;
        java.time.LocalDate localDate16 = null;
        Business.Reservation reservation18 = new Business.Reservation("hi!", (int) (short) -1, localDate15, localDate16, (double) 1);
        java.lang.String str19 = reservation18.getGuestName();
        boolean boolean20 = reservationData12.addReservation(reservation18);
        java.time.LocalDate localDate21 = reservation18.getCheckInDate();
        int int22 = reservation18.getRoomNumber();
        boolean boolean23 = reservationData10.addReservation(reservation18);
        int int24 = reservation18.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = reservationData0.addReservation(reservation18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        java.lang.Class<?> wildcardClass34 = reservation23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = reservation5.toString();
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
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        java.time.LocalDate localDate17 = reservation7.getCheckInDate();
        java.time.LocalDate localDate18 = reservation7.getCheckOutDate();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        java.lang.Class<?> wildcardClass25 = reservation14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 1, localDate2, localDate3, (double) 1L);
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
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) (short) -1, localDate22, localDate23, (double) 1);
        java.lang.String str26 = reservation25.getGuestName();
        int int27 = reservation25.getRoomNumber();
        java.time.LocalDate localDate28 = reservation25.getCheckOutDate();
        int int29 = reservation25.getRoomNumber();
        java.lang.String str30 = reservation25.getGuestName();
        int int31 = reservation25.getRoomNumber();
        java.time.LocalDate localDate32 = reservation25.getCheckOutDate();
        int int33 = reservation25.getRoomNumber();
        java.time.LocalDate localDate34 = reservation25.getCheckInDate();
        java.lang.String str35 = reservation25.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = reservationData0.addReservation(reservation25);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 10, localDate2, localDate3, (double) 0);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        java.lang.Class<?> wildcardClass14 = reservationData0.getClass();
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 10, localDate2, localDate3, (double) 52);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
            java.lang.String str39 = reservation36.toString();
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
            double double26 = reservation21.calculateTotalPrice();
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("", (int) (byte) -1, localDate35, localDate36, (double) '4');
        java.lang.String str39 = reservation38.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = reservationData0.addReservation(reservation38);
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
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (-1L));
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, (double) (byte) 100);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) (-1));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
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
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) (-1L));
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
            java.lang.String str13 = reservation7.toString();
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
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        java.lang.String str20 = reservation17.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 100, localDate2, localDate3, (double) (short) 1);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        Data.ReservationData reservationData27 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList28 = reservationData27.getAllReservations();
        java.time.LocalDate localDate31 = null;
        java.time.LocalDate localDate32 = null;
        Business.Reservation reservation34 = new Business.Reservation("hi!", (int) (short) -1, localDate31, localDate32, (double) 1);
        java.time.LocalDate localDate35 = reservation34.getCheckOutDate();
        boolean boolean36 = reservationData27.addReservation(reservation34);
        java.time.LocalDate localDate37 = reservation34.getCheckOutDate();
        java.time.LocalDate localDate38 = reservation34.getCheckOutDate();
        int int39 = reservation34.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = reservationData0.addReservation(reservation34);
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
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNotNull(reservationList28);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(localDate37);
        org.junit.Assert.assertNull(localDate38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate11 = reservation5.getCheckInDate();
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
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        java.time.LocalDate localDate17 = null;
        java.time.LocalDate localDate18 = null;
        Business.Reservation reservation20 = new Business.Reservation("", (int) (byte) -1, localDate17, localDate18, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = reservationData0.addReservation(reservation20);
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
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) (-1.0f));
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
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        Business.Reservation reservation39 = new Business.Reservation("", 97, localDate36, localDate37, (double) (byte) -1);
        java.time.LocalDate localDate40 = reservation39.getCheckOutDate();
        java.time.LocalDate localDate41 = reservation39.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = reservationData0.addReservation(reservation39);
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
        org.junit.Assert.assertNull(localDate41);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 10, localDate2, localDate3, 10.0d);
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
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        java.util.List<Business.Reservation> reservationList24 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList25 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList26 = reservationData0.getAllReservations();
        Data.ReservationData reservationData27 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList28 = reservationData27.getAllReservations();
        java.util.List<Business.Reservation> reservationList29 = reservationData27.getAllReservations();
        Data.ReservationData reservationData30 = new Data.ReservationData();
        java.time.LocalDate localDate33 = null;
        java.time.LocalDate localDate34 = null;
        Business.Reservation reservation36 = new Business.Reservation("hi!", (int) (short) -1, localDate33, localDate34, (double) 1);
        java.lang.String str37 = reservation36.getGuestName();
        boolean boolean38 = reservationData30.addReservation(reservation36);
        java.lang.String str39 = reservation36.getGuestName();
        int int40 = reservation36.getRoomNumber();
        int int41 = reservation36.getRoomNumber();
        boolean boolean42 = reservationData27.addReservation(reservation36);
        java.time.LocalDate localDate45 = null;
        java.time.LocalDate localDate46 = null;
        Business.Reservation reservation48 = new Business.Reservation("hi!", (int) (short) 1, localDate45, localDate46, 0.0d);
        int int49 = reservation48.getRoomNumber();
        boolean boolean50 = reservationData27.addReservation(reservation48);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = reservationData0.addReservation(reservation48);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNotNull(reservationList28);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        Data.ReservationData reservationData29 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList30 = reservationData29.getAllReservations();
        java.util.List<Business.Reservation> reservationList31 = reservationData29.getAllReservations();
        Data.ReservationData reservationData32 = new Data.ReservationData();
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("hi!", (int) (short) -1, localDate35, localDate36, (double) 1);
        java.lang.String str39 = reservation38.getGuestName();
        boolean boolean40 = reservationData32.addReservation(reservation38);
        java.time.LocalDate localDate41 = reservation38.getCheckInDate();
        boolean boolean42 = reservationData29.addReservation(reservation38);
        java.lang.String str43 = reservation38.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = reservationData0.addReservation(reservation38);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList3 = reservationData0.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckOutDate();
        java.lang.String str13 = reservation9.getGuestName();
        java.lang.String str14 = reservation9.getGuestName();
        java.lang.Class<?> wildcardClass15 = reservation9.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        Business.Reservation reservation33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = reservationData0.addReservation(reservation33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Business.Reservation.getRoomNumber()\" because \"newReservation\" is null");
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
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        java.lang.Class<?> wildcardClass27 = reservationList26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        int int14 = reservation5.getRoomNumber();
        int int15 = reservation5.getRoomNumber();
        java.lang.String str16 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = reservation5.calculateTotalPrice();
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
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.String str8 = reservation5.getGuestName();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        java.util.List<Business.Reservation> reservationList25 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList26 = reservationData0.getAllReservations();
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
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(reservationList26);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, (double) '4');
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        Data.ReservationData reservationData34 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList35 = reservationData34.getAllReservations();
        java.time.LocalDate localDate38 = null;
        java.time.LocalDate localDate39 = null;
        Business.Reservation reservation41 = new Business.Reservation("hi!", (int) (short) -1, localDate38, localDate39, (double) 1);
        java.lang.String str42 = reservation41.getGuestName();
        boolean boolean43 = reservationData34.addReservation(reservation41);
        java.lang.String str44 = reservation41.getGuestName();
        java.time.LocalDate localDate45 = reservation41.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = reservationData0.addReservation(reservation41);
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
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNotNull(reservationList35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNull(localDate45);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        java.lang.Class<?> wildcardClass17 = reservation15.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        int int10 = reservation5.getRoomNumber();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        java.time.LocalDate localDate17 = reservation15.getCheckInDate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.lang.String str9 = reservation5.getGuestName();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        java.time.LocalDate localDate11 = reservation5.getCheckInDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (-1.0f));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.String str7 = reservation5.getGuestName();
        int int8 = reservation5.getRoomNumber();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 52, localDate2, localDate3, (double) 10L);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        java.time.LocalDate localDate24 = null;
        java.time.LocalDate localDate25 = null;
        Business.Reservation reservation27 = new Business.Reservation("hi!", (int) (short) -1, localDate24, localDate25, (double) 1);
        java.time.LocalDate localDate28 = reservation27.getCheckOutDate();
        boolean boolean29 = reservationData20.addReservation(reservation27);
        java.time.LocalDate localDate30 = reservation27.getCheckInDate();
        java.time.LocalDate localDate31 = reservation27.getCheckOutDate();
        java.time.LocalDate localDate32 = reservation27.getCheckOutDate();
        java.time.LocalDate localDate33 = reservation27.getCheckInDate();
        int int34 = reservation27.getRoomNumber();
        int int35 = reservation27.getRoomNumber();
        java.time.LocalDate localDate36 = reservation27.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = reservationData0.addReservation(reservation27);
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
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(localDate36);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        Data.ReservationData reservationData40 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList41 = reservationData40.getAllReservations();
        java.util.List<Business.Reservation> reservationList42 = reservationData40.getAllReservations();
        java.util.List<Business.Reservation> reservationList43 = reservationData40.getAllReservations();
        java.time.LocalDate localDate46 = null;
        java.time.LocalDate localDate47 = null;
        Business.Reservation reservation49 = new Business.Reservation("hi!", (int) (short) -1, localDate46, localDate47, (double) 1);
        java.time.LocalDate localDate50 = reservation49.getCheckOutDate();
        boolean boolean51 = reservationData40.addReservation(reservation49);
        java.time.LocalDate localDate54 = null;
        java.time.LocalDate localDate55 = null;
        Business.Reservation reservation57 = new Business.Reservation("", 35, localDate54, localDate55, (double) (short) 1);
        java.time.LocalDate localDate58 = reservation57.getCheckOutDate();
        boolean boolean59 = reservationData40.addReservation(reservation57);
        Data.ReservationData reservationData60 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList61 = reservationData60.getAllReservations();
        Data.ReservationData reservationData62 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList63 = reservationData62.getAllReservations();
        java.time.LocalDate localDate66 = null;
        java.time.LocalDate localDate67 = null;
        Business.Reservation reservation69 = new Business.Reservation("hi!", (int) (short) -1, localDate66, localDate67, (double) 1);
        java.time.LocalDate localDate70 = reservation69.getCheckOutDate();
        boolean boolean71 = reservationData62.addReservation(reservation69);
        java.time.LocalDate localDate72 = reservation69.getCheckOutDate();
        java.time.LocalDate localDate73 = reservation69.getCheckInDate();
        boolean boolean74 = reservationData60.addReservation(reservation69);
        Data.ReservationData reservationData75 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList76 = reservationData75.getAllReservations();
        java.time.LocalDate localDate79 = null;
        java.time.LocalDate localDate80 = null;
        Business.Reservation reservation82 = new Business.Reservation("hi!", (int) (short) -1, localDate79, localDate80, (double) 1);
        java.lang.String str83 = reservation82.getGuestName();
        boolean boolean84 = reservationData75.addReservation(reservation82);
        java.time.LocalDate localDate87 = null;
        java.time.LocalDate localDate88 = null;
        Business.Reservation reservation90 = new Business.Reservation("hi!", (int) 'a', localDate87, localDate88, (double) (byte) -1);
        boolean boolean91 = reservationData75.addReservation(reservation90);
        boolean boolean92 = reservationData60.addReservation(reservation90);
        boolean boolean93 = reservationData40.addReservation(reservation90);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean94 = reservationData0.addReservation(reservation90);
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
        org.junit.Assert.assertNotNull(reservationList41);
        org.junit.Assert.assertNotNull(reservationList42);
        org.junit.Assert.assertNotNull(reservationList43);
        org.junit.Assert.assertNull(localDate50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(localDate58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(reservationList61);
        org.junit.Assert.assertNotNull(reservationList63);
        org.junit.Assert.assertNull(localDate70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNull(localDate72);
        org.junit.Assert.assertNull(localDate73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(reservationList76);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        java.lang.Class<?> wildcardClass15 = reservationList14.getClass();
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
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        Data.ReservationData reservationData2 = new Data.ReservationData();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) (short) -1, localDate5, localDate6, (double) 1);
        java.lang.String str9 = reservation8.getGuestName();
        boolean boolean10 = reservationData2.addReservation(reservation8);
        boolean boolean11 = reservationData0.addReservation(reservation8);
        java.lang.Class<?> wildcardClass12 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        java.time.LocalDate localDate64 = null;
        java.time.LocalDate localDate65 = null;
        Business.Reservation reservation67 = new Business.Reservation("", (int) ' ', localDate64, localDate65, 0.0d);
        java.time.LocalDate localDate68 = reservation67.getCheckInDate();
        boolean boolean69 = reservationData0.addReservation(reservation67);
        Data.ReservationData reservationData70 = new Data.ReservationData();
        java.time.LocalDate localDate73 = null;
        java.time.LocalDate localDate74 = null;
        Business.Reservation reservation76 = new Business.Reservation("hi!", (int) (short) -1, localDate73, localDate74, (double) 1);
        java.lang.String str77 = reservation76.getGuestName();
        boolean boolean78 = reservationData70.addReservation(reservation76);
        java.lang.String str79 = reservation76.getGuestName();
        int int80 = reservation76.getRoomNumber();
        java.lang.String str81 = reservation76.getGuestName();
        java.time.LocalDate localDate82 = reservation76.getCheckInDate();
        java.lang.String str83 = reservation76.getGuestName();
        java.time.LocalDate localDate84 = reservation76.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = reservationData0.addReservation(reservation76);
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
        org.junit.Assert.assertNotNull(reservationList61);
        org.junit.Assert.assertNull(localDate68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNull(localDate82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertNull(localDate84);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 100, localDate2, localDate3, (double) 97);
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
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) 1);
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
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        Business.Reservation reservation48 = new Business.Reservation("", (int) (short) 1, localDate45, localDate46, (double) (byte) 0);
        boolean boolean49 = reservationData0.addReservation(reservation48);
        // The following exception was thrown during execution in test generation
        try {
            double double50 = reservation48.calculateTotalPrice();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 100, localDate2, localDate3, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) -1, localDate2, localDate3, 0.0d);
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        java.time.LocalDate localDate17 = reservation6.getCheckInDate();
        java.time.LocalDate localDate18 = reservation6.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, (double) (short) 10);
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
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 0, localDate2, localDate3, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("", (int) (short) -1, localDate21, localDate22, (double) (-1L));
        int int25 = reservation24.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = reservationData0.addReservation(reservation24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
            java.lang.Class<?> wildcardClass11 = localDate10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        int int10 = reservation5.getRoomNumber();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        Data.ReservationData reservationData16 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList17 = reservationData16.getAllReservations();
        Data.ReservationData reservationData18 = new Data.ReservationData();
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("hi!", (int) (short) -1, localDate21, localDate22, (double) 1);
        java.lang.String str25 = reservation24.getGuestName();
        boolean boolean26 = reservationData18.addReservation(reservation24);
        boolean boolean27 = reservationData16.addReservation(reservation24);
        java.util.List<Business.Reservation> reservationList28 = reservationData16.getAllReservations();
        Data.ReservationData reservationData29 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList30 = reservationData29.getAllReservations();
        java.util.List<Business.Reservation> reservationList31 = reservationData29.getAllReservations();
        java.util.List<Business.Reservation> reservationList32 = reservationData29.getAllReservations();
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("hi!", (int) (short) -1, localDate35, localDate36, (double) 1);
        java.time.LocalDate localDate39 = reservation38.getCheckOutDate();
        boolean boolean40 = reservationData29.addReservation(reservation38);
        java.time.LocalDate localDate43 = null;
        java.time.LocalDate localDate44 = null;
        Business.Reservation reservation46 = new Business.Reservation("", (int) '4', localDate43, localDate44, (double) 1.0f);
        java.lang.String str47 = reservation46.getGuestName();
        boolean boolean48 = reservationData29.addReservation(reservation46);
        java.time.LocalDate localDate49 = reservation46.getCheckOutDate();
        boolean boolean50 = reservationData16.addReservation(reservation46);
        int int51 = reservation46.getRoomNumber();
        boolean boolean52 = reservationData0.addReservation(reservation46);
        java.util.List<Business.Reservation> reservationList53 = reservationData0.getAllReservations();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(reservationList28);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 52 + "'", int51 == 52);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(reservationList53);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        int int14 = reservation5.getRoomNumber();
        int int15 = reservation5.getRoomNumber();
        int int16 = reservation5.getRoomNumber();
        int int17 = reservation5.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("hi!", (int) (short) -1, localDate21, localDate22, (double) 1);
        java.lang.String str25 = reservation24.getGuestName();
        int int26 = reservation24.getRoomNumber();
        java.time.LocalDate localDate27 = reservation24.getCheckOutDate();
        int int28 = reservation24.getRoomNumber();
        java.lang.String str29 = reservation24.getGuestName();
        int int30 = reservation24.getRoomNumber();
        java.lang.String str31 = reservation24.getGuestName();
        java.time.LocalDate localDate32 = reservation24.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = reservationData0.addReservation(reservation24);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(localDate32);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        int int11 = reservation5.getRoomNumber();
        java.time.LocalDate localDate12 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        java.lang.Class<?> wildcardClass14 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (-1.0f));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = reservation17.toString();
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
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = reservation15.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation5.calculateTotalPrice();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        java.util.List<Business.Reservation> reservationList24 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList25 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass26 = reservationList25.getClass();
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
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        Data.ReservationData reservationData26 = new Data.ReservationData();
        java.time.LocalDate localDate29 = null;
        java.time.LocalDate localDate30 = null;
        Business.Reservation reservation32 = new Business.Reservation("hi!", (int) (short) -1, localDate29, localDate30, (double) 1);
        java.lang.String str33 = reservation32.getGuestName();
        int int34 = reservation32.getRoomNumber();
        boolean boolean35 = reservationData26.addReservation(reservation32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = reservationData0.addReservation(reservation32);
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
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        java.util.List<Business.Reservation> reservationList24 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList25 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList26 = reservationData0.getAllReservations();
        Business.Reservation reservation27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = reservationData0.addReservation(reservation27);
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
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(reservationList26);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        java.lang.Class<?> wildcardClass13 = reservation7.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        // The following exception was thrown during execution in test generation
        try {
            double double23 = reservation17.calculateTotalPrice();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) 'a', localDate2, localDate3, (double) (short) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        java.time.LocalDate localDate17 = reservation7.getCheckInDate();
        java.time.LocalDate localDate18 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate19 = reservation7.getCheckOutDate();
        java.time.LocalDate localDate20 = reservation7.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = reservation7.calculateTotalPrice();
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
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.lang.String str9 = reservation5.getGuestName();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        java.time.LocalDate localDate11 = reservation5.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (short) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) (short) 1);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        java.lang.Class<?> wildcardClass36 = reservationData0.getClass();
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        int int30 = reservation28.getRoomNumber();
        java.lang.String str31 = reservation28.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = reservation28.toString();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 0, localDate2, localDate3, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 'a');
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (short) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        int int7 = reservation5.getRoomNumber();
        java.lang.String str8 = reservation5.getGuestName();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 10, localDate2, localDate3, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 100, localDate2, localDate3, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        int int30 = reservation28.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double31 = reservation28.calculateTotalPrice();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        int int13 = reservation6.getRoomNumber();
        java.lang.Class<?> wildcardClass14 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        int int8 = reservation5.getRoomNumber();
        int int9 = reservation5.getRoomNumber();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, (double) 100.0f);
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        java.lang.Class<?> wildcardClass28 = reservation25.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        java.time.LocalDate localDate15 = reservation5.getCheckInDate();
        java.lang.String str16 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 0, localDate2, localDate3, (double) (-1.0f));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        int int9 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) (byte) 100);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '#', localDate2, localDate3, (double) (short) -1);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 52, localDate2, localDate3, (double) 1L);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) 'a');
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("", 0, localDate3, localDate4, (double) 10.0f);
        java.time.LocalDate localDate7 = reservation6.getCheckInDate();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckOutDate();
        int int10 = reservation6.getRoomNumber();
        int int11 = reservation6.getRoomNumber();
        int int12 = reservation6.getRoomNumber();
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
            java.lang.Class<?> wildcardClass14 = localDate13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        java.lang.Class<?> wildcardClass29 = reservationData0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        java.time.LocalDate localDate10 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (short) 0);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) 0.0f);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
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
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        java.lang.Class<?> wildcardClass17 = reservationList16.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        java.time.LocalDate localDate30 = reservation28.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double31 = reservation28.calculateTotalPrice();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(localDate30);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        java.time.LocalDate localDate15 = reservation7.getCheckInDate();
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
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
            java.lang.Class<?> wildcardClass34 = localDate33.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, (double) 100L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        java.time.LocalDate localDate13 = reservation6.getCheckOutDate();
        int int14 = reservation6.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = reservation6.toString();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) (-1.0f));
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        Data.ReservationData reservationData10 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList11 = reservationData10.getAllReservations();
        Data.ReservationData reservationData12 = new Data.ReservationData();
        java.time.LocalDate localDate15 = null;
        java.time.LocalDate localDate16 = null;
        Business.Reservation reservation18 = new Business.Reservation("hi!", (int) (short) -1, localDate15, localDate16, (double) 1);
        java.lang.String str19 = reservation18.getGuestName();
        boolean boolean20 = reservationData12.addReservation(reservation18);
        boolean boolean21 = reservationData10.addReservation(reservation18);
        java.util.List<Business.Reservation> reservationList22 = reservationData10.getAllReservations();
        Data.ReservationData reservationData23 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList24 = reservationData23.getAllReservations();
        java.util.List<Business.Reservation> reservationList25 = reservationData23.getAllReservations();
        java.util.List<Business.Reservation> reservationList26 = reservationData23.getAllReservations();
        java.time.LocalDate localDate29 = null;
        java.time.LocalDate localDate30 = null;
        Business.Reservation reservation32 = new Business.Reservation("hi!", (int) (short) -1, localDate29, localDate30, (double) 1);
        java.time.LocalDate localDate33 = reservation32.getCheckOutDate();
        boolean boolean34 = reservationData23.addReservation(reservation32);
        java.time.LocalDate localDate37 = null;
        java.time.LocalDate localDate38 = null;
        Business.Reservation reservation40 = new Business.Reservation("", (int) '4', localDate37, localDate38, (double) 1.0f);
        java.lang.String str41 = reservation40.getGuestName();
        boolean boolean42 = reservationData23.addReservation(reservation40);
        java.time.LocalDate localDate43 = reservation40.getCheckOutDate();
        boolean boolean44 = reservationData10.addReservation(reservation40);
        int int45 = reservation40.getRoomNumber();
        boolean boolean46 = reservationData0.addReservation(reservation40);
        java.util.List<Business.Reservation> reservationList47 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass48 = reservationData0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(localDate43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(reservationList47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 10, localDate2, localDate3, (double) 0);
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
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        Business.Reservation reservation16 = new Business.Reservation("", 1, localDate13, localDate14, (double) (short) -1);
        java.time.LocalDate localDate17 = reservation16.getCheckInDate();
        java.lang.String str18 = reservation16.getGuestName();
        boolean boolean19 = reservationData0.addReservation(reservation16);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = reservation16.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, 10.0d);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '4', localDate2, localDate3, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        java.util.List<Business.Reservation> reservationList19 = reservationData0.getAllReservations();
        Data.ReservationData reservationData20 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList21 = reservationData20.getAllReservations();
        java.util.List<Business.Reservation> reservationList22 = reservationData20.getAllReservations();
        Data.ReservationData reservationData23 = new Data.ReservationData();
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        Business.Reservation reservation29 = new Business.Reservation("hi!", (int) (short) -1, localDate26, localDate27, (double) 1);
        java.lang.String str30 = reservation29.getGuestName();
        boolean boolean31 = reservationData23.addReservation(reservation29);
        java.lang.String str32 = reservation29.getGuestName();
        int int33 = reservation29.getRoomNumber();
        int int34 = reservation29.getRoomNumber();
        boolean boolean35 = reservationData20.addReservation(reservation29);
        java.time.LocalDate localDate38 = null;
        java.time.LocalDate localDate39 = null;
        Business.Reservation reservation41 = new Business.Reservation("hi!", (int) (short) 10, localDate38, localDate39, (double) (short) 1);
        boolean boolean42 = reservationData20.addReservation(reservation41);
        java.time.LocalDate localDate45 = null;
        java.time.LocalDate localDate46 = null;
        Business.Reservation reservation48 = new Business.Reservation("hi!", (int) 'a', localDate45, localDate46, (double) (byte) -1);
        boolean boolean49 = reservationData20.addReservation(reservation48);
        java.time.LocalDate localDate50 = reservation48.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = reservationData0.addReservation(reservation48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(localDate50);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) (short) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.lang.String str7 = reservation5.getGuestName();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) (short) 0);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 32, localDate2, localDate3, (double) '4');
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
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, (double) 10.0f);
        int int6 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 10, localDate2, localDate3, (double) (byte) 10);
        int int6 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        java.time.LocalDate localDate48 = reservation45.getCheckInDate();
        int int49 = reservation45.getRoomNumber();
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        Data.ReservationData reservationData16 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList17 = reservationData16.getAllReservations();
        Data.ReservationData reservationData18 = new Data.ReservationData();
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("hi!", (int) (short) -1, localDate21, localDate22, (double) 1);
        java.lang.String str25 = reservation24.getGuestName();
        boolean boolean26 = reservationData18.addReservation(reservation24);
        boolean boolean27 = reservationData16.addReservation(reservation24);
        java.util.List<Business.Reservation> reservationList28 = reservationData16.getAllReservations();
        Data.ReservationData reservationData29 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList30 = reservationData29.getAllReservations();
        java.util.List<Business.Reservation> reservationList31 = reservationData29.getAllReservations();
        java.util.List<Business.Reservation> reservationList32 = reservationData29.getAllReservations();
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("hi!", (int) (short) -1, localDate35, localDate36, (double) 1);
        java.time.LocalDate localDate39 = reservation38.getCheckOutDate();
        boolean boolean40 = reservationData29.addReservation(reservation38);
        java.time.LocalDate localDate43 = null;
        java.time.LocalDate localDate44 = null;
        Business.Reservation reservation46 = new Business.Reservation("", (int) '4', localDate43, localDate44, (double) 1.0f);
        java.lang.String str47 = reservation46.getGuestName();
        boolean boolean48 = reservationData29.addReservation(reservation46);
        java.time.LocalDate localDate49 = reservation46.getCheckOutDate();
        boolean boolean50 = reservationData16.addReservation(reservation46);
        int int51 = reservation46.getRoomNumber();
        boolean boolean52 = reservationData0.addReservation(reservation46);
        java.lang.String str53 = reservation46.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(reservationList28);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 52 + "'", int51 == 52);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        int int15 = reservation6.getRoomNumber();
        java.time.LocalDate localDate16 = reservation6.getCheckOutDate();
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
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.String str8 = reservation5.getGuestName();
        java.time.LocalDate localDate9 = reservation5.getCheckOutDate();
        java.lang.String str10 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        java.lang.Class<?> wildcardClass17 = reservation6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        java.util.List<Business.Reservation> reservationList30 = reservationData0.getAllReservations();
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
        org.junit.Assert.assertNotNull(reservationList30);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        Data.ReservationData reservationData16 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList17 = reservationData16.getAllReservations();
        Data.ReservationData reservationData18 = new Data.ReservationData();
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("hi!", (int) (short) -1, localDate21, localDate22, (double) 1);
        java.lang.String str25 = reservation24.getGuestName();
        boolean boolean26 = reservationData18.addReservation(reservation24);
        boolean boolean27 = reservationData16.addReservation(reservation24);
        java.util.List<Business.Reservation> reservationList28 = reservationData16.getAllReservations();
        Data.ReservationData reservationData29 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList30 = reservationData29.getAllReservations();
        java.util.List<Business.Reservation> reservationList31 = reservationData29.getAllReservations();
        java.util.List<Business.Reservation> reservationList32 = reservationData29.getAllReservations();
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("hi!", (int) (short) -1, localDate35, localDate36, (double) 1);
        java.time.LocalDate localDate39 = reservation38.getCheckOutDate();
        boolean boolean40 = reservationData29.addReservation(reservation38);
        java.time.LocalDate localDate43 = null;
        java.time.LocalDate localDate44 = null;
        Business.Reservation reservation46 = new Business.Reservation("", (int) '4', localDate43, localDate44, (double) 1.0f);
        java.lang.String str47 = reservation46.getGuestName();
        boolean boolean48 = reservationData29.addReservation(reservation46);
        java.time.LocalDate localDate49 = reservation46.getCheckOutDate();
        boolean boolean50 = reservationData16.addReservation(reservation46);
        int int51 = reservation46.getRoomNumber();
        boolean boolean52 = reservationData0.addReservation(reservation46);
        Business.Reservation reservation53 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = reservationData0.addReservation(reservation53);
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
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(reservationList28);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 52 + "'", int51 == 52);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = localDate13.getClass();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        java.time.LocalDate localDate17 = reservation7.getCheckInDate();
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
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) 'a', localDate3, localDate4, (double) (byte) -1);
        boolean boolean7 = reservationData0.addReservation(reservation6);
        java.util.List<Business.Reservation> reservationList8 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList9 = reservationData0.getAllReservations();
        Data.ReservationData reservationData10 = new Data.ReservationData();
        java.time.LocalDate localDate13 = null;
        java.time.LocalDate localDate14 = null;
        Business.Reservation reservation16 = new Business.Reservation("hi!", (int) 'a', localDate13, localDate14, (double) (byte) -1);
        boolean boolean17 = reservationData10.addReservation(reservation16);
        java.lang.String str18 = reservation16.getGuestName();
        java.lang.String str19 = reservation16.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = reservationData0.addReservation(reservation16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        java.time.LocalDate localDate15 = reservation5.getCheckInDate();
        java.time.LocalDate localDate16 = reservation5.getCheckInDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        Data.ReservationData reservationData31 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList32 = reservationData31.getAllReservations();
        java.util.List<Business.Reservation> reservationList33 = reservationData31.getAllReservations();
        Data.ReservationData reservationData34 = new Data.ReservationData();
        java.time.LocalDate localDate37 = null;
        java.time.LocalDate localDate38 = null;
        Business.Reservation reservation40 = new Business.Reservation("hi!", (int) (short) -1, localDate37, localDate38, (double) 1);
        java.lang.String str41 = reservation40.getGuestName();
        boolean boolean42 = reservationData34.addReservation(reservation40);
        java.lang.String str43 = reservation40.getGuestName();
        int int44 = reservation40.getRoomNumber();
        int int45 = reservation40.getRoomNumber();
        boolean boolean46 = reservationData31.addReservation(reservation40);
        java.time.LocalDate localDate49 = null;
        java.time.LocalDate localDate50 = null;
        Business.Reservation reservation52 = new Business.Reservation("hi!", (int) (byte) 0, localDate49, localDate50, (double) 0L);
        boolean boolean53 = reservationData31.addReservation(reservation52);
        java.time.LocalDate localDate54 = reservation52.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = reservationData0.addReservation(reservation52);
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
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(localDate54);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = localDate16.getClass();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        java.time.LocalDate localDate15 = reservation9.getCheckOutDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, 10.0d);
        java.lang.String str6 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList3 = reservationData0.getAllReservations();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        Business.Reservation reservation9 = new Business.Reservation("hi!", (int) (short) -1, localDate6, localDate7, (double) 1);
        java.time.LocalDate localDate10 = reservation9.getCheckOutDate();
        boolean boolean11 = reservationData0.addReservation(reservation9);
        java.time.LocalDate localDate12 = reservation9.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation9.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.lang.String str9 = reservation5.getGuestName();
        java.time.LocalDate localDate10 = reservation5.getCheckInDate();
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) 1);
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 32, localDate2, localDate3, 1.0d);
        java.lang.String str6 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.lang.String str9 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        java.lang.Class<?> wildcardClass13 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("", 0, localDate3, localDate4, (double) 10.0f);
        java.time.LocalDate localDate7 = reservation6.getCheckInDate();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckOutDate();
        int int10 = reservation6.getRoomNumber();
        int int11 = reservation6.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = reservation6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 1.0f);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 0, localDate2, localDate3, 0.0d);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        Data.ReservationData reservationData25 = new Data.ReservationData();
        java.time.LocalDate localDate28 = null;
        java.time.LocalDate localDate29 = null;
        Business.Reservation reservation31 = new Business.Reservation("hi!", (int) (short) -1, localDate28, localDate29, (double) 1);
        java.lang.String str32 = reservation31.getGuestName();
        boolean boolean33 = reservationData25.addReservation(reservation31);
        java.time.LocalDate localDate34 = reservation31.getCheckInDate();
        java.time.LocalDate localDate35 = reservation31.getCheckOutDate();
        java.time.LocalDate localDate36 = reservation31.getCheckOutDate();
        int int37 = reservation31.getRoomNumber();
        int int38 = reservation31.getRoomNumber();
        java.time.LocalDate localDate39 = reservation31.getCheckInDate();
        boolean boolean40 = reservationData0.addReservation(reservation31);
        Data.ReservationData reservationData41 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList42 = reservationData41.getAllReservations();
        java.time.LocalDate localDate45 = null;
        java.time.LocalDate localDate46 = null;
        Business.Reservation reservation48 = new Business.Reservation("hi!", (int) (short) -1, localDate45, localDate46, (double) 1);
        java.time.LocalDate localDate49 = reservation48.getCheckOutDate();
        boolean boolean50 = reservationData41.addReservation(reservation48);
        java.time.LocalDate localDate51 = reservation48.getCheckInDate();
        java.time.LocalDate localDate52 = reservation48.getCheckOutDate();
        java.time.LocalDate localDate53 = reservation48.getCheckOutDate();
        java.time.LocalDate localDate54 = reservation48.getCheckInDate();
        java.time.LocalDate localDate55 = reservation48.getCheckOutDate();
        int int56 = reservation48.getRoomNumber();
        java.time.LocalDate localDate57 = reservation48.getCheckInDate();
        java.lang.String str58 = reservation48.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = reservationData0.addReservation(reservation48);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(reservationList42);
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(localDate51);
        org.junit.Assert.assertNull(localDate52);
        org.junit.Assert.assertNull(localDate53);
        org.junit.Assert.assertNull(localDate54);
        org.junit.Assert.assertNull(localDate55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(localDate57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, 10.0d);
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        java.util.List<Business.Reservation> reservationList22 = reservationData0.getAllReservations();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(reservationList22);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        java.time.LocalDate localDate42 = reservation38.getCheckInDate();
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
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        Business.Reservation reservation24 = new Business.Reservation("", (int) (byte) -1, localDate21, localDate22, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = reservationData0.addReservation(reservation24);
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
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        int int14 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass15 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) (-1.0f));
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
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
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = reservation20.toString();
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
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
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
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 10, localDate2, localDate3, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = localDate7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 0, localDate2, localDate3, 100.0d);
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 97, localDate2, localDate3, (double) 10);
        int int6 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, 10.0d);
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) '#');
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        java.time.LocalDate localDate33 = reservation29.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate33);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, (double) '4');
        java.lang.String str6 = reservation5.getGuestName();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        int int8 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        Business.Reservation reservation48 = new Business.Reservation("", (int) (short) 1, localDate45, localDate46, (double) (byte) 0);
        boolean boolean49 = reservationData0.addReservation(reservation48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = reservation48.toString();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) '#', localDate2, localDate3, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        java.time.LocalDate localDate18 = reservation9.getCheckInDate();
        java.time.LocalDate localDate19 = reservation9.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = reservation9.toString();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        java.lang.Class<?> wildcardClass18 = reservation6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = reservation25.toString();
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
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(localDate28);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        java.util.List<Business.Reservation> reservationList19 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass20 = reservationList19.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        java.lang.Class<?> wildcardClass14 = reservation7.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) (short) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 10, localDate2, localDate3, (double) (-1));
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckInDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 0, localDate2, localDate3, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        java.lang.String str14 = reservation7.getGuestName();
        java.lang.String str15 = reservation7.getGuestName();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 1, localDate2, localDate3, (double) (byte) 100);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass8 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        java.lang.Class<?> wildcardClass16 = reservationList15.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, 0.0d);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        int int15 = reservation5.getRoomNumber();
        java.lang.String str16 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.time.LocalDate localDate10 = reservation7.getCheckInDate();
        int int11 = reservation7.getRoomNumber();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        java.lang.Class<?> wildcardClass18 = reservation15.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.lang.String str9 = reservation5.getGuestName();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.String str7 = reservation5.getGuestName();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, (double) 100.0f);
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
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        int int15 = reservation6.getRoomNumber();
        java.lang.String str16 = reservation6.getGuestName();
        java.lang.Class<?> wildcardClass17 = reservation6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        java.util.List<Business.Reservation> reservationList22 = reservationData0.getAllReservations();
        Data.ReservationData reservationData23 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList24 = reservationData23.getAllReservations();
        java.util.List<Business.Reservation> reservationList25 = reservationData23.getAllReservations();
        java.util.List<Business.Reservation> reservationList26 = reservationData23.getAllReservations();
        java.time.LocalDate localDate29 = null;
        java.time.LocalDate localDate30 = null;
        Business.Reservation reservation32 = new Business.Reservation("hi!", (int) (short) -1, localDate29, localDate30, (double) 1);
        java.time.LocalDate localDate33 = reservation32.getCheckOutDate();
        boolean boolean34 = reservationData23.addReservation(reservation32);
        java.time.LocalDate localDate37 = null;
        java.time.LocalDate localDate38 = null;
        Business.Reservation reservation40 = new Business.Reservation("", 35, localDate37, localDate38, (double) (short) 1);
        java.time.LocalDate localDate41 = reservation40.getCheckOutDate();
        boolean boolean42 = reservationData23.addReservation(reservation40);
        Data.ReservationData reservationData43 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList44 = reservationData43.getAllReservations();
        Data.ReservationData reservationData45 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList46 = reservationData45.getAllReservations();
        java.time.LocalDate localDate49 = null;
        java.time.LocalDate localDate50 = null;
        Business.Reservation reservation52 = new Business.Reservation("hi!", (int) (short) -1, localDate49, localDate50, (double) 1);
        java.time.LocalDate localDate53 = reservation52.getCheckOutDate();
        boolean boolean54 = reservationData45.addReservation(reservation52);
        java.time.LocalDate localDate55 = reservation52.getCheckOutDate();
        java.time.LocalDate localDate56 = reservation52.getCheckInDate();
        boolean boolean57 = reservationData43.addReservation(reservation52);
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
        boolean boolean75 = reservationData43.addReservation(reservation73);
        boolean boolean76 = reservationData23.addReservation(reservation73);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean77 = reservationData0.addReservation(reservation73);
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
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(reservationList44);
        org.junit.Assert.assertNotNull(reservationList46);
        org.junit.Assert.assertNull(localDate53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(localDate55);
        org.junit.Assert.assertNull(localDate56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(reservationList59);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 1, localDate2, localDate3, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        int int15 = reservation7.getRoomNumber();
        java.lang.Class<?> wildcardClass16 = reservation7.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 10, localDate2, localDate3, (double) 10.0f);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 10, localDate2, localDate3, (double) 1.0f);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, (double) (byte) 100);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) 0.0f);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        int int7 = reservation5.getRoomNumber();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        java.time.LocalDate localDate20 = reservation18.getCheckOutDate();
        java.lang.String str21 = reservation18.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = reservation18.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 100, localDate2, localDate3, 100.0d);
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        java.util.List<Business.Reservation> reservationList17 = reservationData0.getAllReservations();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        java.util.List<Business.Reservation> reservationList16 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList17 = reservationData0.getAllReservations();
        Data.ReservationData reservationData18 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList19 = reservationData18.getAllReservations();
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) (short) -1, localDate22, localDate23, (double) 1);
        java.lang.String str26 = reservation25.getGuestName();
        boolean boolean27 = reservationData18.addReservation(reservation25);
        java.lang.String str28 = reservation25.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = reservationData0.addReservation(reservation25);
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
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        java.time.LocalDate localDate34 = reservation30.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate34);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        java.time.LocalDate localDate34 = null;
        java.time.LocalDate localDate35 = null;
        Business.Reservation reservation37 = new Business.Reservation("hi!", (int) (short) -1, localDate34, localDate35, (double) 1);
        java.lang.String str38 = reservation37.getGuestName();
        int int39 = reservation37.getRoomNumber();
        java.time.LocalDate localDate40 = reservation37.getCheckOutDate();
        int int41 = reservation37.getRoomNumber();
        java.lang.String str42 = reservation37.getGuestName();
        int int43 = reservation37.getRoomNumber();
        java.time.LocalDate localDate44 = reservation37.getCheckOutDate();
        int int45 = reservation37.getRoomNumber();
        java.time.LocalDate localDate46 = reservation37.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = reservationData0.addReservation(reservation37);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(localDate44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(localDate46);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 10, localDate2, localDate3, (double) 0L);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) ' ', localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.String str7 = reservation5.getGuestName();
        int int8 = reservation5.getRoomNumber();
        java.lang.String str9 = reservation5.getGuestName();
        java.lang.String str10 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("hi!", (int) 'a', localDate36, localDate37, (double) (byte) -1);
        int int40 = reservation39.getRoomNumber();
        java.time.LocalDate localDate41 = reservation39.getCheckInDate();
        java.time.LocalDate localDate42 = reservation39.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = reservationData0.addReservation(reservation39);
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
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertNull(localDate42);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        java.time.LocalDate localDate32 = null;
        java.time.LocalDate localDate33 = null;
        Business.Reservation reservation35 = new Business.Reservation("", (-1), localDate32, localDate33, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = reservationData0.addReservation(reservation35);
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
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        Data.ReservationData reservationData18 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList19 = reservationData18.getAllReservations();
        java.time.LocalDate localDate22 = null;
        java.time.LocalDate localDate23 = null;
        Business.Reservation reservation25 = new Business.Reservation("hi!", (int) (short) -1, localDate22, localDate23, (double) 1);
        java.lang.String str26 = reservation25.getGuestName();
        boolean boolean27 = reservationData18.addReservation(reservation25);
        java.time.LocalDate localDate28 = reservation25.getCheckInDate();
        java.time.LocalDate localDate29 = reservation25.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = reservationData0.addReservation(reservation25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertNull(localDate29);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, (double) 100L);
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        // The following exception was thrown during execution in test generation
        try {
            double double25 = reservation14.calculateTotalPrice();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) ' ', localDate2, localDate3, (double) (short) 1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        int int9 = reservation5.getRoomNumber();
        java.lang.String str10 = reservation5.getGuestName();
        int int11 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass12 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 97, localDate2, localDate3, (double) 0L);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckInDate();
        int int9 = reservation5.getRoomNumber();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        Data.ReservationData reservationData35 = new Data.ReservationData();
        java.time.LocalDate localDate38 = null;
        java.time.LocalDate localDate39 = null;
        Business.Reservation reservation41 = new Business.Reservation("hi!", (int) (short) -1, localDate38, localDate39, (double) 1);
        java.lang.String str42 = reservation41.getGuestName();
        boolean boolean43 = reservationData35.addReservation(reservation41);
        java.time.LocalDate localDate44 = reservation41.getCheckInDate();
        int int45 = reservation41.getRoomNumber();
        java.lang.String str46 = reservation41.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = reservationData0.addReservation(reservation41);
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(localDate44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 100, localDate2, localDate3, (double) (short) 100);
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
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("", 0, localDate3, localDate4, (double) 10.0f);
        java.time.LocalDate localDate7 = reservation6.getCheckInDate();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckOutDate();
        int int10 = reservation6.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = reservation21.toString();
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
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 0, localDate2, localDate3, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, (double) (byte) -1);
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
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
            double double18 = reservation15.calculateTotalPrice();
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        java.time.LocalDate localDate15 = reservation6.getCheckOutDate();
        java.time.LocalDate localDate16 = reservation6.getCheckInDate();
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
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        // The following exception was thrown during execution in test generation
        try {
            double double30 = reservation26.calculateTotalPrice();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, (double) 32);
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        Business.Reservation reservation28 = new Business.Reservation("hi!", 1, localDate25, localDate26, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = reservationData0.addReservation(reservation28);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.time.LocalDate localDate8 = reservation7.getCheckOutDate();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.util.List<Business.Reservation> reservationList10 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList11 = reservationData0.getAllReservations();
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        Business.Reservation reservation17 = new Business.Reservation("hi!", (int) (short) -1, localDate14, localDate15, (double) 1);
        java.lang.String str18 = reservation17.getGuestName();
        int int19 = reservation17.getRoomNumber();
        java.time.LocalDate localDate20 = reservation17.getCheckOutDate();
        int int21 = reservation17.getRoomNumber();
        java.lang.String str22 = reservation17.getGuestName();
        java.lang.String str23 = reservation17.getGuestName();
        java.time.LocalDate localDate24 = reservation17.getCheckInDate();
        java.time.LocalDate localDate25 = reservation17.getCheckOutDate();
        int int26 = reservation17.getRoomNumber();
        int int27 = reservation17.getRoomNumber();
        int int28 = reservation17.getRoomNumber();
        java.lang.String str29 = reservation17.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = reservationData0.addReservation(reservation17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 100, localDate2, localDate3, (double) 0);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '4', localDate2, localDate3, (double) (short) 1);
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        java.lang.Class<?> wildcardClass19 = reservation7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
            double double17 = reservation15.calculateTotalPrice();
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        int int13 = reservation6.getRoomNumber();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) (-1));
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) 100, localDate2, localDate3, 0.0d);
        int int6 = reservation5.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        Data.ReservationData reservationData40 = new Data.ReservationData();
        java.time.LocalDate localDate43 = null;
        java.time.LocalDate localDate44 = null;
        Business.Reservation reservation46 = new Business.Reservation("hi!", (int) (short) -1, localDate43, localDate44, (double) 1);
        java.lang.String str47 = reservation46.getGuestName();
        boolean boolean48 = reservationData40.addReservation(reservation46);
        java.lang.String str49 = reservation46.getGuestName();
        int int50 = reservation46.getRoomNumber();
        java.lang.String str51 = reservation46.getGuestName();
        java.time.LocalDate localDate52 = reservation46.getCheckInDate();
        java.lang.String str53 = reservation46.getGuestName();
        java.time.LocalDate localDate54 = reservation46.getCheckOutDate();
        int int55 = reservation46.getRoomNumber();
        java.lang.String str56 = reservation46.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = reservationData0.addReservation(reservation46);
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNull(localDate52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNull(localDate54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) 0.0f);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        java.time.LocalDate localDate24 = reservation23.getCheckOutDate();
        java.time.LocalDate localDate25 = reservation23.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        java.time.LocalDate localDate35 = null;
        java.time.LocalDate localDate36 = null;
        Business.Reservation reservation38 = new Business.Reservation("hi!", (int) (short) -1, localDate35, localDate36, (double) 1);
        int int39 = reservation38.getRoomNumber();
        java.time.LocalDate localDate40 = reservation38.getCheckOutDate();
        java.time.LocalDate localDate41 = reservation38.getCheckOutDate();
        int int42 = reservation38.getRoomNumber();
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
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) -1, localDate2, localDate3, (double) 10);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 100, localDate2, localDate3, (double) 97);
        java.lang.String str6 = reservation5.getGuestName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        java.time.LocalDate localDate36 = null;
        java.time.LocalDate localDate37 = null;
        Business.Reservation reservation39 = new Business.Reservation("hi!", (int) (short) -1, localDate36, localDate37, (double) 1);
        java.time.LocalDate localDate40 = reservation39.getCheckOutDate();
        boolean boolean41 = reservationData32.addReservation(reservation39);
        java.lang.String str42 = reservation39.getGuestName();
        java.time.LocalDate localDate43 = reservation39.getCheckInDate();
        int int44 = reservation39.getRoomNumber();
        java.time.LocalDate localDate45 = reservation39.getCheckOutDate();
        java.time.LocalDate localDate46 = reservation39.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = reservationData0.addReservation(reservation39);
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
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationList33);
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNull(localDate43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(localDate45);
        org.junit.Assert.assertNull(localDate46);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        java.lang.Class<?> wildcardClass18 = reservationList17.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        java.util.List<Business.Reservation> reservationList24 = reservationData0.getAllReservations();
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", 10, localDate27, localDate28, (double) 10.0f);
        boolean boolean31 = reservationData0.addReservation(reservation30);
        java.time.LocalDate localDate34 = null;
        java.time.LocalDate localDate35 = null;
        Business.Reservation reservation37 = new Business.Reservation("hi!", (int) ' ', localDate34, localDate35, (double) (short) 1);
        java.time.LocalDate localDate38 = reservation37.getCheckOutDate();
        boolean boolean39 = reservationData0.addReservation(reservation37);
        Data.ReservationData reservationData40 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList41 = reservationData40.getAllReservations();
        java.time.LocalDate localDate44 = null;
        java.time.LocalDate localDate45 = null;
        Business.Reservation reservation47 = new Business.Reservation("hi!", (int) (short) -1, localDate44, localDate45, (double) 1);
        java.time.LocalDate localDate48 = reservation47.getCheckOutDate();
        boolean boolean49 = reservationData40.addReservation(reservation47);
        java.time.LocalDate localDate50 = reservation47.getCheckInDate();
        java.time.LocalDate localDate51 = reservation47.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = reservationData0.addReservation(reservation47);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(localDate38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(reservationList41);
        org.junit.Assert.assertNull(localDate48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(localDate50);
        org.junit.Assert.assertNull(localDate51);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        java.lang.String str19 = reservation15.getGuestName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 10, localDate2, localDate3, 10.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.String str8 = reservation5.getGuestName();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 35, localDate2, localDate3, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        java.lang.Class<?> wildcardClass17 = reservation8.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        java.lang.Class<?> wildcardClass20 = reservationData0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        java.lang.Class<?> wildcardClass34 = reservationList33.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        Business.Reservation reservation36 = new Business.Reservation("", 1, localDate33, localDate34, (double) (-1));
        java.time.LocalDate localDate37 = reservation36.getCheckOutDate();
        boolean boolean38 = reservationData0.addReservation(reservation36);
        java.lang.Class<?> wildcardClass39 = reservation36.getClass();
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
        org.junit.Assert.assertNull(localDate37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        Business.Reservation reservation7 = new Business.Reservation("hi!", (int) (short) -1, localDate4, localDate5, (double) 1);
        java.lang.String str8 = reservation7.getGuestName();
        boolean boolean9 = reservationData0.addReservation(reservation7);
        java.lang.String str10 = reservation7.getGuestName();
        java.time.LocalDate localDate11 = reservation7.getCheckOutDate();
        java.lang.String str12 = reservation7.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        java.lang.Class<?> wildcardClass40 = reservation35.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        java.time.LocalDate localDate35 = reservation30.getCheckInDate();
        java.time.LocalDate localDate36 = reservation30.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double37 = reservation30.calculateTotalPrice();
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
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertNull(localDate36);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        java.util.List<Business.Reservation> reservationList32 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass33 = reservationData0.getClass();
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
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 10, localDate2, localDate3, (double) '#');
        int int6 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        java.util.List<Business.Reservation> reservationList25 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass26 = reservationList25.getClass();
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
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        Data.ReservationData reservationData25 = new Data.ReservationData();
        java.time.LocalDate localDate28 = null;
        java.time.LocalDate localDate29 = null;
        Business.Reservation reservation31 = new Business.Reservation("hi!", (int) (short) -1, localDate28, localDate29, (double) 1);
        java.lang.String str32 = reservation31.getGuestName();
        boolean boolean33 = reservationData25.addReservation(reservation31);
        java.time.LocalDate localDate34 = reservation31.getCheckInDate();
        java.time.LocalDate localDate35 = reservation31.getCheckOutDate();
        java.time.LocalDate localDate36 = reservation31.getCheckOutDate();
        int int37 = reservation31.getRoomNumber();
        int int38 = reservation31.getRoomNumber();
        java.time.LocalDate localDate39 = reservation31.getCheckInDate();
        boolean boolean40 = reservationData0.addReservation(reservation31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = reservation31.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) '#', localDate2, localDate3, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        Data.ReservationData reservationData24 = new Data.ReservationData();
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", (int) (short) -1, localDate27, localDate28, (double) 1);
        java.lang.String str31 = reservation30.getGuestName();
        boolean boolean32 = reservationData24.addReservation(reservation30);
        java.time.LocalDate localDate33 = reservation30.getCheckInDate();
        java.time.LocalDate localDate34 = reservation30.getCheckOutDate();
        java.time.LocalDate localDate35 = reservation30.getCheckOutDate();
        int int36 = reservation30.getRoomNumber();
        java.time.LocalDate localDate37 = reservation30.getCheckOutDate();
        java.time.LocalDate localDate38 = reservation30.getCheckOutDate();
        java.time.LocalDate localDate39 = reservation30.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = reservationData0.addReservation(reservation30);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(localDate37);
        org.junit.Assert.assertNull(localDate38);
        org.junit.Assert.assertNull(localDate39);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 100, localDate2, localDate3, 100.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        java.lang.String str14 = reservation7.getGuestName();
        java.lang.String str15 = reservation7.getGuestName();
        java.time.LocalDate localDate16 = reservation7.getCheckInDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        java.lang.String str30 = reservation28.getGuestName();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        Business.Reservation reservation30 = new Business.Reservation("", (int) '4', localDate27, localDate28, (double) 1.0f);
        java.lang.String str31 = reservation30.getGuestName();
        boolean boolean32 = reservationData0.addReservation(reservation30);
        // The following exception was thrown during execution in test generation
        try {
            double double33 = reservation30.calculateTotalPrice();
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
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, (double) (byte) -1);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = reservation25.toString();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        java.time.LocalDate localDate14 = reservation8.getCheckOutDate();
        java.lang.String str15 = reservation8.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 10, localDate2, localDate3, (double) 1.0f);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) -1, localDate2, localDate3, (double) (-1L));
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.lang.String str8 = reservation5.getGuestName();
        int int9 = reservation5.getRoomNumber();
        java.lang.Class<?> wildcardClass10 = reservation5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        java.lang.Class<?> wildcardClass34 = reservationData0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (-1), localDate2, localDate3, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        java.time.LocalDate localDate34 = null;
        java.time.LocalDate localDate35 = null;
        Business.Reservation reservation37 = new Business.Reservation("hi!", (int) (short) 100, localDate34, localDate35, (double) '#');
        boolean boolean38 = reservationData0.addReservation(reservation37);
        java.lang.Class<?> wildcardClass39 = reservationData0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = reservation68.toString();
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
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        java.time.LocalDate localDate52 = null;
        java.time.LocalDate localDate53 = null;
        Business.Reservation reservation55 = new Business.Reservation("hi!", 97, localDate52, localDate53, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = reservationData0.addReservation(reservation55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 52, localDate2, localDate3, (double) (byte) 1);
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass7 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 0, localDate2, localDate3, 10.0d);
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = reservation18.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList1 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList2 = reservationData0.getAllReservations();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        Business.Reservation reservation8 = new Business.Reservation("hi!", (int) 'a', localDate5, localDate6, (double) (byte) -1);
        boolean boolean9 = reservationData0.addReservation(reservation8);
        java.time.LocalDate localDate10 = reservation8.getCheckInDate();
        java.time.LocalDate localDate11 = reservation8.getCheckOutDate();
        java.lang.String str12 = reservation8.getGuestName();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        Data.ReservationData reservationData69 = new Data.ReservationData();
        java.util.List<Business.Reservation> reservationList70 = reservationData69.getAllReservations();
        Data.ReservationData reservationData71 = new Data.ReservationData();
        java.time.LocalDate localDate74 = null;
        java.time.LocalDate localDate75 = null;
        Business.Reservation reservation77 = new Business.Reservation("hi!", (int) (short) -1, localDate74, localDate75, (double) 1);
        java.lang.String str78 = reservation77.getGuestName();
        boolean boolean79 = reservationData71.addReservation(reservation77);
        java.time.LocalDate localDate80 = reservation77.getCheckInDate();
        int int81 = reservation77.getRoomNumber();
        boolean boolean82 = reservationData69.addReservation(reservation77);
        int int83 = reservation77.getRoomNumber();
        java.time.LocalDate localDate84 = reservation77.getCheckOutDate();
        java.time.LocalDate localDate85 = reservation77.getCheckInDate();
        int int86 = reservation77.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean87 = reservationData0.addReservation(reservation77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isBefore(java.time.chrono.ChronoLocalDate)\" because the return value of \"Business.Reservation.getCheckInDate()\" is null");
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
        org.junit.Assert.assertNotNull(reservationList70);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(localDate80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNull(localDate84);
        org.junit.Assert.assertNull(localDate85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 1, localDate2, localDate3, (double) (-1));
        java.lang.String str6 = reservation5.getGuestName();
        java.lang.String str7 = reservation5.getGuestName();
        java.lang.String str8 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = reservation9.toString();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        java.util.List<Business.Reservation> reservationList24 = reservationData0.getAllReservations();
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        Business.Reservation reservation30 = new Business.Reservation("hi!", 10, localDate27, localDate28, (double) 10.0f);
        boolean boolean31 = reservationData0.addReservation(reservation30);
        java.util.List<Business.Reservation> reservationList32 = reservationData0.getAllReservations();
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
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(reservationList32);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation6.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        java.lang.Class<?> wildcardClass24 = reservationList23.getClass();
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        int int14 = reservation5.getRoomNumber();
        int int15 = reservation5.getRoomNumber();
        int int16 = reservation5.getRoomNumber();
        java.lang.String str17 = reservation5.getGuestName();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = reservation5.calculateTotalPrice();
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
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        Data.ReservationData reservationData27 = new Data.ReservationData();
        java.time.LocalDate localDate30 = null;
        java.time.LocalDate localDate31 = null;
        Business.Reservation reservation33 = new Business.Reservation("hi!", (int) (short) -1, localDate30, localDate31, (double) 1);
        java.lang.String str34 = reservation33.getGuestName();
        boolean boolean35 = reservationData27.addReservation(reservation33);
        java.lang.String str36 = reservation33.getGuestName();
        int int37 = reservation33.getRoomNumber();
        java.lang.String str38 = reservation33.getGuestName();
        java.time.LocalDate localDate39 = reservation33.getCheckInDate();
        java.lang.String str40 = reservation33.getGuestName();
        java.time.LocalDate localDate41 = reservation33.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = reservationData0.addReservation(reservation33);
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
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNull(localDate39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(localDate41);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (byte) 1, localDate2, localDate3, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        java.lang.String str44 = reservation35.getGuestName();
        java.time.LocalDate localDate45 = reservation35.getCheckInDate();
        java.time.LocalDate localDate46 = reservation35.getCheckOutDate();
        java.time.LocalDate localDate47 = reservation35.getCheckOutDate();
        java.time.LocalDate localDate48 = reservation35.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = reservationData0.addReservation(reservation35);
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
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertNotNull(reservationList27);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(localDate38);
        org.junit.Assert.assertNull(localDate39);
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertNull(localDate42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNull(localDate45);
        org.junit.Assert.assertNull(localDate46);
        org.junit.Assert.assertNull(localDate47);
        org.junit.Assert.assertNull(localDate48);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) 'a', localDate2, localDate3, (double) (byte) -1);
        int int6 = reservation5.getRoomNumber();
        int int7 = reservation5.getRoomNumber();
        java.lang.String str8 = reservation5.getGuestName();
        java.time.LocalDate localDate9 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        Data.ReservationData reservationData0 = new Data.ReservationData();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        Business.Reservation reservation6 = new Business.Reservation("hi!", (int) (short) -1, localDate3, localDate4, (double) 1);
        java.lang.String str7 = reservation6.getGuestName();
        boolean boolean8 = reservationData0.addReservation(reservation6);
        java.time.LocalDate localDate9 = reservation6.getCheckInDate();
        java.time.LocalDate localDate10 = reservation6.getCheckInDate();
        java.time.LocalDate localDate11 = reservation6.getCheckOutDate();
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
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        java.lang.Class<?> wildcardClass17 = reservation15.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) 'a', localDate2, localDate3, 0.0d);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        int int17 = reservation15.getRoomNumber();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        int int43 = reservation40.getRoomNumber();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (short) -1);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.lang.Class<?> wildcardClass9 = reservation5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 0, localDate2, localDate3, (double) 32);
        int int6 = reservation5.getRoomNumber();
        java.time.LocalDate localDate7 = reservation5.getCheckOutDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        Business.Reservation reservation48 = new Business.Reservation("", (int) (short) 1, localDate45, localDate46, (double) (byte) 0);
        boolean boolean49 = reservationData0.addReservation(reservation48);
        java.util.List<Business.Reservation> reservationList50 = reservationData0.getAllReservations();
        java.util.List<Business.Reservation> reservationList51 = reservationData0.getAllReservations();
        java.time.LocalDate localDate54 = null;
        java.time.LocalDate localDate55 = null;
        Business.Reservation reservation57 = new Business.Reservation("hi!", (int) 'a', localDate54, localDate55, (double) (byte) -1);
        java.time.LocalDate localDate58 = reservation57.getCheckOutDate();
        java.time.LocalDate localDate59 = reservation57.getCheckOutDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = reservationData0.addReservation(reservation57);
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(reservationList50);
        org.junit.Assert.assertNotNull(reservationList51);
        org.junit.Assert.assertNull(localDate58);
        org.junit.Assert.assertNull(localDate59);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 1, localDate2, localDate3, (double) (-1));
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", (int) (short) -1, localDate2, localDate3, (double) 1);
        java.lang.String str6 = reservation5.getGuestName();
        int int7 = reservation5.getRoomNumber();
        java.time.LocalDate localDate8 = reservation5.getCheckOutDate();
        java.lang.String str9 = reservation5.getGuestName();
        java.lang.String str10 = reservation5.getGuestName();
        java.lang.Class<?> wildcardClass11 = reservation5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        int int13 = reservation7.getRoomNumber();
        java.time.LocalDate localDate14 = reservation7.getCheckInDate();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (short) 100, localDate2, localDate3, 0.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckInDate();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        Business.Reservation reservation23 = new Business.Reservation("hi!", (int) 'a', localDate20, localDate21, (double) (byte) -1);
        boolean boolean24 = reservationData17.addReservation(reservation23);
        java.util.List<Business.Reservation> reservationList25 = reservationData17.getAllReservations();
        java.util.List<Business.Reservation> reservationList26 = reservationData17.getAllReservations();
        java.time.LocalDate localDate29 = null;
        java.time.LocalDate localDate30 = null;
        Business.Reservation reservation32 = new Business.Reservation("hi!", (int) (byte) 0, localDate29, localDate30, (-1.0d));
        boolean boolean33 = reservationData17.addReservation(reservation32);
        Data.ReservationData reservationData34 = new Data.ReservationData();
        java.time.LocalDate localDate37 = null;
        java.time.LocalDate localDate38 = null;
        Business.Reservation reservation40 = new Business.Reservation("hi!", (int) (short) -1, localDate37, localDate38, (double) 1);
        java.lang.String str41 = reservation40.getGuestName();
        boolean boolean42 = reservationData34.addReservation(reservation40);
        java.time.LocalDate localDate43 = reservation40.getCheckInDate();
        int int44 = reservation40.getRoomNumber();
        java.time.LocalDate localDate45 = reservation40.getCheckInDate();
        int int46 = reservation40.getRoomNumber();
        boolean boolean47 = reservationData17.addReservation(reservation40);
        java.time.LocalDate localDate50 = null;
        java.time.LocalDate localDate51 = null;
        Business.Reservation reservation53 = new Business.Reservation("hi!", (int) (byte) 100, localDate50, localDate51, (double) (short) 100);
        int int54 = reservation53.getRoomNumber();
        java.lang.String str55 = reservation53.getGuestName();
        boolean boolean56 = reservationData17.addReservation(reservation53);
        boolean boolean57 = reservationData0.addReservation(reservation53);
        java.lang.Class<?> wildcardClass58 = reservation53.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(reservationList26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(localDate43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(localDate45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 10, localDate2, localDate3, 10.0d);
        java.lang.Class<?> wildcardClass6 = reservation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", 0, localDate2, localDate3, (double) 10.0f);
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("hi!", 0, localDate2, localDate3, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = reservation5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        java.util.List<Business.Reservation> reservationList23 = reservationData0.getAllReservations();
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
        org.junit.Assert.assertNotNull(reservationList23);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        java.util.List<Business.Reservation> reservationList25 = reservationData0.getAllReservations();
        java.lang.Class<?> wildcardClass26 = reservationList25.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        java.lang.Class<?> wildcardClass45 = reservationData0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 10, localDate2, localDate3, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        java.time.LocalDate localDate15 = reservation5.getCheckInDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = localDate15.getClass();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) -1, localDate2, localDate3, (double) 1.0f);
        int int6 = reservation5.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 1, localDate2, localDate3, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservation5.calculateTotalPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"temporal1Inclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        Business.Reservation reservation5 = new Business.Reservation("", (int) (byte) 10, localDate2, localDate3, 10.0d);
        java.time.LocalDate localDate6 = reservation5.getCheckOutDate();
        org.junit.Assert.assertNull(localDate6);
    }
}

