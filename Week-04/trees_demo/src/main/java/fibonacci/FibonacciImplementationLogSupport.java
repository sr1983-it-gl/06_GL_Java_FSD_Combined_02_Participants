package fibonacci;

public class FibonacciImplementationLogSupport {

	static int indCounter = 0;
	static int groupCounter = 0;

	public static void main(String[] args) {

		int result = fibonacci("[BEGIN]", 4);

		System.out.println("---------------------------------");
		System.out.println(result);
	}

	static int fibonacci(String indicator, int n) {

		indCounter++;
		System.out.println("  ".repeat(indCounter) + "Stack Push - fib (" + n + ")");

//		System.out.print(" ".repeat(counter) + "fib(" + n + ")");
//		counter ++;

//		System.out.println(indicator);
		if (n == 0 || n == 1) {

			--indCounter;
			System.out.println("  ".repeat(indCounter) + "Stack Pop - fib( " + n + ")");
			return n;
		}

		return fibonacciGroupCall(indicator, n);
	}

	static int fibonacciGroupCall(String indicator, int n) {

		groupCounter++;
		System.out.println("  ".repeat(groupCounter) + "Group (" + (n - 1) + ", " + (n - 2) + ")");

		String temp1 = "[" + indCounter + "]";
		String temp2 = "[" + (indCounter + 1) + "]";

		return fibonacci(temp1, n - 1) + fibonacci(temp2, n - 2);

	}
}
