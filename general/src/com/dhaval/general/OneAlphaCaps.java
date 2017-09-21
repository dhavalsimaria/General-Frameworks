/**
 * 
 */
package com.dhaval.general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author a611021
 *
 */
public class OneAlphaCaps {

    public static void main(String args[]) {

        String s2 = "my name is Dhaval. it is best choice. hi ! i am here.";
        /*String[] w = s2.split("\\. ");
        String newStr = "";
        for (int j = 0; j < w.length; j++) {
            newStr = w[j].substring(0, 1)
                .toUpperCase()
                + w[j].substring(1)
                    .toLowerCase();
            System.out.println(newStr);
        }*/

        String regexp = "(\\. [a-z])";
        Pattern p = Pattern.compile(regexp);
        Matcher m = p.matcher(s2);

        while (m.find()) {

            s2 = m.replaceFirst(". " + m.group()
                .substring(2, 3)
                .toUpperCase());
            m = p.matcher(s2);
        }
        System.out.println("Modified s2: " + s2);
    }
}
