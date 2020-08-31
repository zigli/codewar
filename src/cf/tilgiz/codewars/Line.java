package cf.tilgiz.codewars;

import java.util.Arrays;

public class Line {
    public static String WhoIsNext(String[] names, int n) {
        System.out.println(n);
        System.out.println(Arrays.toString(names));

        int length = names.length;

        if (n <= length) return names[n - 1];
        else {
            int i = 0;
            while (n > 0) {
                System.out.println(n + " - " + (int)(length * Math.pow(2, i)) + " = " + (int)(n - length * Math.pow(2, i)) + ", i=" + i);
                n -= length * Math.pow(2, i);
                i++;
            }
            int cycle = i - 1;
            int cycleLength = (int) (length * Math.pow(2, cycle));
            System.out.println("Length of array is " + length + " and the " + cycle + " cycle length is " + cycleLength + " and order is: " + n);

            int remainder = cycleLength - 1 + n;
            int orderInCycle = 0;
            System.out.println("cycleLength=" + cycleLength + " orderInCycle=" + orderInCycle);
            while (remainder >= (int) (Math.pow(2, cycle)) * (int) Math.pow(length, 0)) {
                remainder -= (int) (Math.pow(2, cycle)) * (int) Math.pow(length, 0);
                orderInCycle++;
                System.out.println("cycleLength=" + cycleLength + " orderInCycle=" + orderInCycle);
            }
            System.out.println(orderInCycle);
            return names[orderInCycle];
        }
    }
}
