package cf.tilgiz.codewars;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author tilgiz
 * 11.10.2020 22:36
 */
public class QueenOnChessboard {

    private static final String[] LETTERS = {"A", "B", "C", "D", "E", "F", "G", "H"};

    public static List<String> availableMoves(String position) {
//        System.out.println(position);
        ArrayList<String> output = new ArrayList<>();
        if (position == null || !position.matches("[A-H][1-8]")) return output;

        int letterIndex = Arrays.asList(LETTERS).indexOf(position.substring(0, 1));
        int number = Integer.parseInt(position.substring(1));

        for (int i = 1; i <= 8; i++) {
            if (i != number) output.add(LETTERS[letterIndex] + i);
            if (!LETTERS[i - 1].equals(LETTERS[letterIndex])) output.add(LETTERS[i - 1] + number);
            if (i <= 8 - number){
                for (int j = 0; j < 8; j++) {
                    if (i == j + 1 && number + i <= 8 && letterIndex + 1 + j < 8) output.add(LETTERS[letterIndex + 1 + j] + (number + i));
                    if (i == j + 1 && number + i <= 8 && (letterIndex - 1 - j) >= 0) output.add(LETTERS[letterIndex - 1 - j] + (number + i));
                }
            }
            if (i >= 8 - number){
                for (int j = 0; j < 8; j++) {
                    if (8 - i == j + 1 && number - (8 - i) > 0 && letterIndex + 1 + j < 8) output.add(LETTERS[letterIndex + 1 + j] + (number - (8 - i)));
                    if (8 - i == j + 1 && number - (8 - i) > 0 && (letterIndex - 1 - j) >= 0) output.add(LETTERS[letterIndex - 1 - j] + (number - (8 - i)));
                }
            }
        }
//        System.out.println(output);
//        for (int i = number; i >= 1; i--) {
//        for (int i = number; i >= 1; i--) {
//            for (int j = 0; j < 8; j++) {
//                if (i == j + 1 && number - i > 0 && letterIndex + 1 + j < 8) output.add(LETTERS[letterIndex + 1 + j] + (number - i));
//                if (i == j + 1 && number - i > 0 && (letterIndex - 1 - j) >= 0) output.add(LETTERS[letterIndex - 1 - j] + (number - i));
//            }
//        }
//        System.out.println(output);
        Collections.sort(output);

        return output;
    }
}
