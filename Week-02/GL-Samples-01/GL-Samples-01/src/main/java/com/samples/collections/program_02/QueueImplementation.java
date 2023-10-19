package com.samples.collections.program_02;

import java.util.PriorityQueue;

public class QueueImplementation {
	public static void main(String[] args) {

		//create priorityQueue Object
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		//perform addition of elements to priorityQueue
		priorityQueue.add(10);
		priorityQueue.add(12);
		priorityQueue.add(1);
		priorityQueue.add(122);
		
		//print the top element of the priority queue
		System.out.println(priorityQueue);
		//check if the priority queue contains a particular element
		System.out.println(priorityQueue.contains(10));
		//print the size of the queue
		System.out.println(priorityQueue.size());
		//print the head of the queue
		System.out.println(priorityQueue.peek());
		//delete an element of the queue
		priorityQueue.remove(10);
		//print the queue elements
		System.out.println(priorityQueue);
		//remove all the elements of the queue at once
		priorityQueue.clear();
		//check if the queue is empty or not

		System.out.println(priorityQueue.isEmpty());
	}
}
