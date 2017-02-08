package com.javierarboleda.codingchallenges.challenges.bit_manipulation;

/**
 * Created on 2/8/17.

 https://www.interviewbit.com/problems/number-of-1-bits/

 Write a function that takes an unsigned integer and returns the number of 1 bits it has.

 Example:

 The 32-bit integer 11 has binary representation

 00000000000000000000000000001011
 so the function should return 3.

 Note that since Java does not have unsigned int, use long for Java

 */

public class NumOf1Bits {

    public int numSetBits(long a) {

        int numOfBits = 0;

        while (a != 0) {
            numOfBits += a & 1;
            a >>>= 1;
        }

        return numOfBits;

    }
}
