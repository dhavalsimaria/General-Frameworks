/**
 * 
 */
package com.dhaval.general;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Dhaval Simaria
 *
 */
public class SamsungScenario {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int inputNo = scn.nextInt();

        Map<String, Long> inputMap = new HashMap<String, Long>();

        for (int i = 0; i < inputNo; i++) {
            String input = scn.nextLine();
            String[] inputArr = input.split(" ");
            inputMap.put(inputArr[0], Long.parseLong(inputArr[1]));
        }

        int ctr = 0;

        scn.close();
    }

    /*static int compareCandidates(int i, HashMap inputMap) {
        if (inputMap.get(i) > inputMap.get(i - 1)) {
            return i;
        }
    
    }*/

    static int checkCandidateKnapsack(Map inputMap) {
        
        int k[][] = new int[inputMap.size() + 1][inputMap.size() + 1];
        
        for(int i = 0; i < inputMap.size() + 1; i++) {
            
            for(int j = 0; j < inputMap.size() + 1; j++) {
                if(i == 0 || j == 0) {
                    k[i][j] = 0;
                } else if(map.) {
                    
                } else {
                    
                }
            }   
        }
        return 0;

    }
}
