package cf.tilgiz.codewars;

/**
 * @author Ilgiz Tukhvatov
 */
public class RoundToTheNextMultipleOf5 {
    public static int roundToNext5(int number) {
//        return (number % 5 == 0 || number < 0) ? (number / 5) * 5 : ((number / 5) * 5) + 5;

//        int result;
//        if(number % 5 == 0) result = (((number / 5) * 5));
//        else {
//            if (number < 0) result = (((number / 5) * 5));
//            else result = (((number / 5) * 5) + 5);
//        }
//        return result;

        int num = 6;
        int result = 0;
        for (int i = -16; i <= 16; i++) {
            System.out.print(i + " => " + ((float)i / 5) + " => " + i % 5 + " == ");
            if(i % 5 == 0) result = (((i / 5) * 5));
            else {
                if (i < 0) result = (((i / 5) * 5));
                else result = (((i / 5) * 5) + 5);
            }
            System.out.println(result);
        }
        return result;
    }
}
