package Chapter3;

import java.io.Console;
// 不能在IDEA中运行，可以使用terminal

public class InputPasswordTest {
    public static void main(String[] args) {
        Console cons = System.console();
        String name = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("Password: ");
        System.out.println(name + " ; " + passwd);

//        Console cons;
//        char[] passwd;
//        if ((cons = System.console()) != null &&
//                (passwd = cons.readPassword("[%s]", "Password:")) != null) {
//
//            java.util.Arrays.fill(passwd, ' ');
//        }
    }
}
