package day14;

public class DetermineTheScore {
    public static int getScore(int x, int n) {
        return n * x/10;
    }

    static void main() {
        System.out.println(getScore(10,3));
    }
}
