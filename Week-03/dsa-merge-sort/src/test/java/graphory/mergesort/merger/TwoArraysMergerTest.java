package graphory.mergesort.merger;

import gl.mergesort.merger.TwoArraysMerger;
import gl.mergesort.recursive.Utils;

public class TwoArraysMergerTest {

	public static void main(String[] args) {
		
//		mergeEvenSizedArrays();
//		mergeArray1BigArray2Small();
		mergeArray1SmallArray2Big();
	}
	
	private static void mergeEvenSizedArrays(){
		
		/*
			{ 3, 4, 8 }
			{ 6, 15, 23 }
			{ 3, 4, 6, 8, 15, 0 }
		 */
//		int aArray[] = 
//			DataStructureUtils.generateRandomSortedArray(3);
		
		int aArray[] = {3, 4, 8};
		Utils.print(aArray);
		
//		int bArray[] = 
//			DataStructureUtils.generateRandomSortedArray(3);
		int bArray[] = {6, 15, 23};
		Utils.print(bArray);
	
	
		TwoArraysMerger merging = new TwoArraysMerger(aArray, bArray);
		int []cArray = merging.merge();
		
		Utils.print(cArray);
	}


	private static void mergeArray1BigArray2Small() {
		
//		int aArray[] = 
//			DataStructureUtils.generateRandomSortedArray(4);
		int aArray[] = {5, 10, 15, 19};
		Utils.print(aArray);
		
//		int bArray[] = 
//			DataStructureUtils.generateRandomSortedArray(2);
		
		int bArray[] = {3, 9};
		Utils.print(bArray);
	
	
		TwoArraysMerger merging = new TwoArraysMerger(aArray, bArray);
		int []cArray = merging.merge();
		
		Utils.print(cArray);
	}

	private static void mergeArray1SmallArray2Big() {
		
//		int aArray[] = 
//			DataStructureUtils.generateRandomSortedArray(4);
		int aArray[] = {2, 8};
		Utils.print(aArray);
		
//		int bArray[] = 
//			DataStructureUtils.generateRandomSortedArray(2);
		
		int bArray[] = {4, 9, 14, 18};
		Utils.print(bArray);
	
	
		TwoArraysMerger merging = new TwoArraysMerger(aArray, bArray);
		int []cArray = merging.merge();
		
		Utils.print(cArray);
	}
	
}
