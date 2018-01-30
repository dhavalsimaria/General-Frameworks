package com.dhaval.general;

import java.util.Arrays;

public class SO_TimeComplexity2 {
    private static final String PRIV = "PRIV";
    private static final String PUB = "PUB";

    public static void main(String args[]) {

        String request = "PRIV";

        /*************TEST 2*******************/
        long startTime2 = System.nanoTime();

        if (Arrays.asList(PRIV, PUB)
            .contains(request)) {
            System.out.println("FOUND A MATCH");
        }
        long endTime2 = System.nanoTime();

        long duration2 = (endTime2 - startTime2);

        System.out.println("TEST 2 RUN-TIME: " + duration2);

    }
}
