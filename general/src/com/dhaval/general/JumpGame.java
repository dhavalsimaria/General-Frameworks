package com.dhaval.general;

/**
 * Why 'max <= i' is checked?
 * Ans: It is so to check whether last jump('max') is able to reach current position 'i'.
 * If not then last index cannot be reached.
 *
 *Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position. 
 * Determine if you are able to reach the last index. For example: A = [2,3,1,1,4], return true. A = [3,2,1,0,4], return false.

 *Analysis

 *We can track the maximum index that can be reached. 
 *The key to solve this problem is to find: 
 *1) when the current position can not reach next position (return false) , and 
 *2) when the maximum index can reach the end (return true).

 *The largest index that can be reached is: i + A[i].
 */


import java.util.Scanner;

public class JumpGame {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in array: ");
		int arrSize = scn.nextInt(); 
		
		int arr[] = new int[arrSize];
		
		System.out.print("Enter "+ arrSize +" elements: ");
		
		for(int i = 0; i < arrSize; i++){
			arr[i] = scn.nextInt();
		}
		
		boolean result = jump(arr);
		if(result == false){
			System.out.println("Cannot reach last index.");
		} else {
			System.out.println("Last index is reachable.");
		}
	}
	
	public static boolean jump(int arr[]){
		if(arr.length <= 1)
			return true;
		
		int max = arr[0];		//'max' stands for maximum index that can be reached.
		
		for(int i = 0; i <= arr.length; i++){
			if(max <= i && arr[i] == 0)
				return false;		//Cannot move forward as index value is '0'.
			 
			if(i + arr[i] > max){	//Possibility of moving forward
				max = i + arr[i]; 	//Update max value. 		
			}
	
			if(max == arr.length-1)
				return true;
		}
		return false;
	}

}
