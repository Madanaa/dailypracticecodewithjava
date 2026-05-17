package day20;

public class ArrayRepeatNumberCount {
    public static int findRepeatNumber(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                count++;
            }
        }
        if (count == 0)
            return -1;
        return count;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        int target = 6;
        System.out.println(findRepeatNumber(arr, target));

    }
}
