/**
 * 
 */
package com.dhaval.general;

import java.util.ArrayList;

/**
 * @author Dhaval Simaria
 *
 */
public class LargestPrimeFactor {

    public static void main(String[] args) {

        long input = 600851475143l;

        long max = 0;

        ArrayList<Long> allFactors = new ArrayList<Long>();

        if (input % 2 == 0)
            max = 2;

        for (long i = 3; i * i <= input; i += 2) {
            if (input % i == 0) { /* Check if the number is a factor */
                if (isPrime(i)) { /* Check if the factor is prime */
                    max = (i > max ? i : max); /* Check if the prime factor is greater than previous prime factor */
                }
            }

        }

        System.out.println("Largest prime factor is: " + max);

    }

    public static boolean isPrime(long i) {
        for (long j = 3; j * j <= i; j += 2) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}
