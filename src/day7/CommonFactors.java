package day7;

public class CommonFactors {
    public static int findCommonFactors(int a, int b) {
        int gcd = findGCD(a,b);
        int count = 0;
        for(int i = 1; i <= gcd; i++) {
            if(gcd % i == 0) {
                count++;
            }
        }
        return count;
    }
    public static int findGCD(int a, int b) {
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        System.out.println("Number of common factors: "+findCommonFactors(a,b));
    }
}
