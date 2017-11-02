/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author Dhaval Simaria
 *
 */
public class LongestMagicalSeq {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int result = findLengthOfLongestMagSeq(input);

        System.out.println("Length of Longest Magical Sequence: " + result);

        scan.close();
    }

    public static int findLengthOfLongestMagSeq(String input) {
        char inputChars[] = input.toCharArray();

        int maxLength[] = new int[inputChars.length];

        if (inputChars == null || inputChars.length == 0)
            return 0;

        for (int i = 0; i < inputChars.length; i++) {
            maxLength[i] = 1;
            for (int j = 0; j < i; j++) {
                if (inputChars[i] == inputChars[j] || inputChars[j] == 'a' && inputChars[i] == 'e' || inputChars[j] == 'e' && inputChars[i] == 'i' || inputChars[j] == 'i' && inputChars[i] == 'o' || inputChars[j] == 'o' && inputChars[i] == 'u'
                    || inputChars[j] == 'u' && inputChars[i] == 'a') {
                    System.out.println("inputChars[i]: " + inputChars[i] + " | inputChars[j]: " + inputChars[j] + " | i: " + i + " | maxLength[i]: " + maxLength[i] + " | j: " + j + " | maxLength[j] + 1: " + (maxLength[i] + 1));
                    maxLength[i] = Math.max(maxLength[i], maxLength[j] + 1);
                    System.out.println("--> maxLength[i]: " + maxLength[i]);
                }
            }
            System.out.println("-----------------------------------------------------------------------");
        }

        System.out.println("MaxLength: " + maxLength.length);
        int result = 0;
        for (int i = 0; i < maxLength.length; i++) {
            System.out.println("MaxLength elements: " + maxLength[i]);
            if (maxLength[i] > result) {
                System.out.println(maxLength[i]);
                result = maxLength[i];
            }
        }
        return result;
    }

}
