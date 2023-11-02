package spacecomplexity;

public class O_N_SpaceComplexity {

	public static void main(String[] args) {

		int result = calculate(100);

		System.out.println("Result is " + result);
	}

	static int calculate(int aNumber) {

		if (aNumber <= 0) {
			return 0;
		}

		return aNumber + calculate(aNumber - 1);
	}
}
