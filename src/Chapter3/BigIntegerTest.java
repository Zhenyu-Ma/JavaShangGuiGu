package Chapter3;
import java.math.*;

/**
 * 如果所需的数过于大，即使long也不能满足，则可以用 "大数"  BigInteger  与 BigDecimal 类。 该类具有自己的运算 而不接受直接+ —— *
 */
public class BigIntegerTest {

    public static void main(String[] args) {
        BigInteger bigint01 = BigInteger.valueOf(122222);
        BigInteger bigint02 = new BigInteger("3333");
        BigInteger b3 = BigInteger.valueOf(44);
        System.out.println(bigint01+"  "+bigint02);
        System.out.println(bigint01.add(bigint02));
        BigDecimal bigdec = new BigDecimal("23.333");


    }
}
