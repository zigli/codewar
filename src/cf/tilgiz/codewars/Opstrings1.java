package cf.tilgiz.codewars;

import java.util.function.Function;

/**
 * @author tilgiz
 * 16.10.2020 21:39
 */
public class Opstrings1 {
    public static String rot(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static String selfieAndRot(String string) {
        var dots = ".".repeat(string.indexOf('\n'));
//        String[] split = string.split("\n");
//        String dots = String.format("%" + split[0].length() + "s", "").replace(' ', '.');
        return string.replaceAll("(\\w{" + (string.indexOf('\n')) + "})", "$1" + dots) + "\n" + rot(string).replaceAll("(\\w{" + (string.indexOf('\n')) + "})", dots + "$1");
    }

    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}
