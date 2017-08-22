/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author Dhaval
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
 *design an algorithm to find the maximum profit.
 *
 */
public class BestTimeBuySell {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number of days for stock prices: ");
		
		int days = scn.nextInt();
		
		int stockArr[] = new int[days];
		
		System.out.println("Enter stock prices for " + days + " days: ");
		
		for(int i = 0; i < days; i++){
			stockArr[i] = scn.nextInt();
		}
		
		int maxProfit = compareStocks(stockArr);
		
		System.out.println("Max. profit earned is: " + maxProfit);
	}

	public static int compareStocks(int[] stockArr){
		if(stockArr == null || stockArr.length <= 1)
			return 0;
		
		int min = stockArr[0];
		int result = 0;
		
		for(int i = 0; i < stockArr.length; i++){
			result = Math.max(result, stockArr[i] - min);
			min = Math.min(min, stockArr[i]);
		}
		return result;
	}
}
