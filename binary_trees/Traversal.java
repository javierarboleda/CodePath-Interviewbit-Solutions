package com.javierarboleda.codingchallenges.challenges.binary_trees;

import java.util.ArrayList;

/**
 * Created on 2/8/17.

 https://www.interviewbit.com/problems/inorder-traversal/

 Given a binary tree, return the inorder traversal of its nodes’ values.

 Example :
 Given binary tree

 1
 \
 2
 /
 3
 return [1,3,2].

 Using recursion is not allowed.

 */

public class Traversal {

    ArrayList<Integer> result;

    public ArrayList<Integer> inorderTraversal(TreeNode a) {
        result = new ArrayList<>();
        traverseInOrder(a);
        return result;
    }

    public void traverseInOrder(TreeNode a) {

        if (a == null) {
            return;
        }

        traverseInOrder(a.left);
        result.add(a.val);
        traverseInOrder(a.right);
    }

}
