package day17;

public class Convert0Five1 {
    public static int convertFive(int n) {
        if (n == 0) {
            return 5;
        }
        int res = 0;
        int multiplier = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) {
                digit = 5;
            }
            res = digit * multiplier + res;
            multiplier *= 10;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(convertFive(1004));
        System.out.println(convertFive(121));
        System.out.println(convertFive(0));
    }

}
