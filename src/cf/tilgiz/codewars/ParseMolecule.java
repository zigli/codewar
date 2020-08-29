package cf.tilgiz.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ilgiz Tukhvatov
 */
public class ParseMolecule {

    public static Map<String, Integer> getAtoms(String formula) {
        if(!isMirror(formula))
            throw new IllegalArgumentException();

        Map<String, Integer> resultHashMap = new HashMap<>();
//        System.out.println(formula);
        formula = "(" + formula + ")";

//        System.out.println(checkBrackets(formula, "(\\()", "(\\))"));
//        System.out.println(checkBrackets(formula, "(\\{)", "(\\})"));
//        System.out.println(checkBrackets(formula, "(\\[)", "(\\])"));
//        System.out.println(formula);
//        System.out.println(isMirror(formula));

        if(!(checkBrackets(formula,'(',')')
                && checkBrackets(formula,'{','}')
                && checkBrackets(formula,'[',']')
                ))
            throw new IllegalArgumentException();

        formula = putOnes(formula);
        formula = putOnes(formula);

//        System.out.println(formula + " ----------");

        do {
            Pattern pattern = Pattern.compile("(\\([A-Za-z0-9]+\\))[0-9]");
            Matcher matcher = pattern.matcher(formula);
            while (matcher.find()) {
                String group = matcher.group();
                String removedBrackets = removeBrackets(group, '(', ')');
                formula = formula.replace(group, removedBrackets);
            }
        } while (formula.substring(1).matches(".*\\(.*"));

//        System.out.println(formula);

        Pattern pattern1 = Pattern.compile("(\\[[A-Za-z0-9]+\\])[0-9]");
        Matcher matcher1 = pattern1.matcher(formula);
        while (matcher1.find()) {
            String group = matcher1.group();
            String removedBrackets = removeBrackets(group, '[', ']');
            formula = formula.replace(group, removedBrackets);
        }

//        System.out.println(formula);
//        System.out.println("========");

        Pattern pattern2 = Pattern.compile("(\\{[A-Za-z0-9]+\\})[0-9]");
        Matcher matcher2 = pattern2.matcher(formula);
        while (matcher2.find()) {
            String group = matcher2.group();
//            System.out.println(group);
            String removedBrackets = removeBrackets(group, '{', '}');
            formula = formula.replace(group, removedBrackets);
        }

//        System.out.println(formula);
//        Pattern pattern3 = Pattern.compile("([A-Z]?[a-z][0-9]+|[A-Z][0-9]+)");
        Pattern pattern3 = Pattern.compile("(([A-Z]?[a-z])|([0-9]+)|([A-Z])|([0-9]+))");
        Matcher matcher3 = pattern3.matcher(formula);
        int index = 0;
        String group = null;
        while (matcher3.find()) {
            if (index % 2 == 1 && group != null) {
                if (resultHashMap.get(group) != null)
                    resultHashMap.put(group, Integer.parseInt(matcher3.group()) + resultHashMap.get(group));
                else
                    resultHashMap.put(group, Integer.parseInt(matcher3.group()));
            } else
                group = matcher3.group();
            index++;
        }
        if (resultHashMap.isEmpty()) throw new IllegalArgumentException();
        return resultHashMap;
    }

    private static boolean checkBrackets(String formula, char regexStart, char regexStop) {
        long sizeOpen = formula.chars().filter(ch -> ch == regexStart).count();
        long sizeClose = formula.chars().filter(ch -> ch == regexStop).count();
        return (sizeOpen == sizeClose);
    }

    private static String putOnes(String formula) {
        Pattern pattern0 = Pattern.compile("(\\)|}|]|[A-Z]\\(|[A-Z][a-z]\\(|[A-Z]\\[|[A-Z][a-z]\\[|[A-Z][A-Z]|[A-Z][a-z][A-Z])");
        Matcher matcher0 = pattern0.matcher(formula);
        int offset = 0;
        while (matcher0.find()) {
//            System.out.println("group = " + matcher0.group());
            if (matcher0.start() + 1 + offset >= formula.length() || !isMatched(String.valueOf(formula.charAt(matcher0.start() + 1 + offset)), "[0-9]")) {
                if (matcher0.group().length() > 1)
                    formula = formula.substring(0, (matcher0.start() + matcher0.group().length() - 1 + offset)) + "1" + formula.substring((matcher0.start() + matcher0.group().length() - 1 + offset));
                else
                    formula = formula.substring(0, (matcher0.start() + 1 + offset)) + "1" + formula.substring((matcher0.start() + 1 + offset));
                offset++;
//                System.out.println(formula);
            }
        }
        return formula;
    }

