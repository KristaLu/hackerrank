package strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        StringBuffer sb = new StringBuffer(A);
        String B = sb.reverse().toString();

        if(A.equals(B)) System.out.println("Yes");
        else System.out.println("No");
    }
}
