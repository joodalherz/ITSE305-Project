/**
 * This class represents the business layer.
 * It contains the logic for registering users,
 * including validation for email and password.
 */

public class UserService {
    private UserRepository repo = new UserRepository();

    /**
     * Registers a new user if the email is not already used
     * and the password is strong enough.
     * @param name The user's name.
     * @param email The user's email.
     * @param password The user's password.
     * @return true if registration is successful, false otherwise.
     */


    public boolean registerUser(String name, String email, String password) {
        if (repo.emailExists(email)) {
            System.out.println("Email already registered.");
            return false;
        }

        if (password.length() < 6) {
            System.out.println("Password too short.");
            return false;
        }

        User user = new User(name, email, password);
        repo.saveUser(user);
        return true;
    }
}
