package day19;

public class SumOfNegativeNumber {
    public static int sum(int[] arr){
        int sum = 0;
        for (int i : arr){
           if (i < 0) {
               sum += i;
           }
        }
        return sum;
    }

    static void main() {
        int[] arr = {-1, 2, 3, -4, -5};
        System.out.println(sum(arr));
    }
}
