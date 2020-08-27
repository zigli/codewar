package cf.tilgiz.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ilgiz Tukhvatov
 */
public class ParseMolecule {
    public static Map<String,Integer> getAtoms(String formula) {
        System.out.println(formula + "===============");
        String[] strings = new String[formula.length()];
        for (int i = 0, k = 0; i < formula.length(); i++) {
            if (formula.charAt(i) > 96 && formula.charAt(i) < 123) {
                System.out.println("here");
                strings = Arrays.copyOf(strings, formula.length() - 1);
                strings[k - 1] = strings[k - 1] + formula.charAt(i);
                continue;
            }
            strings[k] = String.valueOf(formula.charAt(i));
            k++;
        }

        System.out.println(Arrays.toString(strings));

        return new HashMap<String,Integer>();
    }
}
