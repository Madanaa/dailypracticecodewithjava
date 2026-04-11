package day9;

public class FindGCDAndLCM {
    public static int findGCD(int a, int b) {
        while(b != 0) {
            int tamp = +a % b;
            a = b;
            b = tamp;
        }
        return a;
    }
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a,b);
    }
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        System.out.println(findLCM(a,b));
    }

}
