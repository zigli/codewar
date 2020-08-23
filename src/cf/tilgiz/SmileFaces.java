package cf.tilgiz;

import java.util.List;

/**
 * @author Ilgiz Tukhvatov
 */
public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        String regexEyes = "^[:;][-~]{0,1}[)D]$";
        int count = 0;
        if(arr.size()!=0) {
            for (String item : arr) {
                if (item.length() == 2 || item.length() == 3) {
                    if (item.matches(regexEyes)) count++;
                }
            }
        }
        return count;
    }
}
