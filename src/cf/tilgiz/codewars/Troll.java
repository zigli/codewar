package cf.tilgiz.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeuioAEUIO]","");
//        return Arrays.stream(str.split("[aeuioAEUIO]")).collect(Collectors.joining(""));
    }
}
