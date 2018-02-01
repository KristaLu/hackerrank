package introduction;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1;i<11;i++)
        {
            int x = N*i;
            //System.out.printf("%d x %d = %d%n", N, i, x);
            System.out.println(N+" x "+i+" = "+x);
        }

    }
}