    public static String removeBrackets(String string, char begin, char end) {
        int start = string.indexOf(begin);
        int stop = string.indexOf(end);
        String multipliedSubstring;
        int multiplier = Integer.parseInt(string.substring(stop + 1, stop + 2));
        if (isMatched(String.valueOf(string.charAt(stop - 1)), "[0-9]"))
            multipliedSubstring = string.substring(start + 1, stop);
        else
            multipliedSubstring = string.substring(start + 1, stop) + "1";

        StringBuilder builder = new StringBuilder();
        Pattern pattern = Pattern.compile("(([A-Z][a-z])|([A-Z])|([0-9]+))");
        Matcher matcher = pattern.matcher(multipliedSubstring);
        while (matcher.find()) {
            if (isMatched(matcher.group(), "[0-9]+")) {
                builder.append(multiplier * Integer.parseInt(matcher.group()));
            } else
                builder.append(matcher.group());
        }


//        for (int i = 1; i < multipliedSubstring.length(); i++) {
//            if (isMatched(String.valueOf(multipliedSubstring.charAt(i)), "[a-z]")) {
//                builder.append(multipliedSubstring.charAt(i));
//            } else {
//                boolean isDigit = isMatched(String.valueOf(multipliedSubstring.charAt(i)), "[0-9]");
//                if (!isDigit && isMatched(builder.substring(builder.length() - 1), "[A-Za-z)}\\]]"))
//                    builder.append((multiplier + "" + multipliedSubstring.charAt(i)));
//                else {
//                    if (isDigit) {
//                        System.out.println(multiplier + " " + Integer.parseInt(String.valueOf(multipliedSubstring.charAt(i))));
//                        builder.append(multiplier * Integer.parseInt(String.valueOf(multipliedSubstring.charAt(i))));
//                    }else
//                        builder.append("" + multipliedSubstring.charAt(i));
//                }
//            }
//        }
        return builder.toString();
    }

    public static boolean isMatched(String string, String matcher) {
        return string.matches(matcher);
    }

    public static boolean isMirror2(String s) {
        char[] brackets = new char[( s.split("[\\(\\{\\[\\)\\}\\]]", -1).length ) - 1];
        for (int i = 0, k = 0; i < s.length(); i++) {
            if(ParseMolecule.isMatched(String.valueOf(s.charAt(i)), "[\\(\\{\\[\\)\\}\\]]")) {
                brackets[k++] = s.charAt(i);
            }
        }
        boolean isMirror = true;
        System.out.println(Arrays.toString(brackets));
        for (int i = 0; i < brackets.length/2; i++) {
            if (Math.abs((int) brackets[i] - (int) brackets[brackets.length - 1 - i]) > 2 ) {
                isMirror = false;
                break;
            }
        }
        return isMirror;
    }
    public static boolean isMirror(String s) {
        String regex = "(" +
                "\\([A-Za-z]+\\)" +
                "|\\([A-Za-z]+\\d?\\)" +
                "|\\([A-Za-z]+\\d+?\\)" +
                "|\\([A-Z]\\d?[A-Z]\\d?\\)" +
                "|\\([A-Z]\\d+?[A-Z]\\d?\\)" +
                "|\\([A-Z]\\d?[A-Z]\\d+?\\)" +
                "|\\([A-Z]\\d+?[A-Z]\\d+?\\)" +
                "|\\([A-Za-z]+\\d?[A-Za-z]+\\d?\\)" +
                "|\\([A-Za-z]+\\d+?[A-Za-z]+\\d?\\)" +
                "|\\([A-Za-z]+\\d?[A-Za-z]+\\d+?\\)" +
                "|\\([A-Za-z]+\\d+?[A-Za-z]+\\d+?\\)" +
                "|\\(\\d+\\)" +
                ")";

        long count = s.chars().filter(ch -> ch == '(').count();
        for (int i = 0; i < count; i++) {
            s = s.replaceAll(regex, "");
        }
//        count = s.chars().filter(ch -> ch == '(').count();
//        System.out.println(count);
        return s.chars().filter(ch -> ch == '(').count() == 0;
//
//        char[] brackets = new char[( s.split("[\\(\\{\\[\\)\\}\\]]", -1).length ) - 1];
//        for (int i = 0, k = 0; i < s.length(); i++) {
//            if(ParseMolecule.isMatched(String.valueOf(s.charAt(i)), "[\\(\\{\\[\\)\\}\\]]")) {
//                brackets[k++] = s.charAt(i);
//            }
//        }
//        boolean isMirror = true;
//        System.out.println(Arrays.toString(brackets));
//        for (int i = 0; i < brackets.length/2; i++) {
//            if (Math.abs((int) brackets[i] - (int) brackets[brackets.length - 1 - i]) > 2 ) {
//                isMirror = false;
//                break;
//            }
//        }
//        return isMirror;
    }

