package gl.mergesort.nonrecursive;

import gl.mergesort.merger.IndexBasedArrayMerger;

public class MergeSortNonRecursiveImplV3 {

	int[] array;
	
	public MergeSortNonRecursiveImplV3(int[] array) {
		this.array = array;
	}
		
	public void step1() {
		
		int size = array.length;
				
		// 1st Batch = Count of Elements - 2
		// 2 Elements = 2 * 1 [2]
		int countOfElements = 2;
		for (int leftIndex = 0; leftIndex < size; 
				leftIndex = (leftIndex + countOfElements)) {
			
			int rightIndex = (leftIndex + countOfElements) - 1;
			if (rightIndex >= size) {
				rightIndex = size - 1;
			}
			
			System.out.println(leftIndex + ", " + rightIndex);
		}

		// 2nnd Batch - Count of Elements - 4
		// 4 Elements = 2 * 2 [4]
		System.out.println();
		countOfElements = 4;
		for (int leftIndex = 0; leftIndex < size; 
				leftIndex = leftIndex + countOfElements) {
			
			int rightIndex = (leftIndex + countOfElements) - 1;
			if (rightIndex >= size) {
				rightIndex = size - 1;
			}
			
			System.out.println(leftIndex + ", " + rightIndex);
		}

		// 8 Elements  = [4] * 2 = [8]
		System.out.println();
		countOfElements = 8;
		for (int leftIndex = 0; leftIndex < size; 
				leftIndex = leftIndex + countOfElements) {
			
			int rightIndex = (leftIndex + countOfElements) - 1;
			if (rightIndex >= size) {
				rightIndex = size - 1;
			}
			
			System.out.println(leftIndex + ", " + rightIndex);
		}
		
	}

	
	// Find out the number of batches
	public void step2() {
		
		int size = array.length;
		
		int countOfElements = 1;
		
		for (int batchIndex = 0; batchIndex < 3; batchIndex ++ ) {

			countOfElements = countOfElements * 2;
			System.out.println("Count of Elements ->" + countOfElements);
			
			for (int leftIndex = 0; leftIndex < size; 
					leftIndex = (leftIndex + countOfElements)) {
				
				int rightIndex = (leftIndex + countOfElements) - 1;
				if (rightIndex >= size) {
					rightIndex = size - 1;
				}
				
				System.out.println(leftIndex + ", " + rightIndex);
			}			
		}				
	}
	
	public void step3() {
		
		int size = array.length;
		
		int countOfElements = 1;
		
		for (int batchIndex = 0; batchIndex < size; 
				batchIndex = (batchIndex + 1) * 2) {

			countOfElements = countOfElements * 2;
			System.out.println("Count of Elements ->" + countOfElements);
			
			for (int leftIndex = 0; leftIndex < size; 
					leftIndex = (leftIndex + countOfElements)) {
				
				int rightIndex = (leftIndex + countOfElements) - 1;
				if (rightIndex >= size) {
					rightIndex = size - 1;
				}
				
				System.out.println(leftIndex + ", " + rightIndex);
			}			
		}				
	}
	

	public void step4() {
		
		int size = array.length;
		
		int countOfElements = 1;
		
		for (int batchIndex = 0; batchIndex < size; 
				batchIndex = (batchIndex + 1) * 2) {

			countOfElements = countOfElements * 2;
			System.out.println("Count of Elements ->" + countOfElements);
			
			for (int leftIndex = 0; leftIndex < size; 
					leftIndex = (leftIndex + countOfElements)) {
				
				int rightIndex = (leftIndex + countOfElements) - 1;
				if (rightIndex >= size) {
					rightIndex = size - 1;
				}
				
				int midPointIndex = (leftIndex + rightIndex) / 2;
				System.out.println(leftIndex + ", " + rightIndex + ", " + midPointIndex);
			}			
		}				
	}

	public void step5() {
		
		int size = array.length;
		
		int countOfElements = 1;
		
		for (int batchIndex = 0; batchIndex < size; 
				batchIndex = (batchIndex + 1) * 2) {

			System.out.println();
			countOfElements = countOfElements * 2;
			System.out.println("Count of Elements ->" + countOfElements);
			
			for (int leftIndex = 0; leftIndex < (size -1); 
					leftIndex = (leftIndex + countOfElements)) {
								
				int rightIndex = (leftIndex + countOfElements) - 1;
				if (rightIndex >= size) {
					rightIndex = size - 1;
				}
				
				int midPointIndex = (leftIndex + rightIndex) / 2;
				System.out.println(leftIndex + ", " + rightIndex + ", " + midPointIndex);
				
				IndexBasedArrayMerger merger = new IndexBasedArrayMerger(array);
				merger.merge(leftIndex, midPointIndex, rightIndex);				
			}			
		}				
	}
	
    public void print() {
    	
        for (int index=0; index < array.length; index++)
            System.out.printf("%d ", array[index]);
        System.out.printf("\n");
    }     
	
}
