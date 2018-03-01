/**
 * Various PreficTree operations(insert, search, fetch suggestions) are implemented, which are used in driver program.
 */
package com.dhaval.huawei.ds;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Dhaval Simaria
 *
 */

public class PTreeImpl {
    private PrefixTree root;

    /* Constructor */
    public PTreeImpl() {
        root = new PrefixTree(' ');
    }

    /* Function to insert word */
    public void insert(String word) {
        if (search(word) == true)
            return;
        PrefixTree current = root;
        for (char ch : word.toCharArray()) {
            PrefixTree child = current.subNode(ch);
            if (child != null)
                current = child;
            else {
                current.childList.add(new PrefixTree(ch));
                current = current.subNode(ch);
                current.word = word;
            }
            current.count++;
        }
        current.isEnd = true;
    }

    /* Function to search for existing word */
    public boolean search(String word) {
        PrefixTree current = root;
        for (char ch : word.toCharArray()) {
            if (current.subNode(ch) == null)
                return false;
            else
                current = current.subNode(ch);
        }
        if (current.isEnd == true)
            return true;
        return false;
    }

    /* Function to fetchSuggestions for word */
    public List fetchSuggestions(String word) {
        List<String> words = new ArrayList<String>();
        Deque<PrefixTree> DQ = new ArrayDeque<PrefixTree>();

        PrefixTree current = root;
        for (char ch : word.toCharArray()) {
            if (current.subNode(ch) == null) {
                words.add("No relevant suggesstion");
                return words;
            }

            else {
                current = current.subNode(ch);

            }
        }

        DQ.addLast(current);

        while (!DQ.isEmpty()) {
            PrefixTree first = DQ.removeFirst();

            if (first.isEnd) {
                words.add(first.word);
            }

            for (PrefixTree n : first.childList) {
                if (n != null) {
                    DQ.add(n);
                }
            }
        }

        return words.stream()
            .limit(5)
            .collect(Collectors.toList());
    }
}
