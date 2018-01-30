/**
 * 
 */
package com.dhaval.general;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Dhaval Simaria
 *
 */
public class SO_TimeComplexity3 {

    private static final String PRIV = "PRIV";
    private static final String PUB = "PUB";

    private static final List<String> testStrings = Collections.unmodifiableList(Arrays.asList(new String[] { PRIV, PUB }));

    public static void main(String args[]) {

        String request = "PRIV";

        /*************TEST 3*******************/
        long startTime3 = System.nanoTime();

        if (testStrings.contains(request)) {
            System.out.println("FOUND A MATCH");
        }
        long endTime3 = System.nanoTime();

        long duration3 = (endTime3 - startTime3);

        System.out.println("TEST 3 RUN-TIME: " + duration3);

    }
}
