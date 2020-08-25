package cf.tilgiz.codewars;

/**
 * @author Ilgiz Tukhvatov
 */
public class Kata {
    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sumLeft = 0, sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                sumRight += arr[k];
            }
            if (sumLeft == sumRight) return i;
        }
        return -1;
    }
}
