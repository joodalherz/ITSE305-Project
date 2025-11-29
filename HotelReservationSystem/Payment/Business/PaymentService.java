import java.util.Random;

public class PaymentService {
    private PaymentRepository repo = new PaymentRepository();
    private static int paymentCounter = 1;

    public Payment processPayment(String reservationId, double amount, String method) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return new Payment(paymentCounter++, reservationId, amount, method, false);
        }

        boolean status = new Random().nextBoolean();

        Payment payment = new Payment(paymentCounter++, reservationId, amount, method, status);
        repo.savePayment(payment);
        return payment;
    }

    public void listAllPayments() {
        for (Payment p : repo.getAllPayments()) {
            System.out.println(p);
        }
    }
}
