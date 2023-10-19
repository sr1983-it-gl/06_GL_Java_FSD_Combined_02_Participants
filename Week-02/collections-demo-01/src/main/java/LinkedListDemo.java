import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
    	
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("100");
        linkedList.addFirst("0");

        linkedList.add(1, "Element-01");

        System.out.println("Original contents of linked-list: " + linkedList);

        linkedList.remove("F");
        linkedList.remove(5);

        System.out.println("Contents of list-list after removal: " + linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("Linked-list after deleting first and last: " + linkedList);

        String existingValue = linkedList.get(3);
        linkedList.set(2, (existingValue + "-[Modified]"));

        System.out.println("Linked-list after change: " + linkedList);
    }
}