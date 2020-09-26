package cf.tilgiz.codewars;

/**
 * @author Ilgiz Tukhvatov
 */
public class BackspacesInString {
    public String cleanString(String s) {
//        System.out.println(s);
        while (s.contains("#") && !s.equals("##")) {
//            if (s.equals("##")) return "";
            s = s.replaceAll("^#", "").replaceAll("[^#]#", "");
//            s = s.substring(0, index - 1) + s.substring(index + 1);
//            System.out.println(s);
        }
//        System.out.println(s.replaceAll("[^#]#", ""));
        // your code here
        return s.replaceAll("#", "");
    }
}
