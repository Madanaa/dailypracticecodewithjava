package day7;

public class ProductsOfFactors {
    public static int findProductsOfFactors(int n) {
        int products = 1;
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                products = products * i;
                if(i != n /i) {
                    products = products * (n /i);
                }
            }
        }
        return products;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Products of factors: "+findProductsOfFactors(n));
    }
}
