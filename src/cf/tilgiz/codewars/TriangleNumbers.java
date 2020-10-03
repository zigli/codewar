package cf.tilgiz.codewars;

/**
 * @author Ilgiz Tukhvatov
 */
public class TriangleNumbers {
    public static Boolean isTriangleNumber(long number) {
        return Math.sqrt(8 * number + 1) == Math.floor(Math.sqrt(8 * number + 1));
//        return Math.sqrt(1+8*number)%1==0;
    }
}
