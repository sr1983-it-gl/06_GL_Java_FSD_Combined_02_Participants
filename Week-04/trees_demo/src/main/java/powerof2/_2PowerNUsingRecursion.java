package powerof2;

public class _2PowerNUsingRecursion {

	public static void main(String[] args) {

		int result = _2PowerN(5);
		System.out.println(result);
	}

	// 2 (power) 4 => [2 * 2 * 2 * 2]
	static int _2PowerN(int number) {

		if (number == 0) {
			return 1;
		} else {
			int result = 2 * _2PowerN(number - 1);
			return result;
		}
	}
}
