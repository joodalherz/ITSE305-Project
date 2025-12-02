 import java.io.Console;
import java.util.Scanner;

/**
 * This is the main class of the application.
 * It belongs to the presentation layer and handles
 * user interaction through the console.
 */
public class Main {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the Scanner
        try (Scanner sc = new Scanner(System.in)) {
            UserService service = new UserService();

            System.out.println("=== User Registration ===");

            // Ask user for name
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            
            // Ask user for email
            System.out.print("Enter Email: ");
            String email = sc.nextLine();
            
            // Ask user for password securely
            System.out.print("Enter Password: ");
            String password = readSecurePassword();

            // Attempt to register the user with provided credentials
            if (service.registerUser(name, email, password)) {
                System.out.println("Registration successful!");
            } else {
                System.out.println("Registration failed.");
            }
        }
        // Scanner is automatically closed by try-with-resources
    }
    
    /**
     * Securely reads password input without echoing to console.
     * Uses Console.readPassword() when available, falls back to 
     * Scanner when running in IDE environments.
     * 
     * @return the entered password as a String
     */
    private static String readSecurePassword() {
        Console console = System.console();
        
        if (console != null) {
            // Secure method - password characters are not echoed to screen
            char[] passwordChars = console.readPassword();
            String password = new String(passwordChars);
            
            // Clear the char array from memory for security
            java.util.Arrays.fill(passwordChars, ' ');
            
            return password;
        } else {
            // Fallback for IDE environments that don't provide Console
            System.out.println("\n[Note: Running in IDE - password will be visible]");
            System.out.print("Re-enter Password: ");
            
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            
            return password;
        }
    }
}
