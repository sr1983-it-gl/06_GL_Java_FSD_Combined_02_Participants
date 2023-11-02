package timecomplexity;

public class O_1_TimeComplexityDemo {

	public static void main(String[] args) {

		int[] testArray100Elements = generateArray(100);

		for (int index = 0; index < testArray100Elements.length; index++) {

			System.out.print(testArray100Elements[index] + " ");
		}

		System.out.println();
		int locationIndex = 81;
		int anElement = testArray100Elements[locationIndex];
		System.out.printf("Element at position %d is %d", locationIndex, anElement);
	}

	static int[] generateArray(int size) {

		int[] testArray = new int[size];

		for (int index = 0; index < size; index++) {
			testArray[index] = (int) (Math.random() * 1000);
		}

		return testArray;
	}
}
