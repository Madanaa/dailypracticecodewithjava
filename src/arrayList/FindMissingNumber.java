package arrayList;

import java.util.List;

public class FindMissingNumber {
    public static int findMissing(List<Integer> list, int n) {
      int sumOfNno = n * (n+1)/2;
      int sumOfList = 0;
      for(int num : list) {
          sumOfList = sumOfList + num;
      }
      return sumOfNno - sumOfList;
    }

    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        // Suppose n is 5, and the list is missing 3: [1, 2, 4, 5]
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        int n = 5;
        int missingNumber = findMissing(list, n);

        System.out.println("List: " + list);
        System.out.println("The missing number is: " + missingNumber);
    }

}
