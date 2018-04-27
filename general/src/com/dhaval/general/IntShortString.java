/**
 * 
 */
package com.dhaval.general;

/**
 * @author Dhaval Simaria
 *
 */
public class IntShortString {

    public static void main(String args[]) {
        short s = 0;
        int x = 07;
        int y = 06; /* int y = 08; This will not compile[Ref. point 3] */
        int z = 112345;

        s += z;
        System.out.println("" + x + y + s);
    }
}

/*
 * 1. In Line 12 The “” in the println causes the numbers to be automatically cast as strings. So it doesn’t do addition, but appends together as string.
 * 2. In Line11 the += does an automatic cast to a short. However the number 123456 can’t be contained within a short, so you end up with a negative value (-7616).
 * 3. Those other two are red herrings however as the code will never compile due to line 15. Any number beginning with zero is treated as an octal number (which is 0-7).
*/