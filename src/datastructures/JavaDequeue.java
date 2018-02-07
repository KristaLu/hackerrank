package datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (i==0) {
                deque.add(num);
                count++;
            }
            else {
                if (deque.size()==m)
                    deque.removeFirst();
            }
            if (!deque.contains(num) && count<m)
                count++;
            deque.addLast(num);
        }

        System.out.println(count);
    }
}
