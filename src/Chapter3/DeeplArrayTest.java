package Chapter3;

import java.util.Arrays;

public class DeeplArrayTest {
    public static void main(String[] args) {
        int  arr[][] = new int[7][]  ;

        for (int i = 0; i < 7; i++) {  // 0 1 2 3 4 5
            arr[i] = new int[i+1]  ;  // this is the most important step
            arr[i][0] = 1;
            arr[i][i] = 1;

            for (int j = 1; j < i; j++) {
               arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
            System.out.println(Arrays.toString(arr[i]));

        }
    }
}
