package cf.tilgiz.codewars;

/**
 * @author Ilgiz Tukhvatov
 */
public class SillyAdditon {
    public static int add(int num1, int num2) {
        int num1Size = String.valueOf(num1).length();
        int num2Size = String.valueOf(num2).length();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= Math.max(num1Size, num2Size); i++) {
            int digit1 = (int) (num1 % (Math.pow(10, (i + 1))) / (Math.pow(10, i)));
            int digit2 = (int) (num2 % (Math.pow(10, (i + 1))) / (Math.pow(10, i)));
            builder.insert(0,digit1 + digit2);
        }
        return Integer.parseInt(builder.toString()); //this should work right?
    }
}
