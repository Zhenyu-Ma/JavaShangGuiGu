package Chapter3;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = in.nextLine();
        int score = in.nextInt();
        System.out.println(firstName);
        System.out.println(score);
    }
}
