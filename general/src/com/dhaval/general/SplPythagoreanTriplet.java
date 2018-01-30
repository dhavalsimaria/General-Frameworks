
package com.dhaval.general;

/**
 * @author Dhaval Simaria
 */
public class SplPythagoreanTriplet {

    public static void main(String[] args) {

        // int a, b;
        int c = 0, c2;

        for (int a = 1; a <= 1000; a++) {
            for (int b = a + 1; b <= 1000; b++) {
                c2 = (a * a) + (b * b);
                if (isPerfectSquare(c2)) {
                    c = customSquareRoot(c2);
                    if (a + b + c == 1000) {
                        System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", a+b+c: " + (a + b + c));
                        System.out.println("The req. product is: " + (a * b * c));
                        break;
                    }

                }
            }
        }

        /*int a = 3, b = 4;
        int c = 0, c2;
        
        do {
        
            c2 = (a * a) + (b * b);
            if (isPerfectSquare(c2)) {
                c = customSquareRoot(c2);
            }
        
        } while ((a++) + (b++) + c != 1000);
        
        System.out.println("Req. abc product : " + (--a) * (--b) * c);
        }*/

    }

    public static boolean isPerfectSquare(int input) {
        int start = 0, end = input / 2, result = 0;

        if (input == 0 || input == 1)
            return true;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (mid * mid == input)
                return true;
            else if (mid * mid < input) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }
        return (result * result == input);
    }

    public static int customSquareRoot(int input) {
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
}
