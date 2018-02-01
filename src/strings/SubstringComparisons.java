package strings;

import java.util.*;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k){

        String smallest;
        String largest;

        Set<String> set = new TreeSet<>();
        for (int i = 0; i < s.length()-k+1; i++) {
            set.add(s.substring(i,i+k));
        }

        List<String> list = new ArrayList<>();
        for (String s1 : set) {
            list.add(s1);
        }
        smallest = list.get(0);
        largest = list.get(set.size()-1);
        return smallest+"\n"+largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();

        System.out.println(getSmallestAndLargest(s,k));
    }
}
