package Data;

import Business.Reservation;
import java.util.ArrayList;
import java.util.List;

public class ReservationData {
    private List<Reservation> reservations;

    public ReservationData() {
        reservations = new ArrayList<>();
    }

    // Add new reservation only if the room is available
    public boolean addReservation(Reservation newReservation) {
        if (isRoomAvailable(newReservation)) {
            reservations.add(newReservation);
            System.out.println("✅ Reservation added successfully!");
            return true;
        } else {
            System.out.println("❌ Room is not available for the selected dates!");
            return false;
        }
    }

    // Check if a room is available for given dates
    private boolean isRoomAvailable(Reservation newReservation) {
        for (Reservation existing : reservations) {
            // If room numbers match
            if (existing.getRoomNumber() == newReservation.getRoomNumber()) {
                // Check if dates overlap
                if (datesOverlap(existing, newReservation)) {
                    return false; // not available
                }
            }
        }
        return true; // available
    }

    // Check if two date ranges overlap
    private boolean datesOverlap(Reservation r1, Reservation r2) {
        // Overlaps if: start1 < end2 AND start2 < end1
        return (r1.getCheckInDate().isBefore(r2.getCheckOutDate()) &&
                r2.getCheckInDate().isBefore(r1.getCheckOutDate()));
    }

    public List<Reservation> getAllReservations() {
        return reservations;
    }
}
