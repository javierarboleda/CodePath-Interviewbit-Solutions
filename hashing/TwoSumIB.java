package com.javierarboleda.codingchallenges.challenges.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created on 1/25/17.

 Given an array of integers, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based.
 Put both these numbers in order in an array and return the array from your function ( Looking at the function signature will make things clearer ). Note that, if no pair exists, return empty list.

 If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.

 Input: [2, 7, 11, 15], target=9
 Output: index1 = 1, index2 = 2

 */

public class TwoSumIB {

    public ArrayList<Integer> twoSum(final List<Integer> a, int b) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = a.size() - 1; i >= 0; i--) {
            map.put(a.get(i), i);
        }

        ArrayList<Integer[]> list = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (map.containsKey(b - a.get(i))) {
                int index = map.get(b - a.get(i));
                list.add(new Integer[]{Math.min(index, i), Math.max(index,i)});
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        if (list.isEmpty()) {
            return result;
        }

        result.add(a.size());
        result.add(a.size());

        for (Integer[] indexes : list) {
            if (indexes[0] == indexes[1]) {
                continue;
            }

            if (indexes[1] < result.get(1)) {
                result.set(1, indexes[1]);
                result.set(0, indexes[0]);
            }

            if (indexes[1] == a.get(1)) {
                result.set(0, Math.min(result.get(0), indexes[0]));
            }

        }

        result.set(1, result.get(1) + 1);
        result.set(0, result.get(0) + 1);

        return result;

    }

}
