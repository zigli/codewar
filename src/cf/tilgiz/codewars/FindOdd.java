package cf.tilgiz.codewars;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindOdd {
    public static int findIt(int[] a) {
        StringBuilder builder = new StringBuilder();
        IntStream.range(0, a.length)
                .boxed()
                .collect(Collectors.groupingBy(i -> a[i], Collectors.toList()))
                .forEach((k, v) -> {
//            if (v.size() % 2 != 0 ) System.out.println(k + " " + v.size());
                    if (v.size() % 2 != 0) builder.append(k);
                });

        return Integer.parseInt(builder.toString());

//        return Arrays.stream(a)
//                .boxed()
//                .collect(Collectors.groupingBy(Function.identity()))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue().size() % 2 == 1)
//                .mapToInt(e -> e.getKey())
//                .findFirst()
//                .getAsInt();
    }
}
