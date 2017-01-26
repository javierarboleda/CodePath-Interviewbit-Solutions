package com.javierarboleda.codingchallenges.challenges.lists;

/**
 * Created on 1/25/17.
 */

public class RotateList {

    public static ListNode rotateRight(ListNode a, int b) {

        int size = getListSize(a);

        if (size == size - (b % size)) {
            return a;
        }

        b = size - (b % size);

        if (b == 0 || size < 2) {
            return a;
        }

        ListNode head;
        ListNode trav = a;
        ListNode prev;

        for (int i = 1; i < b; i++) {
            trav = trav.next;
        }

        prev = trav;
        head = trav.next;
        prev.next = null;

        trav = head;

        while (trav.next != null) {
            trav = trav.next;
        }

        trav.next = a;

        return head;

    }

    public static int getListSize(ListNode a) {
        ListNode head = a;

        int size = 1;

        while (head.next != null) {
            size++;
            head = head.next;
        }

        return size;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(68);
        ListNode temp = head;

        int[] ints = new int[]{86 , 36 , 16 , 5 , 75};

        for (int i = 0; i < ints.length; i++) {
            temp.next = new ListNode(ints[i]);
            temp = temp.next;
        }
        ListNode result = rotateRight(head, 90);

    }

     static class ListNode {
             public int val;
             public ListNode next;
             ListNode(int x) { val = x; next = null; }
         }
}
