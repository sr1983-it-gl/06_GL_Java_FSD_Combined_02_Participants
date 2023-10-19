import java.util.*;

public class StackDemo {

    public static void main(String[] args) {
    	
        Stack<Integer> intStack = new Stack<Integer>();

        System.out.println("stack: " + intStack);
        actionPush(intStack, 42);
        actionPush(intStack, 66);
        actionPush(intStack, 99);
        
        actionPop(intStack);
        actionPop(intStack);
        actionPop(intStack);

        try {
            actionPop(intStack);
        } catch (EmptyStackException e) {
            System.out.println("Stack is Empty...");
        }
    }	
	static void actionPush(Stack<Integer> stack, int item) {
		
        stack.push(item);
        System.out.println("Pushing (" + item + ")");
        System.out.println("Stack: " + stack);
    }

    static void actionPop(Stack<Integer> stack) {
    	
        Integer a = stack.pop();
        System.out.print("Pop -> (" + a + ")");
        System.out.println();
        System.out.println("stack: " + stack);
    }


}