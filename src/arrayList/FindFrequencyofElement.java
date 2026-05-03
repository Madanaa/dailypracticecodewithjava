package arrayList;

import java.util.ArrayList;

public class FindFrequencyofElement {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(2);
       int count = 0;
       int target = 2;
       for (int num : list) {
           if (target == num)
               count++;
       }
        System.out.println(count);
    }
}
