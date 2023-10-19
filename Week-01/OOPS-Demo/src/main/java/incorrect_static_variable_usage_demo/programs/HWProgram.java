package incorrect_static_variable_usage_demo.programs;

import incorrect_static_variable_usage_demo.StaticVariableUsageDemo;

public class HWProgram {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		
		StaticVariableUsageDemo demo = new StaticVariableUsageDemo();
		demo.incrementCount();
		demo.addProgramDetails("Hello World Program");				
	}
}
