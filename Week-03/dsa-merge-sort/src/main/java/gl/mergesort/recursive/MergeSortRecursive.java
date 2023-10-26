package gl.mergesort.recursive;

public class MergeSortRecursive {

	private int[] array;
	
	public MergeSortRecursive(int[] array) {
		this.array = array;
	}
	
	public void mergeSort() {
			
		divideByIndex(0, array.length - 1);
	}
	
	private void divideByIndex(int startIndex, int endIndex) {
		
		if (startIndex < endIndex) {

			int midPointIndex = (startIndex + endIndex) / 2;
			
			divideByIndex(startIndex, midPointIndex);		
			divideByIndex((midPointIndex + 1), endIndex);		
			
			swapElements(startIndex, midPointIndex, endIndex);			
		}
	}
	
	private void swapElements(int startIndex,
			int midPointIndex, int endIndex) {
			
		// {10, 7, 8} Left Array
		// {3, 2} Right Array
		
		int tempArray[] = new int [endIndex - startIndex + 1];
		
		int leftArrayIndex = startIndex;
		int rightArrayIndex = midPointIndex + 1;
		
		int tempArrayIndex = 0;
		
		while (leftArrayIndex <= midPointIndex &&
			rightArrayIndex <= endIndex) {
			
			int leftValue = array[leftArrayIndex];
			int rightValue = array[rightArrayIndex];
			
			if (leftValue <= rightValue) {
				
				tempArray[tempArrayIndex] = leftValue;
				tempArrayIndex ++;
				leftArrayIndex ++;
				
			}else if (leftValue > rightValue) {
				
				tempArray[tempArrayIndex] = rightValue;
				tempArrayIndex ++;
				rightArrayIndex ++;
			}
		}
		
		//
		while (leftArrayIndex <= midPointIndex) {
			
			tempArray[tempArrayIndex] = array[leftArrayIndex];
			tempArrayIndex ++ ;
			leftArrayIndex ++;
		}
		
		while (rightArrayIndex <= endIndex) {
			
			tempArray[tempArrayIndex] =array[rightArrayIndex];
			tempArrayIndex ++;
			rightArrayIndex ++;
		}
		
		// 
		for (leftArrayIndex = startIndex; leftArrayIndex <= endIndex;
			leftArrayIndex ++) {
			
			int tempArrayIndex2 = leftArrayIndex - startIndex;
			array[leftArrayIndex] = tempArray[tempArrayIndex2];
		}
	}	
}
