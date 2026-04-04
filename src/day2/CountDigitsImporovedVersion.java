package day2;

public class CountDigitsImporovedVersion {
    public static int countDigits(int num) {
        if(num == 0)
            return 1;
        num = Math.abs(num);
        int count = 0;
        int temp = num;
        while(temp > 0) {
            count++;
            temp = temp / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 324;
        System.out.println(countDigits(n));
    }
}
