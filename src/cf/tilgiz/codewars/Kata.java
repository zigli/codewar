package cf.tilgiz.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
//        System.out.println(binaryIp);
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


    public static int dutyFree(int normPrice, int discount, int hol) {
//        float pers = (float) discount / 100;
//
//        System.out.println(hol / (normPrice * pers));

        return (int) (hol / (normPrice * ((float) discount / 100)));

    }

    public static String subtractSum(int n) {
        String[] fruits = new String[101];
        fruits[1] = "kiwi";
        fruits[2] = "pear";
        fruits[3] = "kiwi";
        fruits[4] = "banana";
        fruits[5] = "melon";
        fruits[6] = "banana";
        fruits[7] = "melon";
        fruits[8] = "pineapple";
        fruits[9] = "apple";
        fruits[10] = "pineapple";
        fruits[11] = "cucumber";
        fruits[12] = "pineapple";
        fruits[13] = "cucumber";
        fruits[14] = "orange";
        fruits[15] = "grape";
        fruits[16] = "orange";
        fruits[17] = "grape";
        fruits[18] = "apple";
        fruits[19] = "grape";
        fruits[20] = "cherry";
        fruits[21] = "pear";
        fruits[22] = "cherry";
        fruits[23] = "pear";
        fruits[24] = "kiwi";
        fruits[25] = "banana";
        fruits[26] = "kiwi";
        fruits[27] = "apple";
        fruits[28] = "melon";
        fruits[29] = "banana";
        fruits[30] = "melon";
        fruits[31] = "pineapple";
        fruits[32] = "melon";
        fruits[33] = "pineapple";
        fruits[34] = "cucumber";
        fruits[35] = "orange";
        fruits[36] = "apple";
        fruits[37] = "orange";
        fruits[38] = "grape";
        fruits[39] = "orange";
        fruits[40] = "grape";
        fruits[41] = "cherry";
        fruits[42] = "pear";
        fruits[43] = "cherry";
        fruits[44] = "pear";
        fruits[45] = "apple";
        fruits[46] = "pear";
        fruits[47] = "kiwi";
        fruits[48] = "banana";
        fruits[49] = "kiwi";
        fruits[50] = "banana";
        fruits[51] = "melon";
        fruits[52] = "pineapple";
        fruits[53] = "melon";
        fruits[54] = "apple";
        fruits[55] = "cucumber";
        fruits[56] = "pineapple";
        fruits[57] = "cucumber";
        fruits[58] = "orange";
        fruits[59] = "cucumber";
        fruits[60] = "orange";
        fruits[61] = "grape";
        fruits[62] = "cherry";
        fruits[63] = "apple";
        fruits[64] = "cherry";
        fruits[65] = "pear";
        fruits[66] = "cherry";
        fruits[67] = "pear";
        fruits[68] = "kiwi";
        fruits[69] = "pear";
        fruits[70] = "kiwi";
        fruits[71] = "banana";
        fruits[72] = "apple";
        fruits[73] = "banana";
        fruits[74] = "melon";
        fruits[75] = "pineapple";
        fruits[76] = "melon";
        fruits[77] = "pineapple";
        fruits[78] = "cucumber";
        fruits[79] = "pineapple";
        fruits[80] = "cucumber";
        fruits[81] = "apple";
        fruits[82] = "grape";
        fruits[83] = "orange";
        fruits[84] = "grape";
        fruits[85] = "cherry";
        fruits[86] = "grape";
        fruits[87] = "cherry";
        fruits[88] = "pear";
        fruits[89] = "cherry";
        fruits[90] = "apple";
        fruits[91] = "kiwi";
        fruits[92] = "banana";
        fruits[93] = "kiwi";
        fruits[94] = "banana";
        fruits[95] = "melon";
        fruits[96] = "banana";
        fruits[97] = "melon";
        fruits[98] = "pineapple";
        fruits[99] = "apple";
        fruits[100] = "pineapple";

        int result = n;
        do{
            result = getResult(result);
        }while (result > 100);

        return fruits[result];
    }

    public static int getResult (int n){
        int sum = 0;
        int nOrig = n;
        while (n > 0) {
            int d = n / 10;
            int k = n - d * 10;
            n = d;
            sum += k;
        }
        return nOrig - sum;
    }


    static String alternateCase(final String string) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
            if(Character.isLowerCase(string.charAt(i))) stringBuffer.append(String.valueOf(string.charAt(i)).toUpperCase());
            else stringBuffer.append(String.valueOf(string.charAt(i)).toLowerCase());
//            if((int)string.charAt(i) > 91) stringBuffer.append(String.valueOf(string.charAt(i)).toUpperCase());
//            else stringBuffer.append(String.valueOf(string.charAt(i)).toLowerCase());
        }
        return stringBuffer.toString();

//        return string.chars()
//                .mapToObj(i -> new Character((char) i))
//                .map(i -> Character.isUpperCase(i) ? Character.toLowerCase(i) : Character.toUpperCase(i))
//                .map(i -> i.toString())
//                .collect(Collectors.joining(""));


    }


    public static String dative(String word) {
        System.out.println(word);

        Pattern pattern = Pattern.compile("[aáoóuúeéiíöőüű]");
        Matcher matcher = pattern.matcher(word);
        String find = word;
        while (matcher.find()) {
            find = String.valueOf(matcher.group());
        }
        return (find.matches("(.*)([aáoóuú])(.*)")) ? word + "nak" : (find.matches("(.*)([eéiíöőüű])(.*)")) ? word + "nek" : word;
    }

}
