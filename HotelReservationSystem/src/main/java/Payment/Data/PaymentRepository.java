package main.java.Payment.Data;

import java.util.ArrayList;
import java.util.List;
package Data;

/**
 * Repository for storing and retrieving payment records.
 */
public class PaymentRepository {
    private List<Payment> payments = new ArrayList<>();

    public void savePayment(Payment payment) {
        payments.add(payment);
    }

    public List<main.java.Payment.Data.Payment> getAllPayments() {
        return payments;
    }
}
