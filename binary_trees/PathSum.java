package com.javierarboleda.codingchallenges.challenges.binary_trees;

/**
 * Created on 2/8/17.

 https://www.interviewbit.com/problems/path-sum/

 Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

 Example :

 Given the below binary tree and sum = 22,

 5
 / \
 4   8
 /   / \
 11  13  4
 /  \      \
 7    2      1
 return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

 Return 0 / 1 ( 0 for false, 1 for true ) for this problem

 */

public class PathSum {

    public int hasPathSum(TreeNode a, int b) {

        if (a == null) {
            return 0;
        }

        return hasPathSum(a, 0, b);
    }

    public int hasPathSum(TreeNode a, int sum, int target) {
        if (a == null) {
            return 0;
        }
        sum += a.val;
        if (a.left == null && a.right == null) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        if (hasPathSum(a.left, sum, target) == 1 || hasPathSum(a.right, sum, target) == 1) {
            return 1;
        }
        return 0;
    }

}
