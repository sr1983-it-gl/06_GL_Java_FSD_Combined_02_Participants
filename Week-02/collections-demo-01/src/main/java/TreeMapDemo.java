import java.util.*;

public class TreeMapDemo {

    public static void main(String[] args) {
    	
        TreeMap<String, Double> treeMap = new TreeMap<>();

        String tony = "Tony";
        
        treeMap.put("Johnny", 434.00);
        treeMap.put(tony, 23.122);
        treeMap.put("Jenny", 378.20);
        treeMap.put("Ankita", 499.11);
        treeMap.put("Ravi", -200.08);

        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}