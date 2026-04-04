package day2;

public class ArmStrongNumber {
    public static int armStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        int digits = String.valueOf(number).length();
        while(temp != 0){
            int digit = temp % 10;
            sum = (int) (sum + Math.pow(digit,digits));
            temp = temp / 10;

        }
        return sum;
    }
    public static void main(String[] args) {
        int number = 153;
        System.out.println(armStrongNumber(number));
    }
}
