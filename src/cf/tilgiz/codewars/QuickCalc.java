package cf.tilgiz.codewars;

import java.math.BigInteger;

/**
 * @author Ilgiz Tukhvatov
 */
public class QuickCalc {
    public static BigInteger choose(int n, int p) {
        return (n >= p) ? factorial(n).divide(factorial(p).multiply(factorial(n - p))) : BigInteger.valueOf(0);
    }

    private static BigInteger factorial(int n) {
        return n == 0 ? BigInteger.valueOf(1) : factorial(n - 1).multiply(BigInteger.valueOf(n));
    }
}
