package cf.tilgiz.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

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


    public static String replaceChar(String str, char ch, int index) {
        return str.substring(0, index) + ch + str.substring(index + 1);
    }

    public static String sortChars(String str) {
        String[] strArray = new String[str.length()];
        for (int j = 0; j < strArray.length; j++)
            strArray[j] = String.valueOf(str.charAt(j));
        Arrays.sort(strArray);
        return String.join("", strArray);
    }

    public static long nextBiggerNumber(long n) {
        String string = String.valueOf(n);
        if (string == null) return -1;
        ArrayList<Long> longArrayList = new ArrayList<>();
        long newNumber = 0;
        if (string.length() < 2) return -1;
        else if (string.length() > 2) {
            for (int i = 1; i < string.length(); i++) {
                char suffix = string.charAt(string.length() - i);
                for (int j = string.length() - 1 - i; j >= 0; j--) {
//                    System.out.println("j=" + j + " i=" + i + " suffix_char=" + suffix + " string.charAt(j)=" + string.charAt(j));
                    if (Integer.parseInt(String.valueOf(suffix)) > Integer.parseInt(String.valueOf(string.charAt(j)))) {
//                        System.out.print("here ");
//                        String s1 = ;
//                        System.out.print(s1 + " => ");
                        String s2 = replaceChar(replaceChar(string, suffix, j), string.charAt(j), string.length() - i);
//                        System.out.print(s2 + " => ");
                        if (j == string.length() - 2) newNumber = Long.parseLong(s2);
                        else newNumber = Long.parseLong(s2.substring(0, j + 1) + sortChars(s2.substring(j + 1)));
                        //break;
                        longArrayList.add(newNumber);
                    }
                }
//                if (newNumber > n)
//                    longArrayList.add(newNumber);
//                    return newNumber;
            }
//            System.out.println(longArrayList);
            if (longArrayList == null || longArrayList.size() == 0) {
                return -1;
            }
            if (longArrayList != null) {
                return longArrayList.get(longArrayList.indexOf(Collections.min(longArrayList)));
            }
        } else {
            newNumber = Integer.parseInt(string.replaceAll("(.?)(.)", "$2$1"));
            if (newNumber > n) return newNumber;
        }
        return -1;
    }

    public static long nextBiggerNumber2(long n) {
        String string = String.valueOf(n);
        int newNumber = 0;
        for (int i = 1; i < string.length() + 1; i++) {
            String suffix = string.substring(string.length() - i);
            String[] suffixArray = new String[suffix.length()];
            for (int j = 0; j < suffix.length(); j++) suffixArray[j] = String.valueOf(suffix.charAt(j));
            Arrays.sort(suffixArray);
            String prefix = string.substring(0, string.length() - i);
            suffix = String.join("", suffixArray);
            if (i > 2)
                newNumber = Integer.parseInt(prefix + suffix.replaceAll("(.)(.)(.+)", "$2$1$3"));
            else
                newNumber = Integer.parseInt(string.replaceAll("(.?)(.)", "$2$1"));
            System.out.println(i + " = " + prefix + " == " + suffix);
//            newNumber = Integer.parseInt(prefix + suffix);
//            System.out.println(newNumber + " ==");
            if (newNumber > n) return newNumber;
        }
        return -1;
    }

    public static long nextBiggerNumber1(long n) {
        return LongStream.range(n + 1,
                    Long.parseLong(
                        new StringBuilder(
                            Stream.of(String.valueOf(n).split(""))
                            .sorted()
                            .collect(Collectors.joining())
                        )
                        .reverse()
                        .toString()
                    ) + 1
                )
                .filter(v -> Stream.of(String.valueOf(n).split(""))
                    .sorted()
                    .collect(Collectors.joining())
                    .equals(Stream.of(String.valueOf(v).split(""))
                        .sorted()
                        .collect(Collectors.joining())
                    )
                )
                .findFirst()
                .orElse(-1);
    }


}
