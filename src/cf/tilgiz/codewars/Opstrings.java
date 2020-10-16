package cf.tilgiz.codewars;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Opstrings {

    public static String vertMirror (String string) {
        String[] split = string.split("\n");
        String[] result = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            result[i] = new StringBuilder().append(split[i]).reverse().toString();
        }
        return String.join("\n", result);
    }
    public static String horMirror (String string) {
        String[] split = string.split("\n");
        String[] result = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            result[i] = split[split.length - 1 - i];
        }
        return String.join("\n", result);
    }
//    public static String oper(UnaryOperator<String> operator, String s) {
//        return operator.apply(s);
//    }

    public static String oper(Function<String,String> operator, String s) {
        return operator.apply(s);
    }

}
