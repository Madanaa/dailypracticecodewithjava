package day12;

public class MergeString {
    public static String mergeStringAlternately(String word1, String word2) {
        String result = "";
        int length1 = word1.length();
        int length2 = word2.length();

        int minLength;
        if (length1 < length2) {
            minLength = length1;
        }
        else {
            minLength = length2;
        }
        for (int i = 0; i < minLength; i++) {
            result = result + word1.charAt(i);
            result = result + word2.charAt(i);
        }
        if (length1 > length2) {
            for (int i = minLength; i < length1; i++) {
                result = result + word1.charAt(i);
            }
        } else if (length2 > length1) {
            for (int i = minLength; i < length2; i++) {
                result = result + word2.charAt(i);
            }
        }
        return result;
    }

    static void main() {
        System.out.println(mergeStringAlternately("ab","pqrs"));
    }
}
