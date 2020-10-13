package cf.tilgiz.codewars;

import static java.lang.Math.*;

public class Walker {
    public static int[] solve(int a, int b, int c, int alpha, int beta, int gamma) {
//        int[] result = new int[4];

        double lineBO = sqrt(a * a + b * b - 2 * a * b * cos(toRadians(alpha + (90 - beta))));
//        System.out.println(lineBO);
        double angleABO = acos((b * b + lineBO * lineBO - a * a) / (2 * lineBO * b));
//        double angleAdegree = Math.toDegrees(angleABO);
//        System.out.println(angleAdegree);
        double angleBOA = 180 - (alpha + (90 - beta)) - toDegrees(angleABO);
//        System.out.println(angleBOA);

        double lineCO = sqrt(lineBO * lineBO + c * c - 2 * lineBO * c * cos(toRadians(90 - gamma) + (toRadians(beta) - angleABO)));
//        double d1 = Math.sqrt(lineBO * lineBO + c * c - 2 * lineBO * c * Math.cos(Math.toRadians(90 - gamma + (30 - Math.toDegrees(angleABO)))));
//        System.out.println((d1));

        double angleCOB = toDegrees(acos((lineCO * lineCO + lineBO * lineBO - c * c) / (2 * lineBO * lineCO)));
        double angleCOt = angleCOB + angleBOA + alpha;

        int d1 = (int) angleCOt;
        int m1 = (int) ((angleCOt - d1) * 60);
        int s1 = (int) ((angleCOt - d1 - (double) m1 / 60) * 3600);

        return new int[]{(int) round(lineCO), d1, m1, s1};
    }
}
