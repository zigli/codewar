package cf.tilgiz.codewars;

import java.util.function.Function;

/**
 * @author tilgiz
 * 19.10.2020 18:42
 */
public class Opstrings3 {
    public static String rot90Counter(String string) {
        String[] split = string.split("\n");
        StringBuilder result = new StringBuilder();
        for (int j = string.indexOf('\n') - 1; j >= 0 ; j--) {
            for (int i = 0; i < split.length ; i++) {
                result.append(split[i].charAt(j));
            }
            result.append("\n");
        }
        return result.toString().trim();
    }
    public static String diag2Sym(String string) {
        String[] split = string.split("\n");
        StringBuilder result = new StringBuilder();
        for (int j = string.indexOf('\n') - 1; j >= 0 ; j--) {
            for (int i = split.length - 1; i >= 0 ; i--) {
                result.append(split[i].charAt(j));
            }
            result.append("\n");
        }
        return result.toString().trim();
    }
    public static String selfieDiag2Counterclock(String string) {
        String[] split = string.split("\n");
        StringBuilder result = new StringBuilder();
        for (int j = string.indexOf('\n') - 1; j >= 0 ; j--) {
            for (int i = split.length - 1; i >= 0 ; i--) {
                if(i == split.length - 1) result.append(split[string.indexOf('\n') - 1 - j]).append("|");
                result.append(split[i].charAt(j));
            }
            for (int i = 0; i < split.length ; i++) {
                if(i == 0) result.append("|");
                result.append(split[i].charAt(j));
            }
            result.append("\n");
        }
        return result.toString().trim();
    }
    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}
