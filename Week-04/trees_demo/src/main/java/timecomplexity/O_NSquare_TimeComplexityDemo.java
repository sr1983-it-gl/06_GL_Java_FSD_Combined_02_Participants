package timecomplexity;

public class O_NSquare_TimeComplexityDemo {

	public static void main(String[] args) {

		int[] testArray100Elements = generateArray(100);

		for (int index = 0; index < testArray100Elements.length; index++) {

			System.out.print(testArray100Elements[index] + " ");
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
