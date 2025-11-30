package Business;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

/**
 * Tests for Reservation (business layer).
 */
public class ReservationTest {

    @Test
    void calculateTotalPrice_returnsNightsTimesPrice() {
        Reservation r = new Reservation(
                "Sarah", 101,
                LocalDate.of(2025, 10, 5),
                LocalDate.of(2025, 10, 8), // 3 nights
                100.0);

        assertEquals(300.0, r.calculateTotalPrice(), 0.0001);
    }

    @Test
    void toString_containsKeyFields() {
        Reservation r = new Reservation(
                "Ali", 202,
                LocalDate.of(2025, 11, 1),
                LocalDate.of(2025, 11, 3),
                90.0);

        String s = r.toString();
        assertTrue(s.contains("Ali"));
        assertTrue(s.contains("Room: 202"));
        assertTrue(s.contains("Check-in: 2025-11-01"));
        assertTrue(s.contains("Check-out: 2025-11-03"));
    }
}
