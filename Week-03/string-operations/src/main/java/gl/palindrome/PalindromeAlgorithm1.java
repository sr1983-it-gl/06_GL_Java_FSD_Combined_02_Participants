package gl.palindrome;

public class PalindromeAlgorithm1 {

	public Boolean run(String str) {
		
		StringBuilder original = new StringBuilder(str);
		
		StringBuilder reverse = new StringBuilder(str);
		reverse.reverse();
		
		System.out.println(
			String.format("O %s, R %s", original, reverse));
		
		if (original.toString().equals(reverse.toString())) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		// level
		// radar
		boolean result 
			= new PalindromeAlgorithm1().run("hello");
		System.out.println(result);
		
	}
}
