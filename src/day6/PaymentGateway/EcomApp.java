package day6.PaymentGateway;

public class EcomApp {
    static void main() {
        PaymentMethod pm = new UPI();
        pm.processPayment(1000);
        pm = new CreditCard();
        pm.processPayment(2000);
    }
}
