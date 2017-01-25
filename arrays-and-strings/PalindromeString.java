package com.javierarboleda.codingchallenges.challenges.arrays_and_strings;

/**
 * Created on 1/23/17.

 Given a string, determine if it is a palindrome, considering only alphanumeric characters and
 ignoring cases.

 Example:

 "A man, a plan, a canal: Panama" is a palindrome.

 "race a car" is not a palindrome.

 Return 0 / 1 ( 0 for false, 1 for true ) for this problem

 */

public class PalindromeString {

    public int isPalindrome(String a) {
        a = getAlphanumericOnly(a);

        for (int i = 0, j = a.length() - 1; i < j; i++, j--) {
            if (Character.toLowerCase(a.charAt(i)) != Character.toLowerCase(a.charAt(j))) {
                return 0;
            }
        }

        return 1;

    }

    public String getAlphanumericOnly(String s) {
        return s.replaceAll("[^A-Za-z0-9]", "");
    }

}
