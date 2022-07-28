package Chapter3;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 增强for 循环，能直接对数组进行遍历，更简洁简单
 */
public class ForeachTest {
    public static void main(String[] args) {
        int score[] = {11,22,33,23,44,55,76};

        for (int element:score
             ) {
            System.out.println(element);
        }
        for(double element:score){
            element = element*2 ;
        }
//        for(String element:score){
//
//        }

        System.out.println(Arrays.toString(score));
//        for(int [] :score){

        int marks[] = {1,2,3,4,5};
        int StudentB []= Arrays.copyOf(marks,4);
        marks[2] = 7;
        System.out.println(Arrays.toString(StudentB));

    }
}
