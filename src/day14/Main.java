package day14;

public class Main {
    static void main() {
        for(int i = 0, j = 5; i < j; i++, j--) {
            System.out.println(i + " " + j);
        }
        for (double i = 0.1; i != 1.0; i += 0.1) {
            System.out.println(i);
        }
    }
}
