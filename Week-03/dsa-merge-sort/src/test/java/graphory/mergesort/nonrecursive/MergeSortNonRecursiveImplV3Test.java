package graphory.mergesort.nonrecursive;

import gl.mergesort.nonrecursive.MergeSortNonRecursiveImplV3;

public class MergeSortNonRecursiveImplV3Test {

	public static void main(String[] args) {

//		evenSizedArrayTest();
		oddSizedArrayTest();
	}
	
	private static void evenSizedArrayTest() {
		
		int[] array = {8, 2, 6, 4, 5, 3, 7, 1};

		MergeSortNonRecursiveImplV3 impl = new MergeSortNonRecursiveImplV3(array);

		impl.print();
		
//		impl.step1();
//		impl.step2();
//		impl.step3();
//		impl.step4();
		impl.step5();
		
		impl.print();
	}

	
	private static void oddSizedArrayTest() {
		
		int[] array = {158, 401, 815, 12, 436, 972, 951};

		MergeSortNonRecursiveImplV3 impl = new MergeSortNonRecursiveImplV3(array);

		impl.print();
		
//		impl.step1();
//		impl.step2();
//		impl.step3();
//		impl.step4();
		impl.step5();
		
		impl.print();
	}
	
}
