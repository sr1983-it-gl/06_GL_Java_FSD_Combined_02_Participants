package timecomplexity.calculator;

public class FindMaxNumber {

	public static void main(String[] args) {

		int maxElement = findMax(new int[] { 10, -10, 45, -33, 120, 117, -90, 124 });

		System.out.println("Max Element is " + maxElement);
	}

	public static int findMax(int[] array) {

		int maxElement = array[0];

		for (int index = 1; index < array.length; index++) {

			int anElement = array[index];
			if (anElement > maxElement) {
				maxElement = anElement;
			}
		}

		return maxElement;
	}
}
