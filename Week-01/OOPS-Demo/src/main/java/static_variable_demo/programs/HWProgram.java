package static_variable_demo.programs;

import static_variable_demo.StaticVariableUsageDemo;

public class HWProgram {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		StaticVariableUsageDemo.incrementCount();
		StaticVariableUsageDemo.addProgramDetails("Hello World Program");
	}
}
