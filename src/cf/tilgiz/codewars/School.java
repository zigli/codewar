package cf.tilgiz.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ilgiz Tukhvatov
 */
public class School {
    public static int getAverage(int[] marks){
        List<Integer> intList = new ArrayList<Integer>(marks.length);
        for (int i : marks) intList.add(i);
        return intList.stream().mapToInt(Integer::intValue).sum()/marks.length;
    }

}
