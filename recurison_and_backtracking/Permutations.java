package com.javierarboleda.codingchallenges.challenges.recursion_and_backtracking;

import java.util.ArrayList;
import java.util.Arrays;

import static com.javierarboleda.codingchallenges.challenges.arrays_and_strings.IbAllUniquePermutations.swap;

/**
 * Created on 2/7/17.

 https://www.interviewbit.com/problems/permutations/

 Given a collection of numbers, return all possible permutations.

 Example:

 [1,2,3] will have the following permutations:

 [1,2,3]
 [1,3,2]
 [2,1,3]
 [2,3,1]
 [3,1,2]
 [3,2,1]
 NOTE
 No two entries in the permutation sequence should be the same.
 For the purpose of this problem, assume that all the numbers in the collection are unique.

 */

public class Permutations {

    public ArrayList<ArrayList<Integer>> result;

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
        result = new ArrayList<>();

        Integer[] intArray = a.toArray(new Integer[a.size()]);

        permuteR(intArray, 0, intArray.length - 1);

        return result;
    }

    public void permuteR(Integer[] array, int start, int end) {

        if (start == end) {
            result.add(new ArrayList<Integer>(Arrays.asList(array)));
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(array, start, i);
            permuteR(array, start + 1, end);
            swap(array, start, i);
        }
    }

    public void swap (Integer[] a, int i, int j) {
        Integer temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        new Permutations().permute(input);
    }
}
