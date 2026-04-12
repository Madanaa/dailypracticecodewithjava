package day102darray;

public class ArrayMatrix {
    static void main() {
        int [][]a = {{20,59},{57,68},{65,21}};
        int n = a.length;
        int n2 = a[0].length;
        System.out.println(n);
        System.out.println(n2);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i].length);
                System.out.print(a[i][j]+" ");
            }
        }
    }
}
