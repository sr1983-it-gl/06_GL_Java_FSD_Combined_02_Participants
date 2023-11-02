package timecomplexity.calculator;

public class FindMaxNumberUsingRecursion {

	public static void main(String[] args) {

		int maxElement = findMax(new int[] { 10, -10, 45, 125, -33, 120, 117, -90, 124 });

		System.out.println("Max Element is " + maxElement);
	}

	public static int findMax(int[] array) {

		return findMax(array, array.length);
	}

	private static int findMax(int[] array, int length) {

		if (length == 1) {
			return array[0];
		}

		return Math.max(array[length - 1], findMax(array, length - 1));
	}
}
