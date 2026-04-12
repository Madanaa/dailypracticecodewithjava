package day9;

public class CountFactorsOfGCD {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static int countFactors(int a, int b) {
        int g = findGCD(a,b);
        int count = 0;
        for (int i = 1; i * i <=g; i++) {
            if (g % i == 0) {
              if(i * i == g) {
                  count++;
              } else {
                  count = count + 2;
              }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        System.out.println(countFactors(a,b));
    }

}
