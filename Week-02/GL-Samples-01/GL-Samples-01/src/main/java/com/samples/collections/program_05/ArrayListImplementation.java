package com.samples.collections.program_05;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListImplementation {
	public static void main(String[] args) {
		//Define the arrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//add elements in the arrayList
		arrayList.add(2);
		arrayList.add(78);
		arrayList.add(101);
		arrayList.add(2);
		arrayList.add(-1);
		// print the size of the list
		System.out.println(arrayList.size());
		// print the minimum value present of the list
		System.out.println(Collections.min(arrayList));
		//checking whether arrayList is empty or not
		System.out.println(arrayList.isEmpty());
		//print the index of element 101
		System.out.println(arrayList.indexOf(101));
		// remove the value 78, by passing the value 78 and not index
		arrayList.remove(new Integer(78));
		//remove the value 2, by passing index of 2
		arrayList.remove(0);
		//display the arrayList using forEach loop
		for (int al : arrayList) {
			System.out.println(al);
		}
	}
}
