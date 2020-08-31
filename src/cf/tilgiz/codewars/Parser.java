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


        // Your code here!
        return 15;
    }
}
