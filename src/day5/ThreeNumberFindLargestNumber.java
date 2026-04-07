package day5;

public class ThreeNumberFindLargestNumber {
    public static void findLargestNumber(int a, int b, int c) {
        if(a >= b && a >= c) {
            System.out.println("Largest Number is: "+a);
        }
        else if(b >= c) {
            System.out.println("Largest Number is: " +b);
        }
        else {
            System.out.println("Largest Number is: "+c);
        }
    }

    static void main() {
        findLargestNumber(9,12,9);
    }
}
