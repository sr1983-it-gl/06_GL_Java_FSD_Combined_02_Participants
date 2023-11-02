package factorial;

public class FactorialImplementation {

	public static void main(String[] args) {

		int result = factorial(4);
		System.out.println("result is " + result);
	}

	static int factorial(int n) {

		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
