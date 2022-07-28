package Chapter3;
import java.lang.*;
public class RandomTest {
    public static void main(String[] args) {
        double randm[] = new double[10];
        for (int i = 0; i < randm.length; i++) {
            randm[i] =  (int) Math.round( Math.random()*10);

        }
        for(double emelent:randm)
            System.out.println(emelent);
    }
}
