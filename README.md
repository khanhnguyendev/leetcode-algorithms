# Algorithm Implementations in Java

This repository contains implementations of popular algorithms and data structures in Java. Each algorithm is implemented with a focus on simplicity and performance. The repository includes the following algorithms:

## Table of Contents

1. [Prefix Sum](#1-prefix-sum)
2. [Two Pointer](#2-two-pointer)
3. [Sliding Window](#3-sliding-window)
4. [Fast & Slow Pointer](#4-fast--slow-pointer)
5. [Linked List In-Place Reversal](#5-linked-list-in-place-reversal)
6. [Monotonic Stack](#6-monotonic-stack)
7. [Top 'k' Elements](#7-top-k-elements)
8. [Quick Select](#8-quick-select)
9. [Overlapping Intervals](#9-overlapping-intervals)
10. [Modified Binary Search](#10-modified-binary-search)
11. [Depth-First Search (DFS)](#11-depth-first-search-dfs)
12. [Breadth-First Search (BFS)](#12-breadth-first-search-bfs)
13. [Matrix Traversal](#13-matrix-traversal)
14. [Backtracking](#14-backtracking)
15. [Dynamic Programming](#15-dynamic-programming)

## 1. Prefix Sum

**Description**: Calculates the sum of elements between two indices in an array using the prefix sum technique.

**Function Signature**:
```java
public static int sumRange(int[] arr, int start, int end)
```

**Example**:
```java
Input: arr = {1, 2, 3, 4, 5}, start = 1, end = 3  
Output: 9  
```

## 2. Two Pointer

**Description**: Finds two numbers in a sorted array that add up to a target sum using the two-pointer technique.

**Function Signature**:
```java
public static int[] twoSum(int[] nums, int target)
```

**Example**:
```java
Input: nums = {1, 2, 3, 4, 6}, target = 6  
Output: [1, 3]  
```

## 3. Sliding Window

**Description**: Finds the maximum sum of any subarray of size `k` using the sliding window technique.

**Function Signature**:
```java
public static int maxSum(int[] arr, int k)
```

**Example**:
```java
Input: arr = {2, 1, 5, 1, 3, 2}, k = 3  
Output: 9  
```

## 4. Fast & Slow Pointer

**Description**: Detects if a linked list contains a cycle using the fast and slow pointer technique.

**Function Signature**:
```java
public static boolean hasCycle(ListNode head)
```

**Example**:
```java
Input: head = [3,2,0,-4], cycle at position 1  
Output: true  
```

## 5. Linked List In-Place Reversal

**Description**: Reverses a linked list in place.

**Function Signature**:
```java
public static ListNode reverseList(ListNode head)
```

**Example**:
```java
Input: head = [1,2,3,4,5]  
Output: [5,4,3,2,1]  
```

## 6. Monotonic Stack

**Description**: Finds the next greater element for each element in an array using a monotonic stack.

**Function Signature**:
```java
public static int[] nextGreaterElement(int[] arr)
```

**Example**:
```java
Input: arr = {2, 1, 2, 4, 3}  
Output: [4, 2, 4, -1, -1]  
```

## 7. Top 'k' Elements

**Description**: Finds the top `k` largest elements in an array.

**Function Signature**:
```java
public static int[] findTopKElements(int[] nums, int k)
```

**Example**:
```java
Input: nums = {3, 2, 1, 5, 6, 4}, k = 2  
Output: [6, 5]  
```

## 8. Quick Select

**Description**: Finds the `k`-th smallest element in an array using the Quick Select algorithm.

**Function Signature**:
```java
public static int quickSelect(int[] nums, int k)
```

**Example**:
```java
Input: nums = {3, 2, 1, 5, 6, 4}, k = 2  
Output: 2  
```

## 9. Overlapping Intervals

**Description**: Merges all overlapping intervals in an array.

**Function Signature**:
```java
public static int[][] mergeIntervals(int[][] intervals)
```

**Example**:
```java
Input: intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}}  
Output: {{1, 6}, {8, 10}, {15, 18}}  
```

## 10. Modified Binary Search

**Description**: Searches for a target value in a rotated sorted array.

**Function Signature**:
```java
public static int search(int[] nums, int target)
```

**Example**:
```java
Input: nums = {4, 5, 6, 7, 0, 1, 2}, target = 0  
Output: 4  
```

## 11. Depth-First Search (DFS)

**Description**: Performs DFS traversal on a graph starting from a given node.

**Function Signature**:
```java
public static List<Integer> dfsTraversal(Map<Integer, List<Integer>> graph, int start)
```

**Example**:
```java
Input: graph = {1 -> [2, 3], 2 -> [4], 3 -> [5]}, start = 1  
Output: [1, 2, 4, 3, 5]  
```

## 12. Breadth-First Search (BFS)

**Description**: Performs BFS traversal on a graph starting from a given node.

**Function Signature**:
```java
public static List<Integer> bfsTraversal(Map<Integer, List<Integer>> graph, int start)
```

**Example**:
```java
Input: graph = {1 -> [2, 3], 2 -> [4], 3 -> [5]}, start = 1  
Output: [1, 2, 3, 4, 5]  
```

## 13. Matrix Traversal

**Description**: Traverses a 2D matrix in all four directions (up, down, left, right) from a given cell.

**Function Signature**:
```java
public static List<int[]> traverseMatrix(int[][] matrix, int row, int col)
```

**Example**:
```java
Input: matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, row = 1, col = 1  
Output: [[1, 1], [0, 1], [2, 1], [1, 0], [1, 2]]  
```

## 14. Backtracking (N-Queens Problem)

**Description**: Solves the N-Queens problem using backtracking.

**Function Signature**:
```java
public static List<List<String>> solveNQueens(int n)
```

**Example**:
```java
Input: n = 4  
Output: [[".Q..", "...Q", "Q...", "..Q."], ["..Q.", "Q...", "...Q", ".Q.."]]  
```

## 15. Dynamic Programming (Fibonacci Sequence)

**Description**: Finds the n-th Fibonacci number using dynamic programming.

**Function Signature**:
```java
public static int fib(int n)
```

**Example**:
```java
Input: n = 5  
Output: 5  
```

## Running the Tests

Each algorithm has corresponding unit tests written using JUnit. You can run the tests using a build tool like Maven or Gradle, or directly from your IDE.

## Contributing

Feel free to fork this repository and submit pull requests for improvements or new algorithms. Contributions are welcome!

---

This **README.md** should give a clear and concise overview of the repository's contents and how to use it. It includes the algorithms, function signatures, example inputs and outputs, and instructions for running the tests.