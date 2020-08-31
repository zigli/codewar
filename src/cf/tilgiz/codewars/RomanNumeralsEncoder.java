package cf.tilgiz.codewars;

import java.util.HashMap;

public class RomanNumeralsEncoder {
    public String solution(int n) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "I");
        hashMap.put(5, "V");
        hashMap.put(10, "X");
        hashMap.put(50, "L");
        hashMap.put(100, "C");
        hashMap.put(500, "D");
        hashMap.put(1000, "M");

        StringBuilder stringBuilder = new StringBuilder();
        int count = String.valueOf(n).length();
        for (int countN = count; countN > 0; countN--) {
            if (countN > 3) {
                for (int i = 0; i < n / 1000; i++) {
                    stringBuilder.append(hashMap.get(1000));
                }
            } else {
                int i1 = (int) (n % Math.pow(10, countN) / Math.pow(10, countN - 1));
                System.out.println(i1);
                if ((i1 > 0 && i1 < 4) || (i1 > 5 && i1 < 9)) {
                    if (i1 > 5) {
                        stringBuilder.append(hashMap.get((int) Math.pow(10, countN - 1) * 5));
                        for (int i = 0; i < i1 - 5; i++) {
                            stringBuilder.append(hashMap.get((int) Math.pow(10, countN - 1)));
                        }
                    } else {
                        for (int i = 0; i < i1; i++) {
                            stringBuilder.append(hashMap.get((int) Math.pow(10, countN - 1)));
                        }
                    }
                } else if (i1 == 5) stringBuilder.append(hashMap.get((int) Math.pow(10, countN - 1) * 5));
                else if (i1 == 9 || i1 == 4) {
                    if (i1 == 4)
                        stringBuilder.append(hashMap.get((int) Math.pow(10, countN - 1))).append(hashMap.get((int) Math.pow(10, countN - 1) * 5));
                    if (i1 == 9) {
                        System.out.println("hre");
                        stringBuilder.append(hashMap.get((int) Math.pow(10, countN - 1))).append(hashMap.get((int) Math.pow(10, countN)));
                    }
                }
            }
            System.out.println("==========");
        }
        return stringBuilder.toString();
    }
}
