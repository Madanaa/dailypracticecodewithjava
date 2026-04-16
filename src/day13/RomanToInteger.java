package day13;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int currentValue = getValue(s.charAt(i));
            if (i + 1 < n && currentValue < getValue(s.charAt(i+1))) {
                ans = ans - currentValue;
            } else {

                ans = ans + currentValue;
            }
        }
        return ans;
    }
    private static int getValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    static void main() {
        System.out.println(romanToInt("III"));
    }
}
