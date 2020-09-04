package cf.tilgiz.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Crypto {
    public static String wordPattern(final String word) {
        String s = word.toLowerCase();
//        int index = 0;
        HashMap<String,Integer> hashMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            hashMap.computeIfAbsent(String.valueOf(s.charAt(i)), value -> hashMap.size());
//            if(!hashMap.containsKey(String.valueOf(s.charAt(i)))) hashMap.put(String.valueOf(s.charAt(i)),index++);
            stringBuilder.append(hashMap.get(String.valueOf(s.charAt(i))));
            if(i < s.length() - 1) stringBuilder.append(".");
        }
        return stringBuilder.toString();

//        HashMap<Integer,Integer> h = new HashMap();
//        String[] arr = word.toLowerCase().chars()
//                .mapToObj(c -> "" + h.computeIfAbsent(c, k -> h.size()))
//                .toArray(String[]::new);
//        return String.join(".", arr);
    }
}
