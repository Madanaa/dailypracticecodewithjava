package arrayList;

import java.util.ArrayList;

public class RemoveDuplicateString {
    static void main() {
        ArrayList<String> result = new ArrayList<>();
        result.add("apple");
        result.add("banana");
        result.add("orange");
        result.add("apple");

        ArrayList<String> res = new ArrayList<>();
        for (String str : result) {
         if (!res.contains(str)){
             res.add(str);
         }
     }
        System.out.println(res);
    }
}
