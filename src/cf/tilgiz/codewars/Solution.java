package cf.tilgiz.codewars;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static String passwordCracker(String hash) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String code = null;
        boolean next0 = false;
        boolean next1 = false;
        boolean next2 = false;
        boolean next3 = false;
        for (int i0 = 0; i0 < alphabet.length; i0++) {
            code = "" + alphabet[i0];
//            System.out.println(code);
            if (!next0 && hash.equals(getSha1(code))) return code;
            if (!next0 && i0 == alphabet.length - 1) {
//                System.out.println("11111111111111111111111111111111111111111111111111");
                next0 = true;
                i0 = 0;
            }
            if (next0) {
                for (int i1 = 0; i1 < alphabet.length; i1++) {
                    code = "" + alphabet[i0] + alphabet[i1];
//                    if (!next1) System.out.println(code);
                    if (!next1 && hash.equals(getSha1(code))) return code;
                    if (!next1 && i0 == alphabet.length - 1 && i1 == alphabet.length - 1) {
//                        System.out.println("222222222222222222222222222222222222222222222");
                        next1 = true;
                        i0 = i1 = 0;
                    }
                    if (next1) {
                        for (int i2 = 0; i2 < alphabet.length; i2++) {
                            code = "" + alphabet[i0] + alphabet[i1] + alphabet[i2];
//                            if (!next2) System.out.println(code);
                            if (!next2 && hash.equals(getSha1(code))) return code;
                            if (!next2 && i0 == alphabet.length - 1 && i1 == alphabet.length - 1 && i2 == alphabet.length - 1) {
//                                System.out.println("33333333333333333333333333333333333333333333");
                                next2 = true;
                                i0 = i1 = i2 = 0;
                            }
                            if (next2) {
                                for (int i3 = 0; i3 < alphabet.length; i3++) {
                                    code = "" + alphabet[i0] + alphabet[i1] + alphabet[i2] + alphabet[i3];
//                                    if (!next3) System.out.println(code);
                                    if (!next3 && hash.equals(getSha1(code))) return code;
                                    if (!next3 && i0 == alphabet.length - 1 && i1 == alphabet.length - 1 && i2 == alphabet.length - 1 && i3 == alphabet.length - 1) {
//                                        System.out.println("444444444444444444444444444444444444444444444");
                                        next3 = true;
                                        i0 = i1 = i2 = i3 = 0;
                                    }
                                    if (next3) {
                                        for (int i4 = 0; i4 < alphabet.length; i4++) {
                                            code = "" + alphabet[i0] + alphabet[i1] + alphabet[i2] + alphabet[i3] + alphabet[i4];
//                                            System.out.println(code);
                                            if (hash.equals(getSha1(code))) return code;
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
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
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
//            System.out.println(no);
            String hashtext = no.toString(16);
//            while (hashtext.length() < 32) {
//                hashtext = "0" + hashtext;
//            }
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
            }
            else {
                if(temp.contains("Right on")) arr[i] = arr[i].replaceAll("(.*) on", "Left on");
                if(temp.contains("Left on")) arr[i] = arr[i].replaceAll("(.*) on", "Right on");
            }
        }
        return arr;
    }


    public int[] splitByValue(int k, int[] elements) {
        ArrayList<Integer> lt = new ArrayList<>();
        ArrayList<Integer> gt = new ArrayList<>();
        for (int item: elements ) {
            if (item < k) lt.add(item);
            else gt.add(item);
        }
        lt.addAll(gt);
        int[] array = lt.stream().mapToInt(i->i).toArray();
        return array;
    }
}
