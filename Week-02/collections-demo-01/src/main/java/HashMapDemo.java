import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
    	
        HashMap<String, Double> hashMap = new HashMap<>();

        String tony = "Tony";
        
        hashMap.put("Johnny", 434.00);
        hashMap.put(tony, 23.122);
        hashMap.put("Jenny", 378.20);
        hashMap.put("Ankita", 499.11);
        hashMap.put("Ravi", -200.08);

        Set<Map.Entry<String, Double>> entrySet = hashMap.entrySet();

        for (Map.Entry<String, Double> mapEntry : entrySet) {
        	
            System.out.print(mapEntry.getKey() + ": ");
            System.out.println(mapEntry.getValue());
        }

        System.out.println();

        double tonyBalance = hashMap.get(tony);
        hashMap.put(tony, (tonyBalance + 2500));

        double tonyNewBalance = hashMap.get(tony);
        System.out.println("Tony's new balance: " + tonyNewBalance);
    }
}