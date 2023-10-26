package gl.string.reverse_word;

public class StringReverseEachWordAlgorithm1 {
	
	public String run(String input) {
		
		StringBuilder reversedOutput = new StringBuilder();
		
		String[] allWords = input.split("\\s");
		
		for (int index = 0; index < allWords.length; index ++) {
			
			String word = allWords[index];
			
			StringBuilder sb = new StringBuilder(word);
			
			String reversedWord = sb.reverse().toString();
			
			reversedOutput.append(reversedWord);
			
			if (index != (allWords.length - 1)) {
				reversedOutput.append(" ");							
			}			
		}
		
		return reversedOutput.toString();
	}
	
	public static void main(String[] args) {
		
		String input = "Hello how are you";		
		String output = new StringReverseEachWordAlgorithm1().run(input);
		
		System.out.println(input);
		System.out.println(output);
		
	}
}
