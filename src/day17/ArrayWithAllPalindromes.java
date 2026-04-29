package day17;

public class ArrayWithAllPalindromes {
    public static boolean getAllPalindromes(int[] arr) {
        for (int num : arr) {
            if (!isPalindromes(num)){
                return false;
            }
        }
        return true;
    }
    private static boolean isPalindromes(int n) {
        int original = n;
        int reverse=0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }
        return original == reverse;
    }

}
