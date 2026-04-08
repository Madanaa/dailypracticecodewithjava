package day6.PaymentGateway;

public class UPI implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of Rs. "+amount);
    }
}
