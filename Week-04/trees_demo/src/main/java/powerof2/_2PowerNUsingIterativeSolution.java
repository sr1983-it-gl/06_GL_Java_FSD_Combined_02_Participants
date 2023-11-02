package powerof2;

public class _2PowerNUsingIterativeSolution {

	public static void main(String[] args) {

		int result = _2PowerN(6);
		System.out.println(result);
	}

	// 2 (power) 4 => [2 * 2 * 2 * 2]
	static int _2PowerN(int number) {

		int result = 1;
		for (int index = 1; index <= number; index++) {

			result = result * 2;
		}
		return result;
	}
}
