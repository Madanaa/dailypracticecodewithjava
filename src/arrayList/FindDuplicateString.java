package arrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateString {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("apple");

        Set<String> res = new LinkedHashSet<>(list);
        ArrayList<String> result = new ArrayList<>(res);
        System.out.println(result);
    }
}
