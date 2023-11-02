package spacecomplexity;

public class O_1_SpaceComplexityExample2 {

	public static void main(String[] args) {

		int result = tripleSequence(10);
		System.out.println("Result is " + result);

	}

	static int tripleSequence(int aNumber) {

		int sum = 0;

		for (int index = 0; index < aNumber; index++) {

			sum = sum + triple(index, (index + 1), (index + 2));
		}
		return sum;
	}

	static int triple(int a, int b, int c) {

		return (a + b + c);
	}
}
