package com.javierarboleda.codingchallenges.challenges.arrays_and_strings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created on 1/23/17.

 Given numRows, generate the first numRows of Pascal’s triangle.

 Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

 Example:

 Given numRows = 5,

 Return

 [
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
 ]


 */

public class PascalTriangleRows {

    public static ArrayList<ArrayList<Integer>> generate(int a) {

        if (a < 0) {
            return null;
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (a <= 0) {
            return result;
        }

        result.add(0, new ArrayList<>(Arrays.asList(1)));

        for (int i = 1; i < a; i++) {

            ArrayList<Integer> row = new ArrayList<>(Arrays.asList(1));
            result.add(i, row);

            ArrayList<Integer> rowPrime = result.get(i - 1);

            for (int j = 0; j < i; j++) {
                if (j == i - 1) {
                    row.add(1);
                } else {
                    row.add( (rowPrime.get(j)) + (rowPrime.get(j + 1)) );
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> result = generate(6);

        System.out.println(result.get(0).get(0));

    }
}
