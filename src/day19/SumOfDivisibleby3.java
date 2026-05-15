package day19;

public class SumOfDivisibleby3 {
    public static int sumOfDivideBy3(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            if (value % 3 == 0) {
                sum = sum + value;
            }
        }
        return sum;
    }

    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumOfDivideBy3(arr));
    }
}
