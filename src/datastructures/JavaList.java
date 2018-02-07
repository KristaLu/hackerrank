package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            list.add(n);
        }

        int Q = sc.nextInt();
        for(int i=0; i<Q; i++) {
            String str = sc.next();

            if (str.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x,y);
            }
            else if (str.equals("Delete")){
                int d = sc.nextInt();
                list.remove(d);
            }
        }

        for(Integer i:list) {
            System.out.print(i+" ");
        }

        sc.close();
    }
}
