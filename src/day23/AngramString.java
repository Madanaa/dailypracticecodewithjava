package day23;

import java.util.*;

public class AngramString {
    public List<List<String>> anagrams(String[] str){
        Map<String,List<String>> ans = new HashMap<>();
        for (String s : str) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (!ans.containsKey(sorted)) {
                ans.put(sorted, new ArrayList<>());
            }
            ans.get(sorted).add(s);
        }
      return new ArrayList<>(ans.values());
    }

    static void main() {

    }
}
