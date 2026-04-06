package day4;

public class Account {
    private double balance;

    public Account(double initialBalance){
        if(initialBalance > 0) {
            this.balance = initialBalance;
        }
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Successfully Deposit: " +amount);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }
   public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Successfully Withdraw: "+amount);
        }else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
   }

   public double getBalance() {
        return balance;
   }

    static void main() {
  Account myAcc = new Account(1000);
     myAcc.deposit(500);
     myAcc.withdraw(200);
     myAcc.balance = -5000;
        System.out.println(myAcc.getBalance());
    }
}
