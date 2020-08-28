package cf.tilgiz.codewars;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ilgiz Tukhvatov
 */
public class ParseMolecule {

    public static Map<String, Integer> getAtoms(String formula) {
        Map<String, Integer> resultHashMap = new HashMap<>();
        System.out.println(formula);
        String replaced = null;

        Pattern pattern = Pattern.compile("(\\([A-Z]+?[a-z]?[0-9]\\)?[0-9])");
        Matcher matcher = pattern.matcher(formula);
        if (matcher.find()) {
            String group = matcher.group();
            String removeBackets = removeBackets(group, '(', ')');
            replaced = formula.replace(matcher.group(), removeBackets);
        }
        System.out.println(replaced);

        return resultHashMap;
    }

    public static String removeBackets(String string, char begin, char end) {
        int start = string.indexOf(begin);
        int stop = string.indexOf(end);
        int multiplier = Integer.parseInt(string.substring(stop + 1, stop + 2));
        String multipliedSubstring = string.substring(start + 1, stop);

        StringBuilder builder = new StringBuilder().append(multipliedSubstring.charAt(0));
        for (int i = 1; i < multipliedSubstring.length(); i++) {
            if (String.valueOf(multipliedSubstring.charAt(i)).matches("[a-z]")) {
                builder.append(multipliedSubstring.charAt(i));
            } else {
                boolean isDigit = String.valueOf(multipliedSubstring.charAt(i)).matches("[0-9]");
                if (!isDigit && builder.substring(builder.length() - 1).matches("[A-Za-z)}\\]]"))
                    builder.append((multiplier + ""+ multipliedSubstring.charAt(i)));
                else {
                    if(isDigit)
                        builder.append(multiplier * Integer.parseInt(String.valueOf(multipliedSubstring.charAt(i))));
                    else
                        builder.append("" + multipliedSubstring.charAt(i));
                }
            }
        }
        return builder.toString();
    }

    public static Map<String, Integer> getAtoms1(String formula) {
        Map<String, Integer> resultHashMap = new HashMap<>();
        ArrayList<String> targetList = new ArrayList<>();
        System.out.println(formula);

        StringBuilder builder = new StringBuilder().append(formula.charAt(0));

        for (int i = 1, k = 1; i < formula.length(); i++) {
//            System.out.println("i=" + i + " k=" + k + " => " + formula.charAt(i) + " , builder: " + builder);
            if (String.valueOf(formula.charAt(i)).matches("[a-z]")) {
//                System.out.println("Small");
                builder.append(formula.charAt(i));
            } else {
//                if (((formula.charAt(i) > 96 && formula.charAt(i) < 123) || (formula.charAt(i) > 64 && formula.charAt(i) < 91)) && !(formula.charAt(i - 1) == 123 || formula.charAt(i - 1) == 91 || formula.charAt(i - 1) == 40))
                if (!String.valueOf(formula.charAt(i)).matches("[0-9]") && builder.substring(builder.length() - 1).matches("[A-Za-z)}\\]]"))
                    builder.append("1" + formula.charAt(i));
                else
                    builder.append("" + formula.charAt(i));
            }
//            System.out.println(builder);
        }
        System.out.println(builder);
        int start = builder.indexOf("{");
        int stop = builder.indexOf("}");
        int multiplyer = Integer.parseInt(builder.substring(stop + 1, stop + 2));
        String substring = builder.substring(start + 1, stop);
        System.out.println(multiplyer + " => " + multiplyer);

        return resultHashMap;
    }


    public static Map<String, Integer> getAtoms2(String formula) {
        Map<String, Integer> resultHashMap = new HashMap<>();
        ArrayList<String> targetList = new ArrayList<>();
        System.out.println(formula);

        try {
            for (int i = 0, k = 0; i < formula.length(); i++) {
//            System.out.print("i=" + i + " k=" + k + " => " + formula.charAt(i));
                if (formula.charAt(i) > 96 && formula.charAt(i) < 123) {
//                    System.out.println(" Small letterrrrrrrr");
                    targetList.set((k - 1), targetList.get(k - 1) + formula.charAt(i));
                    k++;
                } else {
                    if (formula.charAt(i) > 64 && formula.charAt(i) < 91) {
                        targetList.add(String.valueOf(formula.charAt(i)));
                        targetList.add("1");
                    } else if (String.valueOf(formula.charAt(i)).matches("\\d+")) {
                        if (formula.charAt(i - 1) == 41 || formula.charAt(i - 1) == 93)
                            targetList.add(String.valueOf(formula.charAt(i)));
                        else
                            targetList.set(targetList.lastIndexOf(String.valueOf(formula.charAt(i - 1))) + 1, String.valueOf(formula.charAt(i)));
                    } else
                        targetList.add(String.valueOf(formula.charAt(i)));
                    k++;
//                    System.out.println();
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException();
        }
        System.out.println(targetList);

        int indexOfCloseRoundBracket = 0;
        int indexOfCloseSquareBracket = 0;
        int indexOfCloseCurlyBracket = 0;
        int multiplyRound = 1;
        int multiplySquare = 1;
        int multiplyCurly = 1;
        for (int i = 0; i < targetList.size(); i++) {
//            System.out.print("Element: " + targetList.get(i) + ", multiplyRound=" + multiplyRound + ", multiplySquare=" + multiplySquare);
            if (targetList.get(i).matches("[A-Za-z]+")) {
                if (resultHashMap.containsKey(targetList.get(i)))
                    resultHashMap.put(targetList.get(i), multiplyCurly * multiplyRound * multiplySquare * Integer.parseInt(targetList.get(i + 1)) + resultHashMap.get(targetList.get(i)));
                else
                    resultHashMap.put(targetList.get(i), multiplyCurly * multiplyRound * multiplySquare * Integer.parseInt(targetList.get(i + 1)));
                i++;
            } else if (targetList.get(i).matches("[(]")) {
                indexOfCloseRoundBracket = targetList.indexOf(")");
                multiplySquare = Integer.parseInt(targetList.get(indexOfCloseRoundBracket + 1));
//                System.out.print(", indexOfCloseRoundBracket=" + indexOfCloseRoundBracket + ", multiplyRound=" + multiplyRound + ", multiplySquare=" + multiplySquare);
            } else if (targetList.get(i).matches("[)]")) {
                multiplySquare = 1;
            } else if (targetList.get(i).matches("[\\[]")) {
                indexOfCloseSquareBracket = targetList.indexOf("]");
                multiplyRound = Integer.parseInt(targetList.get(indexOfCloseSquareBracket + 1));
//                System.out.print(", indexOfCloseRoundBracket=" + indexOfCloseRoundBracket + ", multiplyRound=" + multiplyRound + ", multiplySquare=" + multiplyRound);
            } else if (targetList.get(i).matches("[\\]]")) {
                multiplyRound = 1;
            } else if (targetList.get(i).matches("[{]")) {
                indexOfCloseCurlyBracket = targetList.indexOf("}");
                if (targetList.get(indexOfCloseCurlyBracket + 1).matches("[0-9]+"))
                    multiplyCurly = Integer.parseInt(targetList.get(indexOfCloseCurlyBracket + 1));
//                System.out.print(", indexOfCloseRoundBracket=" + indexOfCloseRoundBracket + ", multiplyRound=" + multiplyRound + ", multiplySquare=" + multiplyRound);
            } else if (targetList.get(i).matches("[}]")) {
                multiplyCurly = 1;
            }

        }

        return resultHashMap;
    }
}
