package gl;

public class StringEquals {

	public static boolean equals(String str1, String str2) {
		
		if (str1.length() != str2.length()) {
			return false;
		}
		
		for (int index = 0; index < str1.length(); index ++) {
			
			char char1 = str1.charAt(index);
			char char2 = str2.charAt(index);
			
			if (char1 != char2) {
				return false;
			}			
;		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		boolean result = StringEquals.equals("weekend", "weekends");

//		boolean result = StringEquals.equals("weekend", "weekend");
	
		System.out.println(result);
	}
}
