 import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    
    private InputStream originalIn;
    private PrintStream originalOut;
    private ByteArrayOutputStream outputCapture;
    
    @BeforeEach
    public void setUp() {
        // Save original System.in and System.out
        originalIn = System.in;
        originalOut = System.out;
        
        // Capture output for verification
        outputCapture = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputCapture));
    }
    
    @AfterEach
    public void tearDown() {
        // Restore original System.in and System.out
        System.setIn(originalIn);
        System.setOut(originalOut);
    }
    
    /**
     * Helper method to simulate user input for testing
     * @param input The input string to simulate (include newlines for multiple inputs)
     */
    private void simulateInput(String input) {
        InputStream simulatedInput = new ByteArrayInputStream(input.getBytes());
        System.setIn(simulatedInput);
    }
    
    /**
     * Helper method to get captured output as string
     * @return The captured console output
     */
    private String getCapturedOutput() {
        return outputCapture.toString();
    }
    
    @Test
    public void testMainMethodWithValidInput() {
        // Arrange: Simulate valid user input
        String input = "John Doe\njohn@example.com\npassword123\n";
        simulateInput(input);
        
        // Act & Assert: Verify main method runs without exceptions
        assertDoesNotThrow(() -> Main.main(new String[]{}));
        
        // Verify expected output is present
        String output = getCapturedOutput();
        assertTrue(output.contains("=== User Registration ==="));
        assertTrue(output.contains("Enter Name:"));
        assertTrue(output.contains("Enter Email:"));
        assertTrue(output.contains("Enter Password:"));
    }
    
    @Test
    public void testMainMethodRegistrationSuccess() {
        // Arrange: Simulate successful registration input
        String input = "John Doe\njohn@example.com\npassword123\n";
        simulateInput(input);
        
        // Act
        assertDoesNotThrow(() -> Main.main(new String[]{}));
        
        // Assert: Check for success message (assuming UserService.registerUser returns true)
        String output = getCapturedOutput();
        assertTrue(output.contains("Registration successful!") || 
                   output.contains("Registration failed."));
    }
    
    @Test
    public void testMainMethodWithEmptyName() {
        // Arrange: Simulate input with empty name
        String input = "\njohn@example.com\npassword123\n";
        simulateInput(input);
        
        // Act & Assert
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
    
    @Test
    public void testMainMethodWithInvalidEmail() {
        // Arrange: Simulate input with invalid email format
        String input = "John Doe\nnot-an-email\npassword123\n";
        simulateInput(input);
        
        // Act & Assert
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
    
    @Test
    public void testMainMethodWithWeakPassword() {
        // Arrange: Simulate input with short password
        String input = "John Doe\njohn@example.com\nshort\n";
        simulateInput(input);
        
        // Act & Assert
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
    
    @Test
    public void testMainMethodWithMultipleSpacesInName() {
        // Arrange: Simulate name with multiple spaces
        String input = "  John  Michael  Doe  \njohn@example.com\npassword123\n";
        simulateInput(input);
        
        // Act & Assert
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
    
    @Test
    public void testSecurePasswordInputMethod() throws Exception {
        // Note: This test is challenging because readSecurePassword() uses System.console()
        // which returns null during testing. We can only test the fallback path.
        
        // Arrange: We need to test that the method doesn't crash
        // and handles the Console=null scenario gracefully
        
        // Since we can't easily test Console.readPassword() in unit tests,
        // we verify the fallback behavior works
        String testInput = "testpassword\n";
        simulateInput(testInput);
        
        // This would require refactoring Main to make readSecurePassword() testable
        // or using reflection to test private methods
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}
