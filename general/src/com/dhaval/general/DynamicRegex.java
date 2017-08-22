/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author a611021
 *
 */
public class DynamicRegex {

		public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter a string: ");
			String str = scan.nextLine();
			
			String testStr = str.substring(0, 1);
			
			String pattern = "a{"+ testStr +"}";
			
			Pattern p = Pattern.compile(pattern);
			
			Matcher m = p.matcher(str);
			
			if(m.find()){
				System.out.println(m.group()); 
			}
		}
}
