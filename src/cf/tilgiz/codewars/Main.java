package cf.tilgiz.codewars;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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


//        System.out.println(Troll.disemvowel("This website is for losers LOL!"));


//        System.out.println(Parser.parseInt("zero"));
//        System.out.println(Parser.parseInt("one"));
//        System.out.println(Parser.parseInt("twenty"));
//        System.out.println(Parser.parseInt("two hundred forty-six"));
//        System.out.println(Parser.parseInt("two hundred fifty"));
//        System.out.println(Parser.parseInt("seven hundred eighty-three thousand nine hundred and nineteen"));
//        System.out.println(Parser.parseInt("two hundred fifty million seven hundred eighty-three thousand nine hundred and nineteen"));


//        System.out.println(GrassHopper.weatherInfo(56));


//        System.out.println(Solution.areaOrPerimeter(6,10));


//        System.out.println("tetwe$etw".replaceAll("\\$", "\\\\\\\\\\\\\\$"));
//        System.out.println(Solution.repeatStr(31, "t,(P:I.72NQkPsHbV$x/?b"));

//        System.out.println(FakeBinary.fakeBin("45385593107843568"));


//        System.out.println(Solution.passwordCracker("e6fb06210fafc02fd7479ddbed2d042cc3a5155e"));

//        long START_TIME = System.currentTimeMillis();
////        System.out.println(Solution.passwordCracker("130b9d1f6651ea00d9070dd797982dbcf1b6aeac"));
//        System.out.println(Solution.passwordCracker("e6fb06210fafc02fd7479ddbed2d042cc3a5155e"));
//        System.out.println(Solution.passwordCracker("a94a8fe5ccb19ba61c4c0873d391e987982fbbd3"));
//        long STOP_TIME = System.currentTimeMillis();
//        long duration = STOP_TIME - START_TIME;
//        System.out.println("Password cracked in " + TimeUnit.MILLISECONDS.toSeconds(duration) + "." + TimeUnit.MILLISECONDS.toMillis(duration) + " sec.");

//        System.out.println(Solution.getSha1("z"));
//        System.out.println(Solution.getSha12("z"));

//        System.out.println(Solution.passwordCracker("f7a9e24777ec23212c54d7a350bc5bea5477fdbb"));


//        System.out.println(TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
//        System.out.println(TopWords.top3("e e e e     ddd  d : ddd ddd aa a   a bb cc c  e e e"));
//        System.out.println(TopWords.top3("  //wont won't won't "));
//        System.out.println(TopWords.top3("  , e   .. "));
//        System.out.println(TopWords.top3("  ...  "));
//        System.out.println(TopWords.top3("  '  "));
//        System.out.println(TopWords.top3("  '''  "));
//        System.out.println(TopWords.top3("m  yn      k  vwfo v  yton k  vwfo v x   ww k'ezgsf     yton  dz u     -k'ezgsf  :y abui u   m     eg p    yton r a  k  vwfo v-x   ww y  l  dz u r a  y  lg p  k  vwfo v   m  yn :k  vwfo v:  m  yn y  l k  vwfo v v   grg   mv a  : '  auq  mv a  :g p    yton k  vwfo vk  vwfo v   xf    yton  dz u  dz u y  l   yton k'ezgsf  g p   v   grg  :g p    dz ur a           g p   k  vwfo v-y  lk'ezgsf     ix  g p   y abui u   yton   ytony  l   xf  g p    dz u v   grg    dz u g p    dz u y abui u   m  yn  k  vwfo v y  l y  l   m  yn        m  yn  k'ezgsf   mv a   k  vwfo v   yton     -y abui u r a  v   grg   r a  k'ezgsf   k  vwfo v   m  yn  k'ezgsf   mv a   g p  y  l   yton  '  auq  k  vwfo v x   ww      y abui u:mv a  -k  vwfo v  '  auq    ix  y  l k  vwfo v y  l x   ww y  l y  l k'ezgsf     ix   dz u  '  auq   m  yn r a  dz u x   ww  yton x   ww     k'ezgsf   v   grg   v   grg  -y  l '  auq  r a   dz u mv a  -r a     x   ww r a  k'ezgsf    '  auq  r a   yton   m  yn  y  lg p   y  l v   grg   k'ezgsf  k'ezgsf  y  l y  l g p     yton v   grg     m  yn   dz u mv a     yton      x   wwr a    ix  k'ezgsf   dz u k  vwfo v   m     er a  r a    m  yn  mv a  :g p   k'ezgsf   g p   mv a  y  l g p   k  vwfo v   yton g p  :r a  v   grg   k'ezgsf     m  yn    m     e      dz u  yton x   ww   yton  yton   ix mv a     yton   m  yn :mv a    dz u:k  vwfo v  dz u-r a    yton x   ww  dz u k  vwfo v k  vwfo v   yton k'ezgsf    dz u   ix   dz u   xf   dz u   yton:r a   yton x   ww  yton  '  auq :x   ww x   ww  yton   m  yn   '  auq   m  yn  dz u k  vwfo v r a    xf  y  l '  auq   dz u mv a   g p   k'ezgsf   k'ezgsf    m  yn  k'ezgsf  -  m     ek  vwfo v      mv a     ix  g p        k  vwfo v  dz u r a  k  vwfo v x   ww y abui u  yton  dz u y  l x   ww mv a   v   grg   mv a   g p   y  l r a y  l   yton   m  yn    ix  k  vwfo v g p   y  l   m  yn  k'ezgsf  y  l   ix  g p   x   ww      y  l   yton k'ezgsf        k'ezgsf  x   ww  '  auq  x   ww-k  vwfo v x   wwx   ww     -y  l mv a   v   grg    m  yn :r a    ix  r a  g p     m  yn :  yton y  l    -v   grg   r a x   wwg p     m  yn  y abui u x   ww x   ww g p   y abui u"));
//        System.out.println(TopWords.top3(Stream
//                .of("In a village of La Mancha, the name of which I have no desire to call to",
//                        "mind, there lived not long since one of those gentlemen that keep a lance",
//                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
//                        "coursing. An olla of rather more beef than mutton, a salad on most",
//                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
//                        "on Sundays, made away with three-quarters of his income.")
//                .collect(Collectors.joining("\n")) ));


