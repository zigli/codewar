package cf.tilgiz.codewars;

/**
 * @author Ilgiz Tukhvatov
 */
public class GCDsum {
    public static int[] solve(int s, int g) {
        for (int i = 1; i < s; i++) {
            if (i % g == 0 && (s - i) % g == 0) return new int[]{i, s - i};
        }
        return new int[]{-1, -1};
    }
}
