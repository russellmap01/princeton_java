/* *****************************************************************************
 *  Name:              John Russell
 *  Coursera User ID:  NA
 *  Last modified:     January 22, 2022
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {

        double a = Integer.parseInt(args[0]);
        double b = Integer.parseInt(args[1]);
        double c = Integer.parseInt(args[2]);

        double square1 = a*a;
        double square2 = b*b;
        double square3 = c*c;

        boolean isRightTriangle;


        isRightTriangle = (square1 + square2) == square3;

        isRightTriangle = isRightTriangle || (square1 + square3) == square2;

        isRightTriangle = isRightTriangle || (square2 + square3) == square1;

        isRightTriangle = isRightTriangle && (a >0) && (b >0) && (c >0);


        // if ((square1 + square2) == square3) isRightTriangle = true;
        // else isRightTriangle = false;

        System.out.println(isRightTriangle);

    }
}
