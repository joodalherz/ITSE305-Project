package Presentation;

import Business.Reservation;
import Data.ReservationData;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Handles user interaction for making reservations.
 * Allows multiple bookings and checks room availability.
 */

public class ReservationUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationData data = new ReservationData(); // stays in memory

        System.out.println("=== Welcome to Hotel Reservation System ===");

        while (true) {
            System.out.println("\n--- Make a Reservation ---");

            System.out.print("Enter guest name: ");
            String name = scanner.nextLine();

            System.out.print("Enter room number: ");
            int room = scanner.nextInt();

            if(room < 0){
            System.out.println("Invalid room number, please input positive number");
            continue;
            }

            System.out.print("Enter check-in date (YYYY-MM-DD): ");
            LocalDate checkIn = LocalDate.parse(scanner.next());

            System.out.print("Enter check-out date (YYYY-MM-DD): ");
            LocalDate checkOut = LocalDate.parse(scanner.next());

            System.out.print("Enter price per night: ");
            double price = scanner.nextDouble();
            
            if(price < 0){
            System.out.println("Invalid price number, please input positive number");
            continue;
            }
            scanner.nextLine(); // consume leftover newline

            // Create reservation
            Reservation reservation = new Reservation(name, room, checkIn, checkOut, price);

            // Try to add it
            boolean added = data.addReservation(reservation);

            if (added) {
                System.out.println("\nReservation created successfully!\n");
                System.out.println("Reservation Details:");
                System.out.println(reservation);
            } else {
                System.out.println("\n❌ Room is not available for the selected dates!");
                System.out.println("Reservation failed. Please choose a different date or room.");
            }

            // Ask user if they want to continue
            System.out.print("\nDo you want to make another reservation? (yes/no): ");
            String again = scanner.nextLine();

            if (again.equalsIgnoreCase("no")) {
                System.out.println("\nThank you for using the Hotel Reservation System. Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}
