package day22;

public class PalindromeString {
    public static boolean isPalindrome(String str){
        StringBuilder cleanStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                cleanStr.append(Character.toLowerCase(ch));
            }
        }
        String filteredStr = cleanStr.toString();
        String reversedStr = cleanStr.reverse().toString();
        return filteredStr.equals(reversedStr);
    }
    public static void main(String[] args) {
        String str = "abab";
        System.out.println(isPalindrome(str));
    }

}
