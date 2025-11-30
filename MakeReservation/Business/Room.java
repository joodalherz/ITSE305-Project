package Business;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Room {
    private int roomNumber;
    private String type;
    private double pricePerNight;
    private int capacity;
    private String status;
    private String lastUpdated;

    // Parameterized constructor
    public Room(int roomNumber, String type, double pricePerNight, int capacity, String status) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
        this.status = status;
        // Automatically set current time when room is created
        this.lastUpdated = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    // Getters
    public int getRoomNumber() { return roomNumber; }
    public String getType() { return type; }
    public double getPricePerNight() { return pricePerNight; }
    public int getCapacity() { return capacity; }
    public String getStatus() { return status; }
    public String getLastUpdated() { return lastUpdated; }

    // Setters
    public void setType(String type) {
        this.type = type;
        updateTime();
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
        updateTime();
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
        updateTime();
    }

    public void setStatus(String status) {
        this.status = status;
        updateTime();
    }

    // Helper method to update lastUpdated when any change happens
    private void updateTime() {
        this.lastUpdated = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}


