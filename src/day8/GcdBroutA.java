package day8;

public class GcdBroutA {
    public static int gcdBrute(int a, int b) {
        int ans = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println("GCD: "+gcdBrute(a,b));
    }
}
