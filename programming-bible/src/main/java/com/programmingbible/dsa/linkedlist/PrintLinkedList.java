package com.programmingbible.dsa.linkedlist;

import com.programmingbible.core.fundamentals.MyNode;

public class PrintLinkedList {
    public static <T> void printLinkedList(MyNode<T> head) {
        MyNode<T> currentMyNode = head;

        while (currentMyNode != null) {
            System.out.println(currentMyNode.getData());

            if (currentMyNode.getNextNode() != null) {
                System.out.println("->");
            }

            currentMyNode = currentMyNode.getNextNode();
        }

        System.out.println();
    }
}
