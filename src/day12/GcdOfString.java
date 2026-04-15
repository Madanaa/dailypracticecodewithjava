package day12;

public class GcdOfString {
    public static String getGCDOfString(String str1, String str2) {
        // Step 1: Check karo kya dono strings ek hi pattern se bani hain
        // Agar str1 + str2 != str2 + str1, toh koi common divisor nahi hai
        if (!(str1 + str2).equals(str2+str1)) {
            return "";
        }
        int getGcd = findGCD(str1.length(),str2.length());
        return str1.substring(0,getGcd);
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static void main() {
        System.out.println(getGCDOfString("ABCABC","ABC"));
    }

}
