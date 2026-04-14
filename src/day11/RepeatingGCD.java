package day11;

public class RepeatingGCD {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static int getRepeatingGCD(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = findGCD(result, arr[i]);
            if (result == 1)
                return 1;
        }
        return result;
    }

    static void main() {
        int [] arr = {12,24,36,48};
        System.out.println(getRepeatingGCD(arr));
    }
}
