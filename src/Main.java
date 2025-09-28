import java.util.Scanner;

/**
 * This is the main class of the application.
 * It belongs to the presentation layer and handles
 * user interaction through the console.
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService service = new UserService();

        System.out.println("=== User Registration ===");

        // Ask user for name
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        // Ask user for email
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        // Ask user for password
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Try to register the user

        if (service.registerUser(name, email, password)) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed.");
        }
    }
}
