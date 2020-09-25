package cf.tilgiz.codewars;

import java.util.HashMap;

/**
 * @author Ilgiz Tukhvatov
 */
public class MorseCodeDecoder {

    //Constants hold the accepted characters
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789 ";
    private static final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
            ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----", "   "};

    //Maps map the code to text and text to code
    private static HashMap<String, String> MorseCode;
    private static HashMap<String, String> toCode;


    public static String decode(String morseCode) {

        MorseCode = new HashMap<>();
        toCode = new HashMap<>();
        char[] alphaArray = alphabet.toCharArray();
        for(int i = 0; i < morse.length; i++) {
            MorseCode.put(morse[i], String.valueOf(alphaArray[i]));
            toCode.put(String.valueOf(alphaArray[i]), morse[i]);
        }

        System.out.println(morseCode);
        StringBuilder builder = new StringBuilder();
        for (String s : morseCode.trim().split("\\s{3}")) {
            for (String s1 : s.split("\\s")) builder.append(MorseCode.get(s1));
            builder.append(" ");
        }
        return builder.toString().toUpperCase().trim();
    }
}
