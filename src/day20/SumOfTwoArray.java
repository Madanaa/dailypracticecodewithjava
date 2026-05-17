package day20;

import java.util.Arrays;

public class SumOfTwoArray {
    public static int[] sumOfTwoArray(int[] nums1, int[] nums2) {
        int maxLen = Math.max(nums1.length, nums2.length);
        int[] result = new int[maxLen];
        for (int i = 0; i < maxLen; i++){
            result[i] = nums1[i] + nums2[i];
        }
        return result;
    }

    static void main() {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] result = sumOfTwoArray(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
