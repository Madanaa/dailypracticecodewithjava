package day3;

public class MemoryTest {
    static int printData(int value) {
        int y = value+5;
        return y;
    }
    public static void main(String[] args) {
        int x = 15;
        String name = "Madan";
        User user = new User();
        System.out.println(printData(x));
    }
}
