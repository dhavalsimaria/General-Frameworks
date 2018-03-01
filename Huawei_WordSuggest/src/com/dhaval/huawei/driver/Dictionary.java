/**
 * Place the inputVocab.txt at "C:\" before executing the program.
 * 
 * This is Driver class of Word Suggestion. 
 * Here we have used Prefix Tree, where words are stored based on characters from beginning of the word.
 * The first alphabet will be the parent and subsequent alphabets will be its children.
 * 
 * When search string is provided it will fetch all the words with parent nodes matching the search string.
 * 
 * e.g.: search string = 'ye' --> Result: yes year yearn...
 * 
 */
package com.dhaval.huawei.driver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.dhaval.huawei.ds.PTreeImpl;

/**
 * @author Dhaval Simaria
 *
 */
public class Dictionary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Creating object of PTreeImpl */
        PTreeImpl t = new PTreeImpl();
        char ch;

        /* Creating vocabulary from  'inputVocab' text file */
        try (Scanner in = new Scanner(new FileReader("C:\\inputVocab.txt"))) {

            while (in.hasNext()) {
                t.insert(in.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*  Fetch suggestions  */
        do {

            System.out.println("Enter search string: ");
            t.fetchSuggestions(scan.next())
                .forEach(System.out::println);

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next()
                .charAt(0);
        } while (ch == 'Y' || ch == 'y');

        scan.close();
    }
}