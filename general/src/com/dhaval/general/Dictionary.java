/**
 * 
 */
package com.dhaval.general;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Dhaval Simaria
 * 
 * [1] We will store the words in ArrayList.

[2] We will sort the list alphabetically .

[3] Use regular expression with the input string to compare with the vocabulary words. 
For this we will use Binary search.
e.g.: input string = 'ad' will be '^ad*$'

It will provide all the words starting with ad: 
i.e. admin, administrator, administration

[4] Reason to use ArrayList + Binary search: 

It is less costly to traverse ArrayList compared to LinkedList.
Searching for a prefix in an ordered vocabulary is pretty fast with the help of a binary search algorithm. 
The binary search compares a query prefix against a middle element in the list to see if the prefix comes before or after the middle element. 
The binary search is then repeated recursively on the correct half of the list while the other half is ignored. 
Because every step of the binary search halves the range still to be searched, 
the total search time is proportional to the logarithm of the number of words in the vocabulary
 * 
 *
 */
public class Dictionary {

    public static void main(String[] args) throws IOException {

        List<String> vocabList = new ArrayList<String>();

        /* Reading data from a file and storing in ArrayList */
        try (Scanner in = new Scanner(new FileReader("C:\\Dhaval\\New General\\Huawei\\input.txt"))) {

            while (in.hasNext()) {
                vocabList.add(in.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(vocabList, ALPHABETICAL_ORDER);

        System.out.println("Provide your search ");

        Scanner scn = new Scanner(System.in);
        String search = scn.nextLine();

        /* Search all matching words in vocabulary using binary search and store in list */
        List<String> workSuggestions = binarySearch("^(?=.*?\b(?:" + search + ")\b)");

        printList(workSuggestions);

    }

    /* Sort the vocabulary alphabetically */
    private static Comparator<String> ALPHABETICAL_ORDER = new Comparator<String>() {
        public int compare(String str1, String str2) {
            int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
            return (res != 0) ? res : str1.compareTo(str2);
        }
    };

    public static List binarySearch(String searchInput) {
        List<String> resultList = new ArrayList<String>();

        /**
         * Binary search implementation
         *
         */
        return resultList;
    }

    public static void printList(List resultList) {
        /**
         * Display word suggestions from dictionary
         *
         */
    }
}
