package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArratlist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<ArrayList<Integer>> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                int e = sc.nextInt();
                list.get(i).add(e);
            }
        }

        int s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try{
                System.out.println(list.get(x-1).get(y-1));
            }
            catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
