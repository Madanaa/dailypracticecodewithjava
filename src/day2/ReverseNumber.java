package day2;

public class ReverseNumber {
    public static int reverseNumber(int n) {
        n = Math.abs(n);
        int temp = n;
        int reversed = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            reversed = reversed * 10 + lastDigit;
            temp /= 10;
        }
        return reversed;
    }

    static void main() {
        System.out.println(reverseNumber(-123));
    }
}
