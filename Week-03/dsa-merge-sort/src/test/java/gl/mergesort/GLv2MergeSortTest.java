package gl.mergesort;

import gl.mergesort.GLv2MergeSort;
import gl.mergesort.recursive.Utils;

public class GLv2MergeSortTest {

	public static void main(String[] args) {
		
		genericMergeSort();
	}
	
	private static void genericMergeSort() {
		
		System.out.println("-------------------------------------");
//		int [] array = DataStructureUtils.generateRandomArray(6);
		
		int[] array = {8, 2, 6, 4, 5, 3, 7, 1};
		System.out.println("Initial Array");
		Utils.print(array);		
		
		GLv2MergeSort sort = new GLv2MergeSort(array);
		sort.mergeSort();
		
		Utils.print(array);				
	}
	
}
