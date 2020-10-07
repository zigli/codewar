package cf.tilgiz.codewars;

import java.util.HashMap;

/**
 * @author tilgiz
 * 07.10.2020 22:37
 */
public class Dinglemouse {

   public static int tvRemote(final String word) {
        HashMap<Character, int[]> keyboard = new HashMap<>();
        keyboard.put('a', new int[]{0, 0});
        keyboard.put('b', new int[]{0, 1});
        keyboard.put('c', new int[]{0, 2});
        keyboard.put('d', new int[]{0, 3});
        keyboard.put('e', new int[]{0, 4});
        keyboard.put('1', new int[]{0, 5});
        keyboard.put('2', new int[]{0, 6});
        keyboard.put('3', new int[]{0, 7});

        keyboard.put('f', new int[]{1, 0});
        keyboard.put('g', new int[]{1, 1});
        keyboard.put('h', new int[]{1, 2});
        keyboard.put('i', new int[]{1, 3});
        keyboard.put('j', new int[]{1, 4});
        keyboard.put('4', new int[]{1, 5});
        keyboard.put('5', new int[]{1, 6});
        keyboard.put('6', new int[]{1, 7});

        keyboard.put('k', new int[]{2, 0});
        keyboard.put('l', new int[]{2, 1});
        keyboard.put('m', new int[]{2, 2});
        keyboard.put('n', new int[]{2, 3});
        keyboard.put('o', new int[]{2, 4});
        keyboard.put('7', new int[]{2, 5});
        keyboard.put('8', new int[]{2, 6});
        keyboard.put('9', new int[]{2, 7});

        keyboard.put('p', new int[]{3, 0});
        keyboard.put('q', new int[]{3, 1});
        keyboard.put('r', new int[]{3, 2});
        keyboard.put('s', new int[]{3, 3});
        keyboard.put('t', new int[]{3, 4});
        keyboard.put('.', new int[]{3, 5});
        keyboard.put('@', new int[]{3, 6});
        keyboard.put('0', new int[]{3, 7});

        keyboard.put('u', new int[]{4, 0});
        keyboard.put('v', new int[]{4, 1});
        keyboard.put('w', new int[]{4, 2});
        keyboard.put('x', new int[]{4, 3});
        keyboard.put('y', new int[]{4, 4});
        keyboard.put('z', new int[]{4, 5});
        keyboard.put('_', new int[]{4, 6});
        keyboard.put('/', new int[]{4, 7});

        int path = 0;
        int[] start = {0,0};
        for (int i = 0; i < word.length(); i++) {
            int[] next = keyboard.get(word.charAt(i));
            path += Math.abs(next[0] - start[0]) + Math.abs(next[1] - start[1]) + 1;
            start = next;
//            System.out.println(path);
        }

        // Your code here
        return path;
    }
}
