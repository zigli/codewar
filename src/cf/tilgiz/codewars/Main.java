package cf.tilgiz.codewars;

import javax.xml.bind.ParseConversionEvent;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

//        System.out.print(ReversWords.reverse("This is test"));

//        String mydata = "5 1 2 + 4 * + 3 -";
//        Calc calc = new Calc();
//        System.out.println(calc.evaluate(mydata));

//        System.out.println(NumberFun.findNextSquare(121));

//        List<String> a = new ArrayList<String>();
//        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
//        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
//        System.out.println(SmileFaces.countSmileys(a));

//        System.out.println(Order.order("is2 Thi1s T4est 3a"));

//        String a[] = new String[]{ "arp", "live", "strong" };
//        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
//        String r[] = new String[] { "arp", "live", "strong" };
//        System.out.println(Arrays.toString(WhichAreIn.inArray(a, b)));

//        System.out.println(RoundToTheNextMultipleOf5.roundToNext5(14));

//        int[] array = new int[] {1, 2};
//        int[] array = new int[] {15, 7, 3, -8};
//        int[] array = new int[] {4, 2, 30, -5};
//        System.out.println(Solution.isSortedAndHow(array));

//        System.out.println(new SquareDigit().squareDigits(9119));

//        System.out.println("printerError Fixed Tests");
//        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
//        String s="abmxyz";
//        System.out.println(Printer.printerError(s));

//        System.out.println(RowSumOddNumbers.rowSumOddNumbers(4));


//        String input = "the_Stealth_Warrior";
//        String input = "the-stealth-warrior";
//        System.out.println("input: "+input);
//        System.out.println(Solution.toCamelCase(input));

//        Conversion conversion = new Conversion();
//        System.out.println(conversion.solution(3189));


//        System.out.println(Solution.whoLikesIt());
//        System.out.println(Solution.whoLikesIt("Peter"));
//        System.out.println(Solution.whoLikesIt("Jacob", "Alex"));
//        System.out.println(Solution.whoLikesIt("Max", "John", "Mark"));
//        System.out.println(Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));


//        System.out.println(Solution.dashatize(5311));

//        System.out.println(Kata.findEvenIndex(new int[]{1,2,3,4,5,6}));

//        System.out.println(Arrays.toString(Solution.capitalizeOddEven("abcdef")));

//        System.out.println(Solution.rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 21}));


//        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a'), 4);
////        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
//        System.out.println(helper.pageCount()); //should == 2
//        System.out.println(helper.itemCount()); //should == 6
//        System.out.println(helper.pageItemCount(0)); //should == 4
//        System.out.println(helper.pageItemCount(1)); // last page - should == 2
//        System.out.println(helper.pageItemCount(2)); // should == -1 since the page is invalid
//// pageIsoutex takes an item index and returns the page tha)t it belongs on
//        System.out.println(helper.pageIndex(5)); //should == 1 (zero based index)
//        System.out.println(helper.pageIndex(2)); //should == 0
//        System.out.println(helper.pageIndex(20)); //should == -1
//        System.out.println(helper.pageIndex(-10)); //should == -1


//        System.out.println(Kata.longToIP(2149583361L));
//        System.out.println(Kata.longToIP(214));

//        String str = "129018";
//        String str2 = String.format("%10s", str).replace(' ', '0');
//        System.out.println(str2);
//
//        long leftLimit  = 1000000000000L;
//        long rightLimit = 10000000000000L;
//        long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
//        System.out.println(generatedLong);
//        System.out.println(Kata.nextBiggerNumber(generatedLong));
//        System.out.println(Kata.nextBiggerNumber1(generatedLong));
//        System.out.println(Kata.nextBiggerNumber1("098"));


//        Scanner keyboard = new Scanner(System.in);
//        String line = null;
//        int sum = 0, max = 5;
//        while(!(line = keyboard.nextLine()).isEmpty() && max > 0) {
//            sum += Integer.parseInt(line);
//            max--;
//        }
//        System.out.print(sum);

//        System.out.println(School.getAverage(new int[]{1,1,1,1,1,1,1,2}));

//        System.out.println(ParseMolecule.getAtoms("pie"));
//        System.out.println(ParseMolecule.getAtoms("H2O"));
//        System.out.println(ParseMolecule.getAtoms("Mg(OH]2"));
//        System.out.println(ParseMolecule.getAtoms("K4[ON(SO3)2]2"));
//        System.out.println(ParseMolecule.getAtoms("{[Co(NH3)4(OH)2]3Co}(SO4)3"));
//        System.out.println(ParseMolecule.getAtoms("Au5(C2H5[OH)3Li]3"));
//        System.out.println(ParseMolecule.getAtoms("(C5H5)Fe(CO)2CrH3"));
//        System.out.println(ParseMolecule.getAtoms("Pd[P(C6H5)3]4"));
//        System.out.println(ParseMolecule.getAtoms("{((H)2)[O]}"));
//        System.out.println(ParseMolecule.getAtoms("MgOH)2"));


//        System.out.println(ParseMolecule.removeBrackets("[Pg1C18H15]4", '[', ']'));

