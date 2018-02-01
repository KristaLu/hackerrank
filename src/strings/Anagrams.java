package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b){
        boolean flag = false;
        Map<String, Integer> mapA = new HashMap<>();
        Map<String, Integer> mapB = new HashMap<>();

        if (a.length()==b.length()){
            for (int i = 0; i < a.length(); i++) {
                String strA = a.substring(i,i+1).toLowerCase();
                String strB = b.substring(i,i+1).toLowerCase();

                if (mapA.containsKey(strA))
                    mapA.merge(strA,1,(x,y)->x+y);
                else mapA.put(strA,1);

                if (mapB.containsKey(strB))
                    mapB.merge(strB,1,(x,y)->x+y);
                else mapB.put(strB,1);
            }

            if (mapA.equals(mapB))
                flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
