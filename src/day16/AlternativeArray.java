package day16;

import java.util.ArrayList;

public class AlternativeArray {
    public static ArrayList<Integer> getAlternativeArray(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            result.add(arr[i]);
        }
        return result;
    }

    static void main() {
    int[] arr = {1, 2, 3, 4, 5, 6};
    ArrayList<Integer> result = getAlternativeArray(arr);
        System.out.println(result);
    }
}
