package cf.tilgiz.codewars;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

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
//        String s = "MFd' MFd'/MFd'!MFd';MFd'";
//        System.out.println(TopWords.top3(s));
//        System.out.println(TopWords.top3(Stream
//                .of("In a village of La Mancha, the name of which I have no desire to call to",
//                        "mind, there lived not long since one of those gentlemen that keep a lance",
//                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
//                        "coursing. An olla of rather more beef than mutton, a salad on most",
//                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
//                        "on Sundays, made away with three-quarters of his income.")
//                .collect(Collectors.joining("\n")) ));
/*

        String s2 = "anwhd''";
        s = "aNWHD''!aNWHD''.yvweLHxxPg:yvweLHxxPg?aNWHD'' ' ''' ";
        int random = (int)(Math.random()*100000000);
        System.out.println(random);
        s = s.toLowerCase().trim().replaceAll("[\\n]", "").replaceAll("[;:!?/.,-_]", " ");
        System.out.println(s);
        s = s.replaceAll("\\s\\'+", "");
        System.out.println(s);
        s = s.replaceAll("\\'", String.valueOf(random)).trim();
        System.out.println(s);
        String[] s1 = s.split("\\s+");
        String s3 = "\\b(?:" + s1[0] + ")\\b";
        System.out.println(s3);
        Pattern pattern = Pattern.compile(s3);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group().replaceAll(String.valueOf(random),"'"));
        }
*/

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


//        System.out.println(Arrays.toString(Solution.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss", "piccaninny", "hubbubbubboo"})));


//        System.out.println(Arrays.toString(Solution.longestRepetition("enky2ch30db1xbawq29vdxqcp1mdxfkbyeue0n65otyi9wtz1vy7w25anuup08odog27h3wgaqnuvclxx4uehykn1rls2ga25xidp1shuksinbmurh1sgmkpn2kuexkmba9tgywopsnytvs8liwjtluusjuh5y18med7fw0g3ilfbj6s0dqf4tp27qtgl59dao7cr1hdoou7qt4e4muqmzgtjoh3iktg1")));
//        System.out.println(Arrays.toString(Solution.longestRepetition("m511ng8170aervwi8xpm5bim33d0ip6mlspa3skzj6uwu44awm67k5l9xu99dvqg3vydp2puvm0htbf2hmxs93gtmcw9xznc3ypmncnr7iyfa4nvmwnv115yn373aso45lox09sprzw5yvit5wylyka974okuy2hjhj38s4vtf0qunkzs52h8kp8lzuk40uccr46qaaeocdvrj2cwbspno6nyz0et1jk0nwjroz9x0hzv765ndjfx6m20s7m31yuz9xmfytn2uqhrsp891wkh99qd2fx67erpnpi7z442obhful0om7nh7bntp4j3t27s9k8hf5npfdjyq3dbtez05qtxzvhryk2ie8pe1lag36wx3xv80d4jtay62dgatw2i5hr066herxqlsweer5fqtz6surrg4jxphbdlhqln4hsuuiw8gp5gwg5dzvmpstql")));
//        System.out.println(Arrays.toString(Solution.longestRepetition("imlu822pdgupmntjka1fdea0fa6q2j0va5uvf56332ug4d1jcxs953e8vgk690w4zv77j06f94bs2gx3czqw8doz0vdm88hbba0izh419u3gyud2oxp6bckccvulsmaav99bht8yd4ckpu6afs2p3gv7mq3mr3kqkvdig0ikjqkpwztznskhi3x0o23ic6dqr5awbq0r9sozair77mnobdl0igrptmvb5dna461yukdtipro3klqxbqjmdnw7rrffkhlmasqvinf5tdv08irg51mm8")));
//        System.out.println(Arrays.toString(Solution.longestRepetition("tnqa3cu85aly8bmmpr9vlzpyva5btg7z2tmhbl8uq12jo75bgvuv6es81i7hod0691lgi9qlxjqaibi263azvl7vl0bbf06h05o31qbhecztujj6c")));


//        System.out.println(Solution.solve1("2ti99iei7qhr5"));


//        System.out.println(DRoot.digital_root(456));

//        System.out.println(Solution.solve(new int[]{-36, 48, -37, -52, 37, -53, 32, 33, -12, 46, -13, -67, 49, -66, 19, 18, 71, 6, 70, 99, 42, 98, -25, 27, -26, -81, 38, -82, -78, 4, -77, 39, 40, 43, 6, 42, -99, -100, 96, 20, 97, 90, 91, -75, -74, 52, 51, -54, -53, -92, 34, -91, -35, -36, -18, -19, -58, 14, -59, 71, 70, -80, -79, 7, 23, 8, 33, 34, -13, -12, -98, 25, -97, -100, -101, 42, 43, 36, 37, 5, 4, 27, 28, 48, 49, -18, 18, -19, 23, 24, 1, 0, 12, 13, -31, -30, -68, 18, -67, 21, 35, 20, -57, 40, -58, -65, 26, -66, -93, -92, 65, 64, 82, 81, -15, 15, -14, -29, 48, -28, 16, 19, 15, 8, 35, 7, -55, 36, -56, 81, 37, 80, -69, -70, 11, 9, 10, -8, 4, -9, 29, 28, 68, 67, -10, 23, -9, -8, -9, 41, 42, -28, -29, -8, 33, -9, 28, 29, -55, 27, -56, 62, 3, 63, -80, -79, -51, 32, -50, -43, -44, -7, 48, -8, 48, 33, 47, -77, -78}));

//        System.out.println(Dubstep.SongDecoder("WUBWUBABCWUB"));
//        System.out.println(Dubstep.SongDecoder("RWUBWUBWUBLWUB"));


//        System.out.println(QuickCalc.choose(10, 20));
//        System.out.println(QuickCalc.choose(52, 5));

//        String clear = "Roma",
//        String clear = "Romaniytu",
//        String clear = "Romayreweetfdhghtwtwetwet",
//        String clear = "Romayreweetfdhghtwtwetwetqgdfdsfhffdherewryweryweryfghfghfg53ggd",
//        String clear = "Romani ite domum",
        String clear = "Sic transit gloria mundi",
                crypt = "Rntodomiimuea  m";
        System.out.println(InterlacedSpiralCipher.encode(clear));
        System.out.println(InterlacedSpiralCipher.decode(crypt));




    }

}
