/*
The area of a circle is defined as πr^2. Estimate π to 3 decimal places using a Monte Carlo method.

Hint: The basic equation of a circle is x2 + y2 = r2.
 */

import java.util.Random;

public class DCP558 {

    private static final Random r = new Random();
    private static int N = 1_000_000_000;


    public static void main(String[] args) {
//        N = args.length > 0 ? Integer.parseInt(args[0]) : N;

        double pi_approx = 3.0;

        double n = 0.0;

        for (int trial = 1; trial <= N; trial++){
            Double x = r.nextDouble();
            Double y = r.nextDouble();

            if ((x*x) + (y*y) <= 1){
                n++;

                pi_approx = 4 * n / trial;
            }

        }
        System.out.println(pi_approx);
    }
}
