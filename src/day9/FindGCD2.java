package day9;

public class FindGCD2 {
    public static int findGCD(int a, int b) {
        while ( b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static void main() {
        int a = 24;
        int b = 36;
        System.out.println(findGCD(a,b));
    }
}
