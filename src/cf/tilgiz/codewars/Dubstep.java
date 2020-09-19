package cf.tilgiz.codewars;

/**
 * @author Ilgiz Tukhvatov
 */
public class Dubstep {
    public static String SongDecoder (String song) {
        return song.replaceAll("WUB", " ").replaceAll("\\s+", " ").trim();
//        return song.replaceAll("(WUB)+", " ").trim();
    }
}
