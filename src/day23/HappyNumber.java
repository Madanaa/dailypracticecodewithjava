package day23;

public class HappyNumber {
    public static boolean isHappy(int n){
        int slow = n;
        int fast = n;
        do {
            slow = getSquareSum(slow);
            fast = getSquareSum(getSquareSum(fast));
            if (fast == 1)
                return true;

        }while (slow != fast);
            return slow == 1;
        }

    public static int getSquareSum(int n){
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum = sum + digit * digit;
            n = n/10;
        }
        return sum;
    }

    static void main() {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
