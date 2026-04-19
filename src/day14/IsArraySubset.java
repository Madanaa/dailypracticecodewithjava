package day14;

import java.util.HashMap;

public class IsArraySubset {
    public boolean arraySubset(int[] a, int[] b) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : a) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        for (int num : b) {
            if (!map.containsKey(num) || map.get(num) <= 0) {
                return false;
            }
            map.put(num, map.get(num)-1);
        }
        return true;
    }
}
