package cf.tilgiz.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ilgiz Tukhvatov
 */
public class Order {
    public static String order(String words) {
        if (words.length() == 0) return "";
        String[] str = words.split(" ");
        String[] newstr = new String[str.length];
        for (String item: str) {
            Pattern p = Pattern.compile("[0-9]+");
            Matcher m = p.matcher(item);
            while (m.find()) {
                newstr[Integer.parseInt(m.group()) - 1] = item;
            }
        }
        return String.join(" ", newstr);

//        return Arrays.stream(words.split(" "))
//              .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
//              .reduce((a , b) -> a + " " + b)
//              .get();
    }
}
