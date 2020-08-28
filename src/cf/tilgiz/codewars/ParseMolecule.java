package cf.tilgiz.codewars;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ilgiz Tukhvatov
 */
public class ParseMolecule {
    public static Map<String, Integer> getAtoms(String formula) {
        Map<String, Integer> resultHashMap = new HashMap<>();
        ArrayList<String> targetList = new ArrayList<>();
        System.out.println(formula + "===============");

        for (int i = 0, k = 0; i < formula.length(); i++) {
//            System.out.println("i=" + i + " k=" + k + " => " + formula.charAt(i));
            if (formula.charAt(i) > 96 && formula.charAt(i) < 123) {
                targetList.set((k - 1), targetList.get(k - 1) + formula.charAt(i));
            } else {
                if (formula.charAt(i) > 64 && formula.charAt(i) < 91) {
                    targetList.add(String.valueOf(formula.charAt(i)));
                    targetList.add("1");
                } else if (String.valueOf(formula.charAt(i)).matches("\\d+")) {
                    if (formula.charAt(i - 1) == 41 || formula.charAt(i - 1) == 93)
                        targetList.add(String.valueOf(formula.charAt(i)));
                    else
                        targetList.set(targetList.lastIndexOf(String.valueOf(formula.charAt(i-1))) + 1, String.valueOf(formula.charAt(i)));
                } else
                    targetList.add(String.valueOf(formula.charAt(i)));
                k++;
            }
        }
        System.out.println(targetList);

//        for (int i = 0; i < targetList.size(); i++) {
//            System.out.print("Element: " + targetList.get(i));
//            if (targetList.get(i + 1).matches("\\d+")) {
//                System.out.println(" => Digit: " + targetList.get(i + 1));
//                resultHashMap.put(targetList.get(i), Integer.parseInt(targetList.get(i + 1)));
//                i++;
//            } else {
//                System.out.println(" => Digit: 1");
//                resultHashMap.put(targetList.get(i), 1);
//            }
//        }

        return resultHashMap;
    }
}
