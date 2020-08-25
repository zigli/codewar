package cf.tilgiz.codewars;

/**
 * @author Ilgiz Tukhvatov
 */
public class Printer {
    public static String printerError(String s) {
        int good = 0, bad = 0;
        for (int i = 0; i < s.length(); i++) {
            if((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 109) good++;
            else bad++;
        }
        return bad + "/" + (good+bad);
    }
}
