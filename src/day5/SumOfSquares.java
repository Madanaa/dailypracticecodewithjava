package day5;

public class SumOfSquares {
    public static int sumOfSquare(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i*i;
        }
        return sum;
    }

    static void main() {
        System.out.println(sumOfSquare(4));
    }
}
