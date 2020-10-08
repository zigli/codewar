package cf.tilgiz.codewars;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author tilgiz
 * 07.10.2020 22:37
 */
public class Dinglemouse {

    private static HashMap<Character, int[]> keyboard = new HashMap<>();

    static {
        keyboard.put('a', new int[]{0, 0, 0});
        keyboard.put('b', new int[]{0, 1, 0});
        keyboard.put('c', new int[]{0, 2, 0});
        keyboard.put('d', new int[]{0, 3, 0});
        keyboard.put('e', new int[]{0, 4, 0});
        keyboard.put('1', new int[]{0, 5, 0});
        keyboard.put('2', new int[]{0, 6, 0});
        keyboard.put('3', new int[]{0, 7, 0});

        keyboard.put('f', new int[]{1, 0, 0});
        keyboard.put('g', new int[]{1, 1, 0});
        keyboard.put('h', new int[]{1, 2, 0});
        keyboard.put('i', new int[]{1, 3, 0});
        keyboard.put('j', new int[]{1, 4, 0});
        keyboard.put('4', new int[]{1, 5, 0});
        keyboard.put('5', new int[]{1, 6, 0});
        keyboard.put('6', new int[]{1, 7, 0});

        keyboard.put('k', new int[]{2, 0, 0});
        keyboard.put('l', new int[]{2, 1, 0});
        keyboard.put('m', new int[]{2, 2, 0});
        keyboard.put('n', new int[]{2, 3, 0});
        keyboard.put('o', new int[]{2, 4, 0});
        keyboard.put('7', new int[]{2, 5, 0});
        keyboard.put('8', new int[]{2, 6, 0});
        keyboard.put('9', new int[]{2, 7, 0});

        keyboard.put('p', new int[]{3, 0, 0});
        keyboard.put('q', new int[]{3, 1, 0});
        keyboard.put('r', new int[]{3, 2, 0});
        keyboard.put('s', new int[]{3, 3, 0});
        keyboard.put('t', new int[]{3, 4, 0});
        keyboard.put('.', new int[]{3, 5, 0});
        keyboard.put('@', new int[]{3, 6, 0});
        keyboard.put('0', new int[]{3, 7, 0});

        keyboard.put('u', new int[]{4, 0, 0});
        keyboard.put('v', new int[]{4, 1, 0});
        keyboard.put('w', new int[]{4, 2, 0});
        keyboard.put('x', new int[]{4, 3, 0});
        keyboard.put('y', new int[]{4, 4, 0});
        keyboard.put('z', new int[]{4, 5, 0});
        keyboard.put('_', new int[]{4, 6, 0});
        keyboard.put('/', new int[]{4, 7, 0});

        keyboard.put(' ', new int[]{5, 1, 0});

        keyboard.put('^', new int[]{0, 0, 1});
        keyboard.put('~', new int[]{0, 1, 1});
        keyboard.put('?', new int[]{0, 2, 1});
        keyboard.put('!', new int[]{0, 3, 1});
        keyboard.put('\'', new int[]{0, 4, 1});
        keyboard.put('"', new int[]{0, 5, 1});
        keyboard.put('(', new int[]{0, 6, 1});
        keyboard.put(')', new int[]{0, 7, 1});

        keyboard.put('-', new int[]{1, 0, 1});
        keyboard.put(':', new int[]{1, 1, 1});
        keyboard.put(';', new int[]{1, 2, 1});
        keyboard.put('+', new int[]{1, 3, 1});
        keyboard.put('&', new int[]{1, 4, 1});
        keyboard.put('%', new int[]{1, 5, 1});
        keyboard.put('*', new int[]{1, 6, 1});
        keyboard.put('=', new int[]{1, 7, 1});

        keyboard.put('<', new int[]{2, 0, 1});
        keyboard.put('>', new int[]{2, 1, 1});
        keyboard.put('\u20AC', new int[]{2, 2, 1});
        keyboard.put('\u00A3', new int[]{2, 3, 1});
        keyboard.put('$', new int[]{2, 4, 1});
        keyboard.put('\u00A5', new int[]{2, 5, 1});
        keyboard.put('\u00A4', new int[]{2, 6, 1});
        keyboard.put('\\', new int[]{2, 7, 1});

        keyboard.put('[', new int[]{3, 0, 1});
        keyboard.put(']', new int[]{3, 1, 1});
        keyboard.put('{', new int[]{3, 2, 1});
        keyboard.put('}', new int[]{3, 3, 1});
        keyboard.put(',', new int[]{3, 4, 1});
        keyboard.put('\u00A7', new int[]{3, 7, 1});

        keyboard.put('#', new int[]{4, 0, 1});
        keyboard.put('\u00BF', new int[]{4, 1, 1});
        keyboard.put('\u00A1', new int[]{4, 2, 1});

    }

    public static int toggleShift(int currentState, int requiredState){
        return (requiredState > currentState) ? requiredState - currentState : 3 - (currentState - requiredState);
    }

