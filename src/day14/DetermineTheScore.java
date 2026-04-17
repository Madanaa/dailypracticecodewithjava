package day14;

public class DetermineTheScore {
    public static int getScore(int x, int n) {
        int score = n * x/10;
        return score;
    }

    static void main() {
        System.out.println(getScore(10,3));
    }
}
