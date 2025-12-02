import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private UserService userService;

    @BeforeEach
    public void setUp() {
        userService = new UserService();
    }

    @Test
    public void testRegisterUserSuccess() {
        boolean result = userService.registerUser("John Doe", "john@example.com", "password123");

        assertTrue(result);
    }

    @Test
    public void testRegisterUserWithDuplicateEmail() {
        // First registration should succeed
        boolean firstResult = userService.registerUser("John Doe", "john@example.com", "password123");
        assertTrue(firstResult);

        // Second registration with same email should fail
        boolean secondResult = userService.registerUser("John Doe", "john@example.com", "password456");
        assertFalse(secondResult);
    }

    @Test
    public void testRegisterUserWithShortPassword() {
        boolean result = userService.registerUser("John Doe", "john@example.com", "123");

        assertFalse(result);
    }

    @Test
    public void testRegisterUserWithEmptyPassword() {
        boolean result = userService.registerUser("John Doe", "john@example.com", "");

        assertFalse(result);
    }

    @Test
    public void testRegisterUserWithNullValues() {
        boolean result = userService.registerUser(null, null, null);

        assertFalse(result);
    }

    @Test
    public void testRegisterUserWithValidLongPassword() {
        boolean result = userService.registerUser("John Doe", "john@example.com", "a".repeat(100));

        assertTrue(result);
    }
}
