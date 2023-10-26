package gl.string.comparison;


public class StringCompareCaseIgnoreAlgorithm1 {
	
	public Boolean run(String[] input) {
		
		String str1 = input[0];
		String str2 = input[1];
		
		return str1.equalsIgnoreCase(str2);	
	}	
	
	
	public static void main(String[] args) {
		
//		String[] input = {"test", "TEST"};
//		String[] input = {"good Morning", "GOOD MORNing"};
		String[] input = {"test", "TEST1"};
		
		Boolean outcome = new StringCompareCaseIgnoreAlgorithm1()
			.run(input);
		System.out.println(outcome);
	}
}
