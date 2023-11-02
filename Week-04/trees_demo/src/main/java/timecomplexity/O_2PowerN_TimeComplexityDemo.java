package timecomplexity;

public class O_2PowerN_TimeComplexityDemo {

	static int counter = 0;

	public static void main(String[] args) {

		// 3 -> 5
		// 5 -> 15
		// 10 -> 175 +
		int result = fibonacci("[BEGIN]", 10);

		System.out.println("---------------------------------");
		System.out.println(result);

		System.out.println("Counter value " + counter);
	}

	static int fibonacci(String indicator, int n) {

		counter++;
		
		if (n == 0 || n == 1) {
			return n;
		}

		String temp1 = "[" + counter + "]";
		String temp2 = "[" + (counter + 1) + "]";

		return fibonacci(temp1, n - 1) + fibonacci(temp2, n - 2);

	}

}
