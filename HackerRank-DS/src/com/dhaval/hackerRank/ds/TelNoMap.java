/**
 * 
 */
package com.dhaval.hackerRank.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Dhaval Simaria
 *
 */
public class TelNoMap {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Map<String, String> telDictMap = new HashMap<String, String>();

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String telRecord = scan.nextLine();

            String keyValue[] = telRecord.split(" ");

            telDictMap.put(keyValue[0], keyValue[1]);
        }

        long elapsedTime = 0L;
        List<String> queryNames = new ArrayList<String>();
        // while (scan.hasNext(Pattern.compile("[a-z]*"))) {
        while (scan.hasNext() && elapsedTime <= 15 * 1000) {
            String name = scan.nextLine();
            if (name.equals(""))
                break;
            System.out.println("Name: " + name);
            // queryNames.add(name);
            String output = telDictMap.get(name) == null ? "Not Found" : name + "=" + telDictMap.get(name);
            System.out.println("Output: " + output);
            queryNames.add(output);
            // System.out.println(output);
        }

        /*int i = 0;
        while (i < queryNames.size()) {
            System.out.println(queryNames.get(i));
            i++;
        }*/

        queryNames.forEach((element) -> System.out.println(element));
        // queryNames.forEach((element) -> System.out.println(telDictMap.get(element) == null ? "Not Found" : element + "=" + telDictMap.get(element)));
        scan.close();
    }

}
