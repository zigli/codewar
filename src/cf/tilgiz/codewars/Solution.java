package cf.tilgiz.codewars;

/**
 * @author Ilgiz Tukhvatov
 */
public class Solution {
    public static String isSortedAndHow(int[] array) {
        boolean resultNO = false, resultASC = false, resultDES = false;
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i + 1] - array[i] == 0 && !resultDES) || (array[i + 1] - array[i] > 0 && resultDES) || (array[i + 1] - array[i] < 0 && resultASC)) {
                resultNO = true;
                break;
            } else if (array[i + 1] - array[i] > 0 && !resultDES) resultASC = true;
            else if (array[i + 1] - array[i] < 0 && !resultASC) resultDES = true;
        }
        return (resultNO) ? "no" : (resultASC) ? "yes, ascending" : "yes, descending";
    }

    static String toCamelCase(String s) {
        String[] split = s.split("[_-]");
        String[] newstr = new String[split.length];
        if (split.length > 1) {
            for (int i = 1; i < split.length; i++) {
                newstr[i] = capitalize(split[i]);
            }
            if ((int) split[0].charAt(0) >= 65 && (int) split[0].charAt(0) <= 90) newstr[0] = capitalize(split[0]);
            else newstr[0] = split[0];
            return String.join("", newstr);
        } else return s;
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
