package fibonacci;

public class FibonacciImplementation {

	static int counter = 0;
	
	public static void main(String[] args) {

		int inputSize = 5;
		int result = fibonacci(inputSize);
//		System.out.println(result);
		
		System.out.println("For input size" 
		+	 inputSize +  ", Counter -> " + counter);
	}

	static int fibonacci(int n) {

		counter ++;
		
		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
