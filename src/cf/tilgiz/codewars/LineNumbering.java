package cf.tilgiz.codewars;

import java.util.ArrayList;
import java.util.List;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            stringList.add((i + 1) + ": " + lines.get(i));
        }
        return stringList;
    }
}
