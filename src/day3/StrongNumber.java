package day3;

public class StrongNumber {
    public static int getFactorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static boolean getStrongNumber(int n) {
        if(n <= 0) {
            return false;
        }
        int temp = n;
        int sumOfDigits = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sumOfDigits = sumOfDigits + getFactorial(lastDigit);
            temp = temp / 10;
        }
        return sumOfDigits == n;
    }

    public static void main(String[] args) {
       int n = 145;
      if(getStrongNumber(n)) {
          System.out.println(n+" Number is a strong number");
      }
      else {
          System.out.println(n+" Number is not a strong number");
      }
    }
}
