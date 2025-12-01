import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    @Test
    public void testPaymentCreation() {
        Payment p = new Payment("R001", 200.0, "Credit Card");

        assertEquals("R001", p.getReservationId());
        assertEquals(200.0, p.getAmount());
        assertEquals("Credit Card", p.getMethod());
    }

    @Test
    public void testSetters() {
        Payment p = new Payment("R002", 150.0, "Cash");

        p.setAmount(175.0);
        p.setMethod("Debit Card");

        assertEquals(175.0, p.getAmount());
        assertEquals("Debit Card", p.getMethod());
    }
}
