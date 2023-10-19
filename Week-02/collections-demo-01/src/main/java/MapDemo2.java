import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		
		
		// Entry -1
			
			// Key-1
			List<String> countryFlagKey1 = new ArrayList<>();
			countryFlagKey1.add("RED");
			countryFlagKey1.add("BLUE");

			// Value-1
			Set<Integer> setOfNumbers1 = new HashSet<>();
			setOfNumbers1.add(1);
			setOfNumbers1.add(2);

		// Entry -2
			
			// Key-2
			List<String> countryFlagKey2 = new ArrayList<>();
			countryFlagKey2.add("WHITE");
			countryFlagKey2.add("BLACK");

			// Value-2
			Set<Integer> setOfNumbers2 = new HashSet<>();
			setOfNumbers2.add(-100);
			setOfNumbers2.add(-200);
			

		
		
		Map<CountryFlagColors, Set<Integer>> map = new HashMap<>();
		
		CountryFlagColors india = new CountryFlagColors(countryFlagKey1);
		CountryFlagColors pakisation = new CountryFlagColors(countryFlagKey2);		
		CountryFlagColors france = new CountryFlagColors(countryFlagKey2);
		
		map.put(india, setOfNumbers1);
		map.put(pakisation, setOfNumbers2);
		
		for (CountryFlagColors countryFlagObj: map.keySet()) {
			
			System.out.println(countryFlagObj);
		}
		
		for (Set<Integer> valueObj : map.values()) {
			System.out.println(valueObj);
		}
		
	}
}


class CountryFlagColors {
	
	private List<String> colors;
	
	public CountryFlagColors(List<String> colors) {
		
		this.colors = colors;
	}
	
	public boolean equals(Object object) {
		
		if  (object instanceof CountryFlagColors) {
			
			CountryFlagColors obj2 = (CountryFlagColors)object;
			
			return this.colors.equals(obj2.colors);
		}
		
		return false;
	}
	
	public String toString() {
		return "[*" + colors + "*]";
	}
}
