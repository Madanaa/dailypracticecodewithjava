package string.day18.day18;

import java.util.HashSet;
import java.util.Set;

public class DisjointArray {
    public static boolean areDisjoint(int[] a, int []b) {
        Set<Integer> result = new HashSet<>();
        for (int n : a) {
            result.add(n);
        }
        for (int n : b) {
            if (result.contains(n)) {
                return false;
            }
        }
        return true;
    }

    static void main() {
        int[] a = {12, 34, 11, 9, 3};
        int[] b = {7, 2, 9, 5};
        System.out.println(areDisjoint(a,b));
    }
}
