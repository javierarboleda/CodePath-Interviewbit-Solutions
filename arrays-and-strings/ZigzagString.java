package com.javierarboleda.codingchallenges.challenges.arrays_and_strings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created on 1/24/17.
 The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

 P.......A........H.......N
 ..A..P....L....S....I...I....G
 ....Y.........I........R
 And then read line by line: PAHNAPLSIIGYIR
 Write the code that will take a string and make this conversion given a number of rows:

 string convert(string text, int nRows);
 convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR"
 **Example 2 : **
 ABCD, 2 can be written as

 A....C
 ...B....D
 and hence the answer would be ACBD.
 */

public class ZigzagString {

    public String convert(String a, int b) {

        if (b == 0 || b == 1) {
            return a;
        }

        ArrayList<ArrayList<Character>> lists = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            lists.add(i, new ArrayList<Character>());
        }

        int inc = 1;
        int i = 0;
        for (Character c : a.toCharArray()) {
            lists.get(i).add(c);
            if (i == b - 1) { inc = -1; }
            if (i == 0) { inc = 1; }
            i += inc;
        }

        StringBuffer sb = new StringBuffer();

        for (ArrayList<Character> list : lists) {
            for (char c : list) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
