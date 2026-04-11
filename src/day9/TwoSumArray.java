package day9;

public class TwoSumArray {
    public static int[] twoSumArray(int[] numbers, int target) {
        int n = numbers.length;
        for(int i = 0; i < n; i++) {
            for(int j = i +1; j < n; j++) {
                if(numbers[i] + numbers[j] == target) {
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = twoSumArray(numbers,target);
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
