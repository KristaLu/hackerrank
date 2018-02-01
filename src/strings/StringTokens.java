package strings;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] tok = s.trim().split("[\\s\\W\\_]+");

        if (tok.length==0 || tok[0].equals(""))
            System.out.println(0);
        else {
            System.out.println(tok.length);
            for (int i = 0; i < tok.length; i++) {
                System.out.println(tok[i]);
            }
        }
        scan.close();
    }
}
