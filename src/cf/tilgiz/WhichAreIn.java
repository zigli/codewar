package cf.tilgiz;

import java.util.*;

/**
 * @author Ilgiz Tukhvatov
 */
public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        SortedSet<String> set = new TreeSet<>();
        for (String value : array1) {
            for (String s : array2) {
                if (s.contains(value)) {
                    set.add(value);
                }
            }
        }
        return set.toArray(new String[0]);

//        return Arrays.stream(array1)
//                .filter(str ->  Arrays.stream(array2).anyMatch(s -> s.contains(str)))
//                .distinct()
//                .sorted()
//                .toArray(String[]::new);
    }
}
