package introduction;

import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                int i1=(int)(Math.pow(-2,31));
                int i2=(int)(Math.pow(2,31)-1);
                long l1=(long)(Math.pow(-2,63));
                long l2=(long)(Math.pow(2,63)-1);
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767) System.out.println("* short");
                if(x>=i1 && x<=i2)System.out.println("* int");
                if(x>=l1 && x<=l2) System.out.println("* long");

                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
