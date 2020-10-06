package cf.tilgiz.codewars;

import java.util.Arrays;

/**
 * @author tilgiz
 * 05.10.2020 21:01
 */
public class Persist {
    public static int persistence(long n) {
        if (String.valueOf(n).length() == 1) return 0;
        int num = 1;
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            num *= n / (int) Math.pow(10, i) % 10;
        }
        return persistence(num) + 1;

//        int count = 0;
//        while (String.valueOf(n).length() > 1) {
//            long num = 1;
//            for (int i = 0; i < String.valueOf(n).length(); i++) {
//                num *= n / (int) Math.pow(10, i) % 10;
//            }
//            n = num;
//            count++;
//        }
//        return count;
    }
}
