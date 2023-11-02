package timecomplexity;

public class O_LogN_TimeComplexityDemo {

	public static void main(String[] args) {

		int size = 10;
		int[] testArray10Elements = generateArray(size);
		int noOfIterations = iterateElements(testArray10Elements);
		System.out.printf("For the array size %d, " + "the number of iterations performed %d \r\n", size,
				noOfIterations);
		;

		size = 100;
		int[] testArray100Elements = generateArray(size);
		noOfIterations = iterateElements(testArray100Elements);
		System.out.printf("For the array size %d, " + "the number of iterations performed %d \r\n", size,
				noOfIterations);
		;

		size = 1000;
		int[] testArray1000Elements = generateArray(size);
		noOfIterations = iterateElements(testArray1000Elements);
		System.out.printf("For the array size %d, " + "the number of iterations performed %d \r\n", size,
				noOfIterations);
		;

		size = 10000;
		int[] testArray10000Elements = generateArray(size);
		noOfIterations = iterateElements(testArray10000Elements);
		System.out.printf("For the array size %d, " + "the number of iterations performed %d \r\n", size,
				noOfIterations);
		;

	}

	static int[] generateArray(int size) {

		int[] testArray = new int[size];

		for (int index = 0; index < size; index++) {
			testArray[index] = (int) (Math.random() * 1000);
		}

		return testArray;
	}

	static int iterateElements(int[] testArray) {

		int incrementBy = 4;
		int noOfIterations = 0;

		for (int index = 0; index < testArray.length; index += incrementBy) {

//			System.out.print(testArray[index] + " ");
			noOfIterations++;
		}

		return noOfIterations;
	}
}
