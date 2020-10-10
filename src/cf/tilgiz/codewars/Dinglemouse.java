package cf.tilgiz.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author tilgiz
 * 07.10.2020 22:37
 */
public class Dinglemouse {

    private static HashMap<Character, int[]> keypad0 = new HashMap<>();
    private static HashMap<Character, int[]> keypad1 = new HashMap<>();
    private static HashMap<Character, int[]> keypad2 = new HashMap<>();

    static {
        keypad0.put('a', new int[]{0, 0});
        keypad0.put('b', new int[]{0, 1});
        keypad0.put('c', new int[]{0, 2});
        keypad0.put('d', new int[]{0, 3});
        keypad0.put('e', new int[]{0, 4});
        keypad0.put('1', new int[]{0, 5});
        keypad0.put('2', new int[]{0, 6});
        keypad0.put('3', new int[]{0, 7});

        keypad0.put('f', new int[]{1, 0});
        keypad0.put('g', new int[]{1, 1});
        keypad0.put('h', new int[]{1, 2});
        keypad0.put('i', new int[]{1, 3});
        keypad0.put('j', new int[]{1, 4});
        keypad0.put('4', new int[]{1, 5});
        keypad0.put('5', new int[]{1, 6});
        keypad0.put('6', new int[]{1, 7});

        keypad0.put('k', new int[]{2, 0});
        keypad0.put('l', new int[]{2, 1});
        keypad0.put('m', new int[]{2, 2});
        keypad0.put('n', new int[]{2, 3});
        keypad0.put('o', new int[]{2, 4});
        keypad0.put('7', new int[]{2, 5});
        keypad0.put('8', new int[]{2, 6});
        keypad0.put('9', new int[]{2, 7});

        keypad0.put('p', new int[]{3, 0});
        keypad0.put('q', new int[]{3, 1});
        keypad0.put('r', new int[]{3, 2});
        keypad0.put('s', new int[]{3, 3});
        keypad0.put('t', new int[]{3, 4});
        keypad0.put('.', new int[]{3, 5});
        keypad0.put('@', new int[]{3, 6});
        keypad0.put('0', new int[]{3, 7});

        keypad0.put('u', new int[]{4, 0});
        keypad0.put('v', new int[]{4, 1});
        keypad0.put('w', new int[]{4, 2});
        keypad0.put('x', new int[]{4, 3});
        keypad0.put('y', new int[]{4, 4});
        keypad0.put('z', new int[]{4, 5});
        keypad0.put('_', new int[]{4, 6});
        keypad0.put('/', new int[]{4, 7});

        keypad0.put(' ', new int[]{5, 1});

        keypad1.put('A', new int[]{0, 0});
        keypad1.put('B', new int[]{0, 1});
        keypad1.put('C', new int[]{0, 2});
        keypad1.put('D', new int[]{0, 3});
        keypad1.put('E', new int[]{0, 4});
        keypad1.put('1', new int[]{0, 5});
        keypad1.put('2', new int[]{0, 6});
        keypad1.put('3', new int[]{0, 7});

        keypad1.put('F', new int[]{1, 0});
        keypad1.put('G', new int[]{1, 1});
        keypad1.put('H', new int[]{1, 2});
        keypad1.put('I', new int[]{1, 3});
        keypad1.put('J', new int[]{1, 4});
        keypad1.put('4', new int[]{1, 5});
        keypad1.put('5', new int[]{1, 6});
        keypad1.put('6', new int[]{1, 7});

        keypad1.put('K', new int[]{2, 0});
        keypad1.put('L', new int[]{2, 1});
        keypad1.put('M', new int[]{2, 2});
        keypad1.put('N', new int[]{2, 3});
        keypad1.put('O', new int[]{2, 4});
        keypad1.put('7', new int[]{2, 5});
        keypad1.put('8', new int[]{2, 6});
        keypad1.put('9', new int[]{2, 7});

        keypad1.put('P', new int[]{3, 0});
        keypad1.put('Q', new int[]{3, 1});
        keypad1.put('R', new int[]{3, 2});
        keypad1.put('S', new int[]{3, 3});
        keypad1.put('T', new int[]{3, 4});
        keypad1.put('.', new int[]{3, 5});
        keypad1.put('@', new int[]{3, 6});
        keypad1.put('0', new int[]{3, 7});

        keypad1.put('U', new int[]{4, 0});
        keypad1.put('V', new int[]{4, 1});
        keypad1.put('W', new int[]{4, 2});
        keypad1.put('X', new int[]{4, 3});
        keypad1.put('Y', new int[]{4, 4});
        keypad1.put('Z', new int[]{4, 5});
        keypad1.put('_', new int[]{4, 6});
        keypad1.put('/', new int[]{4, 7});

        keypad1.put(' ', new int[]{5, 1});

        keypad2.put('^', new int[]{0, 0});
        keypad2.put('~', new int[]{0, 1});
        keypad2.put('?', new int[]{0, 2});
        keypad2.put('!', new int[]{0, 3});
        keypad2.put('\'', new int[]{0, 4});
        keypad2.put('"', new int[]{0, 5});
        keypad2.put('(', new int[]{0, 6});
        keypad2.put(')', new int[]{0, 7});

        keypad2.put('-', new int[]{1, 0});
        keypad2.put(':', new int[]{1, 1});
        keypad2.put(';', new int[]{1, 2});
        keypad2.put('+', new int[]{1, 3});
        keypad2.put('&', new int[]{1, 4});
        keypad2.put('%', new int[]{1, 5});
        keypad2.put('*', new int[]{1, 6});
        keypad2.put('=', new int[]{1, 7});

        keypad2.put('<', new int[]{2, 0});
        keypad2.put('>', new int[]{2, 1});
        keypad2.put('\u20AC', new int[]{2, 2});
        keypad2.put('\u00A3', new int[]{2, 3});
        keypad2.put('$', new int[]{2, 4});
        keypad2.put('\u00A5', new int[]{2, 5});
        keypad2.put('\u00A4', new int[]{2, 6});
        keypad2.put('\\', new int[]{2, 7});

        keypad2.put('[', new int[]{3, 0});
        keypad2.put(']', new int[]{3, 1});
        keypad2.put('{', new int[]{3, 2});
        keypad2.put('}', new int[]{3, 3});
        keypad2.put(',', new int[]{3, 4});
        keypad2.put('.', new int[]{3, 5});
        keypad2.put('@', new int[]{3, 6});
        keypad2.put('\u00A7', new int[]{3, 7});

        keypad2.put('#', new int[]{4, 0});
        keypad2.put('\u00BF', new int[]{4, 1});
        keypad2.put('\u00A1', new int[]{4, 2});
        keypad2.put('_', new int[]{4, 6});
        keypad2.put('/', new int[]{4, 7});

        keypad2.put(' ', new int[]{5, 1});

    }

