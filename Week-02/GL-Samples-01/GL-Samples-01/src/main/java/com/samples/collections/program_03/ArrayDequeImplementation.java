package com.samples.collections.program_03;

import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDequeImplementation {
	public static void main(String[] args) {
		// Create deque object using ArrayDeque Class
		Deque<Integer> deque = new ArrayDeque<Integer>();
		// add elements to the deque
		deque.add(10);
		deque.add(20);
		deque.add(30);
		deque.add(40);
		deque.add(50);
		// insert an element at the head
		deque.addFirst(51);
		// insert an element at the tail
		deque.addLast(242);
		// print the deque
		System.out.println(deque);
		//peek the first element
		System.out.println(deque.peekFirst());
		//delete all the elements of deque
		deque.clear();
	}
}

