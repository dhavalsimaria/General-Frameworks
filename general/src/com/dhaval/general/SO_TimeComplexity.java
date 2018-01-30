package com.dhaval.general;

/**
 * Dhaval Simaria
 * */
public class SO_TimeComplexity {

    private static final String PRIV = "PRIV";
    private static final String PUB = "PUB";

    public static void main(String args[]) {

        String request = "PRIV";

        /*************TEST 1*******************/
        long startTime1 = System.nanoTime();

        if (PRIV.equals(request) || PUB.equals(request)) {
            System.out.println("FOUND A MATCH");
        }
        long endTime1 = System.nanoTime();

        long duration1 = (endTime1 - startTime1);

        System.out.println("TEST 1 RUN-TIME: " + duration1);

    }
}
