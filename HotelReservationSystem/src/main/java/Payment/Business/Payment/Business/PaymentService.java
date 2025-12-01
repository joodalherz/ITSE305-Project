
package Payment.Business;

import Payment.Data.Payment;
import Payment.Data.PaymentRepository;

public class PaymentService {

    private PaymentRepository paymentRepository;

    public PaymentService() {
        this.paymentRepository = new PaymentRepository();
    }

    public Payment processPayment(String paymentId, double amount, String method) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }

        Payment payment = new Payment(paymentId, amount, method);
        paymentRepository.savePayment(payment);

        return payment;
    }

    public Payment getPaymentById(String paymentId) {
        return paymentRepository.getPaymentById(paymentId);
    }
}
