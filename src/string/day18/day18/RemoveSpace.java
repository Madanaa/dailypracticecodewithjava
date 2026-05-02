package string.day18.day18;

public class RemoveSpace {
       public static String removeSpace(String s) {
           StringBuffer res = new StringBuffer();
           for (int i = 0; i < s.length(); i++) {
               char ch = s.charAt(i);
               if (ch != ' ') {
                   res.append(ch);
               }
           }
           return res.toString();
       }

    static void main() {
        System.out.println(removeSpace("hgh okjk ijihi"));
    }
}
