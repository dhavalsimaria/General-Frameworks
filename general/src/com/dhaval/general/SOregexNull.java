/**
 * 
 */
package com.dhaval.general;

/**
 * @author a611021
 *
 */
public class SOregexNull {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String abc123 = "NULL";
		String test = "xyz";
		//String resultStr = null;
		String NULL=" ";
		
		System.out.println("abc123= " + abc123);
		System.out.println("Test1: " + (abc123+test));
		
		if(abc123.matches("^(\"NULL\")$")){
			System.out.println("TRUE");
			abc123 = abc123.replace("\"NULL\"", NULL);
		}

		System.out.println("New str: " + abc123);
		System.out.println("Test2:" + (abc123+test));
	}

}