    private final static String[] KEYS = {"abcde123fghij456klmno789pqrst.@0uvwxyz_/\u0010 ",
            "ABCDE123FGHIJ456KLMNO789PQRST.@0UVWXYZ_/\u0010 ",
            "^~?!'\"()-:;+&%*=<>€£$¥¤\\[]{},.@§#¿¡\u0010\u0011\u0012_/\u0013 "};

    private static final int Y_MAX = 6;
    private static final int X_MAX = 8;

    private final static List<Map<Character, int[]>> keypads = Arrays.stream(KEYS).map(keyboard -> IntStream.range(0, keyboard.length())
            .boxed()
            .collect(Collectors.toMap(keyboard::charAt, i -> new int[]{i / X_MAX, i % X_MAX})))
            .collect(Collectors.toList());

    public static int toggleShift(int currentMode, int requiredMode) {
        return (requiredMode > currentMode) ? requiredMode - currentMode : 3 - (currentMode - requiredMode);
    }

    public static int distance(int[] from, int[] to) {
        return Math.min(Y_MAX - Math.abs(from[0] - to[0]), Math.abs(from[0] - to[0])) +
                Math.min(X_MAX - Math.abs(from[1] - to[1]), Math.abs(from[1] - to[1]));
    }

    public static int[] searchChar(char ch, int shiftKey) {
        while (!keypads.get(shiftKey).containsKey(ch)) {
            shiftKey = ++shiftKey % 3;
        }
        return keypads.get(shiftKey).get(ch);
    }

    public static int[] searchChar1(char ch, int shiftKey) {
        if (shiftKey == 0)
            return keypad0.containsKey(ch) ? keypad0.get(ch) : keypad1.containsKey(ch) ? keypad1.get(ch) : keypad2.get(ch);
        else if (shiftKey == 1)
            return keypad1.containsKey(ch) ? keypad1.get(ch) : keypad2.containsKey(ch) ? keypad2.get(ch) : keypad0.get(ch);
        else
            return keypad2.containsKey(ch) ? keypad2.get(ch) : keypad0.containsKey(ch) ? keypad0.get(ch) : keypad1.get(ch);
    }

    public static int getShiftMod(char ch, int shiftKey) {
        while (!keypads.get(shiftKey).containsKey(ch)) {
            shiftKey = ++shiftKey % 3;
        }
        return shiftKey;
    }

