package day22;

public class BitsManipulation {
    public static int getBits(int n, int i){
        int mask = 1 << i;
        if ((n & mask) != 0){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int setBits(int n, int i){
        int mask = 1 << i;
        return n | mask;
    }


    static void main() {
        int n = 0101;
        System.out.println(getBits(n, 5));
        System.out.println(setBits(n, 1));
    }
}
