package paymentmodule;

public class payment {
    public String paymentId;
    public double amount;
    public String status;

    public void processPayment() {
        System.out.println(" PROCESSING ");
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Status: Success!");
    }
}