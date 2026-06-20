package day23;

public class FindUniqueNumber {
    public static int removeDuplicates(int[] nums){
        if (nums.length == 0)
            return 0;
        int i = 1;
        for (i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[i] = nums[i-1];
                i++;
            }
        }
        return i;
    }
}
