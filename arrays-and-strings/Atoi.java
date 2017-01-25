package com.javierarboleda.codingchallenges.challenges.arrays_and_strings;

/**
 * Created on 1/24/17.
 */

public class Atoi {

    public int atoi(final String a) {

        boolean junkEncountered = false;

        String numString = getFirstEncounteredNumString(a);

        if (numString.isEmpty()) {
            return 0;
        }

        int result = 0;

        for (int i = 0; i < numString.length(); i++) {

            if(numString.charAt(numString.length() - 1 - i) == '-') {

                if (result == Integer.MAX_VALUE) {
                    return Integer.MIN_VALUE;
                }

                result *= -1;
                continue;
            } else if(numString.charAt(numString.length() - 1 - i) == '+') {
                continue;
            }

            result += (numString.charAt(numString.length() - 1 - i) - '0') * (Math.pow(10, i));
        }

        return result;

    }

    public String getFirstEncounteredNumString(String s) {

        boolean signEncountered = false;
        String result = "";

        for (int i = 0; i < s.length(); i++) {

            if (((s.charAt(i) == '-') || (s.charAt(i) == '+')) && !signEncountered) {
                result = "" + s.charAt(i);
                signEncountered = true;
                continue;
            }

            if (isNumber(s.charAt(i))) {
                result += extractNumString(s, i);
                return result;
            }

            if (signEncountered) {
                return "";
            }

            if(s.charAt(i) == ' ') {
                continue;
            } else if(!isNumber(s.charAt(i))) {
                break;
            }
        }

        if(result.equals("-") || result.equals("+")) {
            return "";
        }

        return result;
    }

    public String extractNumString(String s, int i) {
        StringBuffer sb = new StringBuffer();
        while(i < s.length() && (isNumber(s.charAt(i)) || (s.charAt(i) == '-') || (s.charAt(i) == '+'))) {
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }

    public boolean isNumber(char c) {
        int num = c - '0';
        if (num < 0 || num > 9) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Atoi().atoi("-54332872018247709407 4 54"));
    }

}
