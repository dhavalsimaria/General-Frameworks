/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author Dhaval Simaria
 *
 */
public class LargestProdinSeries {

    public static void main(String[] args) {

        long maxProduct = 0;

        Scanner scn = new Scanner(System.in);

        String inputNumbers = scn.nextLine();

        for (int i = 0; i < inputNumbers.length() - 13; i++) {

            int j = i;
            int k = j + 13;
            long tempProduct = 1;

            do {
                tempProduct *= Integer.parseInt(Character.toString(inputNumbers.charAt(j++)));
            } while (j < k);

            maxProduct = tempProduct > maxProduct ? tempProduct : maxProduct;
        }

        System.out.println("Max. product with 13 consecutive integers: " + maxProduct);

        scn.close();
    }

}
