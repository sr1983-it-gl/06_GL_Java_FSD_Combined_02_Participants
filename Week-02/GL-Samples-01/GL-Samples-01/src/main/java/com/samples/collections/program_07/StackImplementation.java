package com.samples.collections.program_07;

import java.util.*;
import java.util.Stack;
public class StackImplementation {
	public static void main(String args[])
	{
		// Create an object of Stack
		Stack<String> stack = new Stack<String>();
		// add elements into the Stack
		stack.add("Welcome");
		stack.add("To");
		stack.add("Great");
		stack.add("Learning");
		// Display the Stack
		System.out.println("Stack: " + stack);
		// Create an iterator
		Iterator value = stack.iterator();
		// Display the values using the iterator
		System.out.println("The iterator values are: ");
		while (value.hasNext()) {
			System.out.println(value.next());
		}
	}
}