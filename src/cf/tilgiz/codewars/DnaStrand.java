package cf.tilgiz.codewars;

/**
 * @author Ilgiz Tukhvatov
 */
public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'A') builder.append('T');
            else if (dna.charAt(i) == 'T') builder.append('A');
            else if (dna.charAt(i) == 'C') builder.append('G');
            else if (dna.charAt(i) == 'G') builder.append('C');
        }
        return builder.toString();
    }
}
