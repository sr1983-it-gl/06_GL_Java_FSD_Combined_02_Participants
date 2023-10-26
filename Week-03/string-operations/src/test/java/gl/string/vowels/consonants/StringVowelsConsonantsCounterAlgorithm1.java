package gl.string.vowels.consonants;


public class StringVowelsConsonantsCounterAlgorithm1 {

	static final String VOWELS = "aeiou";
	
	public Result run(String input) {
		
		System.out.println(input);
		
		Result output = new Result();		
		input = input.toLowerCase();
		
		char charArray[] = input.toCharArray();
		
		for (char aChar : charArray) {
			
			if (isAlphabet(aChar)) {
				
				if (isVowel(aChar)) {
					
					output.setNoOfVowels(output.getNoOfVowels() + 1);					
				}else {
					
					output.setNoOfConsonants(
						output.getNoOfConsonants() + 1);
				}
			}
						
		}		
		return output;
	}
	
	private boolean isAlphabet(char aChar) {
		
		int intChar = (int)aChar;
		
		return ( (intChar >=65 && intChar <= 90) || 
				(intChar >=97 && intChar <=122));
	}
	

	private boolean isVowel(char aChar) {
		
		return (aChar == 'a' ||  aChar == 'e' || aChar == 'i' || aChar == 'o' || aChar == 'u');
	}

	private static boolean isVowel2(char aChar) {
		
		if (VOWELS.indexOf(aChar) != -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		
		StringVowelsConsonantsCounterAlgorithm1 algorithm1
			= new StringVowelsConsonantsCounterAlgorithm1();
	
		String input = "*** GOOD morning world ###";
		
		Result result = algorithm1.run(input);
		
		System.out.println(result);
	}
	
}
