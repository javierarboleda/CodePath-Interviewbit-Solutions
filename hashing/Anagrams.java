package com.javierarboleda.codingchallenges.challenges.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created on 1/25/17.

 Given an array of strings, return all groups of strings that are anagrams. Represent a group by a list of integers representing the index in the original list. Look at the sample case for clarification.

 Anagram : a word, phrase, or name formed by rearranging the letters of another, such as 'spar', formed from 'rasp'
 Note: All inputs will be in lower-case.
 Example :

 Input : cat dog god tca
 Output : [[1, 4], [2, 3]]
 cat and tca are anagrams which correspond to index 1 and 4.
 dog and god are another set of anagrams which correspond to index 2 and 3.
 The indices are 1 based ( the first element has index 1 instead of index 0).

 Ordering of the result : You should not change the relative ordering of the words / phrases within the group. Within a group containing A[i] and A[j], A[i] comes before A[j] if i < j. 

 */

public class Anagrams {

    public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {

        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {
            char[] cArray = a.get(i).toCharArray();
            Arrays.sort(cArray);
            String sorted = new String(cArray);
            // now sorted, add to hashmap
            if (map.containsKey(sorted)) {
                map.get(sorted).add(i + 1);
            } else {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i + 1);
                map.put(sorted, list);
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (String key : map.keySet()) {
            result.add(map.get(key));
        }

        return result;

    }


}
