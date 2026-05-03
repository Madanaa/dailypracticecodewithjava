package arrayList;

import java.util.List;

public class SumOfArrayList {
  public static int calculateSum(List<Integer> list) {
      int sum = 0;
      for (int num : list) {
          sum = sum + num;
      }
      return sum;
  }


    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("List: " + list);
        System.out.println("Sum of elements: " + calculateSum(list));
    }

}
