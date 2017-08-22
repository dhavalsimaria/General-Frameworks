/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author Dhaval
 * Given an array of non-negative integers, you are initially positioned at the first index of the array. 
 * Each element in the array represents your maximum jump length at that position.

 *Your goal is to reach the last index in the minimum number of jumps.

 *For example, given array A = [2,3,1,1,4], the minimum number of jumps to reach the last index is 2. 
 *(Jump 1 step from index 0 to 1, then 3 steps to the last index.)

 *Analysis

 *This is an extension of Jump Game.

 *The solution is similar, but we also track the maximum steps of last jump.
 *
 */
public class JumpGame2 {

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

		/*int minSteps = canJump(arr);
		System.out.println("Min. steps required to reach last index: " + minSteps);*/
		
		int minSteps2 = canJump2(arr);			//Modifying the logic from JumpGame
		System.out.println("Min. steps required to reach last index: " + minSteps2);
		
		
		
	}
	
	public static int canJump(int arr[]){
		if(arr.length <= 1)
			return 0;
		
		int lastReach = 0;
		int steps = 0;
		int reach = 0;
		
		for(int i = 0; i <= reach && i < arr.length; i++){
			
			/*To check whether last jump was able to reach current position 'i'. 
			If not increment 'steps' by 1*/
			if(i > lastReach){						
				steps++;
				lastReach = reach;
			}
			
			//Update the maximal jump
			reach = Math.max(reach, arr[i] + i);
		}
		if(reach < arr.length -1)
			return 0;
		
		return steps;
	}

	public static int canJump2(int arr[]){
		if(arr.length <= 1)
			return 0;
		
		int max = arr[0];
		int steps = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(max <= i ){
				steps++;
			}
			max = Math.max(max, arr[i] + i);
		}
		if(max < arr.length - 1)
			return 0;
		
		return steps;
	}
}
