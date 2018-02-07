package datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        BitSet[] B = {new BitSet(N), new BitSet(N)};

        for (int i = 0; i < M; i++) {
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (op.equals("AND")){
                B[x-1].and(B[y-1]);
                System.out.println(B[0].cardinality()+" "+B[1].cardinality());
            }
            if (op.equals("OR")){
                B[x-1].or(B[y-1]);
                System.out.println(B[0].cardinality()+" "+B[1].cardinality());
            }
            if (op.equals("XOR")){
                B[x-1].xor(B[y-1]);
                System.out.println(B[0].cardinality()+" "+B[1].cardinality());
            }
            if (op.equals("FLIP")){
                B[x-1].flip(y);
                System.out.println(B[0].cardinality()+" "+B[1].cardinality());
            }
            if (op.equals("SET")){
                B[x-1].set(y);
                System.out.println(B[0].cardinality()+" "+B[1].cardinality());
            }
        }
    }
}
