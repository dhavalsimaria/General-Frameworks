/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author Dhaval
 * Say you have an array for which the ith element is the price of a given stock on day i.

 *Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). 
 *However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

 *Analysis

 *This problem can be viewed as finding all ascending sequences. For example, given {5, 1, 2, 3, 4}, buy at 1 & sell at 4 is the same as buy at 1 &sell at 2 & buy at 2& sell at 3 & buy at 3 & sell at 4.

 *We can scan the array once, and find all pairs of elements that are in ascending order.
 *
 */
public class BestTimeBuySell2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the no. of days to track stock: ");
		
		int days = scn.nextInt();
		
		int stockArr[] = new int[days];
		
		System.out.println("Enter the stock value for " + days + "days.");
		
		for(int i = 0; i < days; i++){
			stockArr[i] = scn.nextInt();
		}
		
		int maxProfit = compareStocks(stockArr);
		
		System.out.println("Max. profit that can be earned is: " + maxProfit);
	}
	
	public static int compareStocks(int stockArr[]){
		if(stockArr == null || stockArr.length <= 1)
			return 0;
		
		int profit = 0;
		
		for(int i = 1; i < stockArr.length; i++){
			int diff = stockArr[i] - stockArr[i-1];
			if(diff > 0){
				profit += diff;
			}
		}
		return profit;
	}
}