//        String s = "(Au5(C2H5([OH))3Li]3)";
//        String s = "{[Co(NH3)4(OH)2]3Co}(SO4)3";
//        String s = "{((H)2)[O]}";
//        System.out.println("{((H)2)[O]}".replaceAll("\\([A-Z]+\\)", ""));
//        System.out.println("{[Co(NH3)4(OgH)2]3Co}(SO4)3".replaceAll("\\([A-Z]+[0-9]?\\)", ""));
//        System.out.println("{[Co(NH3)4(OgH)2]3Co}(SO4)3".replaceAll("\\([A-Za-z]+\\)", ""));
//        String s1 = "{[Co" +
//                "(N)4" +
//                "(N2)4" +
//
//                "(Ng)4" +
//                "(Ng2)4" +
//
//                "(NH)4" +
//                "(N3H)4" +
//                "(NH3)4" +
//                "(N3H3)4" +
//
//                "(NgH)5" +
//                "(NgH2)5" +
//                "(Ng2H)5" +
//                "(Ng2H2)5" +
//
//                "(NHg)3" +
//                "(N2Hg)3" +
//                "(NHg2)3" +
//                "(N2Hg2)3" +
//
//                "(N2(N2Hg2)Hg22)3" +
//
//                "]3Co}(SO4)3";
//
//        s1 = "{((H)2)[O]}";
//        s1 = "{[Co(NH3)4(OH)2]3Co}(SO4)3";
//        s1 = "(K4[ON(SO3)2]2)";
//        String regex = "(" +
//                "\\([A-Za-z]+\\)" +
//                "|\\([A-Za-z]+\\d?\\)" +
//                "|\\([A-Za-z]+\\d+?\\)" +
//                "|\\([A-Z]\\d?[A-Z]\\d?\\)" +
//                "|\\([A-Z]\\d+?[A-Z]\\d?\\)" +
//                "|\\([A-Z]\\d?[A-Z]\\d+?\\)" +
//                "|\\([A-Z]\\d+?[A-Z]\\d+?\\)" +
//                "|\\([A-Za-z]+\\d?[A-Za-z]+\\d?\\)" +
//                "|\\([A-Za-z]+\\d+?[A-Za-z]+\\d?\\)" +
//                "|\\([A-Za-z]+\\d?[A-Za-z]+\\d+?\\)" +
//                "|\\([A-Za-z]+\\d+?[A-Za-z]+\\d+?\\)" +
//                "|\\(\\d+\\)" +
//                ")";

//        System.out.println(s1.replaceAll(regex, ""));
//        System.out.println(s1.replaceAll(regex, "").replaceAll(regex, ""));
//        System.out.println(s.replaceAll("\\([A-Za-z?0-9+]\\)", ""));
//        System.out.println(ParseMolecule.isMirror(s1));


//        System.out.println(SumFct.perimeter(BigInteger.valueOf(5)));
//        System.out.println(SumFct.perimeter(BigInteger.valueOf(5)));


//        Cockroach cockroach = new Cockroach();
//        System.out.println(cockroach.cockroachSpeed(1.08));


//        System.out.println(SillyAdditon.add(16, 18));
//        System.out.println(SillyAdditon.add(26,39));
//        System.out.println(SillyAdditon.add(122,81));

//        System.out.println(16%10/1);
//        System.out.println(16%100/10);
//        System.out.println(16%1000/100);
//
//        System.out.println(145%10/1);
//        System.out.println(145%100/10);
//        System.out.println(145%1000/100);
//        System.out.println(145/10);
//        System.out.println(14/10);


//        System.out.println("==");
////        System.out.println(StripComments.stripComments("apples, pears # and bananas\n\ngrapes  \nbananas !apples", new String[]{"#", "!"}));
////        System.out.println(StripComments.stripComments("a #b\nc\nd $e f g", new String[]{"#", "$"}));
////        System.out.println(StripComments.stripComments("a\n\n\n$$dd", new String[]{"#", "$", "!", "-"}));
//        System.out.println(StripComments.stripComments("      ", new String[]{"#"}));
//        System.out.println("==");

//        String data = "text 1 {\ntext 2\ntext 3\n}";
////        System.out.println(data.replaceAll("\\{[^{}]*}", ""));
//        System.out.println(data.replaceAll("(?<=\\{).*?(?=\\})", ""));
//
//        String str = "\n\nf\n\nb\n\ne\n\n!bc\nfc\n\nc\n\ndfeabe\n\ne\n\nd\n\nc\n\ncd\naeaa\n\nc\n\nf\n\nbe\n\ncdfd!\n\neb\n\nf\n\n\n\n\ndd\nea\n\nf\n\ndd\n\nbb\n\n\n\n\na\n\n!\n\nd\n\ncc\n\nd\n\nc\n\nd\n\ne\n\nbcbe\n\n\n\n\n\n!ce!\n\nbbacd!!\n\nc\n\nf\n\ncc\n\nf\n\nf\n\ndb!\n\n!e\n\n!\n\n\n\n\n\nc\n\n!\n\ne\n\n\nb!ae\n\neb\n\n\n!f\n\nb\n\nbf\n\na\n\n\n!e\n\n\n\n\nc\n\na\n\n!d\n\nc!\n\ne!\n\naab\n\na\n\na\n\nc\n\n\n\n\n\n\n\ncfc\n\nc";
//        str = "\n\nffc $abe\n\n b \n\na$eca$f$\n\n!bc\nfc\naa!fa\nc\n\ndfe !abe\n\ne\n";
//        String comment = "$";
//        String regex = "\\s?+\\" + comment + ".*?\n";
//        String s = str.replaceAll(regex, "\n").replaceAll("\\s+\n", "\n\n");
////        replaceAll("(?<=\\w)\\s+(?=\n)", "\n")
//        System.out.println(s);
//        System.out.println(StripComments.stripComments(str, new String[]{"#", "$", "!", "-"}));


//        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
////        String[] names = new String[]{"Sheldon", "Leonard", "Penny"};
//        int n = 63;
//        System.out.println(new Line().WhoIsNext(names, n));


        System.out.println(Troll.disemvowel("This website is for losers LOL!"));

    }

}
