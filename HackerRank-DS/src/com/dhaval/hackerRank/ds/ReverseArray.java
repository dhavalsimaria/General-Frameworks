/**
 * 
 */
package com.dhaval.hackerRank.ds;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Dhaval Simaria
 *
 */
public class ReverseArray {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int noOfElements = Integer.parseInt(scan.nextLine());
        int[] outputArray = new int[noOfElements];

        String inputString = scan.nextLine();
        String[] inputElements = inputString.split(" ");

        /*Arrays.stream(inputElements)
            .forEach(System.out::print);*/
        for (int j = 0; j < noOfElements; j++) {
            outputArray[j] = Integer.parseInt(inputElements[noOfElements - (j + 1)]);
        }

        Arrays.stream(outputArray)
            .forEach(element -> System.out.print(element + (" ")));

        scan.close();

    }
}
