package cf.tilgiz.codewars;

import java.util.Arrays;

/**
 * @author Ilgiz Tukhvatov
 */
public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        text = text + "\n\n";
        for (String commentSymbol : commentSymbols) {
            String slashes = (commentSymbol.matches("[a-zA-Z]")) ? "" : "\\";
            text = text.replaceAll(slashes + commentSymbol + "\n", "\n")
                    .replaceAll(slashes + commentSymbol + ".*?\n", "\n")
                    .replaceAll("\\s" + slashes + commentSymbol + ".*\n", "\n")
                    .replaceAll(slashes + commentSymbol + "", "")
                    .replaceAll(slashes + commentSymbol + ".*?", "")
                    .replaceAll("\\s" + slashes + commentSymbol + ".*?", "");
        }
        while (text.indexOf(" \n") > 0) text = text.substring(0, text.indexOf(" \n")) + text.substring(text.indexOf(" \n") + 1);

        if (!text.contains("\n")) text = text.replaceAll("[\n\r]$", "").replaceAll("\\s+$", "");
        return text.replaceAll("[\n\r]$", "");

//        return Arrays.stream(text.split("\n")).map(s -> {
//            for (String symbol : symbols) s = s.replaceAll("(\\s+$)|(\\s*[" + symbol + "].*)", "");
//            return s;
//        }).collect(Collectors.joining("\n"));
    }
}
