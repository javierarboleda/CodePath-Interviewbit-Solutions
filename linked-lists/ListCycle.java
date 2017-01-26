package com.javierarboleda.codingchallenges.challenges.lists;

/**
 * Created on 1/25/17.

 Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

 Try solving it using constant additional space.

 Example :

 Input :

           ______
          |     |
          \/    |
 1 -> 2 -> 3 -> 4

 Return the node corresponding to node 3.

 */

import java.util.HashSet;

/**
  Definition for singly-linked list.
  class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
 */
public class ListCycle {

    public ListNode detectCycle(ListNode a) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode head = a;

        while (head.next != null) {
            if (set.contains(head)) {
                return head;
            } else {
                set.add(head);
                head = head.next;
            }
        }

        return null;

    }

    class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }
}
