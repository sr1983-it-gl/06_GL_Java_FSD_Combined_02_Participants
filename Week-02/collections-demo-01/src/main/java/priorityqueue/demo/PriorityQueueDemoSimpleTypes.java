package priorityqueue.demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueDemoSimpleTypes {

	public static void main(String[] args) {
		
		List<Integer> items = new ArrayList<>();
		
		items.add(10);
		items.add(5);
		items.add(25);
		items.add(7);
		
				
		queueListingDefault(items);
		queueListingReverseOrder(items);
				
	}
	
	private static void queueListingDefault(List<Integer> items) {

		PriorityQueue<Integer> queue = new PriorityQueue<>();

		System.out.println("--------------------------------");
		
		for (Integer item : items) {
			
			queue.add(item);
		}
		
		pollAndList(queue);				
	}

	private static void queueListingReverseOrder(List<Integer> items) {

		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

		System.out.println("--------------------------------");
		
		for (Integer item : items) {
			
			queue.add(item);
		}
		
		pollAndList(queue);				
	}
	
	private static void pollAndList(PriorityQueue<Integer> queue) {
		
		StringBuilder items = new StringBuilder();
		while (!queue.isEmpty()) {
			
			Integer value = queue.poll();
			items.append(value).append(",");
		}		
		System.out.println(items.toString());				
	}
}
