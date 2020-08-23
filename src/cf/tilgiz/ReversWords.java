package cf.tilgiz;

/**
 * @author Ilgiz Tukhvatov
 */
public class ReversWords {
    public static String reverse(String string) {
        StringBuilder builderTotal = new StringBuilder();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (i == 0) {
                if (string.charAt(i) == 32) builderTotal.append(string.charAt(i));
                else builder.append(string.charAt(i));
            } else if (i == string.length() - 1) {
                builder.append(string.charAt(i));
                builder.reverse();
                builderTotal.append(builder);
            } else {
                if (string.charAt(i) == 32) {
                    builder.reverse();
                    builderTotal.append(builder).append(string.charAt(i));
                    builder = new StringBuilder();
                } else builder.append(string.charAt(i));
            }
        }
        return builderTotal.toString();
    }
}
