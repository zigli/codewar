package cf.tilgiz.codewars;

/**
 * @author Ilgiz Tukhvatov
 */
public class FirstNonConsecutive {
    static Integer find(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] + 1 != array[i]) return array[i];
        }
        return null;
    }
}
