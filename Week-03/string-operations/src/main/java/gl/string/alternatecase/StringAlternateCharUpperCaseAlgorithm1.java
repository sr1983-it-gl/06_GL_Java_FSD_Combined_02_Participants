package gl.string.alternatecase;

public class StringAlternateCharUpperCaseAlgorithm1 {
	
	public String run(String input) {

		input = input.toLowerCase();
		System.out.println(input);
		
		char[] charArray = input.toCharArray();
		
		for(int index = 0; index < charArray.length; index = (index + 2)){
						
			charArray[index] = Character.toUpperCase(charArray[index]);
		}
		
		String outcome = String.valueOf(charArray);
		System.out.println(outcome);
		
		return outcome;		
	}

	public static void main(String[] args) {
		
		new StringAlternateCharUpperCaseAlgorithm1().
			run("the weeekend plan");
	}
}
