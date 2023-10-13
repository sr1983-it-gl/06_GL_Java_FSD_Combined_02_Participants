package incorrect_static_variable_usage_demo.programs;

import incorrect_static_variable_usage_demo.StaticVariableUsageDemo;

public class AlgorithmProgram {

	public static void main(String[] args) {
		
		System.out.println("Program about my secret algorithm...");
		
		
		StaticVariableUsageDemo demo = new StaticVariableUsageDemo();
		demo.incrementCount();
		demo.addProgramDetails("Algorithm Program");		
	
	}
}
