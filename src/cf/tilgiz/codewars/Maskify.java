package cf.tilgiz.codewars;

/**
 * @author Ilgiz Tukhvatov
 */
public class Maskify {
    public static String maskify(String str) {
        return (str.length() < 5) ? str : String.format("%1$" + (str.length() - 4) + "s", str.substring(str.length() - 4,str.length() - 4)).replace(' ', '#') + str.substring(str.length() - 4);
//        return str.replaceAll(".(?=.{4})", "#");
    }
}
