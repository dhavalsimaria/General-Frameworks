/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author Dhaval Simaria
 * 2D array- Hourglass Sum Problem from HackerRank
 *
 */
public class Solution {

    public static void main(String[] args) {
        int array[][] = new int[6][6];
        int max = 0;
        // int sum[] = new int[6];
        int i = 0;
        try (Scanner scan = new Scanner(System.in)) {
            while (i < 6) {
                String[] inputLine = scan.nextLine()
                    .split(" ");

                for (int j = 0; j <= 5; j++) {
                    array[i][j] = Integer.parseInt(inputLine[j]);
                }
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
        for (i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.println(array[i][j]);
            }
            System.out.println();
        }

        for (i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                int sum = array[i - 1][j - 1] + array[i - 1][j] + array[i - 1][j + 1] + array[i][j] + array[i + 1][j - 1] + array[i + 1][j] + array[i + 1][j + 1];
                System.out.println("SUM: " + sum);
                max = (sum > max ? sum : max);
                System.out.println("MAX:" + max);
            }
        }

        System.out.println(max);
    }
}
