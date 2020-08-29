package cf.tilgiz.codewars;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * @author Ilgiz Tukhvatov
 */
public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
//        System.out.println(n);
        ArrayList<BigInteger> list = new ArrayList<>();
        for (long i = 0; i < Long.parseLong(String.valueOf(n)) + 1; i++) {
            if (i <= 1) list.add(BigInteger.valueOf(1));
            else {
                BigInteger bigInteger1 = list.get((int) (i - 1));
                BigInteger bigInteger2 = list.get((int) (i - 2));
                list.add(bigInteger1.add(bigInteger2));
            }
        }
//
//        double sum = list.stream()
//                .mapToDouble(a -> a)
//                .sum();
//        System.out.println(sum);

//        System.out.println(list);
        BigInteger multiplier = BigInteger.valueOf((long) 4);
        BigInteger bigIntegerSum = BigInteger.valueOf(0L);
        for (BigInteger integer : list) {
            BigInteger multiplyResult = integer.multiply(multiplier);
            bigIntegerSum = multiplyResult.add(bigIntegerSum);
        }
        return bigIntegerSum;
    }
}
