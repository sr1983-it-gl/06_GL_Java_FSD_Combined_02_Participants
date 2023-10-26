package graphory.mergesort.recursive;

import gl.mergesort.recursive.DividePhase;
import gl.mergesort.recursive.Utils;

public class DividePhaseTest {

	public static void main(String[] args) {
	
//		divideEvenSizedArrayTest();
		divideOddSizedArrayTest();
		
	}
	
	private static void divideEvenSizedArrayTest() {

		divideGenericSizedArrayTest(8);					
	}

	private static void divideOddSizedArrayTest() {
		
		divideGenericSizedArrayTest(9);		
	}
	
	private static void divideGenericSizedArrayTest(int size) {
		
		int array[] = 
		Utils.generateRandomArray(size);
		
		Utils.print(array);
		
		DividePhase dividePhase = new DividePhase(array);
		dividePhase.divide();
		
		Utils.print(array);
	}
	
}
