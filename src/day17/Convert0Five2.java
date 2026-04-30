package day17;

public class Convert0Five2 {
    public static int convertFive(int n) {
        if (n == 0) {
            return 5;
        }
        return replaceRecursive(n);
    }

    private static int replaceRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        int digit = n % 10;
        if (digit == 0) {
            digit = 5;
        }
        return replaceRecursive(n / 10) * 10 + digit;
    }

    public static void main(String[] args) {
        System.out.println(convertFive(1004));
        System.out.println(convertFive(121));
        System.out.println(convertFive(0));
    }

}
