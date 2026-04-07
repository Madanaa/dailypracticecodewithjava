package day5;

public class ThreeNumberFindLargestNumber {
    public static void findLargestNumber(int a, int b, int c) {
        if(a >= b && a >= c) {
            System.out.println("Largest Number is: "+a);
        }
        else if(b >= a && b >= c) {
            System.out.println("Largest Number is: " +b);
        }
        else {
            System.out.println("Largest Number is: "+c);
        }
    }

    static void main() {
        findLargestNumber(2,6,9);
    }
}
