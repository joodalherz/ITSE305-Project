package Payment.Business;

import Payment.Data.Payment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {

    @Test
    void testProcessPaymentSuccess() {
        PaymentService service = new PaymentService();

        Payment payment = service.processPayment("P001", 150.0, "Card");

        assertNotNull(payment);
        assertEquals("P001", payment.getPaymentId());
        assertEquals(150.0, payment.getAmount());
        assertEquals("Card", payment.getMethod());
    }

    @Test
    void testProcessPaymentInvalidAmount() {
        PaymentService service = new PaymentService();

        // Amount <= 0 should throw IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            service.processPayment("P002", 0.0, "Cash");
        });
    }

    @Test
    void testGetPaymentById() {
        PaymentService service = new PaymentService();

        // first process a payment
        service.processPayment("P003", 200.0, "Card");

        // Now retrieve it
        Payment retrieved = service.getPaymentById("P003");

        assertNotNull(retrieved);
        assertEquals("P003", retrieved.getPaymentId());
    }
}
