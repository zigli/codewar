package cf.tilgiz.codewars;

public class TimeUtils {
    public static String convertTime(int timeDiff) {
//        int sign = 1;
//        if (timeDiff == 0) return "0 0 0 0";
//        else if (timeDiff < 0){
//            timeDiff *= -1;
//            sign = -1;
//        }
//        int sec = timeDiff % 60;
//        int min = (timeDiff / 60) % 60;
//        int hourRaw = (timeDiff / 3600 == 0) ? 24 : timeDiff / 3600;
//        int hour = (hourRaw < 24) ? hourRaw : (hourRaw - 24) % 24;
//        int day = (timeDiff / 3600) / 24;
//        return String.format("%s %s %s %s", (sign * day), (sign * hour), (sign * min), (sign * sec));

        return String.format("%s %s %s %s", timeDiff / 86400, timeDiff % 86400 / 3600, timeDiff % 3600 / 60, timeDiff % 60);
    }
}
