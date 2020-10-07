package cf.tilgiz.codewars;

/**
 * @author tilgiz
 * 07.10.2020 21:33
 */
public class Vowels {
    public static int getCount(String str) {
        return str.length() - str.replaceAll("[aeiou]","").length();
    }
}
