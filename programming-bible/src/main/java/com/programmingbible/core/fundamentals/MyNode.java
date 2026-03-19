package com.programmingbible.core.fundamentals;


/* Objectives

   1) Understand what a Node is.
    - Fundamental unit within a data structure that contains data and one or more links to other nodes.
    - Node class will have the following attributes:
        - data and a reference to the next node
        - constructor method that uses data argument
        - setNextNode method
        - getNextNode method

   2) Understand the use of a constructor method.
    - Initializes a newly created object (state and values).

   3) Understand Java generics.
*/

public class MyNode<T> {
    private T data;
    private MyNode<T> next;

    public MyNode(T data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(MyNode<T> next) {
        this.next = next;
    }

    public MyNode<T> getNextNode() {
        return next;
    }

    public T getData() {
        return this.data;
    }
}
