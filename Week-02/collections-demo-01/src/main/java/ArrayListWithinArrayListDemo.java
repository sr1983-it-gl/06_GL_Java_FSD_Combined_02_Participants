import java.util.ArrayList;
import java.util.List;

public class ArrayListWithinArrayListDemo {

	public static void main(String[] args) {
		
		List<String> movies1998 = new ArrayList<>();
		movies1998.add("1998-1");
		movies1998.add("1998-2");
		movies1998.add("1998-3");
		
		
		List<String> movies2010 = new ArrayList<>();
		movies2010.add("2010-1");
		movies2010.add("2010-3");

		List<String> movies2023 = new ArrayList<>();
		movies2023.add("2023-1");
		movies2023.add("2023-2");
		movies2023.add("2023-3");
		movies2023.add("2023-4");
		movies2023.add("2023-5");
		
		
		List<List<String>> masterMovieList = new ArrayList<>();
		
		masterMovieList.add(movies1998);
		masterMovieList.add(movies2010);
		masterMovieList.add(movies2023);

		
		for (List<String> object :  masterMovieList) {
			
			System.out.println(object);
			System.out.println("----");
			
		}
		
	}
}
