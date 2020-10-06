package cf.tilgiz.codewars;

import java.util.StringJoiner;

/**
 * @author Ilgiz Tukhvatov
 */
public class TimeFormatter {

    public static String formatDuration(int seconds) {
        System.out.println(seconds);
        if (seconds == 0) return "now";
        String[] str = {"year", "day", "hour", "minute", "second"};
        int secs = seconds % 60;
        int mins = seconds / 60 % 60;
        int hours = seconds / 3600 % 24;
        int days = seconds / 86400 % 356;
        int years = seconds / 31536000;
        int[] out = {years, days, hours, mins, secs};
        StringJoiner joiner = new StringJoiner(", ");
        for (int i = 0; i < out.length; i++) {
            if (out[i] != 0) {
                joiner.add(out[i] + " " + str[i] + ((out[i] > 1) ? "s" : ""));
            }
        }
        return joiner.toString().replaceAll(", (?!.+,)", " and ");
//        String string = joiner.toString();
//        int ind = string.lastIndexOf(",");
//        if (ind > 0) return string.substring(0, ind) + " and" + string.substring(ind + 1);
//        else return string;
    }
}
