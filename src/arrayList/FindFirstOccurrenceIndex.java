package arrayList;

public class FindFirstOccurrenceIndex {
    public static int findIndex(java.util.List<String> list, String target) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");

        String target = "banana";
        int index = findIndex(list, target);

        System.out.println("List: " + list);
        System.out.println("First occurrence of '" + target + "' is at index: " + index);
    }

}
