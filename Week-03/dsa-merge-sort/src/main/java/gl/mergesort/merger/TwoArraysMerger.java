package gl.mergesort.merger;

public class TwoArraysMerger {

	private int aArray[];
	private int bArray[];
	
	private int cArray[];
	
	public TwoArraysMerger(int aArray[], int bArray[]) {
		
		this.aArray = aArray;
		this.bArray = bArray;
		
		this.cArray = new int[this.aArray.length + this.bArray.length];
		
	}
	
	public int[] merge() {
		
		
		int aIndex = 0;
		int bIndex = 0;
		
		int cIndex = 0;
		
		while (aIndex < aArray.length && bIndex < bArray.length) {
			
			if (aArray[aIndex] < bArray[bIndex]) {
				
				cArray[cIndex] = aArray[aIndex];
				aIndex ++;
				cIndex ++;
			}else {

				cArray[cIndex] = bArray[bIndex];
				bIndex ++;
				cIndex ++;				
			}			
		}
		
		for (; aIndex < aArray.length; aIndex ++) {
			cArray[cIndex] = aArray[aIndex];
			cIndex ++;
		}

		for (; bIndex < bArray.length; bIndex ++) {
			cArray[cIndex] = bArray[bIndex];
			cIndex ++;
		}
		
		return cArray;
	}
}
