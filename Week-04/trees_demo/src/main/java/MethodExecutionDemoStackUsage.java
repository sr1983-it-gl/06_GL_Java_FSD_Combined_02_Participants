
public class MethodExecutionDemoStackUsage {

	public static void main(String[] args) {

		firstMethod();
	}

	static void firstMethod() {

		System.out.println("In firstMethod() - 1st line");
		secondMethod();
		System.out.println("Last line - firstMethod");
	}

	static void secondMethod() {

		System.out.println("In secondMethod() - 1st line");
		thirdMethod();
		System.out.println("Last line - secondMethod()");		
	}

	static void thirdMethod() {

		System.out.println("In thirdMethod() - 1st line");
		System.out.println("In thirdMethod() - last line");
	}

}
