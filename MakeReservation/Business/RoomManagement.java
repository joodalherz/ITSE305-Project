package Business;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RoomManagement {
    static ArrayList<Room> rooms = new ArrayList<>(); // List of all rooms
    static Scanner sc = new Scanner(System.in);      // For user input
    static String lastUpdated = "Never";

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println();

            // Added after review: Comment explaining menu purpose
            System.out.println("Hotel Room Management");
            System.out.println("1. Add Room");
            System.out.println("2. Update Room");
            System.out.println("3. Delete Room");
            System.out.println("4. View All Rooms");
            System.out.println("5. Exit");

            System.out.print("Choose a menu number and press Enter: ");
            choice = sc.nextInt();

            if (choice == 1) add();
            else if (choice == 2) update();
            else if (choice == 3) delete();
            else if (choice == 4) view();

        } while (choice != 5);

        System.out.println("Goodbye!");
    }

    // Show all rooms
    static void view() {
        if (rooms.isEmpty()) {
            System.out.println("No rooms to show.");
            return;
        }
        System.out.println("\nRoom List:");
        for (Room r : rooms) {
            System.out.println("Room Number: " + r.getRoomNumber());
            System.out.println("Type: " + r.getType());
            System.out.println("Capacity: " + r.getCapacity());
            System.out.printf("Price: BD %.2f\n", r.getPricePerNight());
            System.out.println("Status: " + r.getStatus());
            System.out.println("Last Updated: " + r.getLastUpdated());
            System.out.println("-----------------------------------");
        }
    }

    // Find a room by its number
    static Room find(int number) {
        for (Room r : rooms) {
            if (r.getRoomNumber() == number) return r;
        }
        return null;
    }

    // Add a new room
    static void add() {
        System.out.println("Adding a new room:");
        System.out.print("Enter room number (e.g. 101): ");
        int number = sc.nextInt();

        // Added after review: ensure duplicate room number cannot be added
        if (find(number) != null) {
            System.out.println("Room already exists. Duplicate numbers are not allowed.");
            return;
        }

        sc.nextLine(); // clear buffer
        System.out.print("Enter type (Single, Double, Suite): ");
        String type = sc.nextLine();

        System.out.print("Enter capacity (number of people): ");
        int capacity = sc.nextInt();

        System.out.print("Enter price in BD : ");
        double price = sc.nextDouble();

        sc.nextLine();
        System.out.print("Enter status (e.g. Available, Reserved): ");
        String status = sc.nextLine();

        rooms.add(new Room(number, type, price, capacity, status));
        System.out.println("Room added successfully.");
    }

    // Update a room
    static void update() {
        System.out.println("Updating a room:");
        System.out.print("Enter room number to update: ");
        int number = sc.nextInt();

        Room r = find(number);
        if (r == null) {
            System.out.println("Room not found.");
            return;
        }

        sc.nextLine();
        System.out.print("New type (leave blank to keep): ");
        String type = sc.nextLine();

        System.out.print("New capacity (0 to keep): ");
        int capacity = sc.nextInt();

        System.out.print("New price in BD (0 to keep): ");
        double price = sc.nextDouble();

        sc.nextLine();
        System.out.print("New status (leave blank to keep): ");
        String status = sc.nextLine();

        // Added after review: refactoring repeated update logic into one method
        updateRoomFields(r, type, capacity, price, status);

        System.out.println("Room updated successfully.");
    }

    // Added after review: helper method to reduce redundancy in update()
    public static void updateRoomFields(Room room, String type, int capacity, double price, String status) {
        if (!type.isEmpty()) room.setType(type);
        if (capacity > 0) room.setCapacity(capacity);
        if (price > 0) room.setPricePerNight(price);
        if (!status.isEmpty()) room.setStatus(status);
    }

    // Delete a room
    static void delete() {
        System.out.print("Enter room number to delete: ");
        int number = sc.nextInt();

        Room r = find(number);
        if (r == null) {
            System.out.println("Room not found.");
            System.out.println("Last updated: " + lastUpdated);
            return;
        }

        rooms.remove(r);
        System.out.println("Room deleted.");
    }
}
