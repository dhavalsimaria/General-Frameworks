/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author Dhaval
 *
 */
public class LongestIncreasingSeq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the no. of elements: ");
		int no = scn.nextInt();
		
		int arr[] = new int[no];
		
		System.out.println("Enter " + no + " elements in the array: ");
		
		for(int i = 0; i < no; i++){
			arr[i] = scn.nextInt();
		}
		int result = findLIS(arr);
		System.out.println("Longest Increasing Seq. possible: " + result);
	}
	
	public static int findLIS(int arr[]){
		if(arr == null || arr.length==0)
			return 0;
		
		for(int i = 0;;){
			
		}
	}

}
