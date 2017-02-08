package com.javierarboleda.codingchallenges.challenges.recursion_and_backtracking;

import java.util.ArrayList;

/**
 * Created on 2/7/17.

 https://www.interviewbit.com/problems/generate-all-parentheses-ii/

 Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*n.

 For example, given n = 3, a solution set is:

 "((()))", "(()())", "(())()", "()(())", "()()()"
 Make sure the returned list of strings are sorted.

 */

public class GenerateAllParentheses {

    ArrayList<String> result;

    public ArrayList<String> generateParenthesis(int a) {

        result = new ArrayList<>();

        gpr(new StringBuffer(), 0, 0, a);

        return result;

    }

    public void gpr(StringBuffer sb, int openNum, int closedNum, int n) {
        // base case where we add valid string to result
        if (openNum == n && closedNum == n) {
            result.add(sb.toString());
            return;
        }

        // case where we have an invalid combination
        if (openNum > n || closedNum > n || closedNum > openNum) {
            return;
        }

        // openNum < n? then let's add a closed
        if (openNum < n) {
            sb.append('(');
            gpr(sb, openNum + 1, closedNum, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        // openNum > closedNum? then let's add an open
        if (openNum > closedNum) {
            sb.append(')');
            gpr(sb, openNum, closedNum + 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }

    }

    public static void main(String[] args) {
        new GenerateAllParentheses().generateParenthesis(2);
    }

}
