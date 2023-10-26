package com.gl.javafsd.datastructures.binarysearch;

public class BinarySearch {

	private int[] array;
	private int searchValue;
	
	public BinarySearch(int[] array) {
		this.array = array;
	}
	
	public int search(int searchValue) {
		
		int startIndex = 0;
		int endIndex = array.length - 1;

		return search(searchValue, startIndex, endIndex);		
	}
	
	public int search(int searchValue, int startIndex, int endIndex) {
		
		this.searchValue = searchValue;
		
		int result = startSearch(startIndex, endIndex);
		
		return result;
	}
	
	
	private int startSearch(int startIndex, int endIndex) {
				
		while (startIndex <= endIndex) {

			int middleElementIndex = (startIndex + endIndex) / 2;
			int middleElementValue = array[middleElementIndex];

			if (middleElementValue == searchValue) {
				return middleElementIndex;
			}else {
				
				if (searchValue > middleElementValue) {
					
					// Present on the right side
					startIndex = middleElementIndex + 1;
				}else if (searchValue < middleElementValue) {
					
					// Present on the left side
					endIndex = middleElementIndex - 1;
				}
			}
			
		}
		
		return -1;
		
	}	

	public static void main(String[] args) {
		
		int [] array = {1, 3, 10, 55, 99, 123, 167, 193};
		int target = 1011;
		
		BinarySearch search = new BinarySearch(array);
		int searchIndex = search.search(target);
	
		System.out.println(String.format("Element %d present at index %d", 
				target, searchIndex));
	}
}
