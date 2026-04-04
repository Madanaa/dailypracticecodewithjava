package day2;

public class HarshadNumber {
    public static boolean isHarshadNumber(int n) {
        if(n <= 0)
            return false;
        int temp = n;
        int sumOfDigits = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfDigits = sumOfDigits + digit;
            temp = temp / 10;
        }
        return n % sumOfDigits == 0;
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(isHarshadNumber(n));
    }
}
