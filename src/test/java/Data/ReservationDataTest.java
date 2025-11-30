package Data;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Business.Reservation;

/**
 * Tests for ReservationData (data layer).
 */
public class ReservationDataTest {

    private ReservationData data;

    @BeforeEach
    void setup() {
        data = new ReservationData();
    }

    @Test
    void addFirstReservation_succeeds() {
        Reservation r1 = new Reservation(
                "Sarah", 101,
                LocalDate.of(2025, 10, 5),
                LocalDate.of(2025, 10, 8),
                100.0);

        assertTrue(data.addReservation(r1));
        List<Reservation> all = data.getAllReservations();
        assertEquals(1, all.size());
    }

    @Test
    void addOverlappingForSameRoom_fails() {
        Reservation r1 = new Reservation(
                "Sarah", 101,
                LocalDate.of(2025, 10, 5),
                LocalDate.of(2025, 10, 8),
                100.0);
        assertTrue(data.addReservation(r1));

        Reservation r2 = new Reservation(
                "Ali", 101,
                LocalDate.of(2025, 10, 6), // overlaps
                LocalDate.of(2025, 10, 7),
                120.0);

        assertFalse(data.addReservation(r2)); // should be blocked
        assertEquals(1, data.getAllReservations().size());
    }

    @Test
    void addNonOverlappingForSameRoom_succeeds() {
        Reservation r1 = new Reservation(
                "Sarah", 101,
                LocalDate.of(2025, 10, 5),
                LocalDate.of(2025, 10, 8),
                100.0);
        assertTrue(data.addReservation(r1));

        Reservation r3 = new Reservation(
                "Fatima", 101,
                LocalDate.of(2025, 10, 9), // no overlap
                LocalDate.of(2025, 10, 11),
                100.0);

        assertTrue(data.addReservation(r3));
        assertEquals(2, data.getAllReservations().size());
    }

    @Test
    void addSameDatesDifferentRoom_succeeds() {
        Reservation r1 = new Reservation(
                "Sarah", 101,
                LocalDate.of(2025, 10, 5),
                LocalDate.of(2025, 10, 8),
                100.0);
        assertTrue(data.addReservation(r1));

        Reservation r4 = new Reservation(
                "Ahmed", 102, // different room
                LocalDate.of(2025, 10, 6),
                LocalDate.of(2025, 10, 8),
                90.0);

        assertTrue(data.addReservation(r4));
        assertEquals(2, data.getAllReservations().size());
    }
}
