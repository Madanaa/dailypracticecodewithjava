package day2;

public class CountDigits {
    public static int countDigits(int num) {
        int count = 0;
        int temp = num;
        while(temp > 0) {
            int lastDigit = temp % 10;
            if(lastDigit != 0) {
                count++;
                temp = temp / 10;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 355;
        System.out.println(countDigits(num));
    }
}
