/**
 * 
 */
package com.dhaval.general;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * @author a611021
 *
 */
public class SetOps {

    /**
     * @param args
     */
    public static void main(String[] args) {
        final int A[] = { 0, 1, 2, 4, 6, 8 };
        final int B[] = { 2, 3, 4, 5, 7, 9 };

        Set<Integer> a = new TreeSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            a.add(A[i]);
        }

        Set<Integer> b = new TreeSet<Integer>();
        for (int i = 0; i < B.length; i++) {
            b.add(B[i]);
        }

        /*System.out.println("------UNION--------");
        a.addAll(b);
        Stream.of(a)
            .forEach(System.out::println);*/

        System.out.println("------INTERSECTION--------"); /** Comment previous sections and then run.*/
        System.out.println("A intersection B (AB):");
        a.retainAll(b);
        Stream.of(a)
            .forEach(System.out::println);

        System.out.println("B intersection A (BA)"); /** Comment previous sections and then run.*/
        b.retainAll(a);
        Stream.of(b)
            .forEach(System.out::println);

        System.out.println("------COMPLEMENT--------"); /** Comment previous sections and then run.*/
        /*Set<Integer> compSet = new TreeSet<Integer>(a);
        compSet.addAll(b);*/
        a.removeAll(b);
        Stream.of(a)
            .forEach(System.out::println);

        System.out.println("------DIFFERENCE--------"); /** Comment previous sections and then run.*/

        System.out.println("---------USER FUNCTIONS---------");
        findUnion(A, B);

    }

    public static void findUnion(int A[], int B[]) {

        Set<Integer> unionSet = new HashSet<Integer>();
        // int i = 0, j = 0;
        for (int i = 0; i < A.length; i++) {
            unionSet.add(A[i]);
        }
        for (int j = 0; j < B.length; j++) {
            unionSet.add(B[j]);
        }

        Stream.of(unionSet)
            .forEach(System.out::println);
    }

    public static void findIntersection(int A[], int B[]) {

    }

}
