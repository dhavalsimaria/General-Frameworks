/**
 * 
 */
package com.whatfix.problem1.dhaval;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Dhaval Simaria
 *
 */
public class Problem1 {

    static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String args[]) {

        final double totalWeight = 100.00;

        String fileName = "C://Dhaval//New General//Whatfix//inputs.txt";

        // read file into stream, try-with-resources
        try (Scanner scanner = new Scanner(new File(fileName))) {

            List<Double> weight = new ArrayList<Double>();
            List<Double> cost = new ArrayList<Double>();
            while (scanner.hasNext()) {

                weight.clear();
                cost.clear();
                // int lineNo = scanner.nextInt();
                double caseWeight = scanner.nextDouble();
                if (caseWeight <= totalWeight) {
                    System.out.println("Case weight is: " + caseWeight);

                    String tempString = scanner.nextLine();

                    String[] eachCase = tempString.split("\\(");
                    for (int j = 0; j < eachCase.length; j++) {
                        String[] eachElement = eachCase[j].split("\\,");
                        if (eachElement.length > 1) {
                            for (int i = 1; i < eachElement.length; i++) {
                                if (eachElement[i].matches("[0-9]{1,2}\\.[0-9]{1,2}|100|0")) {
                                    weight.add(Double.parseDouble(eachElement[i]));
                                } else {
                                    cost.add(Double.parseDouble(eachElement[i].substring(1, eachElement[i].trim()
                                        .length() - 1)));
                                }

                            }
                        }
                    }
                    Set<Integer> result = calculateWeightCost(weight, cost, caseWeight);
                    result.forEach(System.out::println);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static Set<Integer> calculateWeightCost(List<Double> weight, List<Double> cost, double caseWeight) {

        int n = cost.size();
        int W = (int) caseWeight;
        double pack[][] = new double[n + 1][W + 1];
        Set<Integer> itemIndex = new HashSet<Integer>(); /** To store the index of items that are packed */
        /** For loop iterates over all the items */
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                double weightCtr = j;
                if (i == 0 || j == 0)
                    pack[i][j] = 0;
                else if (weight.get(i - 1) <= weightCtr) {
                    int weightDiff = (int) (weightCtr - weight.get(i - 1));
                    pack[i][j] = max(cost.get(i - 1) + pack[i - 1][weightDiff], pack[i - 1][j]);
                    System.out.println("pack[i][j]" + pack[i][j]);
                    if (pack[i][j] > pack[i - 1][j])
                        itemIndex.add(i);

                    /* if (weight.get(i) + weight.get(i - 1) < caseWeight)
                        itemIndex.add(i);*/
                } else
                    pack[i][j] = pack[i - 1][j];

            }

        }
        /*for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                while (pack[i][j] != 0) {
        
                }
            }
        }*/
        System.out.println("pack[n][W]" + pack[n][W]);
        return itemIndex;
    }
}
