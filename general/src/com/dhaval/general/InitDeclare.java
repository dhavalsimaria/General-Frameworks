/**
 * 
 */
package com.dhaval.general;

import com.dhaval.general.ref.InitDeclareTest1;

/**
 * @author a611021
 *
 */
public class InitDeclare {

    InitDeclareTest1 t1 = new InitDeclareTest1(10);

    InitDeclare(int i) {
        t1 = new InitDeclareTest1(i);
    }

    public static void main(String[] args) {
        InitDeclare t2 = new InitDeclare(5);

        System.out.println("t2: " + t2);
    }
}