package day11;

public class Exponentiation {
    public static int getExponentiation(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return result;
    }

    static void main() {
        System.out.println(getExponentiation(2,5));
    }
}
