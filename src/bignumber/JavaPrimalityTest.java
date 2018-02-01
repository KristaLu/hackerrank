package bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();

        boolean flag;

        flag = n.isProbablePrime(1);
        if (flag)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
