package day17;

public class MaxArray {
    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static void main() {
        int[]a = {1,6,8,4};
        System.out.println(maxArray(a));
    }
}
