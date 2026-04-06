package day4;

public class ATMSystem {
    public static void main(String[]args) {
        Account myAcc = new Account(2000);
        myAcc.deposit(500);
        myAcc.withdraw(5000);
    }
}
