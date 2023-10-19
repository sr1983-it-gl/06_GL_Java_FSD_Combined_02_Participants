package com.samples.collections.program_06;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListImplementation {
	public static void main(String[] args) {
		//create a linked list
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		//create a scanner object
		Scanner sc = new Scanner (System.in);
		//code to check whether the input is an integer or not
		//simultaneously add the no in the linked list
		while(sc.hasNextInt()) {
			linkedList.add(sc.nextInt());
		}
		//close scanner
		sc.close();
		//sort linkedList in ascending order
		Collections.sort(linkedList);
		//print the linked list
		System.out.println(linkedList);
		//sort linked list in descending order
		Collections.sort(linkedList,Collections.reverseOrder());
		//print the linkedlist
		System.out.println(linkedList);
	}
}
