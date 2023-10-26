package gl.string.secondmostfrequentchar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class StringSecondMostFrequentCharFinderAlgorithm1 {

	private Map<Character, Integer> map = new HashMap();
	
	public Character run(String input) {
				
		for (Character aChar : input.toCharArray()) {
			
			addOrIncrementCount(aChar);
		}
		
		
		Set<Map.Entry<Character, Integer>> entrySet 
			= map.entrySet();

		List<Map.Entry<Character, Integer>> entriesAsList = new ArrayList<>();		
		entriesAsList.addAll(entrySet);		
	
		print(entriesAsList);
	
		Collections.sort(entriesAsList, new MapEntryComparator());
		print(entriesAsList);

		Map.Entry<Character, Integer> mostFrequentOccuringEntry 
			= entriesAsList.get(0);
		Map.Entry<Character, Integer> secondMostFrequentOccuringEntry = null;

		if (entriesAsList.size() >= 2) {
			
			secondMostFrequentOccuringEntry = entriesAsList.get(1);
			
		}else {
			secondMostFrequentOccuringEntry = entriesAsList.get(0);			
		}
		
		printDetails(entriesAsList);

		System.out.println(
				String.format("Character %c has occurred %d times", 
						mostFrequentOccuringEntry.getKey(), 
						mostFrequentOccuringEntry.getValue()));		
		System.out.println(
			String.format("Character %c has occurred %d times", 
					secondMostFrequentOccuringEntry.getKey(), 
					secondMostFrequentOccuringEntry.getValue()));
			
		return secondMostFrequentOccuringEntry.getKey();
	}
	
	
	private void printDetails(List<Map.Entry<Character, Integer>> entriesAsList){
		
		Map<Character, Integer> resultsMap = new LinkedHashMap<>();
		
		for (Map.Entry<Character, Integer> entry : entriesAsList) {
			
			resultsMap.put(entry.getKey(), entry.getValue());
		}
		
		printMap(resultsMap);
		
	}
	
	private void addOrIncrementCount(Character aChar) {
		
		if (aChar == ' ') {
			return;
		}
		
		boolean containsKey = map.containsKey(aChar);
	
		if (containsKey) {
			
			int existingCount = map.get(aChar);			
			map.put(aChar, existingCount + 1);
			
		}else {
			map.put(aChar, 1);
		}
	}
	
	
	static void print(List<Map.Entry<Character, Integer>> list) {
		
		System.out.println("============================");
		for (Map.Entry<Character, Integer> entry : list) {
			
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}		
	}
	
	static void printMap(Map<Character, Integer> map) {
		
		Iterator<Character> iterator = map.keySet().iterator();
		
		while (iterator.hasNext()) {
			
			Character key = iterator.next();
			
			Integer value = map.get(key);
			
			System.out.println("Key " + key + ", Value " + value);
		}
	}
	
	public static void main(String[] args) {
		
		StringSecondMostFrequentCharFinderAlgorithm1 algorithm1 
		= new StringSecondMostFrequentCharFinderAlgorithm1();

		String input 
			= "very good morning, have a nice day, how are you";
		
		algorithm1.run(input);
		
	}
	
	
}


class MapEntryComparator implements Comparator<Map.Entry<Character, Integer>>{

	@Override
	public int compare(Map.Entry<Character, Integer> o1, 
			Map.Entry<Character, Integer> o2) {
		
		Integer f1 = o1.getValue();
		Integer f2 = o2.getValue();
		
		if (f1.floatValue() == f2.floatValue()) {
			return 0;
		}else if (f1.floatValue() < f2.floatValue()) {
			return +1;
		}else {
			return -1;
		}
	}

}