    public static int getShiftMod1(char ch, int shiftKey) {
        if (shiftKey == 0) return keypad0.containsKey(ch) ? 0 : keypad1.containsKey(ch) ? 1 : 2;
        else if (shiftKey == 1) return keypad1.containsKey(ch) ? 1 : keypad2.containsKey(ch) ? 2 : 0;
        else return keypad2.containsKey(ch) ? 2 : keypad0.containsKey(ch) ? 0 : 1;
    }

    public static int tvRemoteSymbols(final String words) {
        System.out.println(words);
        int path = 0;
        int[] current = {0, 0};
        int[] shiftKey = {5, 0};
        int shiftKeyCurrent = 0;
        for (int i = 0; i < words.length(); i++) {
            char charAt = words.charAt(i);
//            int[] nextChar = searchChar(charAt, shiftKeyCurrent);
//            int shiftKeyRequired = getShiftMod(charAt, shiftKeyCurrent);
            int shiftKeyRequired = shiftKeyCurrent;
            while (!keypads.get(shiftKeyRequired).containsKey(charAt)) {
                shiftKeyRequired = ++shiftKeyRequired % 3;
            }
            int[] nextChar = keypads.get(shiftKeyRequired).get(charAt);
            System.out.println("char: " + charAt + " at: " + Arrays.toString(nextChar) + " shiftKeyCurrent: " + shiftKeyCurrent + " shiftKeyRequired: " + shiftKeyRequired);

/*            if (nextChar[2] == 0) {
                int dist = distance(shiftKey, current);
                if (shiftKeyCurrent <= 1) {
                    if (Character.isUpperCase(charAt) && shiftKeyCurrent == 0) {
                        System.out.print(Arrays.toString(current) + " =Up> " + Arrays.toString(shiftKey) + "\n dist: ");
                        System.out.println(dist);
                        System.out.print(" OK: ");
                        System.out.print(toggleShift(shiftKeyCurrent, 1));
                        System.out.println("");
                        path = path + dist + toggleShift(shiftKeyCurrent, 1);
                        shiftKeyCurrent = 1;
                        current = shiftKey;
                    } else if (Character.isLowerCase(charAt) && shiftKeyCurrent == 1) {
                        System.out.print(Arrays.toString(current) + " =Lo> " + Arrays.toString(shiftKey) + "\n dist: ");
                        System.out.println(dist);
                        System.out.print(" OK: ");
                        System.out.print(toggleShift(shiftKeyCurrent, 0));
                        System.out.println("");
                        path = path + dist + toggleShift(shiftKeyCurrent, 0);
                        shiftKeyCurrent = 0;
                        current = shiftKey;
                    }
                } else {
                    System.out.print(Arrays.toString(current) + " =sY> " + Arrays.toString(shiftKey) + "\n dist: ");
                    System.out.println(dist);
                    System.out.print(" OK: ");
                    System.out.print(toggleShift(shiftKeyCurrent, shiftKeyRequired));
                    System.out.println("");
                    path = path + dist + toggleShift(shiftKeyCurrent, shiftKeyRequired);
                    shiftKeyCurrent = shiftKeyRequired;
                    current = shiftKey;
                }
            } else if (nextChar[2] == 2 && shiftKeyCurrent <= 1) {
                int dist = distance(shiftKey, current);
                System.out.print(Arrays.toString(current) + " =Sy> " + Arrays.toString(shiftKey) + "\n dist: ");
                System.out.println(dist);
                System.out.print(" OK: ");
                System.out.print(toggleShift(shiftKeyCurrent, 2));
                System.out.println("");
                path = path + dist + toggleShift(shiftKeyCurrent, 2);
                shiftKeyCurrent = 2;
                current = shiftKey;
            }*/
            if (shiftKeyRequired != shiftKeyCurrent) {
                int dist = distance(shiftKey, current);
                System.out.print(Arrays.toString(current) + " =Shift=> " + Arrays.toString(shiftKey) + "\n dist: ");
                System.out.println(dist);
                System.out.print(" OK: ");
                System.out.print(toggleShift(shiftKeyCurrent, shiftKeyRequired));
                System.out.println("");
                path = path + dist + toggleShift(shiftKeyCurrent, shiftKeyRequired);
                shiftKeyCurrent = shiftKeyRequired;
                current = shiftKey;
            }
            int dist = distance(nextChar, current);
            System.out.print(Arrays.toString(current) + " ==> " + Arrays.toString(nextChar) + "\n dist: ");
            System.out.println(dist);
            System.out.print(" OK: ");
            System.out.println(1);
            path = path + dist + 1;
            current = nextChar;

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
            int[] next = keypad0.get(Character.toLowerCase(charAt));
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
            int[] next = keypad0.get(Character.toLowerCase(charAt));
            path += Math.abs(next[0] - start[0]) + Math.abs(next[1] - start[1]) + 1;
            start = next;
        }
        return path;
    }

}
