package datastructures;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
//        int[] mas = {1,-2,4,-5,1};
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            mas[i]=val;
        }
        sc.close();

        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            int tmp=0;
            for (int j = i; j <mas.length; j++) {
                tmp+=mas[j];
                if (tmp<0)
                    count++;
            }
        }

        System.out.println(count);
    }
}
