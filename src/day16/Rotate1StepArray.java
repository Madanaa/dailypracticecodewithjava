package day16;

import java.util.Arrays;

public class Rotate1StepArray {
    public static void rotateArray(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return;
        int lastElement = arr[n-1];

        for (int i = n-1; i > 0;i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
    }

    static void main() {
        int[] arr = {1,2,3,4};
       rotateArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
