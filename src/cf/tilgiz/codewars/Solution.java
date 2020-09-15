package cf.tilgiz.codewars;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * @author Ilgiz Tukhvatov
 */
public class Solution {
    public static String isSortedAndHow(int[] array) {
        boolean resultNO = false, resultASC = false, resultDES = false;
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i + 1] - array[i] == 0 && !resultDES) || (array[i + 1] - array[i] > 0 && resultDES) || (array[i + 1] - array[i] < 0 && resultASC)) {
                resultNO = true;
                break;
            } else if (array[i + 1] - array[i] > 0 && !resultDES) resultASC = true;
            else if (array[i + 1] - array[i] < 0 && !resultASC) resultDES = true;
        }
        return (resultNO) ? "no" : (resultASC) ? "yes, ascending" : "yes, descending";
    }

    static String toCamelCase(String s) {
        String[] split = s.split("[_-]");
        String[] newstr = new String[split.length];
        if (split.length > 1) {
            for (int i = 1; i < split.length; i++) {
                newstr[i] = capitalize(split[i]);
            }
            if ((int) split[0].charAt(0) >= 65 && (int) split[0].charAt(0) <= 90) newstr[0] = capitalize(split[0]);
            else newstr[0] = split[0];
            return String.join("", newstr);
        } else return s;
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }


    public static String whoLikesIt(String... names) {
        if (names.length == 0) return "no one likes this";
        else if (names.length == 1) return names[0] + " likes this";
        else if (names.length == 2) return names[0] + " and " + names[1] + " like this";
        else if (names.length == 3) return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        else if (names.length > 3)
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        return null;
    }

    public static String dashatize(int num) {
//        String s = String.valueOf(num).replaceAll("-", "");
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) % 2 == 1) builder.append("-" + s.charAt(i) + "-");
//            else builder.append(s.charAt(i));
//        }
//        return builder.toString().replaceAll("[-]+", "-").replaceAll("^-|-$","");
        return String.valueOf(num).replaceAll("-", "").replaceAll("([13579])", "-$1-").replaceAll("[-]+", "-").replaceAll("^-|-$", "");
    }

    public static String[] capitalizeOddEven(String s) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i)).toUpperCase();
            if (i % 2 == 1) {
                odd.append(str);
                even.append(s.charAt(i));
            } else {
                even.append(str);
                odd.append(s.charAt(i));
            }
        }
        return new String[]{even.toString(), odd.toString()};
    }


    public static String rangeExtraction(int[] arr) {
        StringBuilder builder = new StringBuilder();
        HashMap<Integer, ArrayList<Integer>> arrayListHashMap = new HashMap<>();
        ArrayList<Integer> range = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
//            System.out.print("iteration:" + i + ", Number is: " + arr[i]);
            range = new ArrayList<>(range);
            if (i == (arr.length - 1)) {
                if ((arr[i] - 1) == arr[i - 1]) {
//                    System.out.println("heee");
                    range.add(arr[i]);
                    arrayListHashMap.put(index, range);
//                    System.out.println(range);
//                    System.out.println(arrayListHashMap);
                } else {
//                    System.out.println(" No = index: " + index);
                    range.add(arr[i]);
                    arrayListHashMap.put(index, range);
                    range = new ArrayList<>();
//                    System.out.println(range);
//                    System.out.println(arrayListHashMap);
                }
            } else {
                if ((arr[i] + 1) == arr[i + 1]) {
//                    System.out.println(" Yes = index: " + index);
                    range.add(arr[i]);
//                    System.out.println(range);
//                    System.out.println(arrayListHashMap);
                } else {
//                    System.out.println(" No = index: " + index);
                    range.add(arr[i]);
                    arrayListHashMap.put(index, range);
                    range = new ArrayList<>();
//                    System.out.println(range);
//                    System.out.println(arrayListHashMap);
                    index++;
                }
            }
//            System.out.println(range);
//            System.out.println(arrayListHashMap);
//            System.out.println("===================================");

        }
//        System.out.println(arrayListHashMap);
//        System.out.println(Arrays.toString(arrayListHashMap.values().toArray()));

        StringBuilder stringBuilder = new StringBuilder();
