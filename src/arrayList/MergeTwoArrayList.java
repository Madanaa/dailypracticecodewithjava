package arrayList;

public class MergeTwoArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list1 = new java.util.ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        java.util.ArrayList<Integer> list2 = new java.util.ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        java.util.ArrayList<Integer> mergedList = new java.util.ArrayList<>(list1);
        mergedList.addAll(list2);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Merged List: " + mergedList);
    }


}
