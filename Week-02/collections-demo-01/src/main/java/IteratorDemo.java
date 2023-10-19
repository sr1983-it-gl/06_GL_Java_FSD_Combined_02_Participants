import java.util.*;

public class IteratorDemo {

    public static void main(String[] args) {
    	
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");

        System.out.print("Original contents of array-list-> ");        
        Iterator<String> iteratorObj = arrayList.iterator();
        while (iteratorObj.hasNext()) {
            String anElement = iteratorObj.next();
            System.out.print(anElement + " ");
        }
        System.out.println();

        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + "-[Modified]");
        }

        System.out.print("Modified contents of array-list -> ");
        iteratorObj = arrayList.iterator();
        while (iteratorObj.hasNext()) {
            String anElement = iteratorObj.next();
            System.out.print(anElement + " ");
        }
        System.out.println();

        System.out.print("Backward Iteration -> ");
        while (listIterator.hasPrevious()) {
            String anElement = listIterator.previous();
            System.out.print(anElement + " ");
        }
        System.out.println();
    }
}