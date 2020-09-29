package cf.tilgiz.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Ilgiz Tukhvatov
 */
public class CasinoChips {
    public static int solve(int[] arr, int chipNum) {
        if(chipNum <= 0 || chipNum >= arr.length) return -1;

        System.out.println(Arrays.toString(arr));

        int maxIndex, count = 0;
        ArrayList<Integer> maxIndexList = new ArrayList<>();

        while (true) {
            maxIndexList.clear();
            for (int i = 0; i < chipNum; i++) {
                maxIndex = getIndexOfMaxValue(arr, maxIndexList);
                maxIndexList.add(maxIndex);
            }
            maxIndexList.forEach(x -> arr[x]--);
            if(IntStream.of(arr).anyMatch(x -> x == -1)) break;
            count++;
            System.out.println("count: " + count + " => " + Arrays.toString(arr));
        }
        return count;
    }

    public static int getIndexOfMaxValue(int[] array, ArrayList<Integer> skipIndexList) {
        int maxAt = -1;
        for (int i = 0; i < array.length; i++) {
            if (!skipIndexList.contains(i)) maxAt = (maxAt == -1 || array[i] > array[maxAt]) ? i : maxAt;
        }
        return maxAt;
    }
}
