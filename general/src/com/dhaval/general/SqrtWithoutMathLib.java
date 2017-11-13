/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author Dhaval Simaria
 *
 */
public class SqrtWithoutMathLib {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        /*        int input = scn.nextInt();
        
        System.out.println("The square root is: " + customSqrt(input));*/

        double input = scn.nextDouble();

        System.out.println("The square root is: " + customSqrt1(input));

        scn.close();
    }

    /** Method 1: Efficient for int values */
    public static int customSqrt(int input) {
        int start = 0, end = input / 2, result = 0;

        if (input == 0 || input == 1)
            return input;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (mid * mid == input)
                return mid;
            else if (mid * mid < input) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    /** Method 2: Efficient for both int and double values */
    public static double customSqrt1(double input) {
        double temp;

        double result = input / 2;

        do {
            temp = result;
            result = (temp + (input / temp)) / 2;
        } while (temp - result != 0);

        return result;
    }
}
