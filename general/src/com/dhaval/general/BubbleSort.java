/**
 * 
 */
package com.dhaval.general;

/**
 * @author a611021
 *
 */
public class BubbleSort {

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("THE VALUE OF i:" + i);
            for (int j = 0; j < n - i - 1; j++) {
                System.out.println("THE VALUE OF j:" + j);
                if (arr[j] > arr[j + 1]) {
                    System.out.println("arr[j]: " + j + " and arr[j + 1]: " + (j + 1));
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("value arr[j]: " + arr[j] + " and value arr[j+1]: " + arr[j + 1] + "\n\n");
                }
            }
        }
    }

    /* Prints the array */
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
