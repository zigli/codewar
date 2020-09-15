package cf.tilgiz.codewars;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toMap;

public class TopWords {
    public static List<String> top3(String s) {
//        System.out.println(s);
        s = s.toLowerCase().trim().replaceAll("[\\.\\,\\/\\n]", "").replaceAll("^\\'+", "").trim();
//        System.out.println(s);
        HashMap<String, Integer> count = new HashMap<>();
        String[] s1 = s.split("\\s+");
        Set<String> targetSet = new TreeSet<>(Arrays.asList(s1));

        for (String s2 : targetSet) {
            Pattern pattern = Pattern.compile("(" + s2 + ")");
            Matcher matcher = pattern.matcher(s);
            int cnt = 0;
            while (matcher.find()) {
                cnt++;
            }
            if (cnt > 0) count.put(s2, cnt);
        }

        if (count.isEmpty()) return new ArrayList<>();
//        System.out.println(count);

        Map<String, Integer> sorted = count
                .entrySet()
                .stream()
//                .sorted(comparingByValue())
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(),
                                (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println(sorted);

        String[] stringArray = sorted.keySet().stream().limit(3).toArray(String[]::new);
        return Arrays.asList(stringArray.clone());

    }

    public static List<String> top3_(String s) {


        HashMap<String, Integer> count = new HashMap<>();
        s = s.toLowerCase().trim().replaceAll("[\\.\\,\\/\\n]", "").replaceAll("^\\'+", "").replaceAll("[;-_!]", " ").trim();
        System.out.println(s);
        String[] s1 = s.split("\\s+");
        for (int i = 0; i < s1.length; i++) {
            if (count.containsKey(s1[i])) count.put(s1[i], count.get(s1[i]) + 1);
            else count.put(s1[i], 1);

        }
        // Your code here
        if (count.isEmpty()) return new ArrayList<>();
        System.out.println(count);

        Map<String, Integer> sorted = count
                .entrySet()
                .stream()
//                .sorted(comparingByValue())
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(),
                                (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println(sorted);

        String[] stringArray = sorted.keySet().stream().limit(3).toArray(String[]::new);
        return Arrays.asList(stringArray.clone());
//        System.out.println(Arrays.toString(stringArray));
//        Arrays.stream(stringArray).forEach(System.out::println);

//
//        Map<String, Integer> hm1 = sortByValue(count);
//        System.out.println(hm1);
//        List<String> result = new ArrayList<>();
//        int i = 0;
//        for (Map.Entry<String, Integer> entry : hm1.entrySet()) {
//            if (i >2) break;
//            String key = entry.getKey();
//            result.add(key);
//            i++;
//        }
//        String[] res = new String[result.size()];
//        for (int j = 0; j < res.length; j++) {
//            res[j] = result.get(j);
//        }
//        return Arrays.asList(res);

    }

    public static LinkedHashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());
        Collections.sort(list, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));
        LinkedHashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
