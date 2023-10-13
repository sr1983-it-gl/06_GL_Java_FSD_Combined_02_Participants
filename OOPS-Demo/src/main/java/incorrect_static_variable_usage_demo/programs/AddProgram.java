package incorrect_static_variable_usage_demo.programs;

import incorrect_static_variable_usage_demo.StaticVariableUsageDemo;

public class AddProgram {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = a + b;
		
		System.out.println("Adding two numbers.." + c);
		

		StaticVariableUsageDemo demo = new StaticVariableUsageDemo();
		demo.incrementCount();
		demo.addProgramDetails("Add Numbers Program");
		
	}
}
