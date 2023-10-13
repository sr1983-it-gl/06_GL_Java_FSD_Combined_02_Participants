package incorrect_static_variable_usage_demo;

import static_variable_demo.programs.AddProgram;
import static_variable_demo.programs.AlgorithmProgram;
import static_variable_demo.programs.HWProgram;

public class StaticVariableUsageDemo {

	public int programsCount = 0;
	public StringBuilder programDetails = new StringBuilder();
	
	public void incrementCount() {
		
		programsCount = programsCount + 1;
	}
	
	public void addProgramDetails(String details) {
		
		programDetails.append(details);
		programDetails.append(System.lineSeparator());
	}
	
	
	public static void main(String[] args) {
		
		StaticVariableUsageDemo demo = new StaticVariableUsageDemo();
		
		demo.runAllPrograms(args);
		demo.printStatistics();
		
	}
	
	void runAllPrograms(String[] args){
		
		HWProgram.main(args);
		AddProgram.main(args);
		AlgorithmProgram.main(args);		
	}
	 
	void printStatistics() {
		
		System.out.println("---------------------------------------------");
		System.out.println("No of programs executed -> " + programsCount);
		
		System.out.println("Details about the programs...");
		System.out.println(programDetails.toString());
		System.out.println("---------------------------------------------");		
	}
}
