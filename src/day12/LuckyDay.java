package day12;

public class LuckyDay {
    public static int getClearDay(int rainy, int cloud) {
        int totalWeekDay = 7;
        return totalWeekDay - rainy - cloud;
    }

    static void main() {
        System.out.println(getClearDay(2,3));
    }
}
