package day1;

public class PalindromeNumber {
    public static int palindromeNumber(int number) {
        int temp = number;
        int reversedNumber = 0;
       while(temp > 0){
           int lastDigit = temp % 10;
           reversedNumber = reversedNumber * 10 + lastDigit;
           temp = temp / 10;
       }
       return reversedNumber;
    }

    static void main() {
        int n = 121;
        if(n == palindromeNumber(n)){
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not Palindrome Number");
        }
    }
}
