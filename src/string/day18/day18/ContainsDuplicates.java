package string.day18.day18;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static boolean isSubset(int[] a, int[] b) {
        Set<Integer> result = new HashSet<>();
        for (int num : a) {
            result.add(num);
        }
        for (int num : b) {
            if (!result.contains(num)) {
                return false;
            }
        }
        return true;
    }

    static void main() {
        int[] a= {11, 1, 13, 21, 3, 7};
        int [] b = {1,3,7};
        System.out.println(isSubset(a,b));
    }
}
