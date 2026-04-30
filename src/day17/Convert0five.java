package day17;

public class Convert0five {
    public static int convertFive(int n) {
        String s = Integer.toString(n);
        s = s.replace('0', '5');
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(convertFive(1004));
        System.out.println(convertFive(121));
    }

}
