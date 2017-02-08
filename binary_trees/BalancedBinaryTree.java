package com.javierarboleda.codingchallenges.challenges.binary_trees;

/**
 * Created on 2/8/17.

 https://www.interviewbit.com/problems/balanced-binary-tree/

 Given a binary tree, determine if it is height-balanced.

 Height-balanced binary tree : is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 Return 0 / 1 ( 0 for false, 1 for true ) for this problem

 Example :

 Input :
   1
  / \
 2   3

 Return : True or 1

 Input 2 :
 3
    /
   2
  /
 1

 Return : False or 0
 Because for the root node, left subtree has depth 2 and right subtree has depth 0.
 Difference = 2 > 1.

 */

public class BalancedBinaryTree {

    int balanced = 1;

    public int isBalanced(TreeNode a) {

        height(a);
        return balanced;

    }

    public int height(TreeNode a) {
        if (a == null) {
            return 0;
        }

        int leftHeight = 1 + height(a.left);
        int rightHeight = 1 + height(a.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            balanced = 0;
        }

        return Math.max(leftHeight, rightHeight);
    }

}
