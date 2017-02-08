package com.javierarboleda.codingchallenges.challenges.heaps;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created on 2/8/17.

 https://www.interviewbit.com/problems/distinct-numbers-in-window/

 You are given an array of N integers, A1, A2 ,…, AN and an integer K. Return the of count of distinct numbers in all windows of size K.

 Formally, return an array of size N-K+1 where i’th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,…, Ai+k-1.

 Note:
 - If K > N, return empty array.

 For example,

 A=[1, 2, 1, 3, 4, 3] and K = 3

 All windows of size K are

 [1, 2, 1]
 [2, 1, 3]
 [1, 3, 4]
 [3, 4, 3]

 So, we return an array [2, 3, 3, 2].

 */

public class DistinctNumbersInWindow {

    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {

        if (B > A.size()) {
            return new ArrayList<Integer>();
        }

        int front = 0;
        int end = B - 1;

        ArrayList<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> map = getInitialHashMap(A, end);

        while (end < A.size()) {
            addToMap(map, A.get(end));
            result.add(map.size());
            removeFromMap(map, A.get(front));
            front++;
            end++;
        }

        return result;
    }

    public HashMap<Integer, Integer> getInitialHashMap(ArrayList<Integer> list, int end) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < end; i++) {
            addToMap(map, list.get(i));
        }
        return map;
    }

    public void addToMap(HashMap<Integer, Integer> map, int num) {
        if (map.containsKey(num)) {
            map.put(num, map.get(num) + 1);
        } else {
            map.put(num, 1);
        }
    }

    public void removeFromMap(HashMap<Integer, Integer> map, int num) {
        if (map.containsKey(num)) {
            if (map.get(num) - 1 == 0) {
                map.remove(num);
            } else {
                map.put(num, map.get(num) - 1);
            }
        }
    }

}
