package day5;

public class CheckAlphabetDigitSpecialChar {
    public static void checkAlphabetDigitSpecialChar(char ch) {
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        }
        else if(ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }
    }

    static void main() {
        checkAlphabetDigitSpecialChar('a');
    }
}
