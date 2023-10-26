
package gl.string.word_counter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class StringWordOccurencesCounterAlgorithm1 {
	
	public Map<String, Integer> run(String sample) {
				
		sample = sample.toLowerCase();
		
		String[] splittedWords = sample.split(" ");
//		String[] splittedWords = sample.split("\\W");
		
		Map<String, Integer> map = new HashMap<>();
		
		for (String word : splittedWords) {
						
			boolean containsWord = map.containsKey(word);
			if (containsWord) {
				
				Integer existingCount = map.get(word);
				existingCount ++;
				map.put(word, existingCount);
			}else {
				map.put(word, 1);
			}
		}		
		
		printMap(map);	
		
		return map;
	}
	
	static void printMap(Map<String, Integer> map) {
		
		Iterator<String> iterator = map.keySet().iterator();
		
		while (iterator.hasNext()) {
			
			String key = iterator.next();
			Integer value = map.get(key);
			
			System.out.println(String.format("Key is '%s', and Value is '%d'", 
					key, value));
		}
	}
	
	public static void main(String[] args) {
		
		String input = "move the bottle from left to right. the position of the bottle is not left but right";
		
		new StringWordOccurencesCounterAlgorithm1().
			run(input);
	}
}
