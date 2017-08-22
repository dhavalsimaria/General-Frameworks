package com.dhaval.general;

import java.util.Scanner;

public class PatternSpace_OthersAns {
	public static void printPiramide(int n) {
	    int N = String.valueOf(n).length();
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n - 1 - i; j++) {
	            for (int k = 0; k < N; k++)
	                System.out.print(" ");
	        }
	        for (int j = i+1; j > 0; j--) {
	            int M = String.valueOf(j).length();
	            for (int k = 0; k < (N - M)/2; k++) {
	                System.out.print(" ");
	            }
	            System.out.print(j);
	            for (int k = (N - M)/2; k < N +1; k++) {
	                System.out.print(" ");
	            }

	        }
	        System.out.println();
	    }
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	      System.out.print("Enter an integer and I will display a pattern for you: ");
	      int n = input.nextInt();

	      printPiramide(n);
	}
}
