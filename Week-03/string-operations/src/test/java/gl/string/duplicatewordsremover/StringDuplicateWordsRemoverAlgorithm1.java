package gl.string.duplicatewordsremover;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class StringDuplicateWordsRemoverAlgorithm1 {
	
	public String run(String input) {

		System.out.println(input);

        String[] strWords = input.split("\\s+");

        List<String> arrayList = Arrays.asList(strWords);
        
        LinkedHashSet<String> lhs = new LinkedHashSet(arrayList);
        
        StringBuilder result = new StringBuilder();
        
        Iterator<String> iterator = lhs.iterator();
        
        int index = 0;
        while (iterator.hasNext()) {
        	
        	String str = iterator.next();
        	
        	result.append(str);
        	
        	if (index != (lhs.size() - 1)) {
        		result.append(" ");
        	}        	
        	index ++;
        }
        
		return result.toString();
	}

	
	public static void main(String[] args) {
		
		StringDuplicateWordsRemoverAlgorithm1 algorithm1 = 
				new StringDuplicateWordsRemoverAlgorithm1();
		
		String hobbies = "my hobbies are are playing playing cricket watching movies movies listing to music";
		
		String result = algorithm1.run(hobbies);
		
		System.out.println(result);		
		
	}
	
}
