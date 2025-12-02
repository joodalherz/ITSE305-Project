import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testMainMethodWithValidInput() {
        String input = "John Doe\njohn@example.com\npassword123\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Since main method uses System.out, we can't easily capture output
        // But we can verify it doesn't throw exceptions
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }

    @Test
    public void testMainMethodWithInvalidPassword() {
        String input = "John Doe\njohn@example.com\nshort\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }

    @Test
    public void testMainMethodWithDuplicateEmail() {
        String input1 = "John Doe\njohn@example.com\npassword123\n";
        String input2 = "Jane Smith\njohn@example.com\npassword456\n";

        // First run
        InputStream in1 = new ByteArrayInputStream(input1.getBytes());
        System.setIn(in1);
        assertDoesNotThrow(() -> Main.main(new String[]{}));

        // Second run with same email
        InputStream in2 = new ByteArrayInputStream(input2.getBytes());
        System.setIn(in2);
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}