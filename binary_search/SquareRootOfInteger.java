package com.javierarboleda.codingchallenges.challenges.binary_search;

/**
 * Created on 2/8/17.

 https://www.interviewbit.com/problems/square-root-of-integer/

 Implement int sqrt(int x).

 Compute and return the square root of x.

 If x is not a perfect square, return floor(sqrt(x))

 Example :

 Input : 11
 Output : 3
 DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY

 */

public class SquareRootOfInteger {

    public int sqrt(int a) { // target = 5

        if (a == 0 || a == 1) {
            return a;
        }

        int start = 1;
        int end = a;
        int mid;
        int result = 0;

        while (start <= end) {
            mid = (start + end) / 2;

            if (mid <= a / mid) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

}
