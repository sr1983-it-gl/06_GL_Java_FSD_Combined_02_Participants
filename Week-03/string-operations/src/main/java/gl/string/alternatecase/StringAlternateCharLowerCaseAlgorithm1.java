package gl.string.alternatecase;

public class StringAlternateCharLowerCaseAlgorithm1 {
	
	public String run(String input) {

		input = input.toUpperCase();
		System.out.println(input);
		
		char[] charArray = input.toCharArray();
		
		for(int index = 0; index < charArray.length; index = (index + 2) ){
						
			charArray[index] = Character.toLowerCase(charArray[index]);
		}
		
		String output = String.valueOf(charArray);
		System.out.println(output);
		return output;		
	}

	public static void main(String[] args) {
		
		new StringAlternateCharLowerCaseAlgorithm1().
			run("the weeekend plan");
	}
	
}
