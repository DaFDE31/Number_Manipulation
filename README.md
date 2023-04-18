# Number_Manipulation

## Goal

Please complete the four methods in the Numbers class to see if they work in the Tests class.

## IsPrime
This method takes an int as input and return true if it is prime and false if it is not.


## Factor Sum

Again, start at the first list position and hop forward 4 positions, landing on 0 (5th integer in the list). From this position the last position cannot be reached because of the 0 hop. **This is a failure**.

Consider again the following list,

```
5 3 2 1 0 2 3
```

### Implementation

Implement the solution in the `lastItemReachable()` method in the Recitiation10 class.  The method should return a <span style="color:blue;">`true`</span> if the last item in the list is reachable; otherwise the method returns a <span style="color:blue;">`false`</span>.

For Example:

```
Recitation8.lastItemReachable(new int[]{5, 3, 2, 1, 0, 2, 3});
```

Should result in a <span style="color:blue;">`false`</span>.


```
Recitation8.lastItemReachable(new int[]{5, 3, 1, 0, 1, 3});
```

Should result in a <span style="color:blue;">`true`</span>.

### Additional Information

+ You do not need to verify the correctness of the input.
+ Assume the array does not contain any negative integers.
+ You do not have to handle exceptions.


## Task 2 - Sliding Window

You are tasked with writing a program that will process a list of integers with a specified window size.  The window establishes a sub-list of integers from the list.  As the window slides, a new sub-list of integers appears.  For each sub-list, the program must display the smallest number.  For example, given a window size of 2 and the following list,

```
12 15 11 7 19 5
```

The list of integers will be divided into sub-lists of two, and the window will move one position to the right. The smallest integer for each sub-list is displayed. The list of smallest integers would be:

```
12 11 7 7 5
```

The result was obtained as follows.

1. The initial sub-list, given the window size of 2, is 12 and 15, with 12 being the smallest of the two.	<br/> <span style="border:1px solid gray;padding:5px"><span style="background-color:black; color: white; padding:5px;">12 15</span> 11 7 19 5</span>
2.	The window slides forward one position revealing the next sub-list of 15 and 11, with 11 being the smallest of the two. 	<span style="border:1px solid gray;padding:5px">12 <span style="background-color:black; color: white; padding:5px;">15 11</span> 7 19 5</span>
3.	Sliding the window forward one position reveals the next sub-list as 11 and 7, with 7 being the smallest of the two. <br/>	<span style="border:1px solid gray;padding:5px">12 15 <span style="background-color:black; color: white; padding:5px;">11 7</span> 19 5</span>
4.	Sliding the window forward one position yields the sub-list 7 and 19, with 7 being the smallest of the two.<br/>	<span style="border:1px solid gray;padding:5px">12 15 11 <span style="background-color:black; color: white; padding:5px;">7 19</span> 5</span>
5.	Sliding the window forward one position yields the sub-list 19 and 5, with 5 being the smallest of the two.<br/>		<span style="border:1px solid gray;padding:5px">12 15 11 7 <span style="background-color:black; color: white; padding:5px;">19 5</span></span>

### Implementation

Implement the solution in the `slidingWindowMin()` method in the Recitiation10 class.  The method should return an array with the sub-list minimum values as explained above.  The size of the array should be exactly equal to the number of sub-lists possible for the given window size.

For example,

```
Recitation8.slidingWindowMin(new int[] {14, 92, 3, -7, 18, -9, 47, -12}, 4)
```

should result in an array of length 5 contaning the following,

<p>
<span style="border:1px black solid;">
<span style="border-right:1px solid black;">-7</span> <span style="border-right:1px solid black;">-7</span> <span style="border-right:1px solid black;">-9</span> <span style="border-right:1px solid black;">-9</span> -12
</span>
</p>

Another example,

```
Recitation8.slidingWindowMin(new int[] {14, 92, 3, -7}, 4)
```

should result in an array of length 1 contaning the following,

<p>
<span style="border:1px black solid;">
-7
</span>
</p>

Finally, for a window size less than or equal to zero (0) or larger than the list size, `slidingWindowMin()` should return an array of length 0!

### Additional Information

+ You do not need to verify the correctness of the input.
+ You do not have to handle exceptions.