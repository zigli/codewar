package cf.tilgiz.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;

/**
 * @author Ilgiz Tukhvatov
 */
public class InterlacedSpiralCipher {
    public static String encode(String s) {

        int square_size = (int) Math.ceil(Math.sqrt(s.length()));
        s = String.format("%1$-" + square_size * square_size + "s", s);
        System.out.println(s);

        System.out.println("Square side is: " + square_size);
        char[][] array = new char[square_size][square_size];
        for (char[] arr : array) {
            Arrays.fill(arr, '.');
        }
        int square_perimeter = square_size * 2 + (square_size - 2) * 2;
        System.out.println("Square outer perimeter is: " + square_perimeter);

        int[] plainPerimeterOrder = getPlainPerimeterOrder(square_size, 1);
        System.out.println("Plain order: " + Arrays.toString(plainPerimeterOrder));

        int[] encodeOrder = getEncoderOrder(square_size);
        System.out.println("Encode order: " + Arrays.toString(encodeOrder));

        int[] plainArray = new int[square_perimeter];
        for (int i = 0; i < square_perimeter; i++) {
//            System.out.println(encodeOrder[i]);
            plainArray[i] = plainPerimeterOrder[encodeOrder[i]];
        }

        System.out.println("Encoded array: " + Arrays.toString(plainArray));

////////////////////
//
//        int[] plainArray1 = null;
//        if (square_size > 2) {
//            int square_perimeter1 = (square_size - 2) * 2 + (square_size - 2 - 2) * 2;
//            System.out.println("Square outer perimeter is: " + square_perimeter1);
//
//            int[] plainPerimeterOrder1 = getPlainPerimeterOrder(square_size, 1);
//            System.out.println("Plain order: " + Arrays.toString(plainPerimeterOrder1));
//
//            int[] encodeOrder1 = getEncoderOrder(square_size - 2);
//            System.out.println("Encode order: " + Arrays.toString(encodeOrder1));
//
//            plainArray1 = new int[square_perimeter1];
//            for (int i = 0; i < square_perimeter1; i++) {
////            System.out.println(encodeOrder[i]);
//                plainArray1[i] = plainPerimeterOrder1[encodeOrder1[i]];
//            }
//
//            System.out.println("Encoded array: " + Arrays.toString(plainArray1));
//        }
////////////////////

//        int square_perimeter2 = (square_size - 2 -2) * 2 + (square_size - 2 - 2 - 2) * 2;
//        System.out.println("Square outer perimeter is: " + square_perimeter2);
//
//        int[] plainPerimeterOrder2 = getPlainPerimeterOrder(square_size, 2);
//        System.out.println("Plain order: " + Arrays.toString(plainPerimeterOrder2));
//
//        int[] encodeOrder2 = getEncoderOrder(square_size - 2);
//        System.out.println("Encode order: " + Arrays.toString(encodeOrder2));
//
//        int[] plainArray2 = new int[square_perimeter2];
//        for (int i = 0; i < square_perimeter2; i++) {
////            System.out.println(encodeOrder[i]);
//            plainArray2[i] = plainPerimeterOrder2[encodeOrder2[i]];
//        }
//
//        System.out.println("Encoded array: " + Arrays.toString(plainArray2));


/////////////////////

        int[] plainArrayAll = plainArray;
//        int[] plainArrayAll = new int[plainArray.length + plainArray1.length];
//        System.arraycopy(plainArray, 0, plainArrayAll, 0, plainArray.length);
//        System.arraycopy(plainArray1, 0, plainArrayAll, plainArray.length, plainArray1.length);

        System.out.println("Encoded array: " + Arrays.toString(plainArrayAll));


        for (int i = 0; i < plainArrayAll.length; i++) {
//            System.out.println(i + " :: array[" + plainArrayAll[i] / square_size + "][" + plainArrayAll[i] % square_size + "] = " + s.charAt(i));
            array[plainArrayAll[i] / square_size][plainArrayAll[i] % square_size] = s.charAt(i);
        }

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

    private static int[] getPlainPerimeterOrder(int square_size, int count) {
        int[] plainPerimeterOrder;
        int xMin = count;
        int yMin = count;
        int xMax = square_size - 1 - count;
        int yMax = square_size - 1 - count;
//        int square_perimeter = (square_size - 2 * count) * 2 + ((square_size - 2 * count) - 2) * 2;
        int square_perimeter = ((square_size - 2 * count - 1) * 4);
//        System.out.println("square_perimeter:" + square_perimeter);
//        System.out.println("xMin:" + xMin);
//        System.out.println("yMin:" + yMin);
//        System.out.println("xMax:" + xMax);
//        System.out.println("yMax:" + yMax);


        if (square_perimeter == 0) {  //  The smallest square 1x1
            plainPerimeterOrder = new int[]{getItem(square_size / 2, square_size / 2, square_size)};
        } else {
            plainPerimeterOrder = new int[square_perimeter];
            for (int i = 0, t = 0; i < square_size; i++) {
                if (i == xMin) {
                    for (int j = 0; j < square_size; j++) {
                        if (j < yMin || j > yMax) continue;
//                    System.out.println("i:" + i + " j:" + j);
                        plainPerimeterOrder[t] = getItem(i, j, square_size);
                        t++;
                    }
                } else if (i > xMin && i < xMax) {
                    plainPerimeterOrder[t] = getItem(i, yMax, square_size);
                    t++;
                } else if (i == xMax) {
                    for (int j = square_size - 1; j >= 0; j--) {
                        if (j < yMin || j > yMax) continue;
//                    System.out.println("i:" + i + " j:" + j);
                        plainPerimeterOrder[t] = getItem(i, j, square_size);
                        t++;
                    }
                    for (int i1 = xMax - 1; i1 > xMin; i1--, t++) {
                        plainPerimeterOrder[t] = getItem(i1, 0, square_size);
                    }
                }
//            else if (i == square_size - 1) {
//                for (int j = square_size * square_size - 1; j > square_size * square_size - 1 - square_size; j--, t++) {
//                    plainPerimeterOrder[t] = j;
//                }
//                for (int i1 = square_size - 2; i1 > 0; i1--, t++) {
//                    plainPerimeterOrder[t] = getItem(i1, 0, square_size);
//                }
//            } else {
//                plainPerimeterOrder[t] = getItem(i, square_size - count * 2 - 1, square_size);
//                t++;
//            }
            }
        }
        return plainPerimeterOrder;
    }

    private static int[] getEncoderOrder(int square_size) {
//        int square_perimeter = square_size * 2 + (square_size - 2) * 2;
        int square_perimeter = ((square_size - 1) * 4);
        int[] encodeOrder = new int[square_perimeter];
        int minus = (square_size > 2) ? 1 : 0;
        for (int y = 0, k = 0; y < square_size - 1; y++) {
            for (int j = 0; j < square_perimeter - minus; j += square_size - 1, k++) {
                encodeOrder[k] = j + y;
            }
        }
        return encodeOrder;
    }

    public static String decode(String s) {
        // Your code here!
        return "";
    }

    public static int getItem(int x, int y, int size) {
//        int[][] arr = new int[size][size];
//        for (int i = 0, t = 0; i < size; i++) {
//            for (int j = 0; j < size; j++, t++) {
//                arr[i][j] = t;
//            }
//        }
//        return arr[x][y];
        return x * size + y;
    }
}
