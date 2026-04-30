package string.day18;

public class ConvertStringLowerCase {
    public static String toLowerCase(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                charArray[i] = (char) (charArray[i] + 32);
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("ABCddE"));
        System.out.println(toLowerCase("LMNOppQQ"));
    }

}
