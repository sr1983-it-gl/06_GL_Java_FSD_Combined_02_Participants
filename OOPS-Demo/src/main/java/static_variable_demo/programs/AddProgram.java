package static_variable_demo.programs;

import static_variable_demo.StaticVariableUsageDemo;

public class AddProgram {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = a + b;
		
		System.out.println("Adding two numbers.." + c);
		
		
		StaticVariableUsageDemo.incrementCount();
		StaticVariableUsageDemo.addProgramDetails("Add Numbers Program");		
	}
}
