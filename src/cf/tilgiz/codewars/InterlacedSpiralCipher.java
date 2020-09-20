package cf.tilgiz.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;

/**
 * @author Ilgiz Tukhvatov
 */
public class InterlacedSpiralCipher {
    public static String encode(String s) {

//        ArrayList<ArrayList<String[][]>> arrayList = new ArrayList<>();
        int square_size = (int) Math.ceil(Math.sqrt(s.length()));
        System.out.println("Square side is: " + square_size);
        char[][] array = new char[square_size][square_size];
        for (char[] arr : array) {
            Arrays.fill(arr, ' ');
        }
        int square_perimeter = square_size * 2 + (square_size - 2) * 2;
        System.out.println("Square outer perimeter is: " + square_perimeter);

        int[] readOrder = new int[square_perimeter + 1];
        for (int y = 0, k = 1; y < square_size - 1; y++) {
            for (int j = 1; j < square_perimeter; j += square_size - 1, k++) {
                readOrder[k] = j + y;
            }
        }
        System.out.println(Arrays.toString(readOrder));

        int[] fillOrder = new int[square_perimeter];
        for (int i = 0, t = 0; i < square_size; i++) {
            if (i == 0) {
                for (int j = 0; j < square_size; j++, t++) {
                    fillOrder[t] = getItem(i, j, square_size);
                }
            } else if (i == square_size - 1) {
                for (int j = square_size * square_size - 1; j > square_size * square_size - 1 - square_size; j--, t++) {
                    fillOrder[t] = j;
                }
                for (int i1 = square_size - 2; i1 > 0; i1--, t++) {
                    fillOrder[t] = getItem(i1, 0, square_size);
                }
            } else {
                fillOrder[t] = getItem(i, square_size - 1, square_size);
                t++;
            }
        }
        System.out.println(Arrays.toString(fillOrder));

//        for (int i = 0; i < square_perimeter; i++) {
//            System.out.println(s.charAt(i));
//        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println();
        }
//        System.out.println(Arrays.deepToString(array));
        // Your code here!
        return "";
    }

    public static String decode(String s) {
        // Your code here!
        return "";
    }

    public static int getItem(int x, int y, int size) {
        int[][] arr = new int[size][size];
        for (int i = 0, t = 0; i < size; i++) {
            for (int j = 0; j < size; j++, t++) {
                arr[i][j] = t;
            }
        }
        return arr[x][y];
    }
}
