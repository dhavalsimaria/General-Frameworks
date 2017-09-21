/**
 * 
 */
package com.whatfix.problem1.dhaval;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Dhaval Simaria
 *
 */
public class Problem1 {

    static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    /*static List<String> packItems() {
          
    }*/

    public static void main(String args[]) {

        final double totalWeight = 100.00;

        final double totalCost = 100.00;

        String fileName = "C://Dhaval//New General//Whatfix//inputs.txt";

        // read file into stream, try-with-resources
        try (Scanner scanner = new Scanner(new File(fileName))) {

            while (scanner.hasNext()) {

                int lineNo = scanner.nextInt();
                System.out.println("Line No. is: " + lineNo);
                String tempString = scanner.nextLine();
                // System.out.println("Entire remaining line: " + tempString);
                String[] eachCase = tempString.split("\\(");
                for (int j = 0; j < eachCase.length; j++) {
                    // System.out.println(eachCase[j]);
                    String[] eachElement = eachCase[j].split("\\,");
                    System.out.println();
                    List<Double> weight = new ArrayList<Double>();
                    List<Double> cost = new ArrayList<Double>();
                    for (int i = 1; i < eachElement.length; i++) {
                        System.out.println(eachElement[i]);

                        if (eachElement[i].matches("[0-9]{1,2}\\.[0-9]{1,2}|100|0")) {
                            weight.add(Double.parseDouble(eachElement[i]));
                        } else {
                            cost.add(Double.parseDouble(eachElement[i].substring(1, eachElement[i].length() - 1)));
                        }

                    }
                    System.out.println(calculateWeightCost(weight, cost, totalWeight, totalCost));
                    System.out.println();
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static double calculateWeightCost(List<Double> weight, List<Double> cost, double totalWeight, double totalCost) {

        int n = cost.size();
        int w = totalWeight + 1;
        double pack[][] = new double[n + 1][w + 1];

    }
}
