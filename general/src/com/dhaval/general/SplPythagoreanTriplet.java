/**
 * 
 */
package com.dhaval.general;

/**
 * @author Dhaval Simaria
 * NOT COMPLETED
 */
public class SplPythagoreanTriplet {

    public static void main(String[] args) {
        int a = 3, b = 4;
        int c = 0, c2;

        do {

            c2 = (a * a) + (b * b);
            if (isPerfectSquare(c2)) {
                c = customSquareRoot(c2);
            }

        } while ((a++) + (b++) + c != 1000);

        System.out.println("Req. abc product : " + (--a) * (--b) * c);
    }

    public static boolean isPerfectSquare(int number) {
        double temp;

        double input = number;

        double result = number / 2;

        do {
            temp = result;
            result = (temp + (input / temp)) / 2;
        } while (temp - result != 0);

        return (result * result == number);
    }

    public static int customSquareRoot(int number) {
        double temp;

        double input = number;

        double result = number / 2;

        do {
            temp = result;
            result = (temp + (input / temp)) / 2;
        } while (temp - result != 0);

        return (int) result;
    }
}
