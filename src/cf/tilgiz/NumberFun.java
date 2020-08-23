package cf.tilgiz;

/**
 * @author Ilgiz Tukhvatov
 */
public class NumberFun {
    public static long findNextSquare(long sq) {
        return (Math.sqrt(sq)==Math.ceil(Math.sqrt(sq)))? (long) ((Math.sqrt(sq)+1)*(Math.sqrt(sq)+1)) : -1;
    }
}
