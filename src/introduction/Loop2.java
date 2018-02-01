package introduction;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();


        int[] mas=new int[n];
            for(int j=0; j<n; j++){
                int tmp;
                int sum=a;
                for(int k=0; k<n; k++){
                    tmp = (int)(b*Math.pow(2,k));
                    sum+=tmp;
                    mas[k]=sum;
                }

            }

            for (int j = 0; j < n; j++) {
                System.out.print(mas[j]+" ");
            }

            System.out.println();

        }
        in.close();
    }
}
