package com.dhaval.general;

import java.util.Scanner;

public class PatternSpace_OtherAns2 {
	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer and I will display a pattern for you: ");
        int n = input.nextInt();

        displayPattern(n);
    }

    public static void displayPattern(int n)
    {
        final int MAX_ROWS = n;
        System.out.println("MAX_ROWS=" + MAX_ROWS);
        final int MAX_COLUMNS = n + (n-1);
        System.out.println("MAX_COL:"+ MAX_COLUMNS);
        String output = "";

        for (int row = 1; row <= MAX_ROWS; row++)
        {
            // Reset string for next row printing
            output = "";

            for (int space = MAX_COLUMNS; space > (row+1); space--) {
                output = output + " ";
            }

            for (int number = row; number >= 1; number--) {
                output = output + " " + number;
               // System.out.println("o/p:"+ output);
            }

            // Prints up to n (ignore trailing spaces)
            System.out.println("\t\t\t\t"+output);
            output = output.substring(output.length() - MAX_COLUMNS);
            
            System.out.println(output);
        }
    }
}
