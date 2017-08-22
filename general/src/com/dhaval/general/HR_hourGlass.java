/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author a611021
 *
 */
public class HR_hourGlass {

	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		//System.out.println("Enter i size of array: ");
		//int i = scn.nextInt();
		
		//System.out.println("Enter j size of array: ");
		//int j = scn.nextInt();
		int input[] = new int[6];
		for(int i = 0; i < 6; i++){
			input[i] = Integer.parseInt(scn.nextLine());
		}
		int arr[][] = new int[6][6];
		
		//System.out.println("Enter " + i * j + " input values.");
		for(int x = 0; x < 6; x++){
			for(int y = 0; y < j; y++){
				//System.out.println("Array element is"+ x + "," + y);
				arr[x][y] = scn.nextInt();
			}
		}
		int result = 0;
		for(int x = 0; x < i; x++){
			for(int y = 0; y < j; y++){
					if(x+2 < i && y+2 < j){
						int temp = arr[x][y] + arr[x][y+1] + arr[x][y+2]  +arr[x+1][y+1] + arr[x+2][y] + arr[x+2][y+1] + arr[x+2][y+2];
						if(temp > result){
							result = temp;
						}
					}
				}
			}
		System.out.println("\nMax. Hourglass sum: " + result);
	}
	
	
}
