package cf.tilgiz.codewars;

import java.util.Arrays;

/**
 * @author Ilgiz Tukhvatov
 */
public class CasinoChips {
    public static int solve(int[] arr) {
        System.out.println(Arrays.toString(arr));

        int maxIndex, secondMaxIndex, count = 0;
//        int maxIndex = (arr[0] > arr[1]) ? (arr[0] > arr[2]) ? 0 : 2 : (arr[1] > arr[2]) ? 1 : 2;
//        int secondMaxIndex = (maxIndex == 0) ? (arr[1] > arr[2]) ? 1 : 2 : (maxIndex == 1) ? (arr[0] > arr[2]) ? 0 : 2 : (arr[0] > arr[1]) ? 0 : 1;

        while (true) {
//            System.out.println(arr[0]);
            maxIndex = getIndexOfMaxValue(arr, -1);
//            System.out.println("maxIndex: " + maxIndex + ", value is: " + arr[maxIndex]);
            secondMaxIndex = getIndexOfMaxValue(arr, maxIndex);
//            System.out.println("secondMaxIndex: " + secondMaxIndex + ", value is: " + arr[secondMaxIndex]);
            arr[maxIndex]--;
            arr[secondMaxIndex]--;
            if(arr[0] == -1 || arr[1] == -1 || arr[2] == -1) break;
            count++;
            System.out.println("count: " + count + " => " + Arrays.toString(arr));
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        return count;
    }

    public static int getIndexOfMaxValue(int[] array, int skipIndex) {
        int maxAt = (array.length + 1 - skipIndex) % 2;
        for (int i = 0; i < array.length; i++) {
            if (skipIndex != i) maxAt = array[i] > array[maxAt] ? i : maxAt;
        }
        return maxAt;
    }
}
