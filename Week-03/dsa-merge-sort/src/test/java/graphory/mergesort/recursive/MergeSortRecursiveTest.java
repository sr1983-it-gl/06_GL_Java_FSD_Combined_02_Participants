package graphory.mergesort.recursive;

import gl.mergesort.recursive.MergeSortRecursive;
import gl.mergesort.recursive.Utils;

public class MergeSortRecursiveTest {

	public static void main(String[] args) {
		
		evenSizedArrayTest();
		oddSizedArrayTest();
	}
	
	private static void evenSizedArrayTest() {
		
		int[] array = {8, 2, 6, 4, 5, 3, 7, 1};

		Utils.print(array);
		MergeSortRecursive sort = new MergeSortRecursive(array);
		sort.mergeSort();		
		Utils.print(array);
	}

	
	private static void oddSizedArrayTest() {
		
		int[] array = {158, 401, 815, 12, 436, 972, 951};

		Utils.print(array);
		MergeSortRecursive sort = new MergeSortRecursive(array);
		sort.mergeSort();		
		Utils.print(array);		
	}	
}
