package cf.tilgiz.codewars;

/**
 * @author tilgiz
 * 05.10.2020 20:32
 */
public class DeadFish {
    public static int[] parse(String data) {
        int arrayLength = (int) data.chars().filter(num -> num == 'o').count();
        int[] array = new int[arrayLength];
        int arrayIndex = 0, operation = 0;
        char[] chars = data.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]){
                case 'i': operation++; break;
                case 'd': operation--; break;
                case 's': operation = (int)Math.pow(operation,2); break;
                case 'o': array[arrayIndex]=operation; arrayIndex++; break;
            }
        }
        return array;
    }
}
