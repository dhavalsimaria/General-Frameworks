/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author a611021
 *
 */
public class validate_input {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int m=0, n=0;
		
		Scanner scn = new Scanner(System.in);
		
		do{
			System.out.println("Enter value of m: ");
			m = scn.nextInt();
			if(m==0){
				System.out.println("m cannot be 0 or blank");
			}
		}while(m==0);
		
		System.out.println("Value of m: " + m);
		
		do{
			System.out.println("Enter value of n: ");
			n = scn.nextInt();
			if(n==0){
				System.out.println("n cannot be 0 or blank");
			}
		}while(n==0);
		
	}

}
