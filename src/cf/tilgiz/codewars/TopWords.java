package cf.tilgiz.codewars;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class TopWords {
    public static List<String> top3(String s) {
        HashMap<String, Integer> count = new HashMap<>();
        s = s.toLowerCase().trim().replaceAll("[\\.\\,\\/\\n]", "").replaceAll("^\\'+","").replaceAll("[;-_!]"," ").trim();
        System.out.println(s);
        String[] s1 = s.split("\\s+");
        for (int i = 0; i < s1.length; i++) {
            if(count.containsKey(s1[i]))  count.put(s1[i], count.get(s1[i]) + 1);
            else count.put(s1[i], 1);

        }
        // Your code here
        System.out.println(count);

//        Map<String, Integer> sorted = count
//                .entrySet()
//                .stream()
////                .sorted(comparingByValue())
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                .collect(
//                        toMap(e -> e.getKey(), e -> e.getValue(),
//                                (e1, e2) -> e2, LinkedHashMap::new));

//        System.out.println(sorted);

//        String[] stringArray = sorted.keySet().stream().limit(3).toArray(String[]::new);
//        System.out.println(Arrays.toString(stringArray));
//        Arrays.stream(stringArray).forEach(System.out::println);


        Map<String, Integer> hm1 = sortByValue(count);

        System.out.println(hm1);

        List<String> result = new ArrayList<>();

        int i = 0;
        for (Map.Entry<String, Integer> entry : hm1.entrySet()) {
            if (i >2) break;
            String key = entry.getKey();
            result.add(key);
            i++;
        }

        String[] res = new String[result.size()];
        for (int j = 0; j < res.length; j++) {
            res[j] = result.get(j);
        }
        return Arrays.asList(res);
    }

    public static LinkedHashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
        Collections.sort(list, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));
        LinkedHashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
