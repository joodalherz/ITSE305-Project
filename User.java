/**
 * The User class represents a user in the system.
 * It holds the user's name, email, and password.
 */
public class User {
    private final String name;
    private final String email;
    private final String password;

    /**
     * Constructor to initialize a User object.
     * @param name The user's name.
     * @param email The user's email address.
     * @param password The user's password.
     */
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }


}


