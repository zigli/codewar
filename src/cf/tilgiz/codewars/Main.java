package cf.tilgiz.codewars;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {

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

//        System.out.println(Runtime.getRuntime().availableProcessors());
//        long START_TIME = System.currentTimeMillis();
//        System.out.println(Solution.passwordCracker("4330e2971cd93ada66ce16735a4f28e002fce20d"));
//        System.out.println(Solution.passwordCracker("592a6e96e2417c82f570b318e37dfb3dac7ab68a"));
//        System.out.println(Solution.passwordCracker("4faf17233b46977774e50235ad81818571294a5b"));
//        System.out.println(Solution.passwordCracker("b31471ac6288900f967649e2b6594b57feb6ce5f"));
//        System.out.println(Solution.passwordCracker("8f2dbbdf4dd1b70d00b87ce3786ed11847fda2e1"));
//        System.out.println(Solution.passwordCracker("b54950fd34f2c35c32971c1867a3d323e0f45938"));
//        System.out.println(Solution.passwordCracker("3929b84d0cff7394ceb3a9651c7624cbe80fbbc5"));
//        System.out.println(Solution.passwordCracker("a67acd6e68f872b807a1c9afe3a2453564e57877"));
//        System.out.println(Solution.passwordCracker("da39a3ee5e6b4b0d3255bfef95601890afd80709"));
//        long STOP_TIME = System.currentTimeMillis();
//        long duration = STOP_TIME - START_TIME;
//        System.out.println("Password cracked in " + TimeUnit.MILLISECONDS.toSeconds(duration) + "." + TimeUnit.MILLISECONDS.toMillis(duration) + " sec.");
//
//        System.out.println(Solution.getSha1(""));
//        System.out.println(Solution.getSha1("qak"));
//        System.out.println(Solution.getSha1("nnnnn"));
//        System.out.println(Solution.getSha12("z"));

//        System.out.println(Solution.passwordCracker("f7a9e24777ec23212c54d7a350bc5bea5477fdbb"));


//        System.out.println(TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
//        System.out.println(TopWords.top3("e e e e     ddd  d : ddd ddd aa a   a bb cc c  e e e"));
//        System.out.println(TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
//        System.out.println(TopWords.top3("  //wont won't won't "));
//        System.out.println(TopWords.top3("  , e   .. "));
//        System.out.println(TopWords.top3("  ...  "));
//        System.out.println(TopWords.top3("  '  "));
//        System.out.println(TopWords.top3("  '''  "));
//        System.out.println(TopWords.top3("utrnooqrht utrnooqrht utrnooqrht utrnooqrht utrnooqrht-utrnooqrhtutrnooqrhtutrnooqrht"));
//        System.out.println(TopWords.top3("kJyuKwyn;cMVrMrtZZV zdRci;zdRci kJyuKwyn:zdRci;EIBItHJ!cMVrMrtZZV OulVYjwmpN;KPTib zdRci OulVYjwmpN bXJ_zdRci?cMVrMrtZZV EIBItHJ cMVrMrtZZV OulVYjwmpN OulVYjwmpN hgwO cMVrMrtZZV;zdRci OulVYjwmpN/hgwO hgwO!OulVYjwmpN/hgwO_OulVYjwmpN:cMVrMrtZZV?OulVYjwmpN KPTib.hgwO KPTib?KPTib:OulVYjwmpN?zdRci/zdRci,hgwO_OulVYjwmpN cMVrMrtZZV/cMVrMrtZZV!zdRci cMVrMrtZZV.OulVYjwmpN OulVYjwmpN,hgwO,cMVrMrtZZV zdRci!kJyuKwyn-EIBItHJ-KPTib KPTib/bXJ,bXJ hgwO hgwO?KPTib!zdRci hgwO:OulVYjwmpN bXJ:bXJ OulVYjwmpN-hgwO_bXJ:bXJ hgwO OulVYjwmpN bXJ!hgwO:OulVYjwmpN hgwO/bXJ/bXJ KPTib bXJ KPTib/hgwO EIBItHJ hgwO OulVYjwmpN!OulVYjwmpN cMVrMrtZZV.cMVrMrtZZV!OulVYjwmpN.OulVYjwmpN bXJ;zdRci!KPTib,EtVLcDI hgwO hgwO bXJ_KPTib OulVYjwmpN bXJ;bXJ hgwO cMVrMrtZZV bXJ OulVYjwmpN,cMVrMrtZZV!OulVYjwmpN zdRci.bXJ KPTib:OulVYjwmpN/OulVYjwmpN zdRci "));
//        System.out.println(TopWords.top3("UOZhELE kbHS CPBOJFNOW uxV UOZhELE AfOQVEUjU BzZXl.kbHS HpvoyTM!NIg?CPBOJFNOW CPBOJFNOW?RvIoyKbGP uxV-kieVRRFJQr BzZXl kbHS WhzvcWQUu:SJxw uxV mOEnCWLcy NIg:RvIoyKbGP WhzvcWQUu ukTNnhiKBB-NIg.CPBOJFNOW:bLtIJxbQKs,kbHS/NIg mOEnCWLcy/zwDeHrg HpvoyTM kieVRRFJQr-BzZXl BzZXl SJxw Ly'z.bLtIJxbQKs BzZXl BzZXl kieVRRFJQr_CPBOJFNOW/AfOQVEUjU BzZXl SJxw rGQtNy'LRh RvIoyKbGP CPBOJFNOW,Ly'z_SJxw:WhzvcWQUu kieVRRFJQr?CPBOJFNOW mOEnCWLcy Ly'z AfOQVEUjU FPBT;WhzvcWQUu,uxV kieVRRFJQr BzZXl kbHS;NIg-NIg mOEnCWLcy-NIg rGQtNy'LRh FPBT-AfOQVEUjU.SJxw/HpvoyTM:AfOQVEUjU AfOQVEUjU/uxV;uxV_SJxw?bLtIJxbQKs SJxw CPBOJFNOW_mOEnCWLcy NIg?zwDeHrg FPBT BzZXl,CPBOJFNOW kieVRRFJQr.RvIoyKbGP?kieVRRFJQr uxV RvIoyKbGP BzZXl BzZXl/bLtIJxbQKs?rGQtNy'LRh NIg?HpvoyTM_WhzvcWQUu FPBT SJxw WhzvcWQUu;Ly'z/CPBOJFNOW HpvoyTM bLtIJxbQKs uxV?NIg mOEnCWLcy.bLtIJxbQKs bLtIJxbQKs SJxw HpvoyTM rGQtNy'LRh uxV,uxV BzZXl:Ly'z!FPBT rGQtNy'LRh kbHS SJxw:AfOQVEUjU?NIg kbHS BzZXl!bLtIJxbQKs-rGQtNy'LRh bLtIJxbQKs_NIg uxV,CPBOJFNOW:rGQtNy'LRh CPBOJFNOW ukTNnhiKBB FPBT_bLtIJxbQKs BzZXl_HpvoyTM;WhzvcWQUu HpvoyTM.UOZhELE-WhzvcWQUu kbHS RvIoyKbGP SJxw RvIoyKbGP-uxV_NIg Ly'z AfOQVEUjU-HpvoyTM!CPBOJFNOW/FPBT,BzZXl kbHS!SJxw Ly'z zwDeHrg-WhzvcWQUu:HpvoyTM,HpvoyTM FPBT SJxw_kieVRRFJQr Ly'z tttuXsllx BzZXl;SJxw:Ly'z:RvIoyKbGP rGQtNy'LRh:mOEnCWLcy,RvIoyKbGP RvIoyKbGP-WhzvcWQUu kieVRRFJQr RvIoyKbGP.FPBT,bLtIJxbQKs-bLtIJxbQKs;zwDeHrg uxV ukTNnhiKBB AfOQVEUjU SJxw kbHS_CPBOJFNOW RvIoyKbGP AfOQVEUjU CPBOJFNOW,uxV HpvoyTM,rGQtNy'LRh mOEnCWLcy FPBT!CPBOJFNOW/mOEnCWLcy-kbHS bLtIJxbQKs.bLtIJxbQKs/Ly'z.uxV AfOQVEUjU/kbHS!kieVRRFJQr!AfOQVEUjU_uxV SJxw FPBT-AfOQVEUjU!SJxw:BzZXl FPBT uxV RvIoyKbGP FPBT SJxw CPBOJFNOW kbHS bLtIJxbQKs-WhzvcWQUu Ly'z;AfOQVEUjU:Ly'z BzZXl bLtIJxbQKs.BzZXl?RvIoyKbGP RvIoyKbGP FPBT:HpvoyTM RvIoyKbGP_HpvoyTM/bLtIJxbQKs!SJxw!CPBOJFNOW RvIoyKbGP.BzZXl!RvIoyKbGP!BzZXl:NIg!rGQtNy'LRh bLtIJxbQKs HpvoyTM SJxw/bLtIJxbQKs AfOQVEUjU SJxw FPBT WhzvcWQUu BzZXl/kbHS HpvoyTM,FPBT:RvIoyKbGP rGQtNy'LRh-kbHS UOZhELE uxV Ly'z,mOEnCWLcy/rGQtNy'LRh CPBOJFNOW.kieVRRFJQr:AfOQVEUjU kbHS SJxw;AfOQVEUjU SJxw NIg;FPBT.kbHS kbHS_SJxw SJxw,AfOQVEUjU,mOEnCWLcy kieVRRFJQr WhzvcWQUu bLtIJxbQKs:bLtIJxbQKs Ly'z:CPBOJFNOW!SJxw:CPBOJFNOW.bLtIJxbQKs,NIg rGQtNy'LRh HpvoyTM-uxV AfOQVEUjU AfOQVEUjU_Ly'z AfOQVEUjU UOZhELE,RvIoyKbGP:kbHS?kbHS:RvIoyKbGP AfOQVEUjU?NIg-NIg Ly'z-bLtIJxbQKs/CPBOJFNOW_SJxw BzZXl;Ly'z rGQtNy'LRh FPBT/kbHS-BzZXl SJxw:WhzvcWQUu/kbHS.uxV RvIoyKbGP BzZXl:mOEnCWLcy HpvoyTM mOEnCWLcy?bLtIJxbQKs:WhzvcWQUu,FPBT bLtIJxbQKs;RvIoyKbGP mOEnCWLcy BzZXl-SJxw-bLtIJxbQKs/kieVRRFJQr;bLtIJxbQKs FPBT AfOQVEUjU SJxw!kieVRRFJQr-bLtIJxbQKs?WhzvcWQUu NIg NIg uxV FPBT/AfOQVEUjU_NIg kbHS/CPBOJFNOW"));
        String s = "HufMGJD USQV-Oljik'ryRk IkhzqjX;siFHa DlEzyTOX IkhzqjX ELwQWJcjV!kkYWM.PDdMz/kkYWM heeMDcbgoi,PDdMz kOfJTvxI_Oljik'ryRk?Oljik'ryRk/IkhzqjX?USQV-kkYWM:IkhzqjX HufMGJD!dBjJic?kkYWM heeMDcbgoi-USQV_PDdMz HufMGJD!YAzLghVz siFHa Oljik'ryRk,jlhd:PDdMz IkhzqjX!Oljik'ryRk dBjJic Oljik'ryRk heeMDcbgoi;rgATos jlhd YAzLghVz kkYWM/USQV,GuZ HufMGJD;PDdMz IkhzqjX siFHa YAzLghVz;USQV HufMGJD Oljik'ryRk/rgATos!jlhd HufMGJD oQR'y HufMGJD;YAzLghVz Oljik'ryRk-ELwQWJcjV;kkYWM!GuZ kkYWM dBjJic:jlhd ELwQWJcjV;USQV/jlhd HufMGJD?kkYWM dBjJic:dBjJic DlEzyTOX rgATos!rgATos,kkYWM heeMDcbgoi kkYWM siFHa;YAzLghVz Oljik'ryRk,YAzLghVz PDdMz IkhzqjX HufMGJD:USQV kkYWM?IkhzqjX_siFHa PDdMz YAzLghVz-IkhzqjX/jlhd kkYWM_IkhzqjX PDdMz:GuZ,YAzLghVz DlEzyTOX USQV_PDdMz PDdMz?DlEzyTOX:heeMDcbgoi PDdMz-IkhzqjX YAzLghVz!YAzLghVz kkYWM,ELwQWJcjV HufMGJD.Oljik'ryRk-Oljik'ryRk?heeMDcbgoi jlhd.jlhd?DlEzyTOX kkYWM wBwTFIVgy rgATos!PDdMz IkhzqjX:USQV IkhzqjX dBjJic:Oljik'ryRk heeMDcbgoi_IkhzqjX.kkYWM YAzLghVz siFHa IkhzqjX HufMGJD siFHa,kkYWM USQV_YAzLghVz wBwTFIVgy rgATos!GuZ USQV IkhzqjX PDdMz PDdMz IkhzqjX:dBjJic YAzLghVz PDdMz siFHa dBjJic HufMGJD_GuZ-jlhd PDdMz?heeMDcbgoi kOfJTvxI HufMGJD DlEzyTOX kkYWM DlEzyTOX HufMGJD,HufMGJD rgATos!rgATos,HufMGJD kkYWM:jlhd?jlhd/PDdMz wBwTFIVgy!rgATos!rgATos jlhd kkYWM USQV?USQV;kkYWM:dBjJic DlEzyTOX/dBjJic kkYWM dBjJic kkYWM IkhzqjX.dBjJic DlEzyTOX-USQV-kkYWM PDdMz jlhd HufMGJD USQV_kkYWM_ELwQWJcjV,GuZ oQR'y?jlhd Oljik'ryRk/ELwQWJcjV USQV dBjJic:siFHa wBwTFIVgy PDdMz?kkYWM dBjJic dBjJic,ELwQWJcjV-dBjJic?heeMDcbgoi:heeMDcbgoi-YAzLghVz PDdMz kOfJTvxI jlhd:kOfJTvxI,siFHa HufMGJD;IkhzqjX/DlEzyTOX HufMGJD;USQV:kOfJTvxI_ELwQWJcjV rgATos GuZ_dBjJic HufMGJD dBjJic dBjJic jlhd PDdMz?DlEzyTOX HufMGJD oQR'y.kkYWM-USQV-siFHa jlhd HufMGJD-PDdMz/IkhzqjX HufMGJD/heeMDcbgoi HufMGJD YAzLghVz:Oljik'ryRk:wBwTFIVgy/USQV;IkhzqjX_wBwTFIVgy USQV siFHa heeMDcbgoi wBwTFIVgy,jlhd;heeMDcbgoi:YAzLghVz.heeMDcbgoi_kkYWM DlEzyTOX PDdMz,IkhzqjX YAzLghVz.siFHa HufMGJD!IkhzqjX kkYWM IkhzqjX_ELwQWJcjV?dBjJic;Oljik'ryRk-GuZ kkYWM IkhzqjX kkYWM YAzLghVz YAzLghVz.HufMGJD jlhd-heeMDcbgoi.IkhzqjX USQV.DlEzyTOX.dBjJic Oljik'ryRk HufMGJD_PDdMz IkhzqjX IkhzqjX ELwQWJcjV dBjJic HufMGJD \n" +
                "\n" +
                "CPYz!ZWMa kJVglh ZWMa:CPYz tmLvcOe CPYz ddsnr!ZWMa UxPQvaU/CPYz MEw_rUEiMnq oyk!ZWMa UxPQvaU?MEw ZWMa UxPQvaU ZWMa,tmLvcOe oyk oyk;ZWMa:ZWMa?kJVglh kJVglh!GLLHTLs?MEw?tmLvcOe kJVglh ddsnr GLLHTLs GLLHTLs tmLvcOe,UxPQvaU,MEw UxPQvaU UxPQvaU!UxPQvaU-UxPQvaU!tmLvcOe,oyk rUEiMnq UxPQvaU tmLvcOe:kJVglh ZWMa?kJVglh MEw MEw CPYz!CPYz.ZWMa-ZWMa GLLHTLs CPYz kOA:oyk ZWMa ddsnr;ZWMa UxPQvaU CPYz?UxPQvaU MEw UxPQvaU oyk CPYz/tmLvcOe ddsnr CPYz kJVglh;tmLvcOe_ddsnr UxPQvaU_CPYz ZWMa oyk,UxPQvaU oyk tmLvcOe,tmLvcOe tmLvcOe-kJVglh CPYz MEw UxPQvaU UxPQvaU-kJVglh?ZWMa ZWMa UxPQvaU:ZWMa rUEiMnq tmLvcOe ZWMa CPYz?ddsnr,CPYz rUEiMnq rUEiMnq.MEw UxPQvaU ddsnr_rUEiMnq.kJVglh?UxPQvaU YKzNsMYT-oyk rUEiMnq CPYz ddsnr.ZWMa ZWMa kJVglh/kJVglh tmLvcOe UhzuxYTOc.tmLvcOe CPYz_rUEiMnq;CPYz UxPQvaU MEw UxPQvaU GLLHTLs UxPQvaU/ZWMa-kJVglh rUEiMnq?CPYz MEw CPYz_tmLvcOe kJVglh.rUEiMnq CPYz,UxPQvaU?UxPQvaU ZWMa_CPYz_ZWMa kJVglh;YKzNsMYT;CPYz MEw;tmLvcOe!tmLvcOe_ZWMa kJVglh:GLLHTLs rUEiMnq CPYz \n" +
                "\n" +
                "WdxL fqnDQ.BgGszHdpXx_fqnDQ yMI eZNTbA!TPPbE iBpaOHfPT/YzvNscT BgGszHdpXx,uYr fqnDQ uYr dfekR' ycXT DUsg uYr TPPbE fqnDQ/FuMMg-eZNTbA zzXY.FuMMg giMFW.fqnDQ/yMI TPPbE:dfekR'.zzXY!zzXY WdxL yMI BgGszHdpXx/YzvNscT:iBpaOHfPT yMI,eiOjoPgv,lVNoLmFiTs?TPPbE/fqnDQ fqnDQ TPPbE WdxL giMFW TPPbE nhnXx uYr YzvNscT-uYr yMI fqnDQ eZNTbA/eiOjoPgv.TPPbE eZNTbA FuMMg.lVNoLmFiTs eiOjoPgv,iBpaOHfPT!fqnDQ;dfekR'?uYr fqnDQ ycXT.iBpaOHfPT,YzvNscT,KJyv:ycXT eiOjoPgv-KJyv TPPbE-fqnDQ:uYr,ycXT!FuMMg?WdxL!iBpaOHfPT?DUsg:eiOjoPgv,FuMMg iBpaOHfPT KJyv/lVNoLmFiTs.FuMMg-lVNoLmFiTs fqnDQ TPPbE;lVNoLmFiTs uYr fqnDQ FuMMg-iBpaOHfPT fqnDQ:BgGszHdpXx eiOjoPgv,iBpaOHfPT TPPbE giMFW?YzvNscT uYr lVNoLmFiTs WdxL fqnDQ KJyv BgGszHdpXx YzvNscT iBpaOHfPT DUsg dfekR'-TPPbE_QbCCk!eZNTbA-yMI QbCCk KJyv FuMMg iBpaOHfPT KJyv?lVNoLmFiTs nhnXx lVNoLmFiTs FuMMg lVNoLmFiTs!YzvNscT uYr TPPbE-fqnDQ_FuMMg iBpaOHfPT_BgGszHdpXx-FuMMg_uYr giMFW?iBpaOHfPT,yMI:lVNoLmFiTs:BgGszHdpXx/ycXT uYr uYr QbCCk-YzvNscT;TPPbE:dfekR' FuMMg uYr fqnDQ/uYr yMI YzvNscT.FuMMg FuMMg.lVNoLmFiTs,WdxL eZNTbA giMFW eiOjoPgv-YzvNscT/ycXT/fqnDQ-yMI TPPbE,eZNTbA;eiOjoPgv,WdxL YzvNscT/YzvNscT;yMI:yMI ycXT uYr eiOjoPgv WdxL uYr_YzvNscT!DUsg/QbCCk lVNoLmFiTs.dfekR'!ycXT lVNoLmFiTs iBpaOHfPT YzvNscT TPPbE/uYr iBpaOHfPT lVNoLmFiTs FuMMg YzvNscT-BgGszHdpXx lVNoLmFiTs?DUsg,zzXY KJyv.yMI lVNoLmFiTs FuMMg.KJyv.QbCCk ycXT TPPbE eiOjoPgv_eiOjoPgv YzvNscT?KJyv?uYr_YzvNscT_BgGszHdpXx TPPbE uYr fqnDQ.ycXT FuMMg ycXT.BgGszHdpXx/eZNTbA;lVNoLmFiTs.yMI-WdxL TPPbE YzvNscT fqnDQ!KJyv yMI giMFW BgGszHdpXx;dfekR'.FuMMg fqnDQ fqnDQ;fqnDQ!fqnDQ fqnDQ?yMI KJyv zzXY,uYr.lVNoLmFiTs BgGszHdpXx_FuMMg iBpaOHfPT BgGszHdpXx WdxL WdxL YzvNscT fqnDQ:dfekR'-yMI?zzXY zzXY,KJyv eiOjoPgv lVNoLmFiTs DUsg yMI giMFW!uYr:ycXT!YzvNscT lVNoLmFiTs.TPPbE eiOjoPgv eiOjoPgv yMI FuMMg!uYr;fqnDQ iBpaOHfPT!lVNoLmFiTs?TPPbE?BgGszHdpXx?iBpaOHfPT WdxL/eiOjoPgv fqnDQ!yMI,nhnXx ycXT WdxL_iBpaOHfPT-YzvNscT-iBpaOHfPT ycXT;KJyv lVNoLmFiTs WdxL fqnDQ!yMI?iBpaOHfPT!FuMMg DUsg,dfekR' uYr eiOjoPgv?TPPbE:FuMMg yMI:WdxL WdxL yMI.yMI YzvNscT TPPbE-eiOjoPgv TPPbE TPPbE TPPbE dfekR'.yMI lVNoLmFiTs FuMMg?uYr ycXT DUsg uYr;dfekR' FuMMg lVNoLmFiTs DUsg BgGszHdpXx:eiOjoPgv TPPbE YzvNscT \n" +
                "\n" +
                "oPMRRdcxEl FXOZTzKx FXOZTzKx-VQozXUD,YjJdRqZG xXTMdUAqsC-FXOZTzKx_VQozXUD NmxoFZLFzC EGg VQozXUD RCMuxtqWw VQozXUD:wTAysF wTAysF!wTAysF/oPImwc VQozXUD-oPImwc:oPImwc:RCMuxtqWw!xXTMdUAqsC-EGg?EGg NmxoFZLFzC FXOZTzKx VQozXUD oPMRRdcxEl YjJdRqZG,oPImwc EGg oPImwc EGg VQozXUD RCMuxtqWw RCMuxtqWw?VQozXUD.gWmM'sFCyp RCMuxtqWw,FXOZTzKx VQozXUD oPImwc xXTMdUAqsC VQozXUD VQozXUD gWmM'sFCyp VQozXUD xXTMdUAqsC.FXOZTzKx YjJdRqZG.VQozXUD_gWmM'sFCyp:xXTMdUAqsC YjJdRqZG-FXOZTzKx VQozXUD RCMuxtqWw YjJdRqZG RCMuxtqWw EGg xXTMdUAqsC FXOZTzKx:VQozXUD-oPImwc FXOZTzKx oPMRRdcxEl wTAysF/NmxoFZLFzC.RCMuxtqWw xXTMdUAqsC?jJSUzIaj jJSUzIaj.RCMuxtqWw,VQozXUD_EGg/VQozXUD YjJdRqZG jJSUzIaj,VQozXUD NmxoFZLFzC oPMRRdcxEl/FXOZTzKx EGg VQozXUD!xXTMdUAqsC!oPMRRdcxEl NmxoFZLFzC VQozXUD RCMuxtqWw,YjJdRqZG RCMuxtqWw YjJdRqZG?RCMuxtqWw VQozXUD-wTAysF,NmxoFZLFzC-RCMuxtqWw?FXOZTzKx YjJdRqZG/YjJdRqZG RCMuxtqWw.VQozXUD VQozXUD oPImwc FXOZTzKx:YjJdRqZG VQozXUD RCMuxtqWw FXOZTzKx xXTMdUAqsC RCMuxtqWw YjJdRqZG,FXOZTzKx/VQozXUD FXOZTzKx EGg.FXOZTzKx!YjJdRqZG gWmM'sFCyp gWmM'sFCyp!wTAysF.RCMuxtqWw:YjJdRqZG/oPMRRdcxEl,VQozXUD?EGg gWmM'sFCyp!VQozXUD-VQozXUD EGg,RCMuxtqWw FXOZTzKx oPImwc gWmM'sFCyp-EGg RCMuxtqWw RCMuxtqWw!FXOZTzKx VQozXUD oPImwc jJSUzIaj.NmxoFZLFzC?\n" +
                "\n" +
                "Xg'sRKTbyF Xg'sRKTbyF Xg'sRKTbyF-XiObYWmS Yhi_Yhi-XiObYWmS,XiObYWmS;Yhi!Xg'sRKTbyF Xg'sRKTbyF/XiObYWmS Xg'sRKTbyF;Xg'sRKTbyF;Yhi_Yhi XiObYWmS Xg'sRKTbyF.M'JrvRGwQ.NydPwWKz/V'iZ'tqg Yhi!Xg'sRKTbyF,Yhi?XiObYWmS,NydPwWKz XiObYWmS!Xg'sRKTbyF.XiObYWmS.NydPwWKz.Xg'sRKTbyF Xg'sRKTbyF-Yhi V'iZ'tqg M'JrvRGwQ V'iZ'tqg Xg'sRKTbyF?V'iZ'tqg.NydPwWKz V'iZ'tqg.Xg'sRKTbyF XiObYWmS,XiObYWmS M'JrvRGwQ XiObYWmS.V'iZ'tqg_NydPwWKz:NydPwWKz Xg'sRKTbyF,XiObYWmS V'iZ'tqg Xg'sRKTbyF V'iZ'tqg M'JrvRGwQ_XiObYWmS Xg'sRKTbyF;NydPwWKz.V'iZ'tqg_Yhi Yhi.NydPwWKz Xg'sRKTbyF:XiObYWmS V'iZ'tqg_Xg'sRKTbyF Xg'sRKTbyF Xg'sRKTbyF?V'iZ'tqg V'iZ'tqg!M'JrvRGwQ!XiObYWmS-V'iZ'tqg/V'iZ'tqg M'JrvRGwQ.XiObYWmS M'JrvRGwQ?XiObYWmS XiObYWmS XiObYWmS Yhi M'JrvRGwQ M'JrvRGwQ XiObYWmS Yhi!V'iZ'tqg?Xg'sRKTbyF XiObYWmS V'iZ'tqg V'iZ'tqg Yhi V'iZ'tqg XiObYWmS,Xg'sRKTbyF Yhi,XiObYWmS V'iZ'tqg Xg'sRKTbyF Xg'sRKTbyF?V'iZ'tqg;V'iZ'tqg.Xg'sRKTbyF:Yhi,V'iZ'tqg!Yhi Xg'sRKTbyF-V'iZ'tqg:V'iZ'tqg:V'iZ'tqg \n" +
                "\n" +
                "usJnCIyT_TcDFSMskp?z'i:OKnyJ WMsvf OKnyJ BaJzzqjBMe.WMsvf BaJzzqjBMe,Pulnm KaIeLLYdL.KaIeLLYdL,WMsvf:OKnyJ-BaJzzqjBMe:TcDFSMskp BaJzzqjBMe usJnCIyT/ZGi z'i_TcDFSMskp:ZGi OKnyJ/CjsMFnvjBD-dUAhbc/OKnyJ taU KaIeLLYdL/OKnyJ:Pulnm,CjsMFnvjBD bIoFytD/TcDFSMskp JEuTGjyvL,dUAhbc YFUw_z'i/ZGi z'i_z'i-KaIeLLYdL KaIeLLYdL z'i/CjsMFnvjBD?fAsmhrOUxy.OKnyJ/ZGi,BaJzzqjBMe_z'i YFUw/LruTPSq ZGi.Pulnm JEuTGjyvL WMsvf:KaIeLLYdL:taU dcoPtcUg TcDFSMskp WMsvf Pulnm!usJnCIyT/z'i;dcoPtcUg_dUAhbc!TcDFSMskp JEuTGjyvL/JEuTGjyvL,dUAhbc z'i/JEuTGjyvL dUAhbc WMsvf;dUAhbc!z'i usJnCIyT_Pulnm KaIeLLYdL,usJnCIyT usJnCIyT?ZGi.dUAhbc.ZGi-z'i_z'i Pulnm BaJzzqjBMe TcDFSMskp LruTPSq CjsMFnvjBD dUAhbc-KaIeLLYdL ZGi Pulnm/dUAhbc_bIoFytD LruTPSq,ZGi;KaIeLLYdL/fAsmhrOUxy Pulnm LruTPSq OKnyJ usJnCIyT.KaIeLLYdL;LruTPSq;ZGi WMsvf-usJnCIyT bIoFytD_Pulnm fAsmhrOUxy_WMsvf fAsmhrOUxy KaIeLLYdL WMsvf Pulnm TcDFSMskp LruTPSq dUAhbc ZGi WMsvf?BaJzzqjBMe bIoFytD-TcDFSMskp WMsvf WMsvf_WMsvf usJnCIyT CjsMFnvjBD TcDFSMskp ZGi OKnyJ-Pulnm:fAsmhrOUxy TcDFSMskp CjsMFnvjBD/Pulnm dcoPtcUg fAsmhrOUxy!ZGi ZGi ZGi usJnCIyT;KaIeLLYdL CjsMFnvjBD;dcoPtcUg OKnyJ ZGi-bIoFytD.bIoFytD dcoPtcUg bIoFytD Pulnm;bIoFytD WMsvf-bIoFytD dUAhbc bIoFytD:Pulnm,KaIeLLYdL;ZGi/TcDFSMskp fAsmhrOUxy OKnyJ:dUAhbc_TcDFSMskp ZGi KaIeLLYdL.TcDFSMskp bIoFytD Pulnm/KaIeLLYdL BaJzzqjBMe OKnyJ TcDFSMskp BaJzzqjBMe,ZGi.KaIeLLYdL ZGi dcoPtcUg LruTPSq fAsmhrOUxy;KaIeLLYdL,usJnCIyT:TcDFSMskp fAsmhrOUxy!dUAhbc/WMsvf CjsMFnvjBD!ZGi.ZGi/BaJzzqjBMe,z'i dUAhbc KaIeLLYdL z'i;dUAhbc LruTPSq OKnyJ?KaIeLLYdL.OKnyJ OKnyJ/Pulnm.z'i TcDFSMskp ZGi,OKnyJ usJnCIyT KaIeLLYdL_JEuTGjyvL;Pulnm CjsMFnvjBD WMsvf ZGi,TcDFSMskp/OKnyJ WMsvf TcDFSMskp:BaJzzqjBMe Pulnm bIoFytD_TcDFSMskp OKnyJ:dcoPtcUg!OKnyJ Pulnm-fAsmhrOUxy TcDFSMskp/dcoPtcUg_KaIeLLYdL usJnCIyT!z'i KaIeLLYdL?ZGi usJnCIyT BaJzzqjBMe LruTPSq:dUAhbc OKnyJ:BaJzzqjBMe usJnCIyT YFUw-ZGi?KaIeLLYdL:KaIeLLYdL,BaJzzqjBMe JEuTGjyvL bIoFytD_KaIeLLYdL?TcDFSMskp LruTPSq/TcDFSMskp TcDFSMskp_KaIeLLYdL?LruTPSq z'i/dcoPtcUg z'i:WMsvf!BaJzzqjBMe OKnyJ WMsvf bIoFytD;BaJzzqjBMe TcDFSMskp/dUAhbc bIoFytD WMsvf z'i;fAsmhrOUxy:CjsMFnvjBD usJnCIyT_JEuTGjyvL?JEuTGjyvL:z'i Pulnm LruTPSq_KaIeLLYdL.\n" +
                "\n" +
                "YaAHZJwag_PYm UdlvRb UdlvRb UdlvRb d'J PYm d'J YaAHZJwag d'J GdsOfmyKt GdsOfmyKt_d'J-YaAHZJwag OmL YaAHZJwag:OmL!OmL,PYm_YaAHZJwag.GdsOfmyKt d'J:YaAHZJwag PYm-OmL:YaAHZJwag UdlvRb GdsOfmyKt OmL UdlvRb PYm d'J OmL-PYm PYm?YaAHZJwag,GdsOfmyKt!d'J/OmL OmL d'J UdlvRb d'J YaAHZJwag_YaAHZJwag GdsOfmyKt OmL/d'J?UdlvRb-d'J OmL.UdlvRb GdsOfmyKt.d'J UdlvRb OmL d'J UdlvRb,GdsOfmyKt,d'J d'J PYm GdsOfmyKt d'J:YaAHZJwag_d'J GdsOfmyKt.OmL:UdlvRb OmL?YaAHZJwag-d'J YaAHZJwag d'J OmL_PYm/d'J:YaAHZJwag.d'J OmL PYm d'J:d'J-OmL GdsOfmyKt d'J!GdsOfmyKt OmL YaAHZJwag,d'J PYm/UdlvRb GdsOfmyKt-d'J d'J-d'J d'J d'J GdsOfmyKt-UdlvRb_GdsOfmyKt?GdsOfmyKt!OmL \n" +
                "\n" +
                "cteiMZM_cteiMZM;dDass cteiMZM?RGv cteiMZM.AeujWm'x?xTZjX_dDass AeujWm'x ssbkmymw AeujWm'x/RGv ssbkmymw ssbkmymw_dDass ssbkmymw dDass RGv!ssbkmymw wjaqa cteiMZM QZinZW_AeujWm'x!wfQSAPy cteiMZM dDass!wjaqa,ssbkmymw xTZjX_dDass xTZjX.xTZjX wjaqa:AeujWm'x ssbkmymw dDass wfQSAPy xTZjX wjaqa RGv wjaqa;dDass:dDass-xTZjX?RGv xTZjX!xTZjX xTZjX-xTZjX?xTZjX dDass dDass_dDass xTZjX cteiMZM xTZjX:ssbkmymw:QZinZW ssbkmymw!ssbkmymw!wjaqa,ssbkmymw;cteiMZM AeujWm'x/cteiMZM?wjaqa cteiMZM_AeujWm'x!cteiMZM_QZinZW ssbkmymw xTZjX HfupjGo xTZjX AeujWm'x,dDass?wjaqa xTZjX ssbkmymw cteiMZM_ssbkmymw dDass RGv kDfO_ssbkmymw cteiMZM dDass AeujWm'x-xTZjX,AeujWm'x!AeujWm'x xTZjX ssbkmymw,xTZjX:wjaqa cteiMZM AeujWm'x xTZjX RGv;ssbkmymw.xTZjX wjaqa;RGv xTZjX AeujWm'x ssbkmymw-dDass.xTZjX.\n" +
                "\n" +
                "YLeWC?zcYwOG?mpGG eSJtwhHh/mpGG eSJtwhHh zcYwOG zcYwOG;mHT:rQtGeUv;rQtGeUv eSJtwhHh-zcYwOG_eSJtwhHh eSJtwhHh,Xmt'' eSJtwhHh_rQtGeUv;YLeWC mpGG/YLeWC_eSJtwhHh/YLeWC!rQtGeUv;pKzFOUVk;pKzFOUVk?eSJtwhHh?mHT?mHT mHT YLeWC:eSJtwhHh:mpGG mHT-mpGG:mHT rQtGeUv-pKzFOUVk-mpGG mHT;mHT_Xmt'':zcYwOG mHT.pKzFOUVk rQtGeUv zcYwOG,zcYwOG mpGG rQtGeUv rQtGeUv:zcYwOG zcYwOG YLeWC mpGG.YLeWC.Xmt'',mHT.mpGG;rQtGeUv?Xmt''?zcYwOG?rQtGeUv rQtGeUv!rQtGeUv?eSJtwhHh:YLeWC:eSJtwhHh rQtGeUv?eSJtwhHh.mHT;mHT YLeWC!rQtGeUv YLeWC zcYwOG_rQtGeUv eSJtwhHh?eSJtwhHh zcYwOG eSJtwhHh rQtGeUv mHT zcYwOG zcYwOG:YLeWC rQtGeUv_mHT,rQtGeUv,mpGG zcYwOG!Xmt''_mpGG Xmt'' rQtGeUv!Xmt'',rQtGeUv!YLeWC-pKzFOUVk mHT!mHT mpGG/rQtGeUv Xmt'':rQtGeUv/zcYwOG Xmt'' rQtGeUv!mHT mHT,zcYwOG_YLeWC mHT Xmt''/Xmt'' zcYwOG:eSJtwhHh YLeWC;eSJtwhHh,mHT:zcYwOG-pKzFOUVk,zcYwOG-YLeWC zcYwOG!YLeWC mHT:pKzFOUVk Xmt'' zcYwOG rQtGeUv:Xmt''?rQtGeUv Xmt''-Xmt''_YLeWC zcYwOG YLeWC-rQtGeUv-YLeWC/mHT zcYwOG;eSJtwhHh eSJtwhHh.\n" +
                "\n" +
                "jUZqcb Uwl LzeodYRx'N Uwl jUZqcb jUZqcb jUZqcb jUZqcb jUZqcb:Uwl Uwl Uwl Uwl jUZqcb jUZqcb.Uwl,LzeodYRx'N-jUZqcb Uwl Uwl Uwl;Uwl Uwl;jUZqcb LzeodYRx'N:Uwl_Uwl-jUZqcb:jUZqcb:jUZqcb jUZqcb jUZqcb-Uwl-Uwl LzeodYRx'N jUZqcb Uwl jUZqcb?jUZqcb jUZqcb Uwl Uwl-jUZqcb_jUZqcb jUZqcb:jUZqcb/\n" +
                "\n" +
                "zBZUEle!EdSF!EdSF;zBZUEle_EdSF/EdSF SdDdRpC zBZUEle-SdDdRpC/SdDdRpC?zBZUEle EdSF zBZUEle EdSF SdDdRpC,zBZUEle zBZUEle_zBZUEle zBZUEle;zBZUEle,SdDdRpC zBZUEle SdDdRpC:EdSF SdDdRpC!zBZUEle_\n" +
                "\n" +
                "rRBuZwp-rRBuZwp rRBuZwp;rRBuZwp aIm/aIm?rRBuZwp!rRBuZwp.aIm aIm aIm rRBuZwp aIm aIm,rRBuZwp.aIm aIm?aIm aIm_rRBuZwp rRBuZwp aIm-aIm?rRBuZwp aIm rRBuZwp rRBuZwp aIm?aIm rRBuZwp aIm_aIm aIm rRBuZwp.rRBuZwp rRBuZwp rRBuZwp rRBuZwp aIm!\n" +
                "\n" +
                "atfxQj atfxQj?atfxQj atfxQj atfxQj \n" +
                "\n" +
                "Bls zBM!zBM zBM_dsbZAf;eWZrApn,Bls zBM zBM/Bls zBM.eWZrApn zBM eWZrApn AzXNZVzG dsbZAf Bls zBM Bls eWZrApn zBM eWZrApn-zBM Bls Bls zBM dsbZAf;zBM!zBM AzXNZVzG zBM AzXNZVzG/AzXNZVzG zBM!Bls!eWZrApn/Bls!Bls eWZrApn-zBM?zBM eWZrApn_AzXNZVzG!zBM:Bls zBM zBM-zBM AzXNZVzG?eWZrApn AzXNZVzG:eWZrApn!dsbZAf/AzXNZVzG?zBM.eWZrApn Bls,zBM;eWZrApn,eWZrApn eWZrApn zBM zBM \n" +
                "\n" +
                "DRZ tCfRTs oPY/ILX-oPY;VyNCOQ:DRZ DRZ oPY/VyNCOQ qEZjBJ VyNCOQ_OGeY.tCfRTs DRZ?ScBSCZpDhz oPY qEZjBJ VyNCOQ ScBSCZpDhz-qEZjBJ ILX.Rp'WNxzrt ILX.OGeY_ILX OGeY.tCfRTs qEZjBJ VyNCOQ qEZjBJ ScBSCZpDhz VyNCOQ?itslg OGeY ILX tCfRTs qEZjBJ-ILX.VyNCOQ ILX qEZjBJ.itslg tCfRTs VyNCOQ VyNCOQ oPY ILX/tCfRTs ScBSCZpDhz itslg;tCfRTs?tCfRTs!tCfRTs?OGeY.tCfRTs?qEZjBJ_ScBSCZpDhz/Rp'WNxzrt DRZ.VyNCOQ VyNCOQ DRZ-qEZjBJ tCfRTs?DRZ izryUiwcI/izryUiwcI OGeY tCfRTs tCfRTs:Kzy TEGd Kzy tCfRTs qEZjBJ.Kzy itslg qEZjBJ itslg;OGeY DRZ itslg qEZjBJ DRZ ScBSCZpDhz!VyNCOQ OGeY/ScBSCZpDhz hoYwEMfKTA.itslg Kzy hoYwEMfKTA DRZ?VyNCOQ.OGeY tCfRTs!izryUiwcI Kzy ScBSCZpDhz/hoYwEMfKTA?tCfRTs,ILX-itslg-tCfRTs!ScBSCZpDhz OGeY/DRZ DRZ ILX-Rp'WNxzrt?OGeY DRZ_OGeY,ScBSCZpDhz.OGeY tCfRTs!qEZjBJ DRZ/tCfRTs-VyNCOQ ILX ILX Rp'WNxzrt;tCfRTs/tCfRTs hoYwEMfKTA:VyNCOQ_VyNCOQ qEZjBJ,DRZ qEZjBJ-qEZjBJ;DRZ_VyNCOQ VyNCOQ VyNCOQ;VyNCOQ/tCfRTs qEZjBJ ILX_ILX-qEZjBJ!qEZjBJ.ILX tCfRTs?oPY qEZjBJ_DRZ!ILX;oPY!ILX?ILX oPY ILX?tCfRTs:VyNCOQ.VyNCOQ itslg oPY qEZjBJ_VyNCOQ VyNCOQ;Rp'WNxzrt-qEZjBJ qEZjBJ VyNCOQ-VyNCOQ-dpM'WpkHP itslg DRZ?tCfRTs tCfRTs.tCfRTs OGeY?itslg OGeY_oPY itslg,oPY!oPY OGeY;ILX.itslg?OGeY DRZ?itslg tCfRTs itslg_OGeY qEZjBJ qEZjBJ ILX DRZ qEZjBJ_oPY Rp'WNxzrt qEZjBJ/hoYwEMfKTA/tCfRTs \n" +
                "\n" +
                "rWzTOHZED_UkgOOHRGPC pbBCeZ rWzTOHZED rWzTOHZED/rWzTOHZED/pbBCeZ-rWzTOHZED pbBCeZ:rWzTOHZED UkgOOHRGPC!qOyRRxCb!rWzTOHZED pbBCeZ pbBCeZ pbBCeZ.pbBCeZ pbBCeZ;pbBCeZ/qOyRRxCb;pbBCeZ rWzTOHZED-qOyRRxCb qOyRRxCb rWzTOHZED qOyRRxCb qOyRRxCb qOyRRxCb rWzTOHZED!rWzTOHZED;qOyRRxCb UkgOOHRGPC.UkgOOHRGPC.qOyRRxCb.qOyRRxCb pbBCeZ;pbBCeZ rWzTOHZED-UkgOOHRGPC_rWzTOHZED UkgOOHRGPC pbBCeZ?rWzTOHZED qOyRRxCb UkgOOHRGPC/pbBCeZ pbBCeZ rWzTOHZED rWzTOHZED/qOyRRxCb!rWzTOHZED pbBCeZ rWzTOHZED_rWzTOHZED:pbBCeZ_pbBCeZ rWzTOHZED.qOyRRxCb UkgOOHRGPC qOyRRxCb!rWzTOHZED_UkgOOHRGPC pbBCeZ pbBCeZ qOyRRxCb qOyRRxCb pbBCeZ pbBCeZ rWzTOHZED:rWzTOHZED!pbBCeZ_pbBCeZ qOyRRxCb pbBCeZ-qOyRRxCb:pbBCeZ qOyRRxCb qOyRRxCb \n" +
                "\n" +
                "GjncBee qDyhupm TdpbcrOcd qDyhupm/qDyhupm!iLCTScFYia?IqZoSnKG.SbYnxJr'M;GjncBee qDyhupm IqZoSnKG qDyhupm MZl.friyMRq zcY IqZoSnKG.GjncBee?IqZoSnKG qDyhupm_zcY zcY-IqZoSnKG SbYnxJr'M TdpbcrOcd,TdpbcrOcd-IqZoSnKG!iLCTScFYia/TdpbcrOcd TdpbcrOcd TdpbcrOcd;zcY TdpbcrOcd qDyhupm GjncBee MZl,TdpbcrOcd.IqZoSnKG GjncBee IqZoSnKG_SbYnxJr'M GjncBee IqZoSnKG.qDyhupm SbYnxJr'M?GjncBee TdpbcrOcd TdpbcrOcd.SbYnxJr'M:zcY-TdpbcrOcd,MZl qDyhupm_SbYnxJr'M SbYnxJr'M!SbYnxJr'M!qDyhupm TdpbcrOcd qDyhupm_TdpbcrOcd GjncBee,IqZoSnKG zcY iLCTScFYia-qDyhupm SbYnxJr'M IqZoSnKG MZl-iLCTScFYia qDyhupm TdpbcrOcd SbYnxJr'M!qDyhupm,qDyhupm,IqZoSnKG qDyhupm IqZoSnKG friyMRq GjncBee?IqZoSnKG SbYnxJr'M-GjncBee.TdpbcrOcd?IqZoSnKG.MZl zcY.IqZoSnKG friyMRq-qDyhupm zcY-qDyhupm MZl:GjncBee?TdpbcrOcd:MZl zcY:GjncBee zcY SbYnxJr'M!SbYnxJr'M IqZoSnKG qDyhupm,TdpbcrOcd,MZl!GjncBee TdpbcrOcd;friyMRq?TdpbcrOcd:GjncBee iLCTScFYia;IqZoSnKG_zcY iLCTScFYia;IqZoSnKG-TdpbcrOcd qDyhupm IqZoSnKG_zcY.qDyhupm qDyhupm/IqZoSnKG iLCTScFYia friyMRq IqZoSnKG!friyMRq qDyhupm SbYnxJr'M?zcY iLCTScFYia qDyhupm TdpbcrOcd IqZoSnKG MZl/GjncBee,qDyhupm?friyMRq:qDyhupm!IqZoSnKG iLCTScFYia zcY!IqZoSnKG IqZoSnKG iLCTScFYia;MZl friyMRq GjncBee_zcY-SbYnxJr'M IqZoSnKG zcY?GjncBee qDyhupm qDyhupm-qDyhupm MZl qDyhupm TdpbcrOcd SbYnxJr'M,zcY SbYnxJr'M,\n" +
                "\n" +
                "cCga''XpT rgIwqzFCR vrEfq-hGMm,QyyEwBb.JPljFp pOrfX QyyEwBb DkvZ cCga''XpT pOrfX cCga''XpT_BAuPD FRDGDAH.pOrfX,QCALhc pOrfX HSJzGvtZoa BAuPD QyyEwBb/OUUPo WzoXAt-cCga''XpT:FRDGDAH_BAuPD/QyyEwBb OUUPo BteNTVJ BteNTVJ,JPljFp_QyyEwBb.OUUPo pOrfX JPljFp FRDGDAH QyyEwBb QyyEwBb;pOrfX,BAuPD BAuPD/JPljFp-JPljFp TqPKlxcY vrEfq TqPKlxcY?vrEfq!cCga''XpT:FRDGDAH_pOrfX.hGMm:HSJzGvtZoa-FRDGDAH JPljFp cCga''XpT vrEfq QyyEwBb_pOrfX-pOrfX/OUUPo vrEfq JPljFp-JPljFp:hGMm-BteNTVJ.BKs.FRDGDAH cCga''XpT BAuPD;HSJzGvtZoa BAuPD-FRDGDAH cCga''XpT OUUPo QyyEwBb;cCga''XpT rgIwqzFCR QyyEwBb OUUPo JPljFp HSJzGvtZoa-FRDGDAH HSJzGvtZoa_JPljFp BAuPD_BAuPD pOrfX_HSJzGvtZoa;QyyEwBb JPljFp QyyEwBb hGMm,HSJzGvtZoa QyyEwBb QyyEwBb rgIwqzFCR HSJzGvtZoa.OUUPo hGMm;BteNTVJ WzoXAt FRDGDAH_OUUPo QyyEwBb?HSJzGvtZoa OUUPo JPljFp!cCga''XpT QyyEwBb?FRDGDAH OUUPo!BteNTVJ QyyEwBb QyyEwBb;cCga''XpT!BteNTVJ BAuPD JPljFp.OUUPo FRDGDAH/HSJzGvtZoa HSJzGvtZoa BAuPD?cCga''XpT/HSJzGvtZoa QyyEwBb-HSJzGvtZoa,FRDGDAH QyyEwBb/JPljFp DkvZ/cCga''XpT!vrEfq!OUUPo?HSJzGvtZoa cCga''XpT FRDGDAH:BAuPD?pOrfX-cCga''XpT pOrfX_BAuPD TqPKlxcY cCga''XpT?TqPKlxcY BteNTVJ:vrEfq cCga''XpT cCga''XpT QyyEwBb FRDGDAH hGMm-hGMm_pOrfX-JPljFp BAuPD_QCALhc!cCga''XpT,BAuPD BAuPD,FRDGDAH:pOrfX TqPKlxcY vrEfq_BteNTVJ;JPljFp-FRDGDAH/FRDGDAH JPljFp JPljFp OUUPo BKs TqPKlxcY BAuPD JPljFp?FRDGDAH:HSJzGvtZoa,HSJzGvtZoa:hGMm:BAuPD,HSJzGvtZoa BAuPD BteNTVJ JPljFp,pOrfX cCga''XpT.QyyEwBb,OUUPo BteNTVJ cCga''XpT FRDGDAH-QyyEwBb JPljFp QyyEwBb hGMm HSJzGvtZoa;FRDGDAH cCga''XpT.cCga''XpT;vrEfq,BAuPD,QyyEwBb!OUUPo.TqPKlxcY OUUPo cCga''XpT pOrfX-OUUPo,cCga''XpT BAuPD HSJzGvtZoa-BAuPD-QyyEwBb FRDGDAH FRDGDAH.BAuPD-pOrfX pOrfX:pOrfX hGMm/cCga''XpT OUUPo QCALhc QyyEwBb BteNTVJ_cCga''XpT JPljFp cCga''XpT?BAuPD \n" +
                "\n" +
                "MSty;XofcN'Rn;MSty MSty Brk'Ncxj-Brk'Ncxj/UjNuHJkOqm!rkMahSrDf bnhUu'pd EJI rkMahSrDf Brk'Ncxj.EuU UjNuHJkOqm_XofcN'Rn Brk'Ncxj?XofcN'Rn XofcN'Rn;UjNuHJkOqm;XofcN'Rn Brk'Ncxj MSty;EuU UjNuHJkOqm MSty EuU?UjNuHJkOqm XofcN'Rn bnhUu'pd-bnhUu'pd EJI XofcN'Rn.rkMahSrDf!Brk'Ncxj EuU MSty Brk'Ncxj.EuU rkMahSrDf/XofcN'Rn UjNuHJkOqm UjNuHJkOqm Brk'Ncxj XofcN'Rn bnhUu'pd XofcN'Rn MSty EuU rkMahSrDf?rkMahSrDf bnhUu'pd UjNuHJkOqm XofcN'Rn Brk'Ncxj UjNuHJkOqm EJI bnhUu'pd XofcN'Rn.XofcN'Rn;MSty EuU bnhUu'pd bnhUu'pd,Brk'Ncxj MSty:Brk'Ncxj;bnhUu'pd Brk'Ncxj MSty Brk'Ncxj UjNuHJkOqm bnhUu'pd XofcN'Rn rkMahSrDf EuU_EJI bnhUu'pd;Brk'Ncxj Brk'Ncxj-bnhUu'pd XofcN'Rn;EuU_rkMahSrDf Brk'Ncxj bnhUu'pd!XofcN'Rn XofcN'Rn_Brk'Ncxj rkMahSrDf.UjNuHJkOqm XofcN'Rn UjNuHJkOqm XofcN'Rn EJI?Brk'Ncxj:XofcN'Rn MSty EJI bnhUu'pd bnhUu'pd UjNuHJkOqm bnhUu'pd:EuU/UjNuHJkOqm EJI EuU XofcN'Rn,XofcN'Rn!Brk'Ncxj EJI MSty EuU Brk'Ncxj.rkMahSrDf Brk'Ncxj;bnhUu'pd;UjNuHJkOqm EJI Brk'Ncxj_EJI.Brk'Ncxj;bnhUu'pd,MSty_bnhUu'pd bnhUu'pd Brk'Ncxj,bnhUu'pd:rkMahSrDf;EJI/rkMahSrDf Brk'Ncxj UjNuHJkOqm-bnhUu'pd XofcN'Rn!Brk'Ncxj MSty rkMahSrDf?EuU.XofcN'Rn MSty?Brk'Ncxj!XofcN'Rn XofcN'Rn EJI-MSty;MSty Brk'Ncxj_EJI EJI Brk'Ncxj.XofcN'Rn MSty?UjNuHJkOqm MSty-rkMahSrDf!XofcN'Rn XofcN'Rn UjNuHJkOqm_bnhUu'pd!EJI \n" +
                "\n" +
                "skhMSTipw_SJGYfQ SJGYfQ SJGYfQ SJGYfQ CdhCb WaonXbp;Ftxb!PEt SJGYfQ Ftxb-sDQsqDiz CdhCb?Ftxb_skhMSTipw/CdhCb-skhMSTipw;Ftxb PEt;skhMSTipw Ftxb!CdhCb CdhCb;PEt Ftxb Ftxb!skhMSTipw_wzrwkS-sDQsqDiz skhMSTipw Ftxb!PEt!wzrwkS_PEt?skhMSTipw?Ftxb PEt:sDQsqDiz Ftxb wzrwkS Ftxb sDQsqDiz skhMSTipw:wzrwkS skhMSTipw;CdhCb!SJGYfQ skhMSTipw;CdhCb skhMSTipw.Ftxb;SJGYfQ sDQsqDiz.PEt;SJGYfQ SJGYfQ wzrwkS PEt skhMSTipw_wzrwkS wzrwkS PEt:skhMSTipw Ftxb,Ftxb!skhMSTipw skhMSTipw Ftxb sDQsqDiz skhMSTipw?sDQsqDiz CdhCb wzrwkS!Ftxb Ftxb wzrwkS?wzrwkS sDQsqDiz;skhMSTipw sDQsqDiz_SJGYfQ?wzrwkS Ftxb_SJGYfQ sDQsqDiz sDQsqDiz skhMSTipw SJGYfQ!wzrwkS;WaonXbp wzrwkS_wzrwkS Ftxb sDQsqDiz skhMSTipw_Ftxb wzrwkS_skhMSTipw PEt SJGYfQ SJGYfQ CdhCb,PEt;skhMSTipw;PEt,CdhCb SJGYfQ?SJGYfQ sDQsqDiz,CdhCb skhMSTipw-CdhCb SJGYfQ?Ftxb!Ftxb Ftxb SJGYfQ:PEt-Ftxb.PEt Ftxb wzrwkS SJGYfQ!iATyoWYKdg!CdhCb,sDQsqDiz sDQsqDiz;iATyoWYKdg/Ftxb CdhCb skhMSTipw/WaonXbp_CdhCb Ftxb \n" +
                "\n" +
                "HsmJ'OgG-HsmJ'OgG-HMrRQHlwTE?RMZZwZl/HMrRQHlwTE cGJBE:RMZZwZl HMrRQHlwTE;vHoWt.RMZZwZl,HMrRQHlwTE?HsmJ'OgG.RMZZwZl-tghOTkN HsmJ'OgG:cGJBE!RMZZwZl tghOTkN.tghOTkN.HsmJ'OgG HsmJ'OgG HsmJ'OgG/cGJBE RMZZwZl vHoWt/RMZZwZl-HMrRQHlwTE_tghOTkN!RMZZwZl HMrRQHlwTE?RMZZwZl HsmJ'OgG:cGJBE;tghOTkN vHoWt,HsmJ'OgG HsmJ'OgG HMrRQHlwTE cGJBE/HMrRQHlwTE-tghOTkN HsmJ'OgG HMrRQHlwTE!HsmJ'OgG cGJBE cGJBE:HMrRQHlwTE/cGJBE tghOTkN-HMrRQHlwTE/RMZZwZl HMrRQHlwTE/RMZZwZl HsmJ'OgG_RMZZwZl vHoWt:vHoWt HsmJ'OgG?cGJBE RMZZwZl_cGJBE,HMrRQHlwTE RMZZwZl;HsmJ'OgG HsmJ'OgG_cGJBE-RMZZwZl HMrRQHlwTE.HsmJ'OgG?HsmJ'OgG RMZZwZl!HsmJ'OgG.HsmJ'OgG:HsmJ'OgG?tghOTkN HsmJ'OgG:cGJBE HMrRQHlwTE?cGJBE,cGJBE cGJBE RMZZwZl tghOTkN,RMZZwZl;HMrRQHlwTE:RMZZwZl HMrRQHlwTE tghOTkN tghOTkN HsmJ'OgG vHoWt HsmJ'OgG HsmJ'OgG HsmJ'OgG HMrRQHlwTE/HsmJ'OgG HsmJ'OgG,cGJBE vHoWt tghOTkN vHoWt HMrRQHlwTE HMrRQHlwTE HsmJ'OgG_cGJBE:\n" +
                "\n" +
                "bEfEtoLH_zEbX zEbX bEfEtoLH bEfEtoLH bEfEtoLH:zEbX.bEfEtoLH:bEfEtoLH bEfEtoLH_zEbX-bEfEtoLH zEbX bEfEtoLH.bEfEtoLH bEfEtoLH,bEfEtoLH bEfEtoLH_bEfEtoLH zEbX zEbX?zEbX:bEfEtoLH zEbX zEbX bEfEtoLH bEfEtoLH zEbX:bEfEtoLH bEfEtoLH bEfEtoLH.zEbX zEbX zEbX bEfEtoLH,bEfEtoLH:zEbX.zEbX zEbX zEbX bEfEtoLH zEbX bEfEtoLH!zEbX_bEfEtoLH zEbX bEfEtoLH zEbX.bEfEtoLH/\n" +
                "\n" +
                "iclNwaS XqhBd bUEtcmNU,iclNwaS ROlfzO;NWjxxcd,ROlfzO bUEtcmNU aUyYOUhiY iclNwaS oKgXp hQJAC'KLb?ROlfzO BkzhDiQD BkzhDiQD oKgXp:NWjxxcd BkzhDiQD BkzhDiQD?XqhBd BkzhDiQD ROlfzO XqhBd bUEtcmNU BkzhDiQD ROlfzO.ROlfzO aUyYOUhiY iclNwaS hQJAC'KLb oKgXp oKgXp NWjxxcd XqhBd!bUEtcmNU NWjxxcd.ROlfzO ROlfzO bUEtcmNU:ROlfzO ROlfzO/oKgXp BkzhDiQD iclNwaS XqhBd NWjxxcd NWjxxcd/aUyYOUhiY ROlfzO BkzhDiQD.hQJAC'KLb BkzhDiQD.oKgXp iclNwaS!XqhBd oKgXp iclNwaS/ROlfzO.oKgXp,XqhBd iclNwaS aUyYOUhiY.aUyYOUhiY XqhBd oKgXp XqhBd XqhBd.NWjxxcd hQJAC'KLb.aUyYOUhiY/oKgXp oKgXp.NWjxxcd_ROlfzO oKgXp,NWjxxcd?ROlfzO.hQJAC'KLb oKgXp oKgXp?bUEtcmNU?XqhBd,oKgXp hQJAC'KLb:iclNwaS XqhBd!hQJAC'KLb BkzhDiQD XqhBd-bUEtcmNU/XqhBd XqhBd:ROlfzO aUyYOUhiY:XqhBd?NWjxxcd?XqhBd aUyYOUhiY aUyYOUhiY BkzhDiQD.XqhBd?oKgXp NWjxxcd BkzhDiQD oKgXp:XqhBd aUyYOUhiY ROlfzO NWjxxcd oKgXp.XqhBd_ROlfzO BkzhDiQD!NWjxxcd:oKgXp!\n" +
                "\n" +
                "EpvvzG,euq vlWw-vK'GbzqSJ:htVGs hFRfoK!EpvvzG/vlWw htVGs euq!qkUVu,QwKfUYjtr.vK'GbzqSJ.QwKfUYjtr!vK'GbzqSJ vlWw,euq ecm;ecm;euq.hFRfoK.euq/euq;VWa?vK'GbzqSJ;vlWw QwKfUYjtr/hFRfoK_vlWw nsA;ecm XQU_vlWw VWa.htVGs VWa hFRfoK_euq QwKfUYjtr-hFRfoK ecm EpvvzG EpvvzG vlWw_vK'GbzqSJ ecm_euq!hFRfoK_QwKfUYjtr/XQU-nsA hFRfoK-nsA?vK'GbzqSJ/euq qkUVu hFRfoK euq ecm_nsA bldKkc hFRfoK:nsA?nsA.htVGs?vK'GbzqSJ-hFRfoK ecm QwKfUYjtr EpvvzG/VWa htVGs nsA euq;QwKfUYjtr VWa;htVGs:QwKfUYjtr:hFRfoK ecm XQU;hFRfoK.vlWw vK'GbzqSJ egRlmO vlWw EpvvzG XQU VWa;QwKfUYjtr QwKfUYjtr vK'GbzqSJ/vlWw euq.htVGs ecm vlWw?EpvvzG:egRlmO vK'GbzqSJ euq?hFRfoK?vK'GbzqSJ-XQU euq?hFRfoK EpvvzG?VWa:QwKfUYjtr!EpvvzG QwKfUYjtr-vlWw EpvvzG htVGs?hFRfoK VWa vlWw WgxJv'p euq WgxJv'p vlWw QwKfUYjtr EpvvzG hFRfoK:QwKfUYjtr egRlmO?EpvvzG WgxJv'p VWa VWa XQU vlWw hFRfoK-nsA htVGs/euq,ecm VWa;QwKfUYjtr.ecm XQU_vK'GbzqSJ-euq hFRfoK hFRfoK!htVGs QwKfUYjtr/bldKkc XQU vlWw_nsA;htVGs?EpvvzG;euq/euq!egRlmO_hFRfoK?bldKkc?htVGs vlWw hFRfoK hFRfoK nsA/euq?ecm;QwKfUYjtr;WgxJv'p!vK'GbzqSJ.vlWw/QwKfUYjtr htVGs VWa-bldKkc VWa htVGs EpvvzG;nsA htVGs.XQU vlWw vlWw.WgxJv'p htVGs.vK'GbzqSJ vlWw/bldKkc-vK'GbzqSJ-vlWw-EpvvzG-QwKfUYjtr/XQU?hFRfoK.IGdkk XQU vlWw.VWa?XQU ecm!VWa;euq vlWw hFRfoK:EpvvzG?vlWw?XQU,EpvvzG;vK'GbzqSJ_hFRfoK-VWa?hFRfoK?XQU egRlmO ecm vK'GbzqSJ!hFRfoK htVGs:vK'GbzqSJ QwKfUYjtr ecm vlWw,nsA.nsA vK'GbzqSJ:bldKkc euq bldKkc?egRlmO EpvvzG_euq hFRfoK euq_bldKkc!euq nsA qkUVu WgxJv'p euq QwKfUYjtr;egRlmO vlWw vK'GbzqSJ euq ecm.ecm vpC EpvvzG vlWw nsA,bldKkc/QwKfUYjtr vlWw.vlWw \n" +
                "\n" +
                "g'Qu lzWlBWdh_nCytu muagi boBOOSa;lzWlBWdh GpYxhKnWAu;g'Qu FBjmkGv bvjwt'sIS kYYC/lzWlBWdh g'Qu QGAOZB UBajth bvjwt'sIS bvjwt'sIS:UYcsecwavM-kYYC/FBjmkGv;g'Qu:UBajth,yvd!g'Qu:yvd yvd muagi?g'Qu boBOOSa boBOOSa UYcsecwavM lzWlBWdh UYcsecwavM yvd-GpYxhKnWAu FBjmkGv_nGTGnYwxln.yvd!g'Qu yvd lzWlBWdh.boBOOSa,bvjwt'sIS.g'Qu-kYYC QGAOZB.UYcsecwavM:QGAOZB yvd yvd_yvd,lzWlBWdh boBOOSa bvjwt'sIS_g'Qu-UYcsecwavM-UYcsecwavM-kYYC,bvjwt'sIS!kYYC HYxT:g'Qu.GpYxhKnWAu!UYcsecwavM bvjwt'sIS;bvjwt'sIS lzWlBWdh muagi_kYYC-kYYC.bvjwt'sIS UYcsecwavM!nCytu UBajth?nGTGnYwxln;FBjmkGv GpYxhKnWAu kYYC?UYcsecwavM?g'Qu bvjwt'sIS g'Qu:lzWlBWdh,nCytu HYxT QGAOZB-bvjwt'sIS lzWlBWdh UYcsecwavM bvjwt'sIS nCytu?UBajth lzWlBWdh bvjwt'sIS-g'Qu,kYYC?g'Qu.lzWlBWdh FBjmkGv:UYcsecwavM.yvd QGAOZB_kYYC UYcsecwavM g'Qu yvd nGTGnYwxln lzWlBWdh g'Qu xePAM nCytu!kYYC HYxT lzWlBWdh bvjwt'sIS:UYcsecwavM kYYC lzWlBWdh bvjwt'sIS!kYYC!FBjmkGv?UYcsecwavM lzWlBWdh FBjmkGv,g'Qu g'Qu-UBajth nCytu-bvjwt'sIS_kYYC kYYC/UBajth!HYxT?bvjwt'sIS nGTGnYwxln boBOOSa.kYYC-kYYC HYxT FBjmkGv,GpYxhKnWAu:bvjwt'sIS?HYxT.kYYC g'Qu,yvd.lzWlBWdh muagi:HYxT/nCytu,g'Qu:GpYxhKnWAu nCytu kYYC-FBjmkGv.OhJnh nCytu UYcsecwavM yvd yvd;lzWlBWdh GpYxhKnWAu QGAOZB lzWlBWdh yvd-bvjwt'sIS g'Qu/kYYC_bvjwt'sIS kYYC UYcsecwavM nCytu UYcsecwavM?QGAOZB bvjwt'sIS boBOOSa_bvjwt'sIS lzWlBWdh UYcsecwavM FBjmkGv-UYcsecwavM kYYC FBjmkGv.bvjwt'sIS UYcsecwavM lzWlBWdh lzWlBWdh kYYC_bvjwt'sIS HYxT,bvjwt'sIS_FBjmkGv-g'Qu UBajth:boBOOSa UYcsecwavM,lzWlBWdh/g'Qu FBjmkGv nGTGnYwxln!FBjmkGv-lzWlBWdh!UYcsecwavM?UYcsecwavM nGTGnYwxln lzWlBWdh g'Qu/g'Qu UYcsecwavM/bvjwt'sIS?FBjmkGv UYcsecwavM-nCytu UYcsecwavM lzWlBWdh:UYcsecwavM FBjmkGv g'Qu.QGAOZB UBajth_bvjwt'sIS!bvjwt'sIS-g'Qu.FBjmkGv g'Qu g'Qu g'Qu,\n" +
                "\n" +
                "gBb_gBb gBb GRvo,gBb.gBb_gBb GRvo/gBb gBb GRvo gBb/GRvo GRvo,GRvo:GRvo gBb GRvo gBb/GRvo GRvo gBb!GRvo_GRvo gBb GRvo!gBb GRvo:GRvo gBb GRvo;GRvo/gBb!gBb GRvo GRvo.GRvo GRvo,gBb/gBb gBb!gBb,gBb gBb GRvo GRvo!GRvo GRvo_GRvo gBb?GRvo/\n" +
                "\n" +
                "PnJZHSOYm PnJZHSOYm!PnJZHSOYm PnJZHSOYm?PnJZHSOYm PnJZHSOYm PnJZHSOYm-ismHejxHns PnJZHSOYm_ismHejxHns:ismHejxHns ismHejxHns PnJZHSOYm!PnJZHSOYm,PnJZHSOYm?PnJZHSOYm PnJZHSOYm PnJZHSOYm_ismHejxHns?PnJZHSOYm.PnJZHSOYm PnJZHSOYm_PnJZHSOYm/ismHejxHns.PnJZHSOYm PnJZHSOYm,PnJZHSOYm:PnJZHSOYm PnJZHSOYm-PnJZHSOYm-\n" +
                "\n" +
                "ENY_yvweLHxxPg czUEPhf yvweLHxxPg VrPCij'YPN bavgpTAWMi CeeyZH!nacLmd VrPCij'YPN aNWHD'' ENY YWaz CeeyZH YWaz:CeeyZH VrPCij'YPN?YWaz aNWHD'' bavgpTAWMi-aNWHD'' YWaz/nacLmd/yvweLHxxPg bavgpTAWMi_YWaz?bavgpTAWMi yvweLHxxPg_ENY czUEPhf VrPCij'YPN!CeeyZH-YWaz czUEPhf bavgpTAWMi;CeeyZH,aNWHD'' YWaz CeeyZH?bavgpTAWMi/bavgpTAWMi CeeyZH/bavgpTAWMi aNWHD''/CeeyZH nacLmd bavgpTAWMi.YWaz,aNWHD'',ENY bavgpTAWMi VrPCij'YPN yvweLHxxPg,aNWHD'',aNWHD'';czUEPhf ENY_aNWHD'' bavgpTAWMi;YWaz ENY VrPCij'YPN ENY czUEPhf nacLmd,ENY-CeeyZH aNWHD'' ENY.aNWHD'' VrPCij'YPN bavgpTAWMi?VrPCij'YPN aNWHD''.ENY VrPCij'YPN,bavgpTAWMi YWaz:CeeyZH,hhjlDJo YWaz ENY VrPCij'YPN,YWaz yvweLHxxPg CeeyZH yvweLHxxPg yvweLHxxPg YWaz_ENY VrPCij'YPN,YWaz bavgpTAWMi aNWHD'' ENY-CeeyZH:hhjlDJo.aNWHD'' VrPCij'YPN;bavgpTAWMi YWaz aNWHD''/YWaz?ENY!yvweLHxxPg yvweLHxxPg/nacLmd ENY czUEPhf/YWaz!aNWHD'';YWaz.aNWHD'',CeeyZH_yvweLHxxPg.bavgpTAWMi/aNWHD'' bavgpTAWMi aNWHD''!YWaz bavgpTAWMi CeeyZH yvweLHxxPg CeeyZH CeeyZH_ENY bavgpTAWMi?nacLmd,nacLmd bavgpTAWMi.ENY YWaz-bavgpTAWMi/ENY CeeyZH YWaz VrPCij'YPN YWaz YWaz.nacLmd VrPCij'YPN bavgpTAWMi-ENY!bavgpTAWMi yvweLHxxPg YWaz bavgpTAWMi aNWHD'' VrPCij'YPN.ENY_YWaz ENY?hhjlDJo.VrPCij'YPN/aNWHD'' nacLmd:ENY nacLmd-YWaz-ENY:YWaz bavgpTAWMi.aNWHD''.ENY/YWaz aNWHD'' CeeyZH?bavgpTAWMi ENY.aNWHD''!aNWHD'':bavgpTAWMi;aNWHD''-ENY aNWHD''!aNWHD''.yvweLHxxPg:yvweLHxxPg?aNWHD'' ENY_bavgpTAWMi.";
//        System.out.println(TopWords.top3(s));
//        System.out.println(TopWords.top3(Stream
//                .of("In a village of La Mancha, the name of which I have no desire to call to",
//                        "mind, there lived not long since one of those gentlemen that keep a lance",
//                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
//                        "coursing. An olla of rather more beef than mutton, a salad on most",
//                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
//                        "on Sundays, made away with three-quarters of his income.")
//                .collect(Collectors.joining("\n")) ));

        String s2 = "anwhd''";
        String s3 = "\\b(?:" + s2.replaceAll("'", "\\\\\\\\\'") + ")\\b";
        System.out.println(s3);
        Pattern pattern = Pattern.compile(s3);
        Matcher matcher = pattern.matcher("anwhd''");
        while (matcher.find()){
            System.out.println(matcher.group());
        }

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


//        System.out.println(Solution.solve1(100));
//        System.out.println(Solution.solve1(9999999999L));
//        System.out.println(Solution.solve1(999999999999999999L));
//        System.out.println(Solution.nthNumber(123456789999999L));
//        System.out.println(Solution.nthNumber100(33));

//        System.out.println(Arrays.toString(Solution.nameValue(new String[]{"abc", "abc abc"})));

//        System.out.println(Arrays.toString(MexicanWave.wave("hello ilgiz")));


//        System.out.println(Kata.dative("virág"));

//        int n = 10;
//        double pow = Math.pow(10, n);
//        long v = (n - 1) * (long) Math.pow(10, n) + ((long) (Math.pow(10, n - 1) - 1) / 9) * 8 * 10 + 9;
//        System.out.println(v);

//        System.out.println(Arrays.toString(Solution.solve(2016, 2020)));

    }

}
