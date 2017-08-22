package com.dhaval.general;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KiranPhoneNumber {

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

	    int i=0;
	    while (!phoneInput.matches("^[a-zA-Z0-9]*$")) {			//Used to check if any special character is enter in phone number
	        System.out.println("Not a valid number. Try agian.");
	        phoneInput = in.next();
	    }
	    
	    List<String> one =(List) Arrays.asList(dialTwo);
	    List<String> two =(List) Arrays.asList(dialThree); 
	    List<String> three =(List) Arrays.asList(dialFour); 
	    List<String> four =(List) Arrays.asList(dialFive); 
	    List<String> five =(List) Arrays.asList(dialSix);
	    List<String> six =(List) Arrays.asList(dialSeven); 
	    List<String> seven =(List) Arrays.asList(dialEight);
	    List<String> eight =(List) Arrays.asList(dialNine);
        while(i<inputToArray.length){
        if(inputToArray[i]>=48&&inputToArray[i]<=57){
        		        	System.out.print(inputToArray[i]);
        }
        else if(one.contains(String.valueOf(inputToArray[i]).toLowerCase())){
        	System.out.print(1);}
        else if(two.contains(String.valueOf(inputToArray[i]).toLowerCase())){
        	System.out.print(2);}
        else if(three.contains(String.valueOf(inputToArray[i]).toLowerCase())){
        	System.out.print(3);}
        else if(four.contains(String.valueOf(inputToArray[i]).toLowerCase())){
        	System.out.print(4);}
        else if(five.contains(String.valueOf(inputToArray[i]).toLowerCase())){
	        	System.out.print(5);}
        else if(six.contains(String.valueOf(inputToArray[i]).toLowerCase())){
	        	System.out.print(6);} 
        else if(seven.contains(String.valueOf(inputToArray[i]).toLowerCase())){
		        	System.out.print(7);}
        else if(eight.contains(String.valueOf(inputToArray[i]).toLowerCase())){
		        	System.out.print(8);}     
        i++;
        }
	}
}
