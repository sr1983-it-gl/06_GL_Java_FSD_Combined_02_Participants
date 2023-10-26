package gl.mergesort.recursive;


import gl.mergesort.merger.IndexBasedArrayMerger;

public class ConquerPhase {

	private int[] array;
	
	public ConquerPhase(int[] array) {
		
		this.array = array;
	}
	
	public void conquer(int start, int middle, int end) {
		
		String temp = String.format("Conquering [Merging] aArray [%d, %d] and bArray [%d %d]", 
			start, (middle), (middle + 1), end);
		System.out.println(temp);
		
		IndexBasedArrayMerger merger = new IndexBasedArrayMerger(array);
		merger.merge(start, middle, end);
		
		
		System.out.println("After merging...");
		Utils.print(array);
	}
}
