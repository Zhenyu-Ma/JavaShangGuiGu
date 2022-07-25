package Chapter3;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class OutputTest {
    public static void main(String[] args) throws IOException {
//        double dou = 100.0 / 3;
//        System.out.println(dou);
//        System.out.printf("%.2f", dou);
//        String name = "mazhenyu";
//        int age = 26;
//        System.out.println();
//        System.out.println(String.format("Hello,%s, next year you will be %d",name,age));

//        Scanner in = new Scanner(Path.of("/Users/zhenyuma/Documents/Java_code/readFileTest.txt"), StandardCharsets.UTF_8);
//        System.out.println(in.nextLine());
//        Scanner inConsole = new Scanner(System.in);
//        String test01 = inConsole.nextLine();
////        PrintWriter out = new PrintWriter("writeFileTest.txt", StandardCharsets.UTF_8);
//        System.out.println(test01);
//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }
            int test01 =  System.in.read();
        System.out.println(test01);


    }

}
