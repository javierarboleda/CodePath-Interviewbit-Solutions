package com.javierarboleda.codingchallenges.challenges.binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created on 2/8/17.

 https://www.interviewbit.com/problems/search-for-a-range/

 Given a sorted array of integers, find the starting and ending position of a given target value.

 Your algorithm’s runtime complexity must be in the order of O(log n).

 If the target is not found in the array, return [-1, -1].

 Example:

 Given [5, 7, 7, 8, 8, 10]

 and target value 8,

 return [3, 4].

 */

public class SearchForARange {

    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> searchRange(final List<Integer> a, int target) {

        ArrayList<Integer> result = new ArrayList<>();

        int size = a.size() - 1;
        int left = 0;
        int right = size - 1;

        // get left position
        while (left < right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < target) {
                left = mid + 1;
            } else {
                right =  mid;
            }
        }

        if (a.get(left) == target) {
            result.add(left);
        } else {
            return new ArrayList<Integer>(Arrays.asList(-1, -1));
        }

        // reset right to last index
        right = size;
        // we can now start one index to right of left position
        left++;

        // get right position
        while (left < right) {
            int mid = ((left + right) / 2) + 1;
            if (a.get(mid) > target) {
                right = mid - 1;
            } else {
                left = mid;
            }

        }

        if (a.get(right) == target) {
            result.add(right);
        } else {
            result.add(result.get(0));
        }
        return result;

    }

}
