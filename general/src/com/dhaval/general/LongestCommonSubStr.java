/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author a611021
 *
 */
public class LongestCommonSubStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a, b;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter String a: ");
		a = scn.nextLine();
		
		System.out.println("Enter String b: ");
		b = scn.nextLine();
		
		/*int result = findLCSub(a,b);
		System.out.println("The LCSub is: " + result);*/
		
		int result2 = findLCSub2(a,b);
		System.out.println("The LCSub is: " + result2);
	}

	public static int findLCSub(String a, String b){
		int m = a.length();
		int n = b.length();
		
		int dp[][] = new int[m][n];
		int max = 0;
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(i == 0 || j == 0){
					dp[i][j] = 1;
				} else if(a.charAt(i-1) == b.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1] + 1;
				}
				if(max < dp[i][j])
					max = dp[i][j];
			}
		}
		return max;
	}
	
	//My method which doesnot work due to ArrayIndexOutofBound Exception.
	public static int findLCSub2(String a, String b){
		int m = a.length();
		int n = b.length();
		
		int dp[][] = new int[m][n];
		int max = 0;
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				 if(a.charAt(i) == b.charAt(j)){
					dp[i+1][j+1] = dp[i][j] + 1;
				}
				if(max < dp[i+1][j+1])	//Exception occurs here when j+1 tries to be 3.
					max = dp[i+1][j+1];
			}
		}
		return max;
	}
}
