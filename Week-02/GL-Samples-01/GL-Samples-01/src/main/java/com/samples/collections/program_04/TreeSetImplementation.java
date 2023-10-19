package com.samples.collections.program_04;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImplementation {
	public static void main(String[] args) {
		// create a treeSet object
		TreeSet<String> treeSet = new TreeSet<>();
		// add elements to treeSet object
		treeSet.add("Core");
		treeSet.add("Java II ");
		treeSet.add("this");
		treeSet.add("is");
		treeSet.add("Great Learning");
		// print the treeSet
		System.out.println(treeSet);
		// use iterator to print the elements
		Iterator<String> it = treeSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		//print the first element
		System.out.println(treeSet.first());
		//print the last element
		System.out.println(treeSet.last());
		//retrieve and remove the last element
		System.out.println(treeSet.pollLast());
		//print the size of the treeSet
		System.out.println(treeSet.size());
	}
}