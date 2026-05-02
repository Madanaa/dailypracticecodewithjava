package arrayList;

import java.util.ArrayList;
import java.util.List;

public class FindMaxNumberInList {
    public static int findMax(List<Integer> num) {
        int max = 0;//Integer.MIN_VALUE;
        for (int i = 0; i < num.size(); i++) {
            if(max < num.get(i)){
                max = num.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(15);
        num.add(45);
        num.add(78);
        num.add(20);
        System.out.println(findMax(num));
    }
}
