package cf.tilgiz.codewars;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toMap;

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
            out = new Cracker(1, 5, hash).doWork();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return (out == null) ? "" : out;
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
                            if (!next2 && Arrays.equals(digest.digest(code.getBytes()), hexStringToByteArray))
                                return code;
                            if (!next2 && i0 == alphabet.length - 1 && i1 == alphabet.length - 1 && i2 == alphabet.length - 1) {
//                                System.out.println("33333333333333333333333333333333333333333333");
                                next2 = true;
                                i0 = i1 = i2 = 0;
                            }
                            if (next2) {
                                for (int i3 = 0; i3 < alphabet.length; i3++) {
                                    code = "" + alphabet[i0] + alphabet[i1] + alphabet[i2] + alphabet[i3];
//                                    if (!next3) System.out.println(code);
                                    if (!next3 && Arrays.equals(digest.digest(code.getBytes()), hexStringToByteArray))
                                        return code;
                                    if (!next3 && i0 == alphabet.length - 1 && i1 == alphabet.length - 1 && i2 == alphabet.length - 1 && i3 == alphabet.length - 1) {
//                                        System.out.println("444444444444444444444444444444444444444444444");
                                        next3 = true;
                                        i0 = i1 = i2 = i3 = 0;
                                    }
                                    if (next3) {
                                        for (int i4 = 0; i4 < alphabet.length; i4++) {
                                            code = "" + alphabet[i0] + alphabet[i1] + alphabet[i2] + alphabet[i3] + alphabet[i4];
//                                            System.out.println(code);
                                            if (Arrays.equals(digest.digest(code.getBytes()), hexStringToByteArray))
                                                return code;
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
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
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
        long l1 = (num - n) % l;
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

    public static String[] solve(int a, int b) {
        int extWeekends = 0;
        String first = null;
        String last = null;
        Calendar calendar = new GregorianCalendar();
        for (int i = a; i <= b; i++) {
//            System.out.println(i);
            calendar.set(Calendar.YEAR, i);
            for (int j = 0; j < 12; j++) {
                calendar.set(Calendar.MONTH, j);
                calendar.set(Calendar.DAY_OF_MONTH, 1);
                int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                if (daysInMonth == 31 && dayOfWeek == 6) {
                    LocalDate localDate = LocalDateTime.ofInstant(calendar.toInstant(), calendar.getTimeZone().toZoneId()).toLocalDate();
                    if (first == null) first = localDate.getMonth().toString();
                    last = localDate.getMonth().toString();
//                    System.out.println("Month is: " + localDate.getMonth());
//                    System.out.println("Days in month: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
//                    System.out.println("Day of week: " + calendar.get(Calendar.DAY_OF_WEEK));
                    extWeekends++;
                }
            }
//            System.out.println("=================");
        }
//        System.out.println(extWeekends);

        return new String[]{first, last, String.valueOf(extWeekends)};
    }

    public static String[] dup(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = 0;
            while (arr[i].length() > index) {
                char c = arr[i].charAt(index);
                arr[i] = arr[i].replaceAll("[" + c + "]+", String.valueOf(c));
//                System.out.println(s);
                index++;
            }
            arr[i] = arr[i];
        }
        return arr;

//        for(int i = 0; i < arr.length; i++)
//            arr[i] = arr[i].replaceAll("(.)\\1+", "$1");
//        return arr;
    }

    public static Object[] longestRepetition(String s) {
        System.out.println(s);
        if (s.isEmpty()) return new Object[]{"", 0};
        Map<String, Integer> characterList = new LinkedHashMap<>();
        String temp = String.valueOf(s.charAt(0));
        int start = 0, stop = 0;
        for (int i = 1; i < s.length(); i++) {
            if (!temp.equals(String.valueOf(s.charAt(i)))) {
                characterList.put(s.substring(start, stop + 1), s.substring(start, stop + 1).length());
//                System.out.println("===> " + s.substring(start, stop + 1));
                start = s.indexOf(s.charAt(i), stop + 1);
            }
            stop++;
            temp = String.valueOf(s.charAt(i));
//            System.out.println(start + " " + stop);
        }
        characterList.put(s.substring(start, stop + 1), s.substring(start, stop + 1).length());
//        System.out.println(s.substring(start, stop + 1));

        System.out.println(characterList);
        Map<String, Integer> sorted = characterList
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(),
                                (e1, e2) -> e2, LinkedHashMap::new));

//        System.out.println(sorted);
        if (sorted.isEmpty()) return new Object[]{"", 0};
        else {
            Map.Entry<String, Integer> entry = sorted.entrySet().iterator().next();
            return new Object[]{String.valueOf(entry.getKey().charAt(0)), entry.getValue()};
        }

//        Pattern PATTERN = Pattern.compile("(.)(\\1*)");
//        Object[] result = new Object[]{"", 0};
//        Matcher matcher = PATTERN.matcher(s);
//        while (matcher.find()) {
//            if (matcher.group().length() > (int) result[1]) {
//                result[0] = matcher.group().substring(0, 1);
//                result[1] = matcher.group().length();
//            }
//        }
//        return result;


//        char lastch = '\0';
//        Object ret[] = new Object[]{"", 0};
//        int n = 0, max = 0;
//        for (char c : s.toCharArray()) {
//            n = lastch == c ? ++n : 1;
//            if (n > max) { ret = new Object[]{""+c,n}; max = n; }
//            lastch = c;
//        }
//        return ret;

    }

    public static int solve1(String s) {
        Pattern PATTERN = Pattern.compile("(\\d)+");
        int max = 0;
        Matcher matcher = PATTERN.matcher(s);
        while (matcher.find()) {
            max = Math.max(max, Integer.parseInt(matcher.group()));
        }
        return max;

//        return Arrays.asList(s.split("[a-z]+")).stream().filter(e-> !e.isEmpty()).mapToInt(Integer::parseInt).max().getAsInt();
    }

    public static int solve(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - (arr.length % 2); i += 2) {
            if (Math.abs(Math.abs(arr[i]) - Math.abs(arr[i + 1])) == 1 && (arr[i] + arr[i + 1] == 2 * Math.max(arr[i], arr[i + 1]) - 1)) {
                count++;
            }
        }
        return count;

//        int c = 0;
//        for (int i = 1; i < arr.length; i+=2)
//            if (Math.abs(arr[i] - arr[i-1]) == 1) c++;
//        return c;
    }


    public static long solvePrime(long n) {
        int i = 0;
        long cNumLeft = 0;
        long cNumRight = 0;
        while (true) {
            cNumLeft = n - i;
            cNumRight = n + i;
            System.out.println(i + " => " + cNumLeft);
            System.out.println(i + " => " + cNumRight);
            if (checkPrime(cNumLeft)) return cNumLeft;
            if (checkPrime(cNumRight)) return cNumRight;
            i++;
        }
    }

    public static boolean checkPrime(long n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0 && n != i) return false;
        }
        return true;
    }

    public static String binaryToText(String binary) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 8) {
            String binarySubstring = binary.substring(i, i + 8);
//            builder.append((char) Integer.parseInt(binarySubstring.toString(), 2));
            int sum = 0;
            for (int p = 0, j = binarySubstring.length() - 1; j >= 0; p++, j--) {
                sum += Integer.parseInt(String.valueOf(binarySubstring.charAt(j))) * (int) Math.pow(2, p);
            }
            builder.append((char) sum);
        }
        return builder.toString();
    }

    public static int[] sortByFrequency(int[] array) {
        int[] out = new int[array.length];
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i : array) {
            if (treeMap.containsKey(i)) treeMap.put(i, treeMap.get(i) + 1);
            else treeMap.put(i, 1);
        }

        Map<Integer, Integer> sorted = treeMap
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e2, LinkedHashMap::new));

        final int[] counter = {0};
        sorted.forEach((k, v) -> {
            for (int i = 0; i < v; i++, counter[0]++) {
                out[counter[0]] = k;
            }
        });
        return out;
    }

    public static String whatCentury(int year) {
        int number = (year % 100 == 0) ? year / 100 : year / 100 + 1;
        StringBuilder builder = new StringBuilder().append(number);
        if (number % 10 == 1 && number % 100 != 11) builder.append("st");
        else if (number % 10 == 2 && number % 100 != 12) builder.append("nd");
        else if (number % 10 == 3 && number % 100 != 13) builder.append("rd");
        else builder.append("th");
        return builder.toString();
    }

    public int solution(int number) {
        int sum = 0;
        number--;
        while (number > 0) {
            if (number % 5 == 0 || number % 3 == 0) sum += number;
            number--;
        }
        return sum;

//        return IntStream.range(3, number).filter(n -> n % 3 == 0 || n % 5 == 0).sum();
    }

    public static long solve(int n) {
        for (long p = 1; p < n; p++) {
            if (Math.sqrt(n + p * p) % 1 == 0) return p * p;
        }
        return -1;
    }

    public static String solveTimeDiff(String[] arr) {
//        if (arr.length == 1) return "23:59";
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int diff = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(arr[i].substring(0, 2)) * 60 + Integer.parseInt(arr[i].substring(3, 5));
            int bInd = i + 1, mult = 0;
            if (bInd == arr.length) {
                bInd = 0;
                mult = 1;
            }
            int b = Integer.parseInt(arr[bInd].substring(0, 2)) * 60 + Integer.parseInt(arr[bInd].substring(3, 5));
            diff = Math.max(Math.abs(1440 * mult + (b - a)) - 1, diff);
//            System.out.println("a " + a + " b " + b + " = " + (b - (a+1)) + " diff= " + diff);
        }
//        System.out.println(diff);
        return String.format("%02d:%02d", diff / 60 % 60, diff % 60);
    }

}
