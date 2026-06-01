package day22;

public class SolveLeanerScanPattern {
    public static int solveLeanerScanPattern(int arr[]) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void main() {
        int[] arr= {2,7,9,0};
        System.out.println(solveLeanerScanPattern(arr));
    }
}
