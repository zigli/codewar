package cf.tilgiz.codewars;

import java.util.function.Function;

/**
 * @author tilgiz
 * 19.10.2020 17:59
 */
public class Opstrings2 {
    public static String diag1Sym(String string) {
        String[] split = string.split("\n");
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < string.indexOf('\n'); j++) {
            for (int i = 0; i < split.length; i++) {
                result.append(split[i].charAt(j));
            }
            result.append("\n");
        }
        return result.toString().trim();
    }
    public static String rot90Clock(String string) {
        String[] split = string.split("\n");
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < string.indexOf('\n'); j++) {
            for (int i = split.length - 1; i >= 0 ; i--) {
                result.append(split[i].charAt(j));
            }
            result.append("\n");
        }
        return result.toString().trim();
    }
    public static String selfieAndDiag1(String string) {
        String[] split = string.split("\n");
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < string.indexOf('\n'); j++) {
            for (int i = 0; i < split.length; i++) {
                if(i == 0) result.append(split[j]).append("|");
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
