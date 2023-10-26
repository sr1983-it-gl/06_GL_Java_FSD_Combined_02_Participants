package graphory.mergesort.nonrecursive;

import gl.mergesort.nonrecursive.MergeSortNonRecursiveImplV2;

public class MergeSortNonRecursiveImplV2Test {

	public static void main(String[] args) {
		
//		evenSizedArrayTest();
		oddSizedArrayTest();
	}
	
	private static void evenSizedArrayTest() {

		int[] array = {8, 2, 6, 4, 5, 3, 7, 1};
		int n = array.length;

		MergeSortNonRecursiveImplV2.printArray(array, n);		
		MergeSortNonRecursiveImplV2.mergeSort(array, n);
		MergeSortNonRecursiveImplV2.printArray(array, n);		
	}
	
	private static void oddSizedArrayTest() {
		
		int[] array = {158, 401, 815, 12, 436, 972, 951};
		int n = array.length;
		
		MergeSortNonRecursiveImplV2.printArray(array, n);		
		MergeSortNonRecursiveImplV2.mergeSort(array, n);	
		MergeSortNonRecursiveImplV2.printArray(array, n);
	}
}
