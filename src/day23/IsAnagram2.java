package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsAnagram2 {
    public  List<List<String>>  isAnagram(String[] str){
        List<List<String>> list = new ArrayList<>();
        boolean[] visited = new boolean[str.length];
        for (int i = 0; i < str.length; i++){
            if (visited[i]){
                continue;
            }
            List<String> temp = new ArrayList<>();
            temp.add(str[i]);
            visited[i] = true;
            for (int j = i +1; j < str.length; j++){
                if (!visited[j]){
                    if(isAnhramCheck(str[i],str[j])){
                        temp.add(str[j]);
                        visited[j] = true;
                    }
                }
            }
            list.add(temp);
        }
      return list;
    }
    public boolean isAnhramCheck(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1, char2);
    }

    static void main() {

    }
}
