package gl.mergesort;

import gl.mergesort.GLMergeSort;
import gl.mergesort.recursive.Utils;

public class GLMergeSortTest {

	public static void main(String[] args) {
		
//		splitOddArrayTest();
//		splitEvenArrayTest();
//		recursiveSplitTest();
		
		mergeSort();
	}
	
	private static void splitOddArrayTest() {
		
		int [] array = Utils.generateRandomArray(5);
		Utils.print(array);
		
		
		GLMergeSort sort = new GLMergeSort(array);
//		int[][] splittedArrays = sort.split(array);
		
		
//		int[] leftArray = splittedArrays[0];
//		int[] rightArray = splittedArrays[1];
		
//		DataStructureUtils.print(leftArray);
//		DataStructureUtils.print(rightArray);
	}

	
	private static void splitEvenArrayTest() {
		
		int [] array = Utils.generateRandomArray(6);
		Utils.print(array);
		
		
		GLMergeSort sort = new GLMergeSort(array);
//		int[][] splittedArrays = sort.split(array);
		
//		
//		int[] leftArray = splittedArrays[0];
//		int[] rightArray = splittedArrays[1];
		
//		DataStructureUtils.print(leftArray);
//		DataStructureUtils.print(rightArray);
	}
	

	private static void recursiveSplitTest() {
		
		int [] array = Utils.generateRandomArray(6);
		Utils.print(array);
		
		
		GLMergeSort sort = new GLMergeSort(array);
//		sort.startSplit();		
	}

	private static void mergeSort() {
		
//		genericMergeSort(10);
//		genericMergeSort(11);
		genericMergeSort(0);
		
	}

	private static void genericMergeSort(int size) {
		
		System.out.println("-------------------------------------");
//		int [] array = DataStructureUtils.generateRandomArray(6);
		
		int[] array = {8, 2, 6, 4, 5, 3, 7, 1};
		System.out.println("Initial Array");
		Utils.print(array);		
		
		GLMergeSort sort = new GLMergeSort(array);
		sort.mergeSort();
		
		Utils.print(array);				
	}
	
}
