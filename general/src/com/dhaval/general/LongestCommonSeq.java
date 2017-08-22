/**
 * 
 */
package com.dhaval.general;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Dhaval
 *
 */
public class LongestCommonSeq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a, b;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter string a: ");
		a = scn.nextLine();
		
		System.out.println("Enter string b: ");
		b = scn.nextLine();
		
		int result = findLCS(a, b);
		System.out.println("Longest common sequence is: " + result);
		
		/*int result2 = findLCS2(a, b);
		System.out.println("Longest common sequence is: " + result2);*/
	}
	
	public static int findLCS(String a, String b){
		int m = a.length();
		int n = b.length();
		int dp[][] = new int[m+1][n+1]; 
		
		for(int i = 0; i <= m; i++){
			for(int j = 0; j <= n; j++){
				if(i == 0 || j == 0){
					dp[i][j] = 0;
 				} else if(a.charAt(i-1) == b.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1] + 1;
				} else{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
					/*
					 * This condition says that in case of not have match at exact indexes, which combination gives maximum common sequences by removing an index in either string.
					 * e.g.: 
					 * [ABC & ABDE](It will give 2) 
					 * or 
					 * [ABCD & ABD](It will give 3)
					 * */
				}
			}
		}
		return dp[m][n];
	}
	
	public static int findLCS2(String a, String b){
		int m = a.length();
		int n = b.length();
		int dp[][] = new int[m+1][n+1]; 
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				 if(a.charAt(i) == b.charAt(j)){
					dp[i+1][j+1] = dp[i][j] + 1;
				} else{
					dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
				}
			}
		}
		return dp[m][n];
	}
	
}
