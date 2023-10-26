package gl.mergesort;

public class GLv2MergeSort {

	private int[] array;
	
	public GLv2MergeSort(int[] array) {
		this.array = array;
	}
	
	public void mergeSort() {
			
		mergeSort(0, array.length - 1);
	}
	
	private void mergeSort(int startIndex, int endIndex) {
		
		if (startIndex < endIndex) {

			int midPointIndex = (startIndex + endIndex) / 2;
			
			mergeSort(startIndex, midPointIndex);		
			mergeSort((midPointIndex + 1), endIndex);		
			
			accumulate(startIndex, midPointIndex, endIndex);			
		}
	}
	
	private void accumulate(int startIndex,
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
