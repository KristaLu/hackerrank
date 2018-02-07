package exeptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionHandlingTryCatch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            int x = in.nextInt();
            int y = in.nextInt();

            int z = x/y;
            System.out.println(z);
        }
        catch (InputMismatchException e){
            String exc = e.toString();
            if (exc.contains(":"))
                System.out.println(exc.substring(0,exc.indexOf(":")));
            else System.out.println(exc);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
