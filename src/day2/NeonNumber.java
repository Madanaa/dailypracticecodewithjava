package day2;

public class NeonNumber {
    public static boolean isNeonNumber(int n) {
        int squire = n * n;
        int neon = 0;
        int temp = squire;
        while (temp > 0) {
            int lastDigit = temp % 10;
            neon =neon + lastDigit;
            temp = temp / 10;
        }
        return n == neon;
    }

    static void main() {
        int n = 9;
        System.out.println(isNeonNumber(n));
    }
}
