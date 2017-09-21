/**
 * 
 */
package com.dhaval.general;

/**
 * @author a611021
 *
 */
public class SelectionSort {

    void sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            System.out.println("THE VALUE OF i:" + i);
            // Find the minimum element in unsorted array
            // int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                System.out.println("THE VALUE OF j:" + j);
                if (arr[j] < arr[i]) {
                    System.out.println("arr[i]: " + i + " and arr[j]: " + j);
                    // min_idx = j;

                    // Swap the found minimum element with the first
                    // element
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    System.out.println("value arr[i]: " + arr[i] + " and value arr[j]: " + arr[j] + "\n\n");
                }
            }
        }
    }

    // Prints the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        int arr[] = { 64, 25, 12, 22, 11 };
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
