package gl.mergesort.recursive;


public class Utils {

	public static int[] generateRandomArray(int size) {
		
		int resultArray[] = new int[size];
				
		for (int index = 0; index < size; index ++) {
						
			int random1 = (int)(Math.random() * 10) + 1;
			int random2 = (int)(Math.random() * 10) + 1;
						
			resultArray[index] = (random1 * random2) + (index + 3);			
		}
		
		return resultArray;
	}
	
	public static void print(int[] array) {
		
		System.out.print("{ ");
		for (int index = 0; index < array.length; index ++) {	

			System.out.print(array[index]);
			
			if (index != (array.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
	}
	
	
	public void startSplit(int[] array) {
		
		int[] localArray = array;
		
		while (true) {
			
			if (localArray.length == 1) {
				break;
			}
			
			int[][]	splittedArray = split(localArray);

			int []leftArray = splittedArray[0];
			Utils.print(leftArray);
			
			localArray = leftArray;
		}
	}
	
	 	
	public int[][] split(int[] localArray){
		
		
		int middleIndex = 0;
		
		if (localArray.length %2 == 0) {
			middleIndex = (localArray.length / 2) - 1;
		}else {
			middleIndex = localArray.length / 2;			
		}
		
		
		int[] leftArray = sliceArray(null, 0, middleIndex);
		int[] rightArray = sliceArray(null, middleIndex + 1, localArray.length - 1);
		
		int[][] result = new int[2][];
		result[0] = leftArray;
		result[1] = rightArray;
		
		return result;		
	}
	
	public int[] sliceArray(int[] array, int start, int length) {
		
		int resultArray[] = new int[length];
		
		for (int index = 0; index < length; index ++) {
			
			resultArray[index] = array[(start + index)];		
		}
		
		return resultArray;
	}
	
}
