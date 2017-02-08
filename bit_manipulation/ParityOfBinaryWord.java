package com.javierarboleda.codingchallenges.challenges.bit_manipulation;

/**
 *  EPI p. 45
 */

public class ParityOfBinaryWord {

    public static short parity(long x) {
        short result = 0;

        while (x != 0) {
            result ^= (x & 1);
            x >>>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(parity(1));
        System.out.println(parity(2));
        System.out.println(parity(3));
        System.out.println(parity(4));
        System.out.println(parity(5));
        System.out.println(parity(6));
    }
}
