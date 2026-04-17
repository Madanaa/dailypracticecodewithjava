package day12;

public class ReverseArray {
    public static void reverse(int[]arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n-1-i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void main() {
        int[] arr ={4,5,3,2,1};
        reverse(arr);
    }
}
