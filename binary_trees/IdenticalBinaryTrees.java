package com.javierarboleda.codingchallenges.challenges.binary_trees;

/**
 * Created on 2/8/17.

 https://www.interviewbit.com/problems/identical-binary-trees/

 Given two binary trees, write a function to check if they are equal or not.

 Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

 Return 0 / 1 ( 0 for false, 1 for true ) for this problem

 Example :

 Input :

 1       1
 / \     / \
 2   3   2   3

 Output :
 1 or True

 */

public class IdenticalBinaryTrees {

    public int isSameTree(TreeNode a, TreeNode b) {
        if ((a == null && b != null) || (a != null && b == null)) {
            return 0;
        }

        if (a == null && b == null) {
            return 1;
        }

        if (a.val != b.val) {
            return 0;
        }

        if (isSameTree(a.left, b.left) == 1 && (isSameTree(a.right, b.right)) == 1) {
            return 1;
        } else {
            return 0;
        }
    }

}
