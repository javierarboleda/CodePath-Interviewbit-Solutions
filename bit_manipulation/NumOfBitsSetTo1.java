package com.javierarboleda.codingchallenges.challenges.bit_manipulation;

/**
 *  Write a program that counts the number of bits that are set to 1 in an integer
 */

public class NumOfBitsSetTo1 {

    public static short countBits(int x) {
        short numBits = 0;

        while (x !=0) {
            numBits += (x & 1);
            x >>>= 1;  // why ">>>" and not ">>" ? Both seem to have same result
        }

        return numBits;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println(countBits(-12563));
    }

}
