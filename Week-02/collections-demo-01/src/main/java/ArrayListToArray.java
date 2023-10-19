import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String[] args) {
    	
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println("Contents of array-list: " + arrayList);

        Integer intArray[] = new Integer[arrayList.size()];
        intArray = arrayList.toArray(intArray);

        for (Integer iObj : intArray) {
        	
        	System.out.println(iObj);
        }        
    }
}