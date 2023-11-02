
public class RecursiveMethodExecutionDemoStackUsage {

	public static void main(String[] args) {

		sampleRecursiveFunction(4);
	}

	static void sampleRecursiveFunction(int aNumber) {

		if (aNumber == 0) {

			System.out.println("Base condition reached...");
			System.out.println("Exit from recursive method");
		} else {

			System.out.println(aNumber);

			int nextInput = (aNumber - 1);
			sampleRecursiveFunction(nextInput);
			
			System.out.println("Done execution " + aNumber);
		}
	}
}
