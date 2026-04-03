package day1;

public class CheckPrimeNumber {
    public static boolean isPrime(int number) {
        if(number <=1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void main() {
        int number = 7;
        if(isPrime(number)) {
            System.out.println("Prime number");
        }
    }
}
