/**
 *  Two strings are anagram if both are made using same alphabets in same quantity. 
 */
package com.dhaval.general;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Dhaval Simaria
 *
 */
public class Anagram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter String 1: ");
        String inputStr1 = scan.nextLine();

        System.out.println("Enter String 2: ");
        String inputStr2 = scan.nextLine();

        if (inputStr1.isEmpty() || inputStr2.isEmpty())
            System.out.println("Strings are not an Anagram.");

        char input1Chars[] = inputStr1.toCharArray();
        char input2Chars[] = inputStr2.toCharArray();

        /** Method 1: Sorting the character arrays and then comparing them. But this method is case-sensitive. */
        Arrays.sort(input1Chars);
        Arrays.sort(input2Chars);

        if (Arrays.equals(input1Chars, input2Chars))
            System.out.println("IT IS AN ANAGRAM.");

        /** Method 2: By comparing HashMap of two character arrays. This method is made case-insensitive by using Uppercase keys while storing. */
        Map<String, Integer> str1Map = calOccurrence(input1Chars);

        Map<String, Integer> str2Map = calOccurrence(input2Chars);

        if (str1Map.equals(str2Map))
            System.out.println("It is an Anagram.");
        else
            System.out.println("It is not an Anagram.");

        scan.close();
    }

    public static Map<String, Integer> calOccurrence(char inputChars[]) {
        Map<String, Integer> resultMap = new HashMap<String, Integer>();
        for (int i = 0; i < inputChars.length; i++) {
            char temp = inputChars[i];
            int ctr = 0;
            if ((temp + "").matches("[A-z]*")) { /** To eliminate any characters other than uppercase and lowercase A-Z. */
                if (resultMap.containsKey(temp + ""))
                    ctr = resultMap.get(temp + "") + 1;
                else
                    ctr = 1;
                resultMap.put((temp + "").toUpperCase(), ctr); /** Keys are made uppercase before storing. */
            }
        }
        return resultMap;
    }
}
