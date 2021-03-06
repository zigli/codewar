package cf.tilgiz.codewars;

import java.util.stream.IntStream;

/**
 * @author Ilgiz Tukhvatov
 */
public class GrassHopper {
    public static String weatherInfo(int temp) {
        System.out.println(temp);
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is above freezing temperature");
        else
            return (c + " is freezing temperature");

    }

    public static double convertToCelsius(int temperature) {
        double celsius = (temperature - 32) * (double) 5 / 9;
        return celsius;
    }

    public static int summation(int n) {
        return IntStream.range(1, n + 1).sum();
    }
}
