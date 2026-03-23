<!-- ## Introduction

Sliding Window is a powerful technique for optimizing operations on contiguous data structures
(arrays & strings). It reduces brute-force **O(n^2)** to **O(n)** by avoiding overlapping work.

## Definition

>📖
>Sliding Window maintains a moving range inside a sequence using two pointers (`left`, `right`),
>updating state incrementally as the window slides.

---

## Core Concept

- Maintain a “window” of elements and slide it across the data structure
- The window is defined by two pointers:
  - `left` (start)
  - `right` (end) -->


# Sliding Window Algorithm

## Definition

- Powerful problem solving technique for optimizing operations on contiguous data-structures(arrays & strings).
    - Improves time complexity It reduces brute-force **O(n^2)** to **O(n)** by avoiding overlapping work.
    - Converts 2 nested loops into a single loop
- ### Core-concept:
    >📖
    >Sliding Window maintains a moving range inside a sequence using two pointers (`left`, `right`),
    >updating state incrementally as the window slides.
    - Maintain a window of elements and slide it across the length of data structure.
    - The window is defined by two pointers:
        - `left` (start)
        - `right` (end)
---


## Fixed vs Dynamic Window

<details>
<summary><strong>Fixed vs Dynamic Window</strong></summary>

| Feature | Fixed-size Window | Dynamic Window |
|--------|------------------|----------------|
| Size | Constant (k) | Variable |
| Loop Type | for loop | for + while loop |
| Shrinking | Not allowed | Allowed |
| Condition | N/A | Must always remain valid |
| Use Case | Sum, Average | Longest / Shortest problems |

---
</details>


## Decision Framework (When to Use)

<details>
<summary><strong>Use Sliding Window if</strong></summary>

- Problem involves **contiguous data** (subarray / substring)
- Input is an **array or string** (ordered)
- Brute force requires **nested loops**
- Window state can be updated incrementally (**add/remove elements**)

</details><br>

<details>
<summary><strong>Do NOT use Sliding Window if</strong></summary>

- Non-contiguous selection is allowed
- Working with trees or graphs
- Order does not matter → use **HashMap / Set instead**

</details>

---

## Fixed-Size Sliding Window

<details>
<summary><strong>Concepts & Use Cases</strong></summary>

- Window size remains constant
- Uses two pointers: `left` and `right`
- Common use cases:
  - Max / Min subarray sum
  - Moving averages
  - String anagrams
  - Adjacent element problems
  - Element frequency tracking

</details><br>

<details>
<summary><strong>PsuedoCode</strong></summary>

**add → remove → update**

```txt
initialize windowState

// build initial window
for i from 0 → k-1:
    update windowState

initialize result

// slide window
for right from k → n-1:
    add nums[right]
    remove nums[right - k]
    update result

return result
```

</details>

---

## Dynamic Sliding Window

<details>
<summary><strong>Concepts & Use Cases</strong></summary>

- Window size changes dynamically based on conditions
- Common use cases:
  - Longest/Shortest Subarray/substring
  - Smallest subarray with sum
  - No-repeat substring
  - Longest subarray with ones after replacement
  - Best time to buy and sell stock

</details><br>

<details>
<summary><strong>PsuedoCode</strong></summary>

```txt
initialize left = 0

for right from 0 → n-1:
    add element to windowState

    while window is invalid:
        remove element at left
        left++

    update result

return result
```

</details>

---

## 🧠 LeetCode Problems

<details>
<summary><strong>LeetCode Problems</strong></summary>

| Problem Name | Difficulty | Pattern / Technique | Time / Space Complexity | Key Insight | Link |
|--------------|------------|---------------------|--------------------------|-------------|------|
| Best Time to Buy and Sell Stock | Easy | Sliding Window / Two Pointers | O(n) / O(1) | Track minimum price so far; maximize profit by comparing current price with min | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) |

</details>

## Self-Testing

<details>
<summary><strong>Questions</strong></summary>

1. Is the data contiguous?
2. Is the window sized fixed or variable?
3. What condition makes the window invalid?
4. What state do I need to track?

</details>

---

## References

<details>
<summary><strong>Links</strong></summary>

https://leetcode.com/discuss/post/3722472/sliding-window-technique-a-comprehensive-ix2k/

</details>
