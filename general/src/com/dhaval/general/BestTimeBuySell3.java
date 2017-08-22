/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author a611021
 *Say you have an array for which the ith element is the price of a given stock on day i.

 *Design an algorithm to find the maximum profit. You may complete at most two transactions.

 *Note:
 *A transaction is a buy & a sell. You may not engage in multiple transactions at the same time
 *(ie, you must sell the stock before you buy again).

 *Analysis:

 *Comparing to I and II, III limits the number of transactions to 2. This can be solve by "devide and conquer". 
 *We use left[i] to track the maximum profit for transactions before i, 
 *and use right[i] to track the maximum profit for transactions after i. 
 *You can use the following example to understand the Java solution:

 *Prices: 1 4 5 7 6 3 2 9
 *left = [0, 3, 4, 6, 6, 6, 6, 8]
 *right= [8, 7, 7, 7, 7, 7, 7, 0]
 *
 *The maximum profit = 13
 */
public class BestTimeBuySell3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter no. of days to track stock: ");
		
		int days = scn.nextInt();
		
		int stockArr[] = new int[days];
		
		System.out.println("Enter the stocks for " + days + " days.");
		
		for(int i = 0; i < days; i++)
			stockArr[i] = scn.nextInt();
		
		int maxProfit = compareStocks(stockArr);
		
		System.out.println("\n Max. profit that can be made is: " + maxProfit);
	}
	
	public static int compareStocks(int[] stockArr){
		if(stockArr == null || stockArr.length <= 1)
			return 0;
		
		
		int left[] = new int[stockArr.length];
		int right[] = new int[stockArr.length];
		
		int min = stockArr[0];						//This is min. price of stock.
		left[0] = 0; 								//This is profit before first day i.e. before first 'i'.
		for(int i = 1; i < stockArr.length; i++){
			min = Math.min(min, stockArr[i]);
			left[i] = Math.max(left[i-1], stockArr[i] - min);
		}
		
		right[stockArr.length - 1] = 0; 			//This is profit after last day i.e. after last 'i'.
		int max = stockArr[stockArr.length - 1];	//This is max. price of stock.
		for(int i = stockArr.length - 2; i >= 0; i--){
			max = Math.max(max, stockArr[i]);
			right[i] = Math.max(right[i+1], max - stockArr[i]);
		}
		
		for(int i = 0; i < stockArr.length; i++){
			System.out.print(left[i]);
		}
		System.out.println("  left array: ");
		
		for(int i = 0; i < stockArr.length; i++){
			System.out.print(right[i]);
		}
		System.out.println("  right array: ");
		
		int profit = 0;
		for(int i = 0; i < stockArr.length; i++){
			profit = Math.max(profit, left[i] + right[i]);
		}
		return profit;
	}

}