    public static Map<String, Integer> getAtoms1(String formula) {
        Map<String, Integer> resultHashMap = new HashMap<>();
        ArrayList<String> targetList = new ArrayList<>();
        System.out.println(formula);

        StringBuilder builder = new StringBuilder().append(formula.charAt(0));

        for (int i = 1, k = 1; i < formula.length(); i++) {
//            System.out.println("i=" + i + " k=" + k + " => " + formula.charAt(i) + " , builder: " + builder);
            if (isMatched(String.valueOf(formula.charAt(i)), "[a-z]")) {
//                System.out.println("Small");
                builder.append(formula.charAt(i));
            } else {
//                if (((formula.charAt(i) > 96 && formula.charAt(i) < 123) || (formula.charAt(i) > 64 && formula.charAt(i) < 91)) && !(formula.charAt(i - 1) == 123 || formula.charAt(i - 1) == 91 || formula.charAt(i - 1) == 40))
                if (!isMatched(String.valueOf(formula.charAt(i)), "[0-9]") && isMatched(builder.substring(builder.length() - 1), "[A-Za-z)}\\]]"))
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
                    } else if (isMatched(String.valueOf(formula.charAt(i)), "\\d+")) {
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
            if (isMatched(targetList.get(i), "[A-Za-z]+")) {
                if (resultHashMap.containsKey(targetList.get(i)))
                    resultHashMap.put(targetList.get(i), multiplyCurly * multiplyRound * multiplySquare * Integer.parseInt(targetList.get(i + 1)) + resultHashMap.get(targetList.get(i)));
                else
                    resultHashMap.put(targetList.get(i), multiplyCurly * multiplyRound * multiplySquare * Integer.parseInt(targetList.get(i + 1)));
                i++;
            } else if (isMatched(targetList.get(i), "[(]")) {
                indexOfCloseRoundBracket = targetList.indexOf(")");
                multiplySquare = Integer.parseInt(targetList.get(indexOfCloseRoundBracket + 1));
//                System.out.print(", indexOfCloseRoundBracket=" + indexOfCloseRoundBracket + ", multiplyRound=" + multiplyRound + ", multiplySquare=" + multiplySquare);
            } else if (isMatched(targetList.get(i), "[)]")) {
                multiplySquare = 1;
            } else if (isMatched(targetList.get(i), "[\\[]")) {
                indexOfCloseSquareBracket = targetList.indexOf("]");
                multiplyRound = Integer.parseInt(targetList.get(indexOfCloseSquareBracket + 1));
//                System.out.print(", indexOfCloseRoundBracket=" + indexOfCloseRoundBracket + ", multiplyRound=" + multiplyRound + ", multiplySquare=" + multiplyRound);
            } else if (isMatched(targetList.get(i), "[\\]]")) {
                multiplyRound = 1;
            } else if (isMatched(targetList.get(i), "[{]")) {
                indexOfCloseCurlyBracket = targetList.indexOf("}");
                if (isMatched(targetList.get(indexOfCloseCurlyBracket + 1), "[0-9]+"))
                    multiplyCurly = Integer.parseInt(targetList.get(indexOfCloseCurlyBracket + 1));
//                System.out.print(", indexOfCloseRoundBracket=" + indexOfCloseRoundBracket + ", multiplyRound=" + multiplyRound + ", multiplySquare=" + multiplyRound);
            } else if (isMatched(targetList.get(i), "[}]")) {
                multiplyCurly = 1;
            }

        }

        return resultHashMap;
    }
}
