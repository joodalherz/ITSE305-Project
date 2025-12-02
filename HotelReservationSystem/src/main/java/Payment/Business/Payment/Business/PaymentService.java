package Payment.Business;

import Payment.Data.Payment;
import Payment.Data.PaymentRepository;

public class PaymentService {

    private final PaymentRepository paymentRepository;

    // FIX 1: Dependency Injection instead of hard-coded new
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment processPayment(String paymentId, double amount, String method) {

        // FIX 2: Validate paymentId
        if (paymentId == null || paymentId.isBlank()) {
            throw new IllegalArgumentException("Payment ID cannot be null or empty.");
        }

        // FIX 3: Validate amount
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }

        // FIX 4: Validate method
        if (method == null || method.isBlank()) {
            throw new IllegalArgumentException("Payment method cannot be null or empty.");
        }

        Payment payment = new Payment(paymentId, amount, method);

        paymentRepository.savePayment(payment);

        return payment;
    }

    public Payment getPaymentById(String paymentId) {

        // FIX 2 again: validate paymentId for getPaymentById as well
        if (paymentId == null || paymentId.isBlank()) {
            throw new IllegalArgumentException("Payment ID cannot be null or empty.");
        }

        return paymentRepository.getPaymentById(paymentId);
    }
}
