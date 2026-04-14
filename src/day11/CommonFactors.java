package day11;

public class CommonFactors {
    public static void main(String[] args) {
        int a = 12, b = 18;

        // 1. GCD nikaalo
        int n = getGCD(a, b); // n ban gaya 6

        // 2. n ke factors count karo
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    count++; // Agar number 16 hai aur i=4, toh ek hi baar 4 gino
                } else {
                    count += 2; // i aur n/i dono factors hain
                }
            }
        }
        System.out.println("Result: " + count);
    }

    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}