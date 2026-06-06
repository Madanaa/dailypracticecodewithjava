package day23;

import java.util.*;

public class AngramString {
    public List<List<String>> anagrams(String[] str){
        Map<String,List<String>> ans = new HashMap<>();
        for (int i = 0; i < str.length; i++){
            char[] arr = str[i].toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (!ans.containsKey(sorted)){
                ans.put(sorted,new ArrayList<>());
            }
            ans.get(sorted).add(str[i]);
        }
      return new ArrayList<>(ans.values());
    }
}
