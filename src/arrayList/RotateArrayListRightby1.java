package arrayList;

import java.util.ArrayList;

public class RotateArrayListRightby1 {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List: " + list);

        int last = list.getLast();
        list.removeLast();
        list.addFirst(last);
        System.out.println("Rotated List: " + list);


    }
}
