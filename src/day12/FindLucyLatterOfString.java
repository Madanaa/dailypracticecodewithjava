package day12;

public class FindLucyLatterOfString {
    public static char getLuckyLatter(String s) {
      return s.charAt(6);
    }

    static void main() {
        System.out.println(getLuckyLatter("proceeding"));
    }
}
