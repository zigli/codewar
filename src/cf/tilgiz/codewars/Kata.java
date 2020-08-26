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

    public static String longToIP(long ip) {
        String binaryIp = String.format("%32s", Long.toBinaryString(ip)).replace(' ', '0');
        return Integer.parseInt(binaryIp.substring(0, 8), 2) + "."
                + Integer.parseInt(binaryIp.substring(8, 16), 2) + "."
                + Integer.parseInt(binaryIp.substring(16, 24), 2) + "."
                + Integer.parseInt(binaryIp.substring(24, 32), 2);
    }
    public static int binaryToDecimal(String binary) {
        int num = 0;
        for (int i = 0; i < binary.length(); i++) {
            num += (int) Math.pow(2, i) * Integer.parseInt(String.valueOf(binary.charAt(binary.length() - 1 - i)));
        }
        return num;
    }


}
