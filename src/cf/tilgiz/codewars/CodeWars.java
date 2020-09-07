package cf.tilgiz.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CodeWars {
    public String encode(String text) {
        StringBuilder bits = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            String binaryIp = String.format("%8s", Integer.toBinaryString(text.charAt(i)))
                    .replace(' ', '0')
                    .replaceAll("0", "000")
                    .replaceAll("1", "111");
            bits.append(binaryIp);
        }
        return bits.toString();
    }

    public String decode(String bits) {
//        System.out.println(bits);
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < bits.length(); i = i + 24) {
            String octet = bits.substring(i, i + 24);
//            System.out.println(octet);
            StringBuilder binaryChar = new StringBuilder();
            for (int j = 0; j < octet.length(); j = j + 3) {
                String binaryCharGroup = octet.substring(j, j + 3);
//                System.out.println(binaryCharGroup);
                int sum = binaryCharGroup.chars().mapToObj(c -> String.valueOf((char) c)).mapToInt(Integer::valueOf).sum();
                binaryChar.append((sum >= 2)? "1" : "0");
//                System.out.println(binaryChar);

            }
//            System.out.println(binaryChar);
            word.append((char) Integer.parseInt(binaryChar.toString(),2));

        }

        return word.toString();
    }
}
