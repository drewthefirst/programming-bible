Programming Bible (WIP)
=======================

Work-in-progress Java DSA “programming bible” with implementations, patterns, and notes.
Goal: a practical, searchable reference of core data structures, algorithms, and common
interview-style problems, alongside clean explanations and usage examples.

What This Will Become
---------------------
- A curated set of Java implementations for core DSA topics (arrays/strings, linked lists,
  hash tables, stacks/queues, trees, graphs, sorting, searching, DP, and more).
- Problem-focused solutions with clear explanations and complexity notes.
- Companion notes per topic to reinforce concepts and pitfalls.
- Simple runnable demos and tests for each topic.

Directory Tree (Ignored Files Hidden)
-------------------------------------
```text
programming-bible/
├── .gitignore
├── .mvn/
│   ├── jvm.config
│   └── maven.config
├── README.md
├── dsa-notes/
│   ├── hashtable/
│   ├── linkedlist/
│   └── strings-arrays/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── programmingbible/
                    ├── App.java
                    ├── core/
                    │   └── fundamentals/
                    │       ├── MyHashMap.java
                    │       └── MyNode.java
                    └── dsa/
                        ├── hashtable/
                        │   ├── ContainsDuplicate.java
                        │   ├── ContainsDuplicateII.java
                        │   ├── CustomHashTable.java
                        │   ├── GroupAnagrams.java
                        │   └── TwoSumHashMap.java
                        └── linkedlist/
                            ├── PrintLinkedList.java
                            └── ReverseLinkedList.java
```

Roadmap (Planned)
-----------------
- Strings & Arrays
  - Two Pointers, Sliding Window, Prefix/Suffix, Sorting, In-place techniques
- Linked Lists
  - Reverse, Cycle, Merge, Middle, Palindrome, Intersection
- Hash Tables
  - Frequency maps, grouping, subarray sums, custom hashmap implementation
- Stacks & Queues
  - Monotonic stack, BFS/DFS helpers, queue-based patterns
- Trees & Graphs
  - Traversals, BST ops, shortest paths, topological sort
- Sorting & Searching
  - Merge/Quick/Heap sort, binary search patterns
- Dynamic Programming
  - 1D/2D DP, memoization, tabulation
- Misc
  - Bit manipulation, math, recursion, backtracking

How to Run (WIP)
----------------
This is a Maven project. Example:
  mvn -q -DskipTests package
  mvn -q exec:java -Dexec.mainClass=com.programmingbible.App

Contributing / Notes
--------------------
- This repo is intentionally incremental and educational.
- If you add a new topic, mirror it in both code and notes folders.
