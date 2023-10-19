import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
    	
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Bangalore");
        hashSet.add("Gujarat");
        hashSet.add("Ernakulam");
        hashSet.add("Mumbai");
        hashSet.add("Pune");

        System.out.println(hashSet);
    }
}