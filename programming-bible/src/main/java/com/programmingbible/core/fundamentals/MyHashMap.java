package com.programmingbible.core.fundamentals;


public class MyHashMap {
    MyNode arrayLinkedList [];
    final static int size = 1000;

    public MyHashMap() {
        arrayLinkedList = new MyNode[size];
    }

    private class MyNode {
        int key;
        int value;
        MyNode next;

        MyNode(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    private static int hashFunction(int key) {
        return key % size;
    }
    
    public void put(int key, int value) {
        // use hash to map index
        int index = hashFunction(key);
        MyNode currentNode = arrayLinkedList[index];

        // Check empty bucket first before iterating the array
        if(arrayLinkedList[index] == null) {
                arrayLinkedList[index] = new MyNode(key,value);
                return;
            } 

        // loop through array while currentNode exists
        while(currentNode != null){
            
            // 3 conditionals:
            
            // - if key is found within array update the node.value;
            // - if last node in array of linkedList create new node
            
            if (currentNode.key == key){ 
                currentNode.value = value;
                return;
            } else if (currentNode.next == null){
                currentNode.next = new MyNode(key,value);
                return;
            }

            currentNode = currentNode.next;

        }
        
    }
    
    public int get(int key) {
        // use hash to map index
        int index = hashFunction(key);
        MyNode currentNode = arrayLinkedList[index];

        // loop through our array of linked list using while and check condtionals if key exists return value
        while(currentNode != null){
            if (currentNode.key == key ) {
                return currentNode.value;
            }
            // iterate to next node - reassign currentNode to currentNode.next
            currentNode = currentNode.next;
        }
        return -1;
        
    }
    
    public void remove(int key) {
        // use hash function to create index var
        int index = hashFunction(key);
        // create access to currentNode
        MyNode currentNode = arrayLinkedList[index];
        MyNode prevNode = null;
        // iterate through array of LinkedList while currentNode exist
        while(currentNode != null) {
            if(currentNode.key == key) {
        // removing first node
                if(prevNode == null){
                    arrayLinkedList[index] = currentNode.next;
                }
        //removing any subsequent node we must keep update prev to keep track of chaining
                else {
                    prevNode.next = currentNode.next;
                }
                return;
            }
            // iterate variables to update tracking
        prevNode = currentNode;
        currentNode = currentNode.next;
        }

        
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
