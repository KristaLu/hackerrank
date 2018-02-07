package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int arr[][] = new int[6][6];
//        for(int i=0; i < 6; i++){
//            for(int j=0; j < 6; j++){
//                arr[i][j] = in.nextInt();
//            }
//        }

        int[][] arr = {
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6-2; i++) {
            for (int j = 0; j < 6-2; j++) {
                int tmp = 0;
                tmp = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                tmp += arr[i+1][j+1];
                tmp += arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];

                list.add(tmp);
            }
        }

        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }
}
