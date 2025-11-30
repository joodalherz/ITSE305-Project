package Business;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RoomManagementTest {

    // Reset the in-memory data before each test
    @Before
    public void resetRooms() {
        RoomManagement.rooms.clear();   // package-private -> accessible from tests
    }

    @Test
    public void find_returnsRoomWhenExists() {
        Room r = new Room(301, "Single", 25.0, 1, "Available");
        RoomManagement.rooms.add(r);

        Room found = RoomManagement.find(301);
        assertNotNull(found);
        assertEquals("Single", found.getType());
        assertSame("Should be the exact same object", r, found);
    }

    @Test
    public void find_returnsNullWhenNotExists() {
        assertNull(RoomManagement.find(999));
    }

    @Test
    public void updateFlow_changesFieldsForExistingRoom() {
        Room r = new Room(302, "Double", 60.0, 2, "Available");
        RoomManagement.rooms.add(r);

        // simulate “update” using the Room setters (your menu calls these)
        String t1 = r.getLastUpdated();
        try { Thread.sleep(1100); } catch (InterruptedException ignored) {}

        r.setType("Suite");
        r.setCapacity(3);
        r.setPricePerNight(75.0);
        r.setStatus("Reserved");

        Room fromList = RoomManagement.find(302);
        assertEquals("Suite", fromList.getType());
        assertEquals(3, fromList.getCapacity());
        assertEquals(75.0, fromList.getPricePerNight(), 1e-9);
        assertEquals("Reserved", fromList.getStatus());
        assertNotEquals("Timestamp should refresh after setters", t1, fromList.getLastUpdated());
    }

    @Test
    public void delete_removesRoomFromList() {
        Room r = new Room(303, "Single", 20.0, 1, "Available");
        RoomManagement.rooms.add(r);
        assertNotNull(RoomManagement.find(303));

        // simulate delete() logic: remove the found room
        RoomManagement.rooms.remove(RoomManagement.find(303));
        assertNull(RoomManagement.find(303));
        assertEquals(0, RoomManagement.rooms.size());
    }

    @Test
    public void view_printsFormattedRoomList() {
        // Arrange
        RoomManagement.rooms.add(new Room(304, "Deluxe", 99.5, 2, "Available"));

        // Capture System.out
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream oldOut = System.out;
        System.setOut(new PrintStream(baos));

        try {
            RoomManagement.view(); // Act
        } finally {
            System.setOut(oldOut); // restore
        }

        String out = baos.toString();
        // Assert: basic things appear
        assertTrue(out.contains("Room List"));
        assertTrue(out.contains("Room Number: 304"));
        assertTrue(out.contains("Type: Deluxe"));
        assertTrue(out.contains("Capacity: 2"));
        assertTrue(out.contains("Price: BD 99.50"));
        assertTrue(out.contains("Status: Available"));
    }
}

