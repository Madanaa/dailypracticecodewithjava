package day6.PaymentGateway;

public class CreditCard implements PaymentMethod{

    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of Rs. "+amount);
    }
}
