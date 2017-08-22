/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author Dhaval
 *
 */
public class HouseRobberII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in array: ");
		int arrSize = scn.nextInt(); 
		
		int arr[] = new int[arrSize];
		
		System.out.print("Enter "+ arrSize +" elements: ");
		
		for(int i = 0; i < arrSize; i++){
			arr[i] = scn.nextInt();
		}

		int result1 = houseRobDP(arr); 		//Using DP
		System.out.println("Max. amount that can be robbed is: " + result1);
	}

	public static int houseRobDP(int arr[]){
		if(arr == null || arr.length == 0)
			return 0;
		
		if(arr.length == 1)
			return arr[0];
		
		int max1 = robHelper(arr, 0, arr.length - 2);
		int max2 = robHelper(arr, 1, arr.length - 1);
		
		return Math.max(max1, max2);
	}
	
	public static int robHelper(int[] arr, int i, int j){
		if(i == j)
			return arr[i];
		
		int dp[] = new int[arr.length];
		dp[i] = arr[i];
		dp[i+1] = Math.max(dp[i], arr[i+1]);
		
		for(int k = i+2; k <=j; k++){
			dp[k] = Math.max(dp[k-2] + arr[k], dp[k-1]);
		}
		return dp[j];
	}
}
