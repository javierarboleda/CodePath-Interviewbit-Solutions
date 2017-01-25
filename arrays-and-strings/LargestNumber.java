package com.javierarboleda.codingchallenges.challenges.arrays_and_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Created on 1/22/17.
 */

public class LargestNumber {

    // DO NOT MODIFY THE LIST
    public static String largestNumber(final List<Integer> a) {

        ArrayList<String> strings = new ArrayList<>();

        for (Integer i : a) {
            strings.add(String.valueOf(i));
        }

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {

                String s1 = x + y;
                String s2 = y + x;

                return s1.compareTo(s2);

            }
        });
        StringBuffer result = new StringBuffer("");

        for(int i = 0; i < strings.size(); i++) {
            result.append(strings.get(i));
        }

        return result.toString();

    }


    public static void main(String[] args) {
        System.out.println(largestNumber(Arrays.asList(3, 34, 9, 5, 30)));
        System.out.println(largestNumber(Arrays.asList(8, 89)));
    }

}
