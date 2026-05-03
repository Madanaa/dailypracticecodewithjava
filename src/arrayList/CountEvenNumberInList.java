package arrayList;

import java.util.List;

public class CountEvenNumberInList {
    public static int countEven(List<Integer>list) {
        int count = 0;
        for (int num : list) {
            if(num % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);

        System.out.println("List: " + list);
        System.out.println("Count of even numbers: " + countEven(list));
    }

}
