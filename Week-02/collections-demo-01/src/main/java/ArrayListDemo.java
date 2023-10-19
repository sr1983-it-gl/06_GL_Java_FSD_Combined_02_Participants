import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
    	
        ArrayList<String> arrayList = new ArrayList<String>();

        System.out.println("Initial size of array-list: " + arrayList.size());

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add(1, "Element-At-Pos-1");

        System.out.println("Size of array-list after additions: " + arrayList.size());

        System.out.println("Contents of array-list: " + arrayList);

        arrayList.remove("F");
        arrayList.remove(3);

        System.out.println("Size of array-list after deletions: " + arrayList.size());

        System.out.println("Contents of array-list: " + arrayList);
    }
}