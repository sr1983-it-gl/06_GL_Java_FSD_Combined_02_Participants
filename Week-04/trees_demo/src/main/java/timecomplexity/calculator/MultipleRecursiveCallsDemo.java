package timecomplexity.calculator;

public class MultipleRecursiveCallsDemo {

	static int counter = 0;

	public static void main(String[] args) {

		int size = 5;
		recursive(size);
		System.out.println("Counter value is " + counter);

	}

	static int recursive(int aNumber) {

		counter++;

		if (aNumber <= 1) {
			return 1;
		}

		return recursive(aNumber - 1) + recursive(aNumber - 1);
	}
}