//        Integer[] ints = arrayListHashMap.values().toArray(new Integer[arrayListHashMap.size()]);
//        for (Integer it: ints ) {
//            System.out.println(it.toString());
//        }
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
////            if(ints[i])
//        }

        for (HashMap.Entry<Integer, ArrayList<Integer>> entry : arrayListHashMap.entrySet()) {
            //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if (entry.getValue().size() > 2)
                stringBuilder.append(",").append(entry.getValue().get(0)).append("-").append(entry.getValue().get(entry.getValue().size() - 1));
            else {
                for (int i = 0; i < entry.getValue().size(); i++) {
                    stringBuilder.append(",").append(entry.getValue().get(i));
                }
            }
        }
        return stringBuilder.toString().replaceAll("^,", "");
    }

    public static int areaOrPerimeter(int l, int w) {
        return (l == w) ? l * l : 2 * (l + w);
    }

    public static String repeatStr(final int repeat, final String string) {
        return (repeat == 0) ? "" : String.format("%" + (repeat + string.length() - 1) + "s", string).replaceAll(" ", string.replaceAll("\\$", "\\\\\\\\\\\\\\$")).replace("\\", "");
    }


    public static MessageDigest digest = null;

    public static String passwordCracker0(String hash) {
        String out = null;
        try {
            out = new Cracker(1, 5,hash).doWork();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return (out == null)? "" : out;
    }

    public static String passwordCracker(String hash) {
        System.out.println(hash);
        byte[] hexStringToByteArray = hexStringToByteArray(hash);
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String code = null;
        boolean next0 = false;
        boolean next1 = false;
        boolean next2 = false;
        boolean next3 = false;
        for (int i0 = 0; i0 < alphabet.length; i0++) {
            code = "" + alphabet[i0];
//            System.out.println(code);
            if (!next0 && Arrays.equals(digest.digest(code.getBytes()), hexStringToByteArray)) return code;
            if (!next0 && i0 == alphabet.length - 1) {
//                System.out.println("11111111111111111111111111111111111111111111");
                next0 = true;
                i0 = 0;
            }
            if (next0) {
                for (int i1 = 0; i1 < alphabet.length; i1++) {
                    code = "" + alphabet[i0] + alphabet[i1];
//                    if (!next1) System.out.println(code);
                    if (!next1 && Arrays.equals(digest.digest(code.getBytes()), hexStringToByteArray)) return code;
                    if (!next1 && i0 == alphabet.length - 1 && i1 == alphabet.length - 1) {
//                        System.out.println("222222222222222222222222222222222222222222222");
                        next1 = true;
                        i0 = i1 = 0;
                    }
                    if (next1) {
                        for (int i2 = 0; i2 < alphabet.length; i2++) {
                            code = "" + alphabet[i0] + alphabet[i1] + alphabet[i2];
//                            if (!next2) System.out.println(code + " = " + getSha1(code));
                            if (!next2 && Arrays.equals(digest.digest(code.getBytes()), hexStringToByteArray)) return code;
                            if (!next2 && i0 == alphabet.length - 1 && i1 == alphabet.length - 1 && i2 == alphabet.length - 1) {
//                                System.out.println("33333333333333333333333333333333333333333333");
                                next2 = true;
                                i0 = i1 = i2 = 0;
                            }
                            if (next2) {
                                for (int i3 = 0; i3 < alphabet.length; i3++) {
                                    code = "" + alphabet[i0] + alphabet[i1] + alphabet[i2] + alphabet[i3];
//                                    if (!next3) System.out.println(code);
                                    if (!next3 && Arrays.equals(digest.digest(code.getBytes()), hexStringToByteArray)) return code;
                                    if (!next3 && i0 == alphabet.length - 1 && i1 == alphabet.length - 1 && i2 == alphabet.length - 1 && i3 == alphabet.length - 1) {
//                                        System.out.println("444444444444444444444444444444444444444444444");
                                        next3 = true;
                                        i0 = i1 = i2 = i3 = 0;
                                    }
                                    if (next3) {
                                        for (int i4 = 0; i4 < alphabet.length; i4++) {
                                            code = "" + alphabet[i0] + alphabet[i1] + alphabet[i2] + alphabet[i3] + alphabet[i4];
//                                            System.out.println(code);
                                            if (Arrays.equals(digest.digest(code.getBytes()), hexStringToByteArray)) return code;
                                            else code = "";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return code;
    }

    public static String passwordCracker1(String hash) {
//        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] alphabet = "azbycxdwevfugthsirjqkplomn".toCharArray();
        String code = null;
        for (int i0 = 0; i0 < alphabet.length; i0++) {
            code = "" + alphabet[i0];
            if (hash.equals(getSha1(code))) return code;
        }
        for (int i0 = 0; i0 < alphabet.length; i0++) {
            for (int i1 = 0; i1 < alphabet.length; i1++) {
                code = "" + alphabet[i0] + alphabet[i1];
                if (hash.equals(getSha1(code))) return code;
            }
        }
        for (int i0 = 0; i0 < alphabet.length; i0++) {
            for (int i1 = 0; i1 < alphabet.length; i1++) {
                for (int i2 = 0; i2 < alphabet.length; i2++) {
                    code = "" + alphabet[i0] + alphabet[i1] + alphabet[i2];
                    if (hash.equals(getSha1(code))) return code;
                }
            }
        }
        for (int i0 = 0; i0 < alphabet.length; i0++) {
            for (int i1 = 0; i1 < alphabet.length; i1++) {
                for (int i2 = 0; i2 < alphabet.length; i2++) {
                    for (int i3 = 0; i3 < alphabet.length; i3++) {
                        code = "" + alphabet[i0] + alphabet[i1] + alphabet[i2] + alphabet[i3];
                        if (hash.equals(getSha1(code))) return code;
                    }
                }
            }
        }
        for (int i0 = 0; i0 < alphabet.length; i0++) {
            for (int i1 = 0; i1 < alphabet.length; i1++) {
                for (int i2 = 0; i2 < alphabet.length; i2++) {
                    for (int i3 = 0; i3 < alphabet.length; i3++) {
                        for (int i4 = 0; i4 < alphabet.length; i4++) {
                            code = "" + alphabet[i0] + alphabet[i1] + alphabet[i2] + alphabet[i3] + alphabet[i4];
                            if (hash.equals(getSha1(code))) return code;
                        }
                    }
                }
            }
        }
        return code;
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }

    public static String getSha12(String value) {
        try {
            digest = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        digest.reset();
        digest.update(value.getBytes(StandardCharsets.UTF_8));
        String sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
//        String sha1 = String.format("%040x", new BigInteger(1, digest.digest(value.getBytes(StandardCharsets.UTF_8))));
        return sha1;
    }

    public static String getSha1(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 40) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] getSha1Bytes(String value) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        digest.reset();
        digest.update(value.getBytes(StandardCharsets.UTF_8));
        return digest.digest();
    }

    public static String getSha1_(String convertme) {
        try {
            digest = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return Base64.getEncoder().encodeToString((digest.digest(convertme.getBytes(StandardCharsets.UTF_8))));
    }


    public static String solve(String eq) {
        String[] split = eq.split("[/\\-*+]");
        ArrayList<String> arrayList = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < split.length; i++) {
            arrayList.add(split[i]);
            int itemPosition = eq.indexOf(split[i], index);
            int itemLength = split[i].length();
            if (i < split.length - 1) {
                arrayList.add(eq.substring(itemPosition + split[i].length(), itemPosition + itemLength + 1));
                index = index + itemLength + 1;
            }
        }
        Collections.reverse(arrayList);
        return String.join("", arrayList);

    }

    public static String[] solve(String[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
        String tempItem = "";
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            Pattern pattern = Pattern.compile("(.*) on");
            Matcher matcher = pattern.matcher(tempItem);
            if (matcher.find()) {
                temp = matcher.group(0);
            }
            tempItem = arr[i];
            if (i == 0) {
                arr[i] = arr[i].replaceAll("(.*) on", "Begin on");
            } else {
                if (temp.contains("Right on")) arr[i] = arr[i].replaceAll("(.*) on", "Left on");
                if (temp.contains("Left on")) arr[i] = arr[i].replaceAll("(.*) on", "Right on");
            }
        }
        return arr;
    }


    public int[] splitByValue(int k, int[] elements) {
        ArrayList<Integer> lt = new ArrayList<>();
        ArrayList<Integer> gt = new ArrayList<>();
        for (int item : elements) {
            if (item < k) lt.add(item);
            else gt.add(item);
        }
        lt.addAll(gt);
        int[] array = lt.stream().mapToInt(i -> i).toArray();
        return array;
    }

    public static String solveReverse(String s) {
//        System.out.println(s);
//        System.out.println();
/*
        HashMap<Integer,Integer> hashMap = new LinkedHashMap<>();
        String[] split = s.split(" ");
        int index = 0;
        for (int i = 0; i < split.length; i++) {
//            System.out.println(split[i]);
//            int start = s.replaceAll(" ", "").indexOf(split[i],index);
//            int stop = s.replaceAll(" ", "").indexOf(split[i],index) + split[i].length();
            hashMap.put(s.replaceAll(" ", "").indexOf(split[i],index),s.replaceAll(" ", "").indexOf(split[i],index) + split[i].length());
            index = s.replaceAll(" ", "").indexOf(split[i],index) + split[i].length();
        }
        StringBuilder reverse = new StringBuilder(s.replaceAll(" ", "")).reverse();
        StringJoiner joiner = new StringJoiner(" ");
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
//            System.out.println(reverse.substring(entry.getKey(), entry.getValue()));
            joiner.add(reverse.substring(entry.getKey(), entry.getValue()));
        }
//        System.out.println(hashMap);
        return joiner.toString();
*/

        StringBuilder str = new StringBuilder(s.replaceAll(" ", "")).reverse();
        IntStream.range(0, s.length())
                .filter(i -> s.charAt(i) == ' ')
//                .forEach(j -> System.out.println(j));
                .forEach(j -> str.insert(j, ' '));
        return str.toString();
    }

    public static int solve(long n) {
        long count = 0, last = 0;
        long cycle = 0;
        for (long i = 1; count < n; i++, cycle++) {
            last = count;
            for (long j = 1; j <= i; j++) {
                count = count + String.valueOf(j).length();
//                count = count + 1;
//                System.out.print(j);
            }

//            System.out.print("");
        }
//        System.out.println();
//        System.out.println("cycle:" + cycle);
        System.out.println("n:" + n);
        System.out.println("count:" + count);
        System.out.println("last:" + last);
        System.out.println("n - last => " + n + "-" + last + "=" + (n - last));
        long number = n - (last);
        if (cycle < 10) {
            return (int) number;
        } else {
//            int newnum = number - 1;
//            System.out.println(newnum);
            return nthNumber(number);
        }
    }

    public static int solve1(long n) {
        System.out.println("n:" + n);
        long i = 1, icount = 0, last = 0, num = 0;
        int temp = 1;
        while (num < n) {
            int len = String.valueOf(i).length();
            if (temp != len)
                System.out.println("len = " + (len - 1) + "; i = " + i + "; icount = " + icount + "; num = " + num);
            icount += len;
            num += icount;
//            System.out.println("len = " + len + "; i = " + i + "; icount = " + icount + "; num = " + num);
//            if(temp != len) System.out.println("len = " + len + "; i = " + i + "; icount = " + icount + "; num = " + num);
            i++;
            temp = len;
        }
        System.out.println("i = " + i + "; icount = " + icount + "; num = " + num);
        last = num - icount;
        System.out.println("last = num - icount:" + num + " - " + icount + " => " + last);
        System.out.println("n - last => " + n + "-" + last + "=" + (n - last));
        System.out.println(num);
        return nthNumber(n - last);
//        return 1;
    }
// 3 digits
//    2889=192+(n-1)*3
//    n = (2889-192)/3 + 1
//    Sn=n/2(2a1+(n-1)d)

//    4 digits
//    38889=2893+(n-1)*4
//    n=(38889-2893)/4+1
//    Sn=n(a1+an)/2

    public static int nthNumber(long n) {
//        System.out.println(n);
        int l = 0;
        long num = 0;
        while (num < n) {
//            System.out.println(l);
            num = (long) ((9 * (l + 1) * Math.pow(10, l) - Math.pow(10, l + 1) + 1) / 9);
//            System.out.println(num);
            l++;
//            System.out.println("========");
        }
        --l;
//        System.out.println(num);
//        System.out.println("l=" + l);
        long i = (long) (Math.pow(10, l) - 1 - Math.floor((num - n) / l));
//        System.out.println(i);
        long l1 = (long) (num - n) % l;
//        System.out.println(l1);
        int pos = (int) (String.valueOf(i).length() - 1 - l1);
        return Integer.parseInt(String.valueOf(String.valueOf(i).charAt(pos)));
    }

    public static int nthNumber100(int n) {
        int sum = 0, num = 0;
        do {
            num += 1;
            sum += String.valueOf(num).length();
        } while (n > sum);
//        System.out.println("n:" + n);
//        System.out.println("num:" + num);
//        System.out.println("sum:" + sum);
        String numStr = String.valueOf(num);
        int pos = n - (sum - numStr.length()) - 1;
        int dig = Integer.parseInt(String.valueOf(numStr.charAt(pos)));
        return dig;
    }

    public static int[] nameValue(String[] arr) {
        int[] out = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll(" ", "");
            int count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                count += (int) arr[i].charAt(j) - 96;
//                System.out.println(i1);
            }
//            System.out.println(count);
            out[i] = (i + 1) * count;
        }
        return out;


//        int[] result = new int[arr.length];
//        for (int i = 0; i < arr.length; i++){
//            result[i] = arr[i].chars().filter(e -> e != ' ').map(e -> e - 96).sum() * (i+1);
//        }
//        return result;

//        return rangeClosed(1, arr.length).map(i -> i * arr[i - 1].chars().reduce(0, (s, c) -> s + Math.max(c - 96, 0))).toArray();

    }
}
