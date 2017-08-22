package com.dhaval.general;

import java.util.Scanner;

public class Coding {
int count = 0;

public static void main(String[] args) {

    Coding obj = new Coding();

    Scanner in = new Scanner(System.in);
    String w = in .next();
    boolean b = true;
    char[] c = w.toCharArray(); 
    for (int i = 0; i < c.length - 2; i++) {
        b = obj.check(i, c);  //recursive function
        if (c[i] == c[i + 1]) {
            b = false;
            break;
        }
        if (!b) {
            System.out.println("No");
            break;
        }
    }
    if (c[c.length - 2] == c[c.length - 1]) //check.for.the.remaining.chars
        System.out.println("No");
    else if (b) {
        System.out.println("Yes");
    }
}

public boolean check(int i, char[] c) {
    if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'y') {

        count++;
        if (count == 2) {
            return false; // code following this statement are executing
        }
        check(i + 1, c);
    }

    count = 0;

    return true;
}
}