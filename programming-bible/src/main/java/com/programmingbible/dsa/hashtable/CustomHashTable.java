package com.programmingbible.dsa.hashtable;

public class CustomHashTable {
    /* Steps for implementing hashTable
     1 - Initialize Node(LinkedList) and HashTable classes with vars and constructors
     2 - Create basic hash function to map keys to values - this is used in put,get and delete methods
     3 - Create necessary methods for manipulation: adding, deletion, retrieving
       - Create an array of buckets, where each bucket is a linked list of key-value pairs
    */

    private LinkedListNode[] map;
    private static int initSize = 1000;

    public CustomHashTable(int size) {
        map = new LinkedListNode[size];
    }

    private static class LinkedListNode {
        int key;
        String value;
        LinkedListNode next;

        LinkedListNode(int key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private static int hashFunction(int key) {
        return key % initSize;
    }

    public void put(int key, String value) {
        int index = hashFunction(key);
        LinkedListNode currentNode = map[index];

        if (map[index] == null) {
            map[index] = new LinkedListNode(key, value);
            return;
        }

        while (currentNode != null) {
            if (currentNode.key == key) {
                currentNode.value = value;
                return;
            }
            if (currentNode.next == null) {
                currentNode.next = new LinkedListNode(key, value);
                return;
            }
            currentNode = currentNode.next;
        }

        currentNode.next = new LinkedListNode(key, value);
    }

    public void remove(int key) {
        int index = hashFunction(key);
        LinkedListNode currentNode = map[index];
        LinkedListNode prevNode = null;

        while (currentNode != null) {
            if (currentNode.key == key) {
                if (prevNode == null) {
                    map[index] = currentNode.next;
                } else {
                    prevNode.next = currentNode.next;
                }
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public String get(int key) {
        int index = hashFunction(key);
        LinkedListNode currentNode = map[index];

        while (currentNode != null) {
            if (currentNode.key == key) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return "-1";
    }
}

