/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author Dhaval Simaria
 *
 */
public class ReverseStringII {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String inputStr = scn.nextLine();
        char[] inputChars = inputStr.toCharArray();

        char[] resultChars = reverseFunction(inputChars);

        String resultStr = resultChars.toString();

        System.out.println("Reversed String: " + resultStr);

        scn.close();
    }

    public static char[] reverseFunction(char[] inputChars) {
        int i = 0;
        for (int j = 0; j < inputChars.length; j++) {
            if (inputChars[j] == ' ') {
                reverse(inputChars, i, j - 1);
                i = j + 1;
            }
        }

        // char resultChars[] = reverse(inputChars, i, inputChars.length);
        reverse(inputChars, 0, inputChars.length - 1);

        // String resultStr = resultChars.toString();
        // return resultStr;
        return inputChars;
    }

    public static void reverse(char[] inputChars, int i, int j) {
        while (i < j) {
            char temp = inputChars[i];
            inputChars[i] = inputChars[j];
            inputChars[j] = temp;
            i--;
            j++;
        }
        // return inputChars;
    }

}
