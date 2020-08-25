package cf.tilgiz.codewars;

/**
 * @author Ilgiz Tukhvatov
 */
public class SquareDigit {
    public int squareDigits(int n) {
        StringBuilder result = new StringBuilder();
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            result.append((int)(Math.pow(Integer.parseInt(String.valueOf(s.charAt(i))),2)));
        }
        return Integer.parseInt(result.toString());
    }
}
