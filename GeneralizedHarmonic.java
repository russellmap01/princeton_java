/* *****************************************************************************
 *  Name:              John Russell
 *  Coursera User ID:  NA
 *  Last modified:     January 30, 2020
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);


        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / Math.pow(i, r);
        }
            // print the nth harmonic number
            System.out.println(sum);
        }
    }
