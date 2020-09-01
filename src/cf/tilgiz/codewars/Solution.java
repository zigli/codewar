package cf.tilgiz.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

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

}
