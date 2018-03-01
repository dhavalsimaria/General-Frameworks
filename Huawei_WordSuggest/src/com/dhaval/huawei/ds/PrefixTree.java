/**
 * This is a PrefixTree, the main data structure used to create the vocabulary from input file.
 */
package com.dhaval.huawei.ds;

import java.util.LinkedList;

/**
 * @author Dhaval Simaria
 *
 */
public class PrefixTree {
    public char content;
    public boolean isEnd;
    public int count;
    public LinkedList<PrefixTree> childList;
    public String word;

    /* Constructor */
    public PrefixTree(char c) {
        childList = new LinkedList<PrefixTree>();
        isEnd = false;
        content = c;
        count = 0;
    }

    public PrefixTree subNode(char c) {
        if (childList != null)
            for (PrefixTree eachChild : childList)
                if (eachChild.content == c)
                    return eachChild;
        return null;
    }
}
