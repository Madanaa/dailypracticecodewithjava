package day20;

public class ArrayEvenCount {
    public static int countEven(int[] arr){
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(countEven(arr));
    }
}
