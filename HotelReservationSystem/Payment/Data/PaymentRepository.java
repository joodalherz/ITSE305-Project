import java.util.ArrayList;
import java.util.List;

/**
 * Repository for storing and retrieving payment records.
 */
public class PaymentRepository {
    private List<Payment> payments = new ArrayList<>();

    public void savePayment(Payment payment) {
        payments.add(payment);
    }

    public List<Payment> getAllPayments() {
        return payments;
    }
}
