/* *****************************************************************************
 *  Name:              John Russell
 *  Coursera User ID:  NA
 *  Last modified:     January 23, 2022
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {

        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        //  double r = 6371.0;

        // Haversine Formula Computation
        double a = Math.pow(Math.sin((x2-x1)/2), 2)
                + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2-y1)/2), 2);

        // great circle distance in radians
        double angle1 = 2 * Math.asin(Math.min(1, Math.sqrt(a)));

        // convert back to degrees
        angle1 = Math.toDegrees(angle1);

        // each degree on a great circle of Earth is 111.194 nautical kilometers
        double distance = 111.19492664138056 * angle1;

        System.out.println(distance + " kilometers");

        // Boulder Colorado = 40.014984 -105.270546
        // Dublin Ireland = 53.350140 -6.266155
        // Distance = 7074.205031248931 nautical miles

    }
}
