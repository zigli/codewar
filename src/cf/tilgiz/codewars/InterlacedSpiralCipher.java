package cf.tilgiz.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Ilgiz Tukhvatov
 */
public class InterlacedSpiralCipher {
    public static String encode(String s) {
        int square_size = (int) Math.ceil(Math.sqrt(s.length()));
        s = String.format("%1$-" + square_size * square_size + "s", s);

        System.out.println("|" + s + "|");
        System.out.println("Square side is: " + square_size);

        char[][] array = new char[square_size][square_size];
        for (char[] arr : array) {
            Arrays.fill(arr, '.');
        }

        int[] plainArrayAll = new int[0];
        int count = 0;
        int beginIndex = 0;
        int endIndex;
        do {
            System.out.println("===============");
            int current_square_size = square_size - 2 * count;
            System.out.println("Current square side is: " + current_square_size);
//            System.out.println("count = " +  count);
            int square_perimeter = ((square_size - 2 * count - 1) * 4);
//            System.out.println("square_perimeter1 = " +  square_perimeter1);
            if (square_perimeter == 0) endIndex = s.length();
            else endIndex = beginIndex + square_perimeter;
//            System.out.println("beginIndex = " +  beginIndex);
//            System.out.println("endIndex = " +  endIndex);
            String substring = s.substring(beginIndex, endIndex);
            System.out.println("|" + substring + "|");

//            Get plain perimeter order of square
            int[] plainPerimeterOrder = getPlainPerimeterOrder(square_size, count);
            System.out.println("Plain order [" + count + "]: " + Arrays.toString(plainPerimeterOrder));

//            Get encoder order of perimeter
            int[] encodeOrder = getEncoderOrder(current_square_size);
            System.out.println("Encode order [" + count + "]: " + Arrays.toString(encodeOrder));

            int[] plainArray = getEncodedArray(square_perimeter, plainPerimeterOrder, encodeOrder);

            System.out.println("Encoded array [" + count + "]: " + Arrays.toString(plainArray));

            plainArrayAll = IntStream.concat(Arrays.stream(plainArrayAll), Arrays.stream(plainArray))
                    .toArray();

            fillFinalCharArray(s, square_size, array, plainArrayAll);

            showResult(array);

            beginIndex = endIndex;
            count++;

        } while (endIndex < s.length());
        System.out.println("===============");

        System.out.println("Encoded total array: " + Arrays.toString(plainArrayAll));

        fillFinalCharArray(s, square_size, array, plainArrayAll);

        drawResult(array);

        return showResult(array);
    }

    private static void fillFinalCharArray(String s, int square_size, char[][] array, int[] plainArrayAll) {
        for (int i = 0; i < plainArrayAll.length; i++) {
//            System.out.println(i + " :: array[" + plainArrayAll[i] / square_size + "][" + plainArrayAll[i] % square_size + "] = " + s.charAt(i));
            array[plainArrayAll[i] / square_size][plainArrayAll[i] % square_size] = s.charAt(i);
        }
    }

    private static String showResult(char[][] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                builder.append(array[i][j]);
            }
        }
        return builder.toString();
    }
    private static void drawResult(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println();
        }
    }

    private static int[] getEncodedArray(int square_perimeter, int[] plainPerimeterOrder, int[] encodeOrder) {
        if (square_perimeter == 0) square_perimeter = 1;
        int[] plainArray = new int[square_perimeter];
        for (int i = 0; i < square_perimeter; i++) {
//            System.out.println(encodeOrder[i]);
            plainArray[i] = plainPerimeterOrder[encodeOrder[i]];
        }
        return plainArray;
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
                        plainPerimeterOrder[t] = getItem(i1, yMin, square_size);
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
        int square_perimeter = ((square_size - 1) * 4);
        if (square_perimeter == 0) {  //  The smallest square 1x1
            return new int[]{0};
        } else {
            int[] encodeOrder = new int[square_perimeter];
            int minus = (square_size > 2) ? 1 : 0;
            for (int y = 0, k = 0; y < square_size - 1; y++) {
                for (int j = 0; j < square_perimeter - minus; j += square_size - 1, k++) {
                    encodeOrder[k] = j + y;
                }
            }
            return encodeOrder;
        }
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
