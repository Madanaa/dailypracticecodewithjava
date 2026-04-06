package day4;

public class BankAccount {
    private double balance;

    private void deposit(double amount)
    {
        balance = balance + amount;
    }
    public  double getBalance() {
        return balance;
    }
}
