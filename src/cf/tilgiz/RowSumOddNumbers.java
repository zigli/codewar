package cf.tilgiz;

/**
 * @author Ilgiz Tukhvatov
 */
public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int i, j, result = 0;
        for (i = 1, j = n * n - (n - 1); i < n + 1; i++, j = j + 2) {
            result += j;
        }
        return result;
    }
}
