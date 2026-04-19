package day14;

public class IsStringBinary {
    public static boolean isStringBinary(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0' && s.charAt(i) !='1') {
                return true;
            }
        }
        return false;
    }

    static void main() {
        System.out.println(isStringBinary("010101"));
    }
}
