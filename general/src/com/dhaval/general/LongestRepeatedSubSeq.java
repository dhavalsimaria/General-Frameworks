/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author Dhaval Simaria
 *
 */
public class LongestRepeatedSubSeq {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputStr = scan.nextLine();

        String resultStr = longestRepSubSeq(inputStr);

        System.out.println("Longest Repeated SubSequence: " + resultStr);

        scan.close();
    }

    public static String longestRepSubSeq(String inputString) {

        int inputLength = inputString.length();

        char[] inputCharArray = inputString.toCharArray();

        int dp[][] = new int[inputLength + 1][inputLength + 1];

        /** Create and initialize a dp table */
        for (int i = 0; i < inputLength; i++)
            for (int j = 0; j < inputLength; j++)
                dp[i][j] = 0;

        /** Fill dp table */
        for (int i = 1; i <= inputLength; i++) {
            for (int j = 1; j <= inputLength; j++) {
                /** If characters match and indexes are not same */
                if (inputCharArray[i - 1] == inputCharArray[j - 1] && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else { /** If characters do not match */
                    dp[i][j] = max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        String result = "";
        int i = inputLength;
        int j = inputLength;

        while (i > 0 && j > 0) {
            if (dp[i][j] == dp[i - 1][j - 1] + 1) {
                result = result + inputCharArray[i - 1];
                i--;
                j--;
            } else if (dp[i][j] == dp[i - 1][j])
                i--;
            else
                j--;
        }

        return reverseResult(result);
    }

    public static int max(int a, int b) {
        return (a > b ? a : b);
    }

    public static String reverseResult(String resultStr) {
        StringBuilder strBldr = new StringBuilder();
        strBldr.append(resultStr);
        return strBldr.reverse()
            .toString();
    }
}
