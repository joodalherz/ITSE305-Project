import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testUserCreation() {
        User user = new User("John Doe", "john@example.com", "password123");

        assertEquals("John Doe", user.getName());
        assertEquals("john@example.com", user.getEmail());
        assertEquals("password123", user.getPassword());
    }

    @Test
    public void testUserWithEmptyFields() {
        User user = new User("", "", "");

        assertEquals("", user.getName());
        assertEquals("", user.getEmail());
        assertEquals("", user.getPassword());
    }

    @Test
    public void testUserWithSpecialCharacters() {
        User user = new User("John-Doe", "john.doe+test@example.com", "p@ssw0rd!");

        assertEquals("John-Doe", user.getName());
        assertEquals("john.doe+test@example.com", user.getEmail());
        assertEquals("p@ssw0rd!", user.getPassword());
    }
}