//        System.out.println(Solution.solve("100*b/y"));
//        System.out.println(Solution.solve("a+b-c/d*30"));
//        System.out.println(Solution.solve("a*b/c+50"));
//        System.out.println(Solution.solve("54/84/i+h-i/l-t+c/15/f/u-6+f-64/15"));
//        String s = "54/84/i+h-i/l-t+c/15/f/u-6+f-64/15";
//        System.out.println(s.indexOf("f", 22));


//        System.out.println(LineNumbering.number(Arrays.asList("a", "b", "c")));
//        System.out.println(LineNumbering.number(Arrays.asList("", "", "", "", "")));


//        System.out.println(TimeUtils.convertTime(900061));
//        System.out.println(TimeUtils.convertTime(-90061));
//        System.out.println(TimeUtils.convertTime(93660));
//        System.out.println(TimeUtils.convertTime(7260));
//        System.out.println(TimeUtils.convertTime(98));
//        System.out.println(TimeUtils.convertTime(-33));


//        FindOccurrence occurrence = new FindOccurrence();
//        String string = "This is an example. Return the nth occurrence of example in this example string.";
//        System.out.println(occurrence.findOccurrence("example", string, 3));
//
//        System.out.println(occurrence.findOccurrence("TestTest", "TestTestTestTest", 4));


//        String[][] tests = {
//                {"hello", "0.1.2.2.3"},
//                {"heLlo", "0.1.2.2.3"},
//                {"helLo", "0.1.2.2.3"},
//                {"Hippopotomonstrosesquippedaliophobia", "0.1.2.2.3.2.3.4.3.5.3.6.7.4.8.3.7.9.7.10.11.1.2.2.9.12.13.14.1.3.2.0.3.15.1.13"},
//        };
//        for(String[] arr: tests){
//            System.out.println(Crypto.wordPattern(arr[0]));
//        }


//        String[] array = new String [] {"Begin on Road A","Right on Road B","Right on Road C","Left on Road D"};
//        System.out.println(Arrays.toString(Solution.solve(array)));
//
//        String[] objects = IntStream.rangeClosed(1, array.length)
//                .mapToObj(i -> array[array.length - i])
//                .toArray(String[]::new);
//
//        System.out.println(Arrays.toString(objects));


//        System.out.println(Kata.dutyFree(12, 50, 1000));
//        System.out.println(Kata.dutyFree(17,10,500));
//        System.out.println(Kata.dutyFree(24,35,300));

//        System.out.println(Kata.subtractSum(10));
//        System.out.println(Kata.subtractSum(325));


//        Solution sol = new Solution();
//        System.out.println(Arrays.toString(sol.splitByValue(5, new int[]{1, 3, 5, 7, 6, 4, 2})));


//        System.out.println(Kata.alternateCase("abc"));


//        System.out.println(Solution.solveReverse("codewars"));
//        System.out.println(Solution.solveReverse("your code"));
//        System.out.println(Solution.solveReverse("qzndndzpgksa rj moblgswmcrvqxotpfk jobocy yamp zx foek eawkhr"));
//        System.out.println(Solution.solveReverse("oxsrqwzo xlgbeuwbuyyzwdyfsulitmoyfozt tyzkdddyvuvd hdawfwiqgsqv osdwbmis pybwggukgtylxzqu faee czdjahpvh"));
//        System.out.println(Solution.solveReverse("voexjfaw mb ajlf oaeviv yufq dxrvoxmcrxsxprgjqbfchxvf czmy hihqhonj ybul lpiq ig xb yl dmyf hn djqqjm ylyc idul cn fo jdcbybyzsk nwmqut"));


//        System.out.println(HQ.HQ9('9'));


//        System.out.println(FindOdd.findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));


//        CodeWars objTF = new CodeWars();
//        System.out.println(objTF.encode("hey"));
//        System.out.println(objTF.decode("100111111000111001000010000111111000000111001111000111110110111000010111"));


        System.out.println(Solution.solve(9999999999L));
//        System.out.println(Solution.solve(999999999999999999L));
//        System.out.println(Solution.nthNumber(123456789999999L));
//        System.out.println(Solution.nthNumber100(33));

    }

}
