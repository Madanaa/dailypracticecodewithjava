package day20;

public class VowelInString {
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Condition: Kya current character ek vowel hai?
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++; // Sirf vowel milne par hi counter badhega
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "abcdef g";
        System.out.println(countVowels(str));
    }
}
