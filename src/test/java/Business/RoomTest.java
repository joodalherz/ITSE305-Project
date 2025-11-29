package Business;

import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {

    // Helper: because lastUpdated is formatted to seconds, we must wait > 1s
    private void waitOneSecond() {
        try { Thread.sleep(1100); } catch (InterruptedException ignored) {}
    }

    @Test
    public void constructor_setsAllFields_andInitialTimestamp() {
        Room r = new Room(101, "Single", 30.0, 1, "Available");

        assertEquals(101, r.getRoomNumber());
        assertEquals("Single", r.getType());
        assertEquals(30.0, r.getPricePerNight(), 1e-9);
        assertEquals(1, r.getCapacity());
        assertEquals("Available", r.getStatus());

        String ts = r.getLastUpdated();
        assertNotNull(ts);
        assertTrue(ts.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}"));
    }

    @Test
    public void setPricePerNight_updatesValue_andTimestampChanges() {
        Room r = new Room(102, "Double", 50.0, 2, "Available");
        String before = r.getLastUpdated();

        waitOneSecond();                // ensure different second
        r.setPricePerNight(55.5);

        assertEquals(55.5, r.getPricePerNight(), 1e-9);
        assertNotEquals(before, r.getLastUpdated());
    }

    @Test
    public void setStatus_updatesValue_andTimestampChanges() {
        Room r = new Room(103, "Suite", 120.0, 4, "Available");
        String before = r.getLastUpdated();

        waitOneSecond();
        r.setStatus("Reserved");

        assertEquals("Reserved", r.getStatus());
        assertNotEquals(before, r.getLastUpdated());
    }

    @Test
    public void setCapacity_updatesValue_andTimestampChanges() {
        Room r = new Room(104, "Single", 25.0, 1, "Available");
        String before = r.getLastUpdated();

        waitOneSecond();
        r.setCapacity(2);

        assertEquals(2, r.getCapacity());
        assertNotEquals(before, r.getLastUpdated());
    }

    @Test
    public void setType_updatesValue_andTimestampChanges() {
        Room r = new Room(105, "Single", 25.0, 1, "Available");
        String before = r.getLastUpdated();

        waitOneSecond();
        r.setType("Double");

        assertEquals("Double", r.getType());
        assertNotEquals(before, r.getLastUpdated());
    }
}

