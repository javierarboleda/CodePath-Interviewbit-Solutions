package com.javierarboleda.codingchallenges.challenges.bit_manipulation;

/**
 * Created on 1/10/17.
 */

public class CommonBitTasks {

    public static boolean getBit(int num, int i) {
        return ((num & (1 << i)) != 0);
    }

    public static int setBit(int num, int i) {
        return (num | (1 << i));
    }

    public static int clearBit(int num, int i) {
        int clearHelper = ~(1 << i);
        return num & clearHelper;
    }

    public static int clearBitsMsbThroughI(int num, int i) {
        int clearHelper = (1 << i) -1;
        return num & clearHelper;
    }

    public static int clearBitsThrough0(int num, int i) {
        int clearHelper = ~(-1 >>> (31 - 1));
        return num & clearHelper;
    }

    public static int updateBit(int num, int i, boolean newValue) {
        int intValue = newValue ? 1 : 0;
        int clearHelper = ~(1 << i);
        return (num & clearHelper) | (intValue << i);
    }

    public static void main(String[] args) {

    }

}
