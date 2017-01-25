package com.javierarboleda.codingchallenges.challenges.arrays_and_strings;

import java.util.List;

/**
 * Created on 1/23/17.

 Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example:

 Given the array [-2,1,-3,4,-1,2,1,-5,4],

 the contiguous subarray [4,-1,2,1] has the largest sum = 6.

 For this problem, return the maximum sum.


 */

public class MaxSumContiguousSubarray {


    public int maxSubArray(final List<Integer> a) {

        if (a == null || a.isEmpty()) {
            return 0;
        }

        // max  = -1 4 6
        // total= -1 -4 0 4 3 5 6 1 5

        int total = 0;
        int max = a.get(0);

        for (Integer n : a) {

            total += n;

            max = total > max ? total : max;

            if (total < 0) {
                total = 0;
            }
        }

        return max;
    }


}
