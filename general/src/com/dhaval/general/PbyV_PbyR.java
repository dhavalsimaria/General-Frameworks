/**
 * 
 */
package com.dhaval.general;

/**
 * @author Dhaval Simaria
 *
 */
public class PbyV_PbyR {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("INITIAL A : " + a + ", INITIAL B : " + b);

        add5(a, b);

        System.out.println("FINAL A : " + a + ", FINAL B : " + b);
    }

    public static void add5(int a, int b) {
        a += 5;
        b += 5;

        System.out.println("UPDATE A : " + a + ", UPDATE B : " + b);
    }

}
