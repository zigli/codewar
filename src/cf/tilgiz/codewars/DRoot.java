package cf.tilgiz.codewars;

public class DRoot {
    public static int digital_root(int n) {
        do {
            n = String.valueOf(n).chars().mapToObj(x -> Integer.parseInt(String.valueOf((char) x))).reduce((x, y) -> x + y).get();
        } while (String.valueOf(n).length() > 1);
        return n;

//        return --n % 9 + 1;

    }
}
