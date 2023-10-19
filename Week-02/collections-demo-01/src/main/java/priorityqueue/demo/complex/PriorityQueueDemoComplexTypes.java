package priorityqueue.demo.complex;

import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQueueDemoComplexTypes {

	public static void main(String[] args) {
		
		
		Employee michael = new Employee("Michael", 20000.0D, 2);
		Employee john = new Employee("John", 10000.0D, 5);
		Employee david = new Employee("David", 22000.D, 3);
		
		
		/*
		 * priorityQueueOrderingBasedOnHighestEmployeeSalary( michael, john, david);
		 */		
		
//		priorityQueueOrderingBasedOnLowestEmployeeSalary(
//			michael, john, david);

		priorityQueueOrderingBasedOnHighestEmployeeWorkExperience(
				michael, john, david);
		
	}
	
	private static void priorityQueueOrderingBasedOnHighestEmployeeSalary(
		Employee ...employees) {
	
		EmployeeComparatorBasedOnHighestSalary highestSalaryComparator
			= new EmployeeComparatorBasedOnHighestSalary();
		
		PriorityQueue<Employee> employeeQueue = new PriorityQueue<Employee>(
			highestSalaryComparator);
		
		for (Employee employee : employees) {
			employeeQueue.add(employee);
		}
		
		printQueue(employeeQueue);
	}


	private static void priorityQueueOrderingBasedOnLowestEmployeeSalary(
		Employee ...employees) {
	
		EmployeeComparatorBasedOnLowestSalary lowestSalaryComparator
			= new EmployeeComparatorBasedOnLowestSalary();
		
		PriorityQueue<Employee> employeeQueue = new PriorityQueue<Employee>(
				lowestSalaryComparator);
		
		for (Employee employee : employees) {
			employeeQueue.add(employee);
		}
		
		printQueue(employeeQueue);
	}	


	private static void priorityQueueOrderingBasedOnHighestEmployeeWorkExperience(
		Employee ...employees) {
	
		EmployeeComparatorBasedOnHighestWorkExperience highestWorkExpComparator
			= new EmployeeComparatorBasedOnHighestWorkExperience();
		
		PriorityQueue<Employee> employeeQueue = new PriorityQueue<Employee>(
				highestWorkExpComparator);
		
		for (Employee employee : employees) {
			employeeQueue.add(employee);
		}
		
		printQueue(employeeQueue);
	}	


	static void printQueue(PriorityQueue<?> queue) {
		
		while (!queue.isEmpty()) {

			Object object = queue.poll();
			System.out.println(object);
		}		
	}
}
