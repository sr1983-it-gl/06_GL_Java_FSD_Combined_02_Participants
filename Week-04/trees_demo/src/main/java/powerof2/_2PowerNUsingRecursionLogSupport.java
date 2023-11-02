package powerof2;

public class _2PowerNUsingRecursionLogSupport {

	static int counter = 1;

	public static void main(String[] args) {

		int result = _2PowerN(5);

		System.out.println("--------------------");
		System.out.println("Outcome is " + result);
	}

	// 2 (power) 4 => [2 * 2 * 2 * 2]
	static int _2PowerN(int number) {

		System.out.print(" ".repeat(counter));
		System.out.println(number);
		counter++;

		if (number == 0) {
			return 1;
		} else {
			int result = 2 * _2PowerN(number - 1);
			return result;
		}
	}
}
