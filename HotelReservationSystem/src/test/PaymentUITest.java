import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentUITest {

    @Test
    public void testProcessPaymentFromUI() {
        PaymentService service = new PaymentService();
        PaymentUI ui = new PaymentUI(service);

        // simulate UI input by calling the service directly
        Payment p = service.processPayment("R500", 250.0, "Card");

        assertNotNull(p);
        assertEquals("R500", p.getReservationId());
        assertEquals(250.0, p.getAmount());
        assertEquals("Card", p.getMethod());
    }
}
