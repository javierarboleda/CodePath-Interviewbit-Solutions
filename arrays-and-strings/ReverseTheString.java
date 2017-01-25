package com.javierarboleda.codingchallenges.challenges.arrays_and_strings;

import java.util.ArrayDeque;

/**
 * Created on 1/23/17.

 Given an input string, reverse the string word by word.

 Example:

 Given s = "the sky is blue",

 return "blue is sky the".


 A sequence of non-space characters constitutes a word.

 Your reversed string should not contain leading or trailing spaces, even if it is present in the
 input string.

 If there are multiple spaces between words, reduce them to a single space in the reversed string.

 */

public class ReverseTheString {

    static String reversedString(String a) {
        StringBuffer sb = new StringBuffer();

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == ' ') {
                if (sb != null) {
                    stack.push(sb.toString());
                    sb = sb.delete(0, sb.length());
                }
            } else{
                sb.append(a.charAt(i));
            }
        }

        if (sb.length() > 0) {
            stack.push(sb.toString());
            sb = sb.delete(0, sb.length());
        }

        sb = sb.delete(0, sb.length());

        while(!stack.isEmpty()) {
            sb.append(stack.pop() + " ");
        }

        sb.delete(sb.length() - 1, sb.length());

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reversedString("j"));
    }
}
