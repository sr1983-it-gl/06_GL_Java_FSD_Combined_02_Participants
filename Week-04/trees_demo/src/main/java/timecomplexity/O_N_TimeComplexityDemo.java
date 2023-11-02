package timecomplexity;

public class O_N_TimeComplexityDemo {

	public static void main(String[] args) {

		int[] testArray = generateArray(100);

		for (int iIndex = 0; iIndex < testArray.length; iIndex++) {

			for (int jIndex = 0; jIndex < testArray.length; jIndex++) {
				System.out.print(testArray[iIndex] + " ");
			}
		}
	}

	static int[] generateArray(int size) {

		int[] testArray = new int[size];

		for (int index = 0; index < size; index++) {
			testArray[index] = (int) (Math.random() * 1000);
		}

		return testArray;
	}
}
