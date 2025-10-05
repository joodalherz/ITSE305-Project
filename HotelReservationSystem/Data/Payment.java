public class Payment {
    private int paymentId;
    private String reservationId;
    private double amount;
    private String method;
    private boolean status;

    public Payment(int paymentId, String reservationId, double amount, String method, boolean status) {
        this.paymentId = paymentId;
        this.reservationId = reservationId;
        this.amount = amount;
        this.method = method;
        this.status = status;
    }

    public int getPaymentId() { return paymentId; }
    public String getReservationId() { return reservationId; }
    public double getAmount() { return amount; }
    public String getMethod() { return method; }
    public boolean getStatus() { return status; }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", reservationId='" + reservationId + '\'' +
                ", amount=" + amount +
                ", method='" + method + '\'' +
                ", status=" + (status ? "Success" : "Failed") +
                '}';
    }
}
