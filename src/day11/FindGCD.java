package day11;

public class FindGCD {
    public static int findGCD(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            System.out.println(temp);
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[]args) {
        int a = 24;
        int b = 36;
        System.out.println(findGCD(a,b));
    }
}
