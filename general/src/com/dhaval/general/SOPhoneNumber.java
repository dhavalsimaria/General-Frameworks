/**
 * 
 */
package com.dhaval.general;

import java.util.Scanner;

/**
 * @author a611021
 *
 */
public class SOPhoneNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] dialTwo = {"a", "b", "c"};
	    String[] dialThree = {"d", "e", "f"};
	    String[] dialFour = {"g", "h", "i"};
	    String[] dialFive = {"j", "k", "l"};
	    String[] dialSix = {"m", "n", "o"};
	    String[] dialSeven = {"p", "q", "r", "s"};
	    String[] dialEight = {"t", "u", "v"};
	    String[] dialNine = {"w", "x", "y", "z"};

	    Scanner in = new Scanner(System.in);

	    System.out.print("Enter a phone number: ");
	    String phoneInput = in.next();
	    char[] inputToArray = phoneInput.toCharArray();

	    while(!phoneInput.matches("^[a-zA-Z0-9]*$")) {			//Used to check if any special character is entered in phone number
	        System.out.println("Not a valid number. Try agian.");
	        phoneInput = in.next();
	    }
	    
	    while(phoneInput.matches("^[a-zA-Z0-9]*$") && !phoneInput.matches("^[0-9]*$")){
	    	phoneInput = phoneInput.replaceFirst("[a-cA-C]", "1");
	    	phoneInput = phoneInput.replaceFirst("[d-fD-F]", "2");
	    	phoneInput = phoneInput.replaceFirst("[g-iG-I]", "3");
	    	phoneInput = phoneInput.replaceFirst("[j-lJ-L]", "4");
	    	phoneInput = phoneInput.replaceFirst("[m-oM-O]", "5");
	    	phoneInput = phoneInput.replaceFirst("[p-sP-S]", "6");
	    	phoneInput = phoneInput.replaceFirst("[t-vT-V]", "7");
	    	phoneInput = phoneInput.replaceFirst("[w-zW-Z]", "8");
	    }
	    
	    System.out.println("The formatted phone number is: " + phoneInput);
	}
}
