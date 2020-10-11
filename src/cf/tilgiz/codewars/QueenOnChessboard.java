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
        System.out.println(position);
        if (position == null || !position.matches("[A-H][1-8]")) return new ArrayList<>();

        String letter = position.substring(0, 1);
        int number = Integer.parseInt(position.substring(1));
        ArrayList<String> output = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((LETTERS[j].equals(letter) && i != number) ||
                        (!LETTERS[j].equals(letter) && i == number) ||
                        (i == j + 1) && i != number && !LETTERS[j].equals(letter)) output.add(LETTERS[j] + i);
            }
        }
        Collections.sort(output);

        return output;
    }
}
