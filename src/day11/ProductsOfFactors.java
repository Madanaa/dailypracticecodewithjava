package day11;

public class ProductsOfFactors {
    public static int getProduct(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if(i * i == n)
                    count++;
                else
                    count = count + 2;
            }
        }
        return Math.toIntExact((long) Math.pow(n, count / 2.0));
    }

    static void main() {
        System.out.println(getProduct(12));
    }
}
