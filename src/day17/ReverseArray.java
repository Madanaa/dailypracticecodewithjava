package day17;

public class ReverseArray {
    public static void reverse(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,};
        reverse(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
