package cf.tilgiz.codewars;

import java.util.HashMap;

public class Parser {
    public static int parseInt(String numStr) {
        HashMap<String, Integer> digits = new HashMap<>();
        digits.put("zero", 0);
        digits.put("one", 1);
        digits.put("two", 2);
        digits.put("three", 3);
        digits.put("four", 4);
        digits.put("five", 5);
        digits.put("six", 6);
        digits.put("seven", 7);
        digits.put("eight", 8);
        digits.put("nine", 9);
        digits.put("ten", 10);
        digits.put("eleven", 11);
        digits.put("twelve", 12);
        digits.put("thirteen", 13);
        digits.put("fourteen", 14);
        digits.put("fifteen", 15);
        digits.put("sixteen", 16);
        digits.put("seventeen", 17);
        digits.put("eighteen", 18);
        digits.put("nineteen", 19);
        digits.put("twenty", 20);
        digits.put("thirty", 30);
        digits.put("forty", 40);
        digits.put("fifty", 50);
        digits.put("sixty", 60);
        digits.put("seventy", 70);
        digits.put("eighty", 80);
        digits.put("ninety", 90);
        digits.put("hundred", 100);
        digits.put("thousand", 100);

        HashMap<String, Integer> numbers10 = new HashMap<>();
        numbers10.put("eleven", 11);
        numbers10.put("twelve", 12);
        numbers10.put("thirteen", 13);
        numbers10.put("fourteen", 14);
        numbers10.put("fifteen", 15);
        numbers10.put("sixteen", 16);
        numbers10.put("seventeen", 17);
        numbers10.put("eighteen", 18);
        numbers10.put("nineteen", 19);

        HashMap<String, Integer> dosens = new HashMap<>();
        dosens.put("twenty", 20);
        dosens.put("thirty", 30);
        dosens.put("fourty", 40);
        dosens.put("fifty", 50);
        dosens.put("sixty", 60);
        dosens.put("seventy", 70);
        dosens.put("eighty", 80);
        dosens.put("ninety", 90);

        dosens.put("hundred", 100);


        System.out.println(numStr);
        numStr = numStr.replaceAll("(\\sand\\s)", " ");
        System.out.println(numStr);
        int num = 0;
        String[] split = numStr.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].contains("-")) {
                String[] splitDash = split[i].split("[-]");
                for (int j = 0; j < splitDash.length; j++) {
                    System.out.print(" ==> " + splitDash[j] + " => " + digits.get(splitDash[j]) + " ");
                }
            } else {
                if (split[i].contains("hundred")) {
                    System.out.println(split[i] + " => " + digits.get(split[i]));
                    num = Integer.parseInt(String.valueOf(digits.get(split[i]))) * Integer.parseInt(String.valueOf(digits.get(split[i-1])));
                    System.out.println(num);
                } else {

                }
            }
        }
        System.out.println("==========");
        // Your code here!
        return 15;
    }
}
