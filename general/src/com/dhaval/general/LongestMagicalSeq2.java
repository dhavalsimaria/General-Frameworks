/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author Dhaval Simaria
 *
 */
public class LongestMagicalSeq2 {

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

            /**To check that beginning of LMS is 'a'*/
            if (inputChars[i] == 'a') {
                char temp = 'a';
                String resultString = "" + 'a';
                maxLength[i] = 0;
                for (int j = i + 1; j < inputChars.length; j++) {
                    if (inputChars[j] == temp) {
                        // System.out.println("---------------------------------");
                        temp = inputChars[j];
                        // System.out.println("Temp: " + temp);
                        resultString = resultString + temp;
                        // System.out.println("Sub-result string: " + resultString);
                    } else if (temp == 'a' && inputChars[j] == 'e') {
                        // System.out.println("---------------------------------");
                        temp = inputChars[j];
                        // System.out.println("Temp: " + temp);
                        resultString = resultString + temp;
                        // System.out.println("Sub-result string: " + resultString);
                    } else if (temp == 'e' && inputChars[j] == 'i') {
                        // System.out.println("---------------------------------");
                        temp = inputChars[j];
                        // System.out.println("Temp: " + temp);
                        resultString = resultString + temp;
                        // System.out.println("Sub-result string: " + resultString);
                    } else if (temp == 'i' && inputChars[j] == 'o') {
                        // System.out.println("---------------------------------");
                        temp = inputChars[j];
                        // System.out.println("Temp: " + temp);
                        resultString = resultString + temp;
                        // System.out.println("Sub-result string: " + resultString);
                    } else if (temp == 'o' && inputChars[j] == 'u') {
                        // System.out.println("---------------------------------");
                        temp = inputChars[j];
                        // System.out.println("Temp: " + temp);
                        resultString = resultString + temp;
                        // System.out.println("Sub-result string: " + resultString);
                    }
                }
                System.out.println("Result String: " + resultString);
                /**To check that LMS found ends with 'u'*/
                if (resultString.endsWith("u")) {
                    maxLength[i] = resultString.length();
                }
            }
        }
        int result = 0;
        for (int i = 0; i < maxLength.length; i++) {
            if (maxLength[i] > result)
                result = maxLength[i];
        }
        return result;

    }
}
