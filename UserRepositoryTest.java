import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        userRepository = new UserRepository();
    }

    @Test
    public void testSaveUser() {
        User user = new User("John Doe", "john@example.com", "password123");
        userRepository.saveUser(user);

        // Verify user was saved by checking if email exists
        assertTrue(userRepository.emailExists("john@example.com"));
    }

    @Test
    public void testEmailExists() {
        User user = new User("John Doe", "john@example.com", "password123");
        userRepository.saveUser(user);

        assertTrue(userRepository.emailExists("john@example.com"));
        assertFalse(userRepository.emailExists("nonexistent@example.com"));
    }

    @Test
    public void testSaveMultipleUsers() {
        User user1 = new User("John Doe", "john@example.com", "password123");
        User user2 = new User("Jane Smith", "jane@example.com", "password456");

        userRepository.saveUser(user1);
        userRepository.saveUser(user2);

        assertTrue(userRepository.emailExists("john@example.com"));
        assertTrue(userRepository.emailExists("jane@example.com"));
        assertFalse(userRepository.emailExists("unknown@example.com"));
    }

    @Test
    public void testEmailExistsCaseSensitive() {
        User user = new User("John Doe", "John@Example.com", "password123");
        userRepository.saveUser(user);

        // Email check should be case-sensitive
        assertTrue(userRepository.emailExists("John@Example.com"));
        assertFalse(userRepository.emailExists("john@example.com"));
    }
}