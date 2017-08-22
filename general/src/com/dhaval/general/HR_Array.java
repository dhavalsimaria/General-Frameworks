/**
 * 
 */
package com.dhaval.general;

import java.util.*;

public class HR_Array {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scn = new Scanner(System.in);
    	System.out.println("Enter the size of array: ");
    	int size = scn.nextInt();
        int arr[] = new int[size];
   
        for(int i = 0; i < size; i++){
        	arr[i] = scn.nextInt();
        }
        String result=" ";
        for(int i = size-1; i >= 0; i--){
            result += arr[i] + " ";
        	//System.out.print(arr[i]);
        }
        System.out.println("Result: " + result.trim());
    }
}