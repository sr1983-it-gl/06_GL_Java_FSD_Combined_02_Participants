package priorityqueue.demo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		simpleQueueTest();
	}
	
	private static void simpleQueueTest() {
		
		Queue<String> cities = new LinkedList<>();
		
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Pune");
		cities.add("Chennai");
		cities.add("Kolkatta");
		
		
		while (!cities.isEmpty()) {

			String city = cities.poll();
			System.out.println(city);
		}
	}
}
