package day19;

public class SecondLargest {
    public static int secondLargest(int[] arr){
        int largest = -1;
        int secondLargest = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            else if (arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(secondLargest(arr));
    }
}