    public static int tvRemoteSymbols(final String words) {

        int yMax = 6;
        int xMax = 8;
        int path = 0;
        int[] start = {0, 0, 0};
        int[] aA = {5, 0, 0};
        int shiftKey = 0;
        for (int i = 0; i < words.length(); i++) {
            char charAt = words.charAt(i);
            if (Character.isUpperCase(charAt) && shiftKey != 1) {
//                System.out.println(charAt);
//                System.out.printf("yMax %d, Math.abs(aA[0] - start[0]) %d\n", yMax, Math.abs(aA[0] - start[0]));
                int i1 = Math.min(yMax - Math.abs(aA[0] - start[0]), Math.abs(aA[0] - start[0]));
                int i2 = Math.min(xMax - Math.abs(aA[1] - start[1]), Math.abs(aA[1] - start[1]));
                path = path + i1 + i2 + toggleShift(shiftKey,1);;
                shiftKey = 1;
                start = aA;
//                System.out.println(path);
            } else if (Character.isLowerCase(charAt) && shiftKey !=0) {
                int i1 = Math.min(yMax - Math.abs(aA[0] - start[0]), Math.abs(aA[0] - start[0]));
                int i2 = Math.min(xMax - Math.abs(aA[1] - start[1]), Math.abs(aA[1] - start[1]));
                path = path + i1 + i2 + toggleShift(shiftKey,0);
                shiftKey = 0;
                start = aA;
//                System.out.println(path);
            }
            int[] next = keyboard.get(Character.toLowerCase(charAt));
//            System.out.print(Arrays.toString(start));
//            System.out.print(" => ");
//            System.out.println(Arrays.toString(next));

            int i1 = Math.min(yMax - Math.abs(next[0] - start[0]), Math.abs(next[0] - start[0]));
            int i2 = Math.min(xMax - Math.abs(next[1] - start[1]), Math.abs(next[1] - start[1]));
//            System.out.println(i1);
//            System.out.println(i2);
            path = path + i1 + i2 + 1;

            start = next;
            System.out.println(path);
            System.out.println("=======");
        }
        return path;
    }


    public static int tvRemoteWrap(final String words) {

        int yMax = 6;
        int xMax = 8;
        int path = 0;
        int[] start = {0, 0};
        int[] aA = {5, 0};
        boolean shiftKey = false;
        for (int i = 0; i < words.length(); i++) {
            char charAt = words.charAt(i);
            if (Character.isUpperCase(charAt) && !shiftKey) {
//                System.out.println(charAt);
//                System.out.printf("yMax %d, Math.abs(aA[0] - start[0]) %d\n", yMax, Math.abs(aA[0] - start[0]));
                int i1 = Math.min(yMax - Math.abs(aA[0] - start[0]), Math.abs(aA[0] - start[0]));
                int i2 = Math.min(xMax - Math.abs(aA[1] - start[1]), Math.abs(aA[1] - start[1]));
                path = path + i1 + i2 + 1;
                shiftKey = true;
                start = aA;
//                System.out.println(path);
            } else if (Character.isLowerCase(charAt) && shiftKey) {
                int i1 = Math.min(yMax - Math.abs(aA[0] - start[0]), Math.abs(aA[0] - start[0]));
                int i2 = Math.min(xMax - Math.abs(aA[1] - start[1]), Math.abs(aA[1] - start[1]));
                path = path + i1 + i2 + 1;
                shiftKey = false;
                start = aA;
//                System.out.println(path);
            }
            int[] next = keyboard.get(Character.toLowerCase(charAt));
//            System.out.print(Arrays.toString(start));
//            System.out.print(" => ");
//            System.out.println(Arrays.toString(next));

            int i1 = Math.min(yMax - Math.abs(next[0] - start[0]), Math.abs(next[0] - start[0]));
            int i2 = Math.min(xMax - Math.abs(next[1] - start[1]), Math.abs(next[1] - start[1]));
//            System.out.println(i1);
//            System.out.println(i2);
            path = path + i1 + i2 + 1;

            start = next;
//            System.out.println(path);
//            System.out.println("=======");
        }
        return path;
    }

    public static int tvRemote(final String word) {

        int path = 0;
        int[] start = {0, 0};
        int[] aA = {5, 0};
        boolean shiftKey = false;
        for (int i = 0; i < word.length(); i++) {
            char charAt = word.charAt(i);
            if (Character.isUpperCase(charAt) && !shiftKey) {
                path += Math.abs(aA[0] - start[0]) + Math.abs(aA[1] - start[1]) + 1;
                shiftKey = true;
                start = aA;
            } else if (Character.isLowerCase(charAt) && shiftKey) {
                path += Math.abs(aA[0] - start[0]) + Math.abs(aA[1] - start[1]) + 1;
                shiftKey = false;
                start = aA;
            }
            int[] next = keyboard.get(Character.toLowerCase(charAt));
            path += Math.abs(next[0] - start[0]) + Math.abs(next[1] - start[1]) + 1;
            start = next;
        }
        return path;
    }

}
