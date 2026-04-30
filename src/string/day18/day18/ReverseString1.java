package string.day18.day18;

public class ReverseString1 {
    public static String reverseString(String s) {

        StringBuffer result = new StringBuffer();
        for (int i = s.length()-1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
        System.out.println(reverseString("world"));
    }
}
