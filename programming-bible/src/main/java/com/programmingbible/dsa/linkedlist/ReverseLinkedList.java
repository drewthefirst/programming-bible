package com.programmingbible.dsa.linkedlist;

/**
 * Definition for singly-linked list.

 1->2->3->null              null->3->2->1
 h = 1                          h=1
 n=2                            n=null
 p=null                         p=2
 * }
 */
public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    
    public ListNode reverseList(ListNode head) {
        // create var to save prevNode as null
        ListNode prevNode = null;

        // iterate through list
        while(head != null){
            ListNode nextNode = head.next; //store temp next value
            head.next = prevNode; // set next to null - reverse
            prevNode = head;
            head = nextNode;
        }
        return prevNode;
    }
}

