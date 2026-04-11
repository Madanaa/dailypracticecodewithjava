package day9;

public class SumOfProducts {
    public static int sumOfProducts(int n) {
        int temp = n;
        int sum = 0;
        int products = 1;
        while(temp > 0) {
            int lastDigits = temp % 10;
            products = products * lastDigits;
            sum = sum + lastDigits;
            temp = temp / 10;
        }
        return products - sum;
    }
    public static void main(String[] args) {
        int n = 234;
        System.out.println(sumOfProducts(n));
    }
}
