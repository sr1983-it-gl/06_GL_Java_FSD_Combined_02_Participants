import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
        linkedHashSet.add("Bangalore");
        linkedHashSet.add("Gujarat");
        linkedHashSet.add("Ernakulam");
        linkedHashSet.add("Mumbai");
        linkedHashSet.add("Pune");

        System.out.println(linkedHashSet);
		
	}
}
