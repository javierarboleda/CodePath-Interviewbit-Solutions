package com.javierarboleda.codingchallenges.challenges.heaps;

import com.javierarboleda.codingchallenges.challenges.lists.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created on 2/1/17.

 https://www.interviewbit.com/problems/merge-k-sorted-lists/

 Merge k sorted linked lists and return it as one sorted list.

 Example :

 1 -> 10 -> 20
 4 -> 11 -> 13
 3 -> 8 -> 9

 will result in

 1 -> 3 -> 4 -> 8 -> 9 -> 10 -> 11 -> 13 -> 20

 */

public class MergeKSortedLists {

    public ListNode mergeKLists(ArrayList<ListNode> a) {

        if (a == null || a.isEmpty()) {
            return null;
        }

        int size = getSize(a);

        PriorityQueue<ListNode> heap = new PriorityQueue<>(size, new Comparator<ListNode>() {
            public int compare(ListNode a, ListNode b) {
                return a.val - b.val;
            }
        });

        addNodesToHeap(a, heap);

        return getMergedLinkedList(heap);

    }

    public ListNode getMergedLinkedList(PriorityQueue<ListNode> heap) {
        ListNode node = heap.poll();
        ListNode head = node;

        while (node != null) {
            node.next = heap.poll();
            node = node.next;
        }

        return head;
    }

    public void addNodesToHeap(ArrayList<ListNode> a, PriorityQueue<ListNode> heap) {
        for (ListNode node : a) {
            ListNode h = node;
            while (h != null) {
                heap.add(h);
                h = h.next;
            }
        }
    }

    public int getSize(ArrayList<ListNode> a) {
        int size = 0;

        for (ListNode node : a) {
            ListNode h = node;
            while (h != null) {
                h = h.next;
                size++;
            }
        }

        return size;
    }

}
