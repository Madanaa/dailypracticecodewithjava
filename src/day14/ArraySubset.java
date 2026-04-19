package day14;

public class ArraySubset {
    public static boolean isSubset(int[] a, int[] b ) {
        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            for (int j = 0; i < b.length; j++) {
                if (a[i] == a[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    static void main() {

    }
}
