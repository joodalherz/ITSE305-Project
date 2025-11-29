
package Presentation;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

/**
 * Smoke tests for ReservationUI (presentation layer)
 * using simulated user input and captured console output.
 */
public class ReservationUITest {

    private final PrintStream originalOut = System.out;
    private final java.io.InputStream originalIn = System.in;

    @AfterEach
    void restoreIO() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void main_createsReservationAndPrintsSuccess() {
        // Input sequence: name, room, check-in, check-out, price, no
        String input = String.join(System.lineSeparator(),
                "Sara",
                "101",
                "2025-10-05",
                "2025-10-06",
                "100",
                "no"
        ) + System.lineSeparator();

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ReservationUI.main(new String[]{});

        String console = out.toString();
        assertTrue(console.contains("Reservation created successfully!"));
        assertTrue(console.contains("Guest: Sara"));
        assertTrue(console.contains("Room: 101"));
    }

    @Test
    void main_blocksOverlappingReservation() {
        // First reservation succeeds, second overlaps same room → should block.
        String input = String.join(System.lineSeparator(),
                // First booking
                "Ali",          // name
                "101",          // room
                "2025-10-05",   // check-in
                "2025-10-08",   // check-out
                "100",          // price
                "yes",          // continue

                // Second booking (overlap same room)
                "Khalid",
                "101",
                "2025-10-06",
                "2025-10-07",
                "120",
                "no"            // exit
        ) + System.lineSeparator();

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ReservationUI.main(new String[]{});

        String console = out.toString();
        assertTrue(console.contains("Reservation created successfully!"));
        assertTrue(console.contains("Room is not available"));
        assertTrue(console.contains("Reservation failed"));
    }
}
