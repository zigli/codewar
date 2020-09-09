package cf.tilgiz.codewars;

import java.util.stream.IntStream;

public class MexicanWave {

    public static String[] wave(String str) {
        String[] out = new String[str.replaceAll(" ","").length()];
        for (int i = 0, j = 0; i < str.length(); i++, j++) {
            if (str.charAt(i) == ' ') {
                j--;
                continue;
            }
            out[j] = str.substring(0, i) + str.substring(i, i+1).toUpperCase() + str.substring(i+1);
        }
        return out;

//        return IntStream
//                .range(0, str.length())
//                .mapToObj(x -> new StringBuilder(str).replace(x, x+1, String.valueOf(str.charAt(x)).toUpperCase()).toString())
//                .filter(x -> !x.equals(str))
//                .toArray(String[]::new);
    }
}
