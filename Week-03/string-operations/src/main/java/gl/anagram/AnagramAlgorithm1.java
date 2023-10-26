package gl.anagram;

import java.util.Arrays;


public class AnagramAlgorithm1  {
	
	public Boolean run(String[] input) {
		
		String str1 = input[0];		
		String str2 = input[1];
		
		
		String s1 = str1.toUpperCase();		
		String s2 = str2.toUpperCase();
		
		
		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");
		
		if (s1.length() != s2.length()) {
			return false;
		}
		
		// 'a', 'z', 'i'
		// 'a', 'i', 'z'
		char ch1Array[] = s1.toCharArray();
		char ch2Array[] = s2.toCharArray();
				
		Arrays.sort(ch1Array);
		Arrays.sort(ch2Array);
		
		System.out.println(String.valueOf(ch1Array) + "," + String.valueOf(ch2Array));
		boolean outcome = Arrays.equals(ch1Array, ch2Array);
		if (outcome) {
			System.out.println("Array -> Equal");
		}else {
			System.out.println("Array -> Not Equal");
		}
		return outcome;
	}

	
	public static void main(String[] args) {
		
//		String[] input = {"triangle", "integral"};
		String[] input = {"hey", "hai"};
		
		Boolean outcome 
			= new AnagramAlgorithm1().run(input);

		System.out.println(outcome);
	}

}
