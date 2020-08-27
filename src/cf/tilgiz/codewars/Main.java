package cf.tilgiz.codewars;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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

        long leftLimit  = 1000000000000L;
        long rightLimit = 10000000000000L;
        long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
        System.out.println(generatedLong);
        System.out.println(Kata.nextBiggerNumber(generatedLong));
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
    }
}
