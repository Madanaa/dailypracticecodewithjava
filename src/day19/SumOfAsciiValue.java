package day19;

public class SumOfAsciiValue {
    public static int sumOfAscii(String arr) {
        int sum = 0;
        for (int i = 0; i < arr.length(); i++) {
            sum += arr.charAt(i);
        }
        return sum;
    }

    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumOfAscii("ab"));
    }
}
