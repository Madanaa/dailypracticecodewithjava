package day24;

public class FirstOccurrence {
    public static int firstOccurrence(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if (hlen < nlen) {
            return -1;
        }
        int n = hlen - nlen;
        for (int i = 0; i <= n; i++){
            int j = 0;
            while (j < n && haystack.charAt(i) == needle.charAt(j)){
                j++;
            }
            if (j == nlen){
                return i;
            }
        }
        return -1;

    }

    static void main() {

    }
}
