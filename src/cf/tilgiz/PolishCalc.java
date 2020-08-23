package cf.tilgiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PolishCalc {
    private static String regexOperation = "[0-9]{2}[+-/*]";

    public double evaluate(String expr) {
        if (expr.equals("")) return 0;
        ArrayList<String> al = new ArrayList<>(Arrays.asList(expr.split("\\s+")));
        if (al.size() == 1) return Double.parseDouble(expr);
        else {
            do {
                makeShorter(al);
            }
            while (al.contains("*") || al.contains("+") || al.contains("-") || al.contains("/"));
            return Double.parseDouble(al.get(0));
        }
    }

    private void makeShorter(ArrayList<String> al) {
        for (int i = 0; i < al.size(); i++) {
            if (checkOperand(al.get(i))) {
                String operationResult = getOperationResult(al.get(i - 2), al.get(i - 1), al.get(i));
                al.remove(i);
                al.remove(i - 1);
                al.remove(i - 2);
                al.add(i - 2, operationResult);
                break;
            }
        }
    }

    public boolean checkOperand(String s) {
        String regexOperand = "[+-/*]";
        Pattern pattern = Pattern.compile(regexOperand);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    public String getOperationResult(String a1, String b1, String operand) {
        int result;
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        switch (operand) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                result = a / b;
                break;
        }
        return String.valueOf(result);
    }
}
