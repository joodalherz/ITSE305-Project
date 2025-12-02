package main.java.Payment.Presentation;

import java.util.Scanner;
package Presentation;

import Business.PaymentService;
import Data.Payment;

public class PaymentUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentService service = new PaymentService();

        System.out.println("=== Hotel Reservation System: Payment Processing ===");
        System.out.print("Enter Reservation ID: ");
        String reservationId = sc.nextLine();

        System.out.print("Enter Payment Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Payment Method (Card/Cash/PayPal): ");
        String method = sc.nextLine();

        Payment payment = service.processPayment(reservationId, amount, method);

        System.out.println("\n--- Payment Result ---");
        if (payment.getStatus()) {
            System.out.println("Payment Successful ✅");
        } else {
            System.out.println("Payment Failed ❌");
        }

        System.out.println("\nAll Payment Records:");
        service.listAllPayments();
    }
}
