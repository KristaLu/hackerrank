package introduction;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i=0;
        while(sc.hasNextLine()){
            i++;
            String str = sc.nextLine();
            System.out.println(i+" "+str);
        }
    }
}
