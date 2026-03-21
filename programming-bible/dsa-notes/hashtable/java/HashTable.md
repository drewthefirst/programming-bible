## Introduction

HashMap is one of the most powerful and commonly used data structures. In this article we plan to explore how to leverage **HashMaps** effectively, its advantages and some common implementations in Java

## Definition

>📖
>A HashMap is a collection of key:value pair. Every key(is unique) is mapped to a specific value. Under the hood java implements the HashMap by extending the Map Interface, plus Hashing, for efficient key-based retrieval. Giving **HashMaps** an average time-complexity of **O(1)** - or constant time for lookups, insertions and deletions.


---

## When to Use HashMap

The primary advantage of **HashMaps** relies on performance for key-based lookups. Here are some common use cases where **HashMaps** are most effective and beneficial

<details>
<summary><strong>Uses</strong></summary>

1. **Quick Lookups**
    - Needing to frequently retrieve values based on unique keys? Think of looking up a user by ID. This is where **HashMaps** excel, they offer **O(1)** lookup time.
2. **Efficient Inserts and Deletes**
    - When adding or removing elements frequently, **HashMaps** outperform lists, which may require shifting elements or finding indexes. **HashMaps** allow for efficient and effective inserts and deletes w/o re-indexing
3. **Key-Value Mapping**
    - **HashMaps** are the go-to data-structure for data that naturally fits the key:value pair structure. They enable efficient storage and retrieval using keys. (For example userNames:emailAddresses | productIDs: productDetails)
4. **Avoiding Duplicates**
    - Keys in HashMaps must be unique! this is useful for cases where duplicate keys should be omitted. Ex. UUID: User
5. **Dynamic and Flexible Data**
    - **HashMaps** are useful where dataset size is not predetermined, **HashMaps** can grow dynamically and size must not be initialized
6. **Sparse Data Sets**
    - Large datasets where most values are unused or undefined. **HashMaps** are the most useful as it allocates memory for every possible value.
7. **Constant-Time Membership Checking**
    - Constant Time membership checks - **O(1):** allows for checking if an element exist seemingly instant. (Ex. checking if a number has been seen/visited)

---
</details>

<!-- ## Efficient use cases

| Use case | Pattern / Approach | Notes |
| --- | --- | --- |
|  |  |  | -->

<!-- --- -->

## Implementations & Under the Hood

<details>
<summary><strong>Internal Workings of HashMap</strong></summary>

### Hashing

#### Hash Function

- HashMap applies an internal hash function to the key’s hashCode() method is invoked to generate an int hash code → resulting in a uniform distribution of keys.

#### Handling Collisions

- Collision: A data collision in **HashMaps** means unique keys map to the same bucket index(value).
- Java uses separate chaining to handle this.
    - Separate Chaining: [insert definition]

</details><br>


<details>
<summary><strong>Implementations</strong></summary>

#### Array of LinkedList(Buckets)

```java
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
```
</details>

---

## Practice & Common Methods

<details>
<summary><strong>Methods</strong></summary>


## Most-used methods

| Method / Operation | Purpose | Time | Notes |
| --- | --- | --- | --- |
| .put(K,V) | adds element to map | O(1) |  |
| .get(K) | returns value of specified key | O(1) |  |
| .remove(K) | removes element from map | O(1) |  |
| .equals() | compares specified object with this map |  |  |
| isEmpty() | returns boolean based on elements existing in the map |  |  |
| .containsKey(K) | returns boolean based on map contains a mapping for specified key. |  |  |
| .getOrDefault(K,V) | returns value to which specific key is mapped, if no mapping for key is found return defaultValue |  |  |
| .putIfAbsent(K,V) | if specified key does not exist in map, then we create new key:value mapping. else returns the current value |  |  |

</details><br>

<!-- --- -->

<details>
<summary><strong>LeetCode Problems</strong></summary>

## LeetCode Problems

| Problem Name            | Difficulty | Pattern / Technique              | Time / Space Complexity | Key Insight                                                                 | Link |
|------------------------|------------|----------------------------------|--------------------------|-------------------------------------------|------|
| Contains Duplicate II  | Easy       | Sliding Window + HashSet         | O(n) / O(k)              | Maintain window of size k; remove elements outside range                    | [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/) |
| Two Sum                | Easy       | HashMap Lookup                   | O(n) / O(n)              | Store complement while iterating                                             | [Two Sum](https://leetcode.com/problems/two-sum/) |
| Group Anagrams         | Medium     | HashMap + Sorted Key             | O(n * k log k) / O(nk)   | Normalize strings (sorted or freq count) to create grouping key             | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) |
| Design HashMap         | Easy       | Array + Linked List (Chaining)   | O(1) avg / O(n) worst    | Handle collisions via chaining or open addressing                           | [Design HashMap](https://leetcode.com/problems/design-hashmap/) |
---

</details>

---

## Additional Resources

<details>
<summary><strong>References</strong></summary>

<!-- ### References -->

- https://www.geeksforgeeks.org/java/java-util-hashmap-in-java-with-examples/
- https://github.com/xuyangHan/RoadToBackendMastery/blob/main/Data_Structures_Algorithms/01_Dictionary.md
</details>
