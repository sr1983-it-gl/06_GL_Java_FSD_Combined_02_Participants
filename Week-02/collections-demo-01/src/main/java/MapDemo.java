import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		
		// Entry -1
			
			// Key-1
			List<String> colorsKey1 = new ArrayList<>();
			colorsKey1.add("RED");
			colorsKey1.add("BLUE");

			// Value-1
			Set<Integer> setOfNumbers1 = new HashSet<>();
			setOfNumbers1.add(1);
			setOfNumbers1.add(2);

		// Entry -2
			
			// Key-2
			List<String> colorsKey2 = new ArrayList<>();
			colorsKey2.add("WHITE");
			colorsKey2.add("BLACK");

			// Value-2
			Set<Integer> setOfNumbers2 = new HashSet<>();
			setOfNumbers2.add(-100);
			setOfNumbers2.add(-200);
			

		
		
		Map<List<String>, Set<Integer>> map = new HashMap<>();
		
		map.put(colorsKey1, setOfNumbers1);
		map.put(colorsKey2, setOfNumbers2);
		
		for (List<String> keyObject : map.keySet()) {
			
			System.out.println(keyObject);
		}
		
		for (Set<Integer> valueObj : map.values()) {
			System.out.println(valueObj);
		}
		
	}
}
