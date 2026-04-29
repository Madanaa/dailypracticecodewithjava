package day17;

public class FirstOccurence {
    public static   int firstOccurence(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        if (m > n) {
            return -1;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(j+i) != pat.charAt(j))
                    break;
            }
            if (j == m)
                return i;
        }
        return -1;
    }

    static void main() {
        System.out.println(firstOccurence("hellofrind","nd"));
    }
}
