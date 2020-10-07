package cf.tilgiz.codewars;

/**
 * @author tilgiz
 * 07.10.2020 22:01
 */
public class FindOutlier {
    static int find(int[] integers) {
        int sum3 = Math.abs(integers[0] % 2) + Math.abs(integers[1] % 2) + Math.abs(integers[2] % 2);
        int paritySearch = (sum3 <= 1) ? 1 : 0;
        for (int i = 0; i < integers.length; i++) {
            if (Math.abs(integers[i] % 2) == paritySearch) return integers[i];
        }
        return 0;

//        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
//        int mod = (sum == 0 || sum == 1) ? 1 : 0;
//
//        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
//                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }
}
