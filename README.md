# quasilinear-sorting
This repository contains implementations of three sorting algorithms: merge, quick, and insertion sort. The program `TestEfficiency` outputs information used to compare the efficiency of these algorithms as measured by wall clock time.

Merge sort and quicksort have a quasilinear O(n lg n) time complexity. Insertion sort has a quadratic O(n^2) time complexity and is used as a comparison.

These algorithms are implemented as functions in their respective classes and the main class, `TestEfficiency`, tests the timing of the implementations against each other.

To run the program on your machine, download the repository and navigate to the working directory. Compile the code with `javac EfficiencyTest.java` and run with `java EfficiencyTest`. 

The program will output information about the sorting algorithms in the following format:
1. sorting algorithm
2. runtime
3. number elements
4. status

A sample output, shortened for brevity, looks like the following:
```
insertionsort	317 ms.		50000	[OK]
mergesort	15 ms.		50000	[OK]
quicksort	74 ms.		50000	[OK]
----------------------------------------------------
insertionsort	1191 ms.	100000	[OK]
mergesort	26 ms.		100000	[OK]
quicksort	27 ms.		100000	[OK]
----------------------------------------------------
```
This information is visualized in the graph efficiency_graph.png, which is made up of runtime data points from my machine.
