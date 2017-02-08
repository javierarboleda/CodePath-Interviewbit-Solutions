package com.javierarboleda.codingchallenges.challenges.binary_search;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 1/11/17.
 */

public class IbKthSmallestElementInTheArray {


    public static int kthsmallest(final List<Integer> a, int k) {

        if (k < 1 || k > a.size())
            throw new ArrayIndexOutOfBoundsException("Input needs to be within array size bounds!");

        if (a.isEmpty())
            throw new IllegalArgumentException("Do not pass an empty list!");

        Integer[] b = new Integer[a.size()];

        b = a.toArray(b);
        Arrays.sort(b);

        return b[k - 1];
    }

    public static void main(String[] args) {



        System.out.println("" + kthsmallest(
            Arrays.asList(8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92),
            0
        ));

    }



}
