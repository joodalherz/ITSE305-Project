import java.util.ArrayList;
import java.util.List;

/**
 * This class acts as the data layer.
 * It stores and manages user data in memory using a list.
 */

public class UserRepository {
    private final List<User> users = new ArrayList<>();

    /**
     * Saves a user to the in-memory list.
     * @param user The user to be saved.
     */

    public void saveUser(User user) {
        users.add(user);
    }

    /**
     * Checks if a user with the given email already exists.
     * @param email The email to check.
     * @return true if the email exists, false otherwise.
     */

    public boolean emailExists(String email) {
        return users.stream().anyMatch(u -> u.getEmail().equals(email));
    }
}
