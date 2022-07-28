package Chapter3;

import java.util.Arrays;

public class CommandLine{

    public static void main(String[] args) {
        System.out.print(Arrays.toString(args));

        for(String element: args){
            System.out.print(element);
        }
        int[] a = {1,2,3,4};
        //int r = 2;
        for(int r :a )
            System.out.println(r);



    }
}