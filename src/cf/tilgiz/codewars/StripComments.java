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
            text = text
                    .replaceAll(slashes + commentSymbol + "\n", "\n")
                    .replaceAll(slashes + commentSymbol + ".*?\n", "\n")
                    .replaceAll("\\s" + slashes + commentSymbol + ".*\n", "\n")
                    .replaceAll(slashes + commentSymbol + "", "")
                    .replaceAll(slashes + commentSymbol + ".*?", "")
                    .replaceAll("\\s" + slashes + commentSymbol + ".*?", "");

        }
        while (text.indexOf(" \n") > 0) {
            int ind = text.indexOf(" \n");
            text = text.substring(0, ind) + text.substring(ind + 1);
        }

        text = text.replaceAll("[\n\r]$", "");

        if (!text.contains("\n")) {
            text = text.replaceAll("\\s+$", "");
        }

        return text;
    }
}
