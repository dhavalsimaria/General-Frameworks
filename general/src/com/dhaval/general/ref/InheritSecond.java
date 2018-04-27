/**
 * 
 */
package com.dhaval.general.ref;

/**
 * @author Dhaval Simaria
 *
 */
public class InheritSecond extends InheritFirst {

    public InheritSecond(int j) {
        super(j);
        System.out.println(i);
        this.i = j * 20;
    }
}
