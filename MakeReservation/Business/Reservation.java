package Business;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Represents a single hotel reservation.
 * Containts guest details, room number, dates, and price.
 */

public class Reservation {
    private String guestName;
    private int roomNumber;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private double pricePerNight;

    public Reservation(String guestName, int roomNumber, LocalDate checkInDate, LocalDate checkOutDate, double pricePerNight) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.pricePerNight = pricePerNight;
    }

    // Calculate total price
    public double calculateTotalPrice() {
        long nights = ChronoUnit.DAYS.between(checkInDate, checkOutDate);
        return nights * pricePerNight;
    }

    // Getters
    public String getGuestName() { return guestName; }
    public int getRoomNumber() { return roomNumber; }
    public LocalDate getCheckInDate() { return checkInDate; }
    public LocalDate getCheckOutDate() { return checkOutDate; }

    // To display reservation info
    @Override
    public String toString() {
        return "Guest: " + guestName +
               ", Room: " + roomNumber +
               ", Check-in: " + checkInDate +
               ", Check-out: " + checkOutDate +
               ", Total: $" + calculateTotalPrice();
    }
}
