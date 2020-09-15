package cf.tilgiz.codewars;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Cracker {
    private final int start;
    private final int end;
    private static final char[] ALPHABET = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private final MessageDigest digest = MessageDigest.getInstance("SHA-1");
    private byte[] BYTES_SHA_1_TO_FIND = null;
    private boolean DONE = false;
    private String found;

    public Cracker(int s, int e, String hash) throws NoSuchAlgorithmException {
        start = s;
        end = e;
        BYTES_SHA_1_TO_FIND = hexStringToByteArray(hash);
    }

    public void generate(StringBuilder sb, int n) {
        if (DONE)
            return;

        if (n == sb.length()) {
            String candidate = sb.toString();

            byte[] bytes = digest.digest(candidate.getBytes());

            if (Arrays.equals(bytes, BYTES_SHA_1_TO_FIND)) {
                found = candidate;
                DONE = true;
            }

            return;
        }

        for (int i = 0; i < ALPHABET.length && !DONE; i++) {
            char letter = ALPHABET[i];
            sb.setCharAt(n, letter);
            generate(sb, n + 1);
        }

    }

    public String doWork() {

        for (int length = start; length <= end && !DONE; length++) {
            StringBuilder sb = new StringBuilder();
            sb.setLength(length);
            generate(sb, 0);
        }

        return found;
    }

    public byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }
}
