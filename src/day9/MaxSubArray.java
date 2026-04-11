package day9;

public class MaxSubArray {
    public static int findMxSubArray(int[] arr, int k) {
        int n = arr.length;
        if (n < k)
            return -1;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum = windowSum + arr[i];
        }
        int maxSum = windowSum;

        for (int i = k; i < n; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            if (windowSum > maxSum){
                maxSum = windowSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int array[] = {1,4,2,10,2,3,1};
        int k = 3;
        System.out.println(findMxSubArray(array,k));
    }
}
