package day3;

public class StringMemory {
    static void main() {
        String s1 = "Madan";
        String s2 = "Madan";
        System.out.println(s1 == s2);
        String s3 = new String("Madan");

        // identityHashCode unique ID deta hai memory location ke basis par
        System.out.println("s1 ID: " + System.identityHashCode(s1));
        System.out.println("s2 ID: " + System.identityHashCode(s2));
        System.out.println("s3 ID: " + System.identityHashCode(s3));
    }
}
