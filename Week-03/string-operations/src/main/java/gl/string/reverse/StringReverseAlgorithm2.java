package gl.string.reverse;

public class StringReverseAlgorithm2 {

	public String run(String str) {
		
		char reversedStr[] = new char[str.length()];
		
		int index = 0;
		for (int backwardIndex = str.length() - 1; backwardIndex >=0; backwardIndex --) {
			
			reversedStr[index] = str.charAt(backwardIndex);
			index ++;
		}
		
		return String.valueOf(reversedStr);		
	}
	
	public static void main(String[] args) {
		
		String input = "Java Course";		
		String output = new StringReverseAlgorithm2().run(input);
		
		System.out.println(input);
		System.out.println(output);
	}
}
