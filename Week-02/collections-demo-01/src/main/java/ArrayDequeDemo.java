import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {
    	
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();

        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("D");
        arrayDeque.push("E");
        arrayDeque.push("F");
        System.out.print("Popping from the stack stack-> ");

        while (arrayDeque.peek() != null) {
            System.out.print(arrayDeque.pop() + " ");
        }

        System.out.println();
    }
}