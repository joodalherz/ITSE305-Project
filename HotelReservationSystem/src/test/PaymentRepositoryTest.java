import main.java.Payment.Data.Payment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PaymentRepositoryTest {

    @Test
    public void testSavePayment() {
        main.java.Payment.Data.PaymentRepository repo = new main.java.Payment.Data.PaymentRepository();
        Payment p = new Payment("R100", 300.0, "Card");

        repo.savePayment(p);

        List<main.java.Payment.Data.Payment> payments = repo.getAllPayments();
        assertEquals(1, payments.size());
        assertEquals("R100", payments.get(0).getReservationId());
    }

    @Test
    public void testSaveMultiplePayments() {
        PaymentRepository repo = new PaymentRepository();

        repo.savePayment(new Payment("R1", 100, "Cash"));
        repo.savePayment(new Payment("R2", 200, "Card"));

        assertEquals(2, repo.getAllPayments().size());
    }
}
