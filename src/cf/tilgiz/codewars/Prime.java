package cf.tilgiz.codewars;

import java.math.BigInteger;

public class Prime {
    public static boolean isPrime(int num) {
        System.out.println(num);
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0) return false;
        return num > 1;

//        return num > 1 && BigInteger.valueOf(num).isProbablePrime(100);
    }
}